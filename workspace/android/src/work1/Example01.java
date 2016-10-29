package work1;

public class Example01 {

    public static void main(String[] args) {

        int numbers[]= {10,8,4,3,2,1,9,7,6,5,0};

        Boss boss = new Boss();
        Employee employee = new Employee();

        boss.setArray(numbers);
        employee.setArray(numbers);

        boss.print();

        employee.print();
    }
}