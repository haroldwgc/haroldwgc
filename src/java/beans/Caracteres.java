/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author harold
 */
public class Caracteres {
//
    private static final String ORIGINAL
            = "ÁáÉéÍíÓóÚúÑñÜü";
    private static final String REPLACEMENT
            = "AaEeIiOoUuNnUu ";

    public String stripAccents(String str) {

        if (str == null) {
            return null;
        }
        char[] array = str.toCharArray();
        for (int index = 0; index < array.length; index++) {
            int pos = 0;

            pos = ORIGINAL.indexOf(array[index]);

            if (pos > -1) {
                array[index] = REPLACEMENT.charAt(pos);
            }
        }
        
      
        return new String(array);
    }

}
