/**
 * Represents a mutual fund.
 *
 * the class has extend equtiy class, has a constructor, has additional fileds as load .
 *
 * @author MFTSEC
 * @version 1.0
 */
public class MutualFund extends Equity{

    //the load is percentage of that is charged on all sales of the fund
    private double loads;

    //date instance (buy metodu için currentprice almak için kullandık)
    private Date date;
    
    // instance of equity (number of share aldığımı yer)
    private Equity equity;

    

    /**
     * constructs a new mutualfund object with given name, costbasis, symbol, currentprice.
     * @param name name of mutalfund, implement from equity class.
     * @param costBasis capital gains of mutualfund, implement from equity class.
     * @param symbol symbol of mutualfund, implement from equity class.
     * @param currentPrice current price of mutualfund, implement from equity.
     */
    public MutualFund(String name, double costBasis, char symbol, double currentPrice){

        super(name,costBasis,symbol,currentPrice);

    }
    

    //get and set methods
    public double getLoads(){
        return loads;
    }

    public void setLoads(double loads){
        this.loads=loads;
    }


    
    /**
     * @param amounthOfMoney is input that the amount of money you are investing in the mutual fund.
     * @return satış işlemi yapıldıktan sonra, amounth of money döndürülür.
     */
    public double buy(double amountOfMoney){
        
        double increased1;

        double increased2;

        if (amountOfMoney<0) {

            return 0;
            
        } else {
    

            increased1 = equity.getNumberShares()+(amountOfMoney*(1-loads)/date.getCurrentPrice());

            equity.setNumerShares(increased1);

            //
            increased2 =date.getCostBasis() +amountOfMoney;
            
            date.setCostBasis(increased2);

            //
            return amountOfMoney;
      
        }

    }


    /**
     * @param amountOfMoney diye değer alır satış işlemi yapar .
     * @return amounthofmoney i geri döndürür.
     */
    public double sell(double amountOfMoney){

        double decrased1;

        double ratio;

        double decrased2;

        double decrased3;


        if (amountOfMoney<0 || amountOfMoney > (date.getCurrentPrice()* equity.getNumberShares())) {

            return 0;
            
        }else{
            
            
            //
            ratio = amountOfMoney/date.getCurrentPrice();

            decrased1 = equity.getNumberShares()- ratio;

            equity.setNumerShares(decrased1);

            //
            decrased2 = date.getCostBasis()-ratio;

            equity.setNumerShares(decrased2);

            //
            decrased3 = amountOfMoney-ratio;

            date.setCapitalGains(decrased3);


            return amountOfMoney;
        }

    }



    //customer clasında ihtiyaç duyduklarımız için get methodları.
    public double numberSharesMutalFund(){
        return equity.getNumberShares();
    }


    public double currentPriceyMutualFund(){
        return date.getCurrentPrice();
    }


    public double getCapitalGainsOfMutualFund(){
        return date.getCapitalGains();
    }

    



}
