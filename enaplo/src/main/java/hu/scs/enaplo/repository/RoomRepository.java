package hu.scs.enaplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hu.scs.enaplo.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
