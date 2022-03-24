package data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class SaveData {
    private String tipe;
    private int amount;
    private int totalAmoun;
    private LocalDate date;
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public SaveData(int amount, int totalAmoun, String date, String tipe) {
        this.amount = amount;
        this.totalAmoun = totalAmoun;
        this.date = LocalDate.parse(date, formato);
        this.tipe = tipe;
    }

    public int getAmount() {
        return amount;
    }

    public int getTotalAmoun() {
        return totalAmoun;
    }

    public LocalDate getDate() {
        return date;
    }
    public String getTipe() {
        return tipe;
    }
}
