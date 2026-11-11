package team.dev.epro.apkcustom.activities;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputLayout;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class SimpleMaker extends AppCompatActivity {

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public Button f3881;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public EditText f3882;

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public String f3883;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public CheckBox f3884;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public EditText f3885;

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public String f3886;

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public int f3887;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public EditText f3888;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public Spinner f3889;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public CheckBox f3890;

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public TextInputLayout f3891;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public TextInputLayout f3894;

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public String f3895;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public RadioGroup f3897;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public RadioButton f3899;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public Spinner f3900;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public CheckBox f3901;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public CheckBox f3903;

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public String f3904;

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public String f3905;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public EditText f3906;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public CheckBox f3907;

    /* renamed from: ながふずは, reason: contains not printable characters */
    public String f3908;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public CheckBox f3909;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public Spinner f3911;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public CheckBox f3913;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public EditText f3914;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public TextInputLayout f3915;

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public String f3916;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public CheckBox f3917;

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public String f3912 = "";

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public String f3898 = "";

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public String f3896 = "";

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public String f3910 = "";

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public String f3893 = "";

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public String f3880 = "";

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public String f3892 = "";

    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    public View.OnClickListener f3902 = new ViewOnClickListenerC0530();

    /* renamed from: team.dev.epro.apkcustom.activities.SimpleMaker$〺つふすそ, reason: contains not printable characters */
    public class C0529 implements CompoundButton.OnCheckedChangeListener {
        public C0529() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            TextInputLayout textInputLayout;
            String a;
            if (z) {
                SimpleMaker.this.f3915.setVisibility(0);
                SimpleMaker.this.f3906.setText("");
                SimpleMaker.this.f3891.setVisibility(8);
                SimpleMaker.this.f3894.setVisibility(0);
                textInputLayout = SimpleMaker.this.f3894;
                a = Crypt.a(Crypt.xrc("\u0019f;I7:\u001d6nIc9I3hOjnLjk\u001dao\u001c`nK`9N1hId=A4gK1:A1i\u001dkn\u001c4l\u001c3=\u001b79Og>J1;L"));
            } else {
                SimpleMaker.this.f3915.setVisibility(8);
                SimpleMaker.this.f3885.setText("");
                SimpleMaker.this.f3914.setText("");
                SimpleMaker.this.f3891.setVisibility(0);
                SimpleMaker.this.f3894.setVisibility(8);
                textInputLayout = SimpleMaker.this.f3894;
                a = Crypt.a(Crypt.xrc("A`9Jg:AenN1<Ndj\u00197:@kjOjj\u001b4fJ4g\u0019bi\u001e7fI`oH1nL1l\u001ebo\u001e0=A7h\u00190>\u001d1n\u001bf=L"));
            }
            textInputLayout.setHint(a);
        }
    }

    /* renamed from: team.dev.epro.apkcustom.activities.SimpleMaker$くし〴〺ぅ, reason: contains not printable characters */
    public class ViewOnClickListenerC0530 implements View.OnClickListener {
        public ViewOnClickListenerC0530() {
        }

        /* JADX WARN: Removed duplicated region for block: B:151:0x070e  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0337  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0349  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x036d  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0391  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0437  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0a4e  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onClick(android.view.View r32) {
            /*
                Method dump skipped, instructions count: 2986
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: team.dev.epro.apkcustom.activities.SimpleMaker.ViewOnClickListenerC0530.onClick(android.view.View):void");
        }
    }

    /* renamed from: team.dev.epro.apkcustom.activities.SimpleMaker$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0531 implements RadioGroup.OnCheckedChangeListener {
        public C0531() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            SimpleMaker simpleMaker = SimpleMaker.this;
            simpleMaker.f3899 = (RadioButton) simpleMaker.f3897.findViewById(i);
            SimpleMaker simpleMaker2 = SimpleMaker.this;
            int indexOfChild = simpleMaker2.f3897.indexOfChild(simpleMaker2.f3899);
            SimpleMaker.this.m1648(Crypt.a(Crypt.xrc("IakAggLe=MegMbfN7oO6f\u0019jk\u001dki\u001bc:Lf9\u001e7kAfnHjm\u001dcjId<O6iAblOenA6:\u001aao\u0019")), indexOfChild + "");
            if (indexOfChild == 1) {
                SimpleMaker.this.f3903.setEnabled(true);
            } else {
                SimpleMaker.this.f3903.setEnabled(false);
                SimpleMaker.this.f3903.setChecked(false);
            }
        }
    }

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public static void m1645(SimpleMaker simpleMaker, String str, boolean z) {
        simpleMaker.getClass();
        C2098.m4182(App.f3762, str, z);
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public static String m1646(SimpleMaker simpleMaker, int i) {
        simpleMaker.getClass();
        String str = "";
        for (int i2 = 0; i2 < i; i2++) {
            str = C2098.m4205(str, "\\r\n");
        }
        return str;
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public static String m1647(SimpleMaker simpleMaker) {
        return simpleMaker.f3904.contains(Crypt.a(Crypt.xrc("\u001e7=K0o\u0019ffI3lA6l\u001dah\u001e0fJjj\u001ddh\u001af=\u001cc"))) ? Crypt.a(Crypt.xrc("\u0019k<\u001bbkHe9IglN6>\u001eko@6l\u00197>\u001ckfNgoN4")) : "";
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131493012);
        this.f3889 = (Spinner) findViewById(2131296818);
        this.f3900 = (Spinner) findViewById(2131296821);
        this.f3911 = (Spinner) findViewById(2131296819);
        RadioGroup radioGroup = (RadioGroup) findViewById(2131296748);
        this.f3897 = radioGroup;
        radioGroup.setOnCheckedChangeListener(new C0531());
        this.f3913 = (CheckBox) findViewById(2131296603);
        this.f3909 = (CheckBox) findViewById(2131296761);
        this.f3907 = (CheckBox) findViewById(2131296717);
        this.f3884 = (CheckBox) findViewById(2131296554);
        this.f3901 = (CheckBox) findViewById(2131296407);
        this.f3917 = (CheckBox) findViewById(2131296406);
        this.f3890 = (CheckBox) findViewById(2131296766);
        this.f3903 = (CheckBox) findViewById(2131296825);
        this.f3915 = (TextInputLayout) findViewById(2131296645);
        this.f3894 = (TextInputLayout) findViewById(2131296459);
        this.f3891 = (TextInputLayout) findViewById(2131296575);
        this.f3906 = (EditText) findViewById(2131296381);
        this.f3914 = (EditText) findViewById(2131296458);
        this.f3881 = (Button) findViewById(2131296379);
        this.f3882 = (EditText) findViewById(2131296746);
        this.f3888 = (EditText) findViewById(2131296523);
        this.f3885 = (EditText) findViewById(2131296643);
        this.f3899 = (RadioButton) findViewById(this.f3897.getCheckedRadioButtonId());
        this.f3890.setOnCheckedChangeListener(new C0529());
        this.f3881.setOnClickListener(this.f3902);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        m1648(Crypt.a(Crypt.xrc("\u001c`j\u001ajfM6:Iam\u00196o\u001begK1o\u001d0i\u001efn\u001ean@1j\u001abiIg>Nfo\u001a6n\u0019kk\u001d4i\u001abf\u001c1mJefHkfN")), this.f3889.getSelectedItemPosition() + "");
        m1648(Crypt.a(Crypt.xrc("Laf\u001acj\u001dbk\u0019fg\u001a3o@3nM`mJj=\u001a4lI6;\u001bao\u0019jiO7=@g=Hen\u0019f:Jkm\u0019g9AgnOa>\u001d`m\u001e")), this.f3900.getSelectedItemPosition() + "");
        m1648(Crypt.a(Crypt.xrc("Nf:O4>O7=O3=Hg;J6i\u001bbgJk:\u001b0hI3jLdnHe=A4:\u001dc;@j=J3;\u001akf\u001edg\u001a1j\u001eag\u001edhO")), this.f3913.isChecked() + "");
        m1648(Crypt.a(Crypt.xrc("\u001cdmJ0k@emOa9\u001c`=Meg\u001ef9Lc>\u001canHchI4;\u001e1i\u001e19MdhO3fI0h\u001bjnNbhO7m\u001dkoNb>L")), this.f3909.isChecked() + "");
        m1648(Crypt.a(Crypt.xrc("\u001cc9@ahJg:K0n\u001akfOkjM19\u001c7lAfgH7g\u0019a<\u0019gg\u001a6m\u0019`jL`=H1k@0nHb9@do\u001bjgAbiI")), this.f3907.isChecked() + "");
        m1648(Crypt.a(Crypt.xrc("If<HflA0o\u001eegAg;\u001bflI6gA1=@a9\u001a1>KciH69\u001dfg\u001ed>J6hJ`m\u001be=\u001dd:Ha9\u001bg9\u00194k@")), this.f3884.isChecked() + "");
        m1648(Crypt.a(Crypt.xrc("NkfIb=LkjA7i\u001bdg@jo\u001bb;K3o\u001agkKjn\u00191<Iag\u001dkh\u001a0jIgoOalOd9\u001d`<\u001ed:Nf;@6lO")), this.f3890.isChecked() + "");
        m1648(Crypt.a(Crypt.xrc("Ae:@0>\u001dj=\u001aa<Mci\u0019g:NanOgiLg:MkoHdk\u001b69Ael\u001c1o\u001a3jJ`oH`n\u001bk=IbjOd=\u001e1oO")), this.f3903.isChecked() + "");
        m1648(Crypt.a(Crypt.xrc("A3jOf;\u001bj:\u001bkoLk>Ndg\u001cfjNc>I1iMfn\u001cb")), this.f3901.isChecked() + "");
        m1648(Crypt.a(Crypt.xrc("Lfl\u001dciLejA4o\u001dkhJd=\u00196lNbf\u001ba>LcmH0")), this.f3917.isChecked() + "");
        m1648(Crypt.a(Crypt.xrc("@0=\u001a3jAj=JchNg:\u001c7o\u0019g:OjjKdjNgoHe")), this.f3911.getSelectedItemPosition() + "");
        m1648(Crypt.a(Crypt.xrc("NfoOj<L1h\u001a0mNfiAk=Odl\u00191hJflLjj\u001a0hNkk\u001cg>A`>\u001dajIkm\u001cb<M7k\u001e7;A7gNg>\u001a")), this.f3906.getText().toString());
        m1648(Crypt.a(Crypt.xrc("Ij;H7kOeo\u001aan\u001dd:IffAgh\u001e`<@ag\u0019ki\u001e`kI6m\u001d0j\u0019j>Ak<\u001ckg\u001bdg\u001d0oI0mMajK0kH")), this.f3914.getText().toString());
        m1648(Crypt.a(Crypt.xrc("K6i@6=@gj@0>Ac9H7i\u001c19Ha;Mfg\u001bdfO0")), this.f3882.getText().toString());
        m1648(Crypt.a(Crypt.xrc("\u001aek\u001agn\u001eafL4>JcoL`:\u001djj\u001aek\u0019f>\u001dff\u001ak")), this.f3888.getText().toString());
        m1648(Crypt.a(Crypt.xrc("O0oMal\u001e1;J0iKfk\u001cd9M09Of<\u001c6lJai\u001e49K`iI0n\u001eef\u001dc:NdfN3hO4hMbj\u001edhKkk\u001b")), this.f3885.getText().toString());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        TextInputLayout textInputLayout;
        String a;
        super.onResume();
        Spinner spinner = this.f3889;
        SharedPreferences sharedPreferences = App.f3762;
        String a2 = Crypt.a(Crypt.xrc("\u001c`j\u001ajfM6:Iam\u00196o\u001begK1o\u001d0i\u001efn\u001ean@1j\u001abiIg>Nfo\u001a6n\u0019kk\u001d4i\u001abf\u001c1mJefHkfN"));
        String a3 = Crypt.a(Crypt.xrc("\u001b6kN0k\u001d3mL1=\u001e0>M3f\u001ekfK49Kcm\u001bg;Ig"));
        spinner.setSelection(Integer.parseInt(sharedPreferences.getString(a2, a3)));
        this.f3900.setSelection(Integer.parseInt(App.f3762.getString(Crypt.a(Crypt.xrc("Laf\u001acj\u001dbk\u0019fg\u001a3o@3nM`mJj=\u001a4lI6;\u001bao\u0019jiO7=@g=Hen\u0019f:Jkm\u0019g9AgnOa>\u001d`m\u001e")), a3)));
        int parseInt = Integer.parseInt(App.f3762.getString(Crypt.a(Crypt.xrc("IakAggLe=MegMbfN7oO6f\u0019jk\u001dki\u001bc:Lf9\u001e7kAfnHjm\u001dcjId<O6iAblOenA6:\u001aao\u0019")), a3));
        RadioButton radioButton = (RadioButton) this.f3897.getChildAt(parseInt);
        this.f3899 = radioButton;
        radioButton.setChecked(true);
        CheckBox checkBox = this.f3913;
        SharedPreferences sharedPreferences2 = App.f3762;
        String a4 = Crypt.a(Crypt.xrc("Nf:O4>O7=O3=Hg;J6i\u001bbgJk:\u001b0hI3jLdnHe=A4:\u001dc;@j=J3;\u001akf\u001edg\u001a1j\u001eag\u001edhO"));
        String a5 = Crypt.a(Crypt.xrc("@e>H`l\u001a1n\u0019f>Kdj\u001b`g\u00190n\u001adhH6mH`:Ab"));
        checkBox.setChecked(Boolean.valueOf(sharedPreferences2.getString(a4, a5)).booleanValue());
        this.f3909.setChecked(Boolean.valueOf(App.f3762.getString(Crypt.a(Crypt.xrc("\u001cdmJ0k@emOa9\u001c`=Meg\u001ef9Lc>\u001canHchI4;\u001e1i\u001e19MdhO3fI0h\u001bjnNbhO7m\u001dkoNb>L")), a5)).booleanValue());
        this.f3907.setChecked(Boolean.valueOf(App.f3762.getString(Crypt.a(Crypt.xrc("\u001cc9@ahJg:K0n\u001akfOkjM19\u001c7lAfgH7g\u0019a<\u0019gg\u001a6m\u0019`jL`=H1k@0nHb9@do\u001bjgAbiI")), a5)).booleanValue());
        this.f3884.setChecked(Boolean.valueOf(App.f3762.getString(Crypt.a(Crypt.xrc("If<HflA0o\u001eegAg;\u001bflI6gA1=@a9\u001a1>KciH69\u001dfg\u001ed>J6hJ`m\u001be=\u001dd:Ha9\u001bg9\u00194k@")), a5)).booleanValue());
        this.f3890.setChecked(Boolean.valueOf(App.f3762.getString(Crypt.a(Crypt.xrc("NkfIb=LkjA7i\u001bdg@jo\u001bb;K3o\u001agkKjn\u00191<Iag\u001dkh\u001a0jIgoOalOd9\u001d`<\u001ed:Nf;@6lO")), a5)).booleanValue());
        this.f3903.setChecked(Boolean.valueOf(App.f3762.getString(Crypt.a(Crypt.xrc("Ae:@0>\u001dj=\u001aa<Mci\u0019g:NanOgiLg:MkoHdk\u001b69Ael\u001c1o\u001a3jJ`oH`n\u001bk=IbjOd=\u001e1oO")), a5)).booleanValue());
        this.f3901.setChecked(Boolean.valueOf(App.f3762.getString(Crypt.a(Crypt.xrc("A3jOf;\u001bj:\u001bkoLk>Ndg\u001cfjNc>I1iMfn\u001cb")), a5)).booleanValue());
        this.f3917.setChecked(Boolean.valueOf(App.f3762.getString(Crypt.a(Crypt.xrc("Lfl\u001dciLejA4o\u001dkhJd=\u00196lNbf\u001ba>LcmH0")), a5)).booleanValue());
        this.f3911.setSelection(Integer.parseInt(App.f3762.getString(Crypt.a(Crypt.xrc("@0=\u001a3jAj=JchNg:\u001c7o\u0019g:OjjKdjNgoHe")), a3)));
        this.f3906.setText(App.f3762.getString(Crypt.a(Crypt.xrc("NfoOj<L1h\u001a0mNfiAk=Odl\u00191hJflLjj\u001a0hNkk\u001cg>A`>\u001dajIkm\u001cb<M7k\u001e7;A7gNg>\u001a")), ""));
        this.f3914.setText(App.f3762.getString(Crypt.a(Crypt.xrc("Ij;H7kOeo\u001aan\u001dd:IffAgh\u001e`<@ag\u0019ki\u001e`kI6m\u001d0j\u0019j>Ak<\u001ckg\u001bdg\u001d0oI0mMajK0kH")), ""));
        this.f3882.setText(App.f3762.getString(Crypt.a(Crypt.xrc("K6i@6=@gj@0>Ac9H7i\u001c19Ha;Mfg\u001bdfO0")), ""));
        this.f3888.setText(App.f3762.getString(Crypt.a(Crypt.xrc("\u001aek\u001agn\u001eafL4>JcoL`:\u001djj\u001aek\u0019f>\u001dff\u001ak")), ""));
        this.f3885.setText(App.f3762.getString(Crypt.a(Crypt.xrc("O0oMal\u001e1;J0iKfk\u001cd9M09Of<\u001c6lJai\u001e49K`iI0n\u001eef\u001dc:NdfN3hO4hMbj\u001edhKkk\u001b")), ""));
        if (this.f3890.isChecked()) {
            this.f3915.setVisibility(0);
            this.f3906.setText("");
            this.f3891.setVisibility(8);
            this.f3894.setVisibility(0);
            textInputLayout = this.f3894;
            a = Crypt.a(Crypt.xrc("\u0019f;I7:\u001d6nIc9I3hOjnLjk\u001dao\u001c`nK`9N1hId=A4gK1:A1i\u001dkn\u001c4l\u001c3=\u001b79Og>J1;L"));
        } else {
            this.f3915.setVisibility(8);
            this.f3885.setText("");
            this.f3914.setText("");
            this.f3891.setVisibility(0);
            this.f3894.setVisibility(8);
            textInputLayout = this.f3894;
            a = Crypt.a(Crypt.xrc("A`9Jg:AenN1<Ndj\u00197:@kjOjj\u001b4fJ4g\u0019bi\u001e7fI`oH1nL1l\u001ebo\u001e0=A7h\u00190>\u001d1n\u001bf=L"));
        }
        textInputLayout.setHint(a);
        if (parseInt == 1) {
            this.f3903.setEnabled(true);
        } else {
            this.f3903.setEnabled(false);
            this.f3903.setChecked(false);
        }
    }

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public final void m1648(String str, String str2) {
        C2098.m4206(App.f3762, str, str2);
    }
}
