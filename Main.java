import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Quel est votre prénom?");
        String prenom = scanner.nextLine();

        System.out.println("Quel est votre nom?");
        String nom = scanner.nextLine();

        System.out.println("Quel est votre année de naissance?");
        int anneeDeNaiss = scanner.nextInt();

        Person personne1 = new Person(prenom, nom, anneeDeNaiss);
        personne1.computeAge(2023);
        personne1.display();



    }
}