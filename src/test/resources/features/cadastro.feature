# language: pt
# charset: UTF-8

Funcionalidade: Testar site da Tinnova

  @tinnovaCadastro
  Esquema do Cenario: Cadastrar usuário
    Dado que estou na home page da tinnova
    Quando clico em Entrar
    E clico em Adicionar
    E preencho o campo Nome completo "<Nome>"
    E preencho o campo E-mail "<E-mail>"
    E preencho o campo CPF "<CPF>"
    E preencho o campo Telefone "<Telefone>"
    Então clico em GUARDAR

    Exemplos:
      | Nome     | E-mail            | CPF          | Telefone     |
      | Indiara  | teste1@teste.com  | 11257708058  | 11995365656  |
      | Gabriel  | teste2@teste.com  | 71023994054  | 12955447788  |
      | Leonardo | teste3@teste.com  | 40773828079  | 13965412233  |


