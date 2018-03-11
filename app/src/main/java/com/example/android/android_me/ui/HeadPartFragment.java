/*
* Copyright (C) 2017 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*  	http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;

import java.util.List;

public class HeadPartFragment extends Fragment {

    private List<Integer> mImageIDs;
    private int currentIndex = 0;

    public void setmImageIDs(List<Integer> mImageIDs) {
        this.mImageIDs = mImageIDs;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the fragment
     */
    public HeadPartFragment() {
    }

    /**
     * Inflates the fragment layout file and sets the correct resource for the image to display
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the Android-Me fragment layout
        View rootView = inflater.inflate(R.layout.fragment_head_part, container, false);

        // Get a reference to the ImageView in the fragment layout
        ImageView imageView = (ImageView) rootView.findViewById(R.id.head_part_image_view);

        // Otherwise, create a Log statement that indicates that the list was not found
        if (mImageIDs != null) {
            imageView.setImageResource(mImageIDs.get(currentIndex));
        } else {
            Log.e(Fragment.class.getSimpleName(), "Fragment doesn't have images");
        }

        // Return the rootView
        return rootView;
    }

}
