package src;
import java.util.*;
public class Rectangulo{
	public static void main(String[] args) {
		Rectangulo t = new Rectangulo(5,8);
		t.perimetro();
		t.area();
		
	}

	private int ancho=0;
	private int largo=0;

	Scanner scanner = new Scanner(System.in);

	public Rectangulo(int ancho, int largo){
		System.out.println("ingrese el ancho: ");
		ancho = scanner.nextInt();
		System.out.println("ingrese el largo: ");
		largo = scanner.nextInt();
		this.ancho = ancho;
		this.largo = largo;
	}

	public void setRectangulo(int largo){
		this.largo = largo;
    }

    public void setRectangul(int ancho){
        this.ancho = ancho;
    }

    public int getRectangul(){
        return ancho;
    }

    public int getRectangulo(){
        return largo;
    }

    public void perimetro(){
    	int perimetro;
    	if(ancho<largo){
    		perimetro = 2*ancho + 2* largo;
    	    System.out.println("El perimetro es: " + perimetro);
    	}
    	else{
    		System.out.println("El largo debe ser mayor al ancho");
    	}

    }

    public void area(){
    	int area;
    	    if(ancho<largo){
    		area = ancho * largo;
    	    System.out.println("El area es: " + area);
    	}
    	else{
    		System.out.println("El largo debe ser mayor al ancho");
    	}
    }
}