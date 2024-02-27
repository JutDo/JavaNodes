package DesignPattern.SimpleDesignMode;


public class OperationFactory {
    public static Operation creaOperation(String operation){
        Operation oper = null;
        switch (operation){
            case "+":
                oper = new Add();
                break;
            case "-":
                oper = new Sub();
                break;
            case "*":
                oper = new Mul();
                break;
            case "/":
                oper = new Div();
                break;
        }
        return  oper;
    }

    public static void main(String[] args) {
       Operation opr = OperationFactory.creaOperation("*");
        double result = opr.getResult(100, 200);
        System.out.println("result is " + result);
    }
}