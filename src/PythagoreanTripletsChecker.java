


import java.util.*;
 
public class PythagoreanTripletsChecker 
{    
    // Returns true if there is a triplet with following property
    // A[x]*A[x] = A[y]*A[y] + A[t]*[t]

    public static void hasTriplet(int aar[])
    {
    	int n = aar.length; /*get array length*/
    	
    	int aar_bk[] =aar; /*back up  and sort the array */
    	 Arrays.sort(aar_bk);
    	 
    	
        /* square all array elements*/
        for (int x=0; x<n; x++)
            aar[x] = aar[x]*aar[x];
  
        /*sort array elements */
        Arrays.sort(aar);
       
  
        // Now fix one element one by one and find the other two
        // elements
        for (int x = n-1; x >= 2; x--)
        {
            /* start two index
            *variables from two ends of the array and move
            * them toward each other, to get the other two elements.
            */
            int a = 0; /* index of the first element in a[0..x-1]*/
            int z = x-1; /* index of the last element in a[0..x-1]*/
            while (a < z) /* check that not yet middle of the array*/
            {
                /* other two elements found and terminate execution*/
                if (aar[a] + aar[z] == aar[x]){
               System.out.println("There is a Pythagorean triplet (" + (int)Math.sqrt(aar_bk[a] )+","+ (int)Math.sqrt(aar_bk[z]) + "," +(int)Math.sqrt(aar_bk[x])+")");	
                  return;
                }
                // Else either move 'a' or 'z'
                if (aar[a] + aar[z] < aar[x])
                   a++;
                else
                   z--;
            }
        }
  
        /* other two elements NOT  found,no Pythagorean triplet */
        System.out.println(" There is no Pythagorean triplet.");
      
    }
     
     
    // Main method to test the method above
    public static void main(String[] args)
    {
        int aar[] = {3, 1, 4, 6, 9};
        
       hasTriplet(aar);
         
     
    }
}