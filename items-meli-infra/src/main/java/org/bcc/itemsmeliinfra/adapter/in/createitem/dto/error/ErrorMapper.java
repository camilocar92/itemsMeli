package org.bcc.itemsmeliinfra.adapter.in.createitem.dto.error;

import lombok.experimental.UtilityClass;
import org.bcc.itemsmelidomain.kernel.exception.UseCaseErrorResponse;

@UtilityClass
public class ErrorMapper {

    public static ErrorResponse itemErrorResponse(UseCaseErrorResponse errorResponse){
        return ErrorResponse.builder()
                .messageResponse(errorResponse.getMessageResponse())
                .build();
    }

}
