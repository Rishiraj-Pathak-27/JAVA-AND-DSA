
import java.util.Arrays;
public class angleBetweenHourMinuteHand {

    public static double angle(String s){
        String[] ans = s.split(":");
        
        double hours = Integer.parseInt(ans[0]);
        double minutes = Integer.parseInt(ans[1]);
        
        double hoursAngle = (((hours%12)*30))+(minutes*0.5);
        double minutesAngle = minutes*30;

        double res = Math.abs(hoursAngle-minutesAngle);

        return (res>180) ? 360-res : res;

    }

    public static void main(String[] args){
        String s = "06:00";
        System.out.println(angle(s));  
    }
}   
