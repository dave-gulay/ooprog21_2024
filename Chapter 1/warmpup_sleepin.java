public class warmpup_sleepin {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static void main(String[] args) {
        warmpup_sleepin sleep = new warmpup_sleepin();
        
        System.out.println("sleepIn(false, false): " + sleep.sleepIn(false, false));
        System.out.println("sleepIn(true, false): " + sleep.sleepIn(true, false));
        System.out.println("sleepIn(false, true): " + sleep.sleepIn(false, true));
    }
}