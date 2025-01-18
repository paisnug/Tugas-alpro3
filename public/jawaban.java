package tutorial;

public class NestedLoop {
  
  public static void main(String[] args) {
    
   
    System.out.println("Output 1:");
    for (int baris = 1; baris <= 5; baris++) {  
      for (int kolom = 1; kolom <= baris; kolom++) { 
        System.out.print("* "); 
      }
      System.out.println(); 
    }

    
    System.out.println();

   
    System.out.println("Output 2:");
    for (int baris = 1; baris <= 5; baris++) { 
      for (int kolom = 1; kolom <= baris; kolom++) { 
        System.out.print(kolom + " "); 
      }
      System.out.println(); 
    }
  }
}
