import java.util.Scanner;
public class contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeiro parâmetro: ");
        int parameter1=sc.nextInt();
        System.out.println("Segundo parâmetro: ");
        int parameter2= sc.nextInt();
        try{
            Counting(parameter1,parameter2);
        }
        catch (contadorException e){
            System.err.println("O segundo parâmetro é maior que o primeiro parâmetro fornecido. Troque!");
        }
        sc.close();
    }
    public static void Counting(int num1, int num2) throws contadorException{
        if (num1>num2){
            for (int i=1; i<=(num1-num2);i++){
                System.out.println("Número: "+i);
            }
        }
        else {
            throw new contadorException();
        }
    }
}
