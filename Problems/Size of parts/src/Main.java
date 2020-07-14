import  java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int size;
        int s=0,f=0,r=0;
        for(int i=0;i<n;i++)
        {
            size=sc.nextInt();
            if(size==0)
            {
                ++s;
            }
            else if(size==1)
            {
                ++f;
            }
            else
            {
                ++r;
            }
        }
        System.out.println(s+" "+f+" "+r);
    }
}