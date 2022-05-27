package sychronization;

class BookTheaterTickets{
	int total_seats=10;
	synchronized void bookSeat(int seats) {
		if(total_seats>=seats) {
			System.out.println("seats booked successfully");
			total_seats=total_seats-seats;
			System.out.println("seats left "+total_seats);
		}
		else {
			System.out.println("seats can'nt be booked");
			System.out.println("seats left "+total_seats);
		}
	}
}
public class SyncMeth extends Thread {
	static BookTheaterTickets B;
	int seats;
	public void run() {
		B.bookSeat(seats);
	}
	public static void main(String[] args) {
		B=new BookTheaterTickets();
		SyncMeth a=new SyncMeth();
		a.seats=7;
		a.start();
		SyncMeth b=new SyncMeth();
		b.seats=6;
		b.start();
	}

}
