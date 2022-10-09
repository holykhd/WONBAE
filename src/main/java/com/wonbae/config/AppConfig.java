package com.wonbae.config;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

import static org.modelmapper.config.Configuration.AccessLevel.PRIVATE;

@Configuration
public class AppConfig {

    @Bean
    JPAQueryFactory jpaQueryFactory(EntityManager em) {
        return new JPAQueryFactory(em);
    }

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT)     // 기존 객체와 대상 객체의 필드명과 타입이 일치해야 맵핑을 시켜주도록 설정할 수 있습니다.
                .setSkipNullEnabled(true)                           // null인 필드는 스킵
                .setFieldMatchingEnabled(true)                      // private 인 필드도 맵핑
                .setFieldAccessLevel(PRIVATE);                      // private 인 필드도 맵핑
        return modelMapper;
    }
}