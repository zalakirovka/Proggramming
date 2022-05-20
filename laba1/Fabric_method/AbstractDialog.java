package org.example.laba.laba1.Fabric_method;

 public abstract class AbstractDialog implements Dialog {

     abstract Button getButton();

     public void render() {
         Button button = getButton();
         button.render();
     }
}
