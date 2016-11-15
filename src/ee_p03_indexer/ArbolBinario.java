
package ee_p03_indexer;

public class ArbolBinario {
  NodoArbol raiz;
    public ArbolBinario(){
     raiz=null;
    }
    public void agregar(int d,String nombre,String paterno, String email){
        NodoArbol nuevo =new NodoArbol(d,nombre,paterno,email);
        if(raiz==null){
          raiz=nuevo;
        }
        else{
          NodoArbol auxiliar= raiz;
          NodoArbol padre;
          while(true){
           padre=auxiliar;
           if(d<auxiliar.id){
            auxiliar=auxiliar.izquierdo;
             if(auxiliar==null){
              padre.izquierdo=nuevo;
              return;
             }
           }
           else{
              auxiliar=auxiliar.derecho;
              if(auxiliar==null){
               padre.derecho=nuevo;
               return;
              }
            }
          }
        }
    }
    
     public boolean vacio(){
      return raiz==null;
    }
    
     public void inorden(NodoArbol r){
       if(r!=null){
        inorden(r.izquierdo);
        System.out.println(r.id);
        inorden(r.derecho);
       }
      
     }  
}
