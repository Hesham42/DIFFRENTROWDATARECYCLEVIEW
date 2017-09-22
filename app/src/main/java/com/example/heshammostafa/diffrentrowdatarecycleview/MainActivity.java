package com.example.heshammostafa.diffrentrowdatarecycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;


import com.example.heshammostafa.diffrentrowdatarecycleview.Adapter.DifferentRowAdapter;
import com.example.heshammostafa.diffrentrowdatarecycleview.DummyDataP.DummyData;
import com.example.heshammostafa.diffrentrowdatarecycleview.Interface.Comm;

import static com.example.heshammostafa.diffrentrowdatarecycleview.R.id.recyclerView;

public class MainActivity extends AppCompatActivity implements Comm {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        nestedScrollView = (NestedScrollView) findViewById(R.id.bottom_sheet);
    }


    @Override
    protected void onStart() {
        super.onStart();

        DifferentRowAdapter adapter = new DifferentRowAdapter(DummyData.getData(), this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, OrientationHelper.VERTICAL, false);
        RecyclerView mRecyclerView = (RecyclerView) findViewById(recyclerView);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(adapter);


//        +++++++++++++++++++++++

//        ++++++++++++++++++++++++++
    }

    @Override
    public void respons(int data, View view) {
        if (data == 0) {
            View bottomSheetView = getLayoutInflater().inflate(R.layout.dialog, null);
            setContentView(bottomSheetView);
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from((View) bottomSheetView.getParent());
            BottomSheetBehavior.BottomSheetCallback bottomSheetCallback = new BottomSheetBehavior.BottomSheetCallback() {
                @Override
                public void onStateChanged(@NonNull View bottomSheet, int newState) {
                    // do something
                }

                @Override
                public void onSlide(@NonNull View bottomSheet, float slideOffset) {
                    // do something
                }
            };


        }
    }
}



/*
*
*
*
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_alignParentBottom="true"
            android:orientation="horizontal">
            <!--<ImageView-->
            <!--android:id="@+id/love"-->
            <!--android:layout_width="0dp"-->
            <!--android:layout_height="wrap_content"-->
            <!--android:layout_weight="1"-->
            <!--android:src="@mipmap/ic_launcher_round" />-->
            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_weight="1">

                <com.alexzh.circleimageview.CircleImageView
                    android:id="@+id/love"
                    android:layout_width="64dp"
                    android:layout_height="64dp"
                    android:layout_gravity="center"
                    android:src="@drawable/ic_favorite"
                    app:view_borderColor="#cccccc"
                    app:view_borderWidth="2dp" />

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center"
                    android:layout_weight="1"
                    android:text="1"
                    android:textColor="#000" />

            </LinearLayout>

            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_weight="1">
                <!--<ImageView-->
                <!--android:id="@+id/tail"-->
                <!--android:layout_width="0dp"-->
                <!--android:layout_height="wrap_content"-->
                <!--android:layout_weight="1"-->
                <!--android:src="@mipmap/ic_launcher_round" />-->
                <!---->
                <com.alexzh.circleimageview.CircleImageView
                    android:id="@+id/tail"
                    android:layout_width="64dp"
                    android:layout_height="64dp"
                    android:layout_gravity="center"

                    android:src="@drawable/banner1"
                    app:view_borderColor="#cccccc"
                    app:view_borderWidth="0dp" />

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center"
                    android:layout_weight="1"
                    android:text="1"
                    android:textColor="#000" />
            </LinearLayout>
            <!--<ImageView-->
            <!--android:id="@+id/dwair"-->
            <!--android:layout_width="0dp"-->
            <!--android:layout_height="wrap_content"-->
            <!--android:layout_weight="1"-->
            <!--android:src="@mipmap/ic_launcher_round" />-->
            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content">

                <com.alexzh.circleimageview.CircleImageView
                    android:id="@+id/dwair"
                    android:layout_width="64dp"
                    android:layout_height="64dp"
                    android:layout_gravity="center"
                    android:layout_weight="0"
                    android:src="@drawable/banner1"
                    app:view_borderColor="#cccccc"
                    app:view_borderWidth="2dp" />

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center"
                    android:layout_weight="1"
                    android:paddingRight="9dp"
                    android:text="1"
                    android:textColor="#000" />
            </LinearLayout>
*
*
*
* **/