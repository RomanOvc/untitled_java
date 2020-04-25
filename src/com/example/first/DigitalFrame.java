package com.example.first;

class DigitalFrame extends PhotoFrame {
    public int memory;         // количество встроенной памяти
    public int viewing_angle;  // угол обзора в градусах
    public String size;        // размер рамки

    public DigitalFrame(int id, String name, String price, String color, String type, int memory, int viewing_angle, String size) {
        super(id, name, price, color, type);
        this.memory = memory;
        this.viewing_angle = viewing_angle;
        this.size = size;

    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getViewing_angle() {
        return viewing_angle;
    }

    public void setViewing_angle(int viewing_angle) {
        this.viewing_angle = viewing_angle;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nId:          ").append(getId()).append("\n");
        sb.append("Name:          ").append(getName()).append("\n");
        sb.append("Price:         ").append(getPrice()).append("\n");
        sb.append("Color:         ").append(getColor()).append("\n");
        sb.append("Type:          ").append(getType()).append("\n");
        sb.append("Memory:        ").append(getMemory()).append("\n");
        sb.append("Viewing_angle: ").append(getViewing_angle()).append("\n");
        sb.append("Size:          ").append(getSize()).append("\n");
        //        return "Id:" + getId() + ",Name:" + getName() + ",Price" + getPrice() + "," + getColor() + "," + getType() + "," + getMemory() + "," + getViewing_angle() + "," + getSize() + "\n";
        return String.valueOf(sb);
    }


}
