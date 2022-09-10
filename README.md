# ⚛️ DS Meta - Semana Spring-React 

![image](https://user-images.githubusercontent.com/101160670/189468561-a156abec-a037-4f0c-b409-cd57b463f139.png)

> Repositório destinado para projeto da semana Spring React do Dev superior. Utilizando Java, JavaScript e Frameworks.
Foram 4 dias de imersão em tecnologias que estão em alta no mercado e utilizando elas na prática.

# Index

- [Aula 1](https://github.com/joaovq/dsmeta-semanaSR-devsuperior#aula-1---estrutura%C3%A7%C3%A3o-do-front-end-com-react)
- [Aula 2](https://github.com/joaovq/dsmeta-semanaSR-devsuperior#aula-2---cria%C3%A7%C3%A3o-do-back-end-java)
- [Aula 3](https://github.com/joaovq/dsmeta-semanaSR-devsuperior#aula-3---integra%C3%A7%C3%A3o-monorepo)
- [Link do projeto](https://github.com/joaovq/dsmeta-semanaSR-devsuperior#finalmente-o-link-do-site)

# 🎯 Objetivo 

O objetivo deste projeto é construir uma aplicação completa, unindo o back end, front end e banco de dados. Com isso, busca-se desenvolver um escopo de um site de controle de vendas, utilizando tecnologias que são bastante utilizadas atualmente, no mercado de trabalho.

> Design feito pelo Acenélio do Dev superior, que foi replicado para o browser. 

![image](https://user-images.githubusercontent.com/101160670/188534400-462d8746-f8dc-4325-947a-e1cbc9db0741.png)

> Web 552px. 

![image](https://user-images.githubusercontent.com/101160670/188534325-3e95d7b8-0340-43a0-880d-e5b6836f3e23.png)

> Para mobile.

![image](https://user-images.githubusercontent.com/101160670/188534828-18e564a5-6515-41e0-b3bc-7470841a44c5.png)

# ☑️ O que o projeto faz??


- Interface gráfica de um site de vendas
- Integração com banco de dados
- Envio de mensagens via sms


# 🧑‍💻 Tecnologias utilizadas no projeto

- [Java Development Kit- jdk 11](https://www.azul.com/downloads/?package=jdk#download-openjdk).
- [Spring Boot](https://spring.io/) 
- [Spring Initializr](https://start.spring.io/)
  - Dependências:
    - Spring Web
    - Spring Java Persistence API (JPA)
    - Spring H2 Database
    - Spring Security
- [Node Js 16](https://nodejs.org/en/)
- [Yarn](https://yarnpkg.com/) 
- ⚛️ [React Framework](https://pt-br.reactjs.org/docs/getting-started.html)

# Aula 1 - Estruturação do Front-end com React

### Nesta primeira aula foi feito:
- Organização das pastas do projeto
- Criação do front end, utilizando React
- Criação do back end, utilizando Spring
- A configuração do ambiente React e construção do escopo do front end.


### Levando como base o protótipo construido no repositório foi possível aprender sobre o framework de JavaScript React e transcrever o projeto, que estava na forma bruta, para o ambiente do browser:

https://github.com/acenelio/dsmeta-css


## Para começar foi preciso...

Para baixar todas as dependências necessárias: 

```shell

# No terminal do projeto
yarn 

```

### Após a construção e instalação das dependências, visualmente, os packages do projeto são organizados da seguinte forma

![image](https://user-images.githubusercontent.com/101160670/188540793-1364abaf-ee69-45be-9808-28fc2f369757.png)


## Do Primeiro componente ao escopo

De inicio, foi desenvolvido o componente de notificação, como podemos acessar pelo link abaixo:
[First Component - Notification Button](https://github.com/joaovq/dsmeta-semanaSR-devsuperior/tree/main/frontend/src/components/NotificationButton)

```typescript
function NotificationButton() {
    return (
        <div className="dsmeta-red-btn">
        <img src={icon} alt="Notificar" />
      </div>
    )
  }
  
  export default NotificationButton
 
```

Como pode ser visto na imagem abaixo, dentro da pasta src, foi criada uma pasta componente e nela colocada cada componente do front end. Com isso, posteriormente, esses componentes serão conectados no arquivo App.tsx.

![image](https://user-images.githubusercontent.com/101160670/188541764-11bfab61-b0cc-4e99-a09f-a50af9e55201.png)

> Estrutura do App.tsx

```typescript
import Header from "./components/Header"
import NotificationButton from "./components/NotificationButton"
import SalesCard from "./components/SalesCard"


function App() {
  return (
    //Para mais de um componente, temos que colocar <> e no final </> (fragment)
    <>
      <Header/>
      {/* //Aqui chamamos o component NotificationButton que criamos para o botão de notificação */}
      <main>
      <section id="sales">
        <div className="dsmeta-container">
          <SalesCard/>
        </div>
        </section>
        </main>
    </>
  )
}

export default App

```

### A partir disso, unindo todas as partes do front end, o resultado parcial do projeto:

![image](https://user-images.githubusercontent.com/101160670/188542641-8b5529b6-3033-4cf2-b03c-4692616d3e31.png)


## 📅 Utilizando o Date Picker e o useState

O DatePicker é um component criado para manipular as data, de forma simples e reutilizavel.

![image](https://cloud.githubusercontent.com/assets/1412392/5339491/c40de124-7ee1-11e4-9f07-9276e2545f27.png)

> Documentação:
 https://github.com/Hacker0x01/react-datepicker

###  Para baixar o package pelo yarn 

```shell
yarn add react-datepicker@4.8.0 @types/react-datepicker@4.4.2

```

### Para utilizarmos o recurso do DataPicker, é necessário importa-lo no component em que vamos utiliza-lo.

No nosso caso, foi necessário utilizar pois, quando integrarmos com o backend, vai ser possível filtrar vendas pelo periodo do ano.

```typescript
import DatePicker from "react-datepicker";
import "react-datepicker/dist/react-datepicker.css";
```

```tsx
<DatePicker
    selected={new Date()}
    onChange={(date: Date) => {}}
    className="dsmeta-form-control"
    dateFormat="dd/MM/yyyy"
/>
```

> Utilizando o DatePicker no front-end

![image](https://user-images.githubusercontent.com/101160670/188542709-7500738a-3f91-4645-8555-8d782873034a.png)

Isso será extremamente útil nas aulas seguintes, quando for possível unir com front-end com o back-end Java e Spring.


# Aula 2 - Criação do Back-end Java

## Objetivos da aula 2

- Implementar o back end
- Acesso a banco de dados
- Criar endpoints da API REST
- Integração com SMS
- Implantação na nuvem

## Construção da estrutura do projeto e da pasta backend

Neste projeto, para a implemetação do back end, foi aplicado anteriormente (na primeira aula) a criação da pasta e a instalação das dependências do preojeto. Para isso, foi utilizado o [Spring Initialzr](https://start.spring.io/) para a implementação do Web service Java, com as seguintes dependências:

 - Spring Web
 - Spring Java Persistence API (JPA)
 - Spring H2 Database
 - Spring Security

Além disso, fora as dependências necessárias para a implementação do projeto, utilizamos um plugin do maven-resource para o app-client (posteriormente necessário para a implementação na nuvem):

- Ajuste feito no arquivo pom.xml

```xml
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-resources-plugin</artifactId>
	<version>3.1.0</version><!--$NO-MVN-MAN-VER$ -->
</plugin>

```

## Configurando a segurança na aplicação

Para habilitar a segurança na aplicação,foi criada uma classe de configuração em que colocamos as Anotations:

- @Configuration - indica para o Spring que é uma classe de configuração e direciona todos as dependências necessárias para o funcionamento da mesma
- @EnableWebSecurity - Habilita as configurações de segurança web para o projeto.
- @Bean - Indica para o Spring que a funcionalidade é um objeto que será gerenciado por um contêiner.

```Java

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		http.headers().frameOptions().disable();
		http.cors().and().csrf().disable();
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		http.authorizeHttpRequests((auth) -> auth.anyRequest().permitAll());

		return http.build();
	}

	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration configuration = new CorsConfiguration().applyPermitDefaultValues();
		configuration.setAllowedMethods(Arrays.asList("POST", "GET", "PUT", "DELETE", "OPTIONS"));
		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		return source;
	}
}
```

COMMIT: Security config

## Implantação do Banco de dados 

O banco de dados (Sistema de Gerenciamento de Banco de Dados - SGBD) utilizado neste projeto é o H2 Database, que é um banco de dados implantado na memória e desta forma foi feita a conexão com a base de dados a partir do Java Persistence API. Os passos feitos para conseguir a conexão e implantação foram:

- Criar entidade Sale
- Fazer mapeamento objeto-relacional (JPA)
- Configurar dados de conexão do banco de dados H2
- Fazer seed do banco de dados

Configuração do application.properties

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

Importando os dados para o SQL (import.sql)

```SQL
INSERT INTO tb_sales(seller_name,visited,deals,amount,date) VALUES ('Barry Allen',121,67,18196.0,'2022-06-16');
INSERT INTO tb_sales(seller_name,visited,deals,amount,date) VALUES ('Logan',26,14,4255.0,'2022-06-14');
INSERT INTO tb_sales(seller_name,visited,deals,amount,date) VALUES ('Padme',55,42,13249.0,'2022-06-14');
INSERT INTO tb_sales(seller_name,visited,deals,amount,date) VALUES ('Padme',73,65,20751.0,'2022-06-10');
INSERT INTO tb_sales(seller_name,visited,deals,amount,date) VALUES ('Logan',47,25,7318.0,'2022-06-04');
INSERT INTO tb_sales(seller_name,visited,deals,amount,date) VALUES ('Kal-El',72,60,15608.0,'2022-06-03');
```

* Esses são alguns dados. Os dados completos estão em : https://github.com/joaovq/dsmeta-semanaSR-devsuperior/blob/main/backend/src/main/resources/import.sql

COMMIT: Database

## Testes de endpoint da API Rest

Para a criação e divisão em camadas de arquitetura Rest, os passos feitos foram estes:

- [Criar repository](https://github.com/joaovq/dsmeta-semanaSR-devsuperior/tree/main/backend/src/main/java/com/bloomin/dsmeta/repository)

- [Criar service](https://github.com/joaovq/dsmeta-semanaSR-devsuperior/tree/main/backend/src/main/java/com/bloomin/dsmeta/service)

- [Criar controller](https://github.com/joaovq/dsmeta-semanaSR-devsuperior/tree/main/backend/src/main/java/com/bloomin/dsmeta/controller)

COMMIT: API Test

## Pesquisa customizada

Consulta customizada:

No Front-end temos a possibilidade de filtrar as vendas por datas. Neste tópico, esse trecho de código vai fazer com que o Java se conecte com o banco de dados que selecione (SELECT) as vendas por data de inicio e de fim.

O repository não tem uma consulta em que filtramos os dados da database por data, então foi criado um método, a partir de uma Query, na interface SaleRepository:



``` Java
@Query("SELECT obj FROM Sale obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC")
Page<Sale> findSales(LocalDate min, LocalDate max, Pageable pageable);

```

COMMIT: Date select

Link: https://github.com/joaovq/dsmeta-semanaSR-devsuperior/tree/main/backend/src/main/java/com/bloomin/dsmeta/repository

Implementação - https://github.com/joaovq/dsmeta-semanaSR-devsuperior/tree/main/backend/src/main/java/com/bloomin/dsmeta/service

## Configuração da Twilio para envio de SMS

Twilio é uma empresa americana com sede em San Francisco, Califórnia, que fornece ferramentas de comunicação programáveis para fazer e receber chamadas telefônicas, enviar e receber mensagens de texto e realizar outras funções de comunicação usando suas APIs de serviço da web.

Neste caso, vamos utilizar para enviar mensagens para os vendedores através do backend ligado ao frontend. A partir disso, os passos para implementação do serviço de sms da Twilio é: 

- Dependências Maven do Twilio (pom.xml)

```xml
<dependency>
	<groupId>com.twilio.sdk</groupId>
	<artifactId>twilio</artifactId>
	<version>8.31.1</version>
</dependency>
```

### Utilização das variavéis de ambiente
  - Mas por que utilizar?
    Utilizamos para que dados pessoais (geralmente) não fiquem expostos no código.
    
### Configurando no Intellij

Variáveis de ambiente no application.properties:

```properties

twilio.sid=${TWILIO_SID}
twilio.key=${TWILIO_KEY}
twilio.phone.from=${TWILIO_PHONE_FROM}
twilio.phone.to=${TWILIO_PHONE_TO}
```

1. Passo: Configuração no application.properties


![Untitled](https://user-images.githubusercontent.com/101160670/189197830-e2ce2d77-60c9-4a3a-8806-6410304b8fcb.png)

2. Passo: Run configurantion

No Run do intellij, mostrado na imagem, clicar em Edit configuration.
![Untitled (1)](https://user-images.githubusercontent.com/101160670/189197859-1a5bf967-225b-406e-950e-c1d1d6b0fc8e.png)
![Untitled (2)](https://user-images.githubusercontent.com/101160670/189197900-7cdd0f72-3176-4694-9f79-8bc475b2da64.png)


3. Inserir as variáveis de ambiente

É possível inserir as variavéis em um campo único:

```propeties
KEY=value; KEY=value
```

![Untitled (3)](https://user-images.githubusercontent.com/101160670/189198032-fc6b2f3f-332c-4169-8783-8f51f310adc1.png)

Ou, clicando no $, podemos colocar em forma de tabela.

![image](https://user-images.githubusercontent.com/101160670/189198492-6d664e76-a698-43e6-bf54-efc0549a7ee1.png)


### Criação da classe SmsService

- classe SmsService: https://github.com/joaovq/dsmeta-semanaSR-devsuperior/blob/main/backend/src/main/java/com/bloomin/dsmeta/service/impl/SmsServiceImpl.java

COMMIT: Twilio Sms

## Deploy no heroku

- Arquivo ``system.properties``

Para o jdk versão 11, a configuração do funcionamento da aplicação no heroku vai ser para a versão 11. Utilizamos assim:

```properties
java.runtime.version=11

```

* Para a versão desejada, basta apenas mudar a versão.

Passos feitos:

- Criar app no Heroku
- Definir variáveis de ambiente:
  -TWILIO_SID
  -TWILIO_KEY
  -TWILIO_PHONE_FROM
  -TWILIO_PHONE_TO
  
 Finalmente, para fazer o deploy da API, aplicamos os seguintes passos no terminal, dentro da pasta em que está o projeto:
 
 ```shell
 heroku -v
heroku login
heroku git:remote -a <nome-do-app>
git remote -v
git subtree push --prefix backend heroku main
 ```
 
# Aula 3 - Integração monorepo

- Integrar back end e front end
- Implantar o front end

## Instalação do Axios e useEffect 

- Link: SalesCard - https://github.com/joaovq/dsmeta-semanaSR-devsuperior/blob/main/frontend/src/components/SalesCard/index.tsx

Axios é um cliente HTTP baseado-em-promessas para o node.js e para o navegador. É isomórfico (= pode rodar no navegador e no node.js com a mesma base de código). No lado do servidor usa o código nativo do node.js - o modulo http, enquanto no lado do cliente (navegador) usa XMLHttpRequests.

### Documentação
- https://axios-http.com/ptbr/docs/intro

useEffect

O Effect Hook (Hook de Efeito) te permite executar efeitos colaterais em componentes funcionais. Quando rodamos a aplicação, eles vai entender os efeitos de mudanças na API. 
Buscar dados, configurar uma subscription, e mudar o DOM manualmente dentro dos componentes React são exemplos de efeitos colaterais. Para isto, utilizamos os hooks para nos auxiliar nestas tarefas e neste caso, especialmente, utilizaremos o useEffect.

### Documentação useEffect
- https://pt-br.reactjs.org/docs/hooks-effect.html


```shell
# instalação do pacote de dependências do axios
yarn add axios@0.27.2
```

- Teste de utilização

No Sales card, utilizamos o useEffect como teste:

```typescript
useEffect(() => {  
    console.log('Teste')
  }, []);
```

Resultado:
![image](https://user-images.githubusercontent.com/101160670/189415286-8748ef64-daf0-476a-a41e-ac8b482d2722.png)


Após feito o teste e confirmar que está funcionando, utilizamos o useEffect para testar uma requisição, que é o nosso objetivo:

O ``axios.get()`` retorna um objeto chamado Promise. O Promise é um objeto que retorna uma operação que pode dar certo ou falhar e dessa forma utilizamos o ``then()``, caso der certo. Colocamos uma função para esse objeto fazer quando tiver resposta:

No caso abaixo, vamos mostrar no console a resposta dos dados do Promise(na variavel response):

```typescript
 useEffect(() => {  
    axios.get("http://localhost:8080/sales/findSales").then(response => {
      console.log(response.data);
    });
  }, []);

```

Resultado:

![image](https://user-images.githubusercontent.com/101160670/189418155-364ae01e-6d5d-4980-9586-846e8a6d0bfe.png)


COMMIT: Axios, useEffect first request


## Listagem de vendas

- Link: SalesCard - https://github.com/joaovq/dsmeta-semanaSR-devsuperior/blob/main/frontend/src/components/SalesCard/index.tsx

Na pasta do projeto do frontend, criamos uma pasta chamada ``utils`` e dentro dela um arquivo chamado ``request.ts``. O objetivo é pegar a listagem de vendas do banco de dados e utilizar no front end.

Definição da BASE_URL(Colocamos dentro do arquivo):

O  objetivo é colocar uma url base para a requisição.

Neste caso, ele vai pegar uma variável de ambiente se existir. Se não existir, por padrão, vai utilizar o localhost:8080

```typescript
export const BASE_URL = import.meta.env.VITE_BACKEND_URL ?? "http://localhost:8080";
```

- No SalesCard

ATENÇÃO: No lugar de aspas duplas (""), colocamos crase (` `) para funcionar. 

```typescript
 useEffect(() => {  
    axios.get(`${BASE_URL}/sales/findSales`).then(response => {
      console.log(response.data);
    });
  }, []);
```

### Criação da pasta models

Foi criado uma pasta chamada ``models`` e dentro dela um arquivo chamado ``sale.ts`` para definirmos o tipo de dado.

```typescript
export type Sale = {
    id: number; 
    name: string; 
    visited: number; 
    deals: number; 
    amount: number;
}
```
Após isto, no SalesCard, vamos criar um useState para armazenar essa lista de vendas. Com isso, o objetivo é atualizar o nome dos vendedores e  os dados diretamente do banco de dados.

COMMIT: Sale listing

## Passando as datas como argumento.

Para filtrarmos pelas data, vamos passar na requisição a data minima e a data máxima.

Fizemos o tratamento das datas minDate e maxDate colocando no padrão do backend. Após isso, colocamos então pelo react, no ``useEffect()``, as variaveis no lugar das datas.

Requisição: http://localhost:8080/sales/findSales?minDate=2021-11-21&maxDate=2022-05-04

```typescript
 useEffect(() => {
    
    const dMin = minDate.toISOString().slice(0,10);

    const dMax = maxDate.toISOString().slice(0,10);


    axios.get(`${BASE_URL}/sales/findSales?minDate=${dMin}&maxDate=${dMax}`).then(response => {
      setSales(response.data.content)
    });
  }, []);

```

## Envio de notificação através do Front - end

Utizamos os props, que são os parâmetros que um componente do react pode receber. Isso vai fazer com que o click no botão vai enviar a notificação através do back-end.

```typescript

type Props = {
  saleId:number;
}

function NotificationButton({saleId}: Props) {

  function handleClick(id:number){
    axios(`${BASE_URL}/sales/${id}/notification`).then(response =>{
      console.log("Sucesso");
    })
  }
    return (
        <div className="dsmeta-red-btn" onClick={()=>{
          handleClick(saleId);
        }}>
        <img src={icon} alt="Notificar" />
      </div>
    )
  }

```

Quando chamamos o componente em outro componente, precisamos passar o props para a função funcionar.

```typescript

<NotificationButton saleId={sale.id} />

```
COMMIT: Send notification

## Mensagem Toast de Confirmação.

Vamos utilizar o Toastfy, que é uma biblioteca utilizada para criar mensagens toasts

Link: https://www.npmjs.com/package/react-toastify


- Para istalar a biblioteca no projeto
```shell
yarn add react-toastify@9.0.5

```

No App.tsx:

```typescript
import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';

// No inicio da função (return)

<ToastContainer/>
```

COMMIT: Toast

## Deploy no netlify

https://www.netlify.com/

Antes de qualquer coisa,  foi colocado  ``window.React = React`` no seu main.tsx conforme abaixo, e salve um novo commit:

```typescript
import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App'
import './index.css'

window.React = React

ReactDOM.createRoot(document.getElementById('root') as HTMLElement).render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
)
```

COMMIT: window.React main.tsx

- Deploy básico

	- Base directory: frontend
	- Build command: yarn build
	- Publish directory: frontend/dist
	- Variáveis de ambiente:
	   - VITE_BACKEND_URL
	- Configurações adicionais

- Netlify config

![image](https://user-images.githubusercontent.com/101160670/189469898-fcb0e904-e0f4-4414-8e47-73fe8c292b19.png)

![image](https://user-images.githubusercontent.com/101160670/189470086-3df06cc2-f18b-4287-a7d4-b2288841b7e2.png)



Site settings -> Domain Management: (colocar o nome que você quiser)
Deploys -> Trigger deploy

## Finalmente, o link do site

Link: https://dsmeta-joaovq.netlify.app/


# 🏆 Desafios Pessoais

- [ ] Implementar a API do Swagger, para manutenção da aplicação e aprendizagem.
- [ ] Pesquisar e adicionar na aplicação, dois ou mais recursos do React.
- [ ] Ao invés do h2, utilizar o mySQL ou qualquer outro banco de dados na aplicação.

# 💡 Como os Usuários podem usar esse projeto?

## Para clonar esse projeto, faça:  

### 1. **Na página principal do projeto, clique em code:**

![Code](https://user-images.githubusercontent.com/101160670/174395306-b1145b8b-f68e-4cb5-9842-f491224f6c40.PNG)


### 2.  **Copie o link:**

![Clonar](https://user-images.githubusercontent.com/101160670/174395320-7c6b66d2-8195-40d2-b857-8f5a94749213.PNG)



### 3.  **Faça o git clone no Git:**

![git clone](https://user-images.githubusercontent.com/101160670/174393044-ed51c1b3-05a2-4f26-890c-b869774b5420.PNG)

### 4. **Só alegria!!!** 👏👏👏

# Quem mantém e contribui com o projeto

Sinta-se a vontade em ajudar e dar algumas dicas, a sua ajuda será bem-vinda!!! Aceito pullrequests, commits, merges e afins...

# Dúvidas e ajuda.

Perguntar para mim em:

#### [Linkedin do João](https://www.linkedin.com/in/joaovitorqueiroz/)
