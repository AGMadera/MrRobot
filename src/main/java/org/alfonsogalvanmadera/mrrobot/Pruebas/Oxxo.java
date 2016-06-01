// Error reading included file Templates/Classes/Templates/Licenses/license-.txt
package org.alfonsogalvanmadera.mrrobot.Pruebas;

/**
 *
 * @author MBI
 */


public class Oxxo extends PagWeb{
    
    
    
    public Oxxo(){
        
        setCampoUsuario("wm_login-username");
        setCampoPass("wm_login-password");
        setBoton("portlet-form-button");////////////////Se tiene que cambiar 
        setCadena("https://proveedores.oxxo.com/pdpventasr1_300/Gen2Excel.xls");
        //setSalida("http://servicios.casaley.com.mx/portal_proveedores/index.php?doLogout=true");
        
    }
}
