/**
 * Represents a customer.
 *
 * The class has 3 fileds and bond and mutualfund instance.has a constructor.
 *
 * @author MFTSEC
 * @version 1.0
 */
public class Customer {

    //bond instance
    Bond bond;
    
    //mutualfund instance
    MutualFund mutualFund;
   
    //first name of customer
    private String firstName;
    
    //last name of customer
    private String lastName;
    
    //total cash of customer
    private double totalCash;

    //date instance (current price aldık)
    Date date;


    /**
     * @param bond bond instance.
     * @param mutualFund mutual fund instance.
     * @param firsName first name of customer.
     * @param lastName last name of cutomer .
     * @param totalCash totla cash of customer.
     */
    public Customer(Bond bond, MutualFund mutualFund, String firsName, String lastName, double totalCash){

        this.bond= bond;
        this.mutualFund=mutualFund;
        this.firstName=firsName;
        this.lastName=lastName;
        this.totalCash=totalCash;

    }


    //get and set methods.
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }


    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }


    public Bond getBond(){
        return bond;
    }

    public void setBond(Bond bond){
        this.bond=bond;
    }

    
    public MutualFund geMutualFund(){
        return mutualFund;
    }

    public void setMutualFund(MutualFund mutualFund){
        this.mutualFund=mutualFund;
    }

    

    /**
     * @return Returns the current price of the bond times the number of bonds owned plus the number of shares times the current price for the mutual fund
     */
    public double curretValue(){
        
        
        return bond.getCurrentPriceOfBond()*bond.getNumberOwned()+mutualFund.numberSharesMutalFund()*mutualFund.currentPriceyMutualFund();
        
        
    }


    /**
     * @return the sum of the capital gains of the bond and mutual fund
     */
    public double getCapitalGains(){
        
        return mutualFund.getCapitalGainsOfMutualFund()+bond.getCapitalGainsOfBond();
        
        
    }


    /**
     * Calls the bond’s sell method and deposits the value returned into the customer’s total cash.
     */
    public void sellBond(){
          
        totalCash +=bond.sell();
    }


    /**
     * buy bond işlemi yapar işleme göre:
     * @return true of false 
     */
    public boolean buyBond(){
        
        if (bond.getCurrentPriceOfBond()>totalCash) {
            return false;
        }else{
            
            totalCash -= bond.buy();
            return true;
        }
        
    }


    /**
     * @param amountOfWithdraw the amount to withdraw
     */
    public void withdrawMutualFund(double amountOfWithdraw){
        totalCash += mutualFund.sell(amountOfWithdraw);

    }


    /**
     * @param x diye parametre, alır buy mutualfund yapar.
     * @return true or false
     */
    public boolean buyMutualFund(double x){

        if (x>totalCash) {
            return false;
            
        }else{
            totalCash-= mutualFund.buy(x);
            return true;
        }
        
    }









}
