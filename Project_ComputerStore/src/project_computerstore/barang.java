
package project_computerstore;

/**
 *
 * @author Nx
 */
public class barang implements Comparable{
    String nama;
    int id, jumlah;
    double harga;

    public barang(String nama, int id, double harga) {
        this.nama = nama;
        this.id = id;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public barang(String nama, int id, int jumlah, double harga) {
        this.nama = nama;
        this.id = id;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public barang() {
    }
    @Override
    public int compareTo(Object o) {
        if (nama.compareTo(((barang) o).getNama()) == 0) {
            return 0;
        } else if (nama.compareTo(((barang) o).getNama()) > 0) {
            return 1;
        } else if (nama.compareTo(((barang) o).getNama()) < 0) {
            return -1;

        }
        return -1;

    }
    @Override
    public String toString() {
        String data = "\t" + getNama() + "\t" + getId() + "\t" +"Rp."+ getHarga() ;
        return data;
    }
    
    
}
