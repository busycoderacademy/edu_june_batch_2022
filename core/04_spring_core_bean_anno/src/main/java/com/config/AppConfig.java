package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.demo.Bike;
import com.demo.Car;
import com.demo.Passanger;
import com.demo.Vehical;

@Configuration
@ComponentScan(basePackages = {"com.demo"})
public class AppConfig {

	@Autowired
	@Bean(name = {"p"})
	public Passanger passanger(Vehical vehical) {
		Passanger passanger=new Passanger();
		passanger.setName("raja");
		passanger.setVehical(vehical);
		return passanger;
	}
	
	@Profile(value = "test")
	@Bean
	public Vehical getCar() {
		Vehical vehical=new Car();
		return vehical;
	}
	
	@Profile(value = "qa")
	@Bean
	public Vehical getBike() {
		Vehical vehical=new Bike();
		return vehical;
	}
	
	/*
	 * 
    <bean id="v1" class="com.demo.Car" primary="true"/>
	<bean id="v2" class="com.demo.Bike" />
	 */
	
}
