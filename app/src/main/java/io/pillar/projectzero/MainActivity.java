package io.pillar.projectzero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hotMovieClick(View view) {
        showToast(view);
    }

    private void showToast(View view) {
        if (view instanceof Button) {
            CharSequence buttonText = ((Button) view).getText();
            String toastText = getString(R.string.toast_text, buttonText);
            Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
        }
    }

    public void stockEagleClick(View view) {
        showToast(view);
    }

    public void xyzReaderClick(View view) {
        showToast(view);
    }

    public void latestNewsClick(View view) {
        showToast(view);
    }

    public void graduationProjectClick(View view) {
        showToast(view);
    }
}
