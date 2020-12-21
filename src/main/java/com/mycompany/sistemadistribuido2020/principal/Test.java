package com.mycompany.sistemadistribuido2020.principal;

import com.mycompany.sistemadistribuido2020.entidades.Producto;
import com.mycompany.sistemadistribuido2020.session.ProductoJpaController;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Test {


    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("practicabdd");
        
        ProductoJpaController pjc = new ProductoJpaController(emf);
        
        Producto p = new Producto(2);

        p.setCodigo(1);
        p.setNombre("Producto_de_ejemplo_numero2");
        Double d1 = 25.99;
        BigDecimal bd1 = BigDecimal.valueOf(d1.doubleValue());
        p.setPrecio(bd1);
        p.setDetalle("Este es otro producto de ejemplo");
        
        
        try {
            pjc.create(p);
        } catch (Exception ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
        
    
    
}
