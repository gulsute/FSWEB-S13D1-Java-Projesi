public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(area(3.0, 6.0));
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false,2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println("*****q2******");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("*****q3******");
    }

    public static boolean shouldWakeUp (boolean isBarking, int time) {
        if (!isBarking ) {
            return false;
        }
        return time < 8 || time > 20;
    }

    public static boolean hasTeen (int age1, int age2, int age3)  {
        if (age1 >= 13 && age1<= 19) {return true;}
        if (age2 >= 13 && age2<= 19) {return true;}
        if (age3 >= 13 && age3<= 19) {return true;}
        else {return false;}
    }


    public static boolean isCatPlaying (boolean isSummer, int temp) {
        if (!isSummer && temp >= 25 || temp <=35) {return true; }

    }

    public static double area (double n1, double n2) {
        if (n1<0 || n2<0) {
            return -1;
        } else {
            return n1*n2 ;
        }
    }

}