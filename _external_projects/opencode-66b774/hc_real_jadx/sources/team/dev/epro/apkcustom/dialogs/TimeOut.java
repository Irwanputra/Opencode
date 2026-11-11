package team.dev.epro.apkcustom.dialogs;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.dialogs.TimeOut;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class TimeOut extends AppCompatActivity {

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public EditText f4026;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public int f4027 = App.f3762.getInt(Crypt.a(Crypt.xrc("KklNgjK`9H7fO3hO`n\u0019bmO4iHehAji\u0019b")), 10);

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public ImageView f4028;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public Button f4029;

    /* renamed from: team.dev.epro.apkcustom.dialogs.TimeOut$げつ〴ぬぐ, reason: contains not printable characters */
    public class ViewOnClickListenerC0556 implements View.OnClickListener {
        public ViewOnClickListenerC0556() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            App.f3762.edit().putInt(Crypt.a(Crypt.xrc("KklNgjK`9H7fO3hO`n\u0019bmO4iHehAji\u0019b")), TimeOut.this.f4026.getText().toString().trim().isEmpty() ? 10 : Integer.parseInt(TimeOut.this.f4026.getText().toString().trim())).apply();
            TimeOut.this.finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131492903);
        this.f4026 = (EditText) findViewById(2131296911);
        this.f4028 = (ImageView) findViewById(2131296440);
        Button button = (Button) findViewById(2131296844);
        this.f4029 = button;
        button.setOnClickListener(new ViewOnClickListenerC0556());
        this.f4028.setOnClickListener(new View.OnClickListener() { // from class: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぺふねづ〺.げつ〴ぬぐ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TimeOut.this.finish();
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        EditText editText = this.f4026;
        String str = "";
        if (this.f4027 != 10) {
            str = this.f4027 + "";
        }
        editText.setText(str);
    }
}
