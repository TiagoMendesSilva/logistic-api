# logistic-api

### Content Negotiation:
Quando o consumidor da api pode dizer qual formato será aceito na resposta.

Postman -> header - Accept: application/xml

código de status, caso o servidor não esteja preparado para aceitar o tipo desejado.

406 Not Acceptable

Para aceitar como resposta a representação xml adicionar no pom a dependência:

<dependency>
    <groupId>com.fasterxml.jackson.dataformat</groupId>
    <artifactId>jackson-dataformat-xml</artifactId>
</dependency>

A biblioteca jackson é utilizada para serializar e deserializar os objetos, ou seja, transformar os tipos.



