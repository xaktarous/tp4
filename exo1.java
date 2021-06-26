package rotp4;
import java.util.*;

public class exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exo1 d=new exo1();
	Scanner sc = new Scanner(System.in);
   
//lancer du de
    System.out.println("lance le de");
    int a= d.Lance_de();
	System.out.println(a);
	
	
  //Lancer le de n fois
	 System.out.println("lance le de n fois");
	    System.out.println("Entrer le nombre de lancé : ");
	    int n = sc.nextInt();
    d.Lance_de_n_fois(n);

    
   
     
    //le nombre d'appartition de la face 6
    System.out.println("le nombre d'appartition de la face 6");
    System.out.println("Entrer le nombre de lancé : ");
    int e = sc.nextInt();
    d.Nb_appartition(e);

    //le nombre de lancer avant d'obtenir le nombre 6
   d.Nb_lancer();
    
   
   //tirage d'une pièce de monnaie   
    System.out.println("Entrer le nombre de lancé:");
    int b=sc.nextInt();
    d.jet(b);
	}
//lancer du de	
public int Lance_de	()
{
	int de=1+(int) (Math.random()*6);
	return de;
}


//Lancer le de n fois
public void Lance_de_n_fois(int n) {
	    int de;
	    for(int i=0;i<n;i++)
	    {
	    	
	        System.out.println(de=1+(int) (Math.random()*6));
	        
	    }
}


//le nombre d'appartition de la face 6
public void Nb_appartition(int e)
{
	int de,x=0;
	
    for(int i=0;i<e;i++)
    {
    	
        System.out.println(de=1+(int) (Math.random()*6));
         if(de==6) x++;
    }
    System.out.println("le nombre d'apartition du nombre 6 est :"+x);
	
}


//le nombre de lancer avant d'obtenir le nombre 6
public void Nb_lancer()
{
	int de=0,m=0;
	 System.out.println("le nombre de lancer avant d'obtenir le nombre 6");
	    while(de!=6)
	    {
	    	
	    	de=1+(int) (Math.random()*6);
	    	if(de!=6) m++;
	    	System.out.println(de);
	    	
	    }
	    System.out.println("le nombre de lancers avant d'obtenir le nombre 6 est :"+m);
}


//tirage d'une pièce de monnaie

public void jet(int n)
{
	System.out.println("tirage d'une pièce de monnaie:");	
	
	for(int i=0;i<n;i++)
    {
    Random random = new Random();
    int pileOuFace = random.nextInt(2);
    if (pileOuFace == 0) {
        System.out.println("Pile");
    } else {
        System.out.println("Face");
    }
    }
}


}

