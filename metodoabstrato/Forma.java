package metodoabstrato;

public abstract class Forma {
	

	public Forma() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Forma(Cor cor) {
		super();
		this.cor = cor;
	}

	private Cor cor;

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public abstract double area();

}
