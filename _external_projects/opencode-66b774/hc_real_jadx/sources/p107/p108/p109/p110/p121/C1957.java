package p107.p108.p109.p110.p121;

import android.content.SharedPreferences;
import android.os.ParcelFileDescriptor;
import java.util.Date;
import org.bugs4u.proxyserver.core.Tun2Socks;
import p034.p095.C1687;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.へぬ〴づぞ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1957 extends Thread {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ SSHTunnelService f8540;

    public C1957(SSHTunnelService sSHTunnelService) {
        this.f8540 = sSHTunnelService;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        ParcelFileDescriptor parcelFileDescriptor;
        String str;
        String m4205;
        String a;
        SharedPreferences sharedPreferences = App.f3762;
        String a2 = Crypt.a(Crypt.xrc("M`i\u001b7nNkmN0kOemM3>O0hHjk\u001d4l@4iOf"));
        String a3 = Crypt.a(Crypt.xrc("Mj=H0gN3;N7oH0:\u001c79\u001c19\u001cfi\u001e19\u001a39Ae"));
        if (!sharedPreferences.getString(a2, a3).trim().isEmpty()) {
            a3 = App.f3762.getString(a2, a3).trim();
        }
        String str2 = SSHTunnelService.f4042;
        String str3 = SSHTunnelService.f4042;
        StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
        m4207.append(this.f8540.f4063.format(new Date()));
        m4207.append(Crypt.a(Crypt.xrc("L4>\u001b0m\u001b7i\u00190oAdi\u0019`lNa:\u001939\u001bdnHc=\u001aj")));
        m4207.append(a3);
        C1687.m3666(str3, m4207.toString());
        this.f8540.f4071.sendEmptyMessage(1);
        Tun2Socks.Stop();
        SSHTunnelService sSHTunnelService = this.f8540;
        if (sSHTunnelService.f4052 == null) {
            sSHTunnelService.m1674();
        }
        boolean z = App.f3762.getBoolean(Crypt.a(Crypt.xrc("Haj\u001beg\u001c`o\u001c3k\u001e`o@`kJ`=Akf\u001dk=\u00197iH7")), false);
        String a4 = Crypt.a(Crypt.xrc("@bj\u001e7=\u001e3kIa9\u001e4;N1l\u001a3mK`f\u001e4fI4j\u001cc"));
        if (z) {
            SSHTunnelService sSHTunnelService2 = this.f8540;
            parcelFileDescriptor = sSHTunnelService2.f4052;
            str = sSHTunnelService2.f4069;
            a = C2098.m4198(new StringBuilder(), this.f8540.f4061, Crypt.a(Crypt.xrc("A7kJflAc9Keh\u001afmHa;\u0019c9A49OgjJgiJj")));
            m4205 = C2098.m4205(a4, a3);
        } else {
            SSHTunnelService sSHTunnelService3 = this.f8540;
            parcelFileDescriptor = sSHTunnelService3.f4052;
            str = sSHTunnelService3.f4069;
            m4205 = C2098.m4205(a4, a3);
            a = Crypt.a(Crypt.xrc("\u001a3>@f:L3jMeg\u001adjJ`fM4j@0o\u001d3f\u001cbjL1"));
        }
        String a5 = Crypt.a(Crypt.xrc("\u001dcmM3k\u001a1i\u001d3n\u001d7:Of>Odi\u001b4g@afO6hJ7"));
        String a6 = Crypt.a(Crypt.xrc("AejKcjNd:LjiJa=I4<\u001c`:Id;A7;N1;Aj"));
        Tun2Socks.Start(parcelFileDescriptor, 1500, str, a5, a6, a, m4205, true);
    }
}
