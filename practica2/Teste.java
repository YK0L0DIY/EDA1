package practica2;

public class Teste{
    public static void main(String[] args) {
        Circulo c1=new Circulo();
        Square s1=new Square();
        Shape[] arr1= new Shape[5];
        Circulo[] arr2 = new Circulo[5];
        Square[] arr3 = new Square[5];

    }

    static double totalShape(Shape[] shape){
        double totalArea=0;
        for (Shape i:shape){
            totalArea+=i.getArea();
        }
        return totalArea;
    }


    //1.8
    //acaba 1.8

    //1.9
    public Shape maior(Shape[] o) {
        Shape maior=o[0];
        for(int i=1;i<o.length;i++){
            if (maior.getArea()<o[i].getArea()){
                maior=o[i];
            }
        }
        return maior;
    }

}
