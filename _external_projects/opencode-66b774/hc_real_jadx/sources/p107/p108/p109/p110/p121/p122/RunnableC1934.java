package p107.p108.p109.p110.p121.p122;

import android.content.pm.PackageManager;
import android.net.DhcpInfo;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.net.InetAddress;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;
import org.bugs4u.proxyserver.core.Tun2Socks;
import p010.p011.p012.p013.C0749;
import p010.p011.p012.p013.C0770;
import p034.p050.p053.C1216;
import p034.p095.C1687;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;
import team.dev.epro.apkcustom.sockets.socks.SocksVPNService;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.へぬ〴づぞ.〳ぜぞぜべっ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1934 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ SocksVPNService f8427;

    public RunnableC1934(SocksVPNService socksVPNService, DhcpInfo dhcpInfo) {
        this.f8427 = socksVPNService;
    }

    @Override // java.lang.Runnable
    public void run() {
        String a = Crypt.a(Crypt.xrc("I4fN`gL1mJc9I3;\u001c3:\u001d49MfgI`lO4nMf"));
        String a2 = Crypt.a(Crypt.xrc("Lb:\u001b`m\u00194=JjkHbiHdhI3kMem\u001dko\u001ag9Ag"));
        try {
            String m2730 = ((C1216) App.f3760).m2730();
            int m2757 = ((C1216) App.f3760).m2757(m2730);
            String m2709 = ((C1216) App.f3760).m2709(m2730);
            SocksVPNService socksVPNService = this.f8427;
            socksVPNService.f4106.setSession(socksVPNService.f4104);
            SocksVPNService socksVPNService2 = this.f8427;
            socksVPNService2.f4106.setConfigureIntent(socksVPNService2.m1700());
            this.f8427.f4106.setMtu(1500);
            this.f8427.f4106.addAddress(m2730, m2757);
            this.f8427.f4106.addDnsServer(a2);
            this.f8427.f4106.addDnsServer(a);
            this.f8427.f4105.f4931.add(new C0770.C0771(new C0749(a2, 32), true));
            this.f8427.f4105.f4931.add(new C0770.C0771(new C0749(a, 32), true));
            this.f8427.f4105.f4931.add(new C0770.C0771(new C0749(Crypt.a(Crypt.xrc("\u001b0mM6:L0fKe>KcmM1l\u0019jnN1kMkhI6<\u001af")), 0), true));
            this.f8427.f4105.f4931.add(new C0770.C0771(new C0749(Crypt.a(Crypt.xrc("JjoLdjMdkI3nL3=\u001e7g\u001aalNe<\u001c`m\u001c6>I4")), 8), false));
            this.f8427.f4105.f4931.add(new C0770.C0771(new C0749(Crypt.a(Crypt.xrc("K4k@1;NboOemH0l\u001eemOei\u00191gKcg\u001e4gJa")), 12), false));
            this.f8427.f4105.f4931.add(new C0770.C0771(new C0749(Crypt.a(Crypt.xrc("\u00197o\u001ea:\u001bd9Nkg\u0019fl@go\u001eef@c=I4f\u001c`g\u001c3")), 16), false));
            String str = this.f8427.f4103;
            if (str != null) {
                this.f8427.f4105.f4931.add(new C0770.C0771(new C0749(InetAddress.getByName(str.trim()).getHostAddress(), 32), false));
            }
            Iterator it = ((Vector) this.f8427.f4105.m2079()).iterator();
            while (it.hasNext()) {
                C0770.C0771 c0771 = (C0770.C0771) it.next();
                try {
                    this.f8427.f4106.addRoute(c0771.m2083(), c0771.f4934);
                } catch (IllegalArgumentException unused) {
                }
            }
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    SocksVPNService socksVPNService3 = this.f8427;
                    socksVPNService3.f4106.addDisallowedApplication(socksVPNService3.getPackageName());
                } catch (PackageManager.NameNotFoundException unused2) {
                }
            }
            SocksVPNService socksVPNService4 = this.f8427;
            socksVPNService4.f4107 = socksVPNService4.f4106.establish();
            SocksVPNService socksVPNService5 = this.f8427;
            ParcelFileDescriptor parcelFileDescriptor = socksVPNService5.f4107;
            String a3 = Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"));
            String a4 = Crypt.a(Crypt.xrc("O79A6hKcf\u001b3lA3f\u00194gJji\u0019km@0oJ3=O4"));
            if (parcelFileDescriptor == null) {
                socksVPNService5.m1699();
                C1687.m3697(a4, a3 + this.f8427.f4100.format(new Date()) + "] <font color=#FF0000>VPNService can't establish, any 2 ways to fix it choose one of both");
                C1687.m3697(a4, a3 + this.f8427.f4100.format(new Date()) + Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019gk\u001eb9KjgAbk\u001akoOaf\u001cjoMgoH3k\u001d3h\u0019jl\u001ce:O4nNcn\u001adg\u001afhI4i\u001dcgMbhA7hM1m\u001e1h")));
                C1687.m3697(a4, a3 + this.f8427.f4100.format(new Date()) + Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019g:N4l\u001d1fI1>N4n\u0019ah\u001bbfAcgL7h\u001eai\u001c`>\u001ek>A6i\u001c3m\u001dj;\u001c`mKcmKk>\u001ae;\u001cdi\u001defJ`fH4h\u001c7iM6j\u001c`n@d=\u0019ah\u001def\u0019d:\u001b7f\u001979\u001akhNc9L6mN3lH6h@ci\u001c6:@`<\u001d3l\u00191lM`=\u001b0:Le<OakKkj\u001b7;\u001e3gIkjMbmAa:M`9\u001c0i\u001cfkK3;Odo\u001e7jLa<\u001agn\u00193h\u001a3mMk9Ajn\u001ad")));
            } else {
                C1687.m3666(a4, a3 + this.f8427.f4100.format(new Date()) + Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019ggH3hL6=@fgJkh\u001aan@jjAehO1>Keh\u001e0:\u001e")) + this.f8427.getString(2131820606));
                ((C1216) App.f3760).m2777(SSHTunnelService.f4040 + Crypt.a(Crypt.xrc("Ofl\u0019c>L6>I`iMe<\u001c1=M0<\u001e4l\u001ec<K1lH7oMem\u001d1kMagO4>\u001cdmA7>Jdo\u0019k<\u001eb:\u001benM6fLalM0i@3:Ma<Afk\u001dfmMe>\u001b1<\u001d3>@kj")) + SSHTunnelService.f4033 + Crypt.a(Crypt.xrc("\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd")) + SSHTunnelService.f4037);
                Tun2Socks.Start(this.f8427.f4107, 1500, m2709, Crypt.a(Crypt.xrc("\u001dcmM3k\u001a1i\u001d3n\u001d7:Of>Odi\u001b4g@afO6hJ7")), Crypt.a(Crypt.xrc("\u001ajfAb=@`<M6<\u001c6nO`f\u001bcn\u001b4m@`;Kj;Jb")), m2730 + Crypt.a(Crypt.xrc("A7kJflAc9Keh\u001afmHa;\u0019c9A49OgjJgiJj")), Crypt.a(Crypt.xrc("\u001ajfAb=@`<M6<\u001c6nO`f\u001bcn\u001b4m@`;Kj;Jb")), true);
            }
        } catch (Exception unused3) {
        } catch (Throwable th) {
            Locale.setDefault(this.f8427.f4102);
            throw th;
        }
        Locale.setDefault(this.f8427.f4102);
    }
}
