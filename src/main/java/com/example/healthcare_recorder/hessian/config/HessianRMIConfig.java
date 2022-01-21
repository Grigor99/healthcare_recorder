package com.example.healthcare_recorder.hessian.config;

import com.example.healthcare.hessian.service.DoctorsService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

@Configuration
public class HessianRMIConfig {

    @Value("${spring.boot.rmi.doctor.uri}")
    private String remiUri;


    @Bean
    public DoctorsService doctorsService() {
        HessianProxyFactoryBean invoker = new HessianProxyFactoryBean();
        invoker.setServiceUrl(remiUri);
        invoker.setServiceInterface(DoctorsService.class);
        invoker.setHessian2(true);
        invoker.setUsername("interconnect_user");
        invoker.setPassword("interconnect_password");
        invoker.afterPropertiesSet();
        return (DoctorsService) invoker.getObject();
    }
}
