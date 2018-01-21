package car.rental.reborn.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Reservation {
    private Long id;
    private Car car;
    private LocalDateTime pickUpTime;
    private LocalDateTime dropOffTime;
    private Location location;
    private ReservationStatus status;
}
