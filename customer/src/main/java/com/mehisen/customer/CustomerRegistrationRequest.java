package com.mehisen.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
