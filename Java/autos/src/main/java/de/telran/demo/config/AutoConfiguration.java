package de.telran.demo.config;

import de.telran.demo.entity.Auto;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

//The annotation notifies Spring to use this class  as a config class
@Configuration
public class AutoConfiguration {

    //create here a bean of the type Auto and with the name  "redMazda"
    @Bean
    @Order(2)
    @Qualifier("simple Autos")
    public Auto redMazda() {
        return new Auto("Mazda",
                "5",
                "red",
                2018,
                25000);
    }

    @Bean
    @Order(1)
    @Qualifier("simple Autos")
    public Auto emeraldOpel() {
        return new Auto("Opel",
                "some",
                "emerald",
                2015,
                75000);
    }

    @Bean
    public Auto silverBentley() {
        return new Auto("Bentley",
                "expensive",
                "silver",
                2015,
                1350);
    }

}
