

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Account extends bankAdaptor {

    private String name;
    private double balance;
    private int card;
    private String exp;
    private String pass;

    /**
     * @constructor default
     */
    public Account(){
        super();
        this.name = "";
        this.balance = 40;
        this.card = 0;
        this.exp = "";
        this.pass = "";
    }

    private static Account initAccount = null ;



    private List<Observer> observerA = new ArrayList<Observer>() ;

   

    public void attach(Observer observer) {
        observerA.add(observer) ;
    }

    public void notifyAllObservers() {
        for (Observer observer : observerA) {
            observer.update(null, observer);
        }
    }

    /**
     * @constructor with specified values
     */
    public Account(String name,double balance, int card, String exp, String pass){

        this.name = name;
        this.balance = balance;
        this.card = card;
        this.exp = exp;
        this.pass = pass;
    }


    public synchronized static Account getInstance(String name,double balance, int card, String exp, String pass) {
        if(initAccount == null ) initAccount = new Account(name , balance , card , exp , pass) ;
        return initAccount ;
    }

    /**
     * @return name of customer
     */
    public String getName(){

        return name;
    }

    /**
     * @return card number
     */
    public int getCardNum(){

        return card;
    }

    /**
     *@return expiration date
     */
    public String getExpDate(){

        return exp;
    }

    /**
     * @return password
     */
    public String getPassword(){

        return pass;
    }


    public void setBalance(double balance){

        this.balance = balance;
        notifyAllObservers();

    }


    /**
     * @return balance
     */
    public double getBalance(){

        return balance;
    }

   
    public String toString(){
        return String.format("Customer: Name: %s  Card: %s Expiration Date:%s Password:%s", getName(), getCardNum(), getExpDate(), getPassword());
    }

}
