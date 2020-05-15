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
public class BieuThucDecrator extends BieuThuc{

    BieuThuc bieuThuc;

    public BieuThucDecrator(BieuThuc bieuThuc) {
        this.bieuThuc = bieuThuc;
    }
    
    @Override
    public float giatri() {
         return bieuThuc.giatri();
    }

    @Override
    public String bieuthuc() {
        //throw new UnsupportedOperationException(""); //To change body of generated methods, choose Tools | Templates.
        return bieuThuc.bieuthuc();
    }
    
}
