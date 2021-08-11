import modules.Hero;
import modules.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;


public class App {
    public static void main(String[] args){
        staticFileLocation("/public");


        get("/", (request, response) ->{
            return new ModelAndView(new HashMap(), "layout.hbs");
        }, new HandlebarsTemplateEngine());

        get("/home", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "home.hbs");
        }, new HandlebarsTemplateEngine());

        get("/hero", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "hero.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squad",(request, response) -> {
            return new ModelAndView(new HashMap<>(), "squad.hbs");
        }, new HandlebarsTemplateEngine());

//        get("/allSquads",(request, response) -> {
//            Map<String, Object> model = new HashMap<String, Object>();
//            String squadName = request.queryParams("squadName");
//            String cause = request.queryParams("cause");
//            model.put("squadName", squadName);
//
//            return new ModelAndView(model, "allSquads.hbs");
//        }, new HandlebarsTemplateEngine());

        get("/allHeroes",(request, response) -> {
            Map<String, Object> model = new HashMap<>();

            model.put("heroes", Hero.getCreatedHeroes());
            return new ModelAndView(model, "allHeroes.hbs");
        }, new HandlebarsTemplateEngine());

        post("/allHeroes",(request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String heroName = request.queryParams("heroName");
            String superPower = request.queryParams("superPower");
            String weakness = request.queryParams("weakness");
            int age = Integer.parseInt(request.queryParams("age"));
            Hero hero1 = new Hero(heroName, superPower, weakness, age);
            List<Hero> heroObj = Hero.getCreatedHeroes();
            model.put("hero", heroObj);
            return new ModelAndView(model, "allHeroes.hbs");
        }, new HandlebarsTemplateEngine());



    }
}
