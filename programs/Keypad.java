import java.util.*;
class HelloWorld {
    static String[] codes = {"","","abc","def","ghi","jkl","mno","pqrs","tuv" , "wxyz"};
    public static void main(String[] args) {
      List<String> list = new ArrayList<>();
      recurion("23" ,"", list);
      for(String s:list){
          System.out.println(s);
      }
    }
    
    public static void recurion(String str,String ans, List<String> list){
        if(str.length()==0){
            list.add(ans);
            return;
        }
        char ch = str.charAt(0);
        int n = (int)(ch-'0');
        for(int i=0;i<codes[n].length();i++){
            recurion(str.substring(1),ans+codes[n].charAt(i),list);
        }
    }
}
