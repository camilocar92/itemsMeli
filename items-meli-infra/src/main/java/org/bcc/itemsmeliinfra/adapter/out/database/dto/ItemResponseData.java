package org.bcc.itemsmeliinfra.adapter.out.database.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItemResponseData {

    private String id;
    private String title;
    private String description;
    private BigDecimal price;
    private boolean inStock;
    private String category;
    private int quantityAvailable;

}
