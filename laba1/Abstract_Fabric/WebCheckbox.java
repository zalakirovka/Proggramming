package org.example.laba.laba1.Abstract_Fabric;

class WebCheckbox implements Checkbox {

    private boolean state;

    public void render() {
        System.out.println(String.format("render WebCheckbox. With state %s", state));
        }

    public boolean state() {
        return state;
    }

    public Checkbox state(boolean state) {
        this.state = state;
        return this;
    }
    }
