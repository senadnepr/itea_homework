package sena;

import org.json.JSONObject;

/**
 * @author Sergej Chumakov on 21.11.2023
 * вывод объектов в логи в виде "красивого" json-а
 */
public interface PrettyJson {

    default String prettyJson(Object body) {

        if (body != null) {
            JSONObject jsonObj = new JSONObject(body);
            return jsonObj.toString(4);
        } else return body.toString();
    }
    // для правильной реализации необходимо переопределить в классе-представлении метод toString в виде:
    //    @Override
    //    public String toString(){
    //        return prettyJson(this);
    //    }
}
