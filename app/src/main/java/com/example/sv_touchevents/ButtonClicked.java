package com.example.sv_touchevents;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonClicked implements View.OnClickListener
{
    private TextView textViewBox;
    private int count;

    public ButtonClicked(TextView textBox) //default constructor
    {
        textViewBox = textBox;
        count = 0;
    }

    public void onClick(View view)
    {
        Button theOneClicked = (Button)view;
        //figure out how to get the name of the button
        //use CharSequence to get the characters

        CharSequence label = theOneClicked.getText();

        if(label.charAt(0) == 'P')
        {
            count = count+1;
            textViewBox.setText("You pressed the right button " + count + " times!");
        }
        else if(label.charAt(0) == 'D')
        {
            count = count-1;
            textViewBox.setText("Wrong button, you get a -1 count. Now you have pressed the right button " + count + " times.");
        }
    }
}
