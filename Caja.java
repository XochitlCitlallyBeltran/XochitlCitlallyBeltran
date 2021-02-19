
import java.util.*;

/**
 * 
 */
public class Caja extends Usuario {

    /**
     * Default constructor
     */
    public Caja() {
    double precio;
Int descuento;
String documentos;
String formapago;

Public void capturarDocumento() {

Scanner capturar = new Sacnner (syatem. In) ;
Syatem. out. Printin("documento a capturar") ;
Documento = capturar. next() ;

System.out.printin("forma de pago") ;
formapago= capturar. next() ;

}

Public void calcularSubtotal() {
Switch (documento) {
Case "inscripción":
Precio = 1500
Break;
Case "examen" :
Precio = 1400
Break;
Case "matricula" :
Precio = 300
Break;
Case "recursamiento" :
Precio = 700
Break;
} 

} 

Public void calculardescuento() {
Switch (documento) {
Case "inscripción":
Descuento = 1500
Break;
Case "examen" :
Descuento = 1400
Break;
Case "matricula" :
Descuento = 300
Break;
Case "recursamiento" :
Descuento = 700
Break;
}
public void preciofinal() {
} 

Public void imprimirTicket() {

}

Public static void main(String [] arga) {    
    }

}
