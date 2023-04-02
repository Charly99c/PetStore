public class Bird extends Animal{

    private String legs;
    private String typeOfMouth;
    private String noseColor;

    public Bird(String raza, String name, String sex) {
        super(raza, name, sex);
    }

    public Bird(String raza, String name, String sex, String legs, String typeOfMouth, String noseColor) {
        super(raza, name, sex);
        this.legs = legs;
        this.typeOfMouth = typeOfMouth;
        this.noseColor = noseColor;
    }

    public String getLegs() {
        return legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    public String getTypeOfMouth() {
        return typeOfMouth;
    }

    public void setTypeOfMouth(String typeOfMouth) {
        this.typeOfMouth = typeOfMouth;
    }

    public String getNoseColor() {
        return noseColor;
    }

    public void setNoseColor(String noseColor) {
        this.noseColor = noseColor;
    }
}
