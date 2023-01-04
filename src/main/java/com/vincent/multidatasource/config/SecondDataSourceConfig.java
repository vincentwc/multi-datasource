//package com.vincent.multidatasource.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//
//import javax.sql.DataSource;
//
//@Configuration
//// 扫描 Mapper 接口并容器管理
//@MapperScan(basePackages = SecondDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "secondSqlSessionFactory")
//public class SecondDataSourceConfig {
//
//    // 精确到 cluster 目录，以便跟其他数据源隔离
//    static final String PACKAGE = "com.vincent.multidatasource.dao.second";
//    static final String MAPPER_LOCATION = "classpath:mapper/second/*.xml";
//
//    @Primary
//    @Bean(name = "secondDataSource")
//    @ConfigurationProperties("spring.datasource.second")
//    public DataSource clusterDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "secondTransactionManager")
//    public DataSourceTransactionManager clusterTransactionManager() {
//        return new DataSourceTransactionManager(clusterDataSource());
//    }
//
//    @Bean(name = "secondSqlSessionFactory")
//    public SqlSessionFactory clusterSqlSessionFactory(@Qualifier("secondDataSource") DataSource clusterDataSource)
//            throws Exception {
//         SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//        sessionFactory.setDataSource(clusterDataSource);
//        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
//                .getResources(SecondDataSourceConfig.MAPPER_LOCATION));
//        return sessionFactory.getObject();
//    }
//}
