package helloworldpackage;
//Class to manage seat reservations
class SeatReservation {

 private int availableSeats = 5;

 // Synchronized method for booking seats
 public synchronized void bookSeats(String user, int seats) {

     System.out.println(user + " is trying to book "
             + seats + " seats.");

     if (availableSeats >= seats) {

         System.out.println("Booking Successful for " + user);

         availableSeats = availableSeats - seats;

         System.out.println("Seats Remaining: "
                 + availableSeats);

     } else {

         System.out.println("Sorry! Seats Not Available for "
                 + user);
     }
 }

 public int getAvailableSeats() {
     return availableSeats;
 }
}

//Thread class for booking
class BookingThread extends Thread {

 SeatReservation reservation;
 int seats;

 BookingThread(SeatReservation reservation,
               int seats, String name) {

     super(name);
     this.reservation = reservation;
     this.seats = seats;
 }

 public void run() {

     reservation.bookSeats(getName(), seats);
 }
}

//Main class
public class SeatReservationSystem {

 public static void main(String[] args) {

     SeatReservation reservation = new SeatReservation();

     System.out.println("===== SEAT RESERVATION SYSTEM =====");

     // Creating multiple threads
     BookingThread t1 =
             new BookingThread(reservation, 2, "User-1");

     BookingThread t2 =
             new BookingThread(reservation, 2, "User-2");

     BookingThread t3 =
             new BookingThread(reservation, 2, "User-3");

     // Starting threads
     t1.start();
     t2.start();
     t3.start();

     try {
         t1.join();
         t2.join();
         t3.join();
     }
     catch (InterruptedException e) {
         System.out.println("Thread Interrupted.");
         Thread.currentThread().interrupt();
     }

     System.out.println("==================================");

     System.out.println("Total Available Seats: "
             + reservation.getAvailableSeats());

     System.out.println("Seat Reservation Process Completed.");
 }
}

