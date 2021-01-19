package org.realmind.service;

import java.util.List;

import javax.annotation.Resource;

import org.realmind.mapper.ManagerMapper;
import org.realmind.model.ManagerVO;

public class ManagerServiceImpl implements ManagerService {

    @Resource(name="managerMapper")
    private ManagerMapper managerMapper;
    
    @Override
    public void createManager(ManagerVO managerVO) throws Exception {
        // TODO Auto-generated method stub
        managerMapper.createManager(managerVO);
    }

    @Override
    public List<ManagerVO> gerManagerList() throws Exception {
        // TODO Auto-generated method stub
        return managerMapper.gerManagerList();
    }

    @Override
    public ManagerVO searchManager(int id) throws Exception {
        // TODO Auto-generated method stub
        return managerMapper.searchManager(id);
    }

    @Override
    public void updateManager(int id) throws Exception {
        // TODO Auto-generated method stub
        managerMapper.updateManager(id);
    }

    @Override
    public void deleteManager(int id) throws Exception {
        // TODO Auto-generated method stub
        managerMapper.deleteManager(id);
    }
    

}
