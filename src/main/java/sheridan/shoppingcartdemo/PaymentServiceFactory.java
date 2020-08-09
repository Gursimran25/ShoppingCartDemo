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
public class PaymentServiceFactory {
    public static PaymentServiceFactory instance;
    
    private PaymentServiceFactory(){
    }
    
    public static PaymentServiceFactory getInstance(){
        if(instance == null){
            instance = new PaymentServiceFactory();
        }
        return instance;
    }
    public PaymentService getPaymentService(PaymentServiceType type) {
        switch(type){
            case CREDIT: return new CreditPaymentService();
            case DEBIT: return new DebitPaymentService();
        }
        return null;
    }
}
