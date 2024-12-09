package com.airline.management.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerDTO {
    private Long id;

    private String customerNameEn;

    private String customerNameAr;
}
