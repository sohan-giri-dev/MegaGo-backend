package com.megago.megago;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import io.github.cdimascio.dotenv.Dotenv;


//exluding db auto configer for initial setup
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@RestController
public class MegagoApplication {

    @GetMapping("/hello")
    public String check() {
        return "Hello World";
    }

    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();
        String serverPort = dotenv.get("SERVER_PORT");
        System.setProperty("SERVER_PORT", serverPort);
        SpringApplication.run(MegagoApplication.class, args);
        System.out.println("Sever has started at port >>>>>>>>>>>>>>>>>>>> "+serverPort);
        System.out.println("Silence is golden>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}
