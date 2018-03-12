/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasunitarias;

import junit.framework.TestCase;
import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author andresteve07
 */
public class OperacionesTests extends TestCase{
    
    public OperacionesTests() {
        // we do not want the users to print something
        System.setOut(new PrintStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException { }
        }));
        System.setErr(new PrintStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException { }
        }));
    }
    
    public void testSuma(){
        assertEquals(Operaciones.suma(2, 3), 5);
    }
    
    public void testRemoverElemento(){
        int[] arregloOrig = new int[]{1,2,3,1,2,3};
        int[] arregloModif = Operaciones.removerElemento(arregloOrig, 2);
        boolean existe = false;
        
        for (int i = 0; i < arregloModif.length; i++) {
            if(arregloModif[i]==2){
                existe = true;
                break;
            }
        }
        assertTrue(!existe);
    }
    
    
}
