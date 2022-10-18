/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.virtualgamestore.model;

import ec.edu.espe.virtualgamestore.controller.AccessoryManager;
import ec.edu.espe.virtualgamestore.controller.ConsoleManager;
import ec.edu.espe.virtualgamestore.controller.GameManager;
import ec.edu.espe.virtualgamestore.controller.PayManager;
import ec.edu.espe.virtualgamestore.controller.ToyManager;
import ec.espe.edu.filemanagerlibrary.FileManager;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author JavaMasters
 */
public class Menu {

    Scanner option = new Scanner(System.in);
   

    public void printMenu() throws IOException {

        boolean cont = true;

        while (cont != false) {

            System.out.println("--->VirtualGameStore<---");
            System.out.println("1.For see the Consoles ");
            System.out.println("2.For see the Games ");
            System.out.println("3.For see the Toys ");
            System.out.println("4.For see the Accessories ");
            System.out.println("5.For buy the product");
            System.out.println("6.Exit");
            System.out.println("");
            System.out.println("");
            System.out.println("Enter you option: ");
            String value = option.nextLine();
            switch (value) {

                case "1":
                    ConsoleManager consoleManager = new ConsoleManager();
                    consoleManager.addConsole();
                    FileManager.readFile("console.csv");

                    break;
                case "2":
                    GameManager gameManager = new GameManager();
                    gameManager.addGame();
                    FileManager.readFile("games.csv");
                    break;
                case "3":
                    ToyManager toyManager = new ToyManager();
                    toyManager.addToy();
                    FileManager.readFile("toys.csv");
                    break;
                case "4":
                    AccessoryManager accessoryManager = new AccessoryManager();
                    accessoryManager.addAccessory();
                    FileManager.readFile("accessory.csv");
                    break;

                case "5":
                    PayManager buyManager = new PayManager();
                    buyManager.buyManager();

                    break;

                case "6":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Your option is incorrect. Try Again");

            }
        }

    }

}
