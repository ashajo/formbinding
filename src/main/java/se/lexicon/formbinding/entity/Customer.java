package se.lexicon.formbinding.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    @Column(nullable = false)
    private String customerId;
    @Column(nullable = false)
    private String email;
    @CreationTimestamp
    @Column(nullable = false,columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP")
    private LocalDate regDate;
    @Column(columnDefinition = "tinyint(1) default 1")
    private boolean active;
    @OneToOne(fetch = FetchType.EAGER,cascade = {CascadeType.ALL})
    private CustomerDetails customerDetails;
}
