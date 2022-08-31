import java.io.IOException;
import java.util.*;
import java.net.URL;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.util.concurrent.ThreadLocalRandom;
/*
Подсчитать среднее количество частоты встречающихся символов (вывести в консоль).
Определить символ, у которого частота будет наиболее приближена к полученному среднему значению
(вывести в консоль сам символ и значение кода в UTF-8)
*/
public class Main {
    public static void  Request (String stringURL) throws IOException{
        //Url запрос
        URL url = new URL(stringURL);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

        String inputLine;
        StringBuilder content = new StringBuilder();

        while ((inputLine = in.readLine()) != null){
            content.append(inputLine);
        }
        System.out.println("Random Text : " + content);
        in.close();
        con.disconnect();
        attachedvalue(content);
    }
    public static void  attachedvalue(StringBuilder s) {
        //Преобразовываем строковый массив в массив char
        char[] c = s.toString().toCharArray();
        System.out.println("Количество символов - " + c.length);

        //Поиск частоты символов
        int len = c.length; //Размер массива char
        int count; double sum;

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();//Частоты
        ArrayList<Character> list3 = new ArrayList<>();//Символы

        for (int i = 0; i < len; i++) { // пробегаемся по массиву и начинаем проверку одинаковых символов
            count = 1;
            for (int j = i + 1; j < len; j++) {
                if (c[i] == ' ')
                    break;
                if (c[i] == c[j]) {
                    count++;
                    c[j] = ' ';
                }
            }
            if (c[i] != ' ')
            {
                list.add(i);//Символы
                list2.add(count); //Счетчик
                list3.add(c[i]);
                System.out.println("№ Итерации = " + i + "|Частота появления символа [ " + c[i] + " ]" + ": "
                        + count);
            }
        }
        sum = (double)len/list.size();
        System.out.println("\nСреднее значение частоты = " + sum);
        int counter = 0;
        System.out.println("Символы, которые соответствуют условию наиболее близкого значения частоты к среднему значению : ");
        for (Integer i: list2) {
            if (i == Math.round(sum)) {
                System.out.print(list3.get(counter) + "(" + (int)list3.get(counter) + ") ");
            }
            counter++;
        }
    }
    public static void main(String[] args) throws IOException {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 1000);
        String url = "http://numbersapi.com/" + randomNum + "/trivia" ;
        Request(url);
    }
}

