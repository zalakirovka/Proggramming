package org.example.laba.laba1.Abstract_Fabric;

class MobInput implements Input {

    private String value;

    public void value(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public void render() {
        System.out.println(
                String.format("render MobInput. With value %s", value)
        );
    }

}