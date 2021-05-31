import java.util.Scanner;
class covidcases {
    public static void main(String args[])
    {
        int states=0,months=0,i=0,j=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of months:");
        months=sc.nextInt();
        System.out.println("Enter number of States:");
        states=sc.nextInt();
        int arr[][]=new int[months][states];
        String mon[]=new String[months];
        String sta[]=new String[states];
        System.out.println("Enter month names:");
        for(i=0;i<months;i++)
        {
            mon[i]=sc.next();
        }
        System.out.println("Enter state names:");
        for(i=0;i<states;i++)
        {
            sta[i]=sc.next();
        }
        System.out.println("Enter cases:");
        for(i=0;i<months;i++)
        {
            for(j=0;j<states;j++)
            {
                System.out.println("Enter cases during "+mon[i]+" in the state  "+ sta[j]+":");
               arr[i][j]=sc.nextInt();
            }
        }
        monthwisehigh(arr,months,states,mon,sta);
        lessavg(arr,months,states,mon,sta);

    }
    public static void monthwisehigh (int a[][],int x, int y,String r[],String j[])
    {
        int z=0,p=0;
        for(int i=0;i<x;i++)
        {
            p=0;
            z=0;
           for(int m=0;m<y;m++)
           {
               if(a[i][m]>p)
               {
                   p=a[i][m];
                   z=m;
               }
           }
           System.out.println("Highest cases during "+r[i]+" is recorded in the state "+ j[z]);
        }
    }
    public static void lessavg(int a[][],int x,int y,String r[],String j[])
    {
        int avg[]=new int [x];
        int sum=0,k=0;
        for(int i=0;i<y;i++)
        {
            sum=0;
            for(int m=0;m<x;m++)
            {
                sum=sum+a[m][i];
            }
            avg[k]=(sum/x);
            k++;
        }
        int p=0,o=avg[0];
        for(int s=0;s<=k-1;s++)
        {
            if(avg[s]<o)
            {
                o=avg[s];
                p=s;
            }
        }
        System.out.println("State with less covid cases during all these months is:" + j[p]);
    }
    
}
