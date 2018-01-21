package car.rental.reborn.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CarModel {
    private Long id;
    private String name;
    private BigDecimal horsePowers;
    private Integer seats;
    private Integer doors;
}
