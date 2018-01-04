package car.rental.reborn.service.impl;

import car.rental.reborn.configuration.CarRentalConfiguration;
import car.rental.reborn.domain.Car;
import car.rental.reborn.service.CarService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@ContextConfiguration(classes = CarRentalConfiguration.class)
@ExtendWith(SpringExtension.class)
public class CarBeanIntegrationTest {
    @Autowired
    private CarService carService;

    @Test
    void shouldReturnEmptyOptionalWhenProjectNotStarted() {
        // When
        Optional<Car> actualCar = carService.findCar();
        // Then
        assertThat(actualCar).isNotPresent();
    }
}