package sena.classwork20231111.work01;

//import org.json.JSONObject;

/**
 * @author Sergej Chumakov on 13.09.21
 * вывод объектов в логи в виде "красивого" json-а
 */
public interface PrettyJson {

    default String prettyJson(Object body) {


//        if (body != null) {
//            System.out.println("in pretty");
//            JSONObject jsonObj = new JSONObject(body);
//            return jsonObj.toString(4);
//        } else return body.toString();
        return "";
    }
    // для правильной реализации необходимо переопределить в классе-представлении метод toString в виде:
    //    @Override
    //    public String toString(){
    //        return prettyJson(this);
    //    }
}
