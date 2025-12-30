package Udemy;

public class BoxingUnboxing {
    static void main() {
        int primitiveTypeInt = 15;

        //unnecessary boxing
        Integer boxedIntegerType = Integer.valueOf(15);

        //not recommended
        Integer boxedIntegerType2 = new Integer(15);
        System.out.println(boxedIntegerType.getClass().getName());

        //unnecessary unboxing
        int unboxedPrimitiveInt = boxedIntegerType.intValue();

        //Java support Autoboxing so doing above is not needed
        int unboxedInt = boxedIntegerType;
        //System.out.println(unboxedInt.getClass().getName());

        //AUTOBOXING Examples
        Double resultAutoBoxedfromPrimitive = getUnboxedDoublePrimitiveValue();
        System.out.println(resultAutoBoxedfromPrimitive.getClass().getName());
        double resultAutoBoxedFromDouble = getBoxedDoubleObject();
        //System.out.println(resultAutoBoxedFromDouble.getClass().getName());


    }

    private static double getUnboxedDoublePrimitiveValue(){
        return 100.0;
    }

    private static Double getBoxedDoubleObject(){
        return Double.valueOf(100.0);
    }
}
