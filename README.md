
# O que é ?

Exemplo de utilização do framework  [simpleframework[(https://github.com/maiconsa/simple-http-framework).


#  Requisitos

- Java 8+
 - dependência instalada localmente do simpleframework(link)
 - Maven 
 - cURL
 
 
 # Exemplo de requisições
 
 
 POST - /user
 
 Request:
 ```bash
 	curl -X POST http://localhost:9091/user -H "Content-Type: application/json" -d '{"name": "fake" , "password": "123"}'
 ```	
 Response:

 ```bash
 {"id":1,"name":"fake","password":"123"}
 ```
 
 
 GET /user/{userId}/image/{imageId}
 
 Request:
 ```bash
	curl -X GET http://localhost:9091/user/1/image/1 -H "Content-Type: application/json"
```	
Response:
```bash
	{"id":1,"caminho":"http://fake.png"}
```	


	
