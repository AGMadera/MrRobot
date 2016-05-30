// Error reading included file Templates/Classes/Templates/Licenses/license-.txt
package org.alfonsogalvanmadera.mrrobot.Pruebas;

/**
 *
 * @author MBI
 */


public class CasaLey extends PagWeb{
/*
    @Override
    public void setCampoUsuario(String campoUsuario) {
        super.setCampoUsuario("usuario"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCampoPass(String campoPass) {
        super.setCampoPass("password"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBoton(String boton) {
        super.setBoton("button"); //To change body of generated methods, choose Tools | Templates.
    }
    */
    
    //String cliente;
    //String usuario;
    //String password;
    //String link;
    //String salir;
    public CasaLey(){
        setCampoUsuario("usuario");
        setCampoPass("password");
        setBoton("button");
        setCadena("http://servicios.casaley.com.mx/portal_proveedores/vs_5_todas_excel.php");
        setSalida("http://servicios.casaley.com.mx/portal_proveedores/index.php?doLogout=true");
    }
    
    
    
    
}
