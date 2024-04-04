public class FindSumPathOfEle {
    
    public static void main(String[] args) 
    { 
        FindSumPathOfEle path = new FindSumPathOfEle(); 
        int x[] = {3, 6, 7, 8, 10, 12, 15, 18, 100 }; 
        int y[] = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50}; 
        int m = x.length; 
        int n =y.length; 
        int ans=path.maxPathSum(x, y, m, n);
  
        // Function call 
        System.out.println( "The Maximum Sum is :" + ans );
                              
    }
public int maxPathSum(int array1[], int array2[], int m, int n) 
    { 
       
        int i = 0, j = 0; 
  
        int result = 0, sum1 = 0, sum2 = 0; 
        while (i < m && j < n) { 
            
            if (array1[i] < array2[j]) 
                sum1 += array1[i++]; 
 
            else if (array1[i] > array2[j]) 
                sum2 += array2[j++]; 
  
            else { 
               
                result += maximum(sum1, sum2) + array1[i];
                sum1 = 0; 
                sum2 = 0; 
  
                i++; 
                j++; 
            } 
        } 
    
while (i < m) 
            sum1 += array1[i++]; 
  
        while (j < n) 
            sum2 += array2[j++]; 
result += maximum(sum1, sum2); 
  
        return result; 
    } 
 
public   int maximum(int x, int y)
{ 
    return (x > y) ? x : y; 
} 
}
