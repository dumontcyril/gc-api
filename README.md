# Commandes

## Mysql 

```bash
docker run -d --name tp-mysql -e MYSQL_ROOT_PASSWORD=pass -e MYSQL_DATABASE=gestionclient -v c:\mysql:/var/lib/mysql mysql:5.7
```

Test de _mysql_

```bash
docker exec -it tp-mysql mysql -ppass
```

## Eureka

```bash
docker run -d --name tp-registry gc-registry:0.0.1-SNAPSHOT
```

## API

```bash
docker run -d --name tp-api -e SPRING_DATASOURCE_URL=jdbc:mysql://bdd-server:3306/gestionclient --link tp-mysql:bdd-server -e SPRING_DATASOURCE_USERNAME=root -e SPRING_DATASOURCE_PASSWORD=pass -e APP_REGISTRY_HOST=eureka:8761 --link tp-registry:eureka -l "traefik.http.routers.api.rule=PathPrefix(``/api``)" -l traefik.enable=true gc-api:1.0-SNAPSHOT
```

## WEB

```bash
docker run -d --name tp-web -e APP_REGISTRY_HOST=eureka:8761 --link tp-registry:eureka -l "traefik.http.routers.web.rule=PathPrefix(``/``)" -l traefik.enable=true gc-web:0.0.1-SNAPSHOT
```

## API Gateway (Traefik)

```bash
docker run -d -p 8080:8080 -p 80:80 -v /var/run/docker.sock:/var/run/docker.sock traefik:v2.0 --providers.docker.exposedByDefault=false --api.insecure=true --providers.docker
```
