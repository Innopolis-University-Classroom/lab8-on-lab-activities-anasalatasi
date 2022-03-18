package com.muwaffaq.innopolis.solid.SRP.wrong;
import com.muwaffaq.innopolis.solid.SRP.correct.Product;

import java.util.List;

/**
 * ❌ ❌ ❌ ❌
 * how many responsibilities does it have?
 *
 * SRP :
 * a class should only have one responsibility
 * it should only have one reason to change
 */




public class Cart {
public class addToCart{

    List<Product> products;
    double totals;
    
    void addToCart(Product product) {
        products.add(product);
    }
}
public class removeFromCart{
        List <Product> products;
        void removeFromCart(Product product) {
        products.remove(product);
    }
}
public class discountCart{
    double total ;
    void applyDiscount(int percentage) {
        totals = totals * percentage;
    }
}

}



