package rw.rca.ac.airlines.reserve.dao.implementation;

import java.util.List;

import org.hibernate.Transaction;

import rw.rca.ac.airlines.reserve.dao.definition.CategoryDAO;
import rw.rca.ac.airlines.reserve.orm.Category;

public class CategoryDAOImplementor implements CategoryDAO {

    @Override
    public void saveCategory(Category category) {
        
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateCategory(Category category) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteCategory(Category category) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Category> findCategory(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}