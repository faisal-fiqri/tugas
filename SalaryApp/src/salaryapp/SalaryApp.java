/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salaryapp;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import test.hitungGaji;

/**
 *
 * @author faisalf
 */
public class SalaryApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        JFrame form = new JFrame ("Aplikasi Salary");
//        form.setSize(600, 550);
//        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        form.setLocationRelativeTo(null);
//        form.setLayout(null);
//        form.setVisible(true);
//
//        JLabel labelJudul = new JLabel ("Gaji Karyawan");
//        labelJudul.setBounds(250, 10, 300, 20);
//        form.add(labelJudul);

            hitungGaji obj = new hitungGaji();
            obj.setVisible(true);

    }
    
}
