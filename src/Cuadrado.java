package src;
import java.util.Scanner;

public class Cuadrado{

    public static void main(String[] args){
        float lado1;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el lado del cuadrado: ");
        lado1 = entrada.nextFloat();
        Cuadrado t = new Cuadrado(lado1);
        System.out.println("El area del cuadrado es: " + t.getArea());
        System.out.println("El perimetro del cuadrado es: " + t.getPerimetro());

    }

    private float lado1;

    public Cuadrado(float lado1){
        this.lado1 = lado1;
    }

    public float getArea(){
        float Area = lado1 * lado1;
        return Area; 
    }

    public float getPerimetro(){
        float Perimetro = lado1 * 4;
        return Perimetro;
    }

}