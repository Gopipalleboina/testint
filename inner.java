
class outer{
    void print(){
    System.out.println("printed");
    }
    }
    class inner{
    void printname(){
    System.out.println("names print");
    }
    public static void main(String[] args){
    outer o=new outer();
    inner i=new inner();
    o.print();
    i.printname();
    }
    }