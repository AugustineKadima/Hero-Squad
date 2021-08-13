package modules;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.io.TempDir;

import org.sql2o.Connection;
import org.sql2o.Sql2o;
import spark.resource.ExternalResource;

public class DatabaseRule extends ExternalResource {

    /**
     * Constructor
     *
     * @param path the path to the external resource
     */
    public DatabaseRule(String path) {
        super(path);
    }
//
//    @BeforeAll
//
//    public void before() throws Throwable {
//        Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/hero_test", "sirkadima",
//                "kadima123");
//    }

//    @AfterAll
//    public void after() {
//        try(Connection con= DB.sql2o.open()) {
//            String deleteHeroesQuery = "DELETE FROM heroes *";
//            con.createQuery(deleteHeroesQuery).executeUpdate();
//        }
//    }
}
