import java.time.LocalDate;
import java.time.LocalTime;

public class Withdraw implements Transaction{
    private int amount;
    LocalDate localDate;
    LocalTime localTime;
    String type="Withdrawal";
    Withdraw(int amount){
        this.amount=amount;
        localDate=LocalDate.now();
        localTime=LocalTime.now();
    }

    @Override
    public String toString() {
        return "Date: "+localDate+"  Time: "+localTime+" "+" Type: "+type+"   Amount:Rs."+amount;

    }
}
