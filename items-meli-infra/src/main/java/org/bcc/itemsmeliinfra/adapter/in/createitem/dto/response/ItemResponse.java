package org.bcc.itemsmeliinfra.adapter.in.createitem.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bcc.itemsmeliinfra.adapter.in.GenericResponse;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItemResponse implements GenericResponse, Serializable {

    private String id;
    private String title;
    private String description;
    private BigDecimal price;
    private boolean inStock;
    private String category;
    private int quantityAvailable;

}
