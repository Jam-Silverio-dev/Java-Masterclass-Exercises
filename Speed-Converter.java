public class SpeedConverter {
    
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) { return -1; }
        else {
            double milesPerHour = kilometersPerHour / 1.609;
            long mph = Math.round(milesPerHour);
            return mph;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        
        if (kilometersPerHour < 0) {System.out.println("Invalid Value");}
        else{
            double milesPerHour = kilometersPerHour / 1.609;
            long mph = Math.round(milesPerHour);
            System.out.println(kilometersPerHour + " km/h" + " = " + mph + " mi/h");
        }

    }


}