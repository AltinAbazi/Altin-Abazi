package parking_system;
public class Stay{
static String Stay(int hours) {
            if (hours > 5) {
                return "Long stay";
            } else {
                return "Normal stay";
            }
        }
    }