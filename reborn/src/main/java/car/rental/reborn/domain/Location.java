package car.rental.reborn.domain;

import lombok.Data;

import java.util.Set;

@Data
public class Location {
    private Long id;
    private String country;
    private String region;
    private String city;
    private String address;
    private String postalCode;
    private Set<Car> cars;
}
