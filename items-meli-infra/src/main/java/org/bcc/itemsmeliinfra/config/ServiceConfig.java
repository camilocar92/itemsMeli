package org.bcc.itemsmeliinfra.config;

import org.bcc.itemsmelidomain.usecase.port.ItemPort;
import org.bcc.itemsmelidomain.usecase.service.ItemManagerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public ItemManagerService itemManagerService(ItemPort port){
        return new ItemManagerService(port);
    }

}
