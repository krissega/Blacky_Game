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
public class Player_Mov {

    Player p1;
    String movimiento;
    Player_Mov siguiente;

    public Player_Mov() {
    }

    public Player_Mov(Player p1, String movimiento) {
        this.p1 = p1;
        this.movimiento = movimiento;
        this.siguiente=null;
    }

    public Player getP1() {
        return p1;
    }

    public void setP1(Player p1) {
        this.p1 = p1;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public Player_Mov getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Player_Mov siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player_Mov other = (Player_Mov) obj;
        if (!Objects.equals(this.movimiento, other.movimiento)) {
            return false;
        }
        if (!Objects.equals(this.p1, other.p1)) {
            return false;
        }
        if (!Objects.equals(this.siguiente, other.siguiente)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player_Mov{" + "p1=" + p1 + ", movimiento=" + movimiento + ", siguiente=" + siguiente + '}';
    }
    




}
