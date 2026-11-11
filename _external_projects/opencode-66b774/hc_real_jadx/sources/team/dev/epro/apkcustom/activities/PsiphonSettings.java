package team.dev.epro.apkcustom.activities;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import p034.p035.p043.C1067;
import p107.p108.p109.p110.p113.C1832;
import p107.p108.p109.p110.p129.C1965;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class PsiphonSettings extends AppCompatActivity {

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public HashMap<String, String> f3865;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public View.OnClickListener f3866 = new ViewOnClickListenerC0526();

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public Button f3867;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public C1832 f3868;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public C1832 f3869;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public EditText f3870;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public C1965 f3871;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public EditText f3872;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public ArrayAdapter<String> f3873;

    /* renamed from: team.dev.epro.apkcustom.activities.PsiphonSettings$〺つふすそ, reason: contains not printable characters */
    public class ViewOnClickListenerC0526 implements View.OnClickListener {
        public ViewOnClickListenerC0526() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            App.f3762.edit().putString(Crypt.a(Crypt.xrc("H0f\u001ae9Oe:N6:\u001djm\u001cknMaiMjgId;N7k\u001e4")), PsiphonSettings.this.f3870.getText().toString().trim()).apply();
            App.f3762.edit().putString(Crypt.a(Crypt.xrc("M0nN3:@3mAeo\u001ed:O0>Idf\u001cg<Hfm\u001dg=H3:Mj>\u001e7gLgnI`l\u001bamA4jH4<N3<Hf<H7iO")), PsiphonSettings.this.f3872.getText().toString().trim()).apply();
            App.f3762.edit().putString(Crypt.a(Crypt.xrc("Nc=@bjOcgA6>\u001c`<M4lMfn\u001bd9O7m\u001djjNj")), PsiphonSettings.this.f3869.m3948().toString()).apply();
            SharedPreferences.Editor edit = App.f3762.edit();
            PsiphonSettings psiphonSettings = PsiphonSettings.this;
            edit.putString(Crypt.a(Crypt.xrc("KfkJjl\u001cd>\u001c4kI1h\u001d3fJc:Kki\u001behM7=\u001e6")), psiphonSettings.f3865.get(psiphonSettings.f3869.m3948().toString())).apply();
            App.f3762.edit().putString(Crypt.a(Crypt.xrc("\u001dfg\u001be=Kfo\u001d3i\u001cc=ObjO1mL6<\u001bcnN3i\u001ak")), PsiphonSettings.this.f3868.m3948().toString()).apply();
            PsiphonSettings.this.finish();
        }
    }

    /* renamed from: team.dev.epro.apkcustom.activities.PsiphonSettings$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0527 extends ArrayAdapter<String> {
        public C0527(PsiphonSettings psiphonSettings, Context context, int i) {
            super(context, i);
        }

        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            View dropDownView = super.getDropDownView(i, view, viewGroup);
            dropDownView.setBackgroundColor(C1067.m2405(App.f3759, 2131099801));
            if (Build.VERSION.SDK_INT >= 16) {
                dropDownView.setBackground(C1067.m2406(App.f3759, 2131231199));
            }
            float f = dropDownView.getContext().getResources().getDisplayMetrics().density;
            ViewGroup.LayoutParams layoutParams = dropDownView.getLayoutParams();
            layoutParams.height = (int) (f * 30.0f);
            dropDownView.setLayoutParams(layoutParams);
            TextView textView = (TextView) dropDownView;
            textView.setTextSize(14.0f);
            textView.setGravity(16);
            return dropDownView;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            view2.setBackgroundColor(C1067.m2405(App.f3759, 2131099801));
            ((TextView) view2).setTextSize(12.0f);
            return view2;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131492898);
        this.f3870 = (EditText) findViewById(2131296362);
        this.f3872 = (EditText) findViewById(2131296801);
        this.f3869 = new C1832(findViewById(2131296745));
        this.f3868 = new C1832(findViewById(2131296756));
        HashMap<String, String> hashMap = new HashMap<>();
        this.f3865 = hashMap;
        hashMap.put(Crypt.a(Crypt.xrc("L0oIgf\u001e`<\u001ed9K0l\u001a4i\u0019e<\u0019al\u001ad9\u001aa=\u001ae")), "");
        HashMap<String, String> hashMap2 = this.f3865;
        String a = Crypt.a(Crypt.xrc("\u001ed=J`mKfoLk<\u001ee;\u001cfm\u001dflA6fIko\u001c1l\u001c`"));
        hashMap2.put(a, a);
        HashMap<String, String> hashMap3 = this.f3865;
        String a2 = Crypt.a(Crypt.xrc("\u001bkmNa=\u001a3h\u001cdgHbhLc;\u001celN`;L7n\u001b1lNe"));
        hashMap3.put(a2, a2);
        this.f3865.put(Crypt.a(Crypt.xrc("Oa=OkmHjnKafN1iAak\u001eg9Ldk\u001db=\u00196gA7")), Crypt.a(Crypt.xrc("\u001cd;\u001c`<K`9AdjK6j\u001a`:\u001dc9\u001e6:\u00196k\u001ad>\u0019bl\u001ca=\u001a1k\u001bkk\u001efo\u001a4=\u001de9\u001d3l\u001bboKfiNa>\u001d")));
        this.f3865.put(Crypt.a(Crypt.xrc("\u001c1k\u001e1i@agAf=H4h\u001ef;Ka>I`fAb<@4iIe:\u001ak;\u001dclJjn\u00191k@km\u001cdm\u001e0;\u0019kgM3<OaiA")), Crypt.a(Crypt.xrc("K1j\u001c49\u001b7<O6j\u001a6jKah@a>MdjJgoK7k\u001e19H4j\u001a7:Kj:K6iJ19@g9I4hO7kMck\u001d3m\u001c")));
        this.f3865.put(Crypt.a(Crypt.xrc("K3;A4;Jdi\u001cci\u001e7kLc:I3j\u001afhNjm\u001ab;A`jK7gNg9J6n\u001aj9\u001e79Kkj\u001be:\u001d7o\u001a6;M1>\u001e")), Crypt.a(Crypt.xrc("\u0019dgHbgA0>\u001b7gI4<M4oLem\u001e3>@0<\u001efk\u001ac=IkgM7>Hd9N6;\u0019e;Hjj\u001cjlM7:\u0019glH`9A19\u001bgoKcmIkfM7gO4<\u001bjmJ`jA3>\u001b6fK7>")));
        this.f3865.put(Crypt.a(Crypt.xrc("\u001eah\u001ddmM19\u001a4iKf9JdhH0j@6iIch@bhN3")), Crypt.a(Crypt.xrc("H3oMch\u001a0=L4l\u001aefLk;\u001b3f@7:I0=LclKcf\u0019g>H7j\u001eaoKdhI6iAa9Nd9Jf>@f9Hc>L")));
        this.f3865.put(Crypt.a(Crypt.xrc("Oai\u001e3mJ0jMgl\u001efh\u001db<\u0019dfIgm@`o@7<\u001dkkJk<NkhJ6nHc9\u001d4m\u001cak\u001a7=I4n\u001cc;\u001e`fM")), Crypt.a(Crypt.xrc("LkoAeiJkh@b=\u001cal@b;@cj\u001edjJ6mI6f\u001d0>Ma>Le=HfhA6m\u001c`nJ6=Kgf\u001ackOclJkkI")));
        this.f3865.put(Crypt.a(Crypt.xrc("\u0019dhIc=\u001d4n@6f\u001dfo\u001ef9KbkA19H6j\u001d4g\u001ek")), Crypt.a(Crypt.xrc("@anOkoLd;@gg\u001bjiNbhJkoK6i\u001bkgAd9A3")));
        this.f3865.put(Crypt.a(Crypt.xrc("\u001af=MkmM3nJc>H0mKk;Mf<\u001ekoN1;Ma;Md")), Crypt.a(Crypt.xrc("KefA0hK6i\u001cal\u001dk:K3<\u001b7kKbo\u001dbg\u001dco\u001ed")));
        this.f3865.put(Crypt.a(Crypt.xrc("Md<I`9N4o\u001d`l\u001c`m\u0019c:M3nM6o\u001a4<\u001d`=\u001ce")), Crypt.a(Crypt.xrc("IkfAflOfm\u001dgmHffJbm@bo\u001b6i\u001b6>\u00197gNg")));
        this.f3873 = new C0527(this, this, R.layout.simple_spinner_item);
        ArrayList arrayList = new ArrayList(this.f3865.keySet());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f3873.add((String) it.next());
        }
        C1832 c1832 = this.f3869;
        ArrayAdapter<String> arrayAdapter = this.f3873;
        c1832.getClass();
        if (arrayAdapter.getCount() > 0) {
            c1832.f8199 = 0;
        }
        c1832.f8198.setAdapter((SpinnerAdapter) arrayAdapter);
        C1965 c1965 = new C1965(this);
        this.f3871 = c1965;
        C1832 c18322 = this.f3868;
        c18322.getClass();
        if (c1965.getCount() > 0) {
            c18322.f8199 = 0;
        }
        c18322.f8198.setAdapter((SpinnerAdapter) c1965);
        Button button = (Button) findViewById(2131296770);
        this.f3867 = button;
        button.setOnClickListener(this.f3866);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f3870.setText(App.f3762.getString(Crypt.a(Crypt.xrc("H0f\u001ae9Oe:N6:\u001djm\u001cknMaiMjgId;N7k\u001e4")), ""));
        this.f3872.setText(App.f3762.getString(Crypt.a(Crypt.xrc("M0nN3:@3mAeo\u001ed:O0>Idf\u001cg<Hfm\u001dg=H3:Mj>\u001e7gLgnI`l\u001bamA4jH4<N3<Hf<H7iO")), ""));
        this.f3869.m3947(App.f3762.getString(Crypt.a(Crypt.xrc("Nc=@bjOcgA6>\u001c`<M4lMfn\u001bd9O7m\u001djjNj")), Crypt.a(Crypt.xrc("L0oIgf\u001e`<\u001ed9K0l\u001a4i\u0019e<\u0019al\u001ad9\u001aa=\u001ae"))));
        this.f3868.m3947(App.f3762.getString(Crypt.a(Crypt.xrc("\u001dfg\u001be=Kfo\u001d3i\u001cc=ObjO1mL6<\u001bcnN3i\u001ak")), ""));
    }
}
