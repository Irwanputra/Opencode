package p107.p108.p109.p110.p119;

import android.view.View;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p034.p050.p053.C1216;
import p034.p095.C1687;
import p107.p108.p109.p110.p113.C1860;
import p107.p108.p109.p110.p113.InterfaceC1837;
import p107.p108.p109.p110.p113.p114.InterfaceC1838;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1919 implements InterfaceC1838 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ String f8391;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ C1899 f8392;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public String f8393 = "";

    public C1919(C1899 c1899, String str) {
        this.f8392 = c1899;
        this.f8391 = str;
    }

    @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
    /* renamed from: 〺つふすそ */
    public void mo1630() {
        InterfaceC1837 interfaceC1837 = App.f3760;
        StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("H3f\u0019gi\u001b6jJ0h@0o\u0019do\u001bgjIkf\u001a0:\u001c1j\u001ej")));
        String trim = this.f8391.trim();
        String a = Crypt.a(Crypt.xrc("\u001e7=K0o\u0019ffI3lA6l\u001dah\u001e0fJjj\u001ddh\u001af=\u001cc"));
        String str = trim.split(a)[0];
        String a2 = Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"));
        m4207.append(C1860.m3978(str.split(a2)[0]));
        String a3 = Crypt.a(Crypt.xrc("\u001db:NkmN7iOeg\u001e6j\u001bfk\u001ejkOfkIa<OffKc"));
        m4207.append(a3);
        m4207.append(((C1216) App.f3760).m2758());
        String a4 = Crypt.a(Crypt.xrc("\u001b6=\u001d`=L1k\u001cah\u001b`;\u001ca;Oe=\u0019c9M1nIemKe"));
        m4207.append(a4);
        m4207.append(((C1216) App.f3760).m2742());
        this.f8393 = ((C1216) interfaceC1837).m2765(m4207.toString());
        String str2 = C1899.f8349;
        String str3 = C1899.f8349;
        StringBuilder m42072 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
        C2098.m4199(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()), m42072, Crypt.a(Crypt.xrc("H`=M3:\u001d6gLj9Ok>@ai@1=@aiKakOdf\u001e1")));
        m42072.append(C1860.m3978(this.f8391.trim().split(a)[0].split(a2)[0]));
        m42072.append(a3);
        m42072.append(((C1216) App.f3760).m2758());
        m42072.append(a4);
        m42072.append(((C1216) App.f3760).m2742());
        C1687.m3737(str3, m42072.toString());
    }

    @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
    /* renamed from: げつ〴ぬぐ */
    public void mo1631() {
        InterfaceC1837 interfaceC1837;
        View view;
        String m490;
        int i;
        if (this.f8393.isEmpty()) {
            interfaceC1837 = App.f3760;
            C1899 c1899 = this.f8392;
            view = c1899.f1186;
            m490 = c1899.m490(2131821211);
            i = -256;
        } else {
            interfaceC1837 = App.f3760;
            C1899 c18992 = this.f8392;
            view = c18992.f1186;
            m490 = c18992.m490(2131821207);
            i = -65536;
        }
        ((C1216) interfaceC1837).m2766(view, m490, i);
    }
}
