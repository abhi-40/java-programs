public class array_maxelement
{
    public static void main(String[] args)
    {  // find max element of array
        int a[]={1,2,3,9,5};
        int max1=a[0]; 
        for(int i=0;i<a.length;i++)
        {
          if(max1<a[i])
          {
           max1=a[i];
          }
        }  
        System.out.print(max1);
    }
}
        // find second largest element
       /*  int a[]={1,2,3,4,5};
        int max1=a[0];
        int max2=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(max1<a[i])
            {
                max2=max1;
                max1=a[i];
            }
            else if(max2<a[i])
            {
                max2=a[i];
            }
        }
        System.out.println(max2); 
        
    }
}*/
