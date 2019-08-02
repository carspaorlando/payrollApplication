package mainPackage;

public class Income {
    //This class will store objects with the money that was made, tips, and in which days it was made
    //classes will have access to each specific day and will be able to customize the total for each employee
    private String [] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
    private double []  moneyChargedOnDay = new double[7];
    private double [] tipMadeOnDay = new double[7];
    private double totalCharges;
    private double totalTips;
    private double grossIncome;
    private double totalExpenses;
    private double netIncome;


    //This method to be used to display the day of the week in a String
    public String getDayOfWeek(int dayInput){
        return dayOfWeek[dayInput];
    }

    //This method is made so that the money made on an specific day can be stored in its respective day
    public void setMoneyChargedOnDay(int indexOfDayInput, double moneyChargedOnDayInput){
        this.moneyChargedOnDay[indexOfDayInput] = moneyChargedOnDayInput;
    }

    public void setTipMadeOnDay(int indexOfDayInput, double tipMadeOnDayInput){
        this.tipMadeOnDay[indexOfDayInput] = tipMadeOnDayInput;
    }


    //This method adds the charges made in the week
    public void setTotalCharges(){
        double total = 0;
        for( int index = 0; index < 7; index++){
           total += moneyChargedOnDay[index];
        }
        this.totalCharges = total;
    }
    //This methods adds all the tips
    public void setTotalTips(){
        double total = 0;
        for( int index = 0; index < 7; index++){
            total += tipMadeOnDay[index];
        }
        this.totalTips = total;
    }

    //This method gives you the gross income for the employees that make money based on Gross Income
    public void setGrossIncome(){
        this.grossIncome = totalTips + totalCharges;
    }

    public void setTotalExpenses(double totalExpensesInput){
        this.totalExpenses = totalExpensesInput;
    }

    public void setNetIncome(double totalPayrollInput){
        this.netIncome = grossIncome - (totalExpenses + totalPayrollInput);
    }



}
