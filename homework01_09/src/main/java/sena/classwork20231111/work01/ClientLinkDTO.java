package sena.classwork20231111.work01;

/**
 * адреса клиента
 *
 * @author Sergej Chumakov on 25.06.2021
 */
public class ClientLinkDTO implements PrettyJson {

//    @JsonProperty("MainClientID")
    private Integer mainClientID;
    private String groupType;
    private String linkColor;
    private String linkID;

    @Override
    public String toString(){
        return prettyJson(this);
    }

//    @Override
//    public String toString() {
//        return "ClientLinkDTO{" +
//                "mainClientID=" + mainClientID +
//                ", groupType='" + groupType + '\'' +
//                ", linkColor='" + linkColor + '\'' +
//                ", linkID='" + linkID + '\'' +
//                '}';
//    }

    public void setMainClientID(Integer mainClientID) {
        this.mainClientID = mainClientID;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public void setLinkColor(String linkColor) {
        this.linkColor = linkColor;
    }

    public void setLinkID(String linkID) {
        this.linkID = linkID;
    }
}
