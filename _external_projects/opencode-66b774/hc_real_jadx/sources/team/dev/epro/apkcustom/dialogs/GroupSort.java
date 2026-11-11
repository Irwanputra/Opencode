package team.dev.epro.apkcustom.dialogs;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import p107.p108.p109.p110.p112.C1831;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class GroupSort extends AppCompatActivity implements View.OnClickListener {

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public ImageView f3934;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public String[] f3935;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public C1831 f3936;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public LinearLayout f3937;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public Spinner f3938;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public Spinner f3939;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public TextView f3940;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public Spinner f3941;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public ArrayAdapter<String> f3942;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public ArrayAdapter<String> f3943;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public Spinner f3944;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public ArrayAdapter<String> f3945;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public Button f3946;

    /* renamed from: team.dev.epro.apkcustom.dialogs.GroupSort$〺つふすそ, reason: contains not printable characters */
    public class C0535 implements AdapterView.OnItemSelectedListener {
        public C0535(GroupSort groupSort) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            App.f3762.edit().putInt(Crypt.a(Crypt.xrc("KfkAekNa;H3=\u001cko\u001egiMboM6>MclM7=Na")), i).commit();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: team.dev.epro.apkcustom.dialogs.GroupSort$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0536 implements AdapterView.OnItemSelectedListener {
        public C0536() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            Spinner spinner;
            if (i == 1) {
                GroupSort.this.f3940.setText(GroupSort.this.getString(2131821364) + Crypt.a(Crypt.xrc("JbgNg9K3fHcn\u001cfiNaiJ3kI7m\u00194>\u001979\u001b6")) + GroupSort.this.f3936.m3945() + Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc")));
                GroupSort.this.f3940.setVisibility(0);
                GroupSort.this.f3937.setVisibility(0);
                GroupSort.this.f3939.setVisibility(0);
                GroupSort.this.f3941.setVisibility(8);
                GroupSort groupSort = GroupSort.this;
                Context context = adapterView.getContext();
                C1831 c1831 = GroupSort.this.f3936;
                c1831.getClass();
                ArrayList arrayList = new ArrayList();
                SQLiteDatabase writableDatabase = c1831.getWritableDatabase();
                Cursor rawQuery = writableDatabase.rawQuery(Crypt.a(Crypt.xrc("Me;\u001ed>J0jI1=\u001cemO6oIfi@4jJdlHbl\u001ejlKel\u001dj:KboH1nAcnKjj\u001cbnJji\u001e`=\u0019aoOkjKg9Hj=KgkI0kLbm@jf\u001a6g\u001agj@c>Oa:A`:\u001dc;I7h\u001bjo\u001c`=\u001c0gH1k\u0019gi\u001eg:M0kO0=N7lAd<O6hLagO6i\u00191;Mfm@ei\u001baf@d;\u001c")), null);
                if (rawQuery.moveToFirst()) {
                    do {
                        arrayList.add(rawQuery.getString(0));
                    } while (rawQuery.moveToNext());
                }
                rawQuery.close();
                writableDatabase.close();
                groupSort.f3942 = new ArrayAdapter<>(context, 2131493013, arrayList);
                GroupSort groupSort2 = GroupSort.this;
                groupSort2.f3939.setAdapter((SpinnerAdapter) groupSort2.f3942);
                if (App.f3762.getInt(Crypt.a(Crypt.xrc("@3:\u001egi\u001benK`nO39\u001ccj\u001d1kO3h\u001e`<\u001ddkHafJgh\u001dkhL6nNe>Mj<@1<O7jJegIk>Od<O")), 0) < GroupSort.this.f3936.m3945()) {
                    spinner = GroupSort.this.f3939;
                    spinner.setSelection(0);
                }
            } else if (i == 2) {
                GroupSort.this.f3940.setText(2131821365);
                GroupSort.this.f3940.setVisibility(0);
                GroupSort.this.f3937.setVisibility(0);
                GroupSort.this.f3939.setVisibility(8);
                GroupSort.this.f3941.setVisibility(0);
                GroupSort.this.f3942 = new ArrayAdapter<>(adapterView.getContext(), 2131493013, GroupSort.this.f3935);
                GroupSort groupSort3 = GroupSort.this;
                groupSort3.f3941.setAdapter((SpinnerAdapter) groupSort3.f3942);
                if (App.f3762.getInt(Crypt.a(Crypt.xrc("HbgJ1;AkkMakA4<N1gLdoHa>OakK0jAj;Jg=IdnL0:L1m@`;Oj=Ig=H1hK4=L4lL")), 0) < 2) {
                    spinner = GroupSort.this.f3941;
                    spinner.setSelection(0);
                }
            } else {
                GroupSort.this.f3940.setVisibility(8);
                GroupSort.this.f3937.setVisibility(8);
                GroupSort.this.f3939.setVisibility(8);
                GroupSort.this.f3941.setVisibility(8);
            }
            App.f3762.edit().putInt(Crypt.a(Crypt.xrc("@fhM7jNk9\u001d4i\u0019a>Nj9M`nOk:\u001efoK`k@`")), i).commit();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        SharedPreferences.Editor putString;
        if (view.getId() == 2131296440) {
            finish();
            return;
        }
        int selectedItemPosition = this.f3944.getSelectedItemPosition();
        String a = Crypt.a(Crypt.xrc("\u001eanOk>\u0019e=\u001e6=O6mNcnL39\u001b09Kgh\u001a0l@j"));
        if (selectedItemPosition == 1) {
            App.f3762.edit().putString(a, this.f3939.getSelectedItem() + "").commit();
            putString = App.f3762.edit().putInt(Crypt.a(Crypt.xrc("@3:\u001egi\u001benK`nO39\u001ccj\u001d1kO3h\u001e`<\u001ddkHafJgh\u001dkhL6nNe>Mj<@1<O7jJegIk>Od<O")), this.f3939.getSelectedItemPosition());
        } else {
            int selectedItemPosition2 = this.f3944.getSelectedItemPosition();
            String a2 = Crypt.a(Crypt.xrc("Igl\u001ea;H1iOagA0=N7jJc9I0lH69\u0019boN1"));
            if (selectedItemPosition2 == 2) {
                C2098.m4186(App.f3762, a, a2);
                App.f3762.edit().putInt(Crypt.a(Crypt.xrc("HbgJ1;AkkMakA4<N1gLdoHa>OakK0jAj;Jg=IdnL0:L1m@`;Oj=Ig=H1hK4=L4lL")), this.f3941.getSelectedItemPosition()).commit();
                putString = App.f3762.edit().putString(Crypt.a(Crypt.xrc("Nc=@bjOcgA6>\u001c`<M4lMfn\u001bd9O7m\u001djjNj")), (this.f3941.getSelectedItem() + "").toLowerCase());
            } else {
                putString = App.f3762.edit().putString(a, a2);
            }
        }
        putString.commit();
        App.f3762.edit().putString(Crypt.a(Crypt.xrc("\u001d1<@ki@0h\u001d1oLe<H4m\u001ek;\u001c3nHbjH7hOb")), this.f3938.getSelectedItem().toString()).commit();
        setResult(-1);
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131492895);
        this.f3935 = getResources().getStringArray(2130903046);
        this.f3936 = new C1831(App.f3759);
        this.f3945 = new ArrayAdapter<>(this, 2131493013, getResources().getStringArray(2130903044));
        this.f3943 = new ArrayAdapter<>(this, 2131493013, getResources().getStringArray(2130903057));
        Spinner spinner = (Spinner) findViewById(2131296820);
        this.f3944 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f3945);
        Spinner spinner2 = (Spinner) findViewById(2131296822);
        this.f3938 = spinner2;
        spinner2.setAdapter((SpinnerAdapter) this.f3943);
        this.f3940 = (TextView) findViewById(2131296891);
        this.f3937 = (LinearLayout) findViewById(2131296630);
        this.f3939 = (Spinner) findViewById(2131296453);
        this.f3941 = (Spinner) findViewById(2131296744);
        this.f3934 = (ImageView) findViewById(2131296440);
        Button button = (Button) findViewById(2131296844);
        this.f3946 = button;
        button.setOnClickListener(this);
        this.f3934.setOnClickListener(this);
        this.f3944.setOnItemSelectedListener(new C0536());
        this.f3938.setOnItemSelectedListener(new C0535(this));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f3944.setSelection(App.f3762.getInt(Crypt.a(Crypt.xrc("@fhM7jNk9\u001d4i\u0019a>Nj9M`nOk:\u001efoK`k@`")), 0));
        this.f3938.setSelection(App.f3762.getInt(Crypt.a(Crypt.xrc("KfkAekNa;H3=\u001cko\u001egiMboM6>MclM7=Na")), 0));
        if (this.f3944.getSelectedItemPosition() > 0) {
            SharedPreferences sharedPreferences = App.f3762;
            String a = Crypt.a(Crypt.xrc("@3:\u001egi\u001benK`nO39\u001ccj\u001d1kO3h\u001e`<\u001ddkHafJgh\u001dkhL6nNe>Mj<@1<O7jJegIk>Od<O"));
            if (sharedPreferences.getInt(a, 0) < this.f3936.m3945()) {
                this.f3939.setSelection(App.f3762.getInt(a, 0));
            }
        }
    }
}
