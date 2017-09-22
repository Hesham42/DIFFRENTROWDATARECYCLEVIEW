package com.example.heshammostafa.diffrentrowdatarecycleview.Model;

/**
 * Created by Hesham Mostafa on 7/5/2017.
 */

public class CityEvent {

    public static final int CITY_TYPE = 0;
    public static final int EVENT_TYPE = 1;

    //
    private int mType;
//public CityEvent(int mType, int img1, int imgpro, String name, String des, String h, String hash, String namepro, String comeation, String price) {

    //-------------------ITEMeVENT------------------------
int img1;
     int imgpro;
    String name;
    String des;
    String H;
    String hash;
    String Namepro;
    String Comeation;
    String price;
//    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public CityEvent(int mType, int img1, int imgpro, String name, String des, String h, String hash, String namepro, String comeation, String price) {
    this.mType = mType;
    this.img1 = img1;
    this.imgpro = imgpro;
    this.name = name;
    this.des = des;
    H = h;
    this.hash = hash;
    Namepro = namepro;
    Comeation = comeation;
    this.price = price;
}

//    __________________ITEM_CITY________________


     int img2;
     int img3;
     int love;
     int tail;
     int dwair;
    String nameP;
    String desP;
    String HP;
    String NamePF;
    String desPF;
    String TextPF;

    public CityEvent(int mType,
                     int img2,
                     int img3,
                     int love,
                     int tail,
                     int dwair,
                     String nameP,
                     String desP,
                     String HP,
                     String namePF,
                     String desPF,
                     String textPF) {
        this.mType = mType;
        this.img2 = img2;
        this.img3 = img3;
        this.love = love;
        this.tail = tail;
        this.dwair = dwair;
        this.nameP = nameP;
        this.desP = desP;
        this.HP = HP;
        NamePF = namePF;
        this.desPF = desPF;
        TextPF = textPF;
    }
//    ___________________________________________




    public int getImg1() {
        return img1;
    }

    public void setImg1(int img1) {
        this.img1 = img1;
    }

    public int getImgpro() {
        return imgpro;
    }

    public void setImgpro(int imgpro) {
        this.imgpro = imgpro;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getH() {
        return H;
    }

    public void setH(String h) {
        H = h;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getNamepro() {
        return Namepro;
    }

    public void setNamepro(String namepro) {
        Namepro = namepro;
    }

    public String getComeation() {
        return Comeation;
    }

    public void setComeation(String comeation) {
        Comeation = comeation;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImg2() {
        return img2;
    }

    public void setImg2(int img2) {
        this.img2 = img2;
    }

    public int getImg3() {
        return img3;
    }

    public void setImg3(int img3) {
        this.img3 = img3;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getDwair() {
        return dwair;
    }

    public void setDwair(int dwair) {
        this.dwair = dwair;
    }

    public String getNameP() {
        return nameP;
    }

    public void setNameP(String nameP) {
        this.nameP = nameP;
    }

    public String getDesP() {
        return desP;
    }

    public void setDesP(String desP) {
        this.desP = desP;
    }

    public String getHP() {
        return HP;
    }

    public void setHP(String HP) {
        this.HP = HP;
    }

    public String getNamePF() {
        return NamePF;
    }

    public void setNamePF(String namePF) {
        NamePF = namePF;
    }

    public String getDesPF() {
        return desPF;
    }

    public void setDesPF(String desPF) {
        this.desPF = desPF;
    }

    public String getTextPF() {
        return TextPF;
    }

    public void setTextPF(String textPF) {
        TextPF = textPF;
    }
//------------------------------------------



    public int getType() {
        return mType;
    }


    public void setType(int type) {
        this.mType = type;
    }
}