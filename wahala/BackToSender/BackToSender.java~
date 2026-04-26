public class BackToSender {

    public static int calculateWage(int successfulDeliveries) {
        int basePay = 5000;
        int rate;

        if (successfulDeliveries < 50) {
            rate = 160;
        } else if (successfulDeliveries < 60) {
            rate = 200;
        } else if (successfulDeliveries < 70) {
            rate = 250;
        } else {
            rate = 500;
        }

        return (successfulDeliveries * rate) + basePay;
    }
}
