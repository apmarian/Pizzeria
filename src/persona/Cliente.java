/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

import item.Item;
import java.util.ArrayList;
import pedido.Pedido;
import pedido.PedidoOnLine;

/**
 *
 * @author maria
 */
public class Cliente {
    
    private String nombre; 
    private ArrayList<Pedido> pedidos; 

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.pedidos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public boolean addPedido(Pedido pedido){
        if(!this.pedidos.contains(pedido)){
            this.pedidos.add(pedido); //si no contiene al pedido lo agrega 
            return true; 
        }
        return false; 
    }
    //sacar frecuencia de un item por cliente
    public int getFrecuenciaItem(Item item){
        int frecuencia =0;
        //se recorre los pedidos del cliente en el que estamos
        // Ciclo Tipo "Pedido", individualmente recorre cada "pedido" del atributo "pedidos" de este clase (Cliente)
        for(Pedido pedido: this.pedidos){ 
           if( pedido instanceof PedidoOnLine){ //verificar que sea pedido online
               frecuencia+= pedido.getFrecuenciaItem(item);//agrega a 'frecuencia' la frecuencia del item en ese pedido
           }
        }
        return frecuencia;
        
    }
    
}
