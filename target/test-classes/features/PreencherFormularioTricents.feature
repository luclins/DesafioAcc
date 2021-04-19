#language: pt
#encoding: ISO-8859-1

Funcionalidade: Preencher formulario Tricents
			
Esquema do Cenario: Cadastro preenchido com sucesso
	Dado que eu acesse o site "http://sampleapp.tricentis.com/101/app.php"
	Quando clico na opcao "Automobile"
	E clico na aba "Enter Vehicle Data" 
	E informo a marca
	E informo a performance do motor
	E informo a data de fabricacao
	E informo o numero de lugares
	E informo o tipo de combustivel
	E informo o preco de tabela
	E informo as milhas anuais
	E clico no botao "Next"
	E informo o primeiro nome
	E informo o ultimo sobrenome
	E informo a data de nascimento
	E informo o pais
	E informo o CEP
	E informo a ocupacao
	E informo os hobbies
	E clico no botao "Next" 
	E informo a data de inicio
	E informo a soma do seguro
	E informo a classificacao de merito
	E informo o seguro de danos
	E informo os produtos opcionais
	E informo se quero carro cortesia
	E clico no botao "Next"
	E seleciono o preco do seguro
	E clico no botao "Next"
	E informo o e-mail
	E informo o nome de usuario
	E informo a senha
	E confirmo a senha
	E clico no botao Send
	Entao sistema mostra a mensagem "Sending e-mail success!" na tela