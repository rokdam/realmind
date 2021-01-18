package org.realmind;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.realmind.domain.PortfolioVO;
import org.realmind.mapper.PortfolioMapper;

class PortfolioMapperTest extends RealmindApplicationTests {
    
    @Autowired
    private PortfolioMapper mapper;

    @Test
    public void contextLoads() {
    }
    
    @Test
    public void testInsert() throws Exception {
        PortfolioVO vo = new PortfolioVO();
        
        vo.setUser_id(2);
        vo.setContents_type(2);
        vo.setContents("new_contents");
        
        mapper.create(vo);
    }
    
    @Test
    public void testLogin() throws Exception{
        PortfolioVO vo = mapper.login(2);
        System.out.println(vo);
    }
}
