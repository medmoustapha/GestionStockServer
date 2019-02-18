package gestion.stock.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration
@EnableWebSecurity
public class ScurityConfig extends WebSecurityConfigurerAdapter{
	/*@Autowired
	private DataSource dataSource;*/
	@Autowired
	private UserDetailsService userDetailsService;
     @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    	
    	 auth.userDetailsService(userDetailsService).passwordEncoder(
    			 NoOpPasswordEncoder.getInstance());
    	/* auth.jdbcAuthentication().dataSource(dataSource)
    	      .usersByUsernameQuery("select login as principal ,password as credentials,active from users where login=?")
    	      .authoritiesByUsernameQuery("select login as principal, role as role from users_roles where login=?")
    	      //.passwordEncoder(new Md5PasswordEncoder())
    	      .rolePrefix("ROLE_");*/
    }
     @Override
    protected void configure(HttpSecurity http) throws Exception {
         http.httpBasic().and()
         .csrf().disable()
         .headers().frameOptions().disable();
          http.authorizeRequests().antMatchers("/api/*").hasRole("USER");
          http.authorizeRequests().antMatchers("*").hasRole("ADMIN");
          
    }
}
