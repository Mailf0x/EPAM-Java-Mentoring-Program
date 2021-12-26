package com.epam.mybatis;

import com.epam.mybatis.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MybatisApplication {

	@Autowired
	private static CityMapper cityMapper;

	public static void main(String[] args) {
		SpringApplication.run(MybatisApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CityMapper cityMapper) {
		return args->{
			cityMapper.selectAll().forEach(System.out::println);
		};
	}
}
