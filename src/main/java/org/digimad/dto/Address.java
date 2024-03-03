package org.digimad.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private Long addressId;
    private String streetAddress;
    private String city;
    private String state;
    private String country;
    private String addressType;
}
