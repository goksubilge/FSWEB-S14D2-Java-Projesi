package com.java.main;

import com.java.model.*;
import com.java.model.enumss.LampType;
import com.java.model.enumss.PaintColor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // PaintColor.BEIGE.name();   // => Enum direkt gelir
        // PaintColor.BEIGE.ordinal(); // => Enum 'ın sırası gelir

        Lamp lamp = new Lamp(LampType.LAVA,true,5);
        Ceiling ceiling = new Ceiling(3,PaintColor.PINK);
        Bed bed = new Bed("Çift Kişilik Yatak", 4,1,2,3);
        Wardrobe wardrobe = new Wardrobe(2,3,40);
        Carpet carpet = new Carpet(5,4,PaintColor.RED);

        Bedroom bedRoom = new Bedroom("Bed Room", lamp, ceiling,bed,wardrobe,new Carpet(7,6,PaintColor.PURPLE));

        bedRoom.getCarpet().lying();
        bedRoom.getLamp().turnOn();
        bedRoom.getCeiling().create();
        // bedRoom.getWalls();  // => bir array döndü, .ile bişey çağıramam o yüzden for döngüsüne bakarım.  bedRoom.getWalls().stream()  kullanabiliyorum aslında. şimdilik for.
        for (Wall wall: bedRoom.getWalls() ) {
            wall.create();
        }

        // setter larını yazsaydım set ile değerlerini de değiştirebilecektim buradan.
        System.out.println(bedRoom);

        // Günün Tekrar Notu:
        System.out.println("***--- Günün Tekrar Notu ---***");
        String name1 = "Bilge";
        String name2 = "Bilge";
        String name3 = name1;
        name3 = "Gökmen";
        System.out.println(name1); // Bilge
        System.out.println(name3); // Gökmen
        if(name1 == name2){
            System.out.println("EŞİT");
        } else {
            System.out.println("EŞİT DEĞİL");
        } // sonuç EŞİT gelir  => COPY BY VALUE

        if(name2 == name3){
            System.out.println("EŞİT");
        } else {
            System.out.println("EŞİT DEĞİL");
        }  // EŞİT DEĞİL       // name3 = "Gökmen"; bunu iptal ettiğim durumda sonuç EŞİT geliyor.
    }
}