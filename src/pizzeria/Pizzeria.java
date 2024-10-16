/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzeria;

import item.Item;
import java.util.ArrayList;
import java.util.Collections;
import pedido.Pedido;
import persona.Cliente;

/**
 *
 * @author maria
 */
public class Pizzeria {
    
    private String nombre; 
    private ArrayList<Cliente> clientes; 
    private ArrayList<Item> items; 
    private ArrayList<Pedido> pedidos; 
    

    //constructor 
    public Pizzeria() {
        this.nombre = "Pizzeria Italiana";
        this.clientes = new ArrayList<>();
        this.items = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public Cliente getCliente(int index) {
       //retorna el cliente 
        return this.clientes.get(index);
    }
    
    public boolean addCliente(Cliente cliente){
        //agregar el cliente si no esta (asociacion direccional)
        if(!this.clientes.contains(cliente)){
            this.clientes.add(cliente);
            return true;
        }
        return false;
    }
    
    public boolean addPedido(Pedido pedido){
        //agregar el pedido (asociacion direccional)
        if(!this.pedidos.contains(pedido)){
            this.pedidos.add(pedido);
            return true;
        }
            return false; 
    }

    public Item getItem(int index) {
        //retorna el index del item
        return this.items.get(index);
    }
    
    public boolean addItem(Item item){
        //agrega el item (asociacion direccional) 
        if(!this.items.contains(item)){
            this.items.add(item);
            return true;
        }
        return false; 
    }
    
    public int calcProdMasVendidoCliente(int numCliente){
        System.out.println("numCliente:" +numCliente);
        
        ArrayList<Integer> frecuencias = new ArrayList<>();
        Cliente cliente = this.getCliente(numCliente);
        
        for(Item item: this.items){ //recorre cada item
          //se llama al método para sacar la frecuencia de cada item, y lo almacena en la lista frecuencias
            frecuencias.add(cliente.getFrecuenciaItem(item)); 
        }
        //imprime cuantas veces se vendio el item 
        for (int i=0; i<this.items.size();i++){
            //se recorre cada item y se saca el valor q se vendió
            System.out.println("El producto " + this.items.get(i).getNombre() + " se vendio " + frecuencias.get(i));
        }
        int maxFrecuencia = Collections.max(frecuencias);
        //por Collections saco el maximo y retorna el index del producto mas vendido 
        if(maxFrecuencia>0){
            return frecuencias.indexOf(maxFrecuencia); //para todos los casos donde haya venta online
        }
        return -1; // en el caso que de que no haya productos, el indice seria -1; ya que como en las listas los indices incian en 0, en caso de que no se puede utilizar 0.  
    }
   
}
