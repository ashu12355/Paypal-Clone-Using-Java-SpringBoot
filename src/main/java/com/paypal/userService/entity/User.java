package com.paypal.userService.entity;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class User {

    @Id
    private Long id;
}
