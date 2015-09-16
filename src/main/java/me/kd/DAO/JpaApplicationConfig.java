package me.kd.DAO;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.AbstractEntityManagerFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by test on 2015-09-14.
 */
@Configuration
@EnableJpaRepositories("me.kd.DAO")
@EnableTransactionManagement
public class JpaApplicationConfig {
    private static final EntityManagerFactory emfInstance =
            Persistence.createEntityManagerFactory("transactions-optional");

    public static EntityManagerFactory get() {
        return emfInstance;
    }
//    @Bean
//    public AbstractEntityManagerFactoryBean entityManagerFactory() {
//        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
//        factory.setPersistenceUnitName("transactions-optional");
//        return factory;
//    }
//    @Bean
//    public PlatformTransactionManager transactionManager() {
//        JpaTransactionManager txManager = new JpaTransactionManager();
//        txManager.setEntityManagerFactory(entityManagerFactory().getObject());
//        return txManager;
//    }
//    @Bean
//    public PersistenceExceptionTranslator persistenceExceptionTranslator() {
//        return new OpenJpaDialect();
//    }

}
