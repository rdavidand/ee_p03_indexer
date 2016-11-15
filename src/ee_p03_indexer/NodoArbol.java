
package ee_p03_indexer;

public class NodoArbol {
    int id;
    String nombre;
    String paterno;
    String email;
    NodoArbol izquierdo,derecho;
    
   public NodoArbol(int id,String nombre, String paterno,String email){
     this.id=id;
     this.nombre=nombre;
     this.paterno=paterno;
     this.email=email;
     this.derecho=null;
     this.izquierdo=null;
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public NodoArbol getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoArbol izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoArbol getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoArbol derecho) {
        this.derecho = derecho;
    }
   public String toString(){
       return "Id: "+id+"  Nombre:"+nombre+"  Apellido:"+paterno+"  Email:"+email;
              }
}
