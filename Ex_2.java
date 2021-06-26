package tp4;

import java.util.Scanner;
import java.lang.Math;

public class Ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Ex_2 e=new Ex_2();
		System.out.print(" Entrer la taille de vecteur n :");
		
		int k=sc.nextInt();
		 double [] n= new double[k];
		  for (int i = 0; i < k; i++) {
		        System.out.print("Entrez t["+i+"] :");
		        n[i] = sc.nextDouble();
		      }
		  
		  if(e.verifier_vecteur(n,k)) {
	    	   System.out.println("le vecteur est stochastique");
	       }else {
	    	   System.out.println("le vecteur n'est pas stochastique");
	       }
		  
		  System.out.println("-------------------------------------------------");
		System.out.print(" Entrer nombre de lignes et colones de matrice T :");
		int m=sc.nextInt();
		 double [][] t= new double[m][m];
		 
		 for (int i = 0; i < m; i++) {
		      for (int j = 0; j < m; j++) {
		    	 System.out.print("Entrez a["+i+"]["+j+"] : ");
		        t[i][j] = sc.nextDouble();
		      }
		      System.out.println("-------------------------------------------------");
		    }
		 
        
       if(e.verifier_matrice(t,m)) {
    	   System.out.print("la matrice est stochastique");
    	   t=e.matrice_pow(t, m);
       }else {
    	   System.out.print("la matrice n'est pas stochastique");
       }
       
       System.out.println("-------------------------------------------------");
       
       for (int i = 0; i <m; i++) {
    	      for (int j = 0; j < m; j++) {
    	        System.out.print(t[i][j] + "\t"  +"|");
    	      }
    	      System.out.println();
    	    }
       
   
         sc.close();
         
	}
	public boolean verifier_vecteur(double []a,int n) {
		double sum=0;
		for(int i=0;i<n;i++) {
			if(a[i]<0) return false;
			else
			sum+=a[i];	
		}
		if(sum==1)return true;
		else return false;
	}
	
	public boolean verifier_matrice(double [][]a,int n) {
		double tab[]=new double[n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
		        tab[j]=a[i][j];
			}
			verifier_vecteur(tab,n);
		}
		return true;
	}
	
	public  double [][] matrice_pow(double [][]a,int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]= Math.pow(a[i][j], n);
			}
		}
		return a;
	}

}
