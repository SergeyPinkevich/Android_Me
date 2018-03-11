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

/**
 * @author Sergey Pinkevich
 */

public class LegPartFragment extends Fragment {

    private List<Integer> mImageIDs;
    private int currentIndex = 0;

    public void setmImageIDs(List<Integer> mImageIDs) {
        this.mImageIDs = mImageIDs;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    public LegPartFragment() {}

    /**
     * Inflates the fragment layout file and sets the correct resource for the image to display
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the Android-Me fragment layout
        View rootView = inflater.inflate(R.layout.fragment_leg_part, container, false);

        // Get a reference to the ImageView in the fragment layout
        ImageView imageView = (ImageView) rootView.findViewById(R.id.leg_part_image_view);

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
