package conexion_main;

public class Conexion_API {
	
	String pagina;
    String html;
    String elemntos;
    int idElementos;
    
    public Conexion_API() {

    }

    
    public Conexion_API(String pagina, String html, String elementos, int idElementos) {
        this.pagina = pagina;
        this.html = html;
        this.elemntos = elementos;
        this.idElementos = idElementos;
    }


	public String getPagina() {
		return pagina;
	}


	public void setPagina(String pagina) {
		this.pagina = pagina;
	}


	public String getHtml() {
		return html;
	}


	public void setHtml(String html) {
		this.html = html;
	}


	public String getElemntos() {
		return elemntos;
	}


	public void setElemntos(String elemntos) {
		this.elemntos = elemntos;
	}


	public int getIdElementos() {
		return idElementos;
	}


	public void setIdElementos(int idElementos) {
		this.idElementos = idElementos;
	}

}
