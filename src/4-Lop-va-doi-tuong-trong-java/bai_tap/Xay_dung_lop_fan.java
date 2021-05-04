

public class Xay_dung_lop_fan {
    public static class Fan {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;

        boolean on = false;
        private int speed = SLOW;
        private double radius = 5;
        private String color = "blue";

        public Fan(){
        }
        public boolean getOn(){
            return this.on;
        }
        public int getSpeed(){
            return this.speed;
        }
        public double getRadius(){
            return this.radius;
        }
        public String getColor(){
            return color;
        }
        public void setOn(boolean value){
            this.on = value;
        }
        public void setSpeed(int speed){
            this.speed = speed;
        }
        public void setRadius(double radius){
            this.radius = radius;
        }
        public void setColor(String color){
            this.color = color;
        }
        public String toString(){
            return "Status: " + this.on + "\n Speed: " + this.speed
                    + "\n Color: " + this.color +"\n Radius: " + this.radius;
        }
    }
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setOn(true);
        fan1.setSpeed(1);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println(fan1.toString());

        fan2.setOn(false);
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");
        System.out.println(fan2.toString());
    }

}
