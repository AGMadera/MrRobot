 //Error reading included file Templates/Classes/Templates/Licenses/license-.txt
package org.alfonsogalvanmadera.mrrobot.Pruebas;

/**
 *
 * @author MBI
 */


public class Comexa extends PagWeb{

    public Comexa(){
        setCampoUsuario("proveedor");
        setCampoPass("password");
        setBoton("enviar1");
        setCadena("http://www.proveccm.com/webPrvd/VerificaOpcMenuSrv?menuId=253");
    }
}
