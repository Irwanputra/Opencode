package p107.p108.p109.p110.p129;

import android.content.Context;
import android.content.res.Resources;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p010.p011.p012.p013.C0753;
import p034.p050.p053.C1216;
import p107.p108.p109.p110.p113.InterfaceC1837;
import p107.p108.p109.p110.p119.C1867;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.models.VPNServer;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぺぁあねじ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1962 extends RecyclerView.AbstractC0228<C1967> {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public View.OnClickListener f8563 = new ViewOnClickListenerC1963();

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public View f8564;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Context f8565;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public List<VPNServer> f8566;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C1867 f8567;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public LayoutInflater f8568;

    /* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぺぁあねじ.くし〴〺ぅ$げつ〴ぬぐ, reason: contains not printable characters */
    public class ViewOnClickListenerC1963 implements View.OnClickListener {
        public ViewOnClickListenerC1963() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            View view2;
            C1216 c1216;
            String a;
            if (C0753.m2042()) {
                InterfaceC1837 interfaceC1837 = App.f3760;
                view2 = C1962.this.f8564;
                c1216 = (C1216) interfaceC1837;
                a = Crypt.a(Crypt.xrc("JagLdj\u001e`mIkgLjm@3j\u00197h@b;@k<A1g\u001bji\u001ddiKk:L3fN`mI`<@j:O`<N09@bo\u0019gf@49\u001cfm@4;Mb>LcjI`n\u001a7m\u001cboMkj\u001e6>\u001ceg"));
            } else {
                if (!SSHTunnelService.f4041 && !SSHTunnelService.f4034 && !SSHTunnelService.f4038) {
                    int m774 = ((C1967) view.getTag()).m774();
                    C1962 c1962 = C1962.this;
                    C1867 c1867 = c1962.f8567;
                    VPNServer vPNServer = c1962.f8566.get(m774);
                    if (c1867.m525() == null) {
                        InterfaceC1837 interfaceC18372 = App.f3760;
                        StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("\u001b6h\u001a7k\u001can@3<J39O3;\u001bkgHb=L4:Hkk\u001dc<\u00196k\u001a`:OcmO`;\u001a7lA7lO7=\u001a`;Mbn\u001acl\u001d")));
                        m4207.append(App.f3759.getString(2131820810));
                        ((C1216) interfaceC18372).m2790(m4207.toString(), -65536);
                        return;
                    }
                    try {
                        byte[] decode = Base64.decode(vPNServer.m1659(), 0);
                        App.f3762.edit().putString(Crypt.a(Crypt.xrc("L1hLclNjiN`n@em\u001b7>Kak\u001c09H6m\u001e6mLj")), new String(decode, Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1")))).commit();
                        boolean m3984 = c1867.m3984(decode);
                        c1867.f8277 = m3984;
                        if (m3984) {
                            ((C1216) App.f3760).m2790(c1867.m504().getString(2131821248, vPNServer.m1657()), -256);
                        }
                    } catch (IOException unused) {
                        ((C1216) App.f3760).m2790(c1867.m490(2131820810), -65536);
                    }
                    c1867.m3982();
                    c1867.f8303.setVisibility(8);
                    C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("O1jMk<\u001ag>\u001b`j@dl@g>\u001d7<M6j\u001e3>HjhO4kM3jId>\u001e`i@0g\u001cemOamA7h\u001a1g@kl\u001e4g\u001c")), true);
                    return;
                }
                InterfaceC1837 interfaceC18373 = App.f3760;
                view2 = C1962.this.f8564;
                c1216 = (C1216) interfaceC18373;
                a = Crypt.a(Crypt.xrc("JagLdj\u001e`mIkgLjm@3j\u00197h@b;@k<A1g\u001bjkHdjNbi\u001d0n@bjAkoA19@7<\u001djoNd9Jak\u00193iAcjAkl\u001d3o\u0019cn\u001ael\u001aj>@bn\u00194k\u00197h\u001c0o"));
            }
            c1216.m2766(view2, a, -65536);
        }
    }

    public C1962(Context context, List<VPNServer> list) {
        this.f8566 = new ArrayList();
        this.f8565 = context;
        this.f8566 = list;
        this.f8568 = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0228
    /* renamed from: げつ〴ぬぐ */
    public int mo888() {
        List<VPNServer> list = this.f8566;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0228
    /* renamed from: づざかべべ */
    public C1967 mo889(ViewGroup viewGroup, int i) {
        View inflate = this.f8568.inflate(2131492945, viewGroup, false);
        this.f8564 = inflate;
        return new C1967(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0228
    /* renamed from: びぐびあび */
    public void mo891(C1967 c1967, int i) {
        long j;
        String format;
        C1967 c19672 = c1967;
        VPNServer vPNServer = this.f8566.get(i);
        try {
            j = Long.parseLong(vPNServer.m1661());
        } catch (NumberFormatException unused) {
            j = 0;
        }
        c19672.f8582.setText(vPNServer.m1657());
        c19672.f8583.setText(vPNServer.m1660());
        TextView textView = c19672.f8578;
        if (j < 1024) {
            format = j + Crypt.a(Crypt.xrc("\u001cj9@giMefJf>Kbf\u001djjL1;\u001cc9Nag\u001bgm\u001b6"));
        } else {
            double d = j;
            double d2 = 1024;
            int log = (int) (Math.log(d) / Math.log(d2));
            String str = Crypt.a(Crypt.xrc("H`;\u001eg<\u001d3fLjf\u0019jn@4nN1;\u001bgo\u0019anJ4<Hd")).charAt(log - 1) + "";
            double pow = Math.pow(d2, log);
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d);
            format = String.format(Crypt.a(Crypt.xrc("\u001af9\u001bjhK1>@7j\u001bkfMbjA79K4oK1iI0=\u001ba")), Double.valueOf(d / pow), str);
        }
        textView.setText(format);
        c19672.f8579.setText(vPNServer.m1658().toUpperCase(Locale.getDefault()));
        ImageView imageView = c19672.f8581;
        Resources resources = this.f8565.getResources();
        StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("@0;\u001e0:Ik;\u001dkgN6fI3j\u00194;\u0019f:@af@c>Jk")));
        m4207.append(vPNServer.m1656().toLowerCase());
        imageView.setImageResource(resources.getIdentifier(m4207.toString(), Crypt.a(Crypt.xrc("MdhI`j\u0019ak\u001dbh\u0019am\u00190gK1=\u001b7f\u00190i\u001b1;\u00197")), this.f8565.getPackageName()));
        c19672.f8580.setOnClickListener(this.f8563);
        c19672.f8580.setTag(c19672);
    }
}
