package com.example.heshammostafa.diffrentrowdatarecycleview.DummyDataP;

import com.example.heshammostafa.diffrentrowdatarecycleview.Model.CityEvent;
import com.example.heshammostafa.diffrentrowdatarecycleview.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hesham Mostafa on 7/5/2017.
 */

public final class DummyData {
    //
//        int [] img={
//                R.drawable.banner,
//                R.drawable.banner1,
//                R.drawable.image1,
//                R.drawable.image2,
//                R.drawable.image3,
//                R.drawable.image4,
//                R.drawable.image5,
//                R.drawable.image6,
//                R.drawable.mountain,
//                R.drawable.olegimage,
//                R.drawable.pro1,
//                R.drawable.pro2,
//                R.drawable.profile
//        };
//(CityEvent.EVENT_TYPE,
//    R.drawable.banner,
//    R.drawable.pro1,
//            "Ahmed Khaled1",
//            "lovefootbal","2014",
//            "",
//            "",
//            "")
    public static List<CityEvent> getData() {
        List<CityEvent> list = new ArrayList<>();
//public CityEvent
//


//        (int mType,
//        int img2,
//        int img3,
//        int love,
//        int tail,
//        int dwair,
//        String nameP,
//        String desP,
//        String HP,
//        String namePF,
//        String desPF,
//        String textPF)


        list.add(new CityEvent
                (
                        CityEvent.CITY_TYPE,
                        R.drawable.image3,
                        R.drawable.image2,
                        R.mipmap.love,
                        R.mipmap.love,
                        R.mipmap.love,
                        "Ahmed Abdelkader",
                        "reposted a collection",
                        "2011",
                        "Ahmed Elgendy",
                        "the secound",
                        "the merrcury")

        );
//--------------------------------------------------------------------------
        list.add(new CityEvent
                (
                        CityEvent.EVENT_TYPE,
                        R.drawable.banner,
                        R.drawable.pro1,
                        "Ahmed Khaled1",
                        "lovefootbal1",
                        "2014",
                        "#love footbal",
                        "Ahmed elgendy",
                        "comtion 2000 %",
                        "200EGP")

        );

        list.add(new CityEvent
                (
                        CityEvent.CITY_TYPE,
                        R.drawable.pro2,
                        R.drawable.image4,
                        R.mipmap.love,
                        R.mipmap.love,
                        R.mipmap.love,
                        "Ahmed Abdelkader",
                        "reposted a collection",
                        "2011",
                        "Ahmed Elgendy",
                        "the secound",
                        "the merrcury")

        );
        list.add(new CityEvent
                (
                        CityEvent.EVENT_TYPE,
                        R.drawable.pro1,
                        R.drawable.image5,
                        "Ahmed Khaled2",
                        "lovefootbal2",
                        "20142",
                        "#love footba2",
                        "Ahmed elgendy2",
                        "comtion 20002 %",
                        "200EGP2")

        );

        list.add(new CityEvent
                (
                        CityEvent.CITY_TYPE,
                        R.drawable.image6,
                        R.drawable.pro2,
                        R.mipmap.love,
                        R.mipmap.love,
                        R.mipmap.love,
                        "Ahmed Abdelkader",
                        "reposted a collection",
                        "2011",
                        "Ahmed Elgendy",
                        "the secound",
                        "the merrcury")

        );
        list.add(new CityEvent
                (
                        CityEvent.EVENT_TYPE,
                        R.drawable.banner,
                        R.drawable.image5,
                        "Ahmed Khaled3",
                        "lovefootbal3",
                        "20143",
                        "#love footba3",
                        "Ahmed elgendy3",
                        "comtion 2000 3%",
                        "200EGP3")

        );

        list.add(new CityEvent
                (
                        CityEvent.CITY_TYPE,
                        R.drawable.image3,
                        R.drawable.image3,
                        R.mipmap.love,
                        R.mipmap.love,
                        R.mipmap.love,
                        "Ahmed Abdelkader",
                        "reposted a collection",
                        "2011",
                        "Ahmed Elgendy",
                        "the secound",
                        "the merrcury")

        );
        list.add(new CityEvent
                (
                        CityEvent.EVENT_TYPE,
                        R.drawable.banner,
                        R.drawable.pro1,
                        "Ahmed Khaled4",
                        "lovefootbal4",
                        "20144",
                        "#love footba4",
                        "Ahmed elgendy4",
                        "comtion 20004 %",
                        "200EGP4")

        );

        list.add(new CityEvent
                (
                        CityEvent.CITY_TYPE,
                        R.drawable.image3,
                        R.drawable.image3,
                        R.mipmap.love,
                        R.mipmap.love,
                        R.mipmap.love,
                        "Ahmed Abdelkader",
                        "reposted a collection",
                        "2011",
                        "Ahmed Elgendy",
                        "the secound",
                        "the merrcury")

        );
        list.add(new CityEvent
                (
                        CityEvent.EVENT_TYPE,
                        R.drawable.banner,
                        R.drawable.pro1,
                        "Ahmed Khaled5",
                        "lovefootbal5",
                        "20145",
                        "#love footba5",
                        "Ahmed elgendy5",
                        "comtion 20005 %",
                        "200EGP5")

        );
        list.add(new CityEvent
                (
                        CityEvent.EVENT_TYPE,
                        R.drawable.banner,
                        R.drawable.pro1,
                        "Ahmed Khaled16",
                        "lovefootbal16",
                        "20146",
                        "#love footbal6",
                        "Ahmed elgendy6",
                        "comtion 2000 6%",
                        "200EGP6")

        );


        return list;
    }

}


