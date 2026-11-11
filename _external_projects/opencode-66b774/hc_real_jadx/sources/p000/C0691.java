package p000;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import p000.p001.C0629;
import p243.C2819;
import p243.InterfaceC2823;

/* renamed from: 〳ぜぞぜべっ.おぐぴう〸ず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0691 extends AbstractC0719 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final C0695 f4597 = C0695.m1944("application/x-www-form-urlencoded");

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final List<String> f4598;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final List<String> f4599;

    /* renamed from: 〳ぜぞぜべっ.おぐぴう〸ず$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C0692 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final List<String> f4601 = new ArrayList();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final List<String> f4600 = new ArrayList();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C0692 m1940(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.f4601.add(C0698.m1950(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, null));
            this.f4600.add(C0698.m1950(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, null));
            return this;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C0692 m1941(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.f4601.add(C0698.m1950(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, null));
            this.f4600.add(C0698.m1950(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, null));
            return this;
        }
    }

    public C0691(List<String> list, List<String> list2) {
        this.f4599 = C0629.m1810(list);
        this.f4598 = C0629.m1810(list2);
    }

    @Override // p000.AbstractC0719
    /* renamed from: 〺つふすそ */
    public C0695 mo1729() {
        return f4597;
    }

    @Override // p000.AbstractC0719
    /* renamed from: げつ〴ぬぐ */
    public long mo1730() {
        return m1939(null, true);
    }

    @Override // p000.AbstractC0719
    /* renamed from: づざかべべ */
    public void mo1731(InterfaceC2823 interfaceC2823) {
        m1939(interfaceC2823, false);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final long m1939(@Nullable InterfaceC2823 interfaceC2823, boolean z) {
        C2819 c2819 = z ? new C2819() : interfaceC2823.mo4888();
        int size = this.f4599.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                c2819.m4927(38);
            }
            c2819.m4916(this.f4599.get(i));
            c2819.m4927(61);
            c2819.m4916(this.f4598.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = c2819.f10501;
        c2819.m4921();
        return j;
    }
}
