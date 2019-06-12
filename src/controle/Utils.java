/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

/**
 *
 * @author WENDERSON_S
 */
public class Utils {
    
    public String limpaCaracteres(String text) { 
		
		
	    return text.replaceAll("[ãâàáä]", "a")   
	                .replaceAll("[êèéë]", "e")   
	                .replaceAll("[îìíï]", "i")   
	                .replaceAll("[õôòóö]", "o")   
	                .replaceAll("[ûúùü]", "u")   
	                .replaceAll("[ÃÂÀÁÄ]", "A")   
	                .replaceAll("[ÊÈÉË]", "E")   
	                .replaceAll("[ÎÌÍÏ]", "I")   
	                .replaceAll("[ÕÔÒÓÖ]", "O")   
	                .replaceAll("[ÛÙÚÜ]", "U")   
	                .replace('ç', 'c')   
	                .replace('Ç', 'C')   
	                .replace('ñ', 'n')   
	                .replace('Ñ', 'N')
	                .replaceAll("!", "")	                
	                .replaceAll ("\\[\\´\\`\\?\\!\\$\\%\\¨\\*","")
	                .replaceAll("\\(\\)\\=\\{\\}\\[\\]\\~\\^\\]","")
	                .replaceAll("[\\.\\;\\-\\_\\+\\'\\ª\\º\\:\\;\\/]","");
	    	
	}
    
}
