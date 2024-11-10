package org.bcc.itemsmeliinfra.adapter.out.database;

import lombok.RequiredArgsConstructor;
import org.bcc.itemsmelidomain.kernel.domain.ItemDto;
import org.bcc.itemsmelidomain.usecase.port.ItemPort;
import org.bcc.itemsmeliinfra.adapter.out.database.dto.ItemResponseData;
import org.bcc.itemsmeliinfra.adapter.out.database.dto.mapper.ItemResponseDataMapper;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class ItemAdapter implements ItemPort {

    public Mono<ItemDto> createItem(ItemDto itemDto) {

        ItemResponseData itemDtoResponse = new ItemResponseData(
                "123456",
                itemDto.getTitle(),
                itemDto.getDescription(),
                itemDto.getPrice(),
                itemDto.isInStock(),
                itemDto.getCategory(),
                itemDto.getQuantityAvailable()
        );

        ItemDto itemDto1 = ItemResponseDataMapper.itemResponseDataToItemDto(itemDtoResponse);

        return Mono.just(itemDto1);
    }

}
