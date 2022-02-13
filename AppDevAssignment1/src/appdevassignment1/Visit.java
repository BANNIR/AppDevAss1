/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdevassignment1;

import java.util.Date;

/**
 *
 * @author shahe
 */
public class Visit extends Customer {

    private Customer customer;
    private Date date;
    private double serviceExpense, productExpense, totalExpense;

    public Visit(Date date, String name) {
        super(name);
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    @Override
    public String toString() {
        return "Visit{ " + super.toString() + " customer=" + customer + ", date=" + date + ", serviceExpense=" + serviceExpense + ", productExpense=" + productExpense + ", totalExpense=" + totalExpense + '}';
    }

}
