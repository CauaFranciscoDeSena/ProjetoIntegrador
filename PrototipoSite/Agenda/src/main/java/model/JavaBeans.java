package model;

public class JavaBeans {
	private String idcon;
	private String nome;
	private String fone;
	private String email;
	private String dataConsulta;
    private String horaConsulta;		
	
    public JavaBeans() {
		super();
		
	}
		
	public JavaBeans(String idcon, String nome, String fone, String email,String dataConsulta, String horaConsulta) {
		super();
		this.idcon = idcon;
		this.nome = nome;
		this.fone = fone;
		this.email = email;
		this.dataConsulta = dataConsulta;
        this.horaConsulta = horaConsulta;
	}

	public String getIdcon() {
		return idcon;
	}
	public void setIdcon(String idcon) {
		this.idcon = idcon;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(String horaConsulta) {
        this.horaConsulta = horaConsulta;
    }
}
