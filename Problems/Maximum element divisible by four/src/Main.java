import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num,j=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            num=sc.nextInt();
            if(num%4==0)
            {
                a[j]=num;
                j++;
            }
        }
        int larg=a[0];
        for(int k=1;k<j;k++)
        {
            if(larg<a[k])
            {
                larg=a[k];
            }
        }
        System.out.println(larg);
    }
}