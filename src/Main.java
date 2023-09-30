
public class Main {
    public static void main(String[] args) {

        int balance = 500;
        int account = 100;
        int bonus = account / 100;
        int amount = balance + account + bonus;


        if (account > 1000) {
            System.out.println("Итоговый счёт :" + amount);
        } else {
            System.out.println("Итоговый счёт :" + (account + balance));
        }



       }
    }
