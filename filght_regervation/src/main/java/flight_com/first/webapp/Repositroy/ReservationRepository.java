package flight_com.first.webapp.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import flight_com.first.webapp.Entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
