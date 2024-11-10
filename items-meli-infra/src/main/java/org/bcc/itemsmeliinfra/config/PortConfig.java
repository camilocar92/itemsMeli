package org.bcc.itemsmeliinfra.config;

import org.bcc.itemsmelidomain.usecase.port.ItemPort;
import org.bcc.itemsmeliinfra.adapter.out.database.ItemAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PortConfig {

    @Bean
    public ItemPort itemPort(){ return new ItemAdapter();
    }
}
