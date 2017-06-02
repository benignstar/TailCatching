package tailcatching.mirim.tailcatching;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by 안성현 on 2017-06-02.
 */

public class GameRoomActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Button start_Button=(Button)findViewById(R.id.start_Button);
        Button back_Button=(Button)findViewById(R.id.back_Button);
/*
        start_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView color_assign_text = (TextView)findViewById(R.id.color_assign_text);
                String str = color_assign_text.getText().toString();
                SpannableStringBuilder ssb = new SpannableStringBuilder(str);
                ssb.setSpan(new ForegroundColorSpan(Color.parseColor("#FF0000")), 7, 10, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                color_assign_text.setText(ssb);

            }
        });*/
    }
}
