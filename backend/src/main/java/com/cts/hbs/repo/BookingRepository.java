package com.cts.hbs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.hbs.entity.Booking;

import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    Optional<Booking> findByBookingConfirmationCode(String confirmationCode);
}
