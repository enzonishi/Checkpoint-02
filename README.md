# Ping

Aplicação Java com container para exemplo

## Pré-requisitos

-Java 17+
-Docker
-Acesso a internet
-Acesso ao Docker Hub

## Instalação

### Clone

```
https://github.com/enzonishi/Checkpoint-02.git
```

## Execução

#### Docker

* Criar imagem

 ```
docker build -t Checkpoint-02 .
```

* Executar container

spring.profiles.active=<prd|dev|stg>

```
docker run -d -p 8080:8080 -e PROFILE=<prd|dev|stg> Checkpoint-02
```

## Container Registry

#### Docker Hub
* Login

```
docker login -u enzonishi
```

* Criar imagem pronta para upload (método 1 - criando nova imagem)

```
docker build -t fiap-Checkpoint-02 .
```

* Criar imagem pronta para upload (método 2 - renomeando imagem existente)

```
docker tag checkpoint2 enzonishi/Checkpoint-02
```

* Upload de imagem para o Docker Hub

```
docker push enzonishi/Checkpoint-02
```
 
*Comando docker para executar a aplicação a partir do docker hub com o profile "dev" (desenvolvimento) - H2

- Para acessar colocar as seguintes informações:
- Username: sa
- Password: password
- Url: jdbc:h2:mem:testdb

```
docker run -d -p 8080:8080 -e PROFILE=dev enzonishi/Checkpoint-02
```

*Comando docker para executar a aplicação a partir do docker hub com o profile "prd" (produção) - Oracle SQL developer

- Para acessar colocar as seguintes informações:
- Username: rm93488
- Password: password
- Url: jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl

```
docker run -d -p 8080:8080 -e PROFILE=prd enzonishi/Checkpoint-02
```
 
*Comando docker para executar a aplicação a partir do docker hub com o profile "stg"(stagging - homologação) - MySQL

- Para acessar colocar as seguintes informações:
- Username: root
- Password: root_pwd
- Url: jdbc:mysql://localhost:3306/rh?createDatabaseIfNotExist=true

```
docker run -d -p 8080:8080 -e PROFILE=stg enzonishi/Checkpoint-02 
```

#### Navegação

- Base

http://localhost:8080

## Features (Funcionalidades)
- Múltiplos profiles
- Banco de dados relacional

## Membros
- Enzo Yuta Nakamura Onishi - enzo.onishi@gmail.com
