
package perkalianfunc;

import java.util.Scanner;

public class PerkalianFunc {

      static void perkalianFunc(){
        System.out.println("Perkalian");
        Scanner kali = new Scanner (System.in);
      
        System.out.print("Masukkan angka pertama : ");
        Integer  a = kali.nextInt();
        System.out.print("Masukkan angka kedua   : ");
        Integer b = kali.nextInt();  
        
        int c,i;
        c= 0;
        if (b < 0){
            for (i = 0;i < -b ;i++){
                c+= a;
                System.out.print(c+"a ");
            }
            System.out.println("");
            System.out.println("Hasil : " +-c);
        }else if (b > 0){
            for (i = 0;i < b;i++){
            c+= a;
            System.out.print(c+"s ");
            }
            System.out.println("");
            System.out.println("Hasil : " + c);
        }
           // System.out.println("");
           // System.out.println("Hasil : " + -c);
      }
        
    public static void main(String[] args) {
        
        perkalianFunc();
    }
}
        
     
      
    
    

