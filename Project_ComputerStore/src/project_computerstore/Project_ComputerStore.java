package project_computerstore;

import java.util.Scanner;

/**
 *
 * @author Nx
 */
public class Project_ComputerStore {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //pakai generic tab
        StrukturData sdl = new StrukturData();
        int menu;

        OUTER:
        do {
            sdl.menu();
            System.out.print("Pilih Menu :");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    sdl.tampilData();
                    break;
                case 2:
                    sdl.tambahItem();
                    break;
                case 3:
                    sdl.search();
                    break;
                case 4:
                    sdl.delete();
                    break;
                case 5:
                    break OUTER;
                default:
                    System.out.println("Tidak ada pada menu");
                    break;
            }
        } while (menu > 0 || menu <= 0);
    }

}
