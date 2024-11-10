package org.bcc.itemsmeliinfra.handler.createItem.mapper;

import lombok.experimental.UtilityClass;
import org.bcc.itemsmelidomain.kernel.command.createitem.CreateItemCommand;
import org.bcc.itemsmelidomain.kernel.domain.ItemDto;
import org.bcc.itemsmeliinfra.adapter.in.createitem.dto.request.ItemRequest;
import org.bcc.itemsmeliinfra.adapter.in.createitem.dto.response.ItemResponse;

@UtilityClass
public class CreateItemMapper {

    public static CreateItemCommand requestToCommand(ItemRequest itemRequest) {
        return CreateItemCommand.builder()
                .title(itemRequest.getTitle())
                .description(itemRequest.getDescription())
                .price(itemRequest.getPrice())
                .inStock(itemRequest.isInStock())
                .category(itemRequest.getCategory())
                .quantityAvailable(itemRequest.getQuantityAvailable())
                .build();
    }

    public static ItemResponse itemDtoToItemResponse(ItemDto itemDto) {
        return ItemResponse.builder()
                .id(itemDto.getId())
                .title(itemDto.getTitle())
                .description(itemDto.getDescription())
                .price(itemDto.getPrice())
                .inStock(itemDto.isInStock())
                .category(itemDto.getCategory())
                .quantityAvailable(itemDto.getQuantityAvailable())
                .build();
    }

}
