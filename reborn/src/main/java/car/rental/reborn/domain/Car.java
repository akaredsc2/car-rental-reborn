package car.rental.reborn.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Car {
    private Long id;
    private CarModel carModel;
    private String color;
    private String licensePlate;
    private BigDecimal price;
    private CarStatus carStatus;
}
