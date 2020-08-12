package cn.itcast.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @description: test jdbcutil
 * @author: liuzhi
 * @Date: 2020-06-02 18:11
 **/
public class JDBCUtilsTest {
    public static void main(String[] args) throws Exception {
        //1.加载配置文件
        Properties pro = new Properties();
        //使用ClassLoader加载配置文件，获取字节输入流
        InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(is);
        //2.初始化连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
