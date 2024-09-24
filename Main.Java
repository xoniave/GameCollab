package GameCollab;

public class Main {

    public static void Breakthrough()
    {
        System.out.println("================================");
        System.out.println("1. Realm");
        System.out.println("2. Body");
        System.out.println("0. Exit");
        System.out.println("================================");
        System.out.print(">> ");
    }
    
    public static void Activity()
    {
        System.out.println("================================");
        System.out.println("1. Meditate");
        System.out.println("2. Training");
        System.out.println("3. Breakthrough");
        System.out.println("0. Exit");
        System.out.println("================================");
        System.out.print(">> ");
    }
    
    public static void Alchemy()
    {
        System.out.println("================================");
        System.out.println("1. Yuan Pill");
        System.out.println("2. Blood Pill");
        System.out.println("3. Nine Yin Cloud Pill");
        System.out.println("0. Exit");
        System.out.println("================================");
        System.out.print(">> ");
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
        System.out.println("0. Exit");
        System.out.println("================================");
        System.out.print(">> ");
        
    }
    
    public static void main(String[] args) {
        
        System.out.println("You Killed by your friend in the past , Now u have 1 mission , REVENGE");
        System.out.println("U got Reincarnated");
        System.out.print("Insert Ur Name : ");




        boolean Loop = true;
        while (Loop) {
            Menu();
            
            switch (Sistem.scanint.nextInt()) {
                case 1:
                    boolean ActivityLOOP = true;
                    while(ActivityLOOP)
                    {
                        Activity();
                        switch (Sistem.scanint.nextInt()) {
                            case 1:
                                System.out.println("Masuk Meditate");
                                break;
                            case 2:
                                System.out.println("Masuk Training");
                                break;
                            case 3:
                                boolean BreakthroughLOOP = true;
                                while (BreakthroughLOOP) {
                                    
                                    Breakthrough();

                                    switch (Sistem.scanint.nextInt()) {
                                        case 1:
                                            System.out.println("Masuk Realm");
                                            break;
                                        case 2:
                                            System.out.println("Masuk Body");
                                            break;
                                        case 0:
                                            BreakthroughLOOP = false;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 0:
                                ActivityLOOP = false;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 2:
                    break;
                case 3:
                    boolean AlchemyLOOP = true;
                    while (AlchemyLOOP) {
                        Alchemy();
                        switch (Sistem.scanint.nextInt()) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 0:
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }
    }
}
