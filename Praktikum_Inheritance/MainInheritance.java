package Praktikum_Inheritance;

import java.time.LocalDate;

public class MainInheritance {
    public static void main(String[] args) {
        
        Manusia manusia1 = new Manusia("Abdul Kodir", true, "1234567", true);
        Manusia manusia2 = new Manusia("Siti Nurbaya", false, "7654321", true);
        Manusia manusia3 = new Manusia("Immanuel Issac Hadi", true, "123456789", false);

        System.out.println("============ Manusia ============");
        System.out.println(manusia1);
        System.out.println("=================================");
        System.out.println(manusia2);
        System.out.println("=================================");
        System.out.println(manusia3);
        System.out.println("=================================");
        System.out.println();


        MahasiswaFilkom mahasiswa1 = new MahasiswaFilkom("Abdul Kodir", false, "1234567", true, "245150601110007", 2.5);
        MahasiswaFilkom mahasiswa2 = new MahasiswaFilkom("Siti Nurbaya", false, "7654321", true, "24515021110009", 3.34);
        MahasiswaFilkom mahasiswa3 = new MahasiswaFilkom("Immanuel Issac Hadi", true, "123456789", false, "245150701111006", 3.74);
        
        System.out.println("========== Mahasiswa Filkom==========");
        System.out.println(mahasiswa1);
        System.out.println("=====================================");
        System.out.println(mahasiswa2);
        System.out.println("=====================================");
        System.out.println(mahasiswa3);
        System.out.println("=====================================");
        System.out.println();


        Pekerja pekerja1 = new Pekerja("Budiono Siregar", true, "987654321", true, 4000, LocalDate.of(2023, 04, 20) , 2);
        Pekerja pekerja2 = new Pekerja("Assasino Cappucino", true, "11223344", false, 8000, LocalDate.of(2016, 4, 20), 0);
        Pekerja pekerja3 = new Pekerja("Halilintar Anofial Asmid", true, "99999999", true, 5000, LocalDate.of(2005, 4, 20), 10);

        System.out.println("============ Pekerja ============");
        System.out.println(pekerja1);
        System.out.println("=================================");
        System.out.println(pekerja2);
        System.out.println("=================================");
        System.out.println(pekerja3);
        System.out.println("=================================");
        System.out.println();


        Manager manager1 = new Manager("Mega-chan", false, "69966996", true, 7500, LocalDate.of(2010, 4, 20), 0, "Keuangan");

        System.out.println("============ Manager ============");
        System.out.println(manager1);
    }
}
