package collections_hw;

import java.io.*;
import java.util.*;

import static java.lang.Character.isLetter;

public class Collect {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //+Задание 1: Подсчитайте количество различных слов в файле.
        {
            System.out.println("Задание 1");
            HashSet<String> text = new HashSet<String>();
            ArrayList<String> all = new ArrayList<String>();
            try {
                File file = new File("src/main/java/collections_hw/text.txt");
                FileReader fr = new FileReader(file);
                BufferedReader reader = new BufferedReader(fr);
                String line = reader.readLine();
                while (line != null) {
                    //System.out.println(line);
                    String[] tempStr = line.split(" ");
                    for (int i=0; i<tempStr.length; i++){
                        text.add(tempStr[i].toLowerCase());
                        all.add(tempStr[i].toLowerCase());
                    }
                    line = reader.readLine();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Всего слов: "+all.size());
            System.out.println("Уникальных слов: "+text.size());
        }
        //+Задание 2: Выведите на экран список различных слов файла, отсортированный по возрастанию их длины (компаратор сначала по длине слова, потом по тексту).
        {
            System.out.println("\nЗадание 2");
            TreeSet<String> text = new TreeSet<String>(new myComparator());
            try {
                File file = new File("src/main/java/collections_hw/text.txt");
                FileReader fr = new FileReader(file);
                BufferedReader reader = new BufferedReader(fr);
                String line = reader.readLine();
                while (line != null) {
                    //System.out.println(line);
                    String[] tempStr = line.split(" ");
                    for (int i=0; i<tempStr.length; i++){
                        text.add(tempStr[i].toLowerCase());
                    }
                    line = reader.readLine();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (String t : text) {
                System.out.println(t);
            }
        }
        //+Задание 3: Подсчитайте и выведите на экран сколько раз каждое слово встречается в файле.
        {
            System.out.println("\nЗадание 3");
            HashMap<String, Integer> text = new HashMap<String, Integer>();
            int value;
            try {
                File file = new File("src/main/java/collections_hw/text.txt");
                FileReader fr = new FileReader(file);
                BufferedReader reader = new BufferedReader(fr);
                String line = reader.readLine();
                while (line != null) {
                    //System.out.println(line);
                    line=line.toLowerCase();
                    String[] tempStr = line.split(" ");
                    for (int i=0; i<tempStr.length; i++){
                        if (text.containsKey(tempStr[i])){
                            value=text.get(tempStr[i]);
                            text.put(tempStr[i],(value+1));
                        }else{
                            text.put(tempStr[i],1);
                        }
                    }
                    line = reader.readLine();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int check=0;
            for (Map.Entry<String, Integer> t : text.entrySet()) {
                System.out.println(t.getKey()+" "+t.getValue());
                check+=t.getValue();
            }
            System.out.println("Всего слов: "+check);
        }
        //+Задание 4: Выведите на экран все строки файла в обратном порядке.
        {
            System.out.println("\nЗадание 4");
            LinkedList<String> text = new LinkedList<String>();
            try {
                File file = new File("src/main/java/collections_hw/text.txt");
                FileReader fr = new FileReader(file);
                BufferedReader reader = new BufferedReader(fr);
                String line = reader.readLine();
                while (line != null) {
                    //System.out.println(line);
                    text.addFirst(line);
                    line = reader.readLine();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (String t : text) {
                System.out.println(t);
            }
        }
        //Задание 5: Реализуйте свой Iterator для обхода списка в обратном порядке.
        {
            System.out.println("\nЗадание 5");

        }

        //+Задание 6: Выведите на экран строки, номера которых задаются пользователем в произвольном порядке.
        {
            System.out.println("\nЗадание 6");
            ArrayList<String> text = new ArrayList<String>();
            try {
                File file = new File("src/main/java/collections_hw/text.txt");
                FileReader fr = new FileReader(file);
                BufferedReader reader = new BufferedReader(fr);
                String line = reader.readLine();
                while (line != null) {
                    //System.out.println(line);
                    text.add(line);
                    line = reader.readLine();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            ArrayList<Integer> order = new ArrayList<Integer>();
            System.out.println("Введите произвольное количество чисел в интервале от 0 до "+(text.size()-1)+". Чтобы закончить ввод, введите q.");
            while (scn.hasNextInt()){
                order.add(scn.nextInt());
            }
            for (int i : order) {
                if (i<text.size()) {
                    System.out.println(text.get(i));
                }else{
                    System.out.println("!нет строки с номером "+i);
                }
            }
        }

        /*задача
        Имеется список парка машин Car(String model, String type). Необходимо разбить его на списки сгруппированные по type.
        Пример исходного списка: Лада седан, Лада хэтчбек, Мерседес седан, Бмв кроссовер, Форд хэтчбек, Пежо кроссовер, Тойота седан и т.п.     */
        {
            System.out.println("\nЗадача");
            HashMap<String, String> car = new HashMap<String, String>();
            car.put("Лада", "седан");
            car.put("Лада", "хэтчбек");
            car.put("Мерседес", "седан");
            car.put("Бмв", "кроссовер");
            car.put("Форд", "хэтчбек");
            car.put("Пежо", "кроссовер");
            car.put("Мерседес", "седан");
            HashMap<String, HashSet<String>> type = new HashMap<String, HashSet<String>>();
            HashSet<String> tempSet = new HashSet<String>();
            for (Map.Entry<String, String> t : car.entrySet()) {
                if (type.containsKey(t.getKey())){
                    tempSet=type.get(t.getKey());
                    tempSet.add(t.getValue());
                    type.put(t.getKey(),tempSet);
                }else{
                    tempSet.add(t.getValue());
                    type.put(t.getKey(),tempSet);
                }
            }

            for (Map.Entry<String, HashSet<String>> t : type.entrySet()) {
                System.out.println(t.getKey()+" "+t.getValue());
            }
        }

    }

    static class myComparator implements Comparator<String> {
        public int compare(String s1, String s2) {
            if(s1.length()<s2.length()){
                return 1;
            }else if(s1.length()>s2.length()){
                return -1;
            }else if(s1.equals(s2)){
                return 0;
            }else{
                int i=0;
                while(i<s1.length()){
                    if((int)s1.charAt(i)<(int)s2.charAt(i)){
                        return -1;
                    }else if((int)s1.charAt(i)>(int)s2.charAt(i)){
                        return 1;
                    }
                    i++;
                }
                return 0;
            }
        }
    }
    /*
    static class reverseIterator implements Iterator<String> {
        public boolean hasNext() {
            return false;
        }

        public String next() {
            return null;
        }
    }

     */
}
