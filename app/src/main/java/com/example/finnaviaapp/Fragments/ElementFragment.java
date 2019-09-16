package com.example.finnaviaapp.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.finnaviaapp.Callbck;
import com.example.finnaviaapp.Network.FinnaviaRequester;
import com.example.finnaviaapp.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ElementFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ElementFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ElementFragment extends Fragment {
    public static final String TAG = ElementFragment.class.getName();
    private OnFragmentInteractionListener mListener;

    public ElementFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragment = inflater.inflate(R.layout.fragment_element,container,false);
        final TextView tv = fragment.findViewById(R.id.elementString);
        FinnaviaRequester fr = new FinnaviaRequester();
        fr.loadData(new Callbck() {
            @Override
            public void onItemsLoaded(final String data) {
                mListener.startUiUpdate(new Runnable() {
                    @Override
                    public void run() {
                        tv.setText(data);
                    }
                });

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

    public static ElementFragment newInstance(){return new ElementFragment();}

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
