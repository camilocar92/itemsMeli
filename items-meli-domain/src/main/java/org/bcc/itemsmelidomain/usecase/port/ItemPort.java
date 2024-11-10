package org.bcc.itemsmelidomain.usecase.port;

import org.bcc.itemsmelidomain.kernel.domain.ItemDto;
import reactor.core.publisher.Mono;

public interface ItemPort {

    public Mono<ItemDto> createItem(ItemDto itemDto);
}
