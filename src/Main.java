import java.util.Arrays;
public class Main {

    public static void printEmployee(Employee[] employee) {
        System.out.println("Имеющаяся информация по сотрудникам:");
        for (int i = 0; i < employee.length; i++) {
            if (i == employee.length - 1) {
                System.out.println(employee[i]);
                break;
            }
            System.out.print(employee[i]);
            System.out.println();
        }
    }

    public static void calculateTotalMonthSalary(Employee[] employee) {
        int sum = 0;
        for (Employee employee1 : employee) {
            sum += employee1.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + sum);
    }

    public static void findEmployeeWithMinSalary(Employee[] employee) {
        Employee employeeWithMinSalary = employee[0];
        int salary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < salary) {
                employeeWithMinSalary = employee[i];
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в месяц -- " + employeeWithMinSalary);
    }

    public static void findEmployeeWithMaxSalary(Employee[] employee) {
        Employee employeeWithMaxSalary = employee[0];
        int salary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employeeWithMaxSalary.getSalary() < employee[i].getSalary()) {
                employeeWithMaxSalary = employee[i];
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой в месяц -- " + employeeWithMaxSalary);
    }

    public static void calculateAverageMonthSalary(Employee[] employee) {
        double sum = 0;
        for (Employee employee1 : employee) {
            sum += employee1.getSalary();
        }
        System.out.printf("Средняя зарплата в месяц: %.2f ", sum / employee.length);
        System.out.println();
    }

    public static void printFullNameAll(Employee[] employee) {
        System.out.println("Ф.И.О. всех сотрудников: ");
        for (Employee employee1 : employee) {
            System.out.println(" " + employee1.getFirstName() + " " + employee1.getMiddleName() + " " + employee1.getLastName());
        }
    }

    public static void main(String[] args) {

        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Левитан", "Исаак", "Ильич", 1, 100_248);
        employee[1] = new Employee("Гоголь", "Николай", "Васильевич", 2, 150_345);
        employee[2] = new Employee("Серов", "Валентин", "Александрович", 1, 100_890);
        employee[3] = new Employee("Дойл", "Артур", "Конан", 2, 150_000);
        employee[4] = new Employee("Королев", "Сергей", "Павлович", 3, 150_500);
        employee[5] = new Employee("Циолковский", "Эдуард", "Константинович", 3, 150_599);
        employee[6] = new Employee("Гамов", "Георгий", "Антонович", 4, 140_650);
        employee[7] = new Employee("Ландау", "Лев", "Давидович", 4, 140_651);
        employee[8] = new Employee("Менделеев", "Дмитрий", "Иванович", 5, 130_700);
        employee[9] = new Employee("Виткевич", "Виктор", "Витольдович", 5, 130_766);

        printEmployee(employee);
        System.out.println();

        calculateTotalMonthSalary(employee);

        calculateAverageMonthSalary(employee);

        findEmployeeWithMinSalary(employee);

        findEmployeeWithMaxSalary(employee);
        System.out.println();

        printFullNameAll(employee);

    }
}

//     8. Создать статические методы, которые будут взаимодействовать с массивом и предоставлять результат:
//        4.	Найти сотрудника с максимальной зарплатой.
//        6.	Получить Ф. И. О. всех сотрудников (вывести в консоль).
