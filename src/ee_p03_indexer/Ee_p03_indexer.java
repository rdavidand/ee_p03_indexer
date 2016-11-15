
package ee_p03_indexer;
import javax.swing.JOptionPane;
import java.io.*;
//import com.csvreader.CsvReader;
public class Ee_p03_indexer {

    public static void main(String[] args) {
        ArbolBinario arbol= new ArbolBinario();
        String metodo;
        String opciones[]={"ID","NOMBRE","APELLIDO","EMAIL"};
        metodo=(String)JOptionPane.showInputDialog(null,"Selecciona","Metodo",JOptionPane.INFORMATION_MESSAGE,null,opciones,opciones[3]);
        switch(metodo){
            case "ID":
                  try{
                         FileReader fr= new FileReader("dataNov-7-2016.txt");
                         BufferedReader bw= new BufferedReader(fr);
                         String linea;
                             while((linea=bw.readLine())!=null){
                                String a[]= linea.split(",");
                                String d=a[0];
                                //int id=Integer.parseInt(d);
                                String nombre=a[1];
                                String paterno=a[2];
                                String email=a[3];
                                System.out.println(d);
                                 
                        }
                 }
                 catch(Exception e){
                        System.out.println("error");
                    }
        break;
                    case "NOMBRE":

                     try{
                         FileReader fr= new FileReader("dataNov-7-2016.txt");
                         BufferedReader bw= new BufferedReader(fr);
                         String linea;
                             while((linea=bw.readLine())!=null){
                                String a[]= linea.split(",");
                                String d=a[0];
                                //int id=Integer.parseInt(d);
                                String nombre=a[1];
                                String paterno=a[2];
                                String email=a[3];
                                System.out.println(nombre);
                                 
                        }
                 }
                 catch(Exception e){
                        System.out.println("error");
                    }
        break;
                        case "APELLIDO":

                     try{
                         FileReader fr= new FileReader("dataNov-7-2016.txt");
                         BufferedReader bw= new BufferedReader(fr);
                         String linea;
                             while((linea=bw.readLine())!=null){
                                String a[]= linea.split(",");
                                String d=a[0];
                                //int id=Integer.parseInt(d);
                                String nombre=a[1];
                                String paterno=a[2];
                                String email=a[3];
                                System.out.println(paterno);
                                 
                        }
                 }
                 catch(Exception e){
                        System.out.println("error");
                    }
        break;
                            case "EMAIL":

                     try{
                         FileReader fr= new FileReader("dataNov-7-2016.txt");
                         BufferedReader bw= new BufferedReader(fr);
                         String linea;
                             while((linea=bw.readLine())!=null){
                                String a[]= linea.split(",");
                                String d=a[0];
                                //int id=Integer.parseInt(d);
                                String nombre=a[1];
                                String paterno=a[2];
                                String email=a[3];
                                System.out.println(email);
                                 
                        }
                 }
                 catch(Exception e){
                        System.out.println("error");
                    }
        break;
        }
        
    
    }
    
}
