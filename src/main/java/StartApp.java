import java.beans.Statement;
import java.sql.Date;
import java.time.LocalDate;


public class StartApp {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(1000, "15/05/2022");
        // account.deposit(2000, new Date(10/01/2021));
       // account.withdraw(500, LocalDate.of(2021,05,19));



        account.printStatements();
       // System.out.println();
    }
}
