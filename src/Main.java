public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Employee("employee1", 1, 30000),
                new Employee("employee2", 2, 40000),
                new Employee("employee3", 3, 50000),
                new Employee("employee4", 4, 60000),
                new Employee("employee5", 5, 70000),
                new Employee("employee6", 5, 80000),
                new Employee("employee7", 4, 90000),
                new Employee("employee8", 3, 100000),
                new Employee("employee9", 2, 110000),
                new Employee("employee10", 1, 120000)
        };

        printAll(employees);

        System.out.println("Суммарная зарплата: " + getTotalSalary(employees));
        System.out.println("Сотрудник с минимальной зарплатой: " + getEmployeeWithMinSalary(employees));
        System.out.println("Сотрудник с максимальной зарплатой: " + getEmployeeWithMaxSalary(employees));
        System.out.println("Средняя зарплата: " + getAvgSalary(employees));
        printAllFullNames(employees);

    }

    public static void printAll(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }


    public static int getTotalSalary(Employee[] employees) {
        int result = 0;
        for (Employee e : employees) {
            result += e.getSalary();
        }
        return result;
    }

    public static Employee getEmployeeWithMinSalary(Employee[] employees) {
        Employee employeeWithMinSalary = employees[0];
        for (Employee e : employees) {
            if (e.getSalary()< employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = e;
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee getEmployeeWithMaxSalary(Employee[] employees) {
        Employee employeeWithMaxSalary = employees[0];
        for (Employee e : employees) {
            if (e.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = e;
            }
        }
        return employeeWithMaxSalary;
    }

    public static double getAvgSalary(Employee[] employees) {
        return  (double) getTotalSalary(employees) / employees.length;
    }

    public static void printAllFullNames(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e.getFullName());

        }

    }
}