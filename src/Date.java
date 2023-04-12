/**
 * Represents a Date.
 *
 * Class includes the filds and their get set methods to using.
 *
 * @author MFTSEC
 * @version 1.0
 */
public class Date {
    
    /**
     * fileds of date.
     */
    private String name;
    private String description;
    private double costBasis;
    private double currentPrice;
    private double capitalGains;

    
    
    //all fileds get, set methods.

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }


    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }


    public double getCostBasis(){
        return costBasis;
    }

    public void setCostBasis(double costBasis){
        this.costBasis=costBasis;
    }


    public double getCurrentPrice(){
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice){
        this.currentPrice=currentPrice;
    }
    

    public double getCapitalGains(){
        return capitalGains;
    }

    public void setCapitalGains(double capitalGains){
        this.capitalGains=capitalGains;
    }
}
