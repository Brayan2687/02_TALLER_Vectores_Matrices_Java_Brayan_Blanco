import java.util.Scanner;

public class RETO2 {
    public static void main(String[] args) {
        String nombre, palabra;
        char[] vector;
        int izquierda = 0, derecha;
        Scanner lectura = new Scanner(System.in);
        
            System.out.println("Bienvenido A palindromeda");
            System.out.print("Ingrese su nombre: ");
            nombre = lectura.nextLine();
            System.out.println("Por Favor Ingrese La Palabra Palindroma");
            palabra = lectura.next();
            /*
             * usamos la funcion toLoweCase para que el valor se devuelva en minusculas
             * la cadena que en este caso es palabra esta realizando la llamada
             */
            vector = palabra.toCharArray();
            /* Usamos el length para que podamos leer todos los valores */
            derecha = vector.length - 1;
            /*
             * hacemos uso de el ciclo while para asignarle la condicion que si izquierda es
             * menor que derecha abra un IF con otra condicion y sigamos con la condicional
             * hasta terminar con unos break para que el sistema se demore un segundo en
             * mostrar o madar a la otra condicion
             */
            while (izquierda < derecha) {
                
                if (vector[izquierda] == vector[derecha]) {
                    derecha--;
                    izquierda++;
                } else {
                    System.out.println(nombre + ", La Palabra " + palabra + " No Es Palindroma");
                    break;
                }
            }
            if (izquierda == derecha) {
                System.out.println(nombre + ", La Palabra " + palabra + " Es Una Palabra Palindroma ");
            }
            System.out.println("Gracias Por Utilizar Nuestro Sistema");
            lectura.close();
        
    }
}
