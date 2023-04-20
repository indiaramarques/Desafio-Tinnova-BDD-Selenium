# language: pt
# charset: UTF-8

Funcionalidade: Testar site da Tinnova

  Contexto: Cadastrar usuário
    Dado que estou na home page da tinnova
    Quando clico em Entrar
    E clico em Adicionar
    E preencho o campo Nome completo "Indiara"
    E preencho o campo E-mail "teste1@teste.com"
    E preencho o campo CPF "11257708058"
    E preencho o campo Telefone "11995365656"
    Então clico em GUARDAR


    @tinnovaConsulta
    Cenario:
      Dado que clico em Consultar
      Então devo visualizar as informações do usuário cadastrado