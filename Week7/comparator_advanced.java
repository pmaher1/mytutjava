package comparatoradvanced;

import java.util.Comparator;

public class Product {
    private String name;
    private int priceCents;
    private int stockLevel;

    public Product(String name, int priceCents, int stockLevel) {
        this.name = name;
        this.priceCents = priceCents;
        this.stockLevel = stockLevel;
    }
    
    public double getPriceCents(){
        return this.priceCents;
    }
    
    public int getStockLevel(){
        return this.stockLevel;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.stockLevel + " @ $" + this.priceCents / 100.0;
    }

    /**
     * This comparator should sort products alphabetically (or lexicographically)
     * by their name.
     */
    static class AlphabeticalComparator implements Comparator<Product> {
        @Override
        
        public int compare(Product p1, Product p2) {
            String[] newString1 = p1.toString().split(": ",1);
            String[] newString2 = p2.toString().split(": ",1);
            int returnValue = 1;
            
            int compare = newString1[0].compareTo(newString2[0]);
            
            if (compare==0){
                returnValue = 0;
            }    
            else if (compare<0){
                returnValue = -1;
            }
            return returnValue;
        }
        
    }

    /**
     * This comparator should sort products by whether or not they are in stock,
     * then in ascending order by their price.
     *
     * After sorting, products that have a positive stock level should appear
     * before products that have a stock level of 0. If two products being
     * sorted are either 1) both in stock; or 2) both out of stock, they
     * should then be sorted based on their price in ascending order.
     */
    static class PriceStockComparator implements Comparator<Product> {
        @Override
        public int compare(Product p1, Product p2) {
            int returnValue = 1;
            int stock1 = p1.getStockLevel();
            int stock2 = p2.getStockLevel();
            double price1 = p1.getPriceCents();
            double price2 = p2.getPriceCents();
            
            if(stock1 == 0 && stock2 == 0){
                if (price2==price1){
                    returnValue = 0;
                }
                else if (price2>price1){
                    returnValue = -1;
                }
            }
            else if(stock1 > 0 && stock2 > 0){
                if (price2==price1){
                    returnValue = 0;
                }
                else if (price2>price1){
                    returnValue = -1;
                }
                //return returnValue;
            }
            else if(stock1 > 0){
                returnValue= -1;
            }
            else{ 
                returnValue= 1;}
            return returnValue;
        }
            
    }
}
