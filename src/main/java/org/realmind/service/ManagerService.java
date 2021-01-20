package org.realmind.service;

import java.util.List;

import org.realmind.model.ManagerVO;
import org.springframework.stereotype.Service;

public interface ManagerService {

    public void createManager(ManagerVO managerVO) throws Exception;
    public List<ManagerVO> gerManagerList() throws Exception;
    public ManagerVO searchManager(int id) throws Exception;
    public void updateManager(int id) throws Exception;
    public void deleteManager(int id) throws Exception;
}
