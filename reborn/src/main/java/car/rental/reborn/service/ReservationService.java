package car.rental.reborn.service;

import car.rental.reborn.domain.Car;
import car.rental.reborn.domain.Location;
import car.rental.reborn.domain.Reservation;

import java.time.LocalDateTime;

public interface ReservationService {
    Reservation createReservation(Car car, Location location, LocalDateTime pickUpTime, LocalDateTime dropOffTime);
}
