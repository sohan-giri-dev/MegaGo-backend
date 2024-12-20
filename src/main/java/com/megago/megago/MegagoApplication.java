package com.megago.megago;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

//exluding db auto configer for initial setup
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
public class MegagoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MegagoApplication.class, args);
        String serverPort = System.getProperty("server.port", "8080"); 
        System.out.println("Server has started at port >>>>>>>>>>>>>>>>>>>> " + serverPort);
        System.out.println("Silence is golden>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}
