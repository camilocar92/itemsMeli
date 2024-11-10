package org.bcc.itemsmeliinfra.adapter.out.database.dto.mapper;

import lombok.experimental.UtilityClass;
import org.bcc.itemsmelidomain.kernel.domain.ItemDto;
import org.bcc.itemsmeliinfra.adapter.in.createitem.dto.response.ItemResponse;
import org.bcc.itemsmeliinfra.adapter.out.database.dto.ItemResponseData;

@UtilityClass
public class ItemResponseDataMapper {

    public static ItemDto itemResponseDataToItemDto(ItemResponseData itemResponseData) {
        return ItemDto.builder()
                .id(itemResponseData.getId())
                .title(itemResponseData.getTitle())
                .description(itemResponseData.getDescription())
                .price(itemResponseData.getPrice())
                .inStock(itemResponseData.isInStock())
                .category(itemResponseData.getCategory())
                .quantityAvailable(itemResponseData.getQuantityAvailable())
                .build();
    }

}
