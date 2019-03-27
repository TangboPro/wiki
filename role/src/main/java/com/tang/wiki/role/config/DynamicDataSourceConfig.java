package com.tang.wiki.role.config;

//@Configuration
//@MapperScan(basePackages = "com.tang.wiki.role.dao",
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
