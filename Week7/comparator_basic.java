package comparatorbasic;

public class Product implements Comparable<Product> {
    private String name;
    private int priceCents;

    public Product(String name, int priceCents) {
        this.name = name;
        this.priceCents = priceCents;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.priceCents;
    }

    @Override
    public int compareTo(Product other) {
        // write your code here
        int returnValue = 1;
        if (other.priceCents==this.priceCents){
            returnValue = 0;
        }
        else if (other.priceCents>this.priceCents){
            returnValue = -1;
        }
        return returnValue;
    }
}
