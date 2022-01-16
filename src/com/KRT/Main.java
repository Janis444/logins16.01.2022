package com.KRT;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Juana lietoāja reģistrācija
        System.out.println("Jauna lietotāja reģistrācija");
        System.out.println(""); //vienkārši smukumam

        // Vārda reģistrācija
        System.out.println("Ievadiet lietotāja vārdu:");
        String userNew = scan.nextLine();

        // Jaunas paroles reģistrācija
        System.out.println("ievadiet paroli:");
        String passNew = scan.nextLine();

        while (passNew.length()<8) {
            System.out.println("vismaz 8 simboli!");
            passNew = scan.next();}

        // jauna epasta reģistrācija
        System.out.println("ievadiet epastu:");
        String mailNew = scan.nextLine();
        System.out.println(""); //vienkārši smukumam

        System.out.println("Apsveicu ar veiksmīgu piereģistrēšanos!");
        System.out.println("Jūsu vārds ir " + userNew);
        System.out.println("Jūsu parole ir " +passNew);
        System.out.println("Jūsu epasts ir " + mailNew);
        System.out.println(""); //vienkārši smukumam

        // Log in
        System.out.println("Ievadiet lietotājvārdu:");
        String user = scan.nextLine();

        System.out.println("Ievadiet paroli:");
        String pass = scan.nextLine();

        if (userNew.equals(user) && passNew.equals(pass)){
            System.out.println("Labdien " + userNew);
        }
        else {
            System.out.println("Kautkas nogājis greizi, mēģiniet vēlreiz");
        }
    }
}
