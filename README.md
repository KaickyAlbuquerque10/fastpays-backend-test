# 🚀 FastPays API — Desafio Técnico (README/ dev júnior)

# 

##### Esse projeto foi feito para o processo seletivo da FastPays.

##### Eu tentei deixar tudo o mais simples e organizado possível, usando as tecnologias que o desafio pedia.

##### Foi uma boa oportunidade para treinar Java, Spring Boot, Docker e também entender melhor como estruturar uma API real.

# 

# &nbsp;Tecnologias que usei

# 

### Eu usei tecnologias que já tive um pouco de contato e outras que estou estudando agora:

### 

### Java 17

### 

### Spring Boot

### 

### Spring Web

### 

### Spring Data JPA

### 

### PostgreSQL

### 

### Docker / Docker Compose

### 

### JUnit 5 (para testes)

### 

### Maven

### 

### Tentei manter tudo básico e direto ao ponto.

# 

# &nbsp;O que o projeto faz

# 

### O sistema é simples:

### 

### Cadastra empresas

### 

### Cadastra pessoas

### 

### Lista pessoas

### 

### Lista pessoas por empresa

### 

### Busca empresa por ID

### 

### O desafio também pedia para limpar CPF e CNPJ (deixar só os números) e validar o CPF.

### Isso foi feito em uma classe utilitária separada.

# 

# &nbsp;Como funciona a limpeza de CPF/CNPJ

# 

### Quando o usuário manda algo tipo:

### 

### "111.222.333-44"

### 

### "12.345.678/0001-90"

### 

### Eu transformo para:

### 

### "11122233344"

### 

### "12345678000190"

### 

### Isso deixa o banco sempre padronizado e facilita buscar depois.

# 

# &nbsp;Testes Unitários (o que eu consegui fazer)

# 

### Eu fiz testes focados nas regras de negócio pedidas:

### 

### validar CPF

### 

### limpar strings (CPF/CNPJ)

### 

### regras básicas de negócio (ex.: se empresa existe)

### 

### Ainda estou aprendendo testes, então deixei o mais claro e simples possível, sem complicar.FastPays Test Java





# &nbsp;Estrutura do Projeto (de forma simples)

### src/main/java/com/fastpays/

###  ├── controller   → onde ficam as rotas da API

###  ├── service      → regras de negócio

###  ├── repository   → comunicação com o banco usando JPA

###  └── util         → limpeza/validação de documentos

### 

### src/main/resources/

###  └── application.properties → configurações da aplicação

# 

# \*Tentei seguir o padrão mais comum dos projetos Spring Boot.\*

# 

# &nbsp;Como rodar o projeto (bem simples)

# 

### O jeito mais fácil de rodar tudo é usando o Docker.

### 

### 1\. Clonar o projeto

### git clone https://github.com/seu-usuario/fastpays-desafio.git

### cd fastpays-desafio

### 

### 2\. Rodar tudo com um único comando

### docker-compose up --build

### 

### 

### Esse comando vai:

### 

### subir o PostgreSQL

### 

### subir a API

### 

### criar as tabelas

### 

### Depois disso, a API vai estar em:  http://localhost:8080

# 

# &nbsp;Como rodar os testes

# 

# Se quiser rodar os testes manualmente:

# 

# mvn test

# 

# &nbsp;Endpoints da API (bem direto)

# &nbsp;Criar Empresa

# 

# POST /empresas

# 

# {

#   "nome": "FastPays Tecnologia",

#   "cnpj": "12.345.678/0001-90",

#   "endereco": "Av. Paulista, 1000"

# }

# 

# &nbsp; Criar Pessoa

# 

# POST /pessoas

# 

# {

#   "nome": "Fulano da Silva",

#   "cpf": "111.222.333-44",

#   "email": "teste@email.com",

#   "empresaId": 1

# }

# 

# &nbsp;Buscar Empresa por ID

# 

# GET /empresas/{id}

# 

# &nbsp;Listar todas as pessoas

# 

# GET /pessoas

# 

# &nbsp;Listar pessoas de uma empresa

# 

# GET /empresas/{id}/pessoas

# 

# &nbsp;Considerações finais (bem sinceras)

# 

# Estou em busca da primeira vaga como desenvolvedor e estou aprendendo bastante com esse tipo de desafio.

# 

# Tentei deixar o código limpo, organizado e com nomes fáceis de entender.

# 

# Escrevi comentários em pontos que achei importante explicar.

# 

# Se alguma coisa puder ser melhorada, fico super aberto a feedback, porque estou evoluindo bastante com essas práticas.

# 

# Obrigado pela oportunidade! 







