/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol.avl;

public class Nodo {

    private int dato;
    private int elemento;
    private Nodo hijoizq;
    private Nodo hijoder;

    public Nodo(int _dato){
    this.setDato(_dato);
    this.setElemento(_dato);
    this.setHijoder(null);
    this.setHijoizq(null);
    }
    public void InOrden(){
    if(hijoizq!=null){
    hijoizq.InOrden();
    }
    System.out.println(dato);
    if (hijoder!=null){
    hijoder.InOrden();
    }
    }
    public void PreOrden(){
     System.out.println(dato);
    if(hijoizq!=null){
    hijoizq.PreOrden();
    }
   
    if (hijoder!=null){
    hijoder.PreOrden();
    }
    }
    public void PostOrden(){
    if(hijoizq!=null){
    hijoizq.PostOrden();
    }
    
    if (hijoder!=null){
    hijoder.PostOrden();
    }
    System.out.println(dato);
    }
    public String textoGrafico(){
        String texto="";
        if (hijoizq==null && hijoder==null ){
            return String.valueOf(dato);
        }
        else{
            
            if(hijoizq!=null){
            texto=dato+"->"+hijoizq.textoGrafico()+"\n";
            }
            if(hijoder!=null){
            texto=dato+"->"+hijoder.textoGrafico()+"\n";
            }
        }
        return texto;
    }
    public int getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int dato) {
        this.dato = dato;
    }

    /**
     * @return the elemnto
     */
    public int getElemento() {
        return elemento;
    }

    /**
     * @param elemnto the elemnto to set
     */
    public void setElemento(int elemnto) {
        this.elemento = elemnto;
    }

    /**
     * @return the hijoizq
     */
    public Nodo getHijoizq() {
        return hijoizq;
    }

    /**
     * @param hijoizq the hijoizq to set
     */
    public void setHijoizq(Nodo hijoizq) {
        this.hijoizq = hijoizq;
    }

    /**
     * @return the hijoder
     */
    public Nodo getHijoder() {
        return hijoder;
    }

    /**
     * @param hijoder the hijoder to set
     */
    public void setHijoder(Nodo hijoder) {
        this.hijoder = hijoder;
    }
}
