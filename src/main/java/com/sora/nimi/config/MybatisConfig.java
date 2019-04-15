package com.sora.nimi.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.sora.nimi.dao")
public class MybatisConfig {

//    @Autowired
//    @Qualifier("dataSource")
//    private DataSource dataSource;

//    @Bean
//    public SqlSessionFactory sqlSessionFactory() throws Exception {
//        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//        factoryBean.setDataSource(dataSource);
//        factoryBean.setMapperLocations(
//                new PathMatchingResourcePatternResolver().getResources("classpath*:mybatis/mapper/**/*.xml"));
//        factoryBean.setConfigLocation(new ClassPathResource("mybatis/mybatis-config.xml"));
//        return factoryBean.getObject();
//    }

//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate() throws Exception {
//        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory());
//        return template;
//    }
}
