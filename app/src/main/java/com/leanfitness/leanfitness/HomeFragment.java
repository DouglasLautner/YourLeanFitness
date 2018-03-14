package com.leanfitness.leanfitness;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class HomeFragment extends Fragment {
    private ListView mListView;
    private ArrayList<ExerciseInfo> mExercises;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_home, container, false);
        mListView = (ListView)v.findViewById(R.id.listView);
        mExercises = FillData.create();
        setupAdapter();
        getActivity().setTitle(R.string.menu_home);
        return v;
    }

    private void setupAdapter() {
        mListView.setAdapter(new ExerciseAdapter());
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                launchExcercise(i);
            }
        });
    }

    private void launchExcercise(int position) {
        final ExerciseInfo info = mExercises.get(position);
        final Intent i = new Intent(getActivity(), ExcerciseDetailActivity.class);
        i.putExtra("Data", info);
        getActivity().startActivity(i);
    }

    private class ExerciseAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return mExercises.size();
        }

        @Override
        public Object getItem(int i) {
            return i;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ViewHolder h;
            if(view == null) {
                view = getActivity().getLayoutInflater()
                        .inflate(R.layout.excercise_item, viewGroup, false);
                h = new ViewHolder();
                h.imgView      = (ImageView)view.findViewById(R.id.item_image);
                h.nameView     = (TextView)view.findViewById(R.id.item_title);
                h.summaryView     = (TextView)view.findViewById(R.id.item_summary);
                h.bodyPartView    = (TextView)view.findViewById(R.id.item_body_part);
                view.setTag(h);
            }else {
                h = (ViewHolder)view.getTag();
            }
            final ExerciseInfo info = mExercises.get(i);
            if(info != null) {
                h.imgView.setImageResource(info.getImage());
                h.nameView.setText(info.getName());
                h.summaryView.setText(info.getSummary());
                h.bodyPartView.setText(info.getBodyPart());
            }
            return view;
        }
    };

    private static class ViewHolder {
        public ImageView imgView;
        public TextView  nameView;
        public TextView  summaryView;
        public TextView  bodyPartView;
        public View      backgroundView;
    }
}
