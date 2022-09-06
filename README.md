# ⚛️ DS Meta - Semana Spring-React 
> Repositório destinado para projeto da semana Spring React do Dev superior. Utilizando Java, JavaScript e Frameworks.
Foram 4 dias de imesão em tecnologias que estão em alta no mercado e utilizando elas na prática.

# 🎯 Objetivo 

O objetivo deste projeto é construir uma aplicação completa, unindo o back end, front end e banco de dados. Com isso, busca-se desenvolver um escopo de um site de controle de vendas, utilizando tecnologias que são bastante utilizadas atualmente, no mercado de trabalho.

> Design feito pelo Acelino do Dev superior, que foi replicado para o browser. 

![image](https://user-images.githubusercontent.com/101160670/188534400-462d8746-f8dc-4325-947a-e1cbc9db0741.png)

> Web 552px. 

![image](https://user-images.githubusercontent.com/101160670/188534325-3e95d7b8-0340-43a0-880d-e5b6836f3e23.png)

> Para mobile.

![image](https://user-images.githubusercontent.com/101160670/188534828-18e564a5-6515-41e0-b3bc-7470841a44c5.png)

# O que o projeto faz??


- Interface gráfica de um site de vendas
- Integração com banco de dados
- Envio de mensagens via sms


# Tecnologias utilizadas no projeto

- [Java Development Kit- jdk 11](https://www.azul.com/downloads/?package=jdk#download-openjdk).
- [Spring Boot](https://spring.io/) 
- [Node Js 16](https://nodejs.org/en/)
- [Yarn](https://yarnpkg.com/) 
- ⚛️ [React Framework](https://pt-br.reactjs.org/docs/getting-started.html)

# Aula 1

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


## Utilizando o Date Picker e o useState

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
