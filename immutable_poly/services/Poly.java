package services;

/**
 * @author Khushal Rankawat
 */

public class Poly 
{
	 private int coefficient[];
	 private int degree;
	 
	 public Poly() {}
	 
	 /**
	 * @param coef -> array of polynomial's coefficients.
	 * @param deg -> Highest Degree Of Polynomial
	 */
	public Poly(int coef[],int deg)
	 {
		 coefficient=new int[coef.length];     // (deg+1)memory because we can also have constant in polynomial.
		 this.coefficient=coef;
		 this.degree=deg;
	 }
	 
	 /**
	 * @param value -> refers the value on which polynomial to be evaluate.
	 * @return -> returns the polynomial's calculated value.
	 */
	public float evaluate(float value)
	 {
		 float temp=0;
	       
		 int degree=this.degree();          // max degree of polynomial
		 
		 for(int i=0;i<this.coefficient.length;i++)
		 {
			 int tempDegree=degree;    // at current iteration eg: 4,3,2,1,0
			 // Calculating x^b or value^tempDegree
			 float pow=1;
			 while(tempDegree>0)
			 {
				 pow*=value;
				 tempDegree--;
			 }
			 temp+=coefficient[i]*pow;   // eg : 3x^4
			 degree--;               // Max. Degree to 0 calculation.
		 }
	     return temp;
	 }
	 
	 public int[] getCoefficient() 
	 {
		return coefficient;
	 }

	 /**
	 * @return -> returns the degree of the polynomial
	 */
	public int degree() 
	 {
		return degree;
	 }

	 /**
	 * @param p1 -> Polynomial 1
	 * @param p2 -> Polynomial 2
	 * @return -> returns the resultant polynomial
	 */
	public Poly addPoly(Poly p1,Poly p2)
	 {
		 int resultPolyDegree=Math.max(p1.degree(),p2.degree());
		 
		 int resultCoeffi[]=new int[resultPolyDegree+1];
		 
		 if(p1.degree()==p2.degree())
		 {
			 // sum of coefficients till degree p1 and p2
			 for(int i=0;i<p1.degree()+1;i++)
		    	 resultCoeffi[i]=p1.coefficient[i]+p2.coefficient[i]; 
		 }
		 else
		 if(p1.degree()<p2.degree())
		 {
			 int k=0,i=0;
			// filling p2's coeffiecients in result (of non-existing exponentials p1)
			 for(i=0;i<(p2.degree()-p1.degree());i++)
				 resultCoeffi[i]=p2.coefficient[i];
			 
			 k=i;
			 
			 for(i=0;i<p1.degree()+1;i++)
			 {
		    	 resultCoeffi[k]=p1.coefficient[i]+p2.coefficient[k];
		    	 k++;
			 }
		 }
		 else
		 if(p2.degree()<p1.degree())
		 {
			 int k=0,i=0;
			 // filling p1's coeffiecients in result (of non-existing exponentials p2)
			 for(i=0;i<(p1.degree()-p2.degree());i++)
				 resultCoeffi[i]=p1.coefficient[i];
			 
			 k=i;
			 
			 for(i=0;i<p2.degree()+1;i++)
			 {
		    	 resultCoeffi[k]=p2.coefficient[i]+p1.coefficient[k];
		    	 k++;
			 }
		 }
		 Poly result=new Poly(resultCoeffi,resultPolyDegree);
		 return result;
	 }

	/**
	 * @param p1 -> Polynomial 1
	 * @param p2 -> Polynomial 2
	 * @return -> returns the polynomial formed after the multiplication of p1 and p2
	 */
	
	 public Poly multiplyPoly(Poly p1,Poly p2)
	 {
		// len(p1)=deg+1  ,  len(p2)=deg+1  , when multiply result should be of len(p1)+len(p2)-1 
		int resultCoeffi[]=new int[p1.degree()+p2.degree()+1];
		
		// Initializes with 0
		for(int i=0;i<resultCoeffi.length;i++)
			resultCoeffi[i]=0;
		
		for(int i=0;i<p1.degree()+1;i++)
		{
			for(int j=0;j<p2.degree()+1;j++)
			{
				resultCoeffi[i+j]+=p1.getCoefficient()[i]*p2.getCoefficient()[j];
			}
		}
		
		Poly result=new Poly(resultCoeffi,resultCoeffi.length-1);
		return result; 
	 }
	 
	public void printPolynomial()
	 {
		 int degree=this.degree();
		 
		 for(int i=0;i<this.degree()+1;i++)
		 {
			 if(this.getCoefficient()[i]!=0 && degree!=-1)
			 {
				 if(degree!=0)
				 {
					 if(this.getCoefficient()[i]<0)
						 System.out.print(this.getCoefficient()[i]+"x^"+degree);
					 else
						 System.out.print("+"+this.getCoefficient()[i]+"x^"+degree);
				 }
				 else
				 {
					 if(this.getCoefficient()[i]<0)
						 System.out.print(this.getCoefficient()[i]);
					 else
						 System.out.print("+"+this.getCoefficient()[i]);
				 }
			 }
				 degree--;
		 }
	 }
}
