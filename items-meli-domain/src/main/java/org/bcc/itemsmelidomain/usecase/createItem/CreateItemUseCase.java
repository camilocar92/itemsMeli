package org.bcc.itemsmelidomain.usecase.createItem;


import io.vavr.control.Either;
import lombok.AllArgsConstructor;
import org.bcc.itemsmelidomain.kernel.command.createitem.CreateItemCommand;
import org.bcc.itemsmelidomain.kernel.domain.ItemDto;
import org.bcc.itemsmelidomain.kernel.exception.UseCaseErrorResponse;
import org.bcc.itemsmelidomain.usecase.UseCase;
import org.bcc.itemsmelidomain.usecase.createItem.mapper.CreateItemMapper;
import org.bcc.itemsmelidomain.usecase.service.ItemManagerService;

@AllArgsConstructor
public class CreateItemUseCase implements UseCase<CreateItemCommand, Either<UseCaseErrorResponse, ItemDto>> {

    private ItemManagerService itemManagerService;

    @Override
    public Either<UseCaseErrorResponse, ItemDto> execute(CreateItemCommand command) {

        ItemDto itemDto = itemManagerService.createItem(CreateItemMapper.commandToItemDto(command));
        return itemDto == null ? Either.left(new UseCaseErrorResponse("Se presento un error")) :
                Either.right(itemDto);
    }
}
