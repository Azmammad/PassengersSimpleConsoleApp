public class Operation {
    PassengerOperation ps  = new PassengerOperation();
    public void getAllProcess(int input) {
        switch (input) {
            case 1:
                ps.getRegisterPassenger();
                break;
            case 2:
                ps.getFindPassenger();
                break;
            case 3:
                ps.getPrintALLPassenger();
                break;
            case 4:
                ps.getUpdatePassenger();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Make the right choice");
        }
    }
}
