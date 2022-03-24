import data.SaveData;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Account {
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate date;
    private List<SaveData> lista = new ArrayList<SaveData>();
    private Amount amount = new Amount(0);

    void deposit(int amount, String date) {

        this.amount.deposit(amount);
        lista.add(new SaveData(amount, this.amount.getAmount(), date, "Deposito"));
    }

    void withdraw(int amount, String date) {
        this.amount.withdraw(amount);
        lista.add(new SaveData(amount, this.amount.getAmount(), date, "Retiro"));
    }

    void printStatements() {
        for (SaveData elem : lista) {


            System.out.println(elem.getDate().format(formato));
            System.out.println(elem.getTipe());
            System.out.println(elem.getTotalAmoun());


        }

    }

}
