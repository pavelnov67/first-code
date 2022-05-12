public class cycle_while {
    public static void main(String[] args) {
        double bablonamot = 4000;
        int kopilka = 150;
        int month = 0;
        double inflacia = 0.01;
        double balance = 300;

         do {
             balance += kopilka;
             balance = balance - balance * inflacia;
             month++;
             System.out.println("skolko month sobiraesh " + month);
             System.out.println("skolko $ nasobiral " + balance);

         }
            while (bablonamot > balance || month < 16);


        }
    }

