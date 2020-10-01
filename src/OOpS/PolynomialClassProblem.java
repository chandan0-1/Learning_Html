public class Polynomial {
    // public Polynomial(){
    public int[] arr=new int[100];
    // }
    public void doublesize(){
        int[] tmp=arr;
        arr=new int[2*tmp.length];
        for (int k=0;k<tmp.length;k++){
            arr[k]=tmp[k];
        }
    }
    public void setCoefficient(int degree, int coeff){

        if (degree>=arr.length){
            doublesize();
        }
        arr[degree]=coeff;

    }

    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
    public void print(){
        for (int p=0;p<arr.length;p++){
            // arr[i] +=arr[i];
            if (arr[p]!=0){
                System.out.print(arr[p]+"x"+p+" ");
            }

        }
    }


    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p){
        for (int i=0;i<p.arr.length;i++){
            arr[i] +=p.arr[i];
        }
        // print();
        return this;



    }

    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p){
        for (int s=0;s<p.arr.length;s++){
            arr[s] -= p.arr[s];
        }
        // print();
        return this;

    }
    // public void 

    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p){
        // int[] pol=new int[p.arr.length*arr.length];
        Polynomial New = new Polynomial();
        for(int f=0;f<p.arr.length;f++){
            if (p.arr[f]!=0){
                for (int sec=0;sec<arr.length;sec++){
                    if (arr[sec]!=0){
                        // New.setCoefficient(f+sec,arr[sec]*p.arr[f]);
                        New.setCoefficient(f+sec,New.arr[f + sec] + arr[sec]*p.arr[f]);                    }
                }

            }
        }

        return New;
    }
}


