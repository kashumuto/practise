import java.util.Scanner;

public class CompanyMenu {
    public static void start(Company company) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Меню для работы с компанией: ");
            System.out.println("1) Вывод информацию о компании");
            System.out.println("2) Вывод списока сотрудников компании");
            System.out.println("3) Вывод общих расходов на зарплаты сотрудников");
            System.out.println("4) Добавление сотрудника в компанию");
            System.out.println("5) Удаление сотрудника из компании");
            System.out.println("5) Поменять руководителя компании");
            System.out.println("6) Меню для работы с сотрудниками");
            System.out.println("0) Выход из главного меню");
            int command = in.nextInt();
            if (command == 1) {
                //Реализуйте вывод информации об этой компании (кроме списка сотрудников)
                company.showCompanyInfo();
            } else if (command == 2) {
                //Реализуйте вывод списка сотрудников этой компании
                company.listOfEmployee();
            } else if (command == 3) {
                //Реализуйте подсчет всех зароботных плат сотрудников
                company.showTotalSalary();
            } else if (command == 4) {
                //Реализуйте добавление компании в холдинг
            } else if (command == 5) {
                //Реализуйте удаление компании из холдинга
            } else if (command == 6) {
                //Реализуйте смену руководителя компании
                company.changeHeadOfCompany(null);
            } else if (command == 7) {
                String employeeName = in.nextLine();
                //Реализуйте поиск сотрудника по имени
                //P.S. метод getEmployeeByName() пустой нужно его заполнить
                Employee foundedEmployee = company.getEmployeeByName(employeeName);
                EmployeeMenu.start(foundedEmployee);
            } else if (command == 0) {
                break;
            } else {
                System.out.println("Ошибка! Введите пункт из меню");
            }
        }
    }
}
