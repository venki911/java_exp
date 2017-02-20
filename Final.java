class Final {
    
    static final int FIN = 20;
    
    public static void main(String args[]){
        
        FIN = 21; // error can't modify final 
        System.out.println(FIN);
        
    } 
    
}
