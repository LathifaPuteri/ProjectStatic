/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectstatic;

/**
 *
 * @author MOKLET-2
 */
public class ProjectStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClassStatic mobil = new ClassStatic();
        System.out.println(mobil.judul());
        ClassStatic.identitas();
        ClassStatic.mobil();
        ClassStatic.peminjaman();
    }
    
}
