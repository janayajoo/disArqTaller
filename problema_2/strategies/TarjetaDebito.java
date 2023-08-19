package tarea_2.problema_2.strategies;

public class TarjetaDebito {
    private String number;
    private String date;
    private String cvv;
    private String pin;

    TarjetaDebito(String number, String date, String cvv, String pin) {
        this.number = number;
        this.date = date;
        this.cvv = cvv;
        this.pin = pin;
    }

    public String getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public String getCvv() {
        return cvv;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
