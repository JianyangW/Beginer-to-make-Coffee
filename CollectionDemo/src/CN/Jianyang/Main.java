package CN.Jianyang;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Collection<String> demo1 = new ArrayList<String>();
        demo1.add("123");
        demo1.add("456");
        demo1.add("789");
        //实现Iterator接口。
        Iterator<String> demo2 = demo1.iterator();
        //用hasNext方法去测试demo2是否有元素可以调用。
        boolean a = demo2.hasNext();
        System.out.println(a);

        List<String> list1 = new ArrayList<String>();
        list1.add("12a");
        list1.add("123a");
        list1.add("qw1");
        list1.add("12wq");

        Iterator<String> list2 = list1.iterator();

        while (list2.hasNext()){
            String s = list2.next();
            System.out.println(s);

            if(s.equals("12a")){
                System.out.println("has 12a");
            }
        }
    }
}
