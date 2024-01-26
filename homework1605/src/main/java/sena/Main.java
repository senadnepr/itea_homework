package sena;

import java.util.List;

/**
 * @author Sergej Chumakov on 25.01.2024
 */
public class Main {

    public static void main(String[] args) {
        DBWorker worker = new DBWorker();
        List<EmployeeInformation> allEmployeeInformations = worker.getAllEmployeeInformation();
        List<EmployeeInformation> singleEmpoleyeeContacts = worker.getSingleEmpoleyeeContacts();
        List<EmployeeInformation> employeeInformationsOnPosition = worker.getEmpoleyeeContactsOnPosition("менеджер");

        PrintWorker printWorker = new PrintWorker();
        System.out.println("Контактні дані співробітників (номери телефонів, місце проживання)");
        printWorker.printAllEmployeeInformations(allEmployeeInformations);

        System.out.println("Інформація про дату народження всіх неодружених співробітників та їхні номери");
        printWorker.printEmpoleyeeContacts(singleEmpoleyeeContacts);

        System.out.println("Інформація про всіх менеджерів компанії: дати народження та номери телефонів");
        printWorker.printEmpoleyeeContacts(employeeInformationsOnPosition);
    }
}
