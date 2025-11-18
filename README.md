# 🚀 FastPays API — Desafio Técnico (Java + Spring Boot)

Este projeto foi desenvolvido para o processo seletivo da **FastPays**.  
Tentei deixar tudo o mais simples e organizado possível, seguindo exatamente o que o desafio solicitava.

Foi uma boa oportunidade para treinar:
- Java
- Spring Boot
- Docker
- PostgreSQL
- Testes unitários
- Estruturação de API REST na prática

---

#  Tecnologias Utilizadas

Usei algumas tecnologias que já conhecia e outras que estou aprendendo agora:

- Java 17  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- PostgreSQL  
- Docker / Docker Compose  
- JUnit 5  
- Mockito  
- Maven  

Tentei manter tudo simples, direto e padronizado.

---

#  O que a API faz

O sistema permite:

- Cadastrar empresas  
- Cadastrar pessoas vinculadas a uma empresa  
- Listar todas as pessoas  
- Listar pessoas de uma empresa específica  
- Buscar empresa por ID  

O desafio também pedia para:

- limpar CPF/CNPJ (deixar apenas números)  
- validar CPF  

Isso foi implementado em classes auxiliares na pasta `util`.

---

#  Como funciona a limpeza de CPF/CNPJ

Quando o usuário envia:

"111.222.333-44"
"12.345.678/0001-90"

O sistema converte para:

"11122233344"
"12345678000190"

Isso deixa o banco padronizado e facilita consultas futuras.

#  Testes Unitários

Foram criados testes focados **nas regras de negócio**, conforme solicitado:

✔ validar CPF  
✔ limpar strings (remover pontos, traços e barras)  
✔ regras básicas de criação de pessoa  
✔ rejeitar CPF inválido  
✔ garantir que a empresa exista  

Ainda estou aprendendo testes, então tentei deixar tudo simples e direto ao ponto.

Para rodar os testes:

bash
mvn test

 Estrutura do Projeto

src/main/java/com/fastpays/
 ├── controller  → rotas/endpoints da API
 ├── service     → regras de negócio
 ├── repository  → comunicação com o banco via JPA
 └── util        → validação e limpeza de documentos (CPF/CNPJ)

src/main/resources/
 └── application.properties → configurações da aplicação
Tentei seguir o padrão mais comum de projetos Spring Boot.

 Como rodar o projeto (Docker)
A maneira mais simples de rodar tudo é usando Docker.

1. Clonar o repositório

git clone https://github.com/Kaicky_Albuquerque/fastpays-backend-test


2. Subir a aplicação

docker compose up --build
Esse comando irá:

subir o banco PostgreSQL

subir a API Spring Boot

criar as tabelas automaticamente

A API estará disponível em:

 http://localhost:3000

 Como rodar os testes
mvn test

 Endpoints da API
Criar Empresa
POST /empresas

json

{
  "nome": "FastPays Tecnologia",
  "cnpj": "12.345.678/0001-90",
  "endereco": "Av. Paulista, 1000"
}
Criar Pessoa
POST /pessoa

json

{
  "nome": "Fulano da Silva",
  "cpf": "529.982.247-25",
  "email": "teste@email.com",
  "empresa": {
    "id": 1
  }
}

 Importante:

CPF passa por validação real

A empresa deve existir

O campo correto é empresa: { "id": 1 }

Buscar Empresa por ID
GET /empresas/{id}

Listar todas as pessoas
GET /pessoas

Listar pessoas de uma empresa
GET /empresas/{id}/pessoas

 Considerações finais
Estou em busca da minha primeira oportunidade como desenvolvedor e esse desafio foi uma ótima experiência prática.
Tentei fazer um código simples, organizado e fácil de entender.

Também deixei comentários nos pontos que achei importante explicar.

Se algo puder ser melhorado, fico totalmente aberto a feedback — estou aprendendo muito com esse tipo de projeto.

Obrigado pela oportunidade! 
