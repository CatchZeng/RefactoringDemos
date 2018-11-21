package com.catchzeng.refactoringdemos.r2_long_method;

//Replace Temp With Query
public class LongMethod2 {
    private double quantity = 0.4;
    private double itemPrice = 100;

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    double calculateTotal() {
        double basePrice = quantity * itemPrice;
        if (basePrice > 1000) {
            return basePrice * 0.95;
        } else {
            return basePrice * 0.98;
        }
    }

    double calculateTotal(double discount) {
        double basePrice = quantity * itemPrice;
        return basePrice * discount;
    }
}


// 1. final
// 2. Replace Temp With Query
//    double calculateTotal() {
//        if (basePrice() > 1000) {
//            return basePrice() * 0.95;
//        }
//        else {
//            return basePrice() * 0.98;
//        }
//    }
//    double basePrice() {
//        return quantity * itemPrice;
//    }