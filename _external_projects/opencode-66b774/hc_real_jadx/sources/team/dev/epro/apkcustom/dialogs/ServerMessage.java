package team.dev.epro.apkcustom.dialogs;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ServerMessage extends AppCompatActivity {

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public static final /* synthetic */ int f4020 = 0;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public TextView f4021;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public Button f4022;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public ImageView f4023;

    /* renamed from: team.dev.epro.apkcustom.dialogs.ServerMessage$〺つふすそ, reason: contains not printable characters */
    public class ViewOnClickListenerC0554 implements View.OnClickListener {
        public ViewOnClickListenerC0554() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ServerMessage serverMessage = ServerMessage.this;
            int i = ServerMessage.f4020;
            serverMessage.finish();
        }
    }

    /* renamed from: team.dev.epro.apkcustom.dialogs.ServerMessage$げつ〴ぬぐ, reason: contains not printable characters */
    public class ViewOnClickListenerC0555 implements View.OnClickListener {
        public ViewOnClickListenerC0555() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ServerMessage serverMessage = ServerMessage.this;
            int i = ServerMessage.f4020;
            serverMessage.finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131492900);
        this.f4021 = (TextView) findViewById(2131296641);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f4021.setText(extras.getString(Crypt.a(Crypt.xrc("@kl\u001c0n\u001ckfIfgJj=Igj\u001d4jK7l\u001a0=NjjKk"))));
        }
        this.f4022 = (Button) findViewById(2131296440);
        this.f4023 = (ImageView) findViewById(2131296441);
        this.f4022.setOnClickListener(new ViewOnClickListenerC0555());
        this.f4023.setOnClickListener(new ViewOnClickListenerC0554());
    }
}
