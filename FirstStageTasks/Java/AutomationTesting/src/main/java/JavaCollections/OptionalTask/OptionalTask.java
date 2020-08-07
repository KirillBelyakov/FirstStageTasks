package JavaCollections.OptionalTask;

import java.io.*;
import java.util.*;

public class OptionalTask {
    public static void main(String[] args) throws IOException {
//1.Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
        try {
            ArrayList<String> textFromFile = new ArrayList<>();
            BufferedReader buffread = new BufferedReader(new FileReader("D://music.txt"));
            try {
                String line;
                while ((line = buffread.readLine()) != null) {
                    textFromFile.add(line);
                }
                System.out.println(textFromFile);
            } finally {
                buffread.close();
            }
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter("D://music.txt"));
            try {
                for (int i = textFromFile.size() - 1; i >= 0; i--) {
                    buffWrite.write(textFromFile.get(i));
                    buffWrite.newLine();
                }
            } finally {
                buffWrite.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
//2.Занести стихотворение в список.Провести сортировку по возрастанию длинн строк.
        ArrayList<String> sonet = new ArrayList<>();
        sonet.add("My mistress' eyes are nothing like the sun;");
        sonet.add("Coral is far more red than her lips' red;");
        sonet.add("If snow be white, why then her breasts are dun;");
        sonet.add("If hairs be wires, black wires grow on her head.");
        sonet.add("I have seen roses damasked, red and white,");
        sonet.add("But no such roses see I in her cheeks,");
        sonet.add("And in some perfumes is there more delight");
        sonet.add("Than in the breath that from my mistress reeks.");
        sonet.add("I love to hear her speak, yet well I know");
        sonet.add("That music hath a far more pleasing sound;");
        sonet.add("I grant I never saw a goddess go -");
        sonet.add("My mistress when she walks treads on the ground.");
        sonet.add("And yet, by heaven, I think my love as rare");
        sonet.add("As any she belied with false compare.");
        sonet.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(sonet);
//3.Создать список из элементов каталога и его подкаталогов.
        List<File> fileList = new ArrayList<>();
        File music = new File("D//Music");
        if (music.isDirectory()) {
            for (File i : music.listFiles()) {
                fileList.add(i);
            }
        }
    }
}
