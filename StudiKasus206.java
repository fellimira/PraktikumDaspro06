import java.util.Scanner;
public class StudiKasus206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studentName;
        String activityType;
        int numberofDocuments;
        int winnerRank;
        int fundingStatus;
        int missingDocuments;
        System.out.print("Enter student name: ");
        studentName = sc.nextLine();
        System.out.print("Enter activity type (BELMAWA/BAKORMA/Mandiri/PKM/Others): ");
        activityType = sc.nextLine();
        if (activityType.equalsIgnoreCase("BELMAWA") || activityType.equalsIgnoreCase("BAKORMA") || activityType.equalsIgnoreCase("Mandiri")) {
            System.out.print("Enter number of documents: ");
            numberofDocuments = sc.nextInt();
            System.out.print("Enter winner rank: ");
            winnerRank = sc.nextInt();
            if (winnerRank >= 1 && winnerRank <= 3) {

                if (numberofDocuments == 4) {
                   System.out.println("Status: Eligible to receive award funds");
                } else {
                   missingDocuments = 4 - numberofDocuments;
                   System.out.println("Status: Documents are incomplete (" + missingDocuments + " documents are missing), Award funds are not given");
                }
            } else {
               System.out.println("Status: Does not receive award funds" + "(only 1st, 2nd, or 3rd place receives award funds).");
            }
        } else if (activityType.equalsIgnoreCase("PKM")) {
            System.out.print("Number of documents: ");
            numberofDocuments = sc.nextInt();
            System.out.print("PKM funding status (1 = funded, 0 = not funded): ");
            fundingStatus = sc.nextInt();
            if (fundingStatus == 1) {
                if (numberofDocuments == 4) {
                    System.out.println("Status: Eligible to receive award funds (PKM funds).");
                } else {
                    missingDocuments = 4 - numberofDocuments;
                    System.out.println("Status: Documents are incomplete (" + missingDocuments + " documents are missing), Award funds are not given");
                }
            } else {
                System.out.println("Status: Does not receive award funds (PKM is not funded).");
            }
        } else {
            System.out.println("Status: Does not receive award funds " + "(activity type is not covered by provision ).");
        }
        sc.close();
        }
    }

        