/**
 * Represents a equity.
 *
 * the class extends asset class, has a constructor, has additional fileds as numbershare and symbol.
 *
 * @author MFTSEC
 * @version 1.0
 */
public class Equity extends Asset{
    
    //number of share 
    private double numberShares;
    
    // symbol of equity
    private char symbol;
     
    // date instance
    private Date date;
    


    /**
     * constructs a new equity object with given name, costbasis, symbol, currentprice.
     * @param name name of equity, implement from asset class.
     * @param costBasis capital gains of equity, implement from asset class.
     * @param symbol symbol of equity.
     * @param currentPrice current price of equity, implement from date class.
     */
    public Equity(String name, double costBasis, char symbol, double currentPrice){
        
 
        super(name,costBasis);
        
        this.symbol=symbol;
        this.date.setCurrentPrice(currentPrice);

        this.date.setCostBasis(0);

    }
    

    //get and set methods.
    public final char getSymbol(){
        return symbol;
    }


    public double getNumberShares(){
        return numberShares;
    }

    public void setNumerShares(double numberShares){
        this.numberShares=numberShares;
    }


    

}
