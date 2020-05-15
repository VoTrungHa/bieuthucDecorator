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
public class BieuThucDonGian extends BieuThuc{
    float toanHang;
    public BieuThucDonGian(float toanHang) {
        this.toanHang=toanHang;
    } 
    
    @Override
    public float giatri() {
         return toanHang;
    }

    @Override
    public String bieuthuc() {
            return new Float(toanHang).toString();
    }

    
    
}
