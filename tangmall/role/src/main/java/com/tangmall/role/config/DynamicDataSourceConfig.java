package com.tangmall.role.config;

import com.tangmall.role.common.base.DynamicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

//@Configuration
//@MapperScan(basePackages = "com.tangmall.role.dao",
//        sqlSessionFactoryRef = "dynamicSqlFactory")
public class DynamicDataSourceConfig {
//    private static final String MAPPER_LOCATION = "classpath:mapper/*.xml";
//    private Logger LOGGER = LoggerFactory.getLogger(DynamicDataSourceConfig.class);
//
//    @Bean(name = "masterDataSource")
//    @Primary
//    @Qualifier("masterDataSource")
//    @ConfigurationProperties(prefix="spring.datasource.master")
//    public DataSource masterDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "slaveDataSource")
//    @Qualifier("slaveDataSource")
//    @ConfigurationProperties(prefix="spring.datasource.slave")
//    public DataSource slaveDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "dynamicDataSource")
//    public DataSource dynamicDataSource(
//            @Qualifier("masterDataSource") DataSource masterDataSource,
//            @Qualifier("slaveDataSource") DataSource slaveDataSource) {
//        DynamicDataSource dynamicDataSource = new DynamicDataSource();
//        // 默认数据源
//        dynamicDataSource.setDefaultTargetDataSource(masterDataSource);
//
//        // 配置多数据源
//        Map<Object, Object> dsMap = new HashMap(2);
//        dsMap.put("masterDataSource",masterDataSource);
//        dsMap.put("slaveDataSource", slaveDataSource);
//        dynamicDataSource.setTargetDataSources(dsMap);
//
//        return dynamicDataSource;
//    }
//
//    @Bean(name = "dynamicSqlFactory")
//    @Primary
//    public SqlSessionFactory dynamicSqlFactory(
//            @Qualifier("dynamicDataSource") DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource);
//        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
//                .getResources(DynamicDataSourceConfig.MAPPER_LOCATION));
//        return sessionFactory.getObject();
//    }
//
//    @Bean(name = "dynamicTransactionManager")
//    @Primary
//    public DataSourceTransactionManager dynamicTransactionManager(@Qualifier("dynamicDataSource") DataSource dataSource) {
//        return new DataSourceTransactionManager(dataSource);
//    }
}
