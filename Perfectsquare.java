import java.util.*;
public class Perfectsquare {
    public static boolean isPerfectSquare(long num){
        long sqr=(long)Math.sqrt(num);
        if(sqr*sqr==num){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int len=str.length();
		long N=Long.valueOf(str);
long first=Long.valueOf(str.substring(0,len/2));
long second=Long.valueOf(str.substring(len/2,len));
if(isPerfectSquare(N) && isPerfectSquare(first) && isPerfectSquare(second)){
    System.out.print("YES");
}
else{
    System.out.print("NO");
}
	}
}