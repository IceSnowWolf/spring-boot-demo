package com.lmq.demo.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("liqiang").password("123456").roles("admin","user")
                .and()
                .withUser("limingqiang").roles("user").password("123456");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/login").permitAll()
                .antMatchers("/hello/**").hasRole("admin")
                .antMatchers("/set/**").hasRole("user")
                .antMatchers("/boot/**").hasAnyRole("admin","user");

        http.formLogin()
                .loginPage("/login");

    }
}
