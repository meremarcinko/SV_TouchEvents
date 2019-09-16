package com.example.sv_touchevents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the object of the button
        Button pressThisButton = (Button)findViewById(R.id.pressThis);
        Button dontPress = (Button)findViewById(R.id.dontPressThis);
        SeekBar seek = (SeekBar)findViewById(R.id.seekBar);

        //Link to something
            //find the id of what you are connecting it too
            //create the Listener for the button
                //create the listener from the new class created (ButtonClicked)
            //connect the button to the listener class

        TextView textViewBox = (TextView)findViewById(R.id.howMany);
        TextView seekText = (TextView)findViewById(R.id.seekBarText);

        ButtonClicked thebuttonClickedListener = new ButtonClicked(textViewBox);

        //for the right button
        pressThisButton.setOnClickListener(thebuttonClickedListener);

        //for the wrong button
        dontPress.setOnClickListener(thebuttonClickedListener);

        //seekBar
        seekBarListener theSeekBarListener = new seekBarListener(seekText);
        seek.setOnSeekBarChangeListener(theSeekBarListener);

    }
}
