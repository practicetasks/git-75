package arrays.example_4.task;

public class Company {
    String name;
    Employee[] employees;

    void hire(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                employees[i].companyName = name;
                System.out.println("В кампанию " + name + " принят сотрудник с именем " + employee.name);
                return;
            }
        }
        System.out.println("В кампаний " + name + " нет места для '" + employee.name + "'");
    }

    void fire(String employeeName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].name.equals(employeeName)) {
                employees[i].companyName = null;
                employees[i] = null;
                System.out.println("Был уволен из кампаний '" + name + "' сотрудник с именем " + employeeName);
                return;
            }
        }
        System.out.println("Сотрудник с именем " + employeeName + " не найден");
    }

    void showEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.name);
            }
        }
    }

    Employee getYoungestEmployee() {
        Employee youngestEmployee = new Employee();
        youngestEmployee.age = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.age < youngestEmployee.age) {
                    youngestEmployee = employee;
                }
            }
        }
        return youngestEmployee;
    }
}
