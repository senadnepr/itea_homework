package sena.classwork20231021.cw01;

import java.util.*;

/**
 * @author Sergej Chumakov on 21.10.2023
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Set<String> set = new HashSet<>();
        set.add ("арбуз");
        set. add ("банан"); set . add ("дыня");
        set.add ("земляника") ; set.add ("ирис");
        set.add ("картофель");
        set.add ("картофель");
        for (String text : set) {
            System.out.println(text + " " + text.hashCode());
        }

        Test t = new Test();
        t.setName("name1");
        t.setName2("name2");
        t.setName(2);
        t.setName2(new Date());
        System.out.println(1 + 3 + " = 13");
    }
}

class Test<T1, T2>{
    private T1 name;
    private T2 name2;

    public Test() {
    }

    public void setName(T1 name) {
        this.name = name;
    }

    public void setName2(T2 name2) {
        this.name2 = name2;
    }
}




