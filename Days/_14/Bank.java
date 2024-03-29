package _14;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches=new ArrayList<>();

    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName)==null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName,String customerName,double initialAmount){
        Branch branch = findBranch(branchName);
        if(branch!=null){
            return branch.newCustomer(customerName,initialAmount);

        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName,String customerName, double amount){
        Branch branch = findBranch(branchName);

        if(branch!=null){
            return branch.addCustomerTransaction(customerName,amount);
        }
        return false;
    }
    public Branch findBranch(String branchName){

        for(int i=0;i<this.branches.size();i++){
            if(this.branches.get(i).getName().equals(branchName) ){
                return this.branches.get(i);
            }
        }
        return null;

    }

    public boolean listCustomer(String branchName,boolean showTransaction){
        Branch branch= findBranch(branchName);
        if(branch!=null){

            System.out.println("customer details for branch "+branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomer();

            for(int i=0;i<branchCustomers.size();i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("customers:"+branchCustomer.getName());
                if(showTransaction){
                    System.out.println("Transaction:");
                    ArrayList<Double> transactions = branchCustomer.getTransaction();
                    for(int j=0;j<transactions.size();j++){
                        System.out.println("Amount:"+transactions.get(j));
                    }
                }
            }
            return true;
        }else{
            return false;
        }

    }








}
