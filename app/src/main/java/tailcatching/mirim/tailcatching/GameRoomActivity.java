package tailcatching.mirim.tailcatching;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static tailcatching.mirim.tailcatching.R.layout.activity_colorassign;

/**
 * Created by 안성현 on 2017-06-02.
 */

public class GameRoomActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Button start_Button=(Button)findViewById(R.id.start_Button);
        Button back_Button=(Button)findViewById(R.id.back_Button);

        start_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View colorAssign_View = (View) View.inflate(getApplicationContext(), R.layout.activity_colorassign, null);
                TextView room_name = (TextView) findViewById(R.id.room_Name);
                room_name.setText("토론중");
                AlertDialog.Builder color_assign = new AlertDialog.Builder(GameRoomActivity.this);
                color_assign.setView(activity_colorassign);
                color_assign.setPositiveButton("확인", null);
                color_assign.show();
            }
        });
        back_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
