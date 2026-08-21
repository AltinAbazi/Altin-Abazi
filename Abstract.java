abstract  class Abstract {
    public abstract void animalSound();
    public void sleep(){
System.out.println("zzz");
    }
}

class cow extends Abstract{
    public void animalSound(){
        System.out.println("the cow says moo");

    }
}
 class main{
    public static void main(String[] args) {
        cow newcow = new cow();
        newcow.animalSound();;
        newcow.sleep();
    }
}
