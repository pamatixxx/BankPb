public class Card {
    public final long number;
    private String expDate;
    public final PbDZ_v1.Currency currency;
    private String pin;
    private Float balance;

    public Card(long number, String date, String year, PbDZ_v1.Currency currency) {
        this.number = number;
        chekExpDate("2014", "666");
        this.currency = currency;
    }

    private void chekExpDate(String date, String year) {
        String day = date + "/" + year;
        this.expDate = day;

    }
}
