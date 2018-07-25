/////////////////////////////////////////////////////////////////
//                 Project 3: Pakudex Project                  //
//                   By: Srecko Markovic                       //
/////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class PakuriProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int maxCap = 0;
        //Pakudex pakudex = new Pakudex(maxCap);
        int option = 0;
        int numPakuri = 0;
        boolean pakuriGame = true;
        boolean capProb = true;
        String showPakuri;

        System.out.println("Welcome to Pakudex: Tracker Extraordinaire!");
        while (capProb) {
            System.out.print("Enter max capacity of the Pakudex: ");

            try {
                maxCap = Integer.parseInt(scnr.next());
                capProb = false;
            } catch (Exception prob4) {
                System.out.println("Please enter a valid size.");
                maxCap = 0;
                capProb = true;
            }
            if (maxCap < 0) {
                System.out.println("Please enter a valid size.");
                capProb = true;
            }
        }
        System.out.println("The Pakudex can hold " + maxCap + " species of Pakuri.");
        System.out.println("\n");

        Pakudex pakudex = new Pakudex(maxCap);

            while (pakuriGame) {
                    if (pakuriGame) {
                        System.out.println("Pakudex Main Menu");
                        System.out.println("-----------------");
                        System.out.println("1. List Pakuri");
                        System.out.println("2. Show Pakuri");
                        System.out.println("3. Add Pakuri");
                        System.out.println("4. Evolve Pakuri");
                        System.out.println("5. Sort Pakuri");
                        System.out.println("6. Exit");
                        System.out.print("\n");
                        System.out.print("What would you like to do? ");
                        try {
                            option = scnr.nextInt();
                        }
                        catch (Exception badInputs) {
                            System.out.println("Unrecognized menu selection!");
                            //pakuriGame = true;
                            continue;
                    }

            //pakuriGame = true;
            //break;
        }
                //option = scnr.nextInt();

                if (option == 1) //List pakuri
                {
                    if (pakudex.getSize() == 0) {
                        System.out.println("No Pakuri in Pakudex yet!"); // in the other output in becomes In (capital i)
                        System.out.println("");
                    } else {
                        System.out.println("");
                        System.out.println("Pakuri In Pakudex:");
                        for (int i = 0; i < maxCap; i++) {
                            if (pakudex.getSpeciesArray()[i] == null)
                                break;
                            System.out.println((i + 1) + "." + pakudex.getSpeciesArray()[i]);
                            //System.out.println("");
                            pakuriGame = true;
                        }
                        System.out.println("");
                    }
                    //break;
                } else if (option == 2) {
                    System.out.print("Enter the name of the species to display: ");
                    showPakuri = scnr.next();
                    if (pakudex.getSize() == 0) {
                        System.out.println("Error: No such Pakuri!");
                    } else {
                        if (showPakuri.equals(showPakuri)) {
                            int[] statsPakuri = pakudex.getStats(showPakuri);
                            if (statsPakuri == null) {
                                System.out.println("Error: No such Pakuri!");
                            } else {
                                System.out.println("Species: " + showPakuri);
                                System.out.println("Attack: " + statsPakuri[0]);
                                System.out.println("Defense: " + statsPakuri[1]);
                                System.out.println("Speed: " + statsPakuri[2]);
                            }
                        }
                    }
                } else if (option == 3) {
                    System.out.print("Enter the name of the species to add: ");
                    showPakuri = scnr.next();
                    if (pakudex.addPakuri(showPakuri)) {
                        System.out.println("Pakuri species " + showPakuri + " successfully added!");
                        System.out.println("");
                    }
                } else if (option == 4) {
                    System.out.print("Enter the name of the species to evolve:");
                    showPakuri = scnr.next();
                    if (pakudex.evolveSpecies(showPakuri)) {
                        System.out.println(showPakuri + " has evolved");
                    }
                    //break;
                } else if (option == 5) {
                    try {
                        pakudex.sortPakuri();
                    } catch (Exception whereTheyAt) {
                        System.out.println("No Pakuri in Pakudex yet!");
                    }
                } else if (option == 6) {
                    System.out.println("Thanks for using Pakudex! Bye!");
                    break;
                } else {
                    System.out.println("Unrecognized menu selection!");
                }
            }

    }
}
