/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.alfonsogalvanmadera.mrrobot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author alfonsogalvanmadera
 */
public class Robot {

    /**
     * @param args the command line arguments
     */
    public static WebDriver driver;
    public static final String user="gam_300@hotmail.com";
    public static final String pass="150293MAderA";
    public static final String url="https://mail.google.com";

    public void realizarLogin(){
        
    try {
            System.out.println("Tratando de ingresar");
            WebElement formUser=driver.findElement(By.id("Email"));
            //System.out.println(formUser);
            formUser.sendKeys(user);
            
            WebElement formPass= (WebElement) driver.findElements(By.name("pass"));
            formPass.sendKeys(pass);
            
            formPass.submit();
            
            
        } catch (Exception e) {
            System.out.println("Error al tratar de ingresar: "+e);
        }
    }
    
    public void iniciarSesion(){
        try {
            if (driver==null){
                System.out.println("Levantando el servicio...");
                driver= Robot.getDriver();
                driver.get(url);
                System.out.println(driver);
            }
            realizarLogin();
            
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    
    }
    
    private static WebDriver getDriver() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new FirefoxDriver();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Robot r2d2=new Robot();
        r2d2.realizarLogin();
    }
    
     

}
