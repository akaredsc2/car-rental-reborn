package car.rental.reborn.service.impl;

import car.rental.reborn.domain.Car;
import car.rental.reborn.service.CarService;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CarBean implements CarService {
    @Override
    public Optional<Car> findCar() {
        return Optional.empty();
    }
}
