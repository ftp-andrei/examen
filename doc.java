
/**
 * Write a description of class doc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface doc
{
   /**
    * @param X es el numero de fila y FILE es la ruta del fichero
    * @return Devuelve el contenido de la fila x del fichero de texto con ruta absoluta file. 
    */
   // Devuelve el contenido de la fila x del fichero de texto con ruta absoluta file.
   public abstract String obtenerLinea(int x, String file);
   /**
    * @param Calle Escribimos una direccion
    * @return Devuelve la posicion geografica (altitud-latitud)
    */
   //Precondicion -> Que la calle no tenga numeros negativos
   //Postcondicion -> Que no te devuelva letras, solo numeros
   //Entrada -> Pones una direccion
   //Salida -> Te devuelve la altitud/latitud de esa direccion
   public abstract int posicionGeografica(String calle);
   
}
