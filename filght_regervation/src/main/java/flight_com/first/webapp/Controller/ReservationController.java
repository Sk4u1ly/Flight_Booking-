package flight_com.first.webapp.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import flight_com.first.webapp.Entity.Reservation;
import flight_com.first.webapp.Service.ReservationService;
import flight_com.first.webapp.dto.ReservationRequest;




@Controller                                   // Data transfer object  (Dto)
public class ReservationController {

	@Autowired
  private ReservationService  reservationService;
	
	
	
	@RequestMapping("/conformReservation")
	public String conformReservation(ReservationRequest request  , ModelMap modelMap) {
		
		Reservation reservationId = reservationService.bookFlight(request);
		modelMap.addAttribute("reservationId", reservationId.getId());
		return "conformReservation";
		
	}
	
	
	}
	

