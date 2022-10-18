package ec.edu.espe.virtualgamestore.controller;

import ec.edu.espe.virtualgamestore.model.Menu;
import ec.espe.edu.filemanagerlibrary.FileManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Java MAsters
 */
public class PayManager {

    public void buyManager() throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("**Verify Data**");
        System.out.print("Enter username: ");
        String userName = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        File f = new File("User.csv");
        if (f.exists()) {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String Line;
            while ((Line = br.readLine()) != null) {
                String[] contact = Line.split(";");
                if (contact[0].equals(userName) && contact[1].equals(password)) {
                    searchItem();
                    return;
                }
            }
            System.out.println("Your User or Password are incorrect. "
                    + "Try Again");
            buyManager();
        }

    }

    public void searchItem() throws FileNotFoundException, IOException {
        int value = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        String id = scanner.nextLine();

        File f = new File("Items.csv");
        if (f.exists()) {
            FileReader fileReader = new FileReader(f);
            BufferedReader bufferRed = new BufferedReader(fileReader);
            String Line;
            while ((Line = bufferRed.readLine()) != null) {
                value = value + 1;
                String[] contact = Line.split(";");
                if (contact[0].equals("id:" + id)) {

                    System.out.println("Do you want to add this item "
                            + "to your cart?");
                    String line = Files.readAllLines(Paths.get("Items.csv"))
                            .get(value);
                    System.out.println(line);
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    String op = scanner.nextLine();
                    switch (op) {
                        case "1":

                            File file = new File("Cart.csv");
                            FileWriter fileWriter;
                            PrintWriter lineCar;
                            if (!file.exists()) {
                                try {

                                    file.createNewFile();

                                    fileWriter = new FileWriter(file, true);
                                    lineCar = new PrintWriter(fileWriter);
                                    lineCar.println(line);
                                    lineCar.close();
                                    fileWriter.close();
                                } catch (IOException ex) {

                                }
                            } else {
                                try {
                                    fileWriter = new FileWriter(file, true);
                                    lineCar = new PrintWriter(fileWriter);
                                    lineCar.println(line);
                                    lineCar.close();
                                    fileWriter.close();
                                } catch (IOException ex) {

                                }
                            }
                            confirmation();
                            break;

                        case "2":
                            confirmation();
                            break;
                        default:
                            System.out.println("Your option is incorrect."
                                    + " Try Again");
                            searchItem();
                    }

                }

            }

        }
        System.out.println("No item founded");
        confirmation();

    }

    public void confirmation() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***///CAR MENU///***");
        System.out.println("1.View articles in the cart");
        System.out.println("2.Buy more Items");
        System.out.println("3.Buy");
        System.out.println("4.Eliminate Cart");
        System.out.println("5.Return to the principal Menu");
        System.out.println("Enter you option: ");
        String op = scanner.nextLine();
        switch (op) {
            case "1":
                try {
                    FileReader fr = new FileReader("Cart.csv");
                    BufferedReader bufferedReader = new BufferedReader(fr);
                    String read;
                    while ((read = bufferedReader.readLine()) != null) {
                        System.out.println(read);

                    }
                } catch (FileNotFoundException ex) {
                    System.out.println("Error in read the file");
                }
                double totalCarPrice = 0.00F;
                File f = new File("Cart.csv");
                if (f.exists()) {
                    FileReader fr = new FileReader(f);
                    BufferedReader br = new BufferedReader(fr);
                    String Line;

                    while ((Line = br.readLine()) != null) {
                        String[] contact = Line.split(" ");

                        double doble = Double.parseDouble(contact[2]);

                        totalCarPrice = totalCarPrice + doble;

                    }
                    System.out.println("Total Price:$" + totalCarPrice);
                }
                confirmation();
                break;
            case "2":
                searchItem();
                break;
            case "3":

                System.out.print("Data of credit card\n");
                System.out.print("Enter the card number : ");
                String cardNumber = scanner.nextLine();

                System.out.print("Enter the date of expiry : ");
                String date = scanner.nextLine();

                System.out.print("Enter the card owner : ");
                String cardOwner = scanner.nextLine();

                System.out.print("Enter the security code : ");
                String code = scanner.nextLine();
                System.out.println("Successful purchase!!");
                System.out.println("Thanks for you payment");

                FileManager.deleteFile("Cart.csv");
                confirmation();

                scanner.nextLine();
                break;

            case "4":

                FileManager.deleteFile("Cart.csv");
                confirmation();
                break;

            case "5":
                Menu menu = new Menu();
                menu.printMenu();
                break;
            default:
                System.out.println("Your option is incorrect. Try Again");
                confirmation();

        }

    }
}
