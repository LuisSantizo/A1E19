import java.util.Random;

public class A1E19 {

    public static void main(String[] args) {
        
        //definir variables
        int num;
        
        //definir numero aleatoreo
        Random Aleatoreo = new Random();
        num = Aleatoreo.nextInt(1000) + 1;
        
        //hacer condiciones para ver si el numero cumple con los requisitos
        if (num % 5 == 0 & num <= 25) {
            System.out.println("----------");
            System.out.println(" CORRECTO");
            System.out.println("----------");
        }
        else{
            System.out.println("Incorrecto");
        }
    }

}
