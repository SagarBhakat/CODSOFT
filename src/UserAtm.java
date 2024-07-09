public class UserAtm {
    public static void main(String[] args) {
        Atm user1 = new Atm();
        Atm user2 = new Atm();

        user2.deposit(1000);
        System.out.println(user2.checkBalance());
        user2.withdraw(500);
        System.out.println(user2.checkBalance());
        System.out.println(user1.checkBalance());
        user1.deposit(9000);
        System.out.println(user2.checkBalance());
        System.out.println(user1.checkBalance());

        System.out.println(user1.checkBalance());
        System.out.println(user1.withdraw(100));


    }
}
