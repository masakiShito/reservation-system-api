package com.life.engineer.happy.reservation_system.model;

import java.time.LocalDateTime;

public class Reservation {

    private Long id;
    private String customerName;
    private String customerEmail;
    private LocalDateTime reservationDate;
    private String reservationStatus;

    // コンストラクタ
    public Reservation() {
    }

    public Reservation(Long id, String customerName, String customerEmail, LocalDateTime reservationDate, String reservationStatus) {
        this.id = id;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.reservationDate = reservationDate;
        this.reservationStatus = reservationStatus;
    }

    // Getter and Setter methods

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }
}
