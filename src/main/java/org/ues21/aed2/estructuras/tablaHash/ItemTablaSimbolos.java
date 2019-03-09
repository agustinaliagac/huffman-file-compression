package org.ues21.aed2.estructuras.tablaHash;

/**
 * Clase que representa un item en la tabla de símbolos donde:
 * - simbolo = caracter original
 * - codigo = código obtenido desde el árbol de Huffman
 */
public class ItemTablaSimbolos implements Comparable<ItemTablaSimbolos>{
    private char simbolo;
    private String codigo;

    public ItemTablaSimbolos(char simbolo, String codigo) {
        this.simbolo = simbolo;
        this.codigo = codigo;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public int compareTo(ItemTablaSimbolos o) {
        return this.codigo.compareTo(o.codigo);
    }

}
