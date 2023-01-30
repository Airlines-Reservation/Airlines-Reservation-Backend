package rw.rca.ac.airlines.reserve.dao.definition;

import rw.rca.ac.airlines.reserve.orm.Category;
import java.util.List;

public interface CategoryDAO {
    public void saveCategory(Category category);
    public void updateCategory(Category category);
    public void deleteCategory(Category category);
    public List<Category> findCategory(String name);
}
