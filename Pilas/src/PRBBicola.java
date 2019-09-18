/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sala
 */
public class PRBBicola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bicola bc_prb = new Bicola();
        
        bc_prb.setAtras1(bc_prb.insert("uno", bc_prb.getAtras1(), bc_prb.getAtras2(), 1));
        bc_prb.setAtras1(bc_prb.insert((Integer) 5, bc_prb.getAtras2(), bc_prb.getAtras1(), -1));
        bc_prb.setAtras1(bc_prb.insert((Integer) 6, bc_prb.getAtras2(), bc_prb.getAtras1(), -1));
        bc_prb.setAtras1(bc_prb.insert((Integer) 4, bc_prb.getAtras2(), bc_prb.getAtras1(), -1));
        
        
        Object[]temp=bc_prb.remove( bc_prb.getAtras2(),  bc_prb.getBc().length-1,  -1);
        if (temp[0]!=null) {
            System.out.println("DE"+(Integer)temp[0]);
        }
        bc_prb.setAtras2((int)temp[1]);
        
        
        
    }
    
}
