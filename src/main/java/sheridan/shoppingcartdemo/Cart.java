/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan.shoppingcartdemo;

import java.util.ArrayList;

/**
 *
 * @author Gursimran
 */
public class Cart {
    private final ArrayList<Product> products = new ArrayList<>();
    private PaymentService service;
    
    public void setPaymentService(PaymentService service){
        this.service = service;
    }
    public void payCart() {
        double totalCart = 0;
        totalCart = products.stream().map((product) -> product.getPrice()).reduce(totalCart, (accumulator, _item) -> accumulator + _item);
        service.processPayment(totalCart);
    }

    Product addProduct(Product product) {
        return product;
    }
}
