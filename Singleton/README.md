# Design Patterns Java - Singleton
A ideia deste pattern é garantir que apenas uma instância de um determinado objeto foi criado.
Este conceito é utilizado em alguns casos que não podemos criar muitos objetos do mesmo tipo por alguma razão.
Este conceito pode ser aplicado por exemplo as classes que realizam comunicação Http com recursos externos ou ainda a conexão com o banco de dados, nestes casos queremos que exista apenas um objeto criado e que toda a aplicação utilize este objeto.

Por padrão no Java, todos os métodos anotados com @Bean tornam-se singleton.
