package se.lexicon.formbinding.entity;

import lombok.Data;

import java.time.LocalDate;
@Data
public class Customer {
    private String customerId;
    private String email;
    private LocalDate regDate;
    private boolean active;
    private CustomerDetails customerDetails;
}
