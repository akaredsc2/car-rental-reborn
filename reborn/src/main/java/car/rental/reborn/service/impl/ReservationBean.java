package car.rental.reborn.service.impl;

import car.rental.reborn.domain.Car;
import car.rental.reborn.domain.Location;
import car.rental.reborn.domain.Reservation;
import car.rental.reborn.domain.ReservationStatus;
import car.rental.reborn.service.ReservationService;

import java.time.LocalDateTime;

import static car.rental.reborn.domain.ReservationStatus.*;

public class ReservationBean implements ReservationService {
    @Override
    public Reservation createReservation(Car car, Location location,
                                         LocalDateTime pickUpTime, LocalDateTime dropOffTime) {
        Reservation reservation = new Reservation();
        reservation.setCar(car);
        reservation.setLocation(location);
        reservation.setPickUpTime(pickUpTime);
        reservation.setDropOffTime(dropOffTime);
        reservation.setStatus(NEW);
        return reservation;
    }
}
