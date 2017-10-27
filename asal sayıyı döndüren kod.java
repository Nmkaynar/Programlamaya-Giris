package asal.sayı.bulma;
public class AsalSayıBulma {
    public static void main(String[] args) {
   /*döngü long tipinin son sayısına kadar çalışır
        long tipinde en büyük sayı "9223372036854775807" dır:)
     */
        long i=2;
    do
    {    
     int x=0;   
        for(int k=2;k<i;k++)
        {
            if(i%k==0)
                 break;
            else 
            x+=1;     
        }
        if(x==i-2) 
            System.out.println(i+" asaldır");
         i++;       
                
   }while(i>0);   
  }
}

