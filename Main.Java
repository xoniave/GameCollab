package GameCollab;

public class Main {

    public static void Breakthrough()
    {
        System.out.println("================================");
        System.out.println("1. Realm");
        System.out.println("2. Body");
        System.out.println("================================");
    }
    
    public static void Activity()
    {
        System.out.println("================================");
        System.out.println("1. Meditate");
        System.out.println("2. Training");
        System.out.println("3. Breakthrough");
        System.out.println("================================");
    }
    
    public static void Alchemy()
    {
        System.out.println("================================");
        System.out.println("1. Streght");
        System.out.println("2. Training");
        System.out.println("3. Breakthrough");
        System.out.println("================================");
    }
    
    public static void Rolls()
    {
        
    }


    public static void Menu()
    {
        System.out.println("================================");
        System.out.println("1. Activity");
        System.out.println("2. Adventure");
        System.out.println("3. Alchemy");
        System.out.println("4. Rolls");
        System.out.println("5. Stats");
        System.out.println("================================");
        System.out.print(">> ");
        
    }
    
    public static void main(String[] args) {
        
        boolean Loop = true;
        while (Loop) {
            Menu();
            
            switch (Sistem.scanint.nextInt()) {
                case 1:
                    break;
                case 2:
                    break;
            
                default:
                    break;
            }
        }
    }
}
