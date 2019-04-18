/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.tba;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Jundi
 */
public class TUBESTBA {

    /**
     * @param args the command line arguments
     */
    private static Stack<String> PDA = new Stack();
    

    public static boolean cekSubjek(String[] ArrayKalimat){
        boolean a = false;
        if(ArrayKalimat[0] != null){
            if (ArrayKalimat[0].charAt(0) =='A') {
                if(ArrayKalimat[0].charAt(1)=='K'){
                    if(ArrayKalimat[0].charAt(2)=='U'){
                        a=true;
                    }
                }
             
            }else if(ArrayKalimat[0].charAt(0)=='K'){
                if(ArrayKalimat[0].charAt(1)=='A'){
                    if(ArrayKalimat[0].charAt(2)=='M'){
                        if(ArrayKalimat[0].charAt(3)=='U'){
                            a=true; 
                        }
                    }
                }
            }else if(ArrayKalimat[0].charAt(0)=='D'){
                if(ArrayKalimat[0].charAt(1)=='I'){
                    if(ArrayKalimat[0].charAt(2)=='A'){
                        a=true;
                    }

                }
            }else if(ArrayKalimat[0].charAt(0)=='P'){
                if(ArrayKalimat[0].charAt(1)=='A'){
                    if(ArrayKalimat[0].charAt(2)=='P'){
                        if(ArrayKalimat[0].charAt(3)=='A'){
                            a=true;
                        }
                    }
                }
            }else if(ArrayKalimat[0].charAt(0)=='S'){
                if(ArrayKalimat[0].charAt(1)=='A'){
                    if(ArrayKalimat[0].charAt(2)=='Y'){
                        if(ArrayKalimat[0].charAt(3)=='A'){
                            a=true;
                        }
                    }
                }
            }
        }
        return a;
    }
    public static boolean cekPredikat(String[] ArrayKalimat){
        boolean a = false;
        if(ArrayKalimat[1] != null){
            if(ArrayKalimat[1].charAt(0) =='M'){
                if(ArrayKalimat[1].charAt(1)== 'A'){
                    if(ArrayKalimat[1].charAt(2)=='K'){
                        if(ArrayKalimat[1].charAt(3)=='A'){
                            if(ArrayKalimat[1].charAt(4)=='N'){
                                a=true;
                            }
                        }     
                    }
                
        }else if(ArrayKalimat[1].charAt(1)=='I'){
                if(ArrayKalimat[1].charAt(2)=='N'){
                    if(ArrayKalimat[1].charAt(3)=='U'){
                        if(ArrayKalimat[1].charAt(4)=='M'){
                            a=true;            
                        }               
                    } else if(ArrayKalimat[1].charAt(3)=='T'){
                    if(ArrayKalimat[1].charAt(4)=='A'){
                            a=true;                                    
                    }
                }
                }        
        }else if(ArrayKalimat[1].charAt(1)=='E'){
                if(ArrayKalimat[1].charAt(2)=='N'){
                    if(ArrayKalimat[1].charAt(3)=='U'){
                        if(ArrayKalimat[1].charAt(4)=='L'){
                            if(ArrayKalimat[1].charAt(5)=='I'){
                                if(ArrayKalimat[1].charAt(6)=='S'){
                                    a=true;             
                                }               
                            }               
                        }         
                    }
                }
        }
       }else if(ArrayKalimat[1].charAt(0)=='T'){
            if(ArrayKalimat[1].charAt(1)=='I'){
                if(ArrayKalimat[1].charAt(2)=='D'){
                    if(ArrayKalimat[1].charAt(3)=='U'){
                        if(ArrayKalimat[1].charAt(4)=='R'){
                            a=true;             
                        }         
                    }
                }
            }
        }
        }  
        return a;
    }
    
