/**
 * Represents a asset.
 *
 * class fileds implement from date class.
 *
 * @author MFTSEC
 * @version 1.0
 */
public class Asset {
    
    // a instance of date
    private Date date;


    /**
     * * constructor a new asset object with the given name and cost basis
     * @param name name of asset, implement from Bond class.
     * @param costBasis capital gains of asset, başta 0 olarak create edildi.
     */
    
     public Asset(String name, double costBasis){

        this.date.setName(name);

        this.date.setCostBasis(costBasis);

        this.date.setCapitalGains(0);

    }


}
