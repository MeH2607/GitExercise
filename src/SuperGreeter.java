import java.util.Scanner;

public class SuperGreeter {

    Scanner sc;
    public SuperGreeter(){
        sc = new Scanner(System.in);
    }

    public void start(){
        System.out.println("DET VIRKER YOOOOO!!!");
    }

    public void greet (){
        String navn;
        System.out.println("hvad hedder du: ");
        navn = sc.nextLine();
        System.out.println("Hej " + navn);
    }
}