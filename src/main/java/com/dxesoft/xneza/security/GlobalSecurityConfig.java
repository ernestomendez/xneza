package com.dxesoft.xneza.security;

import com.dxesoft.xneza.service.DxeSoftUserDetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * xneza, com.dxesoft.xneza.security . GlobalSecurityConfig
 * Created by ernesto on 30/10/17.
 */
public class GlobalSecurityConfig extends GlobalAuthenticationConfigurerAdapter {

    private final Logger log = LoggerFactory.getLogger(GlobalSecurityConfig.class);

    final DxeSoftUserDetailsService dxeSoftUserDetailsService;

    @Autowired
    public GlobalSecurityConfig(DxeSoftUserDetailsService dxeSoftUserDetailsService) {
        this.dxeSoftUserDetailsService = dxeSoftUserDetailsService;
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }


    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(dxeSoftUserDetailsService)
                .passwordEncoder(getPasswordEncoder());
    }
}
