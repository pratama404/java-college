import java.util.*;

public class House{
	public static void main(String[] args){
	Scanner scan = new Scanner (System.in);
	System.out.println("masukan harga rumah");
		int t = scan.nextInt();
        System.out.println("masukan tabungan awal rumah");
		int a = scan.nextInt();
        System.out.println("masukan jumlah tabungan berkala ");
		int b = scan.nextInt();
//loop, pengecekan, for
        int loop = ((t - a)/b);
        if ((t - a)%b!=0){
        loop++;
        System.out.println("kamu menabung selama "+loop+" x");
        System.out.print (a +" "); 
        }else{
        System.out.println("kamu menabung selama "+loop+" x");
        System.out.print (a +" "); 
        }
        for(int i=0;i<loop;i++){
        a=a+b;
        System.out.print(a +" ");	
        }
    }
}