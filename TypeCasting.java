class TypCst{
    public static void main(String[] args){
        short s = 30;
        byte b = (byte)s; //Explicit Conversion
        System.out.println(b);
        int i = s; //Implicit Conversion

        int j = 50;
        long l = i;//Implicit Conversion
        float f = j;//Implicit Conversion
        double d = j;//Implicit Conversion
        short s1 = (short)j;
    }
}