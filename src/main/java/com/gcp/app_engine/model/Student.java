package com.gcp.app_engine.model;

import lombok.*;

@Data
@Builder
public class Student {
    private Integer id;
    private String firstName;
    private String lastName;
    private String country;
}