package org.zerock;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class RealmindApplicationTests {
    
    @Autowired
    private DataSource ds;
    
    @Autowired
    private SqlSessionFactory sqlSession;

    @Test
    public void contextLoads() {
    }
    
    @Test
    public void testConnection() throws Exception{
        System.out.println("datasource:"+ds);;
        Connection con = ds.getConnection();
        System.out.println("connection:"+con);
        con.close();
    }
    
    @Test
    public void testSqlSession() throws Exception{
        System.out.println(sqlSession);
    }

}
