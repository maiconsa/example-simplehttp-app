package example.app;

public class User {
	private Long id;
	private String name;
	private String password;
	private Imagem imagem;
	public User() {
	}
	
	public User(Long id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	
	public Imagem adicionaImagem() {
		this.imagem = new Imagem();
		this.imagem.id = 1L;
		this.imagem.caminho = "http://fake.png";
		return this.imagem;
	}
	
}
