package parking_system;
public class Price{
    public static int  Price(int hours) {
            if (hours <= 2) {
                return 50;
            } else if (hours <= 5) {
                return 100;
            } else {
                return 150;
            }
        }
    }