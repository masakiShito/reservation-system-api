package com.life.engineer.happy.reservation_system.service;

import com.life.engineer.happy.reservation_system.mapper.ReservationMapper;
import com.life.engineer.happy.reservation_system.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationMapper reservationMapper;

    // すべての予約を取得
    public List<Reservation> getAllReservations() {
        return reservationMapper.findAll();
    }

    // IDで特定の予約を取得
    public Reservation getReservationById(Long id) {
        return reservationMapper.findById(id);
    }

    // 新しい予約を作成
    public Reservation createReservation(Reservation reservation) {
        reservationMapper.insert(reservation);
        return reservation;
    }

    // 既存の予約を更新
    public Reservation updateReservation(Long id, Reservation reservation) {
        Reservation existingReservation = reservationMapper.findById(id);
        if (existingReservation != null) {
            reservation.setId(id); // 更新する予約のIDを設定
            reservationMapper.update(reservation);
            return reservation;
        } else {
            return null; // 存在しない場合はnullを返す
        }
    }

    // 予約を削除
    public boolean deleteReservation(Long id) {
        Reservation existingReservation = reservationMapper.findById(id);
        if (existingReservation != null) {
            reservationMapper.delete(id);
            return true;
        } else {
            return false;
        }
    }
}
