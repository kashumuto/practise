public class Holding {
    private Company[] companies;
    public Holding() {
        companies = new Company[10];
    }
    public Holding(Company[] companies) {
        this.companies = companies;
    }
    public Company[] getCompanies() {
        return companies;
    }
    public void setCompanies(Company[] companies) {
        this.companies = companies;
    }
    public boolean addCompany(Company company) {
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] == null) {
                companies[i] = company;
                return true;
            }
        }
        return false;
    }
    public void showCompanies () {
        for (Company company: companies) {
            if (company != null) {
                System.out.println(company.getName());
            }
        }
    }
    //Реализуйте поиск компании по наименованию
    public Company getCompanyByName (String name) {
        for (int i=0;i<companies.length; i++) {
            if (companies[i].getName().equals(name)) {
                System.out.println("Компания с именем " + companies[i].getName() + " найдена!");
            }
        }
        return null;
    }

    public void getTotalBudget() {
        int sum = 0;
        for (int i=0; i<companies.length; i++) {
            if (companies[i] != null) {
                sum += companies[i].getBudget();
            }
        }
        System.out.println("Бюджет холдинга " + sum);
    }

    public void getNumberOfWorkersHolding() {
        int count = 0;
        for (int i=0; i<companies.length; i++) {
            for (int j=0; j<companies[i].getEmployees().length; j++) {
                if (companies[i].getEmployees()[j] != null) {
                    count += 1;
                }else if (companies[i].getEmployees()[j] == null) {
                    System.out.println("Это место вакантно!");
                }
            }

        }
        System.out.println("Общее количество рабочих в холдинге " + count);
    }

    public void removeCompany(Company company) {
        for (int i=0; i<companies.length; i++) {
            if (companies[i] != null){
                if (companies[i].equals(company)) {
                    companies[i] = null;
                }
            }
            return;
        }
    }
}
