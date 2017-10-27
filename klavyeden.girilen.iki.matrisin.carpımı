package klavyeden.girilen.iki.matrisin.carpımı;
import java.util.Scanner;

public class KlavyedenGirilenIkiMatrisinCarpımı {

  
    public static void main(String[] args) {
     System.out.println("matris tiplerini giriniz");
      Scanner q=new Scanner(System.in);  
      Scanner w=new Scanner(System.in);  
      Scanner ü=new Scanner(System.in);  
      Scanner e=new Scanner(System.in);  
      int r=q.nextInt(),t=w.nextInt(),y=e.nextInt(),ğ=ü.nextInt();
      if (ğ!=t)
    System.out.println("çarpma işlemi geçersizdir sebebi "+t+", "+ğ+" ye eşit değildir");
      else
      { int c=0 ;
      int a[][]=new  int[r][t];
      int b[][]=new  int[t][y];
      int h[][]= new  int[r][y];
    
       for(int i=0;i<r;i++)
    {
        for(int j=0;j<t;j++)
        {
            System.out.println("1. matrisin "+i+j+" indisli elemanını giriniz");
            Scanner l=new Scanner(System.in);  
            a[i][j]=l.nextInt();
        }
        }
      
        for(int i=0;i<t;i++)
    {
        for(int j=0;j<y;j++)
        {
            System.out.println("2. matrisin "+i+j+" indisli elemanını giriniz");
            Scanner k=new Scanner(System.in);  
            b[i][j]=k.nextInt();
        }
        }

    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {  
            for (int k=0;k<3;k++)
            { 
                c=c+a[i][k]*b[k][j];
                
            }
            h[i][j]=c;
            c=0;
        }
    }
    
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
              System.out.print(h[i][j]+"      ");
        }
    System.out.println("");
    }

      }
    }
    
}
