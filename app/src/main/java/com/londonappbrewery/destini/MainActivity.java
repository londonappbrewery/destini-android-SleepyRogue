package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    // TODO: Steps 4 & 8 - Declare member variables here:
    private Button topButt;
    private Button bottomButt;
    private TextView storyView;
    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        topButt = findViewById(R.id.buttonTop);
        bottomButt = findViewById(R.id.buttonBottom);
        storyView = findViewById(R.id.storyTextView);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (mStoryIndex == 1 || mStoryIndex ==2)
                {
                    storyView.setText(R.string.T3_Story);
                    topButt.setText(R.string.T3_Ans1);
                    bottomButt.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }
                else if (mStoryIndex == 3)
                {
                    storyView.setText (R.string.T6_End);
                    topButt.setVisibility(View.INVISIBLE);
                    bottomButt.setVisibility(View.INVISIBLE);
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottomButt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (mStoryIndex == 1)
                {
                    storyView.setText(R.string.T2_Story);
                    topButt.setText(R.string.T2_Ans1);
                    bottomButt.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                }
                else if (mStoryIndex == 2)
                {
                    storyView.setText(R.string.T4_End);
                    topButt.setVisibility(View.INVISIBLE);
                    bottomButt.setVisibility(View.INVISIBLE);
                }
                else if (mStoryIndex == 3)
                {
                    storyView.setText(R.string.T5_End);
                    topButt.setVisibility(View.INVISIBLE);
                    bottomButt.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
