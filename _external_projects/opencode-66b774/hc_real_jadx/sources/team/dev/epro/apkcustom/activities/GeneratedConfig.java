package team.dev.epro.apkcustom.activities;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.UUID;
import p010.p011.p012.C0775;
import p010.p011.p012.p013.C0731;
import p010.p011.p012.p013.C0747;
import p010.p011.p012.p013.C0753;
import p010.p011.p012.p013.C0765;
import p034.p035.p043.C1067;
import p034.p050.p053.C1216;
import p107.p108.p109.p110.p111.C1827;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class GeneratedConfig extends AppCompatActivity {

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public File f3852;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public boolean f3853;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public UUID f3854;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public String f3855;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public FloatingActionMenu f3856;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public FloatingActionButton f3857;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public EditText f3858;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public FloatingActionButton f3859;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public View.OnClickListener f3860 = new ViewOnClickListenerC0525();

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public C0775 f3861;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public boolean f3862;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public File f3863;

    /* renamed from: team.dev.epro.apkcustom.activities.GeneratedConfig$げつ〴ぬぐ, reason: contains not printable characters */
    public class ViewOnClickListenerC0525 implements View.OnClickListener {
        public ViewOnClickListenerC0525() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i;
            GeneratedConfig generatedConfig;
            int id = view.getId();
            if (id == 2131296533) {
                GeneratedConfig.this.f3856.m1188(true);
                i = 2131820808;
                if (!GeneratedConfig.this.f3858.getText().toString().isEmpty()) {
                    try {
                        GeneratedConfig generatedConfig2 = GeneratedConfig.this;
                        generatedConfig2.m1640(generatedConfig2.f3858.getText().toString());
                        GeneratedConfig generatedConfig3 = GeneratedConfig.this;
                        generatedConfig3.m1639(String.format(generatedConfig3.getString(2131821330), GeneratedConfig.this.f3852), -256);
                        return;
                    } catch (IOException unused) {
                    }
                }
                generatedConfig = GeneratedConfig.this;
            } else {
                if (id != 2131296537) {
                    return;
                }
                GeneratedConfig.this.f3856.m1188(true);
                if (!GeneratedConfig.this.f3858.getText().toString().isEmpty()) {
                    GeneratedConfig generatedConfig4 = GeneratedConfig.this;
                    generatedConfig4.getClass();
                    Intent intent = new Intent(Crypt.a(Crypt.xrc("L4oA6lLef\u001ajj@7=I1lLg;@bj\u001e1<Lbk\u001c4f\u0019`jA0;O6f@e<L0>\u001cb=A7:HjmA0fHdgL")));
                    intent.putExtra(Crypt.a(Crypt.xrc("\u001ac<\u001cdmKbk\u0019kmAg=\u001cjg\u001b1mOd>O0lI`mL3:Ja=\u001d0kM1i\u001b4hLko\u0019j;\u0019cfHb=\u001a4=\u001bcnJ")), generatedConfig4.f3858.getText().toString());
                    intent.putExtra(Crypt.a(Crypt.xrc("\u001ac<\u001cdmKbk\u0019kmAg=\u001cjg\u001b1mOd>O0lI`mL3;Hfo\u001ad<\u001bdj\u001e7k\u001ed<Kf=J4<\u001ebg\u001bcjHa=H")), generatedConfig4.getString(2131820831));
                    intent.setType(Crypt.a(Crypt.xrc("M0lIkkJ7k\u001c7lNjk\u001a0m\u0019df\u001d3m\u001eb;Mc=\u001eb")));
                    generatedConfig4.startActivity(Intent.createChooser(intent, generatedConfig4.getString(2131820830)));
                    return;
                }
                generatedConfig = GeneratedConfig.this;
                i = 2131820809;
            }
            generatedConfig.m1639(generatedConfig.getString(i), -65536);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131492894);
        this.f3854 = UUID.randomUUID();
        this.f3858 = (EditText) findViewById(2131296444);
        this.f3856 = (FloatingActionMenu) findViewById(2131296534);
        this.f3857 = (FloatingActionButton) findViewById(2131296537);
        this.f3859 = (FloatingActionButton) findViewById(2131296533);
        this.f3856.setClosedOnTouchOutside(true);
        this.f3857.setOnClickListener(this.f3860);
        this.f3859.setOnClickListener(this.f3860);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        boolean z;
        byte[] bytes = this.f3858.getText().toString().getBytes();
        try {
            C0731 c0731 = new C0731();
            c0731.m1995(new InputStreamReader(new ByteArrayInputStream(bytes)));
            this.f3861 = c0731.m1996();
            App.f3762.edit().putString(Crypt.a(Crypt.xrc("H`oLkn\u001d6mH3<\u0019k>\u001agnIkiLcgJ`>O6;I6")), this.f3861.m2102()).commit();
            C0765.m2062(this).m2068(this.f3861);
            z = true;
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            App.f3762.edit().putString(Crypt.a(Crypt.xrc("H6mN69K0i\u001b`h\u001a7h@0jN6:\u001bfo\u001d`oJjkN6")), this.f3858.getText().toString()).apply();
            App.f3762.edit().putString(Crypt.a(Crypt.xrc("L1hLclNjiN`n@em\u001b7>Kak\u001c09H6m\u001e6mLj")), this.f3858.getText().toString()).apply();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, p034.p035.p041.C1043.InterfaceC1044
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2;
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 1921) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            i2 = 2131821110;
        } else {
            try {
                m1640(this.f3858.getText().toString());
                return;
            } catch (IOException unused) {
                i2 = 2131820808;
            }
        }
        m1639(getString(i2), -65536);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        boolean isEmpty = App.f3762.getString(Crypt.a(Crypt.xrc("L1hLclNjiN`n@em\u001b7>Kak\u001c09H6m\u001e6mLj")), "").isEmpty();
        String a = Crypt.a(Crypt.xrc("M0f\u0019djL6<KgmLaiJ1;KknKd:Ia9@cf\u0019kk\u0019bk\u001b4>OdjK6<Jg;\u001a0k@ckMalLblAkg\u001a"));
        if (isEmpty) {
            ((C1216) App.f3760).m2790(a, -65536);
            return;
        }
        try {
            m1641();
        } catch (Exception unused) {
            ((C1216) App.f3760).m2790(a, -65536);
        }
    }

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public final void m1639(String str, int i) {
        ((C1216) App.f3760).m2790(str, i);
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public final void m1640(String str) {
        StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("\u00190l\u001cjnOd;JcmMdiKdiO`;Ljk@j;KjmA4")));
        m4207.append(this.f3854);
        String sb = m4207.toString();
        this.f3863 = new File(Environment.getExternalStorageDirectory() + File.separator + getString(2131820626));
        this.f3852 = new File(Environment.getExternalStoragePublicDirectory(getString(2131820626)), C2098.m4205(sb, Crypt.a(Crypt.xrc("H`jL1:\u00197n\u001d69J3k\u001bjhIjhHghM`;\u001a1j@a"))));
        String a = Crypt.a(Crypt.xrc("\u001d7jN6;\u0019elM6m\u00190mNa=I`l\u00196<\u001da<\u001b09\u001ck:JjoH6n\u001cc:HemN1:\u0019g9Jcn\u001c1l\u001c`=K`>M`n\u001dd=\u001e4oL7;JboLff\u00193l\u001ekkLbn\u001c7=K`="));
        this.f3853 = C1067.m2407(this, a) != 0;
        String a2 = Crypt.a(Crypt.xrc("\u001d7jN6;\u0019elM6m\u00190mNa=I`l\u00196<\u001da<\u001b09\u001ckfL1h\u001abj\u001cb>J3;\u001b0>HffN`o\u001c1=Kj9\u001b4k@kfIk>M1:\u001denJgmAbfO6nId>M09MdhN6j"));
        boolean z = C1067.m2407(this, a2) != 0;
        this.f3862 = z;
        if (Build.VERSION.SDK_INT >= 23 && (this.f3853 || z)) {
            requestPermissions(new String[]{a2, a}, 1921);
            return;
        }
        if (!this.f3863.exists() && !this.f3863.mkdirs()) {
            throw new RuntimeException(Crypt.a(Crypt.xrc("@jnNgn\u001d4>\u001b7=\u0019c=Ak<J1l\u001ek<I`mLejI4gK3oOeoLk9Hk=\u001a69Lc<\u001e6:\u001d3jH0i\u001a3>\u001c")));
        }
        if (!this.f3852.createNewFile()) {
            throw new RuntimeException(Crypt.a(Crypt.xrc("\u001ebgO3i\u001a`;\u001bko\u001aj9Nd;Oao\u001a6h\u001b6kN3>Kk;IejN0nOjlN0=I4lO7j\u001abh\u001c3;\u001e4h\u001cf;\u0019")));
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.f3852.getAbsoluteFile()));
        bufferedWriter.write(str);
        bufferedWriter.close();
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public final void m1641() {
        String a = Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"));
        String a2 = Crypt.a(Crypt.xrc("\u001ddiO3:\u00193g\u001c3mNfiL69KkmIco\u0019c9\u001cg>I0"));
        this.f3861 = C0765.m2059(this, App.f3762.getString(Crypt.a(Crypt.xrc("H`oLkn\u001d6mH3<\u0019k>\u001agnIkiLcgJ`>O6;I6")), ""));
        if (C0753.m2042()) {
            this.f3861 = C0765.f4909;
        }
        int m2097 = this.f3861.m2097(this);
        if (m2097 != 2131821050) {
            this.f3858.setText(m2097);
            this.f3855 = getString(m2097);
            return;
        }
        this.f3858.setText(Crypt.a(Crypt.xrc("Ok<A0;H7iO0=@g=I7iLc=@6gL`i\u001eg;I`;I0>@0o\u001cd9Kci\u0019gg\u001bj>Njn\u001ca9OjgMe9L")));
        C0747 c0747 = this.f3861.f4956[0];
        if (c0747.f4845.equals(Crypt.a(Crypt.xrc("HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb")))) {
            try {
                String str = App.f3762.getString(a2, "").split(a)[0];
                String str2 = App.f3762.getString(a2, "").split(a)[1];
                c0747.f4845 = str;
                c0747.f4848 = str2;
            } catch (Exception unused) {
            }
        }
        App.f3762.edit().putString(Crypt.a(Crypt.xrc("L1hLclNjiN`n@em\u001b7>Kak\u001c09H6m\u001e6mLj")), this.f3861.m2096(App.f3759, false)).apply();
        new C1827(this, this.f3861, this.f3858).start();
    }
}
