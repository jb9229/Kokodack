package me.kd.service;

import me.kd.DAO.Dockjang;
import me.kd.DAO.DockjangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by test on 2015-09-13.
 */
public interface DockjangService {

    public void update(Dockjang dockjang);
}
