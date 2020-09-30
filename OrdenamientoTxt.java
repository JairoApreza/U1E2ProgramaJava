package ordenamientotxt;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OrdenamientoTXT {//sort o split
    public static void main(String[] args) throws FileNotFoundException, IOException{
    
      
        String texto=("Hola Mundo De Chairo");
        String txt[]=texto.split(" ");
        String alm[];
        String complemento[]=new String [txt.length];
        FileReader fr = new FileReader("C:/Users/Propietario HP/Desktop/SEPTIMO SEMESTRE/PROGRAMACION LOGICA Y FUNCIONAL/Texto.txt");
        BufferedReader bf= new BufferedReader(fr);
        String tx;
        String rx="";
        String cx="";
        System.out.println("Texto del txt \n");
            while((tx=bf.readLine())!=null){
                texto=tx;
                System.out.println(""+tx);
            }
            alm= texto.split(" ");                     
             for (int i=0; i < alm.length; i++){
                 for (int c=0; c < alm.length; c++){
                     if(alm[i].equals(txt[c])){
                         complemento[c]=alm[i];
                     }}}System.out.println("partes \n");
                 for (int i=0; i < complemento.length; i++){
                     rx+=complemento[i]+" ";
                     System.out.println("vuelta: \n"+rx);
                 }}}
              
    

