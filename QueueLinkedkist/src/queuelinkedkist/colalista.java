package queuelinkedkist;


    public class colalista {
        
        class Nodo {

        Object elemento;
        Nodo siguiente;

        public Nodo(Object x) {
            elemento = x;
            siguiente = null;
        }
    }


        protected Nodo frente;
        protected Nodo fin;

        public colalista() {
            frente = fin = null;
        }

        public void insertar(Object elemento) {
            Nodo a;
            a = new Nodo(elemento);
            if (colaVacia()) {
                frente = a;
            } else {
                fin.siguiente = a;
            }
            fin = a;
        }

        public Object quitar() throws Exception {
            Object aux;
            if (!colaVacia()) {
                aux = frente.elemento;
                frente = frente.siguiente;
            } else {
                throw new Exception("Eliminar de una cola vacia");
            }
            return aux;
        }

        public void borrarCola() {
            for (; frente != null;) {
                frente = frente.siguiente;
            }
            System.gc();
        }
        
        public Object frenteCola() throws Exception {
        if (colaVacia()) {
        throw new Exception("Error: cola vacia");
        }
        return (frente.elemento);
        }
        
        public boolean colaVacia() {
        return (frente == null);
        }


 
}
