package gr.aueb.cf.ch14.bank_app;

public class NegativeAmountException extends Exception {

    public NegativeAmountException(String message) {
        super(message);
    }
}
