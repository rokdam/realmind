package org.zerock.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.zerock.domain.PortfolioVO;

public interface PortfolioMapper {
    
    @Insert("insert into portfolio_contents (user_id, contents_type, contents)" + " values(#{user_id}, #{contents_type}, #{contents})")
    public void create(PortfolioVO vo) throws Exception;
    
    @Select("select * from portfolio_contents where user_id = ${user_id}")
    public PortfolioVO read(String user_id) throws Exception;
    
    @Update("update portfolio_contents set" + " contents_type =#{contents_type}, contents=#{contents} where user_id=#{user_id}")
    public void update(PortfolioVO vo) throws Exception;
    
    @Delete("delete from portfolio_contents where user_id=#{user_id}")
    public void delete(String user_id) throws Exception;
    
    public PortfolioVO login(@Param("user_id") int user_id) throws Exception;
}
