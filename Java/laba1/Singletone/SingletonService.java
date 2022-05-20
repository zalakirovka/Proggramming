package org.example.laba.laba1.Singletone;



public class SingletonService {
    public void exec() {
        Connection con1 = Connection.getInstance();
        Connection con2 = Connection.getInstance();
        Connection con3 = Connection.getInstance();

        System.out.println(con1.toString());
        System.out.println(con2.toString());

    }
}
