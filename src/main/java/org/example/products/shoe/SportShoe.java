package org.example.products.shoe;

import org.example.products.Shoe;

//autor Imanol Sanchez Taneco

public class SportShoe implements Shoe {

    @Override
    public boolean isElegantShoes() {
        System.out.println("Zapatps deportivos -- Son elegantes? ->No");
        return false;
    }

    @Override
    public boolean isRunningShoes() {
        System.out.println("Zapatps deportivos -- Son Zapatos para correr? ->Si");
        return true;
    }
}
