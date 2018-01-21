package car.rental.reborn.service.impl;

import car.rental.reborn.domain.Car;
import car.rental.reborn.domain.Location;
import car.rental.reborn.domain.Reservation;
import car.rental.reborn.domain.ReservationStatus;
import car.rental.reborn.service.ReservationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.time.LocalDateTime;

import static car.rental.reborn.domain.CarStatus.AVAILABLE;
import static car.rental.reborn.domain.ReservationStatus.*;
import static org.assertj.core.api.Assertions.assertThat;

class ReservationBeanTest {
    @InjectMocks
    private ReservationService reservationService = new ReservationBean();

    private Car car = new Car();
    private Location location = new Location();
    private LocalDateTime pickUpTime = LocalDateTime.of(2018, 1, 21, 14, 0);
    private LocalDateTime dropOffTime = LocalDateTime.of(2018, 1, 22, 14, 0);

    @BeforeEach
    private void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void shouldCreateNewReservationWhenCarIsAvailableAtLocation() throws Exception {
        // Given
        car.setCarStatus(AVAILABLE);
        // When
        Reservation reservation = reservationService.createReservation(car, location, pickUpTime, dropOffTime);
        // Then
        assertThat(reservation.getStatus()).isEqualTo(NEW);
    }
}