package avl;

public class NodoAVL {
    public Comparable dato;      	 // el dato del nodo
    public NodoAVL izquierdo;            // hijo izquierdo
    public NodoAVL derecho;              // hijo derecho
    public int altura;                   // altura

    // Constructors
    public NodoAVL( Comparable dato ){
        this( dato, null, null );
    }

    public NodoAVL( Comparable dato, NodoAVL izq, NodoAVL der ){
        this.dato = dato;
        this.izquierdo = izq;
        this.derecho = der;
        altura   = 0;               // altura predeterminada
    }
}