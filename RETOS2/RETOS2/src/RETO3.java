import java.util.Scanner;

public class RETO3 {
    public static void main(String[] args) {
        

        String[][] cal = new String[6][5];
        cal[0] = new String [] {" _","_","_","_"};
        cal[1] = new String [] {"|7","8","9","C|"};
        cal[2] = new String [] {"|4","5","6","/|"};
        cal[3] = new String [] {"|1","2","3","-|"};
        cal[4] = new String [] {"|0",".","=","+|"};
        cal[5] = new String [] {"¯¯","¯¯","¯¯"," "};
        Scanner lectura=new Scanner(System.in);
        System.out.println("Calculadora");

        for(int i=0; i < cal.length; i++) {
            
            for(int j=0; j < cal[i].length; j++) {
                
                System.out.print(" "+cal[i][j] +"");
            }
            System.out.println();
        }


        System.out.println("Gracias por usar este programa.");
        lectura.close();


        
    

    }
}