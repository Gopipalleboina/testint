
class gopi{
    class processor{
    void print(){
    System.out.println("processors");
    }
    }
    }
    public class nestedclass{
    public static void main(String[] args){
    gopi p=new gopi();
    gopi.processor s=p.new processor();
    s.print();
    }
    }