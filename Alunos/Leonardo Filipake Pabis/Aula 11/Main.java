import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.net.http.HttpResponse;

class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String token = "token";
        String endPoint = "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/";
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create("")).GET().build();
        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println();
        System.out.println("Digite o nome da cidade");
        String cidade = scan.nextLine();
    }



    public static Map<String,Object> getJsonRegEx(String body){
        try {
            Pattern pattern = Pattern.compile("\"(\\w+)\":\"([^\"]+)\"");
            Matcher matcher = pattern.matcher(body);
            Map<String, Object> jsonData = new HashMap<>();
            while (matcher.find()){
                String key = matcher.group(1);
                String value = matcher.group(2);
                jsonData.put(key, value);
            }
            return jsonData;
        } catch (Exception e) {
            e.printStackTrace();;
            return null;
        }
    }
}