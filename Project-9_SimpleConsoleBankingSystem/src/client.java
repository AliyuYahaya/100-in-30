public class client {
    static double balance;
    static double withdrawals;
    static double deposit;

    public static void balance() {

    }


    public static double getBalance() {
        balance = deposit - withdrawals;
        return balance;
    }

    public static void setBalance(double balance) {
        client.balance = balance;
    }

    public static double getWithdrawals() {
        return withdrawals;
    }

    public static void setWithdrawals(double withdrawals) {
        client.withdrawals = withdrawals;
    }

    public static double getDeposit() {
        return deposit;
    }

    public static void setDeposit(double deposit) {
        client.deposit = deposit;
    }
}
