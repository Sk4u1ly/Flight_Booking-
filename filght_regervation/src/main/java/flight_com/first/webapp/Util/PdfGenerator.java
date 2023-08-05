package flight_com.first.webapp.Util;



import java.io.FileOutputStream;

import org.springframework.stereotype.Component;

import com.itextpdf.text.Document;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import flight_com.first.webapp.Entity.Reservation;

@Component
public class PdfGenerator {
	 
  public void generateItineraty(Reservation reservation, String filePath) {
	  Document d = new Document();
	 try {
		 PdfWriter.getInstance(d, new FileOutputStream(filePath));
		 d.open();
		 d.add(generateTable(reservation));
		 d.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	 
	}

private PdfPTable generateTable(Reservation reservation) {
	
	PdfPTable table =new PdfPTable(2);
	PdfPCell cell;
	
	cell =new PdfPCell (new Phrase("Flight Itinerary"));
	cell.setColspan(2);
	table.addCell(cell);
	
	cell = new PdfPCell (new Phrase("Flight Details"));
	cell.setColspan(2);
	table.addCell(cell);
	
	table.addCell("Departure City");
	table.addCell(reservation.getFlight().getDepartureCity());
	
	table.addCell("Arrival City");
	table.addCell(reservation.getFlight().getArrivalCity());
	
	table.addCell("Flight Number");
	table.addCell(reservation.getFlight().getFlightNumber());
	
	table.addCell("Operational Airline");
	table.addCell(reservation.getFlight().getOperatingAirlines());
	
	table.addCell("Departure Date");
	table.addCell(reservation.getFlight().getDateOfDeparture().toString());
	
	table.addCell("Departure Time");
	table.addCell(reservation.getFlight().getEstimatedDepartureTime().toString());
	
	cell =new PdfPCell (new Phrase("Passenger Details"));
	cell.setColspan(2);
	table.addCell(cell);
	
	table.addCell("First Name");
	table.addCell(reservation.getPassenger().getFirstName());
	
	table.addCell("Middle Name");
	table.addCell(reservation.getPassenger().getMiddleName());
	
	table.addCell("Last Name");
	table.addCell(reservation.getPassenger().getLastName());
	
	
	table.addCell("Email");
	table.addCell(reservation.getPassenger().getEmail());
	
	table.addCell("Phone Number");
	table.addCell(reservation.getPassenger().getPhone());
	
	return table;
	
	
	
	
}

  
}