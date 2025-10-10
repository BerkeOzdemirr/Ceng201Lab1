class StaticLifetime{
    public static int counter =0;
    public StaticLifetime(){
        counter++;
    }
    public static void main(String[] args){
        StaticLifetime object1 = new StaticLifetime();
        StaticLifetime object2 = new StaticLifetime();
        System.out.println("Şu anki sayaç: " + StaticLifetime.incrementCounter());
    }
    public static int incrementCounter(){
        return counter;
    }
}

 class BlockScopeDemo{
    public static void main(String[] args) {
        int outerX = 5;
        if (outerX == 5) {
            innerY = 15;
            System.out.println("outerY: " + innerY);
            System.out.println("outerX: " + outerX);
        }
        System.out.println("outerY: " + innerY);
        System.out.println("outerX: " + outerX);
    }
 }