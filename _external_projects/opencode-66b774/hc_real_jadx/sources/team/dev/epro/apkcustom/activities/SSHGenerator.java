package team.dev.epro.apkcustom.activities;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p000.C0706;
import p000.C0712;
import p000.p001.C0629;
import p015.p016.p018.AbstractC0788;
import p015.p016.p018.C0799;
import p015.p016.p018.C0801;
import p015.p016.p018.C0827;
import p015.p016.p018.C0828;
import p015.p016.p018.C0830;
import p015.p016.p018.EnumC0802;
import p015.p016.p019.AbstractC0917;
import p015.p016.p019.C0913;
import p015.p016.p019.C0914;
import p015.p016.p019.C0916;
import p015.p016.p020.C0958;
import p034.p050.p053.C1216;
import p034.p095.C1687;
import p131.p135.p137.C1982;
import p131.p135.p137.EnumC1975;
import p131.p135.p137.EnumC1988;
import p131.p135.p138.C1998;
import p131.p135.p142.InterfaceC2023;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class SSHGenerator extends AppCompatActivity implements View.OnClickListener {

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public EditText f3875;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public TextView f3876;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public EditText f3877;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public Button f3878;

    /* renamed from: team.dev.epro.apkcustom.activities.SSHGenerator$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0528 implements InterfaceC2023 {
        public C0528() {
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m1644(C0712 c0712) {
            int i = c0712.f4761;
            if (i >= 200 && i < 300) {
                try {
                    String m1642 = SSHGenerator.m1642(SSHGenerator.this, c0712.f4752.mo1728().mo4866());
                    SSHGenerator.this.f3876.setText(Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(m1642, 0) : Html.fromHtml(m1642), TextView.BufferType.NORMAL);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public static String m1642(SSHGenerator sSHGenerator, String str) {
        AbstractC0788 abstractC0788;
        sSHGenerator.getClass();
        C0799 c0799 = new C0799();
        StringReader stringReader = new StringReader(str);
        C0828 c0828 = new C0828(0, 0);
        C0830 c0830 = C0830.f5153;
        c0799.f5147 = new C0958("");
        c0799.f5143 = c0830;
        c0799.f5148 = new C0827(stringReader, 32768);
        c0799.f5145 = c0828;
        c0799.f5150 = null;
        c0799.f5144 = new C0801(c0799.f5148, c0828);
        c0799.f5151 = new ArrayList<>(32);
        c0799.f5149 = "";
        c0799.f5055 = EnumC0802.f5093;
        c0799.f5051 = null;
        c0799.f5052 = false;
        c0799.f5054 = null;
        c0799.f5047 = null;
        c0799.f5045 = new ArrayList<>();
        c0799.f5046 = new ArrayList();
        c0799.f5050 = new AbstractC0788.C0791();
        c0799.f5053 = true;
        c0799.f5048 = false;
        do {
            C0801 c0801 = c0799.f5144;
            while (!c0801.f5084) {
                c0801.f5082.mo2235(c0801, c0801.f5083);
            }
            if (c0801.f5077.length() > 0) {
                String sb = c0801.f5077.toString();
                StringBuilder sb2 = c0801.f5077;
                sb2.delete(0, sb2.length());
                c0801.f5086 = null;
                AbstractC0788.C0793 c0793 = c0801.f5085;
                c0793.f5022 = sb;
                abstractC0788 = c0793;
            } else {
                String str2 = c0801.f5086;
                if (str2 != null) {
                    AbstractC0788.C0793 c07932 = c0801.f5085;
                    c07932.f5022 = str2;
                    c0801.f5086 = null;
                    abstractC0788 = c07932;
                } else {
                    c0801.f5084 = false;
                    abstractC0788 = c0801.f5088;
                }
            }
            c0799.mo2135(abstractC0788);
            abstractC0788.mo2117();
        } while (abstractC0788.f5014 != AbstractC0788.EnumC0792.EOF);
        C0958 c0958 = c0799.f5147;
        String a = Crypt.a(Crypt.xrc("Nk9Ka9J6iJcmI0:Hc>Kk:\u001d0fN0i@0o\u0019c"));
        c0958.getClass();
        C1687.m3654(a);
        AbstractC0917 m2242 = C0916.m2242(a);
        C1687.m3701(m2242);
        C1687.m3701(c0958);
        C0913 c0913 = new C0913();
        C1687.m3698(new C0914(c0958, c0913, m2242), c0958);
        String trim = (c0913.isEmpty() ? null : c0913.get(0)).m2304().trim();
        if (trim.equalsIgnoreCase(Crypt.a(Crypt.xrc("J`kH`l\u0019e:\u001dbl\u001bbh\u001cd;Nf;OalKgjN19Jj")))) {
            trim = Crypt.a(Crypt.xrc("\u0019dmJcjNg:Kgj@goA3h\u001b3hO0jJdj\u001b0=\u0019b"));
        }
        if (trim.equalsIgnoreCase(Crypt.a(Crypt.xrc("A3g\u001dboKg:NafK49IchLfkIb>M3i\u001agnHc")))) {
            trim = Crypt.a(Crypt.xrc("Ij;K4l\u001e1mAah\u001da>Njl\u001c7oKc>\u001d3<H4<\u0019jo\u001909K6l\u001ea<J4f\u001b6f\u001a1<AegAf>Ia9HbjAkh\u001a1iMd=K0:@4o\u001939IdiJd=HdiHehN1m"));
        }
        if (trim.equalsIgnoreCase(Crypt.a(Crypt.xrc("N3mH0>Kj9M7;Aeh\u001e4:\u001d0;Ien@6hM0k\u001db")))) {
            trim = Crypt.a(Crypt.xrc("H0j\u001a0g\u001e19\u0019e>Mjk@3l\u001e3iK`;\u0019k>NciJ1o\u001d6l\u001baoJ3iO0nL6o\u001djmJ7l\u001dj:\u001e3kIf=\u001d"));
        }
        if (!trim.equalsIgnoreCase(Crypt.a(Crypt.xrc("@79NdnA7nHelIdl\u001cciM1kLjmH0m\u001b7hK7")))) {
            return trim;
        }
        StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("M0nH0iMdhA1mLbn\u001b6=Hf;\u001d0hJalJcn\u001a0")));
        m4207.append(sSHGenerator.f3875.getText().toString().trim());
        m4207.append(Crypt.a(Crypt.xrc("H1<@a>\u001aalKci\u001ad;JfmOelIjfHalKd>\u001dg")));
        m4207.append(sSHGenerator.f3877.getText().toString().trim());
        m4207.append(Crypt.a(Crypt.xrc("\u001a3nKk;Od;\u001bdj\u001b6oJejK1lN1gM39K3l\u001ag=I3:\u001a0kKkgLchM0kId=@1:MekKg=\u001b`9A7g@dk\u001c3>\u001db;Kjf\u001e49@3fLfj@gnLf:M0m\u001b6>MjkL`>\u001e7fKc;\u001d0l\u001aa>J4g\u001bbm\u00194mL0h\u0019clM19K`:\u001c4:\u001cgi\u001d3=\u001eflO`g\u0019fn\u001bfo\u001ebn\u001ec9IanAbh\u001a6:Nd9@biMa:McgAgf\u001de<\u001dgkJgj\u001akg\u001dfmJ0>Ag>\u001ef>K79OdhK6iK0")));
        return m4207.toString();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            m1643();
        } catch (UnsupportedEncodingException unused) {
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131492902);
        this.f3875 = (EditText) findViewById(2131296526);
        this.f3877 = (EditText) findViewById(2131296525);
        TextView textView = (TextView) findViewById(2131296933);
        this.f3876 = textView;
        textView.setText("");
        Button button = (Button) findViewById(2131296371);
        this.f3878 = button;
        button.setOnClickListener(this);
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public final void m1643() {
        C0706.C0707 c0707 = new C0706.C0707(new C0706());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c0707.m1971(60L, timeUnit);
        String a = Crypt.a(Crypt.xrc("L0>A7mA1f\u001e3nKa=\u00190<L1j\u001bbi@4>KjgJ4"));
        c0707.f4703 = C0629.m1811(a, 60L, timeUnit);
        c0707.f4708 = C0629.m1811(a, 60L, timeUnit);
        C0706 c0706 = new C0706(c0707);
        C1982.C1986 c1986 = new C1982.C1986(new String(((C1216) App.f3760).m2772(6, 0)));
        String trim = this.f3875.getText().toString().trim();
        String a2 = Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"));
        c1986.f8666.put(Crypt.a(Crypt.xrc("Kkl\u001eg9\u001eanIcf\u0019`oH4;\u0019anMboMa:\u0019k<\u001db")), URLEncoder.encode(trim, a2));
        c1986.f8666.put(Crypt.a(Crypt.xrc("H6f@4j\u001ad;LajN4=\u00190j\u001a4o\u001b1kN3:O4;@e")), URLEncoder.encode(this.f3877.getText().toString().trim(), a2));
        c1986.f8666.put(new String(((C1216) App.f3760).m2772(6, 1)), "");
        c1986.f8665 = EnumC1975.MEDIUM;
        c1986.f8669 = c0706;
        C1982 c1982 = new C1982(c1986);
        C0528 c0528 = new C0528();
        c1982.f8621 = EnumC1988.OK_HTTP_RESPONSE;
        c1982.f8637 = c0528;
        C1998.m4107().m4108(c1982);
    }
}
