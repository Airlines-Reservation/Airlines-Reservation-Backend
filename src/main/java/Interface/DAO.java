package Interface;

import java.sql.SQLException;

import com.beust.jcommander.internal.Lists;

import antlr.collections.List;
import rw.rca.ac.airlines.reserve.orm.DAOImplentation.T;

public interface DAO<T> {

    T get(int id) throws SQLException;

    Lists<T> getAll() throws SQLException;

    int save(T t) throws SQLException;

    int insert(T t) throws SQLException;

    int update(T t) throws SQLException;

    int delete(T t);

}
