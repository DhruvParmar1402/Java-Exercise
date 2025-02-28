package com.luv2code.springboot.cruddemo.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class DemoSecurityConfig {

    @Bean
    public UserDetailsManager  authenticateAndAuthorizeUsingDb(DataSource dataSource)
    {
        return new JdbcUserDetailsManager(dataSource);
    }
//@Bean
//    public InMemoryUserDetailsManager userDetails ()
//     {
//         UserDetails Dhruv= User.builder().username("dhruv").password("{noop}1234").roles("employee").build();
//         UserDetails Jeevan = User.builder().username("jeevan").password("{noop}1234").roles("employee","manager").build();
//         UserDetails Suresh=User.builder().username("suresh").password("{noop}1234").roles("employee","manager","admin").build();
//         return new InMemoryUserDetailsManager(Dhruv,Jeevan,Suresh);
//     }

    @Bean
    public SecurityFilterChain filterAuthorizedUser(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configurer -> configurer
                .requestMatchers(HttpMethod.GET, "/api/employees").hasAnyRole("EMPLOYEE", "MANAGER", "ADMIN")
                .requestMatchers(HttpMethod.POST, "/api/employees").hasAnyRole("MANAGER", "ADMIN")
                .requestMatchers(HttpMethod.DELETE, "/api/employees/**").hasRole("ADMIN")
        );

        http.httpBasic(Customizer.withDefaults());
        http.csrf(AbstractHttpConfigurer::disable);

        return http.build();
    }

}
