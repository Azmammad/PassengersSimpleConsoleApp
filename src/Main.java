
public class Main {
    public static void main(String[] args) {
        Operation operation = new Operation();

        while (true) {
            int input = Util.getRequiredNumber("What do you want to do? " +
                    "\n1. Register " +
                    "\n2. Search Passenger " +
                    "\n3. Print" +
                    "\n4. Update passenger info " +
                    "\n0. Exit");
            operation.getAllProcess(input);
        }
    }
}