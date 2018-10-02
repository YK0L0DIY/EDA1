//dveopers by @y.kolodiy
//
package practica2;

public class Circulo extends Shape{


    private double raio;

    @Override
    double getArea() {
        return Math.PI*raio*raio;
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