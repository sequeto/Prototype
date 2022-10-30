package prototype;

public class Automovel implements Cloneable{
	private String placa;
    private String nome;
    private String marca;
    private int kilometragem;

    public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getKilometragem() {
		return kilometragem;
	}


	public void setKilometragem(int kilometragem) {
		this.kilometragem = kilometragem;
	}


	public Automovel(int kilometragem, String nome, String marca, String placa) {
        this.kilometragem = kilometragem;
        this.nome = nome;
        this.marca = marca;
        this.placa = placa;
    }


    @Override
    public Automovel clone() throws CloneNotSupportedException {
    	Automovel automovelClone = (Automovel) super.clone();
        return automovelClone;
    }

    @Override
    public String toString() {
        return "Automovel {" + "placa=" + placa + ", nome='" + nome + '\'' + ", marca=" + marca + ", kilometragem='" + String.valueOf(kilometragem) + '\'' +'}';
    }
}
