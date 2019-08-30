package mainPackage;

import java.util.Scanner;

public class Expenses {
    private double [] expenses;
    private int numberOfItems;
    private double totalExpenses;
    //This constructor take the number of items to make a loop and add all the expenses together and save this number
    //along with saving the number of items and setting the array with each individual expense.
    public Expenses(int numberOfItemsInput){
        this.expenses = new double[numberOfItemsInput];
        double sum = 0;
        for(int index = 0; index < numberOfItemsInput; index++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Your expenses are: "+sum);
            System.out.println("Enter your next Expense:" );
            this.expenses[index] = sc.nextDouble();
            sum += this.expenses[index];

        }
        System.out.println("Your total expenses are: "+sum);
        totalExpenses = sum;
    }
    public Expenses(){
        System.out.println("Enter how many expenses there were");
        Scanner sc = new Scanner(System.in);
        int numberOfItemsInput = sc.nextInt();
        this.expenses = new double[numberOfItemsInput];
        double sum = 0;
        for(int index = 0; index < numberOfItemsInput; index++){
            System.out.println("Your expenses are: "+sum);
            System.out.println("Enter your next Expense:" );
            this.expenses[index] = sc.nextDouble();
            sum += this.expenses[index];

        }
        System.out.println("Your total expenses are: "+sum);
        totalExpenses = sum;
    }

    public double[] getExpenses() {
        return expenses;
    }

    public void setExpenses(double[] expenses) {
        this.expenses = expenses;
    }
    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public double getTotalExpenses() {
        return totalExpenses;
    }

    public void setTotalExpenses(double totalExpenses) {
        this.totalExpenses = totalExpenses;
    }
}
