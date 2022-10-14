package kodlamaIODemo.dataAccess;

import kodlamaIODemo.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

    @Override
    public void add(Category category) {
        System.out.println("Hibernate veri tabanına eklendi");

    }

}

