package p107.p108.p109.p110.p121.p124;

import java.text.SimpleDateFormat;
import java.util.Locale;
import p034.p050.p053.C1216;
import p034.p095.C1687;
import p107.p108.p109.p110.p113.InterfaceC1837;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.sockets.v2ray.V2RayVpnService;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.へぬ〴づぞ.いいにぽつ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1940 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ String[] f8457;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ String[] f8458;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ V2RayVpnService f8459;

    public RunnableC1940(V2RayVpnService v2RayVpnService, String[] strArr, String[] strArr2) {
        this.f8459 = v2RayVpnService;
        this.f8457 = strArr;
        this.f8458 = strArr2;
    }

    @Override // java.lang.Runnable
    public void run() {
        String string = this.f8459.getString(2131820626);
        StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
        C2098.m4199(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()), m4207, Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019glHd<JghA6jKg<\u001dfl\u001d`<A6f\u001adi\u001abn\u001c6;@")));
        String[] strArr = this.f8457;
        m4207.append(strArr.length == 1 ? strArr[0] : strArr[1]);
        m4207.append(Crypt.a(Crypt.xrc("\u001dc<\u001e6:Nch\u001b4>Lf=Ae9Ab<AklOdm\u001d0mO3")));
        String[] strArr2 = this.f8458;
        m4207.append(strArr2.length == 1 ? strArr2[0] : strArr2[1]);
        C1687.m3666(string, m4207.toString());
        InterfaceC1837 interfaceC1837 = App.f3760;
        String[] strArr3 = this.f8457;
        ((C1216) interfaceC1837).m2790(strArr3.length == 1 ? strArr3[0] : strArr3[1], -65536);
    }
}
