package org.bcc.itemsmelidomain.usecase.service;

import io.vavr.control.Either;
import io.vavr.control.Try;
import lombok.AllArgsConstructor;
import org.bcc.itemsmelidomain.kernel.domain.ItemDto;
import org.bcc.itemsmelidomain.usecase.port.ItemPort;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class ItemManagerService {

    private final ItemPort itemPort;

    public ItemDto createItem(ItemDto itemDto) {
        Either<Throwable, ItemDto> response = Try.of(() -> itemPort.createItem(itemDto).block()).toEither();
        return response.isRight() ? response.get() : null;
    }
}
