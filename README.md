# conteinerDockerSpringBoot

## Como testar?
  Clone o repositório.<br>
  Acesse a pasta clonada via terminal.<br>
  Execute os seguintes comandos:<br>
   - mvn clean
   - mvn install
   - docker build -f Dockerfile -t springdocker .
   - docker run -p 8080:8080 springdocker
   
## url   
  http://localhost:8080/
