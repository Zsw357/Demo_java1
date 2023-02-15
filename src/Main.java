import java.util.ArrayList;
import java.util.Arrays;

//这是单行注释
public class Main {
//模板一：psvm
public static void main(String[] args) {
  //模板二：sout、soutp、soutm、soutv
    System.out.println("hello word");
    System.out.println("args = " + Arrays.toString(args));
    System.out.println("Main.main");
    System.out.println("args = " + args);

    //模板三：for、iter、itar
    String[] arr = new String[]{"1","2","3","4"};
    for (int i = 0; i < arr.length; i++) {
        
    }

    for (String s : arr) {
        
    }
    for (int i = 0; i < arr.length; i++) {
        String s = arr[i];
        
    }

    //模板四：list.fori
    ArrayList list = new ArrayList();
    list.add(123);
    list.add(1234);
    list.add(1235);

    for (int i = 0; i < list.size(); i++) {

    }
    for (int i = list.size() - 1; i >= 0; i--) {

    }

    //模板五：ifn、inn
    if (list == null) {

    }
    if (list != null) {

    }





}
//模板六：prsf

}