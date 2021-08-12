package modules;

import org.sql2o.Sql2o;

public class DB {
//    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/hero", "sirkadima",
//            "kadima123");

    String connectionString = "postgresql://dyrnvwneqmpzui:162c0817fcb9bcffd9919194f59b60711678d634a95b6f0a37af57fb899cc8f9@ec2-44-196-250-191.compute-1.amazonaws.com:5432/d1vkn48jllq643\n"; //!
    Sql2o sql2o = new Sql2o(connectionString, "dyrnvwneqmpzui", "162c0817fcb9bcffd9919194f59b60711678d634a95b6f0a37af57fb899cc8f9");


}
