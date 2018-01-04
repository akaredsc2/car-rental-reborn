package car.rental.reborn.configuration;

import car.rental.reborn.service.CarService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = CarService.class)
public class CarRentalConfiguration {
}