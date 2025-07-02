package misc;
// https://leetcode.com/problems/simple-bank-system
/*
Time Complexity     O(1)
Space Complexity	O(n)
 */
public class BankProgram {
    public static void main(String[] args) {
        String[] operations = {"Bank", "withdraw", "transfer", "deposit", "transfer", "withdraw"};
        int[][][] rawInputs = {
                {{10, 100, 20, 50, 30}},
                {{3, 10}},
                {{5, 1, 20}},
                {{5, 20}},
                {{3, 4, 15}},
                {{10, 50}}
        };

        Object[] output = new Object[operations.length];
        Bank bank = null;

        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];

            switch (op) {
                case "Bank":
                    long[] initBalance = new long[rawInputs[i][0].length];
                    for (int j = 0; j < rawInputs[i][0].length; j++) {
                        initBalance[j] = rawInputs[i][0][j];
                    }
                    bank = new Bank(initBalance);
                    output[i] = null;
                    break;

                case "withdraw":
                    int accW = rawInputs[i][0][0];
                    long moneyW = rawInputs[i][0][1];
                    output[i] = bank.withdraw(accW, moneyW);
                    break;

                case "deposit":
                    int accD = rawInputs[i][0][0];
                    long moneyD = rawInputs[i][0][1];
                    output[i] = bank.deposit(accD, moneyD);
                    break;

                case "transfer":
                    int from = rawInputs[i][0][0];
                    int to = rawInputs[i][0][1];
                    long amount = rawInputs[i][0][2];
                    output[i] = bank.transfer(from, to, amount);
                    break;
            }
        }

        // Print output
        System.out.print("[");
        for (int i = 0; i < output.length; i++) {
            if (i > 0) System.out.print(",");
            if (output[i] == null) {
                System.out.print("null");
            } else {
                System.out.print(output[i]);
            }
        }
        System.out.println("]");
    }

    // Inner Bank class
    static class Bank {
        private long[] balance;

        public Bank(long[] balance) {
            this.balance = balance;
        }

        public boolean transfer(int account1, int account2, long money) {
            if (isValidAccount(account1) && isValidAccount(account2) && balance[account1 - 1] >= money) {
                balance[account2 - 1] += money;
                balance[account1 - 1] -= money;
                return true;
            }
            return false;
        }

        public boolean deposit(int account, long money) {
            if (isValidAccount(account)) {
                balance[account - 1] += money;
                return true;
            }
            return false;
        }

        public boolean withdraw(int account, long money) {
            if (isValidAccount(account) && balance[account - 1] >= money) {
                balance[account - 1] -= money;
                return true;
            }
            return false;
        }

        private boolean isValidAccount(int account) {
            return account >= 1 && account <= balance.length;
        }
    }
}
