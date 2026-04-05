import java.util.Scanner;
public class SecondsToHoursConverter {    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of seconds: ");
        long totalSeconds = sc.nextLong();
        long hours   = totalSeconds / 3600;
        long remain  = totalSeconds % 3600;
        long minutes = remain / 60;
        long seconds = remain % 60;
        System.out.println(totalSeconds + " seconds = "
            + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }
}
