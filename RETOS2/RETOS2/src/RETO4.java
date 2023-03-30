import java.util.Scanner;

public class RETO4 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String[][] M;


     M = new String[3][3];
    
    
    System.out.println("Bienvenido A La Maquina");
    System.out.println();
    System.out.println("Como Utlizarla:");
    System.out.println("Coloque El Nombre Del Producto Y El Precio Despegado Con "+" _:_ ");
    System.out.println();
     for (int F = 0; F < 3; F++) {
                
            for (int C = 0; C < 3; C++) {

                System.out.println("Digite El Nombre Y El Precio Del Producto");
                M[F][C] = lectura.next();

            }

        }
       
        System.out.println();
        for (int j = 0; j < 3; j++) {
            System.out.println(" _______________________________________");
            System.out.print("|");
            for (int i = 0; i < 3; i++) {

                System.out.print(j+""+i+" "+M[j][i]);
                
                if (i != M[j].length - 1)
                
                    System.out.print("\t");
            }
            
            System.out.println(" | ");

        }
        System.out.println( " ________________________________________");
        lectura.close();
    }
}