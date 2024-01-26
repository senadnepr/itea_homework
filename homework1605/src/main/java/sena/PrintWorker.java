package sena;

import java.util.List;

/**
 * @author Sergej Chumakov on 26.01.2024
 */
public class PrintWorker {

    public void printAllEmployeeInformations(List<EmployeeInformation> allEmployeeInformations) {
        for (EmployeeInformation employeeInformation :allEmployeeInformations) {
            System.out.println(employeeInformation.getfName() + "\t\t" +
                    employeeInformation.getlName() + "\t\t" +
                    employeeInformation.getmName() + "\t\t" +
                    employeeInformation.getPhone() + "\t\t" +
                    employeeInformation.getAddress());
        }
        System.out.println();
    }

    public void printEmpoleyeeContacts(List<EmployeeInformation> empoleyeeContacts) {

        for (EmployeeInformation employeeInformation :empoleyeeContacts) {
            System.out.println(employeeInformation.getfName() + "\t\t" +
                    employeeInformation.getlName() + "\t\t" +
                    employeeInformation.getmName() + "\t\t" +
                    employeeInformation.getPhone() + "\t\t" +
                    employeeInformation.getBirthday());
        }
        System.out.println();
    }
}
