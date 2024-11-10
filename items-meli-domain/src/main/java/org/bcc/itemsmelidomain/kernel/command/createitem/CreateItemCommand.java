package org.bcc.itemsmelidomain.kernel.command.createitem;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.bcc.itemsmelidomain.kernel.command.Command;

import java.io.Serializable;
import java.math.BigDecimal;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateItemCommand implements Command, Serializable {

    private String title;
    private String description;
    private BigDecimal price;
    private boolean inStock;
    private String category;
    private int quantityAvailable;

}
