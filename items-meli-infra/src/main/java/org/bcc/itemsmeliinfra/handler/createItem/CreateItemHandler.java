package org.bcc.itemsmeliinfra.handler.createItem;

import lombok.RequiredArgsConstructor;
import org.bcc.itemsmelidomain.usecase.createItem.CreateItemUseCase;
import org.bcc.itemsmeliinfra.adapter.in.GenericResponse;
import org.bcc.itemsmeliinfra.adapter.in.createitem.dto.error.ErrorMapper;
import org.bcc.itemsmeliinfra.adapter.in.createitem.dto.error.ErrorResponse;
import org.bcc.itemsmeliinfra.adapter.in.createitem.dto.request.ItemRequest;
import org.bcc.itemsmeliinfra.handler.createItem.mapper.CreateItemMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class CreateItemHandler {

    private final CreateItemUseCase useCase;

    public Mono<ResponseEntity<GenericResponse>> execute(ItemRequest itemRequest) {
        return Mono.just(
                        useCase.execute(CreateItemMapper.requestToCommand(itemRequest))
                                .fold(ErrorMapper::itemErrorResponse, CreateItemMapper::itemDtoToItemResponse)
                )
                .map(genericResponse -> {
                    if (genericResponse instanceof ErrorResponse) {
                        return new ResponseEntity<GenericResponse>(genericResponse, HttpStatus.BAD_REQUEST);
                    } else {
                        return new ResponseEntity<GenericResponse>(genericResponse, HttpStatus.OK);
                    }
                })
                .switchIfEmpty(Mono.just(ResponseEntity.noContent().build()));
    }

}
