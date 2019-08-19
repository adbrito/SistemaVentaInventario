# Proyecto

[referencia](https://gist.github.com/akosveres/b7f9173ccb7b00a8db67e5149f410bb5)

## Comando para ejecutar

`docker run --name bddocker -v $(pwd)/sql:/docker-entrypoint-initdb.d -e MYSQL_ROOT_PASSWORD=1234 -p 9000:3306 -d mysql:latest`

## Con Docker composer

Desde la carpeta donde está el `docker-compose.yml`

`docker-compose up`

Abrir [http://localhost:8080](http://localhost:8080)

Spoiler alert: Login va a fallar

## Reparando el login

Desde la carpeta donde está el `docker-compose.yml`

`docker-compose exec db bash`

Varificar si el script está en el contenedor

`ls docker-entrypoint-initdb.d`

Debe mostrar el script de la carpeta `sql`

`mysql -u root -p`

Ingesar la clave del root que está en `docker-compose.yml`

```sql
ALTER USER 'root'@'%' IDENTIFIED WITH mysql_native_password
BY 'test';
```

Cerrar esa terminal

Verificar el login en el navegador

Ser feliz
