package org.bcc.itemsmelidomain.kernel.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@Getter
public class UseCaseErrorResponse implements Serializable {

    private String messageResponse;

}
