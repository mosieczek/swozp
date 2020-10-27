package com.example.swozp;

import org.hsqldb.Server;
import org.hsqldb.persist.HsqlProperties;
import org.hsqldb.server.ServerAcl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.IOException;

@SpringBootApplication
public class SwozpApplication {

    public static void main(String[] args) throws IOException, ServerAcl.AclFormatException {
        SpringApplication.run(SwozpApplication.class, args);
        HsqlProperties p = new HsqlProperties();
        p.setProperty("server.database.0","file:./hsqldb/mydb");
        p.setProperty("server.dbname.0","mydb");
        // set up the rest of properties

        // alternative to the above is
        Server server = new Server();
        server.setProperties(p);
        server.setLogWriter(null); // can use custom writer
        server.setErrWriter(null); // can use custom writer
        server.start();

    }
}
