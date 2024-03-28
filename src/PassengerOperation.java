import javax.xml.namespace.QName;
import java.util.Scanner;

public class PassengerOperation {
    Scanner sc = new Scanner(System.in);

    public void getPrintArrayInfo(Passenger[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ". " + arr[i].getName() +
                    " " + arr[i].getSurname() + " " + arr[i].getAge());
        }
    }

    public void getRegisterPassenger() {
        int passengerCount = Util.getRequiredNumber("How many passengers");
        Config.passengers = new Passenger[passengerCount];
        for (int i = 0; i < passengerCount; i++) {
            Passenger passenger = new Passenger();
            System.out.println("Enter name,surname and age " + (i + 1) + "st passenger");
            passenger.setName(sc.next());
            passenger.setSurname(sc.next());
            passenger.setAge(sc.nextInt());
            Config.passengers[i] = passenger;
        }
        getPrintArrayInfo(Config.passengers);
    }

    public int getSearchedPassengerCount(String searchedText) {
        int count = 0;
        for (int i = 0; i < Config.passengers.length; i++) {
            if (Config.passengers[i].getName().contains(searchedText)
                    || Config.passengers[i].getSurname().contains(searchedText)) {
                count++;
            }
        }
        return count;
    }

    public void getFindPassenger() {
        String searchedText = Util.getRequiredText("Enter the name or surname of the passenger you are looking for");
        int searchedPassengerCount = getSearchedPassengerCount(searchedText);
        Passenger[] searchedPassenger = new Passenger[searchedPassengerCount];

        int index = 0;
        for (int i = 0; i < Config.passengers.length; i++) {
            if (Config.passengers[i].getName().contains(searchedText) || Config.passengers[i].getSurname().contains(searchedText)) {
                searchedPassenger[index++] = Config.passengers[i];
            }
        }

        for (int i = 0; i < searchedPassenger.length; i++) {
            System.out.println((i + 1) + ". " + searchedPassenger[i].getName() + " " +
                    searchedPassenger[i].getSurname() + " " + searchedPassenger[i].getAge());
        }
    }

    public void getPrintALLPassenger(){
        if (Config.passengers != null && Config.passengers.length > 0){
            System.out.println("List of registered passenger");
            for (int i=0;i<Config.passengers.length;i++){
                System.out.println("Passenger " + (i+1) + ". " + Config.passengers[i].getName()+
                        " " + Config.passengers[i].getSurname()+ " " + Config.passengers[i].getAge());
            }
        }
        else {
            System.out.println("There are no registered passengers");
        }
    }


    public void getUpdatePassenger(){
        getPrintALLPassenger();
        int input = Util.getRequiredNumber("Which passenger's information do you want to change?");
        System.out.println("Enter new information");
        Passenger updatedStudent = Config.passengers[input-1];
        String change = Util.getRequiredText("What do you want to change: name,surname,age ?");
        String[] changes = change.split(",");
        for (int i = 0; i<changes.length;i++){
            String c = changes[i];
            if(c.equalsIgnoreCase("name")){
                updatedStudent.setName(Util.getRequiredName());
            } else if (c.equalsIgnoreCase("surname")) {
                updatedStudent.setName(Util.getRequiredSurname());
            }else if (c.equalsIgnoreCase("age")){
                updatedStudent.setAge(Util.getRequiredAge());
            }

        }



    }

}
