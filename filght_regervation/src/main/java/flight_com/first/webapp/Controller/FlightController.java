package flight_com.first.webapp.Controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import flight_com.first.webapp.Entity.Flight;
import flight_com.first.webapp.Repositroy.FlightRepository;

@Controller
public class FlightController {


	@Autowired
	private FlightRepository flightRepo;
	
	@RequestMapping("/findFlight")
	public String findFlights(@RequestParam("from") String from,@RequestParam("to") String to, @RequestParam("departureDate") @DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate, ModelMap modelMap) {
	List<Flight> flights = flightRepo.findFlights(from, to, departureDate); 
	modelMap.addAttribute("flights", flights);
		return "displayFlight";
	}
	

	@RequestMapping("/showmyReservation")
	public String AllReservation(@RequestParam("flightId") long flightId , ModelMap modelMap) {
		Optional<Flight> findById = flightRepo.findById(flightId);
        Flight flights = findById.get();
		modelMap.addAttribute("flight", flights);
	
		return "ShowReservation";
		
	}
		
		
}
