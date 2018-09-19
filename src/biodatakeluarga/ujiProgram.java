package biodatakeluarga;

import java.util.Scanner;

public class ujiProgram {

    public static void main(String[] args) {
        biodataKeluarga bio = new biodataKeluarga();
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("===Biodata Keluarga===");
        System.out.println("");
        
        System.out.print("Nama Ayah             : ");
        String namaAyah = masuk.nextLine();
        bio.setNamaAyah(namaAyah);
        
        System.out.print("Nama Ibu              : ");
        String namaIbu = masuk.nextLine();
        bio.setNamaIbu(namaIbu);
        
        System.out.print("Nama Saudara          : ");
        String namaSaudara = masuk.nextLine();
        bio.setNamaSaudara(namaSaudara);
        
        System.out.print("Nama Diri             : ");
        String nama = masuk.nextLine();
        bio.setNama(nama);
        
        System.out.print("Alamat                : ");
        String alamat = masuk.nextLine();
        bio.setAlamat(alamat);
        
        System.out.print("Tempat Lahir          : ");
        String tempatLahir = masuk.nextLine();
        bio.setTempatLahir(tempatLahir);
        
        System.out.print("Tanggal Lahir         : ");
        String tglLahir = masuk.nextLine();
        bio.setTanggalLahir(tglLahir);
        
        System.out.print("Hobi                  : ");
        String hobi = masuk.nextLine();
        bio.setHobi(hobi);
        
        System.out.print("Cita - Cita           : ");
        String cita = masuk.nextLine();
        bio.setCita(cita);
        
        System.out.print("Nomor Telepon         : ");
        String noTelp = masuk.nextLine();
        bio.setNoTelp(noTelp);
        System.out.println("");
        
        System.out.println("===Menampilkan Biodata Keluarga===");
        System.out.println("Nama Ayah      : " + bio.getNamaAyah());
        System.out.println("Nama Ibu       : " + bio.getNamaIbu());
        System.out.println("Nama Saudara   : " + bio.getNamaSaudara());
        System.out.println("Nama Diri      : " + bio.getNama());
        System.out.println("Alamat         : " + bio.getAlamat());
        System.out.println("Tempat Lahir   : " + bio.getTempatLahir());
        System.out.println("Tanggal Lahir  : " + bio.getTanggalLahir());
        System.out.println("Hobi           : " + bio.getHobi());
        System.out.println("Cita - Cita    : " + bio.getCita());
        System.out.println("Nomor Telepon  : " + bio.getNoTelp());
        
        
        
        
        
    }
    
}
