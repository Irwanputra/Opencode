package p131.p135.p138;

import p000.C0712;
import p034.p095.C1687;
import p131.p135.p137.C1980;
import p131.p135.p137.C1982;
import p131.p135.p137.EnumC1975;
import p131.p135.p137.EnumC1988;
import p131.p135.p137.RunnableC1976;
import p131.p135.p139.C2008;
import p131.p135.p139.C2009;
import p131.p135.p143.C2026;

/* renamed from: なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC2003 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final EnumC1975 f8723;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final int f8724;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C1982 f8725;

    /* renamed from: なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ.なぎぱいぢぎ$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC2004 implements Runnable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ C1982 f8726;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final /* synthetic */ C2026 f8727;

        public RunnableC2004(RunnableC2003 runnableC2003, C1982 c1982, C2026 c2026) {
            this.f8726 = c1982;
            this.f8727 = c2026;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8726.m4095(this.f8727);
            this.f8726.m4096();
        }
    }

    public RunnableC2003(C1982 c1982) {
        this.f8725 = c1982;
        this.f8724 = c1982.f8635;
        this.f8723 = c1982.f8619;
    }

    @Override // java.lang.Runnable
    public void run() {
        C2026 c2026;
        C2026 c20262;
        EnumC1988 enumC1988 = EnumC1988.OK_HTTP_RESPONSE;
        this.f8725.getClass();
        C1982 c1982 = this.f8725;
        int i = c1982.f8629;
        boolean z = true;
        C0712 c0712 = null;
        try {
            if (i == 0) {
                try {
                    c0712 = C2000.m4110(c1982);
                    C1982 c19822 = this.f8725;
                    if (c19822.f8621 == enumC1988) {
                        c19822.m4101(c0712);
                    } else {
                        if (c0712.f4761 >= 400) {
                            c2026 = new C2026(c0712);
                            C1687.m3736(c2026, this.f8725, c0712.f4761);
                        } else {
                            C1980 m4103 = c19822.m4103(c0712);
                            C2026 c20263 = m4103.f8607;
                            if (c20263 != null) {
                                z = false;
                            }
                            if (z) {
                                m4103.f8608 = c0712;
                                this.f8725.m4099(m4103);
                            } else {
                                c19822 = this.f8725;
                                c2026 = c20263;
                            }
                        }
                        m4113(c19822, c2026);
                    }
                } catch (Exception e) {
                    m4113(this.f8725, new C2026(e));
                }
            } else if (i != 1) {
                try {
                    if (i == 2) {
                        try {
                            c0712 = C2000.m4112(c1982);
                            C1982 c19823 = this.f8725;
                            if (c19823.f8621 == enumC1988) {
                                c19823.m4101(c0712);
                            } else {
                                if (c0712.f4761 >= 400) {
                                    c20262 = new C2026(c0712);
                                    C1687.m3736(c20262, this.f8725, c0712.f4761);
                                } else {
                                    C1980 m41032 = c19823.m4103(c0712);
                                    C2026 c20264 = m41032.f8607;
                                    if (c20264 != null) {
                                        z = false;
                                    }
                                    if (z) {
                                        m41032.f8608 = c0712;
                                        this.f8725.m4099(m41032);
                                    } else {
                                        c19823 = this.f8725;
                                        c20262 = c20264;
                                    }
                                }
                                m4113(c19823, c20262);
                            }
                        } catch (Exception e2) {
                            m4113(this.f8725, new C2026(e2));
                        }
                        C1687.m3713(c0712, this.f8725);
                    }
                } finally {
                }
            } else {
                try {
                    C0712 m4109 = C2000.m4109(c1982);
                    if (m4109.f4761 >= 400) {
                        C1982 c19824 = this.f8725;
                        C2026 c20265 = new C2026(m4109);
                        C1687.m3736(c20265, this.f8725, m4109.f4761);
                        m4113(c19824, c20265);
                    } else {
                        C1982 c19825 = this.f8725;
                        c19825.f8632 = true;
                        if (c19825.f8626 != null) {
                            if (c19825.f8631) {
                                c19825.m4095(new C2026());
                            } else {
                                ((C2009) C2008.m4114().f8733).f8736.execute(new RunnableC1976(c19825));
                            }
                        }
                        c19825.m4096();
                    }
                } catch (Exception e3) {
                    m4113(this.f8725, new C2026(e3));
                }
            }
            this.f8725.getClass();
        } finally {
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m4113(C1982 c1982, C2026 c2026) {
        ((C2009) C2008.m4114().f8733).f8736.execute(new RunnableC2004(this, c1982, c2026));
    }
}
