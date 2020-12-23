package com.ctl.rxkuma7.multiplemongo.config;

import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@ConfigurationProperties(prefix = "mongodb")
public class MultipleMongoProperties {

   
	private MongoProperties primary = new MongoProperties();
    private MongoProperties secondary = new MongoProperties();
    
    
	
}
