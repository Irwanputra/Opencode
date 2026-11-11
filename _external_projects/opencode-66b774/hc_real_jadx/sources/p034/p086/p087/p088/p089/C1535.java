package p034.p086.p087.p088.p089;

import java.util.ArrayList;

/* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.のぷのちつ.てぜきぽく, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1535 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static int f7119;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public ArrayList<AbstractC1530> f7120 = new ArrayList<>();

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public AbstractC1530 f7121;

    public C1535(AbstractC1530 abstractC1530, int i) {
        this.f7121 = null;
        f7119++;
        this.f7121 = abstractC1530;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final long m3396(C1536 c1536, long j) {
        AbstractC1530 abstractC1530 = c1536.f7131;
        if (abstractC1530 instanceof C1529) {
            return j;
        }
        int size = c1536.f7133.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC1539 interfaceC1539 = c1536.f7133.get(i);
            if (interfaceC1539 instanceof C1536) {
                C1536 c15362 = (C1536) interfaceC1539;
                if (c15362.f7131 != abstractC1530) {
                    j2 = Math.max(j2, m3396(c15362, c15362.f7130 + j));
                }
            }
        }
        if (c1536 != abstractC1530.f7094) {
            return j2;
        }
        long mo3383 = j + abstractC1530.mo3383();
        return Math.max(Math.max(j2, m3396(abstractC1530.f7103, mo3383)), mo3383 - abstractC1530.f7103.f7130);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final long m3397(C1536 c1536, long j) {
        AbstractC1530 abstractC1530 = c1536.f7131;
        if (abstractC1530 instanceof C1529) {
            return j;
        }
        int size = c1536.f7133.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC1539 interfaceC1539 = c1536.f7133.get(i);
            if (interfaceC1539 instanceof C1536) {
                C1536 c15362 = (C1536) interfaceC1539;
                if (c15362.f7131 != abstractC1530) {
                    j2 = Math.min(j2, m3397(c15362, c15362.f7130 + j));
                }
            }
        }
        if (c1536 != abstractC1530.f7103) {
            return j2;
        }
        long mo3383 = j - abstractC1530.mo3383();
        return Math.min(Math.min(j2, m3397(abstractC1530.f7094, mo3383)), mo3383 - abstractC1530.f7094.f7130);
    }
}
