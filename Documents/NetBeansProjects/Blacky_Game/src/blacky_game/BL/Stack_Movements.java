/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blacky_game.BL;

import java.util.Objects;

/**
 *
 * @author krisa
 */
public class Stack_Movements {
    NodePlayer value;
    int size;

    public Stack_Movements(NodePlayer value, int size) {
        this.value = value;
        this.size = size;
    }

    public Stack_Movements(NodePlayer value) {
        this.value = value;
        this.size=0;
    }

    public NodePlayer getValue() {
        return value;
    }

    public void setValue(NodePlayer value) {
        this.value = value;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


 

    @Override
    public String toString() {
        return "Stack_Movements{" + "value=" + value + ", size=" + size + '}';
    }
    
    
    
}
