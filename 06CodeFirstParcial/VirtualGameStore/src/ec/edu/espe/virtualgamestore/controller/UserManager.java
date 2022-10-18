package ec.edu.espe.virtualgamestore.controller;
//JavaMasters

import ec.edu.espe.virtualgamestore.model.Menu;
import ec.edu.espe.virtualgamestore.model.UserName;
import ec.espe.edu.filemanagerlibrary.FileManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class UserManager {

    Collection things;
    File file;

    FileWriter fileWriter;
    PrintWriter line;

    public void viewMenu() throws IOException {

        boolean cont = true;

        while (cont != false) {
            System.out.println("*****Welcome to the VirtualGameStores*****");
            System.out.println("--->Create Account<---");
            System.out.println("1.Register");
            System.out.println("2.Log in");
            System.out.println("3.Exit");

            Scanner option = new Scanner(System.in);
            System.out.println("Put the number of your option:");
            System.out.println("******");
            String val = option.nextLine();

            switch (val) {
                case "1":
                    createAccount();

                    break;
                case "2":
                    logIn();
                    break;

                case "3":
                    cont = false;
                    break;
                default:
                    System.out.println("Your option is incorrect. Try Again");
            }

        }

    }

    public void createAccount() throws IOException {

        things = new ArrayList();
        File file = new File("User.csv");

        if (!file.exists()) {
            try {

                file.createNewFile();

                fileWriter = new FileWriter(file, true);
                line = new PrintWriter(fileWriter);
                Scanner value = new Scanner(System.in);

                System.out.println("Put a new User:");
                String name = (value.nextLine());
                System.out.println("Put a Password:");
                String password = (value.nextLine());
                System.out.println("Put your Address:");
                String address = (value.nextLine());
                System.out.println("Put your Email:");
                String email = (value.nextLine());
                System.out.println("Put your Date of Birthday dd/mm/yy:");
                String dateOfBirth = (value.nextLine());
                System.out.println("Your account has been created "
                        + "successfully");
                UserName cons = new UserName(name, password, address,
                        email, dateOfBirth);
                things.add(cons);
                Object[] thingsArray = new Object[things.size()];

                thingsArray = things.toArray();
                line.println(thingsArray[things.size() - 1]);

                line.close();
                fileWriter.close();

            } catch (IOException ex) {

            }
        } else {
            try {

                fileWriter = new FileWriter(file, true);
                line = new PrintWriter(fileWriter);
                Scanner value = new Scanner(System.in);
                System.out.println("Put a new User:");
                String name = (value.nextLine());
                File f = new File("User.csv");

                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String Line;

                while ((Line = br.readLine()) != null) {
                    String[] contact = Line.split(";");
                    if (contact[0].equals(name)) {

                        System.out.println("Your User is already in use");
                        System.out.println("//Put other User Please//");

                        return;
                    }
                }
                System.out.println("Put a Password:");
                String password = (value.nextLine());
                System.out.println("Put your Address:");
                String address = (value.nextLine());
                System.out.println("Put your Email:");
                String email = (value.nextLine());
                System.out.println("Put your Date of Birthday dd/mm/yy:");
                String dateOfBirth = (value.nextLine());
                System.out.println("--Your account has been created "
                        + "successfully--");

                UserName cons = new UserName(name, password, address, email,
                        dateOfBirth);
                things.add(cons);
                Object[] thingsArray = new Object[things.size()];

                thingsArray = things.toArray();
                line.println(thingsArray[things.size() - 1]);

                line.close();
                fileWriter.close();

            } catch (IOException ex) {

            }

        }
    }

    public void logIn() throws IOException {
        Scanner data = new Scanner(System.in);
        System.out.println("Put your user please");
        String userName = data.nextLine();
        System.out.println("Put your password please");
        String password = data.nextLine();
        File f = new File("User.csv");
        if (f.exists()) {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String Line;
            while ((Line = br.readLine()) != null) {
                String[] contact = Line.split(";");
                if (contact[0].equals(userName) && contact[1].equals(password)) {

                    System.out.println("You have successfully logged in ");
                    System.out.println("Welcome " + userName);
                    Menu menu = new Menu();
                    menu.printMenu();

                }

            }
            System.out.println("Incorrect username or password");
        }
    }

}
