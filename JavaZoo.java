
/**
 * Write a description of class JavaZoo here.
 * 
 * @author Mr. Jaffe
 * @version 2017-07-014
 */
public class JavaZoo
{
  
  public static void main(String[] args) {
    
    String[] animalList = {"BoopleSnoot"};
    
    try {
      for (int i=0; i<animalList.length; i++) {
        Object a = Class.forName(animalList[i]).newInstance();
        System.out.println(a.toString());
        System.out.println();
      }
    } catch (Exception e) {
      System.out.println("Someone messed up!");
    }
  }
}
