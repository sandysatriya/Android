package com.example.sandysatriya.la7;

    import android.support.annotation.Nullable;
    import android.support.v4.app.Fragment;
    import android.os.Bundle;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;

    /**
     * Created by SandySatriya on 5/29/2017.
     */

    public class Lembar  extends Fragment{
        int mCurrentPage;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            Bundle data = getArguments();
            mCurrentPage = data.getInt("current_page", 0);
        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater,
                                 ViewGroup container,
                                 Bundle savedInstanceState) {

            View v = null;

            if (mCurrentPage ==1) {
                v = inflater.inflate(R.layout.layout1, container, false);

            } else  if (mCurrentPage ==2) {
                v = inflater.inflate(R.layout.layout2, container, false);
            } return v;

        }
    }

