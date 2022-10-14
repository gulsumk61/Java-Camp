package kodlamaIODemo.business;

import java.util.List;

import kodlamaIODemo.dataAccess.CategoryDao;
import kodlamaIODemo.entities.Category;
import kodlamaIODemo.logging.Logger;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    private List<Category> categories;

    public CategoryManager(CategoryDao categoryDao,Logger[] loggers,List<Category> categories) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        for(Category catego:categories) {
            if(catego.getCategoryName()==category.getCategoryName()) {
                throw new Exception ("Kategori isimleri aynı olamaz");
            }
        }
        categoryDao.add(category);
        categories.add(category);

        for (Logger logger:loggers) {
            logger.log(category.getCategoryName());
        }
    }
}
