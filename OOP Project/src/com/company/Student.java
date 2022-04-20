package com.company;

/** Created By Erdem Beştaş
 *tution, name, id,tutionPaid, grade
 * tution for students 8000₺
*/
public class Student {
    //declaring the field.
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    //Creating a new constructor-> special function


    public Student(int id, String name,int grade){
        //initializing the field inside constructor.
        this.feesPaid = 0;
        this.feesTotal = 8000;
        this.id = id;
        this.name = name;
        this.grade = grade;


    }



    public void setGrade(int grade){
        this.grade = grade;

    }


    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);


    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public int getGrade() {
        return grade;
    }


    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's NAME: "+id+". "+name+" || TOTAL FEES PAID: $" + feesPaid+" || REMAINS: $"+getRemainingFees();
    }
}