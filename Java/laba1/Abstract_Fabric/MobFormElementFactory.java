package org.example.laba.laba1.Abstract_Fabric;

class MobFormElementFactory implements FormElementFactory {

    public Button createButton() {
        return new MobButton();
    }

    public Checkbox createCheckbox() {
        return new MobCheckbox();
    }

    public Input createInput() {
        return new MobInput();
    }

}
