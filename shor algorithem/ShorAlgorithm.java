public class ShorAlgorithm {
 
 //----------------------------------------   
      static int findgcd(int a, int N)
{
    if (N == 0)
        return a;
    else 
        return findgcd(N, a%N);
}//a-----------------------------------
      static int gcd(int a, int b) 
	{ 
		if (a == 0) 
			return b; 
		return gcd(b % a, a); 
	} 

 
	// Euler Totient Function 
	static int phi(int n) 
	{ 
		int result = 1; 
		for (int i = 2; i < n; i++) 
			if (gcd(i, n) == 1)  
				result++; 
		return result; 
	} 
    
    
    public static void main(String[] args) {
       //----------------- 
        int N=15;
         int a=7; 
       //-------------------
         int s=a;
         int a1,a2;
        int r,i,phi;
         int temp;
        int gcd,gcd2;
        int pwr;
      int p,q; int x,pq;
        
        if(a<N)
        {
            gcd=findgcd(a,N);
            System.out.print(" gcd of (a,N)=("+a+","+N+") is    "+gcd+"\n");
            if  (gcd==1)
            {
                
            for( i=1;i<100;i++)
                {
                    //System.out.print("value of i\n"+i);
                    
                      r = a*a;
                        
                   
                      if(r>N )
                      {
                          gcd2 = findgcd(r,N);
                          //gcd2=r%N;
                          
                             if (r==1)
                             {
                                
                                 r=i;
                               System.out.print(" value of r is \t"+r+"\n ");
                              break;    
                             }
                      }
                      
                         if (r<N)
                      {
                          r=i;
                          System.out.print(" value of r is \t"+r+"\n ");
                          break;
                      }
                         a=r;
                }
            
            // even odd
            
            //System.out.print(" Checking if r is even or odd  "+i+"\n ");
             if(i % 2 != 0)
             {
                        System.out.println(i + " is odd. please choose another value of a");

             }else{
             
                r=i;
             phi= phi((int) N);
             System.out.print("phi value of N is \t"+phi+"\n ");
             
           temp= phi /r;
            System.out.print("value of  phi(n) by r \t"+temp+"\n ");
           
            pwr=r/2;
               System.out.print("value inn power \t"+pwr+"\n ");
            
            x=  (int) Math.pow(s, pwr);
           //   System.out.print("value in x \t"+x+"\n ");
              System.out.print("value in a \t"+s+"\n ");
            
              a1= x+1;
              p=findgcd(a1,N);
            //p=a1%N;
             System.out.print("value of p \t"+p+"\n ");
                a2= x-1;
                   q=findgcd(a2,N);
                //q=a2%N;
                     System.out.print("value of q \t"+q+"\n ");
            }
            }
        }
        else
        {
                  System.out.println("please choose another value of a");
        }
        
    }
    
}
