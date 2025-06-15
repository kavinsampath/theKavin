package com.kavin.dao;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import io.github.cdimascio.dotenv.Dotenv;

public class DataSourceUtil {
    private static final HikariDataSource ds;

    static {
        // Load .env file
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
        String jdbcUrl = dotenv.get("DB_JDBC_URL", System.getenv("DB_JDBC_URL"));
        String dbUser = dotenv.get("DB_USER", System.getenv("DB_USER"));
        String dbPassword = dotenv.get("DB_PASSWORD", System.getenv("DB_PASSWORD"));
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(jdbcUrl != null ? jdbcUrl : "");
        config.setUsername(dbUser != null ? dbUser : "");
        config.setPassword(dbPassword != null ? dbPassword : "");
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setMaximumPoolSize(10);
        ds = new HikariDataSource(config);
    }

    private DataSourceUtil() {}

    public static DataSource getDataSource() {
        return ds;
    }
}
