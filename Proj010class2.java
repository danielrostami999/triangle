import java.util.*;

public class Proj010class2 {

  
    public static void main(String[] args) {
        while(true){
        System.out.println("first triangle:");
        Triangle T1 = new Triangle(-3, 4);
        T1.PrintInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("wana continue?[y\n]");
        String answer = scanner.nextLine().toLowerCase();
        if (answer.equals("n")){
        System.out.println("thank you!");
        break;
        }
        else if (answer.equals("y")){
        System.out.println("--------------");
        System.out.println("secend triangle:");
        Triangle T2 = new Triangle(5, 8);
        T2.PrintInfo();
        }
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("wana continue?[y\n]");
        String answer2 = scanner.nextLine().toLowerCase();
        if (answer2.equals("n")){
        System.out.println("thank you!");
        break;
        }
        else if (answer.equals("y")){
        System.out.println("--------------");
        System.out.println("therd triangle:");
        Triangle T3 = new Triangle(2, 6);
        T3.PrintInfo();
        }
        System.out.println("--------------");
        break;
    }
    }
}