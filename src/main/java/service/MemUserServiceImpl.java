package service;

import org.springframework.stereotype.Service;
import persistence.MemUserDaoImpl;

import javax.inject.Inject;

@Service
public class MemUserServiceImpl implements IMemUserService {
    @Inject
    private MemUserDaoImpl dao;

    @Override
    public void select() {

    }

    @Override
    public void insert() {

    }
}
