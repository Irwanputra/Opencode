package p034.p086.p087.p088.p089;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import p034.p086.p087.p088.C1520;
import p034.p086.p087.p088.C1544;

/* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.のぷのちつ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1525 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C1520 f7081;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final ArrayList<C1544> f7082 = new ArrayList<>();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1527 f7080 = new C1527();

    /* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.のぷのちつ.〺つふすそ$〺つふすそ, reason: contains not printable characters */
    public interface InterfaceC1526 {
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.のぷのちつ.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1527 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public boolean f7083;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C1544.EnumC1545 f7084;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public int f7085;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public int f7086;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f7087;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C1544.EnumC1545 f7088;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f7089;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int f7090;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f7091;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public boolean f7092;
    }

    public C1525(C1520 c1520) {
        this.f7081 = c1520;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m3370(C1520 c1520, int i, int i2) {
        int i3 = c1520.f7157;
        int i4 = c1520.f7220;
        c1520.m3428(0);
        c1520.m3410(0);
        c1520.f7175 = i;
        int i5 = c1520.f7157;
        if (i < i5) {
            c1520.f7175 = i5;
        }
        c1520.f7221 = i2;
        int i6 = c1520.f7220;
        if (i2 < i6) {
            c1520.f7221 = i6;
        }
        c1520.m3428(i3);
        c1520.m3410(i4);
        this.f7081.mo3347();
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m3371(C1520 c1520) {
        this.f7082.clear();
        int size = c1520.f7035.size();
        for (int i = 0; i < size; i++) {
            C1544 c1544 = c1520.f7035.get(i);
            C1544.EnumC1545 m3424 = c1544.m3424();
            C1544.EnumC1545 enumC1545 = C1544.EnumC1545.MATCH_CONSTRAINT;
            if (m3424 == enumC1545 || c1544.m3430() == enumC1545) {
                this.f7082.add(c1544);
            }
        }
        c1520.m3343();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final boolean m3372(InterfaceC1526 interfaceC1526, C1544 c1544, int i) {
        C1544.EnumC1545 enumC1545 = C1544.EnumC1545.FIXED;
        this.f7080.f7088 = c1544.m3424();
        this.f7080.f7084 = c1544.m3430();
        this.f7080.f7087 = c1544.m3438();
        this.f7080.f7091 = c1544.m3418();
        C1527 c1527 = this.f7080;
        c1527.f7092 = false;
        c1527.f7086 = i;
        C1544.EnumC1545 enumC15452 = c1527.f7088;
        C1544.EnumC1545 enumC15453 = C1544.EnumC1545.MATCH_CONSTRAINT;
        boolean z = enumC15452 == enumC15453;
        boolean z2 = c1527.f7084 == enumC15453;
        boolean z3 = z && c1544.f7194 > 0.0f;
        boolean z4 = z2 && c1544.f7194 > 0.0f;
        if (z3 && c1544.f7231[0] == 4) {
            c1527.f7088 = enumC1545;
        }
        if (z4 && c1544.f7231[1] == 4) {
            c1527.f7084 = enumC1545;
        }
        ((ConstraintLayout.C0127) interfaceC1526).m318(c1544, c1527);
        c1544.m3416(this.f7080.f7089);
        c1544.m3421(this.f7080.f7090);
        C1527 c15272 = this.f7080;
        c1544.f7224 = c15272.f7083;
        c1544.m3419(c15272.f7085);
        C1527 c15273 = this.f7080;
        c15273.f7086 = 0;
        return c15273.f7092;
    }
}
