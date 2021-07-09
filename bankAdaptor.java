
import java.text.SimpleDateFormat;

import java.util.Date;

public class bankAdaptor{
    private static bankAdaptor instance = new bankAdaptor() ;

    public static bankAdaptor getInstance() {
        return instance ;
    }

    private String flag ;

    private bankA A ;
    private bankB B ;

    public void chooseAdd(String choise , Account acc) {
        if(choise.equals("bankA")) {
            A.addBank(acc);
            flag = "A" ;
        } else if(choise.equals("bankB")) {
            B.addBank(acc);
            flag = "B" ;
        }
    }

    public boolean chooseauthorizeATM(String choise ,int card) {
        boolean flag = false ;
        if(choise.equals("bankA")) {
          flag =   A.authorizeATM(card);
          return flag ;
        } else if(choise.equals("bankB")) {
           flag =  B.authorizeATM(card);
           return flag ;
        }
        return flag ;
    }

    public boolean chooseauthorizeCard(String choise ,String passCode) {
        boolean flag = false ; 
        if(choise.equals("bankA")) {
            flag =  A.authorizeCard(passCode);
            return flag ;
        } else if(choise.equals("bankB")) {
            flag =  B.authorizeCard(passCode);
            return flag ;
        }
        else{
            return flag ;
        }
       
    }

    public double choosewithdraw(String choise ,String passCode,double amount) {
        double amountA = 0 ;
        if(choise.equals("bankA")) {
           amountA =  A.withdraw(passCode , amount);
            flag = "A" ;
            return amountA ;
        } else if(choise.equals("bankB")) {
           amountA =  B.withdraw(passCode , amount);
            flag = "B" ;
            return amountA ;
        }
        return amountA ;
    }


 

    public bankAdaptor(){

       A = new bankA() ;
       B = new bankB() ;
       
    }

   
    public void showAccounts(){

        for(Account acc : A.A) System.out.println(acc.toString());
        for(Account acc : B.B) System.out.println(acc.toString());

    }


   
    public static boolean cardExp(String month){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String today = sdf.format(new Date());
        if(month.compareTo(today) > 0){
            return true;
        }else
            return false;
    }
   
    
}
