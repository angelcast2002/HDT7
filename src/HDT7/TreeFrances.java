/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HDT7;

/**
 *
 * @author Angel
 * @param <K>
 * @param <V>
 */
public class TreeFrances<K,V> {
    
    private V value;
    private K id;
    private TreeIngles<K, V> left;
    private TreeIngles<K, V> right;
    private TreeIngles<K, V> parent;

    /**
     *
     * @param id
     * @param value
     */
    public TreeFrances(K id, V value) {
        setId(id);
        setValue(value);
        setLeft(null);
        setRight(null);
        setParent(null);
    }
    
    /**
     *
     * @return
     */
    public V getValue() {
        return this.value;
    }

    /**
     *
     * @param value
     */
    public void setValue(V value) {
        this.value = value;
    }

    /**
     *
     * @return
     */
    public K getId() {
        return this.id;
    }

    /**
     *
     * @param id
     */
    public void setId(K id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public TreeIngles<K, V> getLeft() {
        return this.left;
    }

    /**
     *
     * @param left
     */
    public void setLeft(TreeIngles<K, V> left) {
        this.left = left;
    }

    /**
     *
     * @return
     */
    public TreeIngles<K, V> getRight() {
        return this.right;
    }

    /**
     *
     * @param right
     */
    public void setRight(TreeIngles<K, V> right) {
        this.right = right;
    }

    /**
     *
     * @return
     */
    public TreeIngles<K, V> getParent() {
        return this.parent;
    }

    /**
     *
     * @param parent
     */
    public void setParent(TreeIngles<K, V> parent) {
        this.parent = parent;
    }
}
