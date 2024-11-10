package org.bcc.itemsmeliinfra.config;

import org.bcc.itemsmelidomain.usecase.createItem.CreateItemUseCase;
import org.bcc.itemsmeliinfra.handler.createItem.CreateItemHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HandlerConfig {

    @Bean
    public CreateItemHandler createItemHandler(CreateItemUseCase useCase) {
        return new CreateItemHandler(useCase);
    }
}
