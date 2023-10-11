package sena.work;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergej Chumakov on 11.10.2023
 */
public class CorrectFrame extends AddFrame{

//    private List files = null;        // 1 випадок - не працює, тому що List files усюди null чомусь
    private List files;                 // 2 випадок - працює
    private MyButton out;

    public CorrectFrame() {
        super();
    }

    @Override
    public void initChild(){
        System.out.println("files=" + files);   // тут він null в обох випадках
        files = new ArrayList<>();              // тут ми його ініціалізуємо в обох випадках
        out = new MyButton(this);
    }

    public List getFiles() {
        return files;                           // але тут він у першому випадку повертає null, а у другому List
    }                                           // питання - чому так?

    public MyButton getOut() {
        return out;
    }
}
