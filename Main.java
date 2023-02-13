package home_work6;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<notebook> noteBookList = getNoteBookList();
        ArrayList<notebook> userList = userRequest(noteBookList);
        for (notebook i: userList){
            System.out.print(i.toString() + "\n");
        }


    }

    private static ArrayList<notebook> getNoteBookList() {
        ArrayList<notebook> noteBooks = new ArrayList<>();
        Random rand = new Random();
        List<String> brands = new ArrayList<>(Arrays.asList("Apple", "Asus", "Dell", "HP"));
        List<String> colors = new ArrayList<>(Arrays.asList("Black", "Blue", "Silver", "Grey"));
        List<Integer> cores = new ArrayList<>(Arrays.asList(4,8,10));
        List<Integer> rams = new ArrayList<>(Arrays.asList(8,16,32));
        List<Integer> ssds = new ArrayList<>(Arrays.asList(128, 256, 512));
        for (int i = 0; i < 50; i++) {
            String brand = brands.get(rand.nextInt(4));
            String color = colors.get(rand.nextInt(4));
            int core = cores.get(rand.nextInt(3));
            int ram = rams.get(rand.nextInt(3));
            int ssd = ssds.get(rand.nextInt(3));
            noteBooks.add(new notebook(brand, color, core, ram, ssd));
        }
        return noteBooks;
    }

    private static ArrayList<notebook> userRequest(ArrayList<notebook> noteBooks) {
        ArrayList<notebook> userChoise = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("параметр выборки: \n1-бренд\n2-цвет\n3-минимальное количество ядер " +
                "процессора\n4-минимальный объем оперативной памяти\n5-минимальный объем ssd");

        int userCase = scan.nextInt();
        switch (userCase) {
            case 1:
                System.out.println("Введите бренд (Apple, Asus, Dell, HP):");
                String userBrand = scan.next();
                for (notebook i: noteBooks){
                    if (i.getBrand().equals(userBrand)) {
                        userChoise.add(i);
                    }
                }
                break;
            case 2:
                System.out.println("Введите цвет (Black, Blue, Silver, Grey):");
                String userColor = scan.next();
                for (notebook i: noteBooks){
                    if (i.getColor().equals(userColor)) {
                        userChoise.add(i);
                    }
                }
                break;
            case 3:
                System.out.println("Введите минимальное количество ядер процессора (4,8,10):");
                int userCore = scan.nextInt();
                for (notebook i: noteBooks){
                    if (i.getCores() >= userCore) {
                        userChoise.add(i);
                    }
                }
                break;
            case 4:
                System.out.println("Введите минимальный объем оперативной памяти (8,16,32):");
                int userRam = scan.nextInt();
                for (notebook i: noteBooks){
                    if (i.getRAM() >= userRam) {
                        userChoise.add(i);
                    }
                }
                break;
            case 5:
                System.out.println("Введите минимальный объем ssd (128, 256, 512):");
                int userSsd = scan.nextInt();
                for (notebook i: noteBooks){
                    if (i.getSSD() >= userSsd) {
                        userChoise.add(i);
                    }
                }

                break;
        }
        return userChoise;

    }

}
