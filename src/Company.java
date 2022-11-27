public class Company {
    private String name;
    private Employee[] employees;
    private int budget;
    private String headOfCompany;
    //Нужно добавить:
    //Бюджет холдинга
    //Руководителя компании
    public Company(String name) {
        this.name = name;
    }

    public Company(String name, Employee[] employees, int budget, String headOfCompany) {
        this.name = name;
        this.employees = employees;
        this.budget = budget;
        this.headOfCompany = headOfCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getHeadOfCompany() {
        return headOfCompany;
    }

    public void setHeadOfCompany(String headOfCompany) {
        this.headOfCompany = headOfCompany;
    }

    //Реализуйте поиск компании по наименованию
    public Employee getEmployeeByName(String name) {
        for (int i=0; i<employees.length; i++) {
            if (employees[i].getName().equals(name)) {
                System.out.println("Сотрудник по имени " + employees[i].getName() + " найден!");
            }
        }
        return null;
    }

    public void showCompanyInfo() {
        System.out.println("название " + this.getName());
        System.out.println("Бюджет " + this.getBudget());
        System.out.println("Глава " + this.getHeadOfCompany());
    }

    public void listOfEmployee() {
        for (int i=0; i<employees.length; i++) {
            System.out.println(employees[i].getName());
            System.out.println(employees[i].getSalary());
            System.out.println(employees[i].getPosition());
        }
        System.out.println();
    }

    public void showTotalSalary() {
        double sum = 0;
        for (int i=0; i<employees.length; i++) {
            sum += employees[i].getSalary();
        }
        System.out.println("Сумма зп компании: " + sum);
    }

    public void changeHeadOfCompany(String name) {
        if (this.headOfCompany != null) {
            this.headOfCompany = name;
        }
    }
}