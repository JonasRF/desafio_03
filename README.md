# desafio_o3

O projeto deverá estar com um ambiente de testes configurado acessando o banco de dados H2, deverá usar
Maven como gerenciador de dependência, e Java como linguagem.
Um cliente possui nome, CPF, renda, data de nascimento, e quantidade de filhos. A especificação da
entidade Client é mostrada a seguir (você deve seguir à risca os nomes de classe e atributos mostrados no
diagrama):

![image](https://github.com/JonasRF/desafio_o3/assets/77034798/6cd0c8cb-0158-489c-bf9f-0ba593d7b378)

Seu projeto deverá fazer um seed de pelo menos 10 clientes com dados SIGNIFICATIVOS (não é para
usar dados sem significado como “Nome 1”, “Nome 2”, etc.).
Seu projeto deverá tratar as seguintes exceções:
 Id não encontrado (para GET por id, PUT e DELETE), retornando código 404.
 Erro de validação, retornando código 422 e mensagens customizada para cada campo inválido. As
regras de validação são:
o Nome: não pode ser vazio
o Data de nascimento: não pode ser data futura (dica: use @PastOrPresent)
Atenção: crie um novo projeto para este trabalho. Não é para simplesmente acrescentar a classe
Client no projeto feitos nas aulas.
Atenção: lembre-se de que por padrão a JPA transforma nomes de atributos em camelCase para
snake_case, como foi o caso do campo imgUrl das aulas, que no banco de dados tinha o nome
img_url. Assim, o campo birthDate acima será criado no banco de dados como birth_date, então
seu script SQL deverá seguir este padrão.
Atenção: cuidado para não salvar no seu projeto arquivos e pastas que não devem ser salvas no Git,
tais como a pasta .metadata do Eclipse ou .idea do Intellij.