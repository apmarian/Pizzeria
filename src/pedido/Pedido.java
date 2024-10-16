/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedido;

import item.Item;
import java.util.ArrayList;
import persona.Cliente;

/**
 *
 * @author maria
 */
public abstract class Pedido {
    protected Cliente cliente;
    protected ArrayList<Item> items; 

    public Pedido(Cliente cliente, ArrayList<Item> items) {
        this.cliente = cliente;
        this.items = items;
        
        //cliente agrega a pedido
        this.cliente.addPedido(this);
        
    }

    public ArrayList<Item> getItems() {
        return items;
    }
    
    public int getFrecuenciaItem(Item item){
        int frecuencia=0; 
        // Ciclo Tipo "Item", individualmente cada "item1" del atributo "items" de este clase (Pedido)
        for(Item item1: this.items){ //recorro cada item para encontrar su frecuencia
            if (item1.equals(item)){ // Si el item es igual (osea se encontro el item de la lista general como item de un pedido de un cliente, ent
                frecuencia++;
            }
        }
        return frecuencia; 
    }
    
}
