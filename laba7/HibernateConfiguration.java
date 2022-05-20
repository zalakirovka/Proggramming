package org.example.laba.laba7;
import org.hibernate.SessionFactory;
import org.hibernate.boot.model.naming.CamelCaseToUnderscoresNamingStrategy;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.Objects;
import java.util.Properties;

public class HibernateConfiguration {
    private static SessionFactory sessionFactory;

    private HibernateConfiguration() {}

    public static SessionFactory getFactory() {
        if (Objects.nonNull(sessionFactory)) {
            return sessionFactory;
        }

        Properties prop = ApplicationProp.getInstance().getProperties();

        Configuration configuration = new Configuration().addProperties(prop);

        configuration.setPhysicalNamingStrategy(
                new CamelCaseToUnderscoresNamingStrategy()
        );

        configuration.addAnnotatedClass(Student.class);
        configuration.addAnnotatedClass(Group.class);

        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(prop);

        sessionFactory = configuration.buildSessionFactory(builder.build());

        return sessionFactory;
    }
}
