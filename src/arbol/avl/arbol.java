/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol.avl;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author mfer-
 */
public class arbol {
    private Nodo raiz;
    
    public Nodo buscar(int d,Nodo r){
    if (raiz==null){
    return null;
    }else if(r.getDato()==d){
    return r;
    }else if(r.getDato()<d){
    return buscar(d,r.getHijoder());
    }else {
    return buscar(d,r.getHijoizq());
    }
    }
    public int contenerF(Nodo x){
    if (x==null){
    return -1;
    }else {
        return x.getElemento();
    }
    }
    public Nodo rotacionIzq(Nodo c){
        Nodo aux=c.getHijoizq();
        c.setHijoizq(aux.getHijoder());
        aux.setHijoder(c);
        c.setElemento(Math.max(contenerF(c.getHijoizq()),contenerF(c.getHijoizq()))+1);
        
        aux.setElemento(Math.max(contenerF(aux.getHijoizq()),contenerF(aux.getHijoizq()))+1);
        return aux;
    }
    //rotacion Derecha
     public Nodo rotacionDer(Nodo c){
        Nodo aux=c.getHijoder();
        c.setHijoder(aux.getHijoizq());
        aux.setHijoizq(c);
        c.setElemento(Math.max(contenerF(c.getHijoizq()),contenerF(c.getHijoizq()))+1);
        aux.setElemento(Math.max(contenerF(aux.getHijoizq()),contenerF(aux.getHijoizq()))+1);
        return aux;
    }
     public Nodo rotaciondobleIzq(Nodo c){
         Nodo temporal;
         c.setHijoizq(rotacionDer(c.getHijoizq()));
         temporal=rotacionDer(c);
      return temporal;
     }
     public Nodo rotacionDobleIzq(Nodo c){
          Nodo Temporal ;
          c.setHijoizq(rotacionDer(c.getHijoizq()));
          Temporal=rotacionIzq(c);
     return Temporal;
     }
     
     public Nodo rotacionDobleder(Nodo c){
        Nodo Temporal ;
          c.setHijoder(rotacionIzq(c.getHijoder()));
          Temporal=rotacionDer(c);
          return Temporal;
     }
     public Nodo insertar(Nodo n, Nodo sub){
         Nodo padre= sub;
         if (n.getDato()<sub.getDato()){
             if (sub.getHijoizq()==null){
                 sub.setHijoizq(n);
             }else {
                 sub.setHijoizq(insertar(n,sub.getHijoizq()));
                 if ((contenerF(sub.getHijoizq())-contenerF(sub.getHijoder())==2)){
                     if (n.getDato()<sub.getHijoizq().getDato()){
                     padre=rotacionIzq(sub);
                     }else {
                    padre=rotacionDobleIzq(sub);
                     
                     }
                 }
             }
         }else if(n.getDato()>sub.getDato()){
             if (sub.getHijoder()==null){
                 sub.setHijoder(n);
             }else{
                 sub.setHijoizq(insertar(n,sub.getHijoder()));
                 if((contenerF(sub.getHijoder())-contenerF(sub.getHijoizq())==2)){
                     if (n.getDato()>sub.getHijoder().getDato()){
                        padre=rotacionDer(sub);
                     }else{
                         padre=rotacionDer(sub);
                     }
                 }
             }
         }else {
             System.out.println("Nodo Duplicado");
         }
         if((sub.getHijoizq()==null) &&(sub.getHijoizq()!=null )){
             sub.setElemento(sub.getHijoder().getElemento()+1);
         }else if((sub.getHijoder()==null)&&(sub.getHijoizq()==null)){
             sub.setElemento(sub.getHijoizq().getElemento()+1);
         }else{
             sub.setElemento(Math.max(contenerF(sub.getHijoizq()),contenerF(sub.getHijoizq()))+1);
         }
         return padre;
     }
public void push(int d){
    Nodo nuevo=new Nodo(d);
    if(raiz==null){
        raiz=nuevo;
    }else{
        raiz=insertar(nuevo,raiz);
    }
}
public void InOrden(){
    raiz.InOrden();
}
public void preOrden(){
    raiz.PostOrden();

}
public void postOrden(){
raiz.PostOrden();
}
public String obtenerArbol(){
        String text="Diagrama \n"
                +"    node[shape = cicle] \n"
                +"    node[style = failed]\n"
                +"    node[failcolor =\"#EEEEE\"] \n"
                + "   node[color =\"#EEEEE\"]\n"
                +"    edge[color =\"#31CEF0\"]";
        if (raiz==null){
        text+=raiz.textoGrafico();
        }
        text+="}\n";
        return text;
    }
public void escribirArbol(String ruta,String contenido){
    FileWriter fichero=null;
        PrintWriter pw=null;
        try {
        }catch(Exception ex){
        
        }finally{
            System.out.println("ex.getMesage()");
        }
}
}
