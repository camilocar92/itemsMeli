package org.bcc.itemsmelidomain.usecase;

import org.bcc.itemsmelidomain.kernel.command.Command;

@FunctionalInterface
public interface UseCase<T extends Command, R> {
    R execute(T command);
}
