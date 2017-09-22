package com.example.heshammostafa.diffrentrowdatarecycleview.Adapter;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.heshammostafa.diffrentrowdatarecycleview.Interface.Comm;
import com.example.heshammostafa.diffrentrowdatarecycleview.MainActivity;
import com.example.heshammostafa.diffrentrowdatarecycleview.Model.CityEvent;
import com.example.heshammostafa.diffrentrowdatarecycleview.MyBottomSheetDialog;
import com.example.heshammostafa.diffrentrowdatarecycleview.R;

import java.util.List;

import it.sephiroth.android.library.picasso.Picasso;

import static com.example.heshammostafa.diffrentrowdatarecycleview.Model.CityEvent.CITY_TYPE;
import static com.example.heshammostafa.diffrentrowdatarecycleview.Model.CityEvent.EVENT_TYPE;

/**
 * Created by Hesham Mostafa on 7/5/2017.
 */

public class DifferentRowAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<CityEvent> mList;
    Context mContext;
    int count = 0;
    Comm comm;





    public DifferentRowAdapter(List<CityEvent> list, Context mContext) {
        this.mList = list;
        this.mContext = mContext;


    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;

        switch (viewType) {
            case CITY_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_city, parent, false);
                return new CityViewHolder(view);
            case EVENT_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_event, parent, false);
                return new EventViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        CityEvent object = mList.get(position);
        if (object != null) {
            switch (object.getType()) {
                case CITY_TYPE:
                    ((CityViewHolder) holder).nameP.setText(object.getNameP());
                    ((CityViewHolder) holder).desP.setText(object.getDesP());
                    ((CityViewHolder) holder).HP.setText(object.getHP());
                    ((CityViewHolder) holder).NamePF.setText(object.getNamePF());
                    ((CityViewHolder) holder).desPF.setText(object.getDesPF());
                    ((CityViewHolder) holder).TextPF.setText(object.getTextPF());

                    Picasso.with(mContext).load(object.getImg2())
                            .placeholder(R.drawable.banner1).
                            error(R.drawable.banner1).
                            into(((CityViewHolder) holder).img2);

                    Picasso.with(mContext).load(object.getImg3())
                            .placeholder(R.drawable.banner1).
                            error(R.drawable.banner1).
                            into(((CityViewHolder) holder).img3);


//                    Picasso.with(mContext).load(object.getTail())
//                            .placeholder(R.mipmap.love).
//                            error(R.drawable.love).
//                            into(((CityViewHolder) holder).tail);
//
//                    Picasso.with(mContext).load(object.getDwair())
//                            .placeholder(R.mipmap.love).
//                            error(R.mipmap.love).
//                            into(((CityViewHolder) holder).dwair);
//
                    break;
                case EVENT_TYPE:
//                    ((EventViewHolder) holder).mTitle.setText(object.getName());
//                    ((EventViewHolder) holder).mDescription.setText(object.getDescription());
                    ((EventViewHolder) holder).name.setText(object.getName());
                    ((EventViewHolder) holder).des.setText(object.getDes());
                    ((EventViewHolder) holder).H.setText(object.getH());
                    ((EventViewHolder) holder).hash.setText(object.getHash());
                    ((EventViewHolder) holder).Namepro.setText(object.getNamepro());
                    ((EventViewHolder) holder).price.setText(object.getPrice());
                    ((EventViewHolder) holder).Comeation.setText(object.getComeation());

                    Picasso.with(mContext).load(object.getImg1())
                            .placeholder(R.mipmap.ic_launcher).
                            error(R.mipmap.ic_launcher).
                            into((((EventViewHolder) holder).img1));

                    Picasso.with(mContext).load(object.getImgpro())
                            .placeholder(R.mipmap.ic_launcher).
                            error(R.mipmap.ic_launcher).
                            into((((EventViewHolder) holder).imgpro));


                    ((EventViewHolder) holder).fab.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Log.i("Guinness", "done isa");
//                            comm=(Comm)view;
//                            comm.respons(0,view);

                            MyBottomSheetDialog myBottomSheetDialog = MyBottomSheetDialog.getInstance(mContext);
                            myBottomSheetDialog.setCanceledOnTouchOutside(false);
                            myBottomSheetDialog.show();

                        }
                    });

                    break;
            }


        }


    }

    @Override
    public int getItemCount() {
        if (mList == null)
            return 0;
        return mList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (mList != null) {
            CityEvent object = mList.get(position);
            if (object != null) {
                return object.getType();
            }
        }
        return 0;
    }

    public static class CityViewHolder extends RecyclerView.ViewHolder {
        private ImageView img2;
        private ImageView img3;
        private ImageView love;
        private ImageView tail;
        private ImageView dwair;
        TextView nameP;
        TextView desP;
        TextView HP;
        TextView NamePF;
        TextView desPF;
        TextView TextPF;

        public CityViewHolder(View itemView) {
            super(itemView);
            img2 = (ImageView) itemView.findViewById(R.id.img2);
            img3 = (ImageView) itemView.findViewById(R.id.img2);
            love = (ImageView) itemView.findViewById(R.id.love);
            tail = (ImageView) itemView.findViewById(R.id.tail);
            dwair = (ImageView) itemView.findViewById(R.id.dwair);
            nameP = (TextView) itemView.findViewById(R.id.Namep);
            desP = (TextView) itemView.findViewById(R.id.desP);
            HP = (TextView) itemView.findViewById(R.id.HP1);
            NamePF = (TextView) itemView.findViewById(R.id.NamePf);
            desPF = (TextView) itemView.findViewById(R.id.desPF);
            TextPF = (TextView) itemView.findViewById(R.id.textPf);


        }
    }

    public static class EventViewHolder extends RecyclerView.ViewHolder  {

        private ImageView img1;
        private ImageView imgpro;
        TextView name;
        TextView des;
        TextView H;
        TextView hash;
        TextView Namepro;
        TextView Comeation;
        TextView price;
        FloatingActionButton fab;
        //        NestedScrollView nestedScrollView;
        BottomSheetBehavior bottomSheetBehavior;

        BottomSheetDialog bottomSheetDialog;

        public EventViewHolder(View itemView) {
            super(itemView);
//            mTitle = (TextView) itemView.findViewById(R.id.titleTextView);
//            mDescription = (TextView) itemView.findViewById(R.id.descriptionTextView);
            img1 = (ImageView) itemView.findViewById(R.id.img1);
            imgpro = (ImageView) itemView.findViewById(R.id.imagePro);
            name = (TextView) itemView.findViewById(R.id.Name);
            des = (TextView) itemView.findViewById(R.id.des);
            H = (TextView) itemView.findViewById(R.id.H);
            hash = (TextView) itemView.findViewById(R.id.Hash);
            Namepro = (TextView) itemView.findViewById(R.id.NamePro);
            Comeation = (TextView) itemView.findViewById(R.id.Comation);
            price = (TextView) itemView.findViewById(R.id.price);
            fab = (FloatingActionButton) itemView.findViewById(R.id.fab);
        }
    }

}