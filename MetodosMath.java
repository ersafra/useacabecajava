public class MetodosMath {
    
    static double r1 = Math.random();
    static int r2 = (int) (Math.random()*5);

    static int x  = Math.abs(-240);// retornara 240
    static double d = Math.abs(240.45);

    static int z = Math.round(-24.8f);// retorna -25
    static int y = Math.round(24.45f);//retorna 24

    static int a = Math.min(24,240);
    static double b = Math.min(90876.5,90876.49);

    static int c = Math.max(24,240);
    static double e = Math.max(90876.5,90876.49);

    static double q = Math.sqrt(100);

    static double t = Math.tan(x);

    static double t1 = Math.ceil(1000);

    static double t2 = Math.floor(x);

    static double t3 = Math.asin(x);


    public static void main(String[] args) {
     System.out.println("Randon = " +r2+"/"+r1);
     System.out.println("ABS = " +d+"/"+x); 
     System.out.println("Round = "+y+"/"+z) ;
     System.out.println("Min = "+a+"/"+b) ;
     System.out.println("Max = "+c+"/"+e) ;
     System.out.println("Sqrt = "+q);
     System.out.println("Tan = "+t);
     System.out.println("Ceil = "+t1);
     System.out.println("Floor = "+t2);
     System.out.println("Asin = "+t3);  
    }
}
