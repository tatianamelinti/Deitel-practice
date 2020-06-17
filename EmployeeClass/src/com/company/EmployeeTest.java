package com.company;

public class EmployeeTest {

    public static void main(String[] args) {
	// write your code here
        Employee employee1 = new Employee("Ana","Popa",7000);
        Employee employee2 = new Employee("Maria","Marin",10000);
        System.out.println("Salariul anual al lui "+ employee1.getFirstName()+" "+employee1.getLastName()+
                " este " + employee1.getMonthlySalary()*12+ "  Salariul anual cu crestere de 10% este "+employee1.getMonthlySalary()*1.1*12);



        System.out.println("Salariul anual al lui "+ employee2.getFirstName()+" "+employee2.getLastName()
                + " este " + employee2.getMonthlySalary()*12+  "  Salariul anual cu crestere de 10% este "+employee2.getMonthlySalary()*1.1*12);

     }
}