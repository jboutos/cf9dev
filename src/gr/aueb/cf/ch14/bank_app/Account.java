package gr.aueb.cf.ch14.bank_app;

import java.time.LocalDateTime;

public class Account {
    private long id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public Account() {

    }

    public Account(long id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Public API

    /**
     * Deposits the specified amount into the account
     * @param amount the amount to deposit
     * @throws NegativeAmountException if the amount is negative
     */
    public void deposit(double amount) throws NegativeAmountException {
        try {
            if (amount < 0) throw new NegativeAmountException("The amount " + amount + " should be positive.");
            balance += amount;
        } catch (NegativeAmountException e) {
            System.err.println("Negative amount= " + amount + " is not allowed" + "\n" + e.getMessage());
            throw e;
        }
    }

    /**
     * Withdraws the specified amopunt of money from the account
     * @param amount the amount of money to withdraw
     * @param ssn the ssn of ther account holder
     * @throws InsufficientBalanceException if the amount is insufficient
     * @throws NegativeAmountException if the amount is negative
     * @throws SsnNotValidException if the ssn does not match
     */
    public void withdraw(double amount, String ssn) throws NegativeAmountException, InsufficientBalanceException, SsnNotValidException {
        try {
            if (amount <= 0) throw new NegativeAmountException("The amount " + amount + " should be positive.");
            if (amount > balance) throw new InsufficientBalanceException("The balance = " + balance + " is insufficient");
            //an to ssn den einai to ssn toy  katoxou
            //this should not be the concern of the withdraw method
            //if (!ssn.equals(this.ssn)) throw new Exception("The SSN does not match.");
            if (!isSsnValid(ssn)) throw new SsnNotValidException("The SSN= " + ssn + " is not valid.");
            balance -= amount;
        } catch (NegativeAmountException | InsufficientBalanceException | SsnNotValidException e) {
            System.err.println(LocalDateTime.now() + "\n" +  e.getMessage());
            throw e;
        }
    }

    public double getAccountBalance() {
        //we call the getter
        return getBalance();
    }

    /**
     * Returns the state of the account as a string
     * @return the string representation of the {@link Account} object
     */
    public String accountToString() {
        return "Account: " + id + " IBAN: " + iban + " Firstname: " + firstname
                + " Lastname: " + lastname + " SSN: " + ssn + " Balance: " + balance;
    }

    private boolean isSsnValid(String ssn) {
        //private method
        return this.ssn.equals(ssn);
    }
}
