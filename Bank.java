

public interface Bank{

    public void addBank(Account acc) ;
   
    public boolean authorizeATM(int card) ;
    
    public boolean authorizeCard(String passCode) ;

    public double withdraw(String passCode,double amount) ;



}
