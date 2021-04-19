package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObject.TricentsHome;


public class PreencherFormularioTricentsStepDefinition {
	
	private WebDriver driver;
	private TricentsHome pagina;
	
	@Before
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@After
	public void tearDown(){		
		//fechar o navegador..
		//driver.close();
	}

	@Dado("que eu acesse o site {string}")
	public void que_eu_acesse_o_site(String string) {
		pagina = new TricentsHome(driver);
		pagina.AbrirPagina(string);
	}
	
	@Quando("clico na opcao {string}")
	public void clico_na_opcao(String string) {
		pagina.ClicarOpcaoAutomovel();
	}
	
	@E("clico na aba {string}")
	public void clico_na_aba(String string) {
		pagina.ClicarAbaEnterVehicleData();
	}
	
	@E("informo a marca")
	public void informo_a_marca() {
	    pagina.PreencherMarca();
	}
	
	@E("informo a performance do motor")
	public void informo_a_performance_do_motor() {
	    pagina.PerfMotor();
	}
	
	@E("informo a data de fabricacao")
	public void informo_a_data_de_fabricacao() {
	    pagina.DataFab();
	}
	
	@E("informo o numero de lugares")
	public void informo_o_numero_de_lugares() {
	    pagina.NroLugares();
	    
	}
	
	@E("informo o tipo de combustivel")
	public void informo_o_tipo_de_combustuvel() {
	    pagina.Combustivel();
	    
	}
	
	@E("informo o preco de tabela")
	public void informo_o_preco_de_tabela() {
	    pagina.PrecoTabela();
	}
	
	@E("informo as milhas anuais")
	public void informo_as_milhas_anuais() {
	    pagina.MilhasAnuais();
	}
	
	@E("clico no botao {string}")
	public void clico_no_botao(String string) throws InterruptedException {
	    pagina.BotaoNextEvd();
	}
	
	@E("informo o primeiro nome")
	public void informo_o_primeiro_nome() {
	    pagina.PrimeiroNome();
	}
	
	@E("informo o ultimo sobrenome")
	public void informo_o_ultimo_sobrenome() {
	    pagina.UltSobrenome();
	}
	
	@E("informo a data de nascimento")
	public void informo_a_data_de_nascimento() {
	    pagina.DataNasc();
	}
	
	@E("informo o pais")
	public void informo_o_pais() {
	    pagina.Pais();
	    
	}
	
	@E("informo o CEP")
	public void informo_o_cep() {
	    pagina.Cep();
	}
	
	@E("informo a ocupacao")
	public void informo_a_ocupacao() {
	    pagina.Ocupacao();
	    
	}
	
	@E("informo os hobbies")
	public void informo_os_hobbies() {
	    pagina.Hobbies();
	    
	}
	
	@E("clico no botao2 {string}")
	public void clico_no_botao2(String string) {
	    pagina.BotaoNextEid();
	}
		
	@E("informo a data de inicio")
	public void informo_a_data_de_inicio() {
	    pagina.DataInicio();
	}
	
	@E("informo a soma do seguro")
	public void informo_a_soma_do_seguro() {
	    pagina.SomaDoSeguro();
	    
	}
	
	@E("informo a classificacao de merito")
	public void informo_a_classificacao_de_merito() {
	    pagina.ClassMerito();
	    
	}
	
	@E("informo o seguro de danos")
	public void informo_o_seguro_de_danos() {
	    pagina.SeguroDanos();
	    
	}
	
	@E("informo os produtos opcionais")
	public void informo_os_produtos_opcionais() {
	    pagina.ProdutosOpcionais();
	    
	}
	
	@E("informo se quero carro cortesia")
	public void informo_se_quer_carro_cortesia() {
	    pagina.CarroCortesia();
	    
	}
	
	@E("clico no botao3 {string}")
	public void clico_no_botao3(String string) {
	    pagina.BotaoNextEpd();
	}
	
	@E("seleciono o preco do seguro")
	public void seleciono_o_preco_do_seguro() {
	    pagina.PrecoSeguro();
	    
	}
	
	@E("clico no botao4 {string}")
	public void clico_no_botao4(String string) {
	    pagina.BotaoNextSpo();
	}
	
	@E("informo o e-mail")
	public void informo_o_e_mail() {
	    pagina.Email();
	}
	
	@E("informo o nome de usuario")
	public void informo_o_nome_de_usuario() {
	    pagina.Usuario();
	}
	
	@E("informo a senha")
	public void informo_a_senha() {
	    pagina.Senha();
	}
	
	@E("confirmo a senha")
	public void confirmo_a_senha() {
	    pagina.ConfirmaSenha();
	}
	
	@E("clico no botao Send")
	public void clico_no_botao_Send() {
	    pagina.BotaoSend();
	}
	
	@Entao("sistema mostra a mensagem {string} na tela")
	public void sistema_mostra_a_mensagem_na_tela(String string) {
	    assertEquals(string, pagina.PegaResultado());
	}
	
}