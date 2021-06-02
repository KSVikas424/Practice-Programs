package arrays;
import java.util.Scanner;
public class Main {
	 public static void main(String args[]){
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int q = scan.nextInt();
	        int[] r = new int[n/3];
	        int[] b = new int[n/3];
	        int[] g = new int[n/3];
	        int[] qr = new int[q/3];
	        int[] qb = new int[q/3];
	        int[] qg = new int[q/3];
	        int rind=0,bind=0, gind=0, qrind=0, qbind=0,qgind=0;
	        for(int i=0;i<n*3;i++){
	            if(i%3 == 0){
	                r[rind]=scan.nextInt();
	            }
	            else if(i%2 == 0){
	                b[bind]=scan.nextInt();
	            }
	            else {
	                g[gind]=scan.nextInt();
	            }
	        }
	        for(int i=0;i<r.length;i++) {
	        	System.out.print(r[i]);
	        }
	        System.out.println();
	        for(int i=0;i<r.length;i++) {
	        	System.out.print(b[i]);
	        }
	        System.out.println();
	        for(int i=0;i<r.length;i++) {
	        	System.out.print(g[i]);
	        }
	        System.out.println();

	        for(int i=0;i<q*3;i++){
	            if(i%3 == 0){
	                qr[qrind]=scan.nextInt();
	            }
	            else if(i%2 == 0){
	                qb[qbind]=scan.nextInt();
	            }
	            else {
	                qg[qgind]=scan.nextInt();
	            }
	        }
	        scan.close();
	        boolean qrb=false,qbb=false, qgb=false;
	        for(int i=0;i<q/3;i++){
	            for(int j=0;j<r.length;j++) {
	            	if(qr[j] == r[i]) {
	            		qrb=true;
	            	}
	            	if(qb[j] == b[i]) {
	            		qbb=true;
	            	}
	            	if(qg[j] == g[i]) {
	            		qgb=true;
	            	}
	            }
	            if(qrb && qbb && qgb) {
	            	System.out.println("YES");
	            }
	            else {
	            	System.out.println("NO");
	            }
	        }
	        
	    }
	}