    public static boolean cekObjek(String[] ArrayKalimat){
        boolean a = false;
        if(ArrayKalimat[2] != null){
            if(ArrayKalimat[2].charAt(0) =='N'){
                if(ArrayKalimat[2].charAt(1)== 'A'){
                    if(ArrayKalimat[2].charAt(2)=='S'){
                        if(ArrayKalimat[2].charAt(3)=='I'){
                                a=true;
                        }     
                    }
                }
        }else if(ArrayKalimat[2].charAt(0)=='A'){
                if(ArrayKalimat[2].charAt(1)=='I'){
                    if(ArrayKalimat[2].charAt(2)=='R'){
                        a=true;             
                    }
                }   
        }else if(ArrayKalimat[2].charAt(0)=='B'){
                if(ArrayKalimat[2].charAt(1)=='O'){
                    if(ArrayKalimat[2].charAt(2)=='L'){
                        if(ArrayKalimat[2].charAt(3)=='A'){
                            a=true;              
                        }               
                    }
                }
        }else if(ArrayKalimat[2].charAt(0)=='E'){
                if(ArrayKalimat[2].charAt(1)=='S'){
                    if(ArrayKalimat[2].charAt(2)=='S'){
                        if(ArrayKalimat[2].charAt(3)=='A'){
                            if(ArrayKalimat[2].charAt(4)=='Y'){
                                    a=true;         
                            }               
                        }         
                    }
                }
        }else if(ArrayKalimat[2].charAt(0)=='S'){
            if(ArrayKalimat[2].charAt(1)=='I'){
                if(ArrayKalimat[2].charAt(2)=='A'){
                    if(ArrayKalimat[2].charAt(3)=='N'){
                        if(ArrayKalimat[2].charAt(4)=='G'){
                            a=true;               
                        }         
                    }
                }
            }
        }
        }
        return a;
    }
    public static boolean cekKeterangan(String[] ArrayKalimat){
        boolean a = false;
        if(ArrayKalimat[3] != null){
            if(ArrayKalimat[3].charAt(0) =='D'){
                if(ArrayKalimat[3].charAt(1)== 'I'){
                    if(ArrayKalimat[3].charAt(2)=='R'){
                        if(ArrayKalimat[3].charAt(3)=='U'){
                            if(ArrayKalimat[3].charAt(4)=='M'){
                                if(ArrayKalimat[3].charAt(5)=='A'){
                                    if(ArrayKalimat[3].charAt(6)=='H'){
                                        a=true;
                                    }
                                }
                            }
                        }     
                }else if(ArrayKalimat[3].charAt(2)=='D'){
                        if(ArrayKalimat[3].charAt(3)=='A'){
                            if(ArrayKalimat[3].charAt(4)=='P'){
                                if(ArrayKalimat[3].charAt(5)=='U'){
                                    if(ArrayKalimat[3].charAt(6)=='R'){
                                        a=true;
                                    }
                                }
                            }
                        }     
                } else if(ArrayKalimat[3].charAt(2)=='K'){
                        if(ArrayKalimat[3].charAt(3)=='A'){
                            if(ArrayKalimat[3].charAt(4)=='M'){
                                if(ArrayKalimat[3].charAt(5)=='A'){
                                    if(ArrayKalimat[3].charAt(6)=='R'){
                                        a=true;
                                    }
                                }
                            }
                        }     
                } else if(ArrayKalimat[3].charAt(2)=='B'){
                        if(ArrayKalimat[3].charAt(3)=='U'){
                            if(ArrayKalimat[3].charAt(4)=='K'){
                                if(ArrayKalimat[3].charAt(5)=='U'){
                                        a=true;                                 
                                }
                            }
                        }     
                } else if(ArrayKalimat[3].charAt(2)=='T'){
                        if(ArrayKalimat[3].charAt(3)=='A'){
                            if(ArrayKalimat[3].charAt(4)=='M'){
                                if(ArrayKalimat[3].charAt(5)=='A'){   
                                    if(ArrayKalimat[3].charAt(6)=='N'){
                                        a=true;
                                    }
                                }
                            }
                        }     
                }
            }
            }
        }
        return a;
    }
    public static boolean cekKeterangan1(String[] ArrayKalimat){
        boolean a = false;
        if(ArrayKalimat[2] != null){
            if(ArrayKalimat[2].charAt(0) =='D'){
                if(ArrayKalimat[2].charAt(1)== 'I'){
                    if(ArrayKalimat[2].charAt(2)=='R'){
                        if(ArrayKalimat[2].charAt(3)=='U'){
                            if(ArrayKalimat[2].charAt(4)=='M'){
                                if(ArrayKalimat[2].charAt(5)=='A'){
                                    if(ArrayKalimat[2].charAt(6)=='H'){
                                        a=true;
                                    }
                                }
                            }
                        }     
                }else if(ArrayKalimat[2].charAt(2)=='D'){
                        if(ArrayKalimat[2].charAt(3)=='A'){
                            if(ArrayKalimat[2].charAt(4)=='P'){
                                if(ArrayKalimat[2].charAt(5)=='U'){
                                    if(ArrayKalimat[2].charAt(6)=='R'){
                                        a=true;
                                    }
                                }
                            }
                        }     
                } else if(ArrayKalimat[2].charAt(2)=='K'){
                        if(ArrayKalimat[2].charAt(3)=='A'){
                            if(ArrayKalimat[2].charAt(4)=='M'){
                                if(ArrayKalimat[2].charAt(5)=='A'){
                                    if(ArrayKalimat[2].charAt(6)=='R'){
                                        a=true;
                                    }
                                }
                            }
                        }     
                } else if(ArrayKalimat[2].charAt(2)=='B'){
                        if(ArrayKalimat[2].charAt(3)=='U'){
                            if(ArrayKalimat[2].charAt(4)=='K'){
                                if(ArrayKalimat[2].charAt(5)=='U'){
                                        a=true;                                 
                                }
                            }
                        }     
                } else if(ArrayKalimat[2].charAt(2)=='T'){
                        if(ArrayKalimat[2].charAt(3)=='A'){
                            if(ArrayKalimat[2].charAt(4)=='M'){
                                if(ArrayKalimat[2].charAt(5)=='A'){   
                                    if(ArrayKalimat[2].charAt(6)=='N'){
                                        a=true;
                                    }
                                }
                            }
                        }     
                }
            }
            }
        }
        return a;
    }
    
