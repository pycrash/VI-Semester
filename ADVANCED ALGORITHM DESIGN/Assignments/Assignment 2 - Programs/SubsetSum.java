import java.util.Scanner;

public class SubsetSum {
  
    static boolean isSubsetSum(int set[],
                               int n, int sum)
    {       
		 if (sum == 0)
            return true;
        if (n == 0 && sum != 0)
            return false;
  
        if (set[n - 1] > sum)
            return isSubsetSum(set, n - 1, sum);
     return isSubsetSum(set, n - 1, sum) || isSubsetSum(set, n - 1, sum - set[n - 1]);
    }
  
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the set length :");

        int N = scan.nextInt();

        System.out.println("Enter the set elements :");

        int[] set = new int[N];

        for(int i = 0; i < N; i++)
            set[i] = scan.nextInt();

        System.out.println("Enter the sum : ");
        int sum = scan.nextInt();

        if (isSubsetSum(set, N, sum) == true)
            System.out.println("Found a subset"
                               + " with given sum");
        else
            System.out.println("No subset with"
                               + " given sum");
    }
}