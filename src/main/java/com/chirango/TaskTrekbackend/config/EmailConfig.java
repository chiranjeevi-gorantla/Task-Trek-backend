package com.chirango.TaskTrekbackend.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class EmailConfig {
    @Autowired
    private Environment env;

}
