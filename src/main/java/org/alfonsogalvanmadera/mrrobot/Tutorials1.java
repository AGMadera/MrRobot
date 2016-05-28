/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.alfonsogalvanmadera.mrrobot;

/**
 *
 * @author alfonsogalvanmadera
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDrive­r;

public class Tutorials1 { 
    
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://github.com/login");
        driver.findElement(By.id("login_field")).sendKeys("usuario");
        //driver.findElement(By.id("next")).clic­k();
        
        driver.findElement(By.id("password")).send­Keys("Contrasenia");
        driver.findElement(By.name("commit")).clic­k();
        System.out.println("la url es: "+driver.getCurrentUrl());
        

            }

}