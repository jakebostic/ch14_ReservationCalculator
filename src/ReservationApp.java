import java.time.LocalDate;

public class ReservationApp {

	public static void main(String[] args) {
		System.out.println("Reservation Calculator");
		System.out.println();
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int arrivalMonth = Console.getInt("Enter the arrival month (1-12): ", 0, 13);
			int arrivalDay = Console.getInt("Enter the arrival day (1-31): ", 0, 32);
			int arrivalYear = Console.getInt("Enter the arrival year: ", 2017, 2100);
			System.out.println();
			
			int departureMonth = Console.getInt("Enter the departure month: ", 0, 13);
			int departureDay = Console.getInt("Enter the departure day: ", 0, 32);
			int departureYear = Console.getInt("Enter the departure year: ", 2017, 2100);
			System.out.println();
			
			LocalDate arrivalDate = LocalDate.of(arrivalYear, arrivalMonth, arrivalDay);
			LocalDate departureDate = LocalDate.of(departureYear, departureMonth, departureDay);
			
			Reservation r = new Reservation(arrivalDate, departureDate);
			
			System.out.println("Arrival Date: " + r.getArrivalDateFormatted());
			System.out.println("Departure Date: " + r.getDepartureDateFormatted());
			System.out.println("Price: " + r.getPricePerNightFormatted() + " " + "per night");
			System.out.println("Total Price: " + r.getTotalPriceFormatted() + " " + "for" + " " +
					           + r.getNumberOfNights() + " " + "nights");
			System.out.println();
			
			
			choice = Console.getString("Continue? (y/n): ");
            System.out.println();
		}
		
		System.out.println("Bye!");

	}

}
