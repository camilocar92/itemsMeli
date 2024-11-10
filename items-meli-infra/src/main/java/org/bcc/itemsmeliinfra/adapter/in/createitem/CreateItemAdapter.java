package org.bcc.itemsmeliinfra.adapter.in.createitem;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.bcc.itemsmeliinfra.adapter.in.GenericResponse;
import org.bcc.itemsmeliinfra.adapter.in.createitem.dto.request.ItemRequest;
import org.bcc.itemsmeliinfra.handler.createItem.CreateItemHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@RequestMapping("/items")
@Validated
@Slf4j
public class CreateItemAdapter {

    private final CreateItemHandler handler;

    @PostMapping()
    public Mono<ResponseEntity<GenericResponse>> createItem(@RequestBody ItemRequest itemRequest){
        return handler.execute(itemRequest);
    }

}
