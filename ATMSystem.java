
import java.util.Scanner;
public class ATMSystem extends observer {

    public static void main(String[] args) {

        bankAdaptor bankAdapter = bankAdaptor.getInstance();
        Account a1 = Account.getInstance("Yehia", 40, 22, "2017-08-16", "1422");
        Account a2 = Account.getInstance("Moe", 40, 11, "2011-08-16", "1322");
        Account b1 = Account.getInstance("Yehia", 40, 23, "2017-08-16", "5522");
        Account b2 = Account.getInstance("Johnny", 40, 21, "2020-08-16", "1412");
        Account b3 = Account.getInstance("Yehia", 40, 31, "2014-08-16", "1722");
        bankAdapter.chooseAdd("bankA" , a1);
        bankAdapter.chooseAdd("bankA" , a2);
        bankAdapter.chooseAdd("bankB" , b1);
        bankAdapter.chooseAdd("bankB" , b2);
        bankAdapter.chooseAdd("bankB" , b3);
        bankAdapter.showAccounts();
        System.out.println("Welcome to ATM System: Please enter ATM choice");
        Scanner sc = new Scanner(System.in);
        String atmChoice;
        atmChoice = sc.nextLine();
        char atmC = atmChoice.charAt(4);
        if (atmC == 'A') {
            boolean valid;
            do {
                System.out.println("Please enter card Number");
                int card = sc.nextInt();
                valid = bankAdapter.chooseauthorizeATM("bankA" ,card);
                if (!valid) {
                    System.out.println("try again");
                }
            } while (!valid);
            String password;
            boolean pValid = false;
            double amount;
            do {
                System.out.println("Enter password");
                password = sc.next();
                if (bankAdapter.chooseauthorizeCard("bankA" ,password) == true) {
                    pValid = true;
                    break;
                } else {
                    System.out.println("Wrong password, try again");
                }
            } while (!pValid);
            boolean valid2 = true;
            while (valid2) {
                System.out.println("enter amount to withdrawal or enter [2] to quit.");
                amount = sc.nextDouble();
                if (amount == 2) {
                    valid2 = false;
                    break;
                }
                if (amount >= 100) {
                    System.out.println("This amount exceeds the maximum amount you can withdraw per transaction");
                }
                if (amount > 40) {
                    System.out.println("The amount exceeds the current balance");
                }

                double balances = bankAdapter.choosewithdraw("bankA" ,password, amount);



            }
        }

        if (atmC == 'B') {
            boolean valid;
            do {
                System.out.println("Please enter card Number");
                int card = sc.nextInt();
                valid = bankAdapter.chooseauthorizeATM("bankB" ,card);
                if (!valid) {
                    System.out.println("try again");
                }
            } while (!valid);
            String password;
            boolean pValid = false;
            double amount;
            do {
                System.out.println("Enter password");
                password = sc.next();
                if (bankAdapter.chooseauthorizeCard("bankB" ,password) == true) {
                    pValid = true;
                    break;
                } else {
                    System.out.println("try again");
                }
            } while (!pValid);
            boolean valid2 = true;
            while (valid2) {
                System.out.println("Please enter amount to withdrawal!");
                amount = sc.nextDouble();
                if (amount == 2) {
                    valid2 = false;
                    break;
                }
                if (amount >= 100) {
                    System.out.println("This amount exceeds the maximum amount you can withdraw per transaction");
                }
                if (amount > 40 && amount < 100) {
                    System.out.println("The amount exceeds the current balance");
                }
                double balances = bankAdapter.choosewithdraw("bankB" ,password, amount);


            }
        }
    }

    @Override
    public void update() {
        System.out.println("The current Balance of your account is: " + new Account().getBalance());
        // TODO Auto-generated method stub
        
    }
}


