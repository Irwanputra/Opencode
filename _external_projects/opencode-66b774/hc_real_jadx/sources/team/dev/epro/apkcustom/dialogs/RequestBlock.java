package team.dev.epro.apkcustom.dialogs;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputLayout;
import java.io.File;
import p034.p035.p043.C1067;
import p034.p050.p053.C1216;
import p034.p050.p060.DialogInterfaceC1343;
import p107.p108.p109.p110.p113.InterfaceC1837;
import p131.p155.p156.p157.C2098;
import p131.p221.p222.InterfaceC2677;
import p131.p221.p222.p224.ViewOnClickListenerC2688;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class RequestBlock extends AppCompatActivity implements View.OnClickListener {

    /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
    public File f3948;

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public Button f3949;

    /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
    public TextView f3950;

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public CheckBox f3951;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public TextInputLayout f3952;

    /* renamed from: ぁないぼぎへ, reason: contains not printable characters */
    public boolean f3953;

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public CheckBox f3954;

    /* renamed from: ぅばづそほせ, reason: contains not printable characters */
    public boolean f3955;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public EditText f3956;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public TextInputLayout f3957;

    /* renamed from: ぇいうげ〱〹, reason: contains not printable characters */
    public String f3958;

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public CheckBox f3959;

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public CheckBox f3960;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public TextInputLayout f3961;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public LinearLayout f3962;

    /* renamed from: ぉねぞはがぞ, reason: contains not printable characters */
    public String f3963;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public EditText f3964;

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public EditText f3965;

    /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
    public Button f3966;

    /* renamed from: がぐくいおす, reason: contains not printable characters */
    public String f3967;

    /* renamed from: きぬどぼみ〸, reason: contains not printable characters */
    public String f3968;

    /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
    public File f3969;

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public Button f3970;

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public Button f3971;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public EditText f3972;

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public CheckBox f3973;

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public CheckBox f3974;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public LinearLayout f3975;

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public CheckBox f3976;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public LinearLayout f3977;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public LinearLayout f3978;

    /* renamed from: しぷげへが, reason: contains not printable characters */
    public String f3979;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public EditText f3980;

    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    public Button f3981;

    /* renamed from: せだてはぺて, reason: contains not printable characters */
    public String f3982;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public EditText f3983;

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public CheckBox f3984;

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public CheckBox f3985;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public TextInputLayout f3986;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public EditText f3987;

    /* renamed from: な〱ちぉじ, reason: contains not printable characters */
    public String f3988;

    /* renamed from: ながふずは, reason: contains not printable characters */
    public CheckBox f3989;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public EditText f3990;

    /* renamed from: にぢ〱ぁな, reason: contains not printable characters */
    public String f3991;

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public CheckBox f3992;

    /* renamed from: のびぶけせ, reason: contains not printable characters */
    public String f3993;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public LinearLayout f3994;

    /* renamed from: はつきどっ, reason: contains not printable characters */
    public TextView f3995;

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public CheckBox f3996;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public ImageView f3997;

    /* renamed from: びちづぼぬ, reason: contains not printable characters */
    public String f3998;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public TextInputLayout f3999;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public EditText f4000;

    /* renamed from: へえどぜせ, reason: contains not printable characters */
    public boolean f4001;

    /* renamed from: へぼ〳〻び, reason: contains not printable characters */
    public String f4002;

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public CheckBox f4003;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public EditText f4004;

    /* renamed from: team.dev.epro.apkcustom.dialogs.RequestBlock$〳ぜぞぜべっ, reason: contains not printable characters */
    public class C0537 implements CompoundButton.OnCheckedChangeListener {
        public C0537() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            RequestBlock requestBlock = RequestBlock.this;
            if (!z) {
                requestBlock.f3961.setVisibility(8);
                RequestBlock.this.f3972.setText("");
            } else {
                requestBlock.f3961.setVisibility(0);
                if (RequestBlock.this.f3951.isChecked()) {
                    return;
                }
                RequestBlock.this.f3959.setChecked(true);
            }
        }
    }

    /* renamed from: team.dev.epro.apkcustom.dialogs.RequestBlock$〺つふすそ, reason: contains not printable characters */
    public class C0538 implements CompoundButton.OnCheckedChangeListener {
        public C0538() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                RequestBlock.this.f3951.setChecked(true);
            }
        }
    }

    /* renamed from: team.dev.epro.apkcustom.dialogs.RequestBlock$ぁごぐすすぃ, reason: contains not printable characters */
    public class C0539 implements CompoundButton.OnCheckedChangeListener {
        public C0539() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            RequestBlock requestBlock = RequestBlock.this;
            if (!z) {
                requestBlock.f3986.setVisibility(8);
                RequestBlock.this.f3999.setVisibility(8);
                return;
            }
            requestBlock.f3986.setVisibility(0);
            RequestBlock.this.f3999.setVisibility(0);
            if (RequestBlock.this.f3951.isChecked()) {
                return;
            }
            RequestBlock.this.f3959.setChecked(true);
        }
    }

    /* renamed from: team.dev.epro.apkcustom.dialogs.RequestBlock$いいにぽつ, reason: contains not printable characters */
    public class C0540 implements CompoundButton.OnCheckedChangeListener {
        public C0540() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!z && !RequestBlock.this.f3951.isChecked()) {
                RequestBlock.this.f3984.setChecked(false);
                RequestBlock.this.f3960.setChecked(false);
                RequestBlock.this.f3976.setChecked(false);
                RequestBlock.this.f3985.setChecked(false);
                RequestBlock.this.f3973.setChecked(false);
                RequestBlock.this.f3974.setChecked(false);
                RequestBlock.this.f3989.setChecked(false);
                RequestBlock.this.f3996.setChecked(false);
                RequestBlock.this.f3954.setChecked(false);
            }
            if (z) {
                RequestBlock.this.f3951.setChecked(false);
                RequestBlock.this.f3996.setChecked(false);
            }
        }
    }

    /* renamed from: team.dev.epro.apkcustom.dialogs.RequestBlock$おぐぴう〸ず, reason: contains not printable characters */
    public class C0541 implements CompoundButton.OnCheckedChangeListener {
        public C0541() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!z || RequestBlock.this.f3951.isChecked()) {
                return;
            }
            RequestBlock.this.f3959.setChecked(true);
        }
    }

    /* renamed from: team.dev.epro.apkcustom.dialogs.RequestBlock$くし〴〺ぅ, reason: contains not printable characters */
    public class DialogInterfaceOnClickListenerC0542 implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC0542(RequestBlock requestBlock) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: team.dev.epro.apkcustom.dialogs.RequestBlock$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0543 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: team.dev.epro.apkcustom.dialogs.RequestBlock$げつ〴ぬぐ$〺つふすそ, reason: contains not printable characters */
        public class C0544 implements InterfaceC2677 {
            public C0544() {
            }
        }

        /* renamed from: team.dev.epro.apkcustom.dialogs.RequestBlock$げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
        public class C0545 implements ViewOnClickListenerC2688.InterfaceC2692 {
            public C0545() {
            }
        }

        public C0543() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            RequestBlock requestBlock = RequestBlock.this;
            if (!z) {
                requestBlock.f3989.setText(Crypt.a(Crypt.xrc("Hcn\u001ckm\u001efgLehJejMg>\u001b19\u00194k\u001cf;\u001a1m\u001ae")));
                return;
            }
            if (!requestBlock.f3951.isChecked()) {
                RequestBlock.this.f3959.setChecked(true);
            }
            ViewOnClickListenerC2688 viewOnClickListenerC2688 = new ViewOnClickListenerC2688();
            viewOnClickListenerC2688.f10178 = new C0544();
            viewOnClickListenerC2688.f10170 = new C0545();
            viewOnClickListenerC2688.m3825(RequestBlock.this.m535(), Crypt.a(Crypt.xrc("M1;IelI1jK0nIdn\u001edj\u001dk:O6gMk=L6oNek\u001bfkLbk\u001ea>\u001d7nHfkMcoNkfI0i\u001d7nM79@")));
        }
    }

    /* renamed from: team.dev.epro.apkcustom.dialogs.RequestBlock$づざかべべ, reason: contains not printable characters */
    public class DialogInterfaceOnClickListenerC0546 implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC0546(RequestBlock requestBlock) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: team.dev.epro.apkcustom.dialogs.RequestBlock$てぜきぽく, reason: contains not printable characters */
    public class C0547 implements CompoundButton.OnCheckedChangeListener {
        public C0547() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!z || RequestBlock.this.f3951.isChecked()) {
                return;
            }
            RequestBlock.this.f3959.setChecked(true);
        }
    }

    /* renamed from: team.dev.epro.apkcustom.dialogs.RequestBlock$なぎぱいぢぎ, reason: contains not printable characters */
    public class DialogInterfaceOnClickListenerC0548 implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC0548() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                InterfaceC1837 interfaceC1837 = App.f3760;
                RequestBlock requestBlock = RequestBlock.this;
                ((C1216) interfaceC1837).m2760(requestBlock.f3969, requestBlock.f3968);
                RequestBlock requestBlock2 = RequestBlock.this;
                requestBlock2.m1654(String.format(requestBlock2.getString(2131821330), RequestBlock.this.f3969), -256);
                RequestBlock.this.setResult(-1);
                RequestBlock.this.finish();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: team.dev.epro.apkcustom.dialogs.RequestBlock$のぷのちつ, reason: contains not printable characters */
    public class C0549 implements CompoundButton.OnCheckedChangeListener {
        public C0549() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!z || RequestBlock.this.f3951.isChecked()) {
                return;
            }
            RequestBlock.this.f3959.setChecked(true);
        }
    }

    /* renamed from: team.dev.epro.apkcustom.dialogs.RequestBlock$びぐびあび, reason: contains not printable characters */
    public class DialogInterfaceOnClickListenerC0550 implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC0550() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                InterfaceC1837 interfaceC1837 = App.f3760;
                RequestBlock requestBlock = RequestBlock.this;
                ((C1216) interfaceC1837).m2760(requestBlock.f3969, requestBlock.f3968);
                RequestBlock requestBlock2 = RequestBlock.this;
                requestBlock2.m1654(String.format(requestBlock2.getString(2131821330), RequestBlock.this.f3969), -256);
                RequestBlock.this.setResult(-1);
                RequestBlock.this.finish();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: team.dev.epro.apkcustom.dialogs.RequestBlock$へぬ〴づぞ, reason: contains not printable characters */
    public class C0551 implements CompoundButton.OnCheckedChangeListener {
        public C0551() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!z || RequestBlock.this.f3951.isChecked()) {
                return;
            }
            RequestBlock.this.f3959.setChecked(true);
        }
    }

    /* renamed from: team.dev.epro.apkcustom.dialogs.RequestBlock$ぺぁあねじ, reason: contains not printable characters */
    public class C0552 implements CompoundButton.OnCheckedChangeListener {
        public C0552() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            RequestBlock requestBlock = RequestBlock.this;
            if (!z) {
                requestBlock.f3957.setVisibility(8);
                RequestBlock.this.f3965.setText("");
            } else {
                requestBlock.f3957.setVisibility(0);
                if (RequestBlock.this.f3951.isChecked()) {
                    return;
                }
                RequestBlock.this.f3959.setChecked(true);
            }
        }
    }

    /* renamed from: team.dev.epro.apkcustom.dialogs.RequestBlock$ぺふねづ〺, reason: contains not printable characters */
    public class C0553 implements CompoundButton.OnCheckedChangeListener {
        public C0553() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!z && !RequestBlock.this.f3959.isChecked()) {
                RequestBlock.this.f3984.setChecked(false);
                RequestBlock.this.f3960.setChecked(false);
                RequestBlock.this.f3976.setChecked(false);
                RequestBlock.this.f3985.setChecked(false);
                RequestBlock.this.f3973.setChecked(false);
                RequestBlock.this.f3974.setChecked(false);
                RequestBlock.this.f3989.setChecked(false);
                RequestBlock.this.f3996.setChecked(false);
                RequestBlock.this.f3954.setChecked(false);
            }
            if (z) {
                RequestBlock.this.f3959.setChecked(false);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        SharedPreferences sharedPreferences;
        String a;
        String a2;
        SharedPreferences sharedPreferences2;
        String a3;
        boolean isEmpty = this.f3990.getText().toString().trim().isEmpty();
        String a4 = Crypt.a(Crypt.xrc("\u001dki\u001ecmK1;H`;KalOkhN7h\u001cc:K1kJ7:J4"));
        this.f3993 = isEmpty ? a4 : this.f3990.getText().toString();
        this.f3958 = this.f3987.getText().toString().trim();
        this.f3979 = this.f3983.getText().toString().trim();
        boolean isEmpty2 = this.f4000.getText().toString().trim().isEmpty();
        String a5 = Crypt.a(Crypt.xrc("Mj=H0gN3;N7oH0:\u001c79\u001c19\u001cfi\u001e19\u001a39Ae"));
        this.f4002 = isEmpty2 ? a5 : this.f4000.getText().toString().trim();
        int i = 5;
        String str = "";
        switch (view.getId()) {
            case 2131296382:
                m1655();
                App.f3762.edit().putString(new String(((C1216) App.f3760).m2772(5, 0)), "").commit();
                if (this.f3993.isEmpty()) {
                    App.f3762.edit().putString(new String(((C1216) App.f3760).m2772(5, 1)), a4).commit();
                }
                C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("Hef\u001cj<Jc>L3f\u001eblJ7lA1>@dfK`;\u001akf\u001d6")), true);
                setResult(-1);
                finish();
                return;
            case 2131296383:
                if (this.f4002.isEmpty()) {
                    this.f4002 = a5;
                }
                SharedPreferences.Editor edit = App.f3762.edit();
                if (!this.f4002.isEmpty()) {
                    a5 = this.f4002;
                }
                edit.putString(Crypt.a(Crypt.xrc("M`i\u001b7nNkmN0kOemM3>O0hHjk\u001d4l@4iOf")), a5).commit();
                setResult(-1);
                finish();
                return;
            case 2131296384:
                m1655();
                App.f3762.edit().putString(new String(((C1216) App.f3760).m2772(5, 0)), "").commit();
                if (!this.f3979.isEmpty()) {
                    m1654(Crypt.a(Crypt.xrc("JekHd:\u001adj\u0019g:\u0019k9@e<LkmAg9L4=H4;@e:\u001df9I7mOf=M0=\u00193mKdm\u001c`9\u001ed:\u001ccgLchL")), -256);
                }
                setResult(-1);
                finish();
                return;
            case 2131296386:
                if (this.f3970.getText().toString().equalsIgnoreCase(Crypt.a(Crypt.xrc("Mcm\u001bf<HkiL0nHkgLjhL4j\u001bk>\u001de;\u0019bjMf")))) {
                    App.f3762.edit().putString(new String(((C1216) App.f3760).m2772(5, 2)), this.f3964.getText().toString()).commit();
                }
                finish();
                return;
            case 2131296388:
                this.f3988 = this.f3956.getText().toString().trim();
                if (((C1216) App.f3760).m2739().isEmpty()) {
                    sharedPreferences = App.f3762;
                    a = Crypt.a(Crypt.xrc("\u001bj;\u0019dhH`>A4hO`j\u001a3f@7kOen\u001c0>L1>\u001ce"));
                } else {
                    sharedPreferences = App.f3762;
                    a = Crypt.a(Crypt.xrc("H7nOghObiKb>\u0019cgHd=\u0019k:J`iH0m\u001d`fA1"));
                }
                this.f3998 = sharedPreferences.getString(a, "");
                this.f3963 = App.f3762.getString(Crypt.a(Crypt.xrc("L1hLclNjiN`n@em\u001b7>Kak\u001c09H6m\u001e6mLj")), "");
                int i2 = 1194;
                String[] split = App.f3762.getString(Crypt.a(Crypt.xrc("\u001ddiO3:\u00193g\u001c3mNfiL69KkmIco\u0019c9\u001cg>I0")), "").split(Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")));
                if (split.length > 1) {
                    a2 = split[0].trim();
                    try {
                        i2 = Integer.parseInt(split[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                } else {
                    a2 = Crypt.a(Crypt.xrc("\u001dboM`iLglM4l\u001djfIfmJ3gKgj\u001b3<Ob>\u001ba=Mc:N0:J0g\u001ajj\u001ck=A4o@6o\u001bbi\u0019gg\u001d0mO"));
                }
                String str2 = this.f3963;
                String a6 = Crypt.a(Crypt.xrc("Iak@4<Lc<Mg;@6<\u001eakN`kLfmMgfO6f\u0019go\u001afmHc;K4h\u001919Lfi@fmO1j\u001ej:\u001cbfK1hA"));
                if (str2.contains(a6)) {
                    this.f3963 = this.f3963.replace(a6, Crypt.a(Crypt.xrc("\u001cegHenL7g\u001a6gNfmKgf\u001adl\u001ajf@k9IcmLj")) + a2 + Crypt.a(Crypt.xrc("\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd")) + i2);
                }
                if (((C1216) App.f3760).m2739().isEmpty()) {
                    sharedPreferences2 = App.f3762;
                    a3 = Crypt.a(Crypt.xrc("\u001d0f@d:OfnM7>A7:\u001cbfJ4lH49L79\u001c0:O6"));
                } else {
                    sharedPreferences2 = App.f3762;
                    a3 = Crypt.a(Crypt.xrc("Kkl\u001eg9\u001eanIcf\u0019`oH4;\u0019anMboMa:\u0019k<\u001db"));
                }
                this.f3991 = sharedPreferences2.getString(a3, "");
                SharedPreferences sharedPreferences3 = App.f3762;
                String a7 = Crypt.a(Crypt.xrc("\u0019jkL1<\u001b3o\u00190o\u001djf\u001c`;H1n\u00193=\u001ebg\u001e7mMf"));
                boolean z = sharedPreferences3.getBoolean(a7, false);
                String a8 = Crypt.a(Crypt.xrc("\u001c1m\u001d1jKjhOdn\u00190:MciNen\u001b4oKfj\u001ae9\u001bf"));
                String a9 = Crypt.a(Crypt.xrc("Lb;\u001ee;Hej\u001dbnJehO7;\u001c3kN7f\u001dj>KklL1"));
                if (z && App.f3762.getBoolean(a8, false) && !App.f3762.getBoolean(a9, false)) {
                    i = 3;
                } else if (App.f3762.getBoolean(a7, false) && !App.f3762.getBoolean(a9, false)) {
                    i = 1;
                } else if (App.f3762.getBoolean(a8, false) && !App.f3762.getBoolean(a9, false)) {
                    i = 2;
                } else if (App.f3762.getBoolean(a7, false) && App.f3762.getBoolean(a8, false) && App.f3762.getBoolean(a9, false)) {
                    i = 7;
                } else if (!App.f3762.getBoolean(a7, false) || !App.f3762.getBoolean(a9, false)) {
                    i = (App.f3762.getBoolean(a8, false) && App.f3762.getBoolean(a9, false)) ? 6 : App.f3762.getBoolean(a9, false) ? 4 : 0;
                }
                String string = App.f3762.getString(Crypt.a(Crypt.xrc("NgiJk;N7nJ1;Ldm\u001d4=\u001bjg\u001d7>\u001a0;\u001ccf\u001d6oLbg\u001afgO1;\u001e4j\u001a4jO`:@e=\u001e7;MdmMelI")), "");
                InterfaceC1837 interfaceC1837 = App.f3760;
                if (!Boolean.parseBoolean(((C1216) interfaceC1837).m2744(((C1216) interfaceC1837).m2739())[2]) && string.isEmpty()) {
                    try {
                        InterfaceC1837 interfaceC18372 = App.f3760;
                        string = ((C1216) interfaceC18372).m2744(((C1216) interfaceC18372).m2739())[26];
                    } catch (IndexOutOfBoundsException unused2) {
                    }
                }
                if (string.isEmpty()) {
                    string = App.f3762.getString(Crypt.a(Crypt.xrc("Oj=Okk\u001c0g\u001eg9\u001bjfN7>\u001bdj@e;Acf\u001dj>J7")), "");
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.f3990.getText().toString());
                String a10 = Crypt.a(Crypt.xrc("\u001e0k\u0019k;MfhAa<Mg:IcnJaoI3f\u001b1jM1lM`"));
                sb.append(a10);
                sb.append(this.f3987.getText().toString());
                sb.append(a10);
                sb.append(this.f3959.isChecked());
                sb.append(a10);
                sb.append(this.f3973.isChecked());
                sb.append(a10);
                sb.append(this.f3989.isChecked() ? this.f3982 : Crypt.a(Crypt.xrc("Ae:MdhKa>\u001cbg\u001cd:Ogf\u00190kAkjKbm\u0019ajHa")));
                sb.append(a10);
                sb.append(this.f3954.isChecked());
                sb.append(a10);
                sb.append((Object) this.f4004.getText());
                sb.append(a10);
                sb.append(this.f3998);
                sb.append(a10);
                sb.append(this.f3985.isChecked());
                sb.append(a10);
                sb.append(this.f3984.isChecked());
                sb.append(a10);
                sb.append(this.f3963);
                sb.append(a10);
                sb.append(this.f3991);
                sb.append(a10);
                sb.append(this.f3983.getText().toString());
                sb.append(a10);
                sb.append(App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u001bcf\u001edgA0l\u001ddjOfi\u001c7k\u001djn\u001dcn\u0019k9\u001c7l\u001dd")), true));
                sb.append(a10);
                sb.append(this.f4000.getText().toString());
                sb.append(a10);
                sb.append(this.f3951.isChecked());
                sb.append(a10);
                sb.append(this.f3960.isChecked());
                sb.append(a10);
                sb.append((Object) this.f3972.getText());
                sb.append(a10);
                sb.append((Object) this.f3980.getText());
                sb.append(a10);
                sb.append(this.f3996.isChecked());
                sb.append(a10);
                sb.append(i);
                sb.append(a10);
                sb.append(this.f3976.isChecked());
                sb.append(a10);
                sb.append((Object) this.f3965.getText());
                sb.append(a10);
                sb.append(this.f3974.isChecked());
                sb.append(a10);
                if (this.f4003.isChecked()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(App.f3762.getString(Crypt.a(Crypt.xrc("H0f\u001ae9Oe:N6:\u001djm\u001cknMaiMjgId;N7k\u001e4")), ""));
                    String a11 = Crypt.a(Crypt.xrc("J0:\u001acm\u001aa=\u001bkkO6kK7n\u001bdn\u001c6=Aa;La:A3"));
                    sb2.append(a11);
                    sb2.append(App.f3762.getString(Crypt.a(Crypt.xrc("M0nN3:@3mAeo\u001ed:O0>Idf\u001cg<Hfm\u001dg=H3:Mj>\u001e7gLgnI`l\u001bamA4jH4<N3<Hf<H7iO")), ""));
                    sb2.append(a11);
                    sb2.append(App.f3762.getString(Crypt.a(Crypt.xrc("KfkJjl\u001cd>\u001c4kI1h\u001d3fJc:Kki\u001behM7=\u001e6")), ""));
                    str = sb2.toString();
                }
                sb.append(str);
                sb.append(a10);
                sb.append(App.f3762.getBoolean(Crypt.a(Crypt.xrc("\u001a3h\u001ado@6iAch\u001bbl\u001ab>Oa9Lj:Je;\u0019jfK3")), false));
                sb.append(a10);
                sb.append(string);
                this.f3968 = sb.toString();
                C2098.m4191(this.f3992, App.f3762.edit(), Crypt.a(Crypt.xrc("MakJ3nIkk\u001eb:A3<\u001adnO0fJ`oLfj\u001bg:\u001ed")));
                if (this.f3988.isEmpty()) {
                    m1654(Crypt.a(Crypt.xrc("\u00197<K1m\u001eahHb9J4j\u001e1:Hk=H1o@a:O0gIfkMclA6nK6:OagJ0:Nfo\u001cfh\u001cch\u001ea<@3=\u001c")), -65536);
                    return;
                }
                this.f3948 = new File(Environment.getExternalStorageDirectory() + File.separator + getString(2131820626));
                this.f3969 = new File(Environment.getExternalStoragePublicDirectory(getString(2131820626)), C2098.m4198(new StringBuilder(), this.f3988, Crypt.a(Crypt.xrc("\u001b3;M`iM0n@1j\u001df=O6iK7:M1gAj;Ib<\u0019g"))));
                String a12 = Crypt.a(Crypt.xrc("\u001d7jN6;\u0019elM6m\u00190mNa=I`l\u00196<\u001da<\u001b09\u001ck:JjoH6n\u001cc:HemN1:\u0019g9Jcn\u001c1l\u001c`=K`>M`n\u001dd=\u001e4oL7;JboLff\u00193l\u001ekkLbn\u001c7=K`="));
                this.f4001 = C1067.m2407(this, a12) != 0;
                String a13 = Crypt.a(Crypt.xrc("\u001d7jN6;\u0019elM6m\u00190mNa=I`l\u00196<\u001da<\u001b09\u001ckfL1h\u001abj\u001cb>J3;\u001b0>HffN`o\u001c1=Kj9\u001b4k@kfIk>M1:\u001denJgmAbfO6nId>M09MdhN6j"));
                boolean z2 = C1067.m2407(this, a13) != 0;
                this.f3955 = z2;
                if (Build.VERSION.SDK_INT >= 23 && (this.f4001 || z2)) {
                    requestPermissions(new String[]{a13, a12}, 1921);
                    return;
                }
                if (!this.f3948.exists() && !this.f3948.mkdirs()) {
                    throw new RuntimeException(Crypt.a(Crypt.xrc("@jnNgn\u001d4>\u001b7=\u0019c=Ak<J1l\u001ek<I`mLejI4gK3oOeoLk9Hk=\u001a69Lc<\u001e6:\u001d3jH0i\u001a3>\u001c")));
                }
                try {
                    if (!this.f3969.exists()) {
                        if (!this.f3969.createNewFile()) {
                            throw new RuntimeException(Crypt.a(Crypt.xrc("\u001ebgO3i\u001a`;\u001bko\u001aj9Nd;Oao\u001a6h\u001b6kN3>Kk;IejN0nOjlN0=I4lO7j\u001abh\u001c3;\u001e4h\u001cf;\u0019")));
                        }
                        ((C1216) App.f3760).m2760(this.f3969, this.f3968);
                        m1654(String.format(getString(2131821330), this.f3969), -256);
                        setResult(-1);
                        finish();
                        return;
                    }
                    DialogInterfaceC1343.C1344 c1344 = new DialogInterfaceC1343.C1344(this, 2131886321);
                    String a14 = Crypt.a(Crypt.xrc("\u0019k:\u00197o\u001dklLafL`f\u001ae:LjoJfg\u001939O6;\u001dk"));
                    AlertController.C0038 c0038 = c1344.f6452;
                    c0038.f174 = a14;
                    c0038.f172 = Crypt.a(Crypt.xrc("\u001e7=Ial\u001c3iM1mNf=H1g\u0019cfI3>JegOklKgmJ7=\u001d3=@6=@djIb<\u001eb9\u001cjnL4>NajNdiH"));
                    c0038.f177 = false;
                    String a15 = Crypt.a(Crypt.xrc("J0o@flIc=I1<N6mAe=Hao\u001dj;Hk9\u001d7hL0"));
                    DialogInterfaceOnClickListenerC0550 dialogInterfaceOnClickListenerC0550 = new DialogInterfaceOnClickListenerC0550();
                    c0038.f162 = a15;
                    c0038.f160 = dialogInterfaceOnClickListenerC0550;
                    String a16 = Crypt.a(Crypt.xrc("M6gJd:O3iAeiJ6hH3lOfmIaoJ`n\u001a`h\u001e7"));
                    DialogInterfaceOnClickListenerC0542 dialogInterfaceOnClickListenerC0542 = new DialogInterfaceOnClickListenerC0542(this);
                    c0038.f176 = a16;
                    c0038.f163 = dialogInterfaceOnClickListenerC0542;
                    c1344.m3032();
                    return;
                } catch (Exception unused3) {
                    m1654(getString(2131820808), -65536);
                    return;
                }
            case 2131296440:
                finish();
                return;
            default:
                return;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131492899);
        this.f3962 = (LinearLayout) findViewById(2131296617);
        this.f3978 = (LinearLayout) findViewById(2131296618);
        this.f3994 = (LinearLayout) findViewById(2131296616);
        this.f3975 = (LinearLayout) findViewById(2131296619);
        this.f3977 = (LinearLayout) findViewById(2131296612);
        this.f3950 = (TextView) findViewById(2131296704);
        this.f3995 = (TextView) findViewById(2131296914);
        m1650();
        this.f3997 = (ImageView) findViewById(2131296440);
        this.f3990 = (EditText) findViewById(2131296878);
        this.f3987 = (EditText) findViewById(2131296880);
        this.f3964 = (EditText) findViewById(2131296881);
        this.f3983 = (EditText) findViewById(2131296882);
        this.f4000 = (EditText) findViewById(2131296866);
        this.f3956 = (EditText) findViewById(2131296869);
        this.f3951 = (CheckBox) findViewById(2131296412);
        this.f3959 = (CheckBox) findViewById(2131296411);
        this.f3973 = (CheckBox) findViewById(2131296416);
        this.f3974 = (CheckBox) findViewById(2131296394);
        this.f4003 = (CheckBox) findViewById(2131296396);
        CheckBox checkBox = (CheckBox) findViewById(2131296397);
        this.f3992 = checkBox;
        checkBox.setVisibility(8);
        this.f3989 = (CheckBox) findViewById(2131296409);
        this.f3954 = (CheckBox) findViewById(2131296414);
        this.f3960 = (CheckBox) findViewById(2131296410);
        this.f3976 = (CheckBox) findViewById(2131296395);
        this.f3985 = (CheckBox) findViewById(2131296408);
        this.f3984 = (CheckBox) findViewById(2131296415);
        this.f3996 = (CheckBox) findViewById(2131296413);
        this.f3986 = (TextInputLayout) findViewById(2131296740);
        this.f3999 = (TextInputLayout) findViewById(2131296703);
        this.f3961 = (TextInputLayout) findViewById(2131296583);
        this.f3957 = (TextInputLayout) findViewById(2131296728);
        this.f3952 = (TextInputLayout) findViewById(2131296875);
        this.f3980 = (EditText) findViewById(2131296739);
        this.f4004 = (EditText) findViewById(2131296702);
        this.f3972 = (EditText) findViewById(2131296582);
        this.f3965 = (EditText) findViewById(2131296727);
        this.f3971 = (Button) findViewById(2131296382);
        this.f3949 = (Button) findViewById(2131296388);
        this.f3970 = (Button) findViewById(2131296386);
        this.f3981 = (Button) findViewById(2131296384);
        this.f3966 = (Button) findViewById(2131296383);
        this.f3997.setOnClickListener(this);
        this.f3971.setOnClickListener(this);
        this.f3949.setOnClickListener(this);
        this.f3970.setOnClickListener(this);
        this.f3981.setOnClickListener(this);
        this.f3966.setOnClickListener(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        App.f3762.edit().putString(Crypt.a(Crypt.xrc("\u001cj>\u001a0=\u001d3iKdmLjmNkkNbjAdkKahO0;\u001b7")), this.f3980.getText().toString()).apply();
        App.f3762.edit().putString(Crypt.a(Crypt.xrc("@gk\u0019agM3oM6iHcj\u001aei@`fL7jA1n\u001ejo\u001af")), this.f4004.getText().toString()).apply();
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
            if (!this.f3948.exists() && !this.f3948.mkdirs()) {
                throw new RuntimeException(Crypt.a(Crypt.xrc("@jnNgn\u001d4>\u001b7=\u0019c=Ak<J1l\u001ek<I`mLejI4gK3oOeoLk9Hk=\u001a69Lc<\u001e6:\u001d3jH0i\u001a3>\u001c")));
            }
            try {
                if (!this.f3969.exists()) {
                    if (!this.f3969.createNewFile()) {
                        throw new RuntimeException(Crypt.a(Crypt.xrc("\u001ebgO3i\u001a`;\u001bko\u001aj9Nd;Oao\u001a6h\u001b6kN3>Kk;IejN0nOjlN0=I4lO7j\u001abh\u001c3;\u001e4h\u001cf;\u0019")));
                    }
                    ((C1216) App.f3760).m2760(this.f3969, this.f3968);
                    m1654(String.format(getString(2131821330), this.f3969), -256);
                    setResult(-1);
                    finish();
                    return;
                }
                DialogInterfaceC1343.C1344 c1344 = new DialogInterfaceC1343.C1344(this, 2131886321);
                String a = Crypt.a(Crypt.xrc("\u0019k:\u00197o\u001dklLafL`f\u001ae:LjoJfg\u001939O6;\u001dk"));
                AlertController.C0038 c0038 = c1344.f6452;
                c0038.f174 = a;
                c0038.f172 = Crypt.a(Crypt.xrc("\u001e7=Ial\u001c3iM1mNf=H1g\u0019cfI3>JegOklKgmJ7=\u001d3=@6=@djIb<\u001eb9\u001cjnL4>NajNdiH"));
                c0038.f177 = false;
                String a2 = Crypt.a(Crypt.xrc("J0o@flIc=I1<N6mAe=Hao\u001dj;Hk9\u001d7hL0"));
                DialogInterfaceOnClickListenerC0548 dialogInterfaceOnClickListenerC0548 = new DialogInterfaceOnClickListenerC0548();
                c0038.f162 = a2;
                c0038.f160 = dialogInterfaceOnClickListenerC0548;
                String a3 = Crypt.a(Crypt.xrc("M6gJd:O3iAeiJ6hH3lOfmIaoJ`n\u001a`h\u001e7"));
                DialogInterfaceOnClickListenerC0546 dialogInterfaceOnClickListenerC0546 = new DialogInterfaceOnClickListenerC0546(this);
                c0038.f176 = a3;
                c0038.f163 = dialogInterfaceOnClickListenerC0546;
                c1344.m3032();
                return;
            } catch (Exception unused) {
                i2 = 2131820808;
            }
        }
        m1654(getString(i2), -65536);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f3980.setText(App.f3762.getString(Crypt.a(Crypt.xrc("\u001cj>\u001a0=\u001d3iKdmLjmNkkNbjAdkKahO0;\u001b7")), ""));
        this.f4004.setText(App.f3762.getString(Crypt.a(Crypt.xrc("@gk\u0019agM3oM6iHcj\u001aei@`fL7jA1n\u001ejo\u001af")), ""));
        if (getIntent().getExtras() != null) {
            String string = getIntent().getExtras().getString(Crypt.a(Crypt.xrc("NdmJ4h\u0019`iHdlAdm\u001cchOfoJggKdf\u001d7<Ij")));
            this.f3967 = string;
            if (string.equals(Crypt.a(Crypt.xrc("KjmA6hM7>JjkA`nH3=\u001bj<Lan\u001b6mKfh\u00190")))) {
                this.f3995.setText(Crypt.a(Crypt.xrc("\u001a`>@1m@gf\u001d`9@jlO7m\u0019f=\u001e6nL1i\u001a3nOj")));
                this.f3962.setVisibility(8);
                this.f3978.setVisibility(0);
                this.f3994.setVisibility(8);
                this.f3975.setVisibility(8);
                this.f3977.setVisibility(8);
            } else if (this.f3967.equals(Crypt.a(Crypt.xrc("Id>Agh\u001eb:\u001dk9Mf:Jgi@c9\u001bflI7kJdl\u0019f")))) {
                m1650();
            } else if (this.f3967.equals(Crypt.a(Crypt.xrc("M`i\u001b7nNkmN0kOemM3>O0hHjk\u001d4l@4iOf")))) {
                m1653();
            } else {
                this.f3995.setText(Crypt.a(Crypt.xrc("L0nNknIbkH0jJgnAjj\u001beoAjmHa<\u001dgiHa")));
                this.f3962.setVisibility(8);
                this.f3978.setVisibility(8);
                this.f3994.setVisibility(8);
                this.f3975.setVisibility(0);
                this.f3977.setVisibility(8);
            }
        }
        try {
            m1651(((C1216) App.f3760).m2739());
        } catch (Exception unused) {
        }
        this.f3954.setOnCheckedChangeListener(new C0539());
        this.f3960.setOnCheckedChangeListener(new C0537());
        this.f3976.setOnCheckedChangeListener(new C0552());
        this.f3959.setOnCheckedChangeListener(new C0540());
        this.f3951.setOnCheckedChangeListener(new C0553());
        this.f3984.setOnCheckedChangeListener(new C0547());
        this.f3985.setOnCheckedChangeListener(new C0549());
        this.f3973.setOnCheckedChangeListener(new C0551());
        this.f3974.setOnCheckedChangeListener(new C0541());
        this.f3989.setOnCheckedChangeListener(new C0543());
        this.f3996.setOnCheckedChangeListener(new C0538());
    }

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public final void m1650() {
        this.f3995.setText(Crypt.a(Crypt.xrc("I`gH1iNclI6j\u001efoK1;K`jAjo\u001e6lKj<Ib")));
        this.f3962.setVisibility(0);
        this.f3978.setVisibility(8);
        this.f3994.setVisibility(8);
        this.f3975.setVisibility(8);
        this.f3977.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x042d, code lost:
    
        if (team.dev.epro.apkcustom.App.f3762.getString(r8, r9).trim().equals(r9) == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0300, code lost:
    
        if (team.dev.epro.apkcustom.App.f3762.getString(r8, r9).trim().equals(r9) == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x042f, code lost:
    
        r14.f4000.setText(team.dev.epro.apkcustom.App.f3762.getString(r8, r9));
     */
    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1651(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 1299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: team.dev.epro.apkcustom.dialogs.RequestBlock.m1651(java.lang.String):void");
    }

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public final void m1652() {
        this.f3953 = true;
        this.f3995.setText(Crypt.a(Crypt.xrc("\u001c3lAj<L4o\u001de9\u0019e;La=\u001d7hK39HkoM`:\u001e0")));
        this.f3962.setVisibility(8);
        this.f3978.setVisibility(8);
        this.f3994.setVisibility(0);
        this.f3975.setVisibility(8);
        this.f3977.setVisibility(8);
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public final void m1653() {
        this.f3995.setText(Crypt.a(Crypt.xrc("H0:Lej\u0019e=\u001agf\u001ddiI0<Nkh@bnAd:KffId")));
        this.f3962.setVisibility(8);
        this.f3978.setVisibility(8);
        this.f3994.setVisibility(8);
        this.f3975.setVisibility(8);
        this.f3977.setVisibility(0);
    }

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public final void m1654(String str, int i) {
        ((C1216) App.f3760).m2790(str, i);
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public final void m1655() {
        App.f3762.edit().putString(new String(((C1216) App.f3760).m2772(5, 1)), this.f3993).commit();
        if (!this.f3953) {
            App.f3762.edit().putString(new String(((C1216) App.f3760).m2772(5, 2)), this.f3958).apply();
        }
        App.f3762.edit().putString(Crypt.a(Crypt.xrc("\u001d6o\u001cgmJ6h\u001ce>\u001eb>\u0019jlAc:\u001b`mN1=J4h\u001cb")), this.f3979).commit();
    }
}
