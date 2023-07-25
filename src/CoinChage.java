import java.util.Arrays;
import java.util.Scanner;

public class CoinChage{
    public static int coin(int arr[],int amount)
    {
        Arrays.stream(arr).sorted();
        int sum=0,count=0;
        for (int i=arr.length-1;i>=0;i--)
        {

            while(sum<=amount)
            {
                if(sum+arr[i]<=amount)
                {
                    sum+=arr[i];
                    count++;
                }
                else{
                    break;
                }
                if(sum==amount)
                {
                    return count;
                }

            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int size=sc.nextInt();
        System.out.println("Enter the array elemnts");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the amount");
        int amount=sc.nextInt();

        System.out.println(coin(arr,amount));



    }

}