package com.company.andrzej.rolki.wroclawnarolkach;

import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;


public class DialogChooseFragment extends DialogFragment {

    @BindView(R.id.freeride_btn)
    Button freeride;
    @BindView(R.id.fitness_btn)
    Button fitness;
    @BindView(R.id.buttonall)
    Button buttonAll;
    @BindView(R.id.naglowek)
    TextView textOnTop;
    private Context context;

    int mNum;

    static DialogChooseFragment newInstance(int num) {
        DialogChooseFragment f = new DialogChooseFragment();
        Bundle args = new Bundle();
        args.putInt("num", num);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mNum = getArguments().getInt("num");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_dialog_choose, container, false);
        ButterKnife.bind(this, v);
        configureButtons();
        return v;
    }

    private void configureButtons() {
        freeride.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "freeride", Toast.LENGTH_SHORT).show();
            }
        });
        fitness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "freeride", Toast.LENGTH_SHORT).show();
            }
        });
        buttonAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) context).openMapActivity();
            }
        });
    }


}