    public static boolean outputan (String[] ArrayKalimat){
        boolean a = false;
        String SPOK = "";
        if(ArrayKalimat.length==4){
//            System.out.println("");
//            System.out.println("Pola kalimat :");
            if(cekSubjek(ArrayKalimat)){
            PDA.pop();
            PDA.push("S");
            SPOK+=PDA.pop();
            if(cekPredikat(ArrayKalimat)){
                PDA.push("-P");
                SPOK+=PDA.pop();
                if(cekObjek(ArrayKalimat)){
                    PDA.push("-O");
                    SPOK+=PDA.pop();
                    if(cekKeterangan(ArrayKalimat)){
                            PDA.push("-K");
                            SPOK+=PDA.pop();
                            a=true;
                    }
                }
            
            }
            }
        } else
        if(ArrayKalimat.length==3){
//            System.out.println("");
//            System.out.println("Pola kalimat :");
            if(cekSubjek(ArrayKalimat)){
            PDA.pop();
            PDA.push("S");
            SPOK+=PDA.pop();
            if(cekPredikat(ArrayKalimat)){
                PDA.push("-P");
                SPOK+=PDA.pop();
                if(cekObjek(ArrayKalimat)){
                    PDA.push("-O");
                    SPOK+=PDA.pop();
                    a=true;
                } 
                if(cekKeterangan1(ArrayKalimat)){
                    PDA.push("-K");
                    SPOK+=PDA.pop();
                    a=true;
                }
            
            }
            }
        } else
        if(ArrayKalimat.length==2){
//            System.out.println("");
//            System.out.println("Pola kalimat :");
            if(cekSubjek(ArrayKalimat)){
            PDA.pop();
            PDA.push("S");
            SPOK+=PDA.pop();
            if(cekPredikat(ArrayKalimat)){
                PDA.push("-P");
                SPOK+=PDA.pop();
                a=true;
            }
            }
        }
         

        
//        System.out.println(SPOK);
        return a;
    }
    public String tampil(String kalimat){
        String[] ArrayKalimat = kalimat.split(" ");
        if (outputan(ArrayKalimat)){
            return "Valid!";
        }else{
            
            return "Tidak Valid!";
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        PDA.push("#");
        PDA.push("Start");
        Scanner  inputan = new Scanner(System.in);
        String kalimat = inputan.nextLine();
//        Stack<String> PDA = new Stack();
        

        
       
        
    }
    
}
