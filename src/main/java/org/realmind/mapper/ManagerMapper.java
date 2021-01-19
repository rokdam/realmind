package org.realmind.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.realmind.model.ManagerVO;

public interface ManagerMapper {
    
//    @Insert("insert into portfolio_contents (user_id, contents_type, contents)" + " values(#{user_id}, #{contents_type}, #{contents})")
//    public void create(PortfolioVO vo) throws Exception;
    
    //xml과 연결
    public void createManager(@Param("user") ManagerVO managerVO) throws Exception;
    public List<ManagerVO> gerManagerList() throws Exception;
    public ManagerVO searchManager(@Param("user") int id) throws Exception;
    public void updateManager(@Param("user") int id) throws Exception;
    public void deleteManager(@Param("user") int id) throws Exception;
}
