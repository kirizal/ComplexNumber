import ExtendedMath.*;

public class Program {
    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber(ComplexNumberForm.Rectangular, 1.23, 56.12);
        ComplexNumber cn2 = new ComplexNumber(ComplexNumberForm.Polar, 21.1, 90.0);
        ComplexNumber result;
        ComplexNumber[] sqrt;

        System.out.println("cn1 = " + cn1.ToString());
        System.out.println("cn2 = " + cn2.ToString() + "\n");

        try{
            result = ComplexNumberOperation.add(cn1, cn2);
            System.out.println("cn1 + cn2:\n" + ComplexNumber.getAllForms(result));
            result = ComplexNumberOperation.sub(cn1, cn2);
            System.out.println("cn1 - cn2:\n" + ComplexNumber.getAllForms(result));
            result = ComplexNumberOperation.mul(cn1, cn2);
            System.out.println("cn1 * cn2:\n" + ComplexNumber.getAllForms(result));
            result = ComplexNumberOperation.div(cn1, cn2);
            System.out.println("cn1 / cn2:\n" + ComplexNumber.getAllForms(result));


            cn1 = new ComplexNumber(ComplexNumberForm.Rectangular, 1.0, 2.0);
            result = ComplexNumberOperation.sin(cn1);
            System.out.println("sin(cn1):\n" + ComplexNumber.getAllForms(result));
            result = ComplexNumberOperation.cos(cn1);
            System.out.println("cos(cn1):\n" + ComplexNumber.getAllForms(result));
            result = ComplexNumberOperation.sin(cn1);
            System.out.println("tg(cn1):\n" + ComplexNumber.getAllForms(result));
            result = ComplexNumberOperation.sin(cn1);
            System.out.println("ctg(cn1):\n" + ComplexNumber.getAllForms(result));


            result = ComplexNumberOperation.pown(cn1, 4);
            System.out.println("pown(cn1, 4):\n" + ComplexNumber.getAllForms(result));
            sqrt = ComplexNumberOperation.sqrtn(result, 2);
            System.out.println("sqrtn(result, 2):");
            for(ComplexNumber cn: sqrt){
                System.out.println("\t" + cn.ToString());
            }

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
