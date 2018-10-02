//dveopers by @y.kolodiy
//
package pratica1;

public class Fracao implements Comparable<Fracao> {

    //1.1
    private int numerador;
    private int denominador;

    public Fracao() {

    }

    public Fracao(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

    public Fracao(int numerador, int denominador) {

        if (denominador == 0) {
            this.denominador = 1;
        } else {

            this.numerador = numerador;
            this.denominador = denominador;
        }
    }
    //fim 1.1

    //1.3
    public int getDenominador() {
        return denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    //fim 1.3

    //1.4
    public String toString() {
        return "(" + numerador + "/" + denominador + ")";
    }
    //fim 1.4

    //1.5
    public void reduce() {
        int mdc = mdc(this.numerador, this.denominador);
        this.numerador /= mdc;
        this.denominador /= mdc;
    }

    private static int mdc(int m, int n) {

        int r = n % m;

        while (r != 0) {

            n = m;

            m = r;

            r = n % m;
        }

        return m;
    }
    //fim 1.5

    //1.6
    public Fracao sum(Fracao f) {

        this.numerador = this.numerador * f.getDenominador() + this.denominador * f.getNumerador();
        this.denominador *= f.getDenominador();
        reduce();

        return new Fracao(this.numerador, this.denominador);
    }

    public Fracao product(Fracao f) {

        this.numerador *= f.getNumerador();
        this.denominador *= f.getDenominador();
        reduce();

        return new Fracao(this.numerador, this.denominador);
    }

    public Fracao div(Fracao f) {

        this.numerador *= f.getDenominador();
        this.denominador *= f.getNumerador();
        reduce();

        return new Fracao(this.numerador, this.denominador);
    }

    //fim 1.6

    //1.7
    @Override
    public int compareTo(Fracao o) {
        //se o numero recebido for maior ele devolve 1 se for menor devolve -1
        if (numerador / denominador < o.getNumerador() / o.getDenominador()) {
            return 1;
        }
        return -1;
    }

}
