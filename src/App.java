public class App {
    public static void main(String[] args) throws Exception {
        
        
        Asset asset = new Asset(null, 0);

        
        Date date = new Date();

        date.getCapitalGains();
        date.setCapitalGains(0);
        date.getName();
        date.setName(null);
        date.getCostBasis();
        date.setCostBasis(0);
        date.getCurrentPrice();
        date.setCurrentPrice(0);
        
        //bond class test
        Bond bond = new Bond(null, 0, 0, 0);

        bond.getPrincipal();
        bond.setNumberOwned(0);
        bond.getInterestRate();
        bond.setInterestRate(0);
        
        bond.payInterest();
        bond.buy();
        bond.sell();

        
        //equtiy class test
        Equity equity = new Equity(null, 0, 'a', 0);

        equity.getSymbol();
        equity.getNumberShares();
        equity.setNumerShares(0);


        //mutual fund test
        MutualFund mutualFund = new MutualFund(null, 0, 'c', 0);

        mutualFund.getLoads();
        mutualFund.setLoads(0);

        mutualFund.buy(0);
        mutualFund.sell(0);


        //cutomer class test
        Customer customer = new Customer(bond, mutualFund, null, null, 0);

        customer.getFirstName();
        customer.setFirstName(null);
        customer.getLastName();
        customer.setLastName(null);
        customer.getBond();
        customer.setBond(bond);
        customer.geMutualFund();
        customer.setMutualFund(mutualFund);

        customer.curretValue();

        customer.getCapitalGains();

        customer.sellBond();

        customer.buyBond();

        customer.withdrawMutualFund(0);

        customer.buyMutualFund(0);




        
        
        
        
        
        
        
        
        
        System.out.println(asset);

        
        
    }
}
