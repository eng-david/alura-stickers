# Semana da Imersão Java - Alura
Este projeto foi desenvolvido durante a **semana imersão Java da Alura** e consiste em consumir conteúdo de APIs e gerar imagens personalizadas com fundo transparente, que podem ser utilizadas como stickers (figurinhas) em aplicativos de mensagens.

## Aula 1:

![2022-07-23 2](https://user-images.githubusercontent.com/57844726/180657572-fd4ee968-5844-4e81-a8b2-14a275178a6a.png)

Foi feito um app em Java para consumir uma API do site IMDB e baixar um arquivo JSON com a lista dos 250 melhores filmes, esse JSON é parseado e posteriormente impresso de forma organizada no terminal da IDE.

### Tecnologias utilizadas: 
- `VS Code IDE`
- `Java`
- `Microservices`
- `API`
- `JSON`
- `Regular Expressions`


## Aula 2:
![2022-07-23 (1)](https://user-images.githubusercontent.com/57844726/180657899-b1417c99-d066-4381-be7c-05a1688dc8b3.png)

Criada a classe StickerGenerator que recebe um InputStream de uma imagem, adiciona um texto com fundo transparente na imagem e salva o arquivo, que pode ser usada como figurinhas do Whatsapp.

### Recursos adicionados:
- O texto da figurinha será a nota do filme com base na API do IMDB;
- O texto foi centralizado na figurinha;
- A fonte do texto foi alterada para "Impact" que é a fonte geralmente utilizada em memes na internet.

### Tecnologias utilizadas:
- `Java Graphics2D`
- `Java InputStream`

## Aula 3:
![Captura de tela 2022-07-24 171254](https://user-images.githubusercontent.com/57844726/180664212-05142ade-056a-44f6-872c-ee7996bb55a0.png)

O código foi melhorado com as refatorações necessárias para torná-lo mais flexível e fácil de entender, adicionando uma classe de conteudo (content), requisição HTTP, classes extratoras para o IMDB e NASA, e uma interface que abstrai essas extratoras.
Além disso foi adicionada compatibilidade com a API da NASA que vai trazer imagens astronômicas interessantes.

### Recursos adicionados:
- Adicionada uma classe Enum que une, como configurações, a URL da API e o extrator utilizado.

### Palavras Chave:
- `Refatoração`
- `Clean Code`
- `Orientação a objetos`
- `Encapsulamento de código`
- `Design Patterns`
- `Interface Java`

## Aula 4:

![indice2](https://user-images.githubusercontent.com/57844726/183256574-413c29a7-a1c4-4a3a-aac1-d486d7bc6d9f.jpg)

Construida uma [API REST](https://github.com/eng-david/linguagens-api) para expor nosso próprio conteudo dessa vez relacionado as linguagens de programação mais populares, utilizando ferramentas profissionais como o Spring Framework e um banco de dados NoSQL.<br>

Foi adicionada uma classe extratora para o conteudo da API criada, dessa forma será possivel criar figurinhas com as imagens das linguagens de programação.

### Tecnologias utilizadas:
- `MAVEN`
- `SPRING`
- `REST`
- `NoSQL`
- `MongoDB`

## Aula 5:

![Captura de tela 2022-07-26 114821](https://user-images.githubusercontent.com/57844726/181037937-43eb90b6-4add-4d65-b572-e73573efacce.png)

Foi feito o Deploy da aplicação como um serviço Web na nuvem, utilizando a plataforma Heroku.<br>
Dessa forma o serviço pode ser acessado por qualquer pessoa na internet através do endereço: https://djr-api-languages.herokuapp.com/languages

### Tecnologias utilizadas:
- `Heroku PaaS`

