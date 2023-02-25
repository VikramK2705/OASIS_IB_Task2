import java.time.LocalDate;
import java.time.LocalTime;

public class Transfer implements Transaction{
    int amount;
    LocalDate localDate;
    LocalTime localTime;
    String type="Transfer";
    private int receiver_id;
    Transfer(int amount,int receiver_id){
        this.amount=amount;
        this.receiver_id=receiver_id;
        localDate=LocalDate.now();
        localTime=LocalTime.now();
    }

    @Override
    public String toString() {
        return "Date: "+localDate+"   Time: "+localTime+" "+" Type: "+type+"   Amount:Rs."+amount+"   To Account no: "+receiver_id ;

    }
}
