package guru.springframework.sfgdi.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

@ConstructorBinding
@ConfigurationProperties("guru")
public class SfgConstructorConfig {
    final private String userName;
    final private String password;
    final private String jdbcurl;

    public SfgConstructorConfig(String userName, String password, String jdbcurl) {
        this.userName = userName;
        this.password = password;
        this.jdbcurl = jdbcurl;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getJdbcurl() {
        return jdbcurl;
    }
}
