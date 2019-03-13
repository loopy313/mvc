package persistence;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;

@Repository
public class MemUserDaoImpl implements IMemUserDao {

    @Inject
    SqlSessionTemplate session;

    @Override
    public void select() {

    }

    @Override
    public void insert() {

    }
}
