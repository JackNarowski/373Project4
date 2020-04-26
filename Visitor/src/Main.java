import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //Set up
        ArrayList partTimeEmployees = new ArrayList();
        ArrayList fullTimeEmployees = new ArrayList();

        PartTime partTime1 = new PartTime();
        partTime1.setName("John");
        partTimeEmployees.add(partTime1);

        PartTime partTime2 = new PartTime();
        partTime2.setName("Linda");
        partTimeEmployees.add(partTime2);

        FullTime fullTime1 = new FullTime();
        fullTime1.setName("Timothy");
        fullTimeEmployees.add(fullTime1);

        FullTime fullTime2 = new FullTime();
        fullTime2.setName("Stacey");
        fullTimeEmployees.add(fullTime2);


        //Run the check in method a few times to simulate multiple visits
        Train train = new Train();
        fullTimeEmployees.forEach((employee) -> train.visit((FullTime) employee));
        partTimeEmployees.forEach((employee) -> train.visit((PartTime) employee));

        Pay pay = new Pay();
        fullTimeEmployees.forEach((employee) -> pay.visit((FullTime) employee));
        partTimeEmployees.forEach((employee) -> pay.visit((PartTime) employee));

    }
}
