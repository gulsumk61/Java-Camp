package oopWithNLayeredApp.dataAcces;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
    public void add(Product product){
        //sadece db erişim kodları buraya yazılır... SQL
        System.out.println("JDBC ile veri tabanına eklendi");
    }
}
