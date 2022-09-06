/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Banda;
import Modelos.Colegio;
import Modelos.Concurso;
import Modelos.Instrumento;
import Modelos.Integrante;
import Modelos.Presentacion;
import Modelos.Ronda;
import java.util.LinkedList;

/**
 *
 * @author pipet
 */
public class ProyectoConcurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Instrumento instrumento1 = new Instrumento("1", "acordeon", "Yamaha");
        Instrumento trompeta1 = new Instrumento("2", "trompeta", "Jupiter");
        Instrumento trompeta2 = new Instrumento("3", "trompeta", "Yamaha");
        Instrumento trompeta3 = new Instrumento("4", "trompeta", "Conductor");

        Integrante integrante1 = new Integrante("1", "Felipe", 2);
        Integrante integrante2 = new Integrante("2", "Ana", 5);
        Integrante integrante3 = new Integrante("3", "Lucas", 3);
        
        
        //Relacion 1 a 1
        integrante1.setMiInstrumento(trompeta1);
        integrante2.setMiInstrumento(trompeta2);
        integrante3.setMiInstrumento(trompeta3);
        
        System.out.println("El integrante " + integrante1.getNombre()
                + " interpreta " + integrante1.getMiInstrumento().getNombre());
        Banda banda1=new Banda("1", "Manizales", 2000, 6);
        Colegio colegio1=new Colegio("1", "UAM", 1905);
        banda1.setMiColegio(colegio1);
        //Relacion 1 a n
        banda1.getMisIntegrantes().add(integrante1);
        banda1.getMisIntegrantes().add(integrante2);
        banda1.getMisIntegrantes().add(integrante3);
        System.out.println("La banda "+banda1.getId()
                            +" tiene "+banda1.getMisIntegrantes().size());

        Banda bandaA=new Banda("1", "A", 1900, 5);
        Banda bandaB=new Banda("2", "C", 1906, 9);
        
        Ronda ronda1=new Ronda("1", "Domingo", 16, "Parque");
        Ronda ronda2=new Ronda("1", "Domingo", 8, "Teatro");

        Concurso miConcurso=new Concurso("1", "Prueba", 20000);
        miConcurso.getMisBandas().add(bandaA);
        miConcurso.getMisBandas().add(bandaB);
        
        miConcurso.getMisRondas().add(ronda1);
        miConcurso.getMisRondas().add(ronda2);
        
        Presentacion p1=new Presentacion("1", 90);
        p1.setMiBanda(bandaA);
        p1.setMiRonda(ronda1);
        bandaA.getMisPresentaciones().add(p1);
        ronda1.getMisPresentaciones().add(p1);
        
        
        Presentacion p2=new Presentacion("2", 85);
        p2.setMiBanda(bandaA);
        p2.setMiRonda(ronda2);
        bandaA.getMisPresentaciones().add(p2);
        ronda2.getMisPresentaciones().add(p2);
        
        Presentacion p3=new Presentacion("3", 75);
        p3.setMiBanda(bandaB);
        p3.setMiRonda(ronda1);
        bandaB.getMisPresentaciones().add(p3);
        ronda1.getMisPresentaciones().add(p3);
        
        Presentacion p4=new Presentacion("4", 95);
        p4.setMiBanda(bandaB);
        p4.setMiRonda(ronda2);
        bandaB.getMisPresentaciones().add(p4);
        ronda2.getMisPresentaciones().add(p4);
        
//        System.out.println("El instrumento "+instrumento1.getNombre()
//                             +" es de marca "+instrumento1.getMarca());
//        
//        instrumento1.setMarca("Colombiano");
//        
//        System.out.println("El instrumento "+instrumento1.getNombre()
//                             +" es de marca "+instrumento1.getMarca());
//        
//    LinkedList<Instrumento> listaInstrumentos=
//                                     new LinkedList<>();
//    
//    listaInstrumentos.add(instrumento1);
//    listaInstrumentos.add(trompeta1);
//    listaInstrumentos.add(trompeta2);
//    listaInstrumentos.add(trompeta3);
//    for (int i = 0; i < listaInstrumentos.size(); i++) {
//        System.out.println(listaInstrumentos.get(i).getMarca());
//    }
//    
    }
}
