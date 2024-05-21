package com.hexhotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexhotel.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {

}
