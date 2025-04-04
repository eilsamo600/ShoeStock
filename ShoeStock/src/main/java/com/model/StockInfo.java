package com.model;

public class StockInfo {
    private int stockId;
    private int modelId;
    private int colorId;
    private String modelname;
    private String color;
    private int size;
    private int quantity;

    public StockInfo(int stockId, int modelId, int colorId, String modelname, String color, int size, int quantity) {
        this.stockId = stockId;
        this.modelId = modelId;
        this.colorId = colorId;
        this.modelname = modelname;
        this.color = color;
        this.size = size;
        this.quantity = quantity;
    }

    public StockInfo(String modelname, String color, int size) {
        this.modelname = modelname;
        this.color = color;
        this.size = size;
    }


    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("| %-8d | %-20s | %-10s | %-8d | %-8d |",
                stockId, fixWidth(modelname, 20), fixWidth(color, 10), size, quantity);
    }

    // 한글이 포함되면 폭을 맞춰주는 함수
    private String fixWidth(String str, int length) {
        int curLength = 0;
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c >= '가' && c <= '힣') { // 한글이면 2칸 차지
                curLength += 2;
            } else { // 영어/숫자는 1칸 차지
                curLength += 1;
            }
        }

        sb.append(str); // 원래 문자열 추가

        // 남은 공간만큼 공백 추가 (숫자/영어 기준으로 폭 맞추기)
        while (curLength < length) {
            sb.append(" ");
            curLength++;
        }

        return sb.toString();
    }

}
