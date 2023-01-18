import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // compile-time => var
        Scanner input = new Scanner(System.in);
        System.out.print("Çalışanın adı soyadı :");
        var name = input.nextLine();

        System.out.print("Çalışanın maaşını giriniz :");
        var salary = input.nextDouble();

        System.out.print("Çalışanın haftalık çalışma saatini giriniz :");
        var workHours = input.nextInt();

        System.out.print("Çalışanın işe başlama yılı :");
        var hireYear = input.nextInt();

        var employee = new Employee(name,salary,workHours,hireYear);
        employee.printInfo();

    }
}