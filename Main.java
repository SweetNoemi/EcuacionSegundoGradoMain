import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double discriminante, x1, x2;

        System.out.print("Ingrese a: ");
        a = sc.nextInt();

        System.out.print("Ingrese b: ");
        b = sc.nextInt();

        System.out.print("Ingrese c: ");
        c = sc.nextInt();

        if (a == 0) {
            System.out.println("No es una ecuacion de segundo grado porque a no puede ser 0.");
            return;
        }

        discriminante = (b * b) - (4 * a * c);

        if (discriminante > 0) {
        x1 = (-b + (int)Math.sqrt((b*b)-(4*a*c))) / (2*a);
        x2 = (-b - (int)Math.sqrt((b*b)-(4*a*c))) / (2*a);

        System.out.println("Dos raices reales diferentes:");
        System.out.println("Raiz 1: " + x1);
        System.out.println("Raiz 2: " + x2);
        } else if (discriminante == 0) {
            x1 = (-b) / (2.0 * a);

            System.out.println("Una raiz real doble:");
            System.out.println("Raiz: " + x1);
        } else{
            System.out.println("No existen raices reales.");
        }
}
}
