package com.itsamsung.adapterlesssons;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TEACHER on 13.03.2017.
 */
public class ListsActivity extends Fragment {
    static ArrayList<String> lessons = new ArrayList<>();
    static ArrayAdapter<String> lessonAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment, container, false);
        lessons.add("1. Физра");
        lessons.add("2. Литра");
        lessonAdapter =
                new ArrayAdapter<String>(getActivity(),
                        android.R.layout.simple_list_item_1, lessons);
        ListView lv = (ListView) view.findViewById(R.id.list_view);
        lv.setAdapter(lessonAdapter);
        //SimpleAdapter adapter = new SimpleAdapter(this, lessons, R.layout.list_fragment,)
        return view;
    }

    public static void addElement(String element) {
        lessons.add(element);
        lessonAdapter.notifyDataSetInvalidated();
    }
}
