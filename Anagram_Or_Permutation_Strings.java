package string;		
import java.util.*;
import java.io.*;
		class anagram
		{ 
			public static void main (String[] args)throws IOException {
			
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int t = Integer.parseInt(br.readLine());
				while(t-->0)
				{
				    String str = br.readLine();
				    String s1 = str.split(" ")[0];
				    String s2 = str.split(" ")[1];
				    Anagram_Or_Permutation_Strings obj = new Anagram_Or_Permutation_Strings();
				    if(obj.isAnagram(s1,s2))
				    {
				        System.out.println("YES");
				    }
				    else
				    {
				         System.out.println("NO");
				    }		    
				}
			}
		}
public class Anagram_Or_Permutation_Strings 
{    
		public static boolean isAnagram(String a,String b)
		{
		     int flag = 0;
		     int str1 = a.length();
		     int str2 = b.length();
		     
		     if(str1!=str2)
		         return false;
		         
		     char c1[] = a.toCharArray();
		     char c2[] = b.toCharArray();
		 
		     Arrays.sort(c1);
		     Arrays.sort(c2);
		     
		     for(int i=0;i<str1;i++)
		         if(c1[i]!= c2[i])
		             return false;
		  return true;
	 }
}