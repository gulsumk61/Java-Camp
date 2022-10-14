package kodlamaIODemo.entities;

public class Category {
    private int categoryId;
    private String categoryName;

    public Category() {

    }

    public Category(int CategoryId, String CategoryName) {
        super();
        categoryId = CategoryId;
        categoryName = CategoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        categoryName = categoryName;
    }

    public String getCourseName() {
        return null;
    }


}