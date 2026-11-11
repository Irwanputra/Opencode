package team.dev.epro.apkcustom.dialogs;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class Dns extends AppCompatActivity {

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public EditText f3928;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public Button f3929;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public EditText f3930;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public ImageView f3931;

    /* renamed from: team.dev.epro.apkcustom.dialogs.Dns$〺つふすそ, reason: contains not printable characters */
    public class ViewOnClickListenerC0533 implements View.OnClickListener {
        public ViewOnClickListenerC0533() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Dns.this.finish();
        }
    }

    /* renamed from: team.dev.epro.apkcustom.dialogs.Dns$げつ〴ぬぐ, reason: contains not printable characters */
    public class ViewOnClickListenerC0534 implements View.OnClickListener {
        public ViewOnClickListenerC0534() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            App.f3762.edit().putString(Crypt.a(Crypt.xrc("Nc:Nfg\u001e0:\u001e3h\u001adkJkjHc<\u001edf\u001ddl\u001de=J1")), Dns.this.f3928.getText().toString().trim().isEmpty() ? Crypt.a(Crypt.xrc("Lb:\u001b`m\u00194=JjkHbiHdhI3kMem\u001dko\u001ag9Ag")) : Dns.this.f3928.getText().toString().trim()).commit();
            App.f3762.edit().putString(Crypt.a(Crypt.xrc("@alM4=\u001c4g\u001b`m\u00197hIa;I3>La<\u0019ai@1l\u001ba")), Dns.this.f3930.getText().toString().trim().isEmpty() ? Crypt.a(Crypt.xrc("I4fN`gL1mJc9I3;\u001c3:\u001d49MfgI`lO4nMf")) : Dns.this.f3930.getText().toString().trim()).commit();
            Dns.this.finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131492893);
        this.f3931 = (ImageView) findViewById(2131296440);
        this.f3928 = (EditText) findViewById(2131296497);
        this.f3930 = (EditText) findViewById(2131296498);
        Button button = (Button) findViewById(2131296844);
        this.f3929 = button;
        button.setOnClickListener(new ViewOnClickListenerC0534());
        this.f3931.setOnClickListener(new ViewOnClickListenerC0533());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        EditText editText = this.f3928;
        SharedPreferences sharedPreferences = App.f3762;
        String a = Crypt.a(Crypt.xrc("Nc:Nfg\u001e0:\u001e3h\u001adkJkjHc<\u001edf\u001ddl\u001de=J1"));
        editText.setText(sharedPreferences.getString(a, "").equals(Crypt.a(Crypt.xrc("Lb:\u001b`m\u00194=JjkHbiHdhI3kMem\u001dko\u001ag9Ag"))) ? "" : App.f3762.getString(a, ""));
        EditText editText2 = this.f3930;
        SharedPreferences sharedPreferences2 = App.f3762;
        String a2 = Crypt.a(Crypt.xrc("@alM4=\u001c4g\u001b`m\u00197hIa;I3>La<\u0019ai@1l\u001ba"));
        editText2.setText(sharedPreferences2.getString(a2, "").equals(Crypt.a(Crypt.xrc("I4fN`gL1mJc9I3;\u001c3:\u001d49MfgI`lO4nMf"))) ? "" : App.f3762.getString(a2, ""));
    }
}
