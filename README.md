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



Tratamento de exception da regra de negócio:

Postman:
{
"timestamp": "2022-05-20T19:45:04.335+00:00",
"status": 500,
"error": "Internal Server Error",
"trace": "com.algaworks.logistic.logisticapi.domain.exception.NegocioException: Já existe cliente cadastrado com esse e-mail\n\tat com.algaworks.logistic.logisticapi.domain.service.CatalogoClienteService.salvar(CatalogoClienteService.java:24)\n\tat com.algaworks.logistic.logisticapi.domain.service.CatalogoClienteService$$FastClassBySpringCGLIB$$5391f90.invoke(<generated>)\n\tat org.springframework.cglib.proxy.MethodProxy.invoke(MethodProxy.java:218)\n\tat org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.invokeJoinpoint(CglibAopProxy.java:783)\n\tat org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163)\n\tat org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:753)\n\tat org.springframework.transaction.interceptor.TransactionInterceptor$1.proceedWithInvocation(TransactionInterceptor.java:123)\n\tat org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:388)\n\tat org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:119)\n\tat org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)\n\tat org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:753)\n\tat org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:698)\n\tat com.algaworks.logistic.logisticapi.domain.service.CatalogoClienteService$$EnhancerBySpringCGLIB$$d6394588.salvar(<generated>)\n\tat com.algaworks.logistic.logisticapi.api.controller.ClienteController.adicionar(ClienteController.java:40)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:205)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:150)\n\tat org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:117)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:895)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:808)\n\tat org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87)\n\tat org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1067)\n\tat org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963)\n\tat org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)\n\tat org.springframework.web.servlet.FrameworkServlet.doPost(FrameworkServlet.java:909)\n\tat javax.servlet.http.HttpServlet.service(HttpServlet.java:681)\n\tat org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)\n\tat javax.servlet.http.HttpServlet.service(HttpServlet.java:764)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:227)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:162)\n\tat org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:53)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:189)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:162)\n\tat org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:189)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:162)\n\tat org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:189)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:162)\n\tat org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:189)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:162)\n\tat org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:197)\n\tat org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:97)\n\tat org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:540)\n\tat org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:135)\n\tat org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:92)\n\tat org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:78)\n\tat org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:357)\n\tat org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:382)\n\tat org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:65)\n\tat org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:895)\n\tat org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1732)\n\tat org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49)\n\tat org.apache.tomcat.util.threads.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1191)\n\tat org.apache.tomcat.util.threads.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:659)\n\tat org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61)\n\tat java.base/java.lang.Thread.run(Thread.java:829)\n",
"message": "Já existe cliente cadastrado com esse e-mail",
"path": "/clientes"
}

Tratamento de mensagem de exceção da regra de negócio

Regra de negócio:
Impedir o cadastro de cliente com o e-mail duplicado

Resposta:
{
"status": 400,
"dateTime": "2022-05-20T17:00:11.325687",
"titulo": "Já existe cliente cadastrado com esse e-mail",
"campos": null
}

No caso acima não é necessário apresentar essa propriedade campos, pois sempre será null.

Solução:

Na classe Problem anotar com @JsonInclude(JsonInclude.Include.NON_NULL)
Essa anotação apresenta somente propriedades com os valores não nulos.

resposta postman:
{
"status": 400,
"dateTime": "2022-05-20T17:12:26.245878",
"titulo": "Já existe cliente cadastrado com esse e-mail"
}


Para proteger os dados do modelo da api. Na classe entrega adicionar a anotação @JsonProperties(Access = Access.READY_ONLY)
{
"id": 2,
"cliente": {
"id": 1,
"nome": "Itamara",
"email": "ita@logistic.com",
"telefone": "55 11 99747-1179"
},
"destinatario": {
"nome": "Itamara",
"logradouro": "Rua Carneiro Leão",
"numero": "290",
"complemento": "Bloco 3 apto 134",
"bairro": "Brás"
},
"status": "PENDENTE",
"taxa": 100.50,
"data_do_pedido": "2022-05-23T13:50:07.828873",
"data_pedido_finalizado": null
}

Ao submeter uma entrega e não for preenchido os dados ou alguma propriedade do destinatário
no postman e console o erro mostrado:
{
"timestamp": "2022-05-25T11:50:03.170+00:00",
"status": 500,
"error": "Internal Server Error",
"trace": "org.springframework.dao.DataIntegrityViolationException: could not execute statement;...
"message": "could not execute statement;... 
"path": "/entregas"
}

Para tratar esse erro e retornar o correto, é necessário:
- Validar a propriedade de Entrega com as anotações @Valid e @NotNull em destinatário;
- E na classe Destinatario anotar as propriedades com @NotBlank

Retorno da resposta:
{
"status": 400,
"dateTime": "2022-05-25T09:13:30.966942",
"titulo": "Um ou mais campos estão inválidos. Faça o preenchimento correto e tente novamente.",
"campos": [
{
"nome": "destinatario.nome",
"mensagem": "é obrigatório"
}
]
}


##Isolando o Domain Model do Representation Model

padrão DTO

retorno do objeto no postman
GET localhost:8080/entregas/{entregaId}
{
"id": 2,
"nomeCliente": "Itamara",
"taxa": null,
"status": null,
"dataPedido": null,
"dataFinalizacao": null,
"destinatario": {
"nome": "Itamara",
"logradouro": null,
"numero": null,
"complemento": null,
"bairro": "Brás"
}
}

Na classe EntregaModel modificar a propriedade nomeCliente para a classe ClienteResumoModel

retorno postman sem a classe criada
[
{
"id": 1,
"nomeCliente": "Itamara",
"taxa": 100.50,
"status": "PENDENTE",
"dataPedido": null,
"dataFinalizacao": null,
"destinatario": {
"nome": "Itamara",
"logradouro": "Rua Carneiro Leão",
"numero": "290",
"complemento": "Bloco 3 apto 134",
"bairro": "Brás"
}
}
]

retorno com a classe ClienteResumoModel

[
{
"id": 1,
"cliente": {
"id": 1,
"nome": "Itamara"
},
"taxa": 100.50,
"status": "PENDENTE",
"dataPedido": null,
"dataFinalizacao": null,
"destinatario": {
"nome": "Itamara",
"logradouro": "Rua Carneiro Leão",
"numero": "290",
"complemento": "Bloco 3 apto 134",
"bairro": "Brás"
}
}
]



Ao implementar o sub-recurso ocorrencias
Ao submeter a requisição e estiver com o entregaId inexistente retorna:
{
"status": 400,
"dateTime": "2022-05-26T11:47:12.738256-03:00",
"titulo": "Entrega não encontrada"
}

O correto é retornar 404

{
"status": 404,
"dateTime": "2022-05-26T13:26:25.677253-03:00",
"titulo": "Entidade não encontrada"
}

Solução: criada uma nova exception que herda NegocioException e adiciona no handler o método da nova exception criada passando o status 404
