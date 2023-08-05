package flight_com.first.webapp.Service;

import flight_com.first.webapp.Entity.Reservation;
import flight_com.first.webapp.dto.ReservationRequest;

public interface ReservationService {

	Reservation bookFlight(ReservationRequest request);
}
