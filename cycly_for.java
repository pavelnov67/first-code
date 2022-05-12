public class cycly_for {
    public static void main(String[] args) {
        int limit = 12;
        int startNumber = 1;
        for (int i = 1; i <= limit; i++) {
            startNumber *= i;
            System.out.println("number= "+startNumber);
        }
        System.out.println(" ");
        System.out.println("lets do it other way round:");
        System.out.println(" ");
        for (int i = limit; i>=1; i--) {
            startNumber = startNumber/= i;
            System.out.println("count nom= "+startNumber);
            System.out.println("count i =" + i);
        }


    }
}
