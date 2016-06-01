// Error reading included file Templates/Classes/Templates/Licenses/license-.txt
package org.alfonsogalvanmadera.mrrobot.Pruebas;

/**
 *
 * @author MBI
 */


public class Chedra extends PagWeb{
    String accion1;
    String accion2;
    
public Chedra(){
    
        setCampoUsuario("username");
        setCampoPass("password");
        setBoton("portlet-form-button");////////////////Se tiene que cambiar 
        accion1="jsfwmp7813:defaultForm:RadioButtonMensual";
        accion2="jsfwmp7813:defaultForm:RadioButtonTiendas";
        setCadena("https://proveedores.oxxo.com/pdpventasr1_300/Gen2Excel.xls");
        //setSalida("http://servicios.casaley.com.mx/portal_proveedores/index.php?doLogout=true");
    }
    
    
    
}
