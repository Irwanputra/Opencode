package p034.p065.p066;

import android.view.View;

/* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.びえぁぜい, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1405 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1407 f6625 = new C1407();

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final InterfaceC1406 f6626;

    /* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.びえぁぜい$〺つふすそ, reason: contains not printable characters */
    public interface InterfaceC1406 {
        /* renamed from: 〺つふすそ */
        int mo876(View view);

        /* renamed from: くし〴〺ぅ */
        View mo877(int i);

        /* renamed from: げつ〴ぬぐ */
        int mo878();

        /* renamed from: づざかべべ */
        int mo879(View view);

        /* renamed from: びぐびあび */
        int mo880();
    }

    /* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.びえぁぜい$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1407 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f6627;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f6628;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f6629 = 0;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f6630;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f6631;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int m3171(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean m3172() {
            int i = this.f6629;
            if ((i & 7) != 0 && (i & (m3171(this.f6631, this.f6627) << 0)) == 0) {
                return false;
            }
            int i2 = this.f6629;
            if ((i2 & 112) != 0 && (i2 & (m3171(this.f6631, this.f6628) << 4)) == 0) {
                return false;
            }
            int i3 = this.f6629;
            if ((i3 & 1792) != 0 && (i3 & (m3171(this.f6630, this.f6627) << 8)) == 0) {
                return false;
            }
            int i4 = this.f6629;
            return (i4 & 28672) == 0 || (i4 & (m3171(this.f6630, this.f6628) << 12)) != 0;
        }
    }

    public C1405(InterfaceC1406 interfaceC1406) {
        this.f6626 = interfaceC1406;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean m3169(View view, int i) {
        C1407 c1407 = this.f6625;
        int mo880 = this.f6626.mo880();
        int mo878 = this.f6626.mo878();
        int mo876 = this.f6626.mo876(view);
        int mo879 = this.f6626.mo879(view);
        c1407.f6627 = mo880;
        c1407.f6628 = mo878;
        c1407.f6631 = mo876;
        c1407.f6630 = mo879;
        if (i == 0) {
            return false;
        }
        C1407 c14072 = this.f6625;
        c14072.f6629 = 0;
        c14072.f6629 = 0 | i;
        return c14072.m3172();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public View m3170(int i, int i2, int i3, int i4) {
        int mo880 = this.f6626.mo880();
        int mo878 = this.f6626.mo878();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View mo877 = this.f6626.mo877(i);
            int mo876 = this.f6626.mo876(mo877);
            int mo879 = this.f6626.mo879(mo877);
            C1407 c1407 = this.f6625;
            c1407.f6627 = mo880;
            c1407.f6628 = mo878;
            c1407.f6631 = mo876;
            c1407.f6630 = mo879;
            if (i3 != 0) {
                c1407.f6629 = 0;
                c1407.f6629 = i3 | 0;
                if (c1407.m3172()) {
                    return mo877;
                }
            }
            if (i4 != 0) {
                C1407 c14072 = this.f6625;
                c14072.f6629 = 0;
                c14072.f6629 = i4 | 0;
                if (c14072.m3172()) {
                    view = mo877;
                }
            }
            i += i5;
        }
        return view;
    }
}
