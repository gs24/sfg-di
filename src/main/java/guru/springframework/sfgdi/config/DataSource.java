package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.datasource.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@EnableConfigurationProperties(SfgConstructorConfig.class)
@Configuration
//@PropertySource("classpath:datasource.properties")
public class DataSource {

    @Bean
    FakeDataSource fakeDataSource(@Value("${guru.username}") String userName,
                                  @Value("${guru.password}")String password,
                                  @Value("${guru.jdbcurl}")String jdbcUrl){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUserName(userName);
        fakeDataSource.setPassword(password);
        fakeDataSource.setJdbcurl(jdbcUrl);
        return fakeDataSource;
    }
}
