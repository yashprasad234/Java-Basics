public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Aasmaani");
        System.out.println(p1.getColor());
        p1.setTip(7);
        System.out.println(p1.getTip());
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return color;
    }

    int getTip() {
        return tip;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}
