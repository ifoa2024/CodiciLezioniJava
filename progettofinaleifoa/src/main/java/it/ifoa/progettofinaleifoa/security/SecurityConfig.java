package it.ifoa.progettofinaleifoa.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public InMemoryUserDetailsManager userManager(){

        UserBuilder user = User.withUsername("user").password(encoder().encode("12345678"));
        UserBuilder admin = User.withUsername("admin").password(encoder().encode("admin12345678"));

        return new InMemoryUserDetailsManager(user.build(), admin.build());
    }

    @Bean
    public SecurityFilterChain configSecurityFilterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests((authorize) -> authorize.requestMatchers("/api/**").permitAll().anyRequest().authenticated())
        .formLogin((formLogin) -> formLogin.loginPage("/login").permitAll())
        .logout((logout) -> logout.logoutUrl("/logout").logoutSuccessUrl("/").permitAll())
        .csrf((csrf) -> csrf.ignoringRequestMatchers("/api/**")); 
        return http.build();
    }

}
