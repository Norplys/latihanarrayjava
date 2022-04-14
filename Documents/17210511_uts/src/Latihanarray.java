/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Legion
 */
public class Latihanarray {
    public static void main (String[]args){
        int i;
        String [] datanama;
        String [] datanim;
        datanama = new String [3];
        datanim = new String [3];
        Scanner input = new Scanner (System.in);
            for(i=0; i<3; i++)
            {   
                System.out.println("\nDATA KE " +(i+1) );
                System.out.println("Masukkan Nama =");
                datanama[i] = input.nextLine();
                System.out.println("Masukkan NIM = ");
                datanim[i] = input.nextLine();
            }
        System.out.println("\n\nData Hasil input\n");
        for(i=0;i<3;i++)
        {
            System.out.println("\nDATA KE " +(i+1) );
            System.out.print("\nNama =" );
            System.out.println(" = " + datanama[i]);
            System.out.print("NIM =" );
            System.out.println(" = " + datanim[i]);
            
        }
    }
}
