package zad1;

public class Main {
    public static void main(String[] args) {
        CompanyET companyET = new CompanyET(
                "Tech Solutions",
                "2020-05-12",
                "12345ABC67",
                "Ivan Ivanov",
                10000.00,
                15000.00
        );

        System.out.println("Име на фирмата: " + companyET.getName());
        System.out.println("Дата на създаване: " + companyET.getCreationDate());
        System.out.println("Булстат: " + companyET.getBulstat());
        System.out.println("Име на собственика: " + companyET.getOwnerName());
        System.out.println("Първоначален капитал: " + companyET.getInitialCapital());
        System.out.println("Актуален капитал: " + companyET.getCurrentCapital());

        double profit = companyET.calculateProfit();
        System.out.println("Печалба на фирмата: " + profit);
    }
}
