package com.bymankind.recyclerview.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Server-Panduit on 12/5/2016.
 */

public class DerpData {
    private static final String[] titles = {"akbar hakim","andriy shevchenko","wayne rooney","cristiano ronaldo"};
    private static final int[] icons = {android.R.drawable.ic_menu_compass,android.R.drawable.ic_menu_add,android.R.drawable.ic_menu_delete,android.R.drawable.ic_menu_agenda};

    public static List<ListItem> getListData(){
        List<ListItem> data = new ArrayList<>();

        for (int x=0;x<4;x++){
            for (int i=0;i<titles.length ;i++){
                ListItem item = new ListItem();
                item.setImageResId(icons[i]);
                item.setTitle(titles[i]);
                data.add(item);
            }
        }
        return data;
    }
}
