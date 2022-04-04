/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HDT7;

/**
 *
 * @author Angel
 */
public class TreeFrances<K,V> {
    
    private V value;
    private K id;
    private TreeIngles<K, V> left;
    private TreeIngles<K, V> right;
    private TreeIngles<K, V> parent;

    

    public TreeFrances(K id, V value) {
        setId(id);
        setValue(value);
        setLeft(null);
        setRight(null);
        setParent(null);
    }
    
    public V getValue() {
        return this.value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getId() {
        return this.id;
    }

    public void setId(K id) {
        this.id = id;
    }

    public TreeIngles<K, V> getLeft() {
        return this.left;
    }

    public void setLeft(TreeIngles<K, V> left) {
        this.left = left;
    }

    public TreeIngles<K, V> getRight() {
        return this.right;
    }

    public void setRight(TreeIngles<K, V> right) {
        this.right = right;
    }

    public TreeIngles<K, V> getParent() {
        return this.parent;
    }

    public void setParent(TreeIngles<K, V> parent) {
        this.parent = parent;
    }
}
