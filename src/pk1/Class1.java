package pk1;

public class Class1 {
    public String get01(){
        return this.getClass().getCanonicalName() + ".get01()-c01-master";
        //return this.getClass().getProtectionDomain().getCodeSource().getLocation().toString();
    }
    public String get02() {
        return this.getClass().getCanonicalName() + ".get02()-c02-master";
    }
    public static void main(String[] args) {
        Class1 obj = new Class1();
        System.out.println(obj.get01());
    }
}
