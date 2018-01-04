package car.rental.reborn.service.impl;

import car.rental.reborn.domain.Car;
import car.rental.reborn.service.CarService;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class CarBeanTest {
    private CarService carService = new CarBean();

    @Test
    void shouldReturnEmptyOptionalWhenProjectNotStarted() {
        // When
        Optional<Car> actualCar = carService.findCar();
        // Then
        assertThat(actualCar).isNotPresent();
    }
}