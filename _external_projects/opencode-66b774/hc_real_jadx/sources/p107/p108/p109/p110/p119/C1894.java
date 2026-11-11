package p107.p108.p109.p110.p119;

import android.view.View;
import p010.p011.p012.p013.C0753;
import p034.p050.p053.C1216;
import p107.p108.p109.p110.p113.InterfaceC1837;
import p107.p108.p109.p110.p113.p114.InterfaceC1838;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.てぜきぽく.ぇぬぎばつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1894 implements InterfaceC1838 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ String f8339;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ C1867 f8340;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public String f8341 = "";

    public C1894(C1867 c1867, String str) {
        this.f8340 = c1867;
        this.f8339 = str;
    }

    @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
    /* renamed from: 〺つふすそ */
    public void mo1630() {
        InterfaceC1837 interfaceC1837 = App.f3760;
        String a = Crypt.a(Crypt.xrc("H3f\u0019gi\u001b6jJ0h@0o\u0019do\u001bgjIkf\u001a0:\u001c1j\u001ej"));
        StringBuilder m4207 = C2098.m4207(a);
        String trim = this.f8339.trim();
        String a2 = Crypt.a(Crypt.xrc("\u001e7=K0o\u0019ffI3lA6l\u001dah\u001e0fJjj\u001ddh\u001af=\u001cc"));
        String str = trim.split(a2)[0];
        String a3 = Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"));
        m4207.append(str.split(a3)[0]);
        String a4 = Crypt.a(Crypt.xrc("\u001db:NkmN7iOeg\u001e6j\u001bfk\u001ejkOfkIa<OffKc"));
        m4207.append(a4);
        m4207.append(((C1216) App.f3760).m2758());
        String a5 = Crypt.a(Crypt.xrc("\u001b6=\u001d`=L1k\u001cah\u001b`;\u001ca;Oe=\u0019c9M1nIemKe"));
        m4207.append(a5);
        m4207.append(((C1216) App.f3760).m2742());
        this.f8341 = ((C1216) interfaceC1837).m2765(m4207.toString());
        StringBuilder m42072 = C2098.m4207(a);
        m42072.append(this.f8339.trim().split(a2)[0].split(a3)[0]);
        m42072.append(a4);
        m42072.append(((C1216) App.f3760).m2758());
        m42072.append(a5);
        m42072.append(((C1216) App.f3760).m2742());
        C0753.m2046(m42072.toString());
    }

    @Override // p107.p108.p109.p110.p113.p114.InterfaceC1838
    /* renamed from: げつ〴ぬぐ */
    public void mo1631() {
        InterfaceC1837 interfaceC1837;
        View view;
        String m490;
        int i;
        if (this.f8341.isEmpty()) {
            interfaceC1837 = App.f3760;
            C1867 c1867 = this.f8340;
            view = c1867.f1186;
            m490 = c1867.m490(2131821211);
            i = -256;
        } else {
            interfaceC1837 = App.f3760;
            C1867 c18672 = this.f8340;
            view = c18672.f1186;
            m490 = c18672.m490(2131821207);
            i = -65536;
        }
        ((C1216) interfaceC1837).m2766(view, m490, i);
    }
}
