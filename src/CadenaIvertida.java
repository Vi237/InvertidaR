import java.util.Scanner;
public class CadenaIvertida {

    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String cadena = sc.nextLine();
        sc.close();
        String invertida = invertirCadena(cadena);
        System.out.printf("Cadena introducida: %s%n", cadena);
        System.out.printf("Cadena invertida: %s", invertida);
    }

    private static String invertirCadena(String cadena){
        if(cadena.length()==1){
            return cadena;
        } else {
            return invertirCadena(cadena.substring(1)) + cadena.charAt(0);
        }
    }
}

