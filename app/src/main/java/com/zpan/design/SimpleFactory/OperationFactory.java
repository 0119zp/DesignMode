package com.zpan.design.SimpleFactory;

/**
 * 运算工厂
 */

public class OperationFactory {

    public static Operation CreatOperation(String operation){

        if (operation != null){
            switch (operation){
                case "+":
                    return new AddOperation();
                case "-":
                    return new SubOperation();
                case "/":
                    return new DivOperation();
                case "*":
                    return new MulOparation();
                default:
                    throw new RuntimeException("运算符错误！");
            }
        }else {
            throw new RuntimeException("运算符不能为空！");
        }
    }


}
