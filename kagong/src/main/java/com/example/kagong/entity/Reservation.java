package com.example.kagong.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Reservation {

    @Id @GeneratedValue
    private long reservationId;

    private LocalDateTime reservationDate;

    private long people;

    @OneToMany(mappedBy = "reservation", cascade = CascadeType.ALL)
    private List<CafeReservation> cafeReservations = new ArrayList<>();

}
