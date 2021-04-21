package br.com.jairo.tests;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {
	
	@Test
	public void teste(){
			
		//driver instaciado para abrir no chrome
		WebDriver driver = new ChromeDriver();						
		//Maximizar o Browser
		driver.manage().window().maximize();		
		// Acessando o site
		driver.get("http://www.google.com");	
		//Validando o titulo
		Assert.assertEquals("Google", driver.getTitle());
		
	}

}
