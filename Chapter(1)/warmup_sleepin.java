public class warmup_sleepin {

    public static void main(String[] args){
        System.out.println(sleepin(false, false));
        System.out.println(sleepin(true, false));
        System.out.println(sleepin(false, true));

    }

    public static boolean sleepin(boolean weekday, boolean vacation){

        return !weekday || vacation;

    }
}
