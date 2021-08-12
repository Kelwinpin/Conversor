import java.util.Scanner;

public class Main{ 

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Conversor conversor = new Conversor();
        int op;
        float real = 300;

        System.out.println("Selecione uma opção abaixo:");
        System.out.println("<1> Dollar para Real");
        System.out.println("<2> Real para Dollar");
        System.out.println("<3> Euro para Real");
        System.out.println("<4> Real pra Euro");
        op = ler.nextInt();

        if(op == 1){
            System.out.println(conversor.converterdollar(real));
        }





        ler.close();
    }
}

