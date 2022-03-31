import java.text.DecimalFormat;

public class Account {
    Scanner input = new Scanner(System.in);
    DecimalFormal moneyFormat = new DecimalFormat("'$'###,##0.00");

    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public int setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber;
    }
    public int getPimNumber() {
        return pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public double calcCheckingWithdraw(double amount) {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    public double calcSavingWithdraw(double amount) {
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }

    public void getCheckingWithdrawInput() {
        System.out.println("checking Amount Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from Checking Account: ");
        double amount = input.nextDouble();

        if ((checkingBalance - amount) >= 0){
            calcSavingWithdraw(amount);
            System.out.println("New Checking Account balance:" + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    public void getSavingWithdrawInput() {
        System.out.println("Saving Account Balance:" + moneyFormat.farmat(savingBalance));
        System.out.println("Amount you want to withdraw fromSaving Account: ");
        double amount = input.nextDouble();

        if ((savingBalance - amount) >= 0){
            calcSavingWithdraw(amount);
            System.out.println("New Checking Account: " + savingBalance + "\n");
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    public void getCheckingDepositInput() {
        System.out.println("Checking Account Balance: " + moneyFormat(checkingBalance));
        System.out.println("Amount you want to deposit from Checking Account:");
        double amount = input.nextDouble();

        if ((checkingBalance + amount) >= 0) {
            calCheckingDeposit(amount);
            System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    public void getSavingDepositInput() {
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount you deposit from Saving Account: ");
        double amount = input.nextDouble();

        if ((savingBalance + amount) >= 0) {
            calcSavingDeposit(amount);
            System.out.println("Saving Account balance: " + moneyFormat.format(savingBalance));
        } else{
            System.out.println("Balance cannot be negative." + "\n");
        }
    }
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;
}