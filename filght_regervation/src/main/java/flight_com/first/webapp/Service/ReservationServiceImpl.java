package flight_com.first.webapp.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flight_com.first.webapp.Entity.Flight;
import flight_com.first.webapp.Entity.Passenger;
import flight_com.first.webapp.Entity.Reservation;
import flight_com.first.webapp.Repositroy.FlightRepository;
import flight_com.first.webapp.Repositroy.PassengerRepository;
import flight_com.first.webapp.Repositroy.ReservationRepository;
import flight_com.first.webapp.Util.PdfGenerator;
import flight_com.first.webapp.Util.EmailUtil;
import flight_com.first.webapp.dto.ReservationRequest;


@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
private PassengerRepository passsengerRepo;
	
	@Autowired
	private FlightRepository FlightRepo;
	
	@Autowired
	private ReservationRepository ReservationRepo;
	
	@Autowired
	private PdfGenerator pdfGenerator;
	@Autowired
     private EmailUtil emailUtil;
	
	@Override
	public Reservation bookFlight(ReservationRequest request) {
		
		Passenger  p =new Passenger() ;
			p.setFirstName(request.getFirstName());
			p.setLastName(request.getLastName());
			p.setMiddleName(request.getMiddleName());
		    p.setEmail(request.getEmail());
		    p.setPhone(request.getPhoneNumber());
		    passsengerRepo.save(p);
		    
		    Long flightId = request.getFlightId();
		 Optional<Flight> findById = FlightRepo.findById(flightId);
		 Flight flight=findById.get();   
		 
		 Reservation reservation = new Reservation();
		 reservation.setFlight(flight);
		 reservation.setPassenger(p);
		 reservation.setCheckedIn(false);
		 reservation.setNumberOfBags(0);
		 String filePath = "C:\\Spring\\filght_regervation\\src\\pdf\\reservation"+reservation.getId()+".pdf";
		 ReservationRepo.save(reservation);
		 
		 pdfGenerator.generateItineraty(reservation ,filePath);
		 emailUtil.sendItinerary(p.getEmail(), filePath);
		return reservation;
		
		
	}

}
