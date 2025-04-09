import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al Juego de Adivinación");
        System.out.println("Adivina un número entre 1 y 100");

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe tu nombre!");
        String name = teclado.next();
        int secretNumber = new Random().nextInt(100);

        // System.out.println(secretNumber);
        System.out.println("Ingresa un número:");
        int userNumber = teclado.nextInt();

        int turnUsed = 1;
        int maxTurns = 5;

        boolean adivinado = false;

        while (turnUsed < maxTurns){

            //System.out.println( "Número de intentos: " + turnUsed);

            if(userNumber >  secretNumber){

                System.out.println("El número secreto es menor");
                System.out.println(" ");
                System.out.println("----------- nuevo turno -----------");
                turnUsed++;
                System.out.println("Ingresa un número:");
                userNumber = teclado.nextInt();

            }

            if (userNumber <  secretNumber) {

                System.out.println("El número secreto es mayor");
                System.out.println(" ");
                System.out.println("----------- nuevo turno -----------");
                turnUsed++;
                System.out.println("Ingresa un número:");
                userNumber = teclado.nextInt();

            }

            if (userNumber ==  secretNumber){

                System.out.println(" ");
                System.out.println("Felicidades " + name + " GANASTE el juego");
                System.out.println("Número de intentos: " + turnUsed);
                adivinado = true;
                break;

            }


            }

        if(!adivinado){
            System.out.println("Lo siento, " + name + ", has excedido el número máximo de intentos");
            System.out.println("Número de intentos: " + turnUsed  + ", Número Secreto: " + secretNumber);
            }
        }
    }
