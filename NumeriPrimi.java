import java.util.*;
class Numero_primo{  
    public static void main(String [] args){
      
      System.out.println("Il numero "+numero+" è primo? "+primo(numero));
    }
    
    public Numero_primo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci numero minore: ");
        int numeroMin = scan.next();
        System.out.println("inserisci numero MAGGIORE: ");
        int numeroMagg = 0;
        int primi = 0;
    }

    public static int sparaNumeri(int numeroMin, int numeroMagg){
        int primi = 0;    
        for (int i = numeroMin; i < numeroMagg; i++) {

            if (primo(i) == true) primi++;
            
        }
        return primi;
    }
    
    public static boolean primo(int n){  
      if (n<2)  
        return false;
      if (n<=3)  
        return true;
      if (n%2==0)
        return false;
      for (int i=3;i<n;i=i+2){ 
        if ( n%i==0)
          return false;   
      }
      return true;
    }
  }