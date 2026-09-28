import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        // user information
        System.out.println("======= CUSTOMER INFORMATION =======");
        User currentUser = new User("", 0.0, 0.0);
            
        String userName;
        while (true) {
            System.out.print("Enter user's name: ");
            userName = sc.nextLine().trim();
            if (userName.isEmpty()){
                System.out.println("User's name is empty. Please try again.\n");
            } else {
                break;
            }
        }
        currentUser.setUserName(userName);

        double balanceAmount = 0;
        while (true) {
            System.out.print("What is your starting balance: ");
            if (sc.hasNextDouble()){
                balanceAmount = sc.nextDouble();
                sc.nextLine();
                if (balanceAmount < 0){
                    System.out.println("Balance amount cannot be negative. Please try again.\n");
                } else {
                    break;
                }      
            } else {
                System.out.println("Invalid amount. Please try again.\n");
                sc.nextLine();
            }
        }
        currentUser.setBalance(balanceAmount);

        String plateNumber;
        while (true){
            System.out.print("Enter the vehicle plate number: ");
            plateNumber = sc.nextLine().trim();
            if (plateNumber.isEmpty()){
                System.out.println("Vechile plate number is empty. Please try again.\n");
            } else {
                break;
            }
        }

        System.out.println("\n======= VEHICLE INFORMATION =======");

        Vehicle vehicle = null;
        while (vehicle == null ){
            System.out.println("What is the vehicle type?");
            System.out.println("1. Motorcycle");
            System.out.println("2. Car");
            System.out.println("3. Bus");
            System.out.println("4. Truck");
            System.out.print("Enter Choice: ");
            String vehicleType = sc.nextLine().trim();

            if (vehicleType.equalsIgnoreCase("1")){
                System.out.println("\n======= MOTORCYCLE =======");
                int engineCC = 0;
                while (true){
                    System.out.print("Enter engine CC (400-1000): ");
                    if (sc.hasNextInt()){
                        engineCC = sc.nextInt();
                        sc.nextLine();
                        if (engineCC < 400 || engineCC > 1000) {
                            System.out.println("Engine CC must be between 400 and 1000. Please try again.\n");
                        } else {
                            break;
                        }
                    } else { 
                        System.out.println("Enter the valid motor engine cc. Please try again.\n");
                        sc.nextLine();
                    }
                }
                vehicle = new Motorcycle(plateNumber, "Motorcycle", engineCC);
            } else if (vehicleType.equalsIgnoreCase("2")) {
                System.out.println("\n======= CAR =======");
                String carModel = "";
                while (true) {
                    System.out.println("Enter car model:");
                    System.out.println("1. Sedan");
                    System.out.println("2. SUV");
                    System.out.println("3. Sport");
                    System.out.print("Enter Choice: ");

                    if (sc.hasNextInt()){
                        int modelChoice = sc.nextInt();
                        sc.nextLine();

                        if (modelChoice == 1){
                            carModel = "Sedan";
                            break;
                        } else if (modelChoice == 2) {
                            carModel = "SUV";
                            break;
                        } else if (modelChoice == 3) {
                            carModel = "Sport";
                            break;
                        } else {
                            System.out.println("Enter a number from the choices. Please try again.\n");
                        }
                    } else {
                        System.out.println("Invalid car model. Please try again.\n");
                        sc.nextLine();
                    }
                }
                vehicle = new Car(plateNumber, "Car", carModel);
            } else if (vehicleType.equalsIgnoreCase("3")) {
                System.out.println("\n======= BUS =======");
                String serviceType;
                while (true) {
                    System.out.println("Enter service type:");
                    System.out.println("1. Private");
                    System.out.println("2. Public");
                    System.out.print("Enter Choice: ");

                    if (sc.hasNextInt()){
                        int serviceChoice = sc.nextInt();
                        sc.nextLine();

                        if (serviceChoice == 1){
                            serviceType = "Private";
                            break;
                        } else if (serviceChoice == 2) {
                            serviceType = "Public";
                            break;
                        } else {
                            System.out.println("Enter a number from the choices. Please try again.\n");
                        }
                    } else {
                        System.out.println("Select valid service type. Please try again.\n");
                        sc.nextLine();
                    }
                }
                String comfortClass = "";
                while (true) {
                    System.out.println("\nEnter comfort class:");
                    System.out.println("1. Economy");
                    System.out.println("2. Business");
                    System.out.print("Choice: ");

                    if (sc.hasNextInt()){
                        int comfortChoice = sc.nextInt();
                        sc.nextLine();
                        if (comfortChoice == 1){
                            comfortClass = "Economy";
                            break;
                        } else if (comfortChoice == 2) {
                            comfortClass = "Business";
                            break;
                        } else {
                            System.out.println("Enter a number from the choices. Please try again.\n");
                        }
                    } else {
                        System.out.println("Select valid comfort class. Please try again.\n");
                        sc.nextLine();
                    }     
                }
                vehicle = new Bus(plateNumber, "Bus", serviceType, comfortClass);
            } else if (vehicleType.equalsIgnoreCase("4")) {
                System.out.println("\n======= TRUCK =======");
                int numberOfAxles;
                while (true) {
                    System.out.print("Enter the number of axles: ");
                    if (sc.hasNextInt()){
                        numberOfAxles = sc.nextInt();
                        sc.nextLine();
                        if (numberOfAxles <= 0) {
                            System.out.println("Number of axles cannot be below or equal to zero. Please try again.\n");
                        } else {
                            break;
                        }
                    } else {
                        System.out.println("Enter the valid number of axle. Please try again.n\n");
                        sc.nextLine();
                    }
                }
                double cargoWeight;
                while (true) {
                    System.out.print("Enter the cargo weight(Kg): ");
                    if (sc.hasNextDouble()){
                        cargoWeight = sc.nextDouble();
                        sc.nextLine();
                        if (cargoWeight < 0) {
                            System.out.println("Cargo weigh cannot be below zero. Please try again.\n");
                        } else {
                            break;
                        }
                    } else {
                        System.out.println("Enter the valid cargo wieght. Please try again.\n");
                        sc.nextLine();
                    }
                }
                vehicle = new Truck(plateNumber, "Truck", numberOfAxles, cargoWeight);
            } else {
                System.out.println("Choice from the choices 1-4. Please try again.\n");
            }
        }

            System.out.println("\n======= ENTRY AND EXIT POINT =======");
            String entryPoint = "";
            while (true) {
                System.out.println("Enter the vehicle entry point:");
                System.out.println("1. Tarlac");
                System.out.println("2. Pampanga");
                System.out.println("3. Nueva Ecija");
                System.out.print("Choice: ");
                String entryChoice = sc.nextLine().trim();

                if (entryChoice.equals("1")){
                    entryPoint = "Tarlac";
                    break;
                } else if (entryChoice.equals("2")){
                    entryPoint = "Pampanga";
                    break;
                } else if (entryChoice.equals("3")){
                    entryPoint = "Nueva Ecija";
                    break;
                } else {
                    System.out.println("Choice from the choices 1-3. Please try again.\n");
                }
            }

            // exit point
            String exitPoint ="";
            while (true) {
                System.out.println("\nEnter the vehicle exit point:");
                System.out.println("1. Tarlac");
                System.out.println("2. Pampanga");
                System.out.println("3. Nueva Ecija");
                System.out.print("Choice: ");
                String exitChoice = sc.nextLine().trim();

                if (exitChoice.equals("1")){
                    exitPoint = "Tarlac";
                } else if (exitChoice.equals("2")){
                    exitPoint = "Pampanga";
                } else if (exitChoice.equals("3")){
                    exitPoint = "Nueva Ecija";
                } else {
                    System.out.println("Choice from the choices 1-3. Please try again.\n");
                    continue;
                }

                if (exitPoint.equalsIgnoreCase(entryPoint)){
                    System.out.println("Entry and exit point cannot be the same. Please try again.\n");
                } else {
                    break;
                }
            }
            Destination dest = new Destination(entryPoint, exitPoint);

            Lane assignedLane = new Lane(vehicle);
            double vehicleToll = vehicle.computeToll();
            double destinationFare = dest.computeFare();
            Transaction txn = new Transaction("ITXPRS-10001", vehicleToll, destinationFare);

            System.out.println();
            System.out.println("\n======= TOLL BREAKDOWN =======");
            System.out.println("Vehicle toll    : PHP " + vehicleToll);
            System.out.println("Destination fare: PHP " + destinationFare);
            System.out.println("TOTAL           : PHP " + txn.getTotalAmount());
            System.out.println("Lane assigned   : " + assignedLane.getLaneCode());

            while (!currentUser.canPay(txn.getTotalAmount())) {
                System.out.println();
                System.out.println("Insufficient balance! Current balance: PHP " + currentUser.getBalance());
                System.out.print("Enter top-up amount (0 to cancel): ");
                if (sc.hasNextDouble()){
                    double topUp = sc.nextDouble();
                    sc.nextLine();

                    if (topUp <= 0) {
                        System.out.println("Transaction cancelled.\n");
                        sc.close();
                        return;
                    }

                    currentUser.topUp(topUp);
                    System.out.println("New balance: PHP " + currentUser.getBalance());
                } else {
                    System.out.println("Invalid amount. Please try again.\n");
                    sc.nextLine();
                }
                
            } 

            currentUser.pay(txn.getTotalAmount());
            txn.setPaymentAmount(txn.getTotalAmount());
            txn.setChange(currentUser.getBalance());

            // receipt
            Receipt rcpt = new Receipt("RCPT-001");

            System.out.println();
            System.out.println("\n======= RECEIPT =======");
            System.out.println("Receipt ID     : " + rcpt.getReceiptID());
            System.out.println("Username       : " + currentUser.getUserName());
            System.out.println("Plate Number   : " + vehicle.getPlateNumber());
            System.out.println("Vehicle Type   : " + vehicle.getVehicleType());
            System.out.println("Lane Code      : " + assignedLane.getLaneCode());
            System.out.println("Transaction ID : " + txn.getTransactionID());
            System.out.println("Total Amount   : PHP " + txn.getTotalAmount());
            System.out.println("Remaining Bal. : PHP " + currentUser.getBalance());
            System.out.println("=======================");
            System.out.println("\nThe gate is now open. Have a safe trip!");

            sc.close();
    }
}
        