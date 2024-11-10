package org.bcc.itemsmelidomain.kernel.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto implements Serializable {

    private String id;
    private String title;
    private String description;
    private BigDecimal price;
    private boolean inStock;
    private String category;
    private int quantityAvailable;
}
