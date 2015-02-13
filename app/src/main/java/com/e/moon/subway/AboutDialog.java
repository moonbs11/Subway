package com.e.moon.subway;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

/**
 * Created by moon on 15. 2. 12.
 * dialog 창을 띄워주며 비트맵설정과 클릭이벤트를 실행한다.
 *
 */
public class AboutDialog extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.about);

        LinearLayout btn = (LinearLayout) findViewById(R.id.layout01);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }

    protected void onApplyThemeResource(Resources.Theme theme, int resId, boolean first) {
        super.onApplyThemeResource(theme, resId, first);
        theme.applyStyle(android.R.style.Theme_Panel, true);
    }
}
