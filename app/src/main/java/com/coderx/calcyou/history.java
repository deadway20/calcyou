package com.coderx.calcyou;

public class history {

    private String calculation ;
    private String result ;

    public history(String calculation, String result) {
        this.calculation = calculation;
        this.result = result;
    }

    public String getCalculation() {
        return calculation;
    }

    public void setCalculation(String calculation) {
        this.calculation = calculation;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
