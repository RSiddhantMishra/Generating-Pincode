import java.io.*;
import java.util.*;
class pincode
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        System.out.print(pin(a,b,c));
    }
    public static int pin(int input1,int input2,int input3)
    {
        int a[]=new int[3];
		int b[]=new int[3];
		int c[]=new int[3];
		int i=0,j=0,k=0;
		while(input1!=0 || input2!=0 || input3!=0)
		{
			a[i++]=input1%10;
			b[j++]=input2%10;
			c[k++]=input3%10;
			input1/=10;
			input2/=10;
			input3/=10;
		}
		int p=0;
		int a1[]={a[1],b[1],c[1]};
		int b1[]={a[2],b[2],c[2]};
		int c1[]={a[0],b[0],c[0]};
		Arrays.sort(a1);
		Arrays.sort(b1);
		Arrays.sort(c1);
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		int p1=a[a.length-1];
		int p2=b[b.length-1];
		int p3=c[c.length-1];
		if(p1>p2 && p1>p3)
		{
		    p=p1;
		}else if(p2>p1 && p2>p3)
		{
		    p=p2;
		}else
		{
		    p=p3;
		}
		int q=c1[0];
		int r=a1[0];
		int z=b1[0];
		String str1=String.valueOf(p);
		String str2=String.valueOf(q);
		String str3=String.valueOf(r);
		String str4=String.valueOf(z);
		String res=str1+""+str4+""+str3+""+str2;
		int fin=Integer.parseInt(res);
		return fin;
    }
}
