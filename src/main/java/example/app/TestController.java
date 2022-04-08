package example.app;

import java.util.List;

import simplehttp.framework.http.HttpHeaders;
import simplehttp.framework.http.ResponseEntity;
import simplehttp.framework.http.annotations.request.Controller;
import simplehttp.framework.http.annotations.request.Header;
import simplehttp.framework.http.annotations.request.PathVariable;
import simplehttp.framework.http.annotations.request.Payload;
import simplehttp.framework.http.annotations.request.QueryParameter;
import simplehttp.framework.http.annotations.request.ResponseStatus;
import simplehttp.framework.http.annotations.request.mapping.Do;
import simplehttp.framework.http.enums.HttpMethod;
import simplehttp.framework.http.enums.HttpStatus;
import simplehttp.framework.http.enums.MediaType;

@Controller(path = "/user")	
public class TestController {
	
	public TestController() {
	}
	
	@Do(method = HttpMethod.POST, contentType  = MediaType.APPLICATION_JSON, path = "/")
	@ResponseStatus(status = HttpStatus.OK)
	public User createUser(@Payload User user ) {
		return new User(1L, user.getName(), user.getPassword());
	}
	
	@Do(method = HttpMethod.GET, contentType  = MediaType.APPLICATION_JSON, path = "/{userId}/image/{imageId}")
	@ResponseStatus(status = HttpStatus.OK)
	public Imagem getImage(
			@PathVariable(name = "userId") String userId,
			@PathVariable(name = "imageId") String imageId ) {
		return new User(1L, "fakename", "fakepass").adicionaImagem();
	}
	
	
	@Do(method = HttpMethod.GET, contentType  = MediaType.APPLICATION_JSON, path = "/")
	@ResponseStatus(status = HttpStatus.OK)
	public List<User> lista(
			@Header(name = HttpHeaders.CONTENT_LEGNTH) String length,
			@Header(name = HttpHeaders.CONTENT_TYPE) String contentType,
			@QueryParameter(name = "dataCriacao") String dataCriacao
			) {
		return List.of(
				new User(1L, "maicon", "123"), 
				new User(1L, "12312", "123"));
	}
	
	@Do(method = HttpMethod.GET, contentType  = MediaType.APPLICATION_JSON, path = "/{userId}")
	public ResponseEntity<User> get(){
		User user = new User(1L, "teste", "teste");
		return new ResponseEntity<User>(HttpStatus.OK, HttpHeaders.builder().contentType(MediaType.APPLICATION_JSON.getValue()).build(),user );
	}
	
}
