package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

// Classe auxiliar responsável por instanciar os objetos DAOs
public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());  // Retorna uma implementação da interface
	}
	
}
