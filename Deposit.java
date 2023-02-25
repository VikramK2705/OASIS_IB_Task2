;import java.time.LocalDate;
import java.time.LocalTime;

public class Deposit implements Transaction{
    private int amount;
    LocalDate localDate;
    LocalTime localTime;
    String type="Deposit";
    Deposit(int amount){
        this.localDate=LocalDate.now();
        this.localTime=LocalTime.now();
        this.amount=amount;

    }

    @Override
    public String toString() {
        return "Date: "+localDate+"  Time: "+localTime+" "+" Type: "+type+"   Amount:Rs."+amount;
    }
}
