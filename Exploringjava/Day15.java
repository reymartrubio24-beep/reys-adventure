//Bank Acount System
public class Day15 {
    
    static void createAccount(String[] names, double[] balances, int index ) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter account holder name: ");
            names[index] = scanner.nextLine();

            System.out.print("Enter initial deposit amount: ");
            balances[index] = scanner.nextDouble();

            System.out.println("Account created succesfully!");
    }

    static void displayAccounts(String[] names, double[] balances) {
        System.out.println("===ALL ACCOUNTS===");
        for ( int i = 0; i < names.length; i++){
            if (names[i] != null) {
                System.out.println((i+1) + ". " + names[i] + "-balance: PHP" + balances[i]);

            }
        }
    }


    static void deposit(String[] names, double[] balances, int accountIndex, double amount) {
        balances[accountIndex] += amount;
        System.out.println("Deposited PHP "+ amount + " to " + names[accountIndex]);
    }

    public static void main(String[] args) {
        String[] accountNames = new String[10];
        double[] accountBalances = new double[10];


        createAccount (accountNames, accountBalances, 0);
        createAccount ( accountNames, accountBalances, 1);

        displayAccounts(accountNames, accountBalances);
    }
}

