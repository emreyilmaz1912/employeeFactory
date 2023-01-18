public class Employee {
    String name;
    private double salary;
    private int workHours;
    private int hireYear;
    private int bonus;
    private double tax;
    private double raiseSalary;

    public Employee(String name, double salary, int workHours, int hireYear) {
        System.out.println("===============================================");
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

        System.out.println("Çalışanın Adı Soyadı :" + this.name);
    }
    private void tax() {

        if (salary >= 1000) {
            tax = (raiseSalary + salary) * 0.03;
        } else {
            tax = 0;
        }
        System.out.println("Zamlı maaşınızdan kesilen vergi :" + tax + " TL");
    }
    private void bonus() {

        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
        } else {
            bonus = 0;
        }
        System.out.println("Haftalık fazla çalışmadan kazandınız bonus miktarı :" + bonus + " TL");
    }
    private void raiseSalary() {
        if ((2021 - hireYear) < 10) {
            raiseSalary = salary * 0.05;
        } else if ((2021 - hireYear) > 9 && (2021 - hireYear) < 20) {
            raiseSalary = salary * 0.10;
        } else
            raiseSalary = salary * 0.15;
        System.out.println("Maaşa eklenen zam :" + raiseSalary + " TL");
    }

    public void printInfo() {
        raiseSalary();
        tax();
        bonus();
        System.out.println("Alacağınız Toplam Maaş :" + ((salary + raiseSalary + bonus) - tax) + " TL");
    }
}
