//main
public class Main {
    public static void main(String[] args) {
        ParkingTicketMachine machine = new ParkingTicketMachine(10000); 

        machine.insertMoney(50000); 

        Ticket ticket = machine.issueTicket(); 

        if (ticket != null) {
            System.out.println("Tiket untuk " + ticket.getHours() + " jam telah dikeluarkan.");
        }

        System.out.println("Waktu parkir yang dibeli: " + machine.getTimePurchased() + " jam.");
    }
}


//ticket
public class Ticket {
    private int hours; 

    public Ticket(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return this.hours;
    }
}


//parking machine
public class ParkingTicketMachine {
    private int balance;        
    private int ticketPrice;    
    private int ticketTime;     

    public ParkingTicketMachine(int ticketPrice) {
        this.balance = 0;
        this.ticketPrice = ticketPrice;
        this.ticketTime = 0;
    }

    public void insertMoney(int amount) {
        if (amount <= 0) {
            System.out.println("Masukkan jumlah uang yang valid.");
            return;
        }
        this.balance += amount;
        System.out.println("Uang yang dimasukkan: Rp" + amount + ". Total saldo: Rp" + this.balance + ".");
    }

    public Ticket issueTicket() {
        if (this.balance < this.ticketPrice) {
            System.out.println("Saldo tidak cukup untuk membeli tiket.");
            return null;
        }

        this.ticketTime = balance / ticketPrice;
        Ticket ticket = new Ticket(ticketTime);

        this.balance -= this.ticketTime * this.ticketPrice;
        System.out.println("Tiket dikeluarkan untuk " + this.ticketTime + " jam. Saldo tersisa: Rp" + this.balance + ".");
        return ticket;
    }

    public int getTimePurchased() {
        return this.ticketTime;
    }
}
