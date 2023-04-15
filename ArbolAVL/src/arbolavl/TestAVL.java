
package arbolavl;

public class TestAVL {

    public static void main(String[] args) {
        ArbolAVL arbol = new ArbolAVL();
        
        System.out.println("Rotacion Simple Derecha");
        arbol.insertar(20);
        arbol.insertar(12);
        arbol.insertar(5);
        arbol.mostrarArbolAVL();
        
        System.out.println("\n Rotacion simple Derecha");
        arbol.clearAll();

        arbol.insertar(20);
        arbol.insertar(15);
        arbol.insertar(25);
        arbol.insertar(10);
        arbol.insertar(18);
        arbol.insertar(5);
        arbol.mostrarArbolAVL();
        
        System.out.println("\n");
        
        System.out.println("\nRotacion simple Izquierda");

        arbol.clearAll();
        arbol.insertar(5);
        arbol.insertar(12);
        arbol.insertar(20);
        arbol.mostrarArbolAVL();
        
        System.out.println("\nRotacion simple Izquierda");

        arbol.clearAll();
        arbol.insertar(10);
        arbol.insertar(5);
        arbol.insertar(18);
        arbol.insertar(15);
        arbol.insertar(20);
        arbol.insertar(25);
        arbol.mostrarArbolAVL();
        
        System.out.println("\n");

        System.out.println("\nRotacion doble Derecha-Izquierda");

        arbol.clearAll();
        arbol.insertar(5);
        arbol.insertar(12);
        arbol.insertar(8);
        arbol.mostrarArbolAVL();
        
        System.out.println("\nRotacion doble Derecha-Izquierda");

        arbol.clearAll();
        arbol.insertar(5);
        arbol.insertar(2);
        arbol.insertar(12);
        arbol.insertar(8);
        arbol.insertar(14);
        arbol.insertar(7);
        arbol.mostrarArbolAVL();
        
        System.out.println("\n");
        
        System.out.println("\nRotacion doble Izquierda-Derecha");

        arbol.clearAll();
        arbol.insertar(12);
        arbol.insertar(5);
        arbol.insertar(8);
        arbol.mostrarArbolAVL();
        
        System.out.println("\nRotacion doble Izquierda-Derecha");

        arbol.clearAll();
        arbol.insertar(15);
        arbol.insertar(4);
        arbol.insertar(20);
        arbol.insertar(2);
        arbol.insertar(8);
        arbol.insertar(10);
        arbol.mostrarArbolAVL();
    }    
}
