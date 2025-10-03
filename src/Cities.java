import java.util.HashMap;
import java.util.Map;

public class Cities {
    //Поля
    private String title;
    private Map<Cities, Integer> ways;

    //Свойства
    public String getTitle() {
        return title;
    }

    public Map<Cities, Integer> getWays() {
        return ways;
    }

    public void setTitle(String title) {
        Validator.validateTitle(title);
        this.title = title;
    }

    public void setWays(Map<Cities, Integer> ways) {
        this.ways = ways;
    }

    //Конструкторы
    //По умолчанию
    public Cities(){
        this.title = "Москва";
        this.ways = new HashMap<>();
    }

    //С параметрами
    //Создание города
    public Cities(String title){
        Validator.validateTitle(title);
        this.title = title;
        this.ways = new HashMap<>();
    }

    //Добавление пути
    public void addWay(Cities city, int cost){
        Validator.validateTitle(city.getTitle());
        Validator.validateCost(cost);
        this.ways.put(city, cost);
    }

    //Копирования
    public Cities(Cities cities){
        this.title = cities.title;
        this.ways = new HashMap<>(cities.ways);
    }

    @Override
    public String toString(){
        String result = "";
        if (ways.isEmpty()){
            return "Из города " + title + " нет путей.";
        }
        result = "Набор путей из города " + title + " (название: стоимость).  ";
        for (Map.Entry<Cities, Integer> entry : ways.entrySet()){
            result += entry.getKey().getTitle() + ": " + entry.getValue() + "; ";
        }
        return result;
    }
}
