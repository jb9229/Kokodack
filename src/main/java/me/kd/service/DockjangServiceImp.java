package me.kd.service;

import me.kd.DAO.Dockjang;
import me.kd.DAO.DockjangRepository;
import me.kd.DAO.DockjangRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by test on 2015-09-15.
 */
@Service
@Transactional
public class DockjangServiceImp implements DockjangService{

    @Autowired
    private DockjangRepository repository;
//
    public void update(Dockjang dockjang){

//        repository.save(dockjang);
    }
}
