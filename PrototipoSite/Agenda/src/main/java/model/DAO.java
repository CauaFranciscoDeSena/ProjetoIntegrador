package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAO {
	/** Módulo de conexão **/
	// Parâmetros de conexão
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/Agenda?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "240693";

	// Método de Conexão
	@SuppressWarnings("unused")
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println("Erro ao conectar: " + e.getMessage());
		}
		return con;
	}

	// CRUD CREATE

	public void inserirContato(JavaBeans contato) {
		String create = "insert into contatos (nome,fone,email,dataConsulta,horaConsulta) values (?,?,?,?,?)";
		try {
			// abrir conexão com banco
			Connection con = conectar();
			// Preparar a query para execução no banco
			PreparedStatement pst = con.prepareStatement(create);
			// Substituir os parâmetros (?) pelo conteudo das variaveis JavaBeans
			pst.setString(1, contato.getNome());
			pst.setString(2, contato.getFone());
			pst.setString(3, contato.getEmail());
			pst.setString(4, contato.getDataConsulta());
			pst.setString(5, contato.getHoraConsulta());
			
			
			

			// Executar a query
			pst.executeUpdate();

			// Encerrar a conexão com o banco
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// Teste de conexão
	/*
	 * public void testeConexao() { Connection con = null; try { con = conectar();
	 * if (con != null) { System.out.println("Conexão estabelecida: " + con); } else
	 * { System.out.println("Conexão falhou."); } } catch (Exception e) {
	 * System.out.println("Erro no teste de conexão: " + e.getMessage()); } finally
	 * { // Fechamento da conexão no bloco finally para garantir que seja sempre
	 * executado if (con != null) { try { con.close(); } catch (Exception e) {
	 * System.out.println("Erro ao fechar conexão: " + e.getMessage()); } } } }
	 */
}
