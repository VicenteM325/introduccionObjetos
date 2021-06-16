public class Contador{
    public static void main(String[] args) {
        Contador t = new Contador(5);
        Contador e = new Contador(4);
        t.incrementar();
        t.mostrarDatos();
        e.incrementar();
        e.mostrarDatos();
        t.decrementar();
        t.cargarDatos();
        e.decrementar();
        e.cargarDatos();
    }
    private int cont;

    public Contador(int cont){
        this.cont = cont;
    }


    public void setCont(int cont){
        this.cont = cont;
    }

    public int getCont(){
        return cont;
    }

    public void incrementar(){
        cont++;
    }

    public void decrementar(){
        cont--;
    }

    public void mostrarDatos(){
        System.out.println("El incremento es: " + cont);
    }

    public void cargarDatos(){
        System.out.println("El decremento es: " + cont);
    }


 //fin del programa   
}
