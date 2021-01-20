package org.realmind.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.realmind.model.ManagerVO;

//xml과 연결
public interface ManagerMapper {
    
    public void createManager(ManagerVO managerVO) throws Exception;
    public List<ManagerVO> gerManagerList() throws Exception;
    public ManagerVO searchManager(int id) throws Exception;
    public void updateManager(int id) throws Exception;
    public void deleteManager(int id) throws Exception;
}
