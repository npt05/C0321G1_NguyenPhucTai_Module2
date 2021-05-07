package bai4_lop_va_doi_tuong_trong_java.bai_tap.ptbac2;

public class PTBac2 {
    double a;
    double b;
    double c;
    double delta;

    public PTBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        this.delta = (this.b * this.b - 4 * this.a * this.c);
        return this.delta;
    }

    public double getRoot1() {

        return (-this.b + Math.pow(this.delta, 0.5)) / (2 * this.a);
    }

    public double getRoot2() {

        return (-this.b - Math.pow(this.delta, 0.5)) / (2 * this.a);
    }
    public String getResult(){
        if (getDiscriminant() > 0) {
            return ("The equation has two roots: " + getRoot1() + " and " +getRoot2());

        } else if (getDiscriminant() == 0) {
            return ("The equation has one root: " + getRoot1());
        } else {
            return ("The equation has no real roots!");
        }
    }
}
