/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan.shoppingcartdemo;

/**
 *
 * @author User
 */
public class ShoppingCartDemo {
    
    public static void main(String args[]){
        PaymentServiceFactory factory = PaymentServiceFactory.getInstance();
        PaymentService creditService = factory.getPaymentService(PaymentServiceType.CREDIT);
        PaymentService debitService = factory.getPaymentService(PaymentServiceType.DEBIT);
           //create cart and add products
        Cart cart = new Cart();
        cart.addProduct(new Product("shirt", 50));
        cart.addProduct(new Product("pants", 60));
        //set credit service pay
        cart.setPaymentService(creditService);
        cart.payCart();
        // set debit service pay
        cart.setPaymentService(debitService);
        cart.payCart();
                
    }
}
