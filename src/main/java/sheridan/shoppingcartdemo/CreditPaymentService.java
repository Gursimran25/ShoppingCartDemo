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
public class CreditPaymentService extends PaymentService {
    
    public void processPayment(double amount) {
        System.out.println("Processing credit payment of $" + amount);
    }
    
}
