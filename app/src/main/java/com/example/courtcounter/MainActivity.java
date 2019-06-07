package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int tA = 0, tB = 0;
    int idA = R.id.pointA, idB = R.id.pointB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increase3(View view) {
        switch (view.getId()) {
            case R.id.point3A:
                tA += 3;
                updatePoints(idA, tA);
                break;
            case R.id.point3B:
                tB += 3;
                updatePoints(idB, tB);
                break;
            default:
                break;
        }

    }

    public void increase2(View view) {
        switch (view.getId()) {
            case R.id.point2A:
                tA += 2;
                updatePoints(idA, tA);

                break;
            case R.id.point2B:
                tB += 2;
                updatePoints(idB, tB);
                break;
            default:
                break;
        }

    }

    public void free(View view) {
        switch (view.getId()) {
            case R.id.freeA:
                tA++;
                updatePoints(idA, tA);

                break;
            case R.id.freeB:
                tB++;
                updatePoints(idB, tB);
                break;
            default:
                break;
        }

    }

    public void reset(View v) {
        tA = 0;
        tB = 0;
        updatePoints(idA, tA);
        updatePoints(idB, tB);
    }

    private void updatePoints(int id, int p) {
        TextView points = (TextView) findViewById(id);
        points.setText(p + "");
//        TextView points = (TextView) findViewById(R.id.pointA);
//        points.setText(tA);

    }
}
