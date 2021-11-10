package com.company;

public class CompiexNumbers {
    private static int num2;
    private static int num3;
    int num;
    int numi;

    public CompiexNumbers(int num, int numi) {
        this.numi= numi;
        this.num= num;
    }

    public void printCompl(){
        if (numi<0)
        System.out.println(num +" " +numi+"i");
        else
            if (numi>0)
                System.out.println(num +"+" +numi+"i");
            else
                System.out.println(num );
    }
   public CompiexNumbers slozenie(CompiexNumbers a , CompiexNumbers b){
     int  c = a.num + b.num;
       int  ci = a.numi + b.numi;
       CompiexNumbers u = new CompiexNumbers(c,ci);
       return u;}
       public CompiexNumbers vichitanie(CompiexNumbers a , CompiexNumbers b){
           int c = a.num - b.num;
           int  ci = a.numi - b.numi;
           CompiexNumbers u = new CompiexNumbers((c),(ci));
           return u;

   }
   public  CompiexNumbers umnozenie(CompiexNumbers a , CompiexNumbers b){
        int c = a.num*b.num - a.numi*b.numi;
        int  ci = a.num* b.numi + b.num*a.numi;
        CompiexNumbers u = new CompiexNumbers((c),(ci));
        return u;

    }
    public  CompiexNumbers delenie(CompiexNumbers a , CompiexNumbers b){
        CompiexNumbers y = new  CompiexNumbers(0,0);
        if (b.numi!=0 || b.num!=0){
        int c = (a.num*b.num + a.numi*b.numi)/(b.num*b.num+ b.numi*b.numi);
        int  ci = (a.numi* b.num + b.numi*a.num)/(b.num*b.num+ b.numi*b.numi);
        CompiexNumbers u = new  CompiexNumbers(c,ci);

        return u;}
        else return y;


    }
}
