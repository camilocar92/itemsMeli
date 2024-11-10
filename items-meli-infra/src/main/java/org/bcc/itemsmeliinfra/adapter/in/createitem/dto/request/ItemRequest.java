package org.bcc.itemsmeliinfra.adapter.in.createitem.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemRequest {

    private String title;
    private String description;
    private BigDecimal price;
    private boolean inStock;
    private String category;
    private int quantityAvailable;

}
