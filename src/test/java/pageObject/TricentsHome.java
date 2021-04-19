package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TricentsHome {
	
	@FindBy(id="nav_automobile")
	private WebElement opcaoauto;
	
	@FindBy(id="entervehicledata")
	private WebElement abaentervehicledata;
	
	@FindBy(id="make")
	private WebElement marca;
	
	@FindBy(id="engineperformance")
	private WebElement perfmotor;
	
	@FindBy(id="dateofmanufacture")
	private WebElement datafab;
	
	@FindBy(id="numberofseats")
	private WebElement nrolugares;
	
	@FindBy(id="fuel")
	private WebElement combustivel;
	
	@FindBy(id="listprice")
	private WebElement precotabela;
	
	@FindBy(id="annualmileage")
	private WebElement milhasanuais;
	
	@FindBy(xpath="//button[contains(@class, 'next button')]")
	private WebElement botaonextevd;
	
	@FindBy(id="firstname")
	private WebElement primeironome;
	
	@FindBy(id="lastname")
	private WebElement ultsobrenome;
	
	@FindBy(id="birthdate")
	private WebElement datanasc;
	
	@FindBy(id="country")
	private WebElement pais;
	
	@FindBy(id="zipcode")
	private WebElement cep;
	
	@FindBy(id="occupation")
	private WebElement ocupacao;
	
	@FindBy(xpath="//input[@id='other']")
	private WebElement hobbies;
	
	@FindBy(id="nextenterproductdata")
	private WebElement botaonexteid;
	
	@FindBy(id="startdate")
	private WebElement datainicio;
	
	@FindBy(id="insurancesum")
	private WebElement somadoseguro;
	
	@FindBy(id="meritrating")
	private WebElement classmerito;
	
	@FindBy(id="damageinsurance")
	private WebElement segurodanos;
	
	@FindBy(id="LegalDefenseInsurance")
	private WebElement produtosopcionais;
	
	@FindBy(id="courtesycar")
	private WebElement carrocortesia;
	
	@FindBy(id="nextselectpriceoption")
	private WebElement botaonextepd;
	
	@FindBy(id="selectultimate")
	private WebElement precoseguro;
	
	@FindBy(id="nextsendquote")
	private WebElement botaonextspo;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="username")
	private WebElement usuario;
	
	@FindBy(id="password")
	private WebElement senha;
	
	@FindBy(id="confirmpassword")
	private WebElement confirmasenha;
	
	@FindBy(id="sendemail")
	private WebElement botaosend;
	
	@FindBy(xpath="//h2")
	private WebElement textosucesso;
	
	private WebDriver driver;
	
	public TricentsHome (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void AbrirPagina(String url) {
		driver.get(url);
	}
	
	public void ClicarOpcaoAutomovel() {
		opcaoauto.click();
	}
	
	public void ClicarAbaEnterVehicleData () {
		abaentervehicledata.click();
	}

	public void PreencherMarca() {
		Select dropmarca = new Select(marca);
		dropmarca.selectByVisibleText("Audi");		
	}

	public void PerfMotor() {
		perfmotor.sendKeys("1500");
	}

	public void DataFab() {
		datafab.sendKeys("08/01/2020");
	}

	public void NroLugares() {
		Select droplugares = new Select(nrolugares);
		droplugares.selectByVisibleText("5");
	}

	public void Combustivel() {
		Select dropcombustivel = new Select(combustivel);
		dropcombustivel.selectByVisibleText("Gas");
	}

	public void PrecoTabela() {
		precotabela.sendKeys("35000");
	}

	public void MilhasAnuais() {
		milhasanuais.sendKeys("1500");
	}

	public void BotaoNextEvd() {
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeAsyncScript("document.getElementById('nextenterinsurantdata').click()");
		} catch (Exception e) {
		}
		
	}

	public void PrimeiroNome() {
		primeironome.sendKeys("John");
	}

	public void UltSobrenome() {
		ultsobrenome.sendKeys("Silva");
	}

	public void DataNasc() {
		datanasc.sendKeys("10/10/1963");
	}

	public void Pais() {
		Select droppais = new Select(pais);
		droppais.selectByVisibleText("Brazil");
	}

	public void Cep() {
		cep.sendKeys("22280110");
	}

	public void Ocupacao() {
		Select dropocupacao = new Select(ocupacao);
		dropocupacao.selectByVisibleText("Employee");
	}

	public void Hobbies() {
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder.moveToElement(hobbies).click().build();
		seriesOfActions.perform();
	}

	public void BotaoNextEid() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("document.getElementById('nextenterproductdata').click()");
	}

	public void DataInicio() {
		datainicio.sendKeys("07/01/2021");
	}

	public void SomaDoSeguro() {
		Select dropsomaseguro = new Select(somadoseguro);
		dropsomaseguro.selectByVisibleText("3.000.000,00");
	}

	public void ClassMerito() {
		Select dropclassmerito = new Select(classmerito);
		dropclassmerito.selectByVisibleText("Bonus 1");
	}

	public void SeguroDanos() {
		Select dropsegurodanos = new Select(segurodanos);
		dropsegurodanos.selectByVisibleText("Full Coverage");
	}

	public void ProdutosOpcionais() {
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder.moveToElement(produtosopcionais).click().build();
		seriesOfActions.perform();
	}

	public void CarroCortesia() {
		Select dropcarrocortesia = new Select(carrocortesia);
		dropcarrocortesia.selectByVisibleText("Yes");
	}

	public void BotaoNextEpd() {
		
	}

	public void PrecoSeguro() {
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder.moveToElement(precoseguro).click().build();
		seriesOfActions.perform();
	}

	public void BotaoNextSpo() {
		botaonextspo.click();
	}

	public void Email() {
		email.sendKeys("john@silva.com");
	}

	public void Usuario() {
		usuario.sendKeys("jsilva");
	}

	public void Senha() {
		senha.sendKeys("Teste@123");
	}

	public void ConfirmaSenha() {
		confirmasenha.sendKeys("Teste@123");
	}

	public void BotaoSend() {
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeAsyncScript("document.getElementById('sendemail').click()");
		} catch (Exception e) {
		}
	}

	public String PegaResultado() {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(textosucesso));
		return textosucesso.getText();
	}

	



	
	
	
}
