package codechef4;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner in=new Scanner(System.in);
		int t= in.nextInt();
		while(t-->0) {
			int n= in.nextInt();
			int k= in.nextInt();
			int arr[]= new int[n];
			int xor=0;
			for(int i=0;i<n;i++) {
				arr[i]=in.nextInt();
			}
			for(int i=0;i<k;i++) {
				xor^=arr[i];
			}
			int ans=xor;
			for(int i=k;i<n;i++) {
				xor=xor^arr[i-k]^arr[i];					
				ans=xor>ans? xor: ans;
			}
			System.out.println(ans);
                }}}	
	
/*
Explanation:
    001
    010
    011
    100
    101
    110
    111
000^001=001
001^010=011

011^001=010
010^011=001

001^010=011
011^100=111


*/

