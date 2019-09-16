package com.example.sv_touchevents;

import android.widget.SeekBar;
import android.widget.TextView;

public class seekBarListener implements SeekBar.OnSeekBarChangeListener
{

    TextView seekText;

    public seekBarListener(TextView seekTextBox)
    {
        seekText = seekTextBox;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
    {
        seekText.setText(""+progress);

    }

    public void onStartTrackingTouch(SeekBar seekBar)
    {

    }

    public void onStopTrackingTouch(SeekBar seekBar)
    {

    }
}
