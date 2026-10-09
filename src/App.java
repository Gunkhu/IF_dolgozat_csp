/*
* File: App.java
* Author: Csorba Péter
* Copyright: 2026, Csorba Péter
* Group: Szoft II/N
* Date: 2026-10-09
* Github: https://github.com/gunkhu
* Licenc: MIT
*/
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Fájlba írás.....");
        Writer wr = new Writer();
        wr.writeContent("Működik");
    }
}
