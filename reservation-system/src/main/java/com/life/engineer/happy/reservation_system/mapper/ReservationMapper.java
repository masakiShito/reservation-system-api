package com.life.engineer.happy.reservation_system.mapper;

import com.life.engineer.happy.reservation_system.model.Reservation;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ReservationMapper {

    // すべての予約を取得
    @Select("SELECT * FROM reservations")
    List<Reservation> findAll();

    // IDで特定の予約を取得
    @Select("SELECT * FROM reservations WHERE id = #{id}")
    Reservation findById(Long id);

    // 新しい予約を作成
    @Insert("INSERT INTO reservations (customer_name, customer_email, reservation_date, reservation_status) " +
            "VALUES (#{customerName}, #{customerEmail}, #{reservationDate}, #{reservationStatus})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Reservation reservation);

    // 既存の予約を更新
    @Update("UPDATE reservations SET customer_name = #{customerName}, customer_email = #{customerEmail}, " +
            "reservation_date = #{reservationDate}, reservation_status = #{reservationStatus} WHERE id = #{id}")
    void update(Reservation reservation);

    // 予約を削除
    @Delete("DELETE FROM reservations WHERE id = #{id}")
    void delete(Long id);
}
