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
    
    
}
