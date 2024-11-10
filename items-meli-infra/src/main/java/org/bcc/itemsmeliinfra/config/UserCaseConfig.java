package org.bcc.itemsmeliinfra.config;

import org.bcc.itemsmelidomain.usecase.createItem.CreateItemUseCase;
import org.bcc.itemsmelidomain.usecase.service.ItemManagerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserCaseConfig {

    @Bean
    public CreateItemUseCase createItemUseCase(ItemManagerService managerService) {
        return new CreateItemUseCase(managerService);
    }
}
