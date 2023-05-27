

public class LP3Task1 {
        public static void main(String[] args) {
            for(int i= 0; i < args.length; i++){
                if(args[i].contains("?")){
                    System.out.println("Параметр №"+(i+1)+"мiстить в собі символ '?'");
                }
            }
        }
    }


