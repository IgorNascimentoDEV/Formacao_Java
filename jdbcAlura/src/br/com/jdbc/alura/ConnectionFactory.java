package br.com.jdbc.alura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	public DataSource dataSource;

	public ConnectionFactory() {
		ComboPooledDataSource cpd = new ComboPooledDataSource();
		cpd.setJdbcUrl("jdbc:mysql://localhost:3306/loja_virtual?verifyServerCertificate=false&useSSL=true");
		cpd.setUser("root");
		cpd.setPassword("root");


		this.dataSource = cpd;
	}

	public Connection recuperaConexao() throws SQLException {
		return this.dataSource.getConnection();
	}

//	String url = "jdbc:mysql://localhost:3306/loja_virtual?verifyServerCertificate=false&useSSL=true";
//	String usuario = "root";
//	String senha = "root";
//	DriverManager.getConnection(url, usuario, senha);
}
