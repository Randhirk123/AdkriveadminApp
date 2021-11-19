/*
 * package com.adkrive.main.security;
 * 
 * import org.springframework.context.annotation.Configuration; import
 * org.springframework.http.HttpMethod; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class WebSecurityConfig extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception { http
 * .authorizeRequests() .antMatchers("/static","/register").permitAll()
 * .antMatchers("/user/**").hasRole("ADMIN").with // can pass multiple roles
 * .antMatchers("/admin/**").
 * access("hasRole('ADMIN') and hasIpAddress('123.123.123.123')") // pass SPEL
 * using access method .anyRequest().authenticated() .and() .formLogin()
 * .loginPage("/admin") .permitAll(); }
 * 
 * 
 * @Override public void configure(AuthenticationManagerBuilder auth) throws
 * Exception { auth.inMemoryAuthentication().withUser("adkRive")
 * .password("Test@123").roles("admin"); }
 * 
 * @Override public void configure(HttpSecurity http) throws Exception {
 * http.authorizeRequests().antMatchers("/**").permitAll().antMatchers(
 * HttpMethod.POST).
 * hasRole("admin").antMatchers(HttpMethod.POST).hasRole("admin").antMatchers(
 * HttpMethod.PUT).hasRole("admin")
 * .and().formLogin().loginPage("/adminLogin.jsp")
 * .failureUrl("/adminLogin.jsp?error=1").loginProcessingUrl("/admin")
 * .permitAll().and().logout()
 * .logoutSuccessUrl("/adminLogin.jsp").disable().csrf();
 * 
 * }
 * 
 * }
 * 
 */