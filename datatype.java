
public class datatype {

    public static void main(String[] args) {

        //primitive :- byte,short,int,long,float,double,boolean,char
        //non-primitive :- string,array,etc.

        //  integer type
        byte b=10;//1 byte = 8 bits
        short s=67;//2 byte
        int num=78;//4 byte
        long l=56788l;//8 byte
        float pi=3.14f;//4 byte

        //(-2^n-1) to (2^n-1) -1
        //-2^7 to (2^7)-1
        //-128 to 127
        System.out.println(Byte.MIN_VALUE+":"+Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE+":"+Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE+":"+Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE+":"+Long.MAX_VALUE);
        System.out.println(Float.MIN_VALUE+":"+Float.MAX_VALUE);

        // boolean
        Boolean isAlive=true,isMarried=false;

        // char
        char ch='A';//2 byte


    }
}