package org.example;

public enum ColorEnum {
    RED("Красный",255, 0, 0),
    GREEN ("Зеленый", 0, 255, 0),
    BLUE ("Синий", 0, 0, 255),
    WHITE ("Белый",255, 255, 255),
    YELLOW ("Желтый",255, 255, 0),
    PINK ("Розовый",255, 0, 255),
    BROWN ("Коричневый",139, 69, 19),
    VIOLET ("Фиолетовый",128, 0, 128),
    BLACK ("Черный",0, 0, 0);

    private String nameColor;
    private Integer rNumnber ;
    private Integer gNumnber ;
    private Integer bNumnber ;

    ColorEnum(String nameColor, Integer RNumnber, Integer GNumnber, Integer BNumnber) {
        this.nameColor = nameColor;
        this.rNumnber = RNumnber;
        this.gNumnber = GNumnber;
        this.bNumnber = BNumnber;
    }

    public String getNameColor() {
        return nameColor;
    }

    public Integer getRNumnber() {
        return rNumnber;
    }

    public Integer getGNumnber() {
        return gNumnber;
    }

    public Integer getBNumnber() {
        return bNumnber;
    }

    @Override
    public String toString() {
        return "Color{" +
                "RNumnber=" + rNumnber +
                ", GNumnber=" + gNumnber +
                ", BNumnber=" + bNumnber +
                '}';
    }
}
