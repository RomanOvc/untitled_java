package com.example.first;

public class PlainFrame extends PhotoFrame {
    private String material;            // материал рамки
    private int width;                  // ширина рамки
    private String material_insert;     // материал вставки

    public PlainFrame(int id, String name, String price, String color, String type, String material, int width, String material_insert) {
        super(id, name, price, color, type);
        this.material = material;
        this.width = width;
        this.material_insert = material_insert;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getMaterial_insert() {
        return material_insert;
    }

    public void setMaterial_insert(String material_insert) {
        this.material_insert = material_insert;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nId:          ").append(getId()).append("\n");
        sb.append("Name:          ").append(getName()).append("\n");
        sb.append("Price:         ").append(getPrice()).append("\n");
        sb.append("Color:         ").append(getColor()).append("\n");
        sb.append("Type:          ").append(getType()).append("\n");
        sb.append("Material:      ").append(getMaterial()).append("\n");
        sb.append("Width:         ").append(getWidth()).append("\n");
        sb.append("M_insert:      ").append(getMaterial_insert()).append("\n");
//        return getId() + "," + getName() + "," + getPrice() + "," + getColor() + "," + getType() + "," + getMaterial() + "," + getWidth() + "," + getMaterial_insert() + "\n";
        return String.valueOf(sb);
    }

}
