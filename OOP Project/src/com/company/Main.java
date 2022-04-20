package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Teacher metin = new Teacher( 1,11350,"Muhammet Metin Molak");
	Teacher erdem = new Teacher(2,11250, "Erdem Bestas");
	Teacher taha = new Teacher(3,10900,"Mustafa Taha Kabar");
        List<Teacher>teacherList = new ArrayList<>();
        teacherList.add(metin);
        teacherList.add(erdem);
        teacherList.add(taha);

    Student sertan = new Student(34, "Sertan Aygun",67);
    Student oguz = new Student(41,"Oguzhan Karatas",22);
    Student cihan = new Student(50,"Cihan Turan",2);
        List<Student>studentList =new ArrayList<>();
        studentList.add(sertan);
        studentList.add(oguz);
        studentList.add(cihan);

    School MarmaraUniversity = new School(teacherList,studentList);
    System.out.println("Marmara University earned : ₺ "+ MarmaraUniversity.getTotalMoneyEarned());

    cihan.payFees(8000);
    sertan.payFees(8000);
        System.out.println("Marmara University earned : ₺ "+ MarmaraUniversity.getTotalMoneyEarned());

        System.out.println("-----\t\tMARMARA UNIVERSITY FUND EARNED: $" + MarmaraUniversity.getTotalMoneyEarned()+"\t\t-----");

        System.out.println("-----\t\tMARMARA UNIVERSITY PAYS SALARY\t\t\t\t-----");

        metin.receiveSalary(metin.getSalary());
        System.out.println("MARMARA UNIVERSITY SPENT SALARY TO: " + metin.getName()+" || REMAINING MONEY IS: $"+ MarmaraUniversity.getTotalMoneyEarned());

        erdem.receiveSalary(erdem.getSalary());
        System.out.println("MARMARA UNIVERSITY SPENT SALARY TO: " + erdem.getName()+" || REMAINING MONEY IS: $"+ MarmaraUniversity.getTotalMoneyEarned());

        System.out.println("-------------------------------------------------------------");
        System.out.println(sertan);
        System.out.println(oguz);
        System.out.println(cihan);

        System.out.println("--------------------------------------------------------------");
        System.out.println(metin);
        System.out.println(erdem);
        System.out.println(taha);
    }
}
