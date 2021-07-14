
package additivenumber;

import java.math.BigInteger;

public class AdditiveNumber {
    public static void main(String args[]){
        AdditiveNumber m=new AdditiveNumber();
        System.out.println(m.isAdditiveNumber("1123883457"));
    }
  public boolean isAdditiveNumber(String num) {
        for(int i =1;i<= num.length()/2;i++){ // i is the end of the index for value a, exclusive
  //          if(num.charAt(0)=='0' && i != 1)
    //            break;
            BigInteger a = new BigInteger(num.substring(0,i));
            for(int j = i; j< num.length()-1; j++){ // j is the end of the index for value b, inclusive
      //          if(num.charAt(i) =='0' && j != i)
        //            break;
                BigInteger b = new BigInteger(num.substring(i,j+1));
                if(helper(a, b, num.substring(j+1)))
                    return true;
            }
        }
        return false;
    }
    private boolean helper(BigInteger a,BigInteger b , String str){
        if(str.length()==0)
            return true;
           System.out.print(" *********** "+a+" ******** "+b+"*********");
        a = a.add(b);
        
        String ss = a.toString();
       System.out.println(ss);
        return str.indexOf(ss)==0 && helper(b,a,str.substring(ss.length()));
    }
}
