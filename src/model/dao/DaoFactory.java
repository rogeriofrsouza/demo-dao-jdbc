package model.dao;

import model.dao.impl.SellerDaoJDBC;

// Classe auxiliar responsável por instanciar os objetos DAOs
public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();  // Retorna uma implementação da interface
	}
}
