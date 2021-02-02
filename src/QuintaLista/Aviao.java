package QuintaLista;

public class Aviao {
	private String fabricante;
	private String modelo;
	private String cor;
	private int total_lugar;
	private boolean status;
	
	public Aviao(String fabricante, String modelo, String cor, int total_lugar) {
		this.fabricante = fabricante;
		this.modelo=modelo;
		this.cor = cor;
		this.total_lugar = total_lugar;
		this.status=false;
	}
	
	
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getTotal_lugar() {
		return total_lugar;
	}

	public void setTotal_lugar(int total_lugar) {
		this.total_lugar = total_lugar;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void statusGaragem() {
		this.status=false;
	}
	
	public void statusVoando() {
		this.status=true;
	}
	
	
	public String verificaStatus() {
	     if(status)
	    	 return "Em voo - Indisponivel";
	     else
	    	 return "Na garagem - Disponivel";
	}
	
	public void printInfo() {
		System.out.println("***************************\nFabricante:"+fabricante+"\nModelo: "+modelo+"\nCor: "+cor
				+"\nTotal de Lugares: "+total_lugar+"\nDisponiblidade: "+verificaStatus());
	}
}
