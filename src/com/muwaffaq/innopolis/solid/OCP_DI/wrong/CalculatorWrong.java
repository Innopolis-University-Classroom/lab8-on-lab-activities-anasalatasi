package com.muwaffaq.innopolis.solid.OCP_DI.wrong;

//❌❌❌❌
// how many SOLID Principle does it violate ?
// Fix it !!

// l - r
// r + l
// DI : high = Abstract class
// low : classes
//
 class CalculatorCorrect {
    class Calculator{
        double left;
        double right;
        public abstract double calculate();
    }
    class Add extends calculator {
    double calculate (){return left + right} 
    }
     
     class Sub extends calculator {
     double calculate(){return left-right}
     }
     
     class Div extends calculator {
     double calculate(){return left/right}
     }
     
    public static void main(String[] args) {
        CalculatorCorrect calculator = new CalculatorWrong();
        calculator.Add.calculate();
        calculator.Sub.calculate();

    }
}


