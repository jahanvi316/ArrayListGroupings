import java.util.*; 
public class homework4{
   public static void main(String[] args){
      ArrayList<String> a = new ArrayList<String>();
      a.add("A");
      a.add("B");
      a.add("C");
      a.add("D");
      a.add("E");
      System.out.println(a);
      clump(a);
      System.out.println(a);
   }
   
   public static void clump(ArrayList<String> in){
      for(int i =0; i < in.size() - 1; i++){
         in.set(i, "(" + in.get(i) + " " + in.get(i+1) + ")" );
         in.remove(i+1);
      }  
   }
}