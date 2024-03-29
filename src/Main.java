import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write  amount of grades: ");
        int n = scanner.nextInt();
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;
        int gradeF = 0;
        System.out.println("Write your grades:");
        for(int i=1;i<=n;i++){
            int gradenumber = scanner.nextInt();

            if(gradenumber >= 90 && gradenumber <= 100){
                gradeA++;
            } else if (gradenumber >= 75 && gradenumber <= 89 ) {
                gradeB++;
            } else if (gradenumber >= 60 && gradenumber <= 74) {
                gradeC++;
            } else if (gradenumber >= 50 && gradenumber <=59) {
                gradeD++;
            } else if (gradenumber >= 0 && gradenumber <= 49) {
                gradeF++;
            }
        }

        int percentA = calculatePercentage(gradeA, n);
        int percentB = calculatePercentage(gradeB, n);
        int percentC = calculatePercentage(gradeC, n);
        int percentD = calculatePercentage(gradeD, n);
        int percentF = calculatePercentage(gradeF, n);

        if(gradeA == 1){
            System.out.println("A:" + gradeA + " grade "+" ("+percentA+"%)");
        }
        else {
            System.out.println("A:" + gradeA + " grades "+" (" + percentA + "%)");
        }
        if(gradeB == 1) {
            System.out.println("B:" + gradeB + " grade "+" ("+percentB+"%)");
        }
        else {
            System.out.println("B:" + gradeB + " grades "+" (" + percentB + "%)");
        }
        if(gradeC == 1) {
            System.out.println("C:" + gradeC + " grade "+" ("+percentC+"%)");
        }
        else {
            System.out.println("C:" + gradeC + " grades "+" (" + percentC + "%)");
        }
        if(gradeD == 1) {
            System.out.println("D:" + gradeD + " grade "+" ("+percentD+"%)");
        }
        else {
            System.out.println("D:" + gradeD + " grades "+" (" + percentD + "%)");
        }
        if(gradeF == 1){
            System.out.println("F:" + gradeF + " grade "+" ("+percentF+"%)");
        }
        else {
            System.out.println("F:" + gradeF + " grades "+" (" + percentF + "%)");
        }
    }

    public static int calculatePercentage(int grades, int amount) {
        int percent = (100*grades)/amount;
        return percent;
    }


}