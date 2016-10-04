/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;
public class ShellD {
    public static void ShellDou (double[] a) {
        int next=a.length/2;
        while(next>=1){
        for(int file=next;file<a.length;file++){
            double aux=a[file];
            int j=file-next;
            while(j>=0&&a[j]>aux){
                a[j+next]=a[j];
                j-=next;
            }
            a[j+next]=aux;
        }
        next/=2;
        }
    }

    public static void impri(double []a){
        String salidita="";
        for(int i=0;i<a.length;i++){
            if(a[i]<10)
                salidita+=" "+a[i]+" ";
            else
                salidita+=a[i]+" "; 
        }
        System.out.println(salidita); 
    }
    
    
       public static void main (String[] args) {
        double b[]={10.23, 23.10, 55.10, 55.001, 24.15, 24.5, 24.01, 18.0, 13.3, 10.23};
       
           ShellDou(b);
           impri(b);
        
       }

}
