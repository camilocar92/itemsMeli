package org.bcc.itemsmelidomain.usecase.createItem.mapper;

import lombok.experimental.UtilityClass;
import org.bcc.itemsmelidomain.kernel.command.createitem.CreateItemCommand;
import org.bcc.itemsmelidomain.kernel.domain.ItemDto;

@UtilityClass
public class CreateItemMapper {

    public static ItemDto commandToItemDto(CreateItemCommand command) {
        return ItemDto.builder()
                .title(command.getTitle())
                .description(command.getDescription())
                .price(command.getPrice())
                .inStock(command.isInStock())
                .category(command.getCategory())
                .quantityAvailable(command.getQuantityAvailable())
                .build();
    }

}
