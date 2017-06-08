/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of goTos
        final ArrayList<GoTo> goTos = new ArrayList<GoTo>();
        goTos.add(new GoTo(R.string.attractions_cologne_cathedral,
                R.string.attractions_cologne_cathedral_details
                , R.drawable.cologne_cathedral));
        goTos.add(new GoTo(R.string.attractions_cologne_central_station,
                R.string.attractions_cologne_central_station_details,
                R.drawable.cologne_central_station));
        goTos.add(new GoTo(R.string.attractions_lvr_tower, R.string.attractions_lvr_tower_details
                , R.drawable.lvr_tower));
        goTos.add(new GoTo(R.string.attractions_cologne_rhine_cable_car,
                R.string.attractions_cologne_rhine_cable_car_details,
                R.drawable.cologne_rhine_cable_car));

        // Create an {@link GoToAdapter}, whose data source is a list of {@link GoTo}s. The
        // adapter knows how to create list items for each item in the list.
        GoToAdapter adapter = new GoToAdapter(getActivity(), goTos, R.color.category_attractions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link GoToAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link GoTo} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
