public class Snake extends Animal{

    private String scaleColor;
    private String scrollType;
    private String typeOfPoison;

    public void snake(){

    }

    public Snake(String raza, String name, String sex){
        super(raza, name, sex);
    }

    public Snake(String raza, String name, String sex, String scaleColor, String scrollType, String typeOfPoison) {
        super(raza, name, sex);
        this.scaleColor = scaleColor;
        this.scrollType = scrollType;
        this.typeOfPoison = typeOfPoison;
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    public String getScrollType() {
        return scrollType;
    }

    public void setScrollType(String scrollType) {
        this.scrollType = scrollType;
    }

    public String getTypeOfPoison() {
        return typeOfPoison;
    }

    public void setTypeOfPoison(String typeOfPoison) {
        this.typeOfPoison = typeOfPoison;
    }
}
