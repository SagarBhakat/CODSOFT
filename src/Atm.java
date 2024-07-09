public class Atm {
      private double balance;


    public void deposit(double money){
         if(money<=0){
             System.out.println("invalid amount");
         }else{
             balance +=money;

         }
     }
     public double withdraw(double money){
         if(money<0){
             System.out.println("Invalid amount.");
         }else if(money>balance){
             System.out.println("Insufficient balance.");

         }else{
             balance-=money;
         }
         return money;

     }
     public double checkBalance(){
         return balance;
     }

}
