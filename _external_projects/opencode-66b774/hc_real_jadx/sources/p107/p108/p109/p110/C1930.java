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

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1930 implements WifiP2pManager.ActionListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ MainActivity f8413;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f8414;

    public C1930(MainActivity mainActivity, boolean z) {
        this.f8413 = mainActivity;
        this.f8414 = z;
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
    public void onFailure(int i) {
        int i2 = Build.VERSION.SDK_INT;
        String a = Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"));
        String a2 = Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"));
        if (i2 >= 21 && !((WifiManager) this.f8413.getApplicationContext().getSystemService(Crypt.a(Crypt.xrc("Hfk@gfIgiMj;Oj>LfoI1mJgoKb:H`lO7")))).isP2pSupported()) {
            if (!((C1216) App.f3760).m2714(this.f8413)) {
                String str = MainActivity.f3765;
                String str2 = MainActivity.f3765;
                StringBuilder m4207 = C2098.m4207(a2);
                m4207.append(new SimpleDateFormat(a, Locale.getDefault()).format(new Date()));
                m4207.append(Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019g9\u001a1fL6g@0<I0i\u001ad:\u001ejmMei\u001dd>\u0019foAjf\u001b0iA0fObi@c9@1>\u001ed=\u001d7g\u001e3<\u001eg9\u001e7:K4lKb>H4n\u0019a<\u001cb<Lcf\u001bb=\u001a7l\u0019joL6:LalLe<\u001c7j\u001e69I09Kf:@79\u001a7<\u001cd;JkiOgk\u001delH")));
                C1687.m3697(str2, m4207.toString());
                return;
            }
        }
        if (!this.f8414) {
            String str3 = MainActivity.f3765;
            String str4 = MainActivity.f3765;
            StringBuilder m42072 = C2098.m4207(a2);
            C2098.m4199(new SimpleDateFormat(a, Locale.getDefault()), m42072, Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019g9NakLa>@boOd9\u001b3:Jjo\u001dbo@`9\u001e7oJkf\u001dbk\u001bbjLjl\u001a7fIaoM1i\u001b6gN0;JggM1hJkl")));
            m42072.append(MainActivity.m1606(this.f8413, i));
            C1687.m3697(str4, m42072.toString());
        }
        C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("\u0019a=\u0019`m\u00196g\u001ck<\u0019e;\u001bkkAc=\u001ef>I3j\u001d4mKa")), false);
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
    public void onSuccess() {
        C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("@ef@1:\u001c6gK0jAcmAbg\u001c0>Ifo\u001adhO1l\u0019anOj=\u0019fo\u001eeiN1mL7;\u001b1=\u001a4o\u001c3g@foH`9H")), false);
        String str = MainActivity.f3765;
        String str2 = MainActivity.f3765;
        StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
        m4207.append(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()).format(new Date()));
        m4207.append(Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019gg\u001b4oKeo\u001edl@g;Ico\u0019bm\u001ac:\u001b1>\u001a3<K1>\u001c`i\u001d1<O3:Lb>\u0019g:HghIjlAj<Jd>Mk:\u0019e9")));
        C1687.m3697(str2, m4207.toString());
    }
}
