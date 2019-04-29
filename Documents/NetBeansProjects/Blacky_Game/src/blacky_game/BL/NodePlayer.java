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
public class NodePlayer {
    Player p;
    NodePlayer next;
    NodePlayer  prev;

    public NodePlayer() {
    }

    public NodePlayer(Player p) {
        this.p = p;
        this.next=null;
        this.prev=null;
    }

    public Player getP() {
        return p;
    }

    public void setP(Player p) {
        this.p = p;
    }

    public NodePlayer getNext() {
        return next;
    }

    public void setNext(NodePlayer next) {
        this.next = next;
    }

    public NodePlayer getPrev() {
        return prev;
    }

    public void setPrev(NodePlayer prev) {
        this.prev = prev;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final NodePlayer other = (NodePlayer) obj;
        if (!Objects.equals(this.p, other.p)) {
            return false;
        }
        if (!Objects.equals(this.next, other.next)) {
            return false;
        }
        if (!Objects.equals(this.prev, other.prev)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NodePlayer{" + "p=" + p + ", next=" + next + ", prev=" + prev + '}';
    }
    







}
