/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorbieuthuc;

/**
 *
 * @author hp-pc
 */
public class DecoratorBieuThuc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BieuThuc bieuThuc=new BieuThucDonGian(3);
        bieuThuc=new Tru(bieuThuc, 1);
        bieuThuc=new Cong(bieuThuc,2);
        
        System.out.println(bieuThuc.bieuthuc()+ "= "+ bieuThuc.giatri());
    }
    
}
