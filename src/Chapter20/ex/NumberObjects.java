package Chapter20.ex;

public class NumberObjects {
    public static void main(String[] args) {
        NumberObjects numberObjects = new NumberObjects();
        numberObjects.paseLong("r1024");
        numberObjects.paseLong("1024");
        numberObjects.printOtherBase(1024);
    }

    public long paseLong(String data) {
        long long1 = 0;
        try {
            long1 = Long.parseLong(data);
            System.out.println(long1);
        } catch (NumberFormatException e) {
            System.out.println(data+" is not a number.");
        } catch (Exception e){

        }

        return long1;
    }

    public void printOtherBase(long value) {
        String Binary = Long.toBinaryString(value);
        String Hex = Long.toHexString(value);
        String octal = Long.toOctalString(value);
        System.out.println("Original : "+value);
        System.out.println("Binary : "+Binary);
        System.out.println("Hex : "+Hex);
        System.out.println("octal : "+octal);
    }
}
