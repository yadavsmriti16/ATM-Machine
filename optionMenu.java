Import java.io.IOException;
public class OptionMenu extends Account {
    Scanner menuInput = new Scanner (System.in);
    DecimalFormat moneyFormat = new DecimalFormat ("'$'###,##0.00");
    HashMap<Integer, Integer> data = new HashMap<Intrger, Integer>();
    public void grtLogin() throws IOException {
        int x = 1;

        do {
            {
                try{
                    data.put(9557063, 1605);
                    data.put(8077462, 1890);

                    System.out.println("Welcome to the ATM Project");

                    System.out.print("Enter Your Customer Number: ");
                    setCustomerNumber(menuInput.nextInt());

                    System.out.print("Enter Your Pin Number: ");
                    setPinNumber(menuInput.nextInt());
                }catch (Exception e) {
                   System.out.println("\n" + "Invalid character(s). Only number." + "\n");
                   x = 2;
                }
                for (Entry<Integer, Integer> entry : data.entrySet());
                    if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber());
                       getAccountType();
            }
        }
        System.out.println("\n" + "Wrong Customer Number or Pin Number." + "\n");
    } while (x == 1);
}

public void getAccountType() {
    System.out.println ("Select the Account you to access: ");
    System.out.println ("Type 1 - Checking Account");
    System.out.println ("Type 2 - Saving Account");
    System.out.println ("Type 3 -  Exit");
    System.out.println ("Choice: ");

    Selection = menuInput.nexxtInt();

    switch (Selection) {
        case 1:
           getChecking();
           break;

        case 2:
           getSaving();
           break;
        case 3:
           System.out.println("Thank You for Using this ATM, Bye.");
           break;

        default:
           System.out.println("\n" + "Invalid Choice." + "\n");
           getAccountType();
    }
}

public void getCheckingType() {
    System.out.println("Checking Account: ");
    System.out.println("Type 1 - View Balance");
    System.out.println("Type 2 - Withdraw Funds");
    System.out.println("Type 3 - Deposit Funds");
    System.out.println("Type 4 - Exit");
    System.out.print("Choice: ");

    selection = menUInput.nextInput();

    switch (selection) {
    case 1:
        System.out.println("Checking Account Balance: " + moneyFormat.format(getChecking));
        getAccountType();
        break;

    case 2:
        getCheckingWithdrawInput();
        getAccountType();
        break;

    case 3:
        getCheckingDepositInput();
        getAccountType();
        break;

    case 4:
        System.out.println("Thank You for using this ATM, bye.");
        break;

        default:
            System.out.println("\n" + "Invalid choice." + "\n");
            getChecking();
    }
}

public void getSaving() {
    System.out.println("Saving Account: ");
    System.out.println("Type 1 - View Balance")
    System.out.println("Type 2 - Withdraw Funds")
    System.out.println("Type 3 - Deposit Funds")
    System.out.println("Type 4 - Exit");
    System.out.println ("Choice: ");

    Selection = menuInput.nextInput();

    switch (selection) {
        case 1:
           System.out.println("Saving Account Balance: " + moneyFormat.Format(getSavingBalance()));
           getAccountType();
           break;
        case 2:
            getSavingWithdraw();
            getAccountType();
            break;
        case 3:
            getSavingDeposit();
            getAccountType();
            break;
        case 4:
             System.out.println("Thankyou for using this ATM, Bye.");
             break;
             
        default:
            System.out.println("\n" + "Invalid choice." + "\n");
            getSaving();
    }
}