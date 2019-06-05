public class String13 {
 public boolean getStringIsValid(String str1, String str2) {
        for(int i=0;i<str1.length();i++){
            if(str2.contains(str1.charAt(i)+"")){
                str2=str2.replace(str1.charAt(i)+"","").trim();
            }
            str1=str1.replace(str1.charAt(i)+"","").trim();
        }
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }
}
