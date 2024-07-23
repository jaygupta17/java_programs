import java.util.*;
class HelloWorld {
    static String[] codes = {"","","abc","def","ghi","jkl","mno","pqrs","tuv" , "wxyz"};
    public static void main(String[] args) {
      List<String> list = new ArrayList<>();
      recurion("abc" ,"", list);
      for(String s:list){
          System.out.println(s);
      }
    }
    
    public static void recurion(String str,String ans, List<String> list){
        //abc -> ch = a -> ch2 = bc -> cb,bc ->acb,abc
        if(str.length()==0){
        list.add(ans);
        return;
            
        }
        
        //bc
        // int n = (int)(ch-'0');
        for(int i = 0 ; i<str.length();i++){
            char ch = str.charAt(i);
                    recurion(str.substring(0,i)+str.substring(i+1),ans+ch,list);
        }

    }
}
