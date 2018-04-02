import java.io.*;

class Equation
{
	private double a,b,c ;
	private double discrim;
	private double r1,r2;

public Equation(double aa,double bb,double cc)
	{
		a=aa;
		b=bb;
		c=cc;
		discrim=0;
		r1=0;
		r2=0;
	}
	
public void calcul_racines()
	{
		System.out.println("a = " + a + " b = " + b + " c = " + c);
		discrim = b*b - 4*a*c;
		if (discrim > 0)
		{
			r1=(-b + Math.sqrt(discrim)/(2*a));
			r2=(-b - Math.sqrt(discrim)/(2*a));
		}
		if (discrim == 0)
		{	
			r1=-b/(2*a);
			r2 = r1;
		}
	}
	
public void donne_resultat()
	{
		if (discrim>0)
			{
				System.out.println("racine1 = " + r1);
				System.out.println("racine2 = " + r2);
			}
		if (discrim == 0)
			{
				System.out.println("racine1 = racine2 = " + r1);
			}
		if (discrim < 0)
			{
				System.out.println("Pas de racine reelles");
				System.out.println("car le discriminant = " + discrim + " < 0 ");
			}
	}
}


public class Equat1
	{
		public static void main(String[] args)
			{
				Equation eq1 = new Equation (1,-5,6);
				eq1.calcul_racines();
				eq1.donne_resultat();
	
				System.out.println(" ");
	
				Equation eq2 = new Equation (1,-6,9);
				eq2.calcul_racines();
				eq2.donne_resultat();

				System.out.println(" ");
			
				Equation eq3 = new Equation (1,1,2);
				eq3.calcul_racines();
				eq3.donne_resultat();
			}
	}


