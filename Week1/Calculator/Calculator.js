public class Calculator {
    Number result;
    
    public Calculator() {
        this.result = 0;
    }
    
    public void operate (String operator, String mathOper){
        Number result = 0;
        result = this.result.doubleValue() + Math.PI;
        System.out.println(this.result.doubleValue() + " " + operator + " " + mathOper + " = " + result.doubleValue());
            this.result = result;
    }
    
    public void operate (String operator, Number num1) {
        boolean isNum = this.stringOrNumber(num1);
        //Make it better! Give a better solution for operate(String, Number)
        Number result = 0;
        if (operator == "+" || operator == "-" || operator == "/" || operator == "*"){
            switch (operator) {
            case "+": {
                result = this.result.doubleValue() + num1.doubleValue();
                break;
            }
            case "-": {
                result = this.result.doubleValue() - num1.doubleValue();
                break;
            }
            case "/": {
                result = this.result.doubleValue() / num1.doubleValue();
                break;
            }
            case "*": {
                result = this.result.doubleValue() * num1.doubleValue();
                break;
            } 
            default: {
                result = num1;
            }
            }
            System.out.println(this.result.doubleValue() + " " + operator + " " + num1.doubleValue() + " = " + result.doubleValue());
            this.result = result;
        }else{
            switch(operator) {
                case "cos":
                    result = Math.cos(num1.doubleValue());
                    break;
                case "sin":
                    result = Math.sin(num1.doubleValue());
                    break;
                case "tan":
                    result = Math.tan(num1.doubleValue());
                    break;
                case "!":
                    result = factorial(num1.intValue());
                    break;
            }
            System.out.println(operator + " of " + String.valueOf(num1) + " = " + result);
            this.result = result;
        }
    }
    
    public int factorial (int number){
        int result = 1;
        for (int i = 1; i <= number; i++){
            result = result * i;
        }
        return result;
    }
    
    public void operate (String operator) {
        //Complete the missing implementation
        if (operator == "C"){
            this.result = 0;
        }else if(operator == "e"){
            this.result = Math.E;
        }
    }
    
    public boolean stringOrNumber(Number num) {
        if (num instanceof Number){
            return true;
        }
        return false;
    }
    
    public void firstValue(Number num1) {
        this.result = num1;
    }
    
}