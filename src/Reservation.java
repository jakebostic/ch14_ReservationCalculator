import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Reservation {
	
	private LocalDate arrivalDate;
	private LocalDate departureDate;
	public final double PRICE_PER_NIGHT = 145.00;
	
	
	public Reservation(LocalDate arrivalDate, LocalDate departureDate) {
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
	}


	public LocalDate getArrivalDate() {
		return arrivalDate;
	}
	
	public String getArrivalDateFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(
				FormatStyle.LONG);
		return dtf.format(arrivalDate);
	}


	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}


	public LocalDate getDepartureDate() {
		return departureDate;
	}
	
	public String getDepartureDateFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(
				FormatStyle.LONG);
		return dtf.format(departureDate);
	}


	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}
	
	public int getNumberOfNights() {
		long numNights = ChronoUnit.DAYS.between(arrivalDate, departureDate);
		return (int) numNights;
	}
	
	public String getPricePerNightFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(PRICE_PER_NIGHT);
	}
	
	public double getTotalPrice() {
		int numNights = getNumberOfNights();
		return PRICE_PER_NIGHT * numNights;
	}
	
	public String getTotalPriceFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(getTotalPrice());
	}



	
	
	

}
