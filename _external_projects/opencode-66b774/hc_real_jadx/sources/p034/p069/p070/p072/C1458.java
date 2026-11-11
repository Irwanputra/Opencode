package p034.p069.p070.p072;

/* renamed from: づざかべべ.くし〴〺ぅ.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1458 extends AbstractC1457 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static volatile C1458 f6751;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public AbstractC1457 f6752;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public AbstractC1457 f6753;

    public C1458() {
        C1455 c1455 = new C1455();
        this.f6752 = c1455;
        this.f6753 = c1455;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static C1458 m3197() {
        if (f6751 != null) {
            return f6751;
        }
        synchronized (C1458.class) {
            if (f6751 == null) {
                f6751 = new C1458();
            }
        }
        return f6751;
    }

    @Override // p034.p069.p070.p072.AbstractC1457
    /* renamed from: げつ〴ぬぐ */
    public boolean mo3196() {
        return this.f6753.mo3196();
    }
}
