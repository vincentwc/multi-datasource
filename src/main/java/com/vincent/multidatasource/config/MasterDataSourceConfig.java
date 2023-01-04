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
//@MapperScan(basePackages = MasterDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "masterSqlSessionFactory")
//public class MasterDataSourceConfig {
//
//    // 精确到 master 目录，以便跟其他数据源隔离
//    static final String PACKAGE = "com.vincent.multidatasource.dao.master";
//    static final String MAPPER_LOCATION = "classpath:mapper/master/*.xml";
//
//
//    @Primary
//    @Bean(name = "masterDataSource")
//    @ConfigurationProperties("spring.datasource.master")
//    public DataSource masterDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "masterTransactionManager")
//    @Primary
//    public DataSourceTransactionManager masterTransactionManager() {
//        return new DataSourceTransactionManager(masterDataSource());
//    }
//
//    @Bean(name = "masterSqlSessionFactory")
//    @Primary
//    public SqlSessionFactory masterSqlSessionFactory(@Qualifier("masterDataSource") DataSource masterDataSource) throws Exception {
//         SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//        sessionFactory.setDataSource(masterDataSource);
//        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
//                .getResources(MasterDataSourceConfig.MAPPER_LOCATION));
//        return sessionFactory.getObject();
//    }
//
//}
