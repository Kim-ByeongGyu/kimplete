package day0425;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// 여러 도시의 일일 최고 온도가 주워졌을 때 각 도시의 최고 온도를 찾아라
class Temperature {
    private String city;
    private int maxTemp;

    public Temperature(String city, int maxTemp) {
        this.city = city;
        this.maxTemp = maxTemp;
    }

    public String getCity() {
        return city;
    }

    public int getMaxTemp() {
        return maxTemp;
    }
}

public class practice_07 {
    public static void main(String[] args) {
        List<Temperature> temperatures = Arrays.asList(
                new Temperature("Seoul", 33),
                new Temperature("New York", 30),
                new Temperature("Seoul", 34),
                new Temperature("New York", 28)
        );
        Map<String,Integer> city = temperatures.stream().collect(Collectors.toMap(Temperature::getCity, Temperature::getMaxTemp,
                (existing, replacement) -> existing > replacement ? existing : replacement));

        city.forEach((c, t) -> {
            System.out.println("도시 : " + c  + "\t 최대 온도 : " + t);
        });
    }
}
