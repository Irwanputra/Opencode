package p107.p108.p109.p110;

import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p034.p050.p053.C1216;
import p034.p095.C1687;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1864 implements WifiP2pManager.ActionListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ MainActivity f8265;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f8266;

    public C1864(MainActivity mainActivity, boolean z) {
        this.f8265 = mainActivity;
        this.f8266 = z;
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
    public void onFailure(int i) {
        int i2 = Build.VERSION.SDK_INT;
        String a = Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"));
        String a2 = Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"));
        if (i2 >= 21 && !((WifiManager) this.f8265.getApplicationContext().getSystemService(Crypt.a(Crypt.xrc("Hfk@gfIgiMj;Oj>LfoI1mJgoKb:H`lO7")))).isP2pSupported()) {
            if (!((C1216) App.f3760).m2714(this.f8265)) {
                String str = MainActivity.f3765;
                String str2 = MainActivity.f3765;
                StringBuilder m4207 = C2098.m4207(a2);
                m4207.append(new SimpleDateFormat(a, Locale.getDefault()).format(new Date()));
                m4207.append(Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019g9\u001a1fL6g@0<I0i\u001ad:\u001ejmMei\u001dd>\u0019foAjf\u001b0iA0fObi@c9@1>\u001ed=\u001d7g\u001e3<\u001eg9\u001e7:K4lKb>H4n\u0019a<\u001cb<Lcf\u001bb=\u001a7l\u0019joL6:LalLe<\u001c7j\u001e69I09Kf:@79\u001a7<\u001cd;JkiOgk\u001delH")));
                C1687.m3697(str2, m4207.toString());
                return;
            }
        }
        MainActivity.m1609(this.f8265, this.f8266);
        if (!this.f8266) {
            String str3 = MainActivity.f3765;
            String str4 = MainActivity.f3765;
            StringBuilder m42072 = C2098.m4207(a2);
            C2098.m4199(new SimpleDateFormat(a, Locale.getDefault()), m42072, Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019giJji\u001ee>Mbi\u001cc:Jk9\u001c`>\u001c3=\u00190jLfk\u001b1iH6jA6iM6jIe>H`n@klLg>La>\u001cgl\u001c4kK0>")));
            m42072.append(MainActivity.m1606(this.f8265, i));
            m42072.append(Crypt.a(Crypt.xrc("\u0019kj\u001c6l\u00196m\u001eg;\u001c4kO`o\u001a7fKa>J4<\u001afjIelM3<\u001d`>If9Oag@jl@a=Lj>Afo\u001d`fI4f\u0019")));
            C1687.m3697(str4, m42072.toString());
        }
        MainActivity mainActivity = this.f8265;
        mainActivity.f3784 = true;
        mainActivity.f3808 = false;
        C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("\u0019a=\u0019`m\u00196g\u001ck<\u0019e;\u001bkkAc=\u001ef>I3j\u001d4mKa")), false);
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
    public void onSuccess() {
        String a;
        while (true) {
            String trim = ((C1216) App.f3760).m2761().trim();
            a = Crypt.a(Crypt.xrc("HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb"));
            if (!trim.equals(a)) {
                break;
            } else {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                }
            }
        }
        String str = MainActivity.f3765;
        String str2 = MainActivity.f3765;
        String a2 = Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"));
        StringBuilder m4207 = C2098.m4207(a2);
        Locale locale = Locale.getDefault();
        String a3 = Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"));
        m4207.append(new SimpleDateFormat(a3, locale).format(new Date()));
        m4207.append(Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019gg\u001b4oKeo\u001edl@g;Ico\u0019bm\u001ac:\u001b1>\u001a3<K1>\u001c6oM0nAcnI19I1;\u001bkh\u001a7kJcl\u001b`nK3g\u001ej:")));
        C1687.m3697(str2, m4207.toString());
        if (!((C1216) App.f3760).m2761().trim().equals(a)) {
            this.f8265.f3807 = true;
            StringBuilder m42072 = C2098.m4207(a2);
            C2098.m4199(new SimpleDateFormat(a3, Locale.getDefault()), m42072, Crypt.a(Crypt.xrc("Aj9@b9Agl\u00191gM`<K7j\u001bd;\u001aaj@a=Lbn\u001d1o\u001ejmMji\u00191;\u001e7oH6oAfh\u001akj@7iJ1mAgl\u001a")));
            m42072.append(((C1216) App.f3760).m2761());
            m42072.append(Crypt.a(Crypt.xrc("M6i@cg\u0019g<A`k\u0019go\u001abmLe9\u001e6;Men\u001edfO3")));
            m42072.append(7071);
            m42072.append(Crypt.a(Crypt.xrc("N1m\u001bdhNg=N1lN3i\u0019j>\u001d7i\u001cg>AkiAfk\u001ckj\u001afg\u001bfkMcoO4nAg9JfiK7g\u001dg>OflI6k\u001e3g\u001b`jIjn\u001bg:\u001dai\u001d3mOj>Ie:MjlHg=I7o")));
            C1687.m3666(str2, m42072.toString());
        }
        MainActivity mainActivity = this.f8265;
        mainActivity.f3784 = true;
        WifiP2pManager wifiP2pManager = mainActivity.f3766;
        if (wifiP2pManager != null) {
            wifiP2pManager.requestGroupInfo(mainActivity.f3810, new C1865(mainActivity));
        }
        C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("@ef@1:\u001c6gK0jAcmAbg\u001c0>Ifo\u001adhO1l\u0019anOj=\u0019fo\u001eeiN1mL7;\u001b1=\u001a4o\u001c3g@foH`9H")), true);
    }
}
