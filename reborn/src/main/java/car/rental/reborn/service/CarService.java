package car.rental.reborn.service;

import car.rental.reborn.domain.Car;

import java.util.Optional;

public interface CarService {
    Optional<Car> findCar();
}
