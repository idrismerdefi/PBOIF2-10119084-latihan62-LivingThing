/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan62.livingthing;
/**
NAMA : MUHAMMAD IDRIS MERDEFI
KELAS : PBOIF2
NIM : 10119084
DESKRIPSI PROGAM : PROGRAM INI BERISI PROGRAM Living Thing
 */
public class PBOIF210119084Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human objHuman=new Human();
        objHuman.setNama("Rizki Adam Kurniawan");
        
        objHuman.walk(objHuman.getNama());
        objHuman.breath(objHuman.getNama());
        objHuman.eat(objHuman.getNama());
    }
    
}
