import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       



        // Clase Scanner que nos permte que el usuario escriba 

        Scanner scanner = new Scanner(System.in);
        
        // Declaraciones y Asignaciones 

        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0 ;
        boolean palabraAdivinada = false ; 

        // Arreglos

        char[] letrasaAdivinadas = new char[ palabraSecreta.length()]; 

        // Estructura de control: Interactiva (Bucle)

        for(int i = 0; i < letrasaAdivinadas.length; i++) {
            letrasaAdivinadas[i]= '_';
            
        }
         // Estructura de control: Interactiva (Bucle)


         while (!palabraAdivinada && intentos < intentosMaximos)  {
                                                           // esto se usa cuando tenemos una palabra de chars
              System.out.println("palabra a adivinar: " + String.valueOf(letrasaAdivinadas) + " (" +  palabraSecreta.length() + "letras)");

              //usamos scaner para pedir una letra

              System.out.println("Introduce una letra, por favor ");


              // por si ingresa una letra en mayuscula
              char letra = Character.toLowerCase(scanner.next().charAt(0));


               boolean letraCorrecta = false ;
               for (int i = 0; i < palabraSecreta.length(); i++){
                   //Estructura de control condiccional- recorre letra por letra
                  if (palabraSecreta.charAt(i)== letra){
                      letrasaAdivinadas [i]= letra;
                      letraCorrecta = true;
                }

            }
            
            if(!letraCorrecta){
                intentos++;
                System.out.println("¡Incorrecto!  Te quedan " + (intentosMaximos - intentos) + " intentos.");

            }
  
                                                 // la forma de decir si uno es igual a otro 
            if(String.valueOf(letrasaAdivinadas).equals(palabraSecreta) ){
              palabraAdivinada = true;
              System.out.println("Felicidades , has adivinado la palabra secreta: " + palabraSecreta);
        
            }

       


       
         }
           

         if(!palabraAdivinada){
            System.out.println( "¡que pena te has quedado sin intentos GAME OVER");


   
        }
        

        scanner.close();
    }

    }




