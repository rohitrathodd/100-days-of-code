package _14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Branch {

    private String name;
    private List<Customer> customer; // private ArrayList<Customer> customer;

    // private Customer[] customers = new Customer[5];

    public List<Customer> getCustomer() {
        return customer;
    }

    public Branch(String name){
        this.name=name;
        this.customer=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

   public boolean newCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName)==null){
            this.customer.add(new Customer(customerName, initialAmount));

            return true;
        }
        return false;
   }

    public boolean addCustomerTransaction(String customerName,double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer!=null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for(int i=0;i<this.customer.size();i++){
            Customer checkedCustomer = this.customer.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }

        }
        return null;
    }
}
