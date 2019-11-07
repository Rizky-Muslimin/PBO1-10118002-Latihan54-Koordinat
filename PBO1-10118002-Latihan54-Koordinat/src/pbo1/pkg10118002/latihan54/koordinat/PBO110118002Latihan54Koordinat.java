
package pbo1.pkg10118002.latihan54.koordinat;

/**
 *
 * @author 
 * NAMA  : Rizky Muslimin
 * KELAS : IF 1
 * NIM   : 10118002
 * Deskripsi Program : Program ini untuk membuat Warna Sumbu.
 */
public class PBO110118002Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        WarnaKoordinat wKoordinat = new WarnaKoordinat (10,4,"Jingga");
        System.out.println("Warna Koordinat : "+wKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+wKoordinat.getX()+", y : "+wKoordinat.getY());
    }
    
}
