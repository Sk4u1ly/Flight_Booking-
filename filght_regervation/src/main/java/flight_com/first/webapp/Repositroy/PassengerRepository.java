package flight_com.first.webapp.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import flight_com.first.webapp.Entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
