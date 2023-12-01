// 20220803 컴퓨터학과 정여진
package jspbook.pr31;

public class Calculator {
	private int op1;
	private int op2;
	private String operation;
		
	public int getOp1() {
		return op1;
	}
	public void setOp1(int op1) {
		this.op1 = op1;
	}
	public int getOp2() {
		return op2;
	}
	public void setOp2(int op2) {
		this.op2 = op2;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getOperation() {
		if(operation.equals("plus"))
			return "+";
		else if(operation.equals("minus"))
			return "-";
		else if(operation.equals("multiple"))
			return "*";
		else if(operation.equals("division"))
			return "/";
		return operation;
	}
	private int add(int a, int b) {
		return a + b;
	}
	private int sub(int a, int b) {
		return a - b;
	}
	private int mult(int a, int b) {
		return a * b;
	}
	private int div(int a, int b) {
		return a / b;
	}
	public int calc() {
        int result = 0;
        switch (operation) {
            case "plus":
                result = add(op1, op2);
                break;
            case "minus":
                result = sub(op1, op2);
                break;
            case "multiple":
                result = mult(op1, op2);
                break;
            case "division":
                result = div(op1, op2);
                break;
            default:
                break;
        }
        return result;
    }
	
}
