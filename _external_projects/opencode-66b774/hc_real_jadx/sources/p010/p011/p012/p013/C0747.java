package p010.p011.p012.p013;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.Locale;
import p131.p155.p156.p157.C2098;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0747 implements Serializable, Cloneable {

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean f4850;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public String f4845 = Crypt.a(Crypt.xrc("\u001dboM`iLglM4l\u001djfIfmJ3gKgj\u001b3<Ob>\u001ba=Mc:N0:J0g\u001ajj\u001ck=A4o@6o\u001bbi\u0019gg\u001d0mO"));

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public String f4848 = Crypt.a(Crypt.xrc("@1oLg;O4n@ekO`:L1;\u001cc=N`;OkgAgfNk"));

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean f4853 = true;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public String f4849 = "";

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f4851 = false;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f4846 = true;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f4844 = 0;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public EnumC0748 f4855 = EnumC0748.f4857;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public String f4847 = Crypt.a(Crypt.xrc("\u001b`i@39O1=\u001cjm@39\u0019j>\u001ce=L`n\u001c7;MdfI7gNkk\u001bbjJ49N7i\u001edgA7f\u0019ej\u001cam\u0019el\u001a7<K"));

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public String f4856 = Crypt.a(Crypt.xrc("Ag:\u001db>\u001dakH0kLa;IdgJjg\u001dg=\u001c3fJc=\u001dj"));

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public String f4852 = null;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public String f4854 = null;

    /* renamed from: ぁごぐすすぃ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.くし〴〺ぅ$げつ〴ぬぐ, reason: contains not printable characters */
    public enum EnumC0748 {
        f4857,
        f4858,
        f4861,
        f4859
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public String m2020(boolean z) {
        StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("\u001cegHenL7g\u001a6gNfmKgf\u001adl\u001ajf@k9IcmLj")));
        m4207.append(this.f4845);
        StringBuilder m42072 = C2098.m4207(C2098.m4205(m4207.toString(), Crypt.a(Crypt.xrc("\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd"))));
        m42072.append(this.f4848);
        String sb = m42072.toString();
        boolean z2 = this.f4853;
        StringBuilder m42073 = C2098.m4207(sb);
        m42073.append(z2 ? " udp\n" : " tcp-client\n");
        String sb2 = m42073.toString();
        if (this.f4844 != 0) {
            StringBuilder m42074 = C2098.m4207(sb2);
            m42074.append(String.format(Locale.US, " connect-timeout  %d\n", Integer.valueOf(this.f4844)));
            sb2 = m42074.toString();
        }
        if ((z || m2021()) && this.f4855 == EnumC0748.f4858) {
            StringBuilder m42075 = C2098.m4207(sb2);
            Locale locale = Locale.US;
            m42075.append(String.format(locale, "http-proxy %s %s\n", this.f4847, this.f4856));
            String sb3 = m42075.toString();
            if (this.f4850) {
                StringBuilder m42076 = C2098.m4207(sb3);
                m42076.append(String.format(locale, "<http-proxy-user-pass>\n%s\n%s\n</http-proxy-user-pass>\n", this.f4852, this.f4854));
                sb2 = m42076.toString();
            } else {
                sb2 = sb3;
            }
        }
        if (m2021() && this.f4855 == EnumC0748.f4861) {
            StringBuilder m42077 = C2098.m4207(sb2);
            m42077.append(String.format(Locale.US, "socks-proxy %s %s\n", this.f4847, this.f4856));
            sb2 = m42077.toString();
        }
        if (TextUtils.isEmpty(this.f4849) || !this.f4851) {
            return sb2;
        }
        StringBuilder m42078 = C2098.m4207(sb2);
        m42078.append(this.f4849);
        return C2098.m4205(m42078.toString(), "\n");
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean m2021() {
        return this.f4851 && this.f4849.contains(Crypt.a(Crypt.xrc("\u001d3k\u001c6lMjfKa;\u001ddi\u001b0n\u001b3=K6l\u00197<L7mA1<L6hIa=HfmHa<J3mM`lO7j\u001bg;KknHbfI")));
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0747 clone() {
        return (C0747) super.clone();
    }
}
