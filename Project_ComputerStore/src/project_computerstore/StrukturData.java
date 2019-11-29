package project_computerstore;

import java.util.Scanner;

/**
 *
 * @author Nx
 */
public class StrukturData {

    static Scanner sc = new Scanner(System.in);
    LinkedList proses = new LinkedList();
    ListNode node = new ListNode();
    barang object = new barang();

    StrukturData() {
    }

    public StrukturData(LinkedList proses, barang object) {
        this.proses = proses;
        this.object = object;
    }

    public void tampilData() {
        if (proses.isEmpty()) {
            System.out.println("data masih kosong silahkan tambah data terlebih dahulu");
        } else {
            proses.cetak();
        }

    }

    public void search() {
        if (proses.isEmpty()) {
            System.out.println("Tidak dapat mencari data karena data masih kosong");
        } else {
            System.out.println("Masukan data yang dicari !");
            System.out.print("Nama Barang  :");
            String namaBarang = sc.next();
            object.setNama(namaBarang);
            System.out.print("ID Barang    :");
            int idBarang = sc.nextInt();
            object.setId(idBarang);
            System.out.print("Harga Barang :Rp.");
            double hargaBarang = sc.nextDouble();
            object.setHarga(hargaBarang);
            barang cari = new barang(object.getNama(), object.getId(), object.getHarga());

            int hasil = (int) proses.search(cari);
            if (hasil >= 0) {
                System.out.println(cari);
                System.out.println("Data ditemukan");
            } else {
                System.out.println("Data Tidak Ditemukan");
            }
        }
    }

    public void delete() {
        System.out.println("----------------------------------------------------");
        System.out.println("HAPUS BARANG");
        System.out.println("1.hapus data ");
        System.out.println("2.Clear all ");
        System.out.println("3.kembali ke menu ");
        System.out.print("Pilih :");
        int n = sc.nextInt();
        if (n <= 2 && n >= 1) {
            if (n == 1) {
                System.out.print("Nama Barang  :");
                String namaBarang = sc.next();
                object.setNama(namaBarang);
                System.out.print("ID Barang    :");
                int idBarang = sc.nextInt();
                object.setId(idBarang);
                System.out.print("Harga Barang :Rp.");
                double hargaBarang = sc.nextDouble();
                object.setHarga(hargaBarang);
                barang cari = new barang(object.getNama(), object.getId(), object.getHarga());

                int hasil = (int) proses.search(cari);
                if (hasil >= 0) {
                    System.out.println(cari);
                    System.out.println("hapus data ?");
                    System.out.println("1.YA");
                    System.out.println("2.Tidak");
                    System.out.print("Pilih :");
                    int m = sc.nextInt();
                    if (m == 1) {
                        proses.removeItem(cari);
                    } else {
                        delete();
                    }
                } else {
                    System.out.println("Data Tidak Ditemukan");
                    delete();
                }
                delete();
            } else if (n == 2) {
                proses.clearAll();
                delete();
            } else if (n == 3) {
                menu();
            } else {
                System.out.println("input tidak sesuai");
                delete();
            }

        }
    }

    public void tambahItem() {

        System.out.println("----------------------------------------------------");
        System.out.println("TAMBAH BARANG");
        System.out.println("1.Tambah Item");
        System.out.println("2.kembali ke menu");
        System.out.print("Pilih :");
        int n = sc.nextInt();

        while (n == 1) {
            System.out.print("Nama Barang  :");
            String namaBarang = sc.next();
            object.setNama(namaBarang);
            System.out.print("ID Barang    :");
            int idBarang = sc.nextInt();
            object.setId(idBarang);
            System.out.print("Harga Barang :Rp.");
            double hargaBarang = sc.nextDouble();
            object.setHarga(hargaBarang);

            barang brgall = new barang(object.getNama(), object.getId(), object.getHarga());
            proses.addLast(brgall);

            System.out.println("------------------------------------------------");
            System.out.println("1.Tambah Item");
            System.out.println("2.kembali ke menu");
            System.out.print("Pilih :");
            n = sc.nextInt();
        }
    }

    public void menu() {
        System.out.println("----------------------------------------------------");
        System.out.println("SISTEM MANEJEMEN STOCK BARANG ENA-ENA COMP");
        System.out.println("1. Show Data");
        //extend sorting
        System.out.println("2. Add Data");
        System.out.println("3. Search Data");
        System.out.println("4. Delete Data");
        //extend clear all
        System.out.println("5. Exit");
        System.out.println("-----------------------------------------------");
    }

}
