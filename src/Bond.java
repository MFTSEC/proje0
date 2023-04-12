/**
 * Represents a bond.
 *
 * the class of bond extend asset has private fileds, a constructor, pay interest, buy and sell methods.
 *
 * @author MFTSEC
 * @version 1.0
 */
public class Bond extends Asset{

    
    // the number of bonds owned
    private int numberOwned;
 
    // principal of bond
    private double principal;
    
    //interest rate of bond
    private double interestRate;

    //date instance
    private Date date;

    /**
     * @param name name of bond, implement from asset class.
     * @param costBasis capitla gains of bond, implement from asset class.
     * @param principal principal of bond.
     * @param interestRate interesst rate of bond.
     * construcs a new bond object with name, principal, interestrate, costbasis.
     */
    public Bond(String name,double costBasis, double principal, double interestRate ){
        
        super(name, costBasis);

        this.principal=principal;
        this.interestRate=interestRate;

        this.date.setCurrentPrice(principal);
        this.date.setCostBasis(0);

    }


    //get and set methods.
    public final double getPrincipal(){
        return principal;
    }

    public int getNumberOwned(){
        return numberOwned;
    }

    public void setNumberOwned(int numberOwned){
        this.numberOwned=numberOwned;
    }


    public double getInterestRate(){
        return interestRate;
    }

    public void setInterestRate(double interestRate){
        this.interestRate=interestRate;
    }

    
    /**
     * @return faiz oranıyla prensibin çarpımını döndürür.
     */
    public double payInterest(){
        return interestRate*principal;
    }


    /**
     * @return alım sonrası current price döndürür.
     */
    public double buy(){
        
        double increased=date.getCostBasis()+date.getCurrentPrice();
        date.setCostBasis(increased);
        numberOwned +=1;
        
        return date.getCurrentPrice();
        
    }


    /**
     * @return satım sonrası current price döndürür.
     */
    public double sell(){

        if (numberOwned==0) {
            return 0;
        }else{

            Double decraised = date.getCostBasis()-(date.getCostBasis()/numberOwned);
            date.setCostBasis(decraised);
            numberOwned -=1;

            return date.getCurrentPrice();
        }
    }


    //customerda kullanmak için ihtiyaş duyulan get methodları
    public double getCurrentPriceOfBond(){
        return date.getCurrentPrice();
    }


    public double getCapitalGainsOfBond(){
        return date.getCapitalGains();
    }





    
}
