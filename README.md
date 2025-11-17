# Cities API

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-blue"> 
  <img src="https://img.shields.io/badge/Spring%20Boot-3.x-success"> 
  <img src="https://img.shields.io/badge/PostgreSQL-16-blue"> 
  <img src="https://img.shields.io/badge/Status-Ativo-brightgreen"> 
  <img src="https://img.shields.io/badge/Licença-MIT-lightgrey">
</p>

---

## 📘 Sobre o Projeto

A **Cities API** é uma aplicação REST desenvolvida em **Java Spring Boot** que fornece dados estruturados sobre **países, estados e cidades**, incluindo cálculo de distância entre duas cidades.
O projeto segue boas práticas de arquitetura, organização e documentação.

---

## 📑 Sumário

1. [Visão Geral](#visão-geral)
2. [Tecnologias Utilizadas](#tecnologias-utilizadas)
3. [Funcionalidades](#funcionalidades)
4. [Endpoints](#endpoints)
5. [Arquitetura](#arquitetura)
6. [Deploy](#deploy)
7. [Contribuição](#contribuição)
8. [Licença](#licença)

---

## Visão Geral

O projeto foi criado com foco em:

* Separação clara de camadas (**Controller**, **Service**, **Repository**)
* Conexão com banco de dados remoto na **Render**
* Manutenção simples e escalável
* Respostas padronizadas e consistentes

---

## Tecnologias Utilizadas

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* PostgreSQL 16
* Maven
* Render (deploy)

---

## Funcionalidades

* Consulta de países
* Consulta de estados
* Consulta de cidades
* Cálculo de distância entre cidades (`by-point` e `by-cube`)
* Integração completa com PostgreSQL

---

## Endpoints

### 📍 Tabela de Endpoints

| Método | Rota          | Descrição                                    |
| ------ | ------------- | -------------------------------------------- |
| GET    | **/paises**   | Lista todos os países                        |
| GET    | **/estados**  | Lista todos os estados                       |
| GET    | **/cidades**  | Lista todas as cidades                       |
| GET    | **/by-point** | Calcula distância entre cidades usando POINT |
| GET    | **/by-cube**  | Calcula distância entre cidades usando CUBE  |

---

## Arquitetura

```
src/
 └── main/
     ├── java/
     │   └── com.felipe.citiesapi
     │       ├── controller/
     │       ├── service/
     │       ├── repository/
     │       └── model/
     └── resources/
         ├── application.properties
         └── data.sql / schema.sql (opcional)
```

Arquitetura pensada para facilitar manutenção e futuras expansões.

---

## Deploy

A API está disponível publicamente via **Render**:
**[https://cities-api-0il5.onrender.com](https://cities-api-0il5.onrender.com)**

---

## Contribuição

Contribuições são bem-vindas!
Sinta-se à vontade para abrir **issues** ou enviar **pull requests**.

---

## Licença

Licenciado sob **MIT License**. Você pode usar, estudar e modificar o código livremente.
