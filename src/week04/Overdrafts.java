package week04;

public class Overdrafts {
    public static void main(String[] args) {
            double balance = 105.0;
            double price = 115.0;

            // 2) we decrease value of balance by price (-=)
            balance -= price;

            // 3) if balance is negative, add $35 overdraft fee to balance.
            //        print "Account overdraft fee applied"
            if (balance < 0) {
                balance -= 35;
                System.out.println("Account overdraft fee applied");
            }

            // 4) print out balance
            System.out.println("balance = $" + balance);
        }
    }

/*
1) declare 2 double variables and assign values:
    - balance
    - price
 2) we decrease value of balance by price (-=)
 3) if balance is negative, add $35 overdraft fee to balance
 4) print out balance
 */