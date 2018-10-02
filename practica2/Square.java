package practica2;

public class Square extends Shape {

    private double lado;

    @Override
    double getArea() {
        return lado*lado;
    }

    @Override
    public String toString() {
        return "I am a "+this.getClass().getSimpleName()+"  my area is: "+this.getArea();
    }

    @Override
    public int compareTo(Shape o) {
        if(this.getArea()==o.getArea()){
            return 0;
        }else if(this.getArea()>o.getArea()){
            return 1;
        }else{
            return -1;
        }
    }
}
