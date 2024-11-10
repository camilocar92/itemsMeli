package org.bcc.itemsmeliinfra.adapter.in.createitem.dto.error;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.bcc.itemsmeliinfra.adapter.in.GenericResponse;

import java.io.Serializable;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse implements GenericResponse, Serializable {

    private String messageResponse;
}
