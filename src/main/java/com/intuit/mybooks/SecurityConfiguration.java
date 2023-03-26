package com.intuit.mybooks;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration  {
    //How InMemory Configuration Works.
    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){

        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user")
                .password("user")
                .roles("USER")
                .build();
        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("admin")
                .roles("ADMIN")
                .build();
        return new InMemoryUserDetailsManager(user,admin);
    }
    @Bean
    //How HTTP Security gets Implemented.
    SecurityFilterChain web(HttpSecurity http) throws  Exception{
        http.authorizeHttpRequests(authorize->{
            authorize
                    .requestMatchers("/admin").hasRole("ADMIN")
                    .requestMatchers("/user").hasAnyRole("USER","ADMIN")
                    .requestMatchers("/").permitAll();
        })
                .formLogin();
        return http.build();
    }
}
