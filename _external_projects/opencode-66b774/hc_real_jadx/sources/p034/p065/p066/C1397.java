package p034.p065.p066;

import androidx.recyclerview.widget.RecyclerView;
import p034.p035.p042.C1053;
import p034.p080.C1493;
import p034.p080.C1504;

/* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.なぶひせが, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1397 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C1493<RecyclerView.AbstractC0207, C1399> f6605 = new C1493<>();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1504<RecyclerView.AbstractC0207> f6604 = new C1504<>();

    /* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.なぶひせが$〺つふすそ, reason: contains not printable characters */
    public interface InterfaceC1398 {
    }

    /* renamed from: づざかべべ.ぇぬぎばつ.びぐびあび.なぶひせが$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1399 {

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public static C1053<C1399> f6606 = new C1053<>(20);

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public RecyclerView.AbstractC0231.C0233 f6607;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public RecyclerView.AbstractC0231.C0233 f6608;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f6609;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public static void m3161(C1399 c1399) {
            c1399.f6609 = 0;
            c1399.f6607 = null;
            c1399.f6608 = null;
            f6606.mo2385(c1399);
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public static C1399 m3162() {
            C1399 mo2386 = f6606.mo2386();
            return mo2386 == null ? new C1399() : mo2386;
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m3154(RecyclerView.AbstractC0207 abstractC0207, RecyclerView.AbstractC0231.C0233 c0233) {
        C1399 orDefault = this.f6605.getOrDefault(abstractC0207, null);
        if (orDefault == null) {
            orDefault = C1399.m3162();
            this.f6605.put(abstractC0207, orDefault);
        }
        orDefault.f6608 = c0233;
        orDefault.f6609 |= 8;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void m3155(RecyclerView.AbstractC0207 abstractC0207) {
        int m3275 = this.f6604.m3275() - 1;
        while (true) {
            if (m3275 < 0) {
                break;
            }
            if (abstractC0207 == this.f6604.m3283(m3275)) {
                C1504<RecyclerView.AbstractC0207> c1504 = this.f6604;
                Object[] objArr = c1504.f6943;
                Object obj = objArr[m3275];
                Object obj2 = C1504.f6939;
                if (obj != obj2) {
                    objArr[m3275] = obj2;
                    c1504.f6940 = true;
                }
            } else {
                m3275--;
            }
        }
        C1399 remove = this.f6605.remove(abstractC0207);
        if (remove != null) {
            C1399.m3161(remove);
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m3156(RecyclerView.AbstractC0207 abstractC0207, RecyclerView.AbstractC0231.C0233 c0233) {
        C1399 orDefault = this.f6605.getOrDefault(abstractC0207, null);
        if (orDefault == null) {
            orDefault = C1399.m3162();
            this.f6605.put(abstractC0207, orDefault);
        }
        orDefault.f6607 = c0233;
        orDefault.f6609 |= 4;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m3157(RecyclerView.AbstractC0207 abstractC0207) {
        C1399 orDefault = this.f6605.getOrDefault(abstractC0207, null);
        if (orDefault == null) {
            orDefault = C1399.m3162();
            this.f6605.put(abstractC0207, orDefault);
        }
        orDefault.f6609 |= 1;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final RecyclerView.AbstractC0231.C0233 m3158(RecyclerView.AbstractC0207 abstractC0207, int i) {
        C1399 m3255;
        RecyclerView.AbstractC0231.C0233 c0233;
        int m3251 = this.f6605.m3251(abstractC0207);
        if (m3251 >= 0 && (m3255 = this.f6605.m3255(m3251)) != null) {
            int i2 = m3255.f6609;
            if ((i2 & i) != 0) {
                int i3 = (i ^ (-1)) & i2;
                m3255.f6609 = i3;
                if (i == 4) {
                    c0233 = m3255.f6607;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0233 = m3255.f6608;
                }
                if ((i3 & 12) == 0) {
                    this.f6605.m3254(m3251);
                    C1399.m3161(m3255);
                }
                return c0233;
            }
        }
        return null;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void m3159(RecyclerView.AbstractC0207 abstractC0207) {
        C1399 orDefault = this.f6605.getOrDefault(abstractC0207, null);
        if (orDefault == null) {
            return;
        }
        orDefault.f6609 &= -2;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean m3160(RecyclerView.AbstractC0207 abstractC0207) {
        C1399 orDefault = this.f6605.getOrDefault(abstractC0207, null);
        return (orDefault == null || (orDefault.f6609 & 1) == 0) ? false : true;
    }
}
