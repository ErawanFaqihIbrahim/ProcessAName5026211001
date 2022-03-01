import java.util.Scanner;

public class ProcessAName5026211001 {
    public static void main (String[] args){
        String fullName, lastName;
        int spaceId;

        Scanner scan = new Scanner(System.in);
        System.out.println("Type your full name: ");
        fullName = scan.nextLine();
        spaceId = fullName.indexOf(" ");
        lastName = fullName.substring(spaceId+1);
        System.out.println("Your name is: " +lastName+ ", " +fullName.charAt(0)+ ".");

    }
}
