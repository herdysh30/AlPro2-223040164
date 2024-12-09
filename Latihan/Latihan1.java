package Latihan;

import java.util.Scanner;

public class Latihan1 {
    int[][] a, b, c;
    Scanner bc = new Scanner(System.in);

    void inisial(int baris, int kolom) {
        a = new int[baris][kolom];
        b = new int[baris][kolom];
        c = new int[baris][kolom];
    }

    void insert_nilai_matriks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai matriks A:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print("A|" + i + "||" + j + "|: ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Masukkan nilai matriks B:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print("B|" + i + "||" + j + "|: ");
                b[i][j] = sc.nextInt();
            }
        }
    }

    void operasi_perkalian() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                c[i][j] = 0;
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }

    void operasi_tambahan() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    void operasi_pengurangan() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
    }

    void tampil() {
        System.out.println("Hasil:");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j] + "|");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Latihan1 m = new Latihan1();
        m.inisial(2, 2);
        m.insert_nilai_matriks();
        m.operasi_perkalian();
        m.operasi_tambahan();
        m.operasi_pengurangan();
        m.tampil();
    }
}

