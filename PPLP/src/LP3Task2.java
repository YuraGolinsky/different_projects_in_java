public class LP3Task2 {
        public static void main(String[] args) {
            for(int i= 0; i < args.length; i++){
                if(args[i].contains("?")){
                    System.out.println("Параметр №"+ (i+1) +"містить в собі символ '?',його значення - '" + args[i] + "'");
                    break;
                }
            }

            System.out.println("Кінець завдання");
        }
    }



