package mainPackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Employee {

        //Properties
        String employeeName;
        int employeeID;
        String employeeStartDate;
        double employeeHourlyRate;
        float employeeCommissionPercentage;


        //Constructors
        public Employee(String inputEmployeeName,
                        int inputEmployeeID,
                        String inputEmployeeStartDate,
                        Double inputEmployeeHourlyRate,
                        float inputEmployeeCommissionPercentage){
            setEmployeeName(inputEmployeeName);
            setEmployeeID(inputEmployeeID);
            setEmployeeStartDate(inputEmployeeStartDate);
            setEmployeeHourlyRate(inputEmployeeHourlyRate);
            setEmployeeCommissionPercentage(inputEmployeeCommissionPercentage);
        }

        public Employee(String inputEmployeeName,
                        int inputEmployeeID,
                        String inputEmployeeStartDate,
                        Double inputEmployeeHourlyRate){
            setEmployeeName(inputEmployeeName);
            setEmployeeID(inputEmployeeID);
            setEmployeeStartDate(inputEmployeeStartDate);
            setEmployeeHourlyRate(inputEmployeeHourlyRate);

        }

        public Employee(String inputEmployeeName,
                        int inputEmployeeID,
                        String inputEmployeeStartDate
        ){
            setEmployeeName(inputEmployeeName);
            setEmployeeID(inputEmployeeID);
            setEmployeeStartDate(inputEmployeeStartDate);


        }
        public Employee(String inputEmployeeName,
                        int inputEmployeeID,
                        String inputEmployeeStartDate,
                        float inputEmployeeCommissionPercentage
        ){
            setEmployeeName(inputEmployeeName);
            setEmployeeID(inputEmployeeID);
            setEmployeeStartDate(inputEmployeeStartDate);
            setEmployeeCommissionPercentage(inputEmployeeCommissionPercentage);

        }
        //Setters

        public void setEmployeeName(String newEmployeeName) {
            this.employeeName = newEmployeeName;
        }

        public void setEmployeeID(int newEmployeeID){
            this.employeeID = newEmployeeID;
        }

        public void setEmployeeStartDate(String newEmployeeStartDate){
           this.employeeStartDate = newEmployeeStartDate;
            // String pattern = "MM/dd/yyyy";
           // SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
           // this.employeeStartDate = simpleDateFormat.format(new Date() {
           // });
        }

        public void setEmployeeHourlyRate(double newEmployeeHourlyRate) {
            this.employeeHourlyRate = newEmployeeHourlyRate;
        }

        public void setEmployeeCommissionPercentage(float newEmployeeCommissionPercentage){
            this.employeeCommissionPercentage = newEmployeeCommissionPercentage;
        }

        //Getters
        public String getEmployeeName(){
            return employeeName;
        }
        public int getEmployeeID(){
            return employeeID;
        }
        public String getEmployeeStartDate(){
            return employeeStartDate;
        }
        public double getEmployeeHourlyRate(){
            return employeeHourlyRate;
        }
        public float getEmployeeCommissionPercentage(){
            return employeeCommissionPercentage;
        }

        //Functions
        public float getTotalCommission(float inputWeekGross, int numberOfDaysInput){
            int dayMinimumThreshold = 360;
            float weekCommission = inputWeekGross - dayMinimumThreshold * numberOfDaysInput;
            weekCommission = weekCommission* employeeCommissionPercentage;
            return weekCommission;
        }

        public float getTotalCommission(float inputWeekGross, float totalExpenses){
            float weekCommission = inputWeekGross - totalExpenses ;
            weekCommission = weekCommission* employeeCommissionPercentage;
            return weekCommission;
        }




}


