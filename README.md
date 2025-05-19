<h1 align="center">
  MyCodeBlog
</h1>

Aplicação web para publicação de posts de blog com funcionalidades básicas de CRUD. Desenvolvido com foco em aprendizado e prática de desenvolvimento Java com Spring Boot.

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Thymeleaf](https://www.thymeleaf.org/)
- [PostgreSQL](https://www.postgresql.org/)
- [Amazon Elastic Beanstalk](https://aws.amazon.com/elasticbeanstalk/)

## Práticas adotadas

- Validação com Bean Validation (`@Valid`, `@NotBlank`)
- Padrões SOLID e boas práticas como KISS e DRY
- Estrutura MVC
- Templates com Thymeleaf
- Deploy com AWS Elastic Beanstalk

## Como Executar

- Clonar o repositório:

```
$ git clone https://github.com/henrymori/mycodeblog.git
$ cd mycodeblog
```

- Configurar as credenciais do banco PostgreSQL em `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://<SEU_HOST>:5432/<SEU_BANCO>
spring.datasource.username=<SEU_USUARIO>
spring.datasource.password=<SUA_SENHA>
spring.jpa.hibernate.ddl-auto=update
```

- Construir o projeto:

```
$ ./mvnw clean package
```

- Executar a aplicação:

```
$ java -jar target/mycodeblog-0.0.1-SNAPSHOT.jar
```

A aplicação estará disponível em [http://localhost:8080/posts](http://localhost:8080/posts)

## Funcionalidades

- Criar um novo post
- Listar todos os posts
- Visualizar um post individual
- Validação de campos obrigatórios (título, autor, texto)

## Estrutura de Endpoints

| Método | Caminho         | Descrição                                  |
|--------|------------------|---------------------------------------------|
| GET    | `/posts`         | Lista todos os posts                        |
| GET    | `/posts/{id}`    | Exibe os detalhes de um post específico     |
| GET    | `/newpost`       | Formulário de criação de novo post          |
| POST   | `/newpost`       | Salva um novo post                          |

---

Feito por [Henry Mori](https://github.com/henrymori)
