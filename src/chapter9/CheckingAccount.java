package chapter9;

/**
   A checking account has a limited number of free deposits and withdrawals.
*/
public class CheckingAccount extends BankAccount
{
   private int withdrawals;

   /**
      Constructs a checking account with a zero balance.
   */
   public CheckingAccount()
   {
      withdrawals = 0;
   }

   public void withdraw(double amount)
   {
      final int FREE_WITHDRAWAL_LIMIT = 3;
      final int WITHDRAWAL_FEE = 1;
      
      super.withdraw(amount);  
      withdrawals++;
      if (withdrawals > FREE_WITHDRAWAL_LIMIT)
      {
         super.withdraw(WITHDRAWAL_FEE);  
      }
   }

   public void monthEnd()
   {
      withdrawals = 0;
   }
}

