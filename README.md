# Semana da Imersão Java - Alura

## Aula 1:

![2022-07-23 2](https://user-images.githubusercontent.com/57844726/180657572-fd4ee968-5844-4e81-a8b2-14a275178a6a.png)

Foi feito um app em Java para consumir uma API do site IMDB e baixar um arquivo JSON com a lista dos 250 melhores filmes, esse JSON é parseado e posteriormente impresso de forma organizada no terminal da IDE.

### Tecnologias utilizadas: 
- `VS Code`
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



