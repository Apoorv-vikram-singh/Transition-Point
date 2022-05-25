import java.util.*;
class transitionpoint
{
    public static void main(String args[])
    {
    transitionpoint obj=new transitionpoint();
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int low=0;
    int high=arr.length-1;
    int result=obj.transtionPoint(arr, n, low, high);
    System.out.println(result);
    }
    public int transtionPoint(int arr[],int n,int low ,int high)
    {
    while(low<=high)
    {
        int mid=(low+high)/2;
        if(arr[low]==1&&mid==0)
        {
            return 0;
        }
        if(arr[mid]==1&&arr[mid-1]==0)
        {
            return mid;
        }
        else if(arr[mid]==1&&arr[mid-1]==1)
        {
            high=mid-1;
        }
        else if(arr[mid]<1)
        {
            low=mid+1;
        }
    }
    return -1;


}
}