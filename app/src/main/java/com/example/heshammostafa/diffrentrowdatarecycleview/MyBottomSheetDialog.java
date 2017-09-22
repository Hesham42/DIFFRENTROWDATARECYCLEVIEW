package com.example.heshammostafa.diffrentrowdatarecycleview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.view.View;

/**
 * Created by Hesham Mostafa on 7/6/2017.
 */

public class MyBottomSheetDialog extends BottomSheetDialog implements View.OnClickListener {

    Context context;
    public MyBottomSheetDialog(@NonNull Context context) {
        super(context);
        this.context = context;
        create();
    }
    @SuppressLint("StaticFieldLeak")
    private static MyBottomSheetDialog instance;

    public static MyBottomSheetDialog getInstance(@NonNull Context context) {
        return instance == null ? new MyBottomSheetDialog(context) : instance;
    }

    public void create() {
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

    @Override
    public void onClick(View view) {

    }
}