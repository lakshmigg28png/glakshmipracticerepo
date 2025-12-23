package oopsAssignments;
class Product {
    int productId;
    String productName;
    double price;

    Product() {
        System.out.println("Product Created");
    }

    
    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
 void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }
}
public class Constructor {
	 public static void main(String[] args) {
	       
	        Product p1 = new Product();
	        p1.displayProduct();
	        Product p2 = new Product(423, "HPLaptop", 705000.0);
	        p2.displayProduct();
	    }
	}

