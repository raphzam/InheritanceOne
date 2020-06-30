import java.text.NumberFormat;

public class Product {

    private String code;
    private String description;
    private double price;
    protected static int count = 0; // a protected static variable

    public Product() {      //constructor
        code = "";
        description = "";
        price = 0;
    }

    // Get and set accessors for the code, description, and price instance variables
    //void set argument assign
    //type get return

    public void setCode(String code){
        this.code = code;
    }

    public String getCode(){
        return this.code;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public String getDescription(){
        return this.description;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }


    @Override
    public String toString() {
        return "Code:                " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice(price) + "\n";
    }

    private String getFormattedPrice(double price) {
        // Use the NumberFormat class to format the price to 2 decimal places
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        String formattedPrice = numberFormat.format(price);
        return formattedPrice;
    }





    // Create public access for the count variable
    public static int getCount(int count) {
        return count;
    }
}