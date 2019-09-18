package com.example.finnaviaapp.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.finnaviaapp.Callbck;
import com.example.finnaviaapp.Network.FinnaviaRequester;
import com.example.finnaviaapp.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MainFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {
    public static final String TAG = MainFragment.class.getName();

    private FinnaviaRequester fr;
    private OnFragmentInteractionListener mListener;
    private Context context;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragment = inflater.inflate(R.layout.main_fragment,container,false);
        context = container.getContext();
        fr = new FinnaviaRequester();

        final TextView tv = fragment.findViewById(R.id.textView2);
        final ProgressBar sp = fragment.findViewById(R.id.progressBar3);
        datarequest(context.getString(R.string.finnaviaArrivals),tv,sp);


        TabLayout tb = fragment.findViewById(R.id.maintab);
        tb.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getText().toString().equals("Arrivals")) {
                    datarequest(context.getString(R.string.finnaviaArrivals), tv, sp);
                    Log.d("mf_oTS","Arrivals");
                } else {
                    datarequest(context.getString(R.string.finnaviaDepartures), tv, sp);
                    Log.d("mf_oTS","Departures");
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                sp.setVisibility(View.VISIBLE);
                tv.setText(context.getString(R.string.loading));
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        return fragment;

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }
    @Override
    public void onStart() {
        super.onStart();
        mListener = (OnFragmentInteractionListener) getActivity();
    }
    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
    private void datarequest(String arrordep, final TextView tv, final ProgressBar sp) {
        fr.loadData(arrordep,"all",new Callbck() {
            @Override
            public void onItemsLoaded(final Object data) {
                mListener.startUiUpdate(new Runnable() {
                    @Override
                    public void run() {
                        tv.setText((String) data);
                        sp.setVisibility(View.GONE);

                    }
                });

            }
        });
    }
    public static MainFragment newInstance(){return new MainFragment();}

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
        void startUiUpdate(Runnable runnable);
    }
}
