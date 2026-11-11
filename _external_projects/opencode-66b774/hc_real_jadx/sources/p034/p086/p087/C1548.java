package p034.p086.p087;

import java.util.ArrayList;
import p034.p086.p087.C1550;
import p034.p086.p087.C1558;

/* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1548 implements C1558.InterfaceC1559 {

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public InterfaceC1549 f7259;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C1550 f7257 = null;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public float f7255 = 0.0f;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public ArrayList<C1550> f7256 = new ArrayList<>();

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f7258 = false;

    /* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public interface InterfaceC1549 {
        void clear();

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        float mo3456(C1550 c1550, boolean z);

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        void mo3457(C1550 c1550, float f, boolean z);

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        void mo3458(C1550 c1550, float f);

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        void mo3459(float f);

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        float mo3460(C1550 c1550);

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        float mo3461(int i);

        /* renamed from: づざかべべ, reason: contains not printable characters */
        int mo3462();

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        float mo3463(C1548 c1548, boolean z);

        /* renamed from: びぐびあび, reason: contains not printable characters */
        boolean mo3464(C1550 c1550);

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        C1550 mo3465(int i);

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        void mo3466();
    }

    public C1548() {
    }

    public C1548(C1552 c1552) {
        this.f7259 = new C1553(this, c1552);
    }

    @Override // p034.p086.p087.C1558.InterfaceC1559
    public void clear() {
        this.f7259.clear();
        this.f7257 = null;
        this.f7255 = 0.0f;
    }

    @Override // p034.p086.p087.C1558.InterfaceC1559
    public boolean isEmpty() {
        return this.f7257 == null && this.f7255 == 0.0f && this.f7259.mo3462() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r8 = this;
            づざかべべ.なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ r0 = r8.f7257
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L16
        L7:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = p131.p155.p156.p157.C2098.m4207(r0)
            づざかべべ.なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ r1 = r8.f7257
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L16:
            java.lang.String r1 = " = "
            java.lang.String r0 = p131.p155.p156.p157.C2098.m4205(r0, r1)
            float r1 = r8.f7255
            r2 = 0
            r3 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L33
            java.lang.StringBuilder r0 = p131.p155.p156.p157.C2098.m4207(r0)
            float r1 = r8.f7255
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            goto L34
        L33:
            r1 = 0
        L34:
            づざかべべ.なぎぱいぢぎ.〺つふすそ.〺つふすそ$げつ〴ぬぐ r4 = r8.f7259
            int r4 = r4.mo3462()
        L3a:
            if (r3 >= r4) goto L9e
            づざかべべ.なぎぱいぢぎ.〺つふすそ.〺つふすそ$げつ〴ぬぐ r5 = r8.f7259
            づざかべべ.なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ r5 = r5.mo3465(r3)
            if (r5 != 0) goto L45
            goto L9b
        L45:
            づざかべべ.なぎぱいぢぎ.〺つふすそ.〺つふすそ$げつ〴ぬぐ r6 = r8.f7259
            float r6 = r6.mo3461(r3)
            int r7 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r7 != 0) goto L50
            goto L9b
        L50:
            java.lang.String r5 = r5.toString()
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L63
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 >= 0) goto L7d
            java.lang.StringBuilder r0 = p131.p155.p156.p157.C2098.m4207(r0)
            java.lang.String r1 = "- "
            goto L74
        L63:
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 <= 0) goto L6e
            java.lang.String r1 = " + "
            java.lang.String r0 = p131.p155.p156.p157.C2098.m4205(r0, r1)
            goto L7d
        L6e:
            java.lang.StringBuilder r0 = p131.p155.p156.p157.C2098.m4207(r0)
            java.lang.String r1 = " - "
        L74:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            float r6 = r6 * r7
        L7d:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L89
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L96
        L89:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " "
        L96:
            java.lang.String r0 = p131.p155.p156.p157.C2098.m4198(r1, r0, r5)
            r1 = 1
        L9b:
            int r3 = r3 + 1
            goto L3a
        L9e:
            if (r1 != 0) goto La6
            java.lang.String r1 = "0.0"
            java.lang.String r0 = p131.p155.p156.p157.C2098.m4205(r0, r1)
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p086.p087.C1548.toString():java.lang.String");
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final boolean m3444(C1550 c1550) {
        return c1550.f7268 <= 1;
    }

    @Override // p034.p086.p087.C1558.InterfaceC1559
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1550 mo3445(C1558 c1558, boolean[] zArr) {
        return m3454(zArr, null);
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public C1548 m3446(C1550 c1550, C1550 c15502, C1550 c15503, C1550 c15504, float f) {
        this.f7259.mo3458(c15503, 0.5f);
        this.f7259.mo3458(c15504, 0.5f);
        this.f7259.mo3458(c1550, -0.5f);
        this.f7259.mo3458(c15502, -0.5f);
        this.f7255 = -f;
        return this;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public void m3447(C1550 c1550) {
        C1550 c15502 = this.f7257;
        if (c15502 != null) {
            this.f7259.mo3458(c15502, -1.0f);
            this.f7257.f7265 = -1;
            this.f7257 = null;
        }
        float mo3456 = this.f7259.mo3456(c1550, true) * (-1.0f);
        this.f7257 = c1550;
        if (mo3456 == 1.0f) {
            return;
        }
        this.f7255 /= mo3456;
        this.f7259.mo3459(mo3456);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C1548 m3448(C1558 c1558, int i) {
        this.f7259.mo3458(c1558.m3496(i, "ep"), 1.0f);
        this.f7259.mo3458(c1558.m3496(i, "em"), -1.0f);
        return this;
    }

    @Override // p034.p086.p087.C1558.InterfaceC1559
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo3449(C1550 c1550) {
        float f;
        int i = c1550.f7271;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
            this.f7259.mo3458(c1550, f);
        }
        f = 1.0f;
        this.f7259.mo3458(c1550, f);
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public C1548 m3450(C1550 c1550, C1550 c15502, C1550 c15503, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f7255 = i;
        }
        if (z) {
            this.f7259.mo3458(c1550, 1.0f);
            this.f7259.mo3458(c15502, -1.0f);
            this.f7259.mo3458(c15503, -1.0f);
        } else {
            this.f7259.mo3458(c1550, -1.0f);
            this.f7259.mo3458(c15502, 1.0f);
            this.f7259.mo3458(c15503, 1.0f);
        }
        return this;
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public void mo3451(C1558 c1558, C1548 c1548, boolean z) {
        float mo3463 = this.f7259.mo3463(c1548, z);
        this.f7255 = (c1548.f7255 * mo3463) + this.f7255;
        if (z) {
            c1548.f7257.m3467(this);
        }
        if (this.f7257 == null || this.f7259.mo3462() != 0) {
            return;
        }
        this.f7258 = true;
        c1558.f7312 = true;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C1548 m3452(C1550 c1550, C1550 c15502, C1550 c15503, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f7255 = i;
        }
        if (z) {
            this.f7259.mo3458(c1550, 1.0f);
            this.f7259.mo3458(c15502, -1.0f);
            this.f7259.mo3458(c15503, 1.0f);
        } else {
            this.f7259.mo3458(c1550, -1.0f);
            this.f7259.mo3458(c15502, 1.0f);
            this.f7259.mo3458(c15503, -1.0f);
        }
        return this;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C1548 m3453(C1550 c1550, C1550 c15502, C1550 c15503, C1550 c15504, float f) {
        this.f7259.mo3458(c1550, -1.0f);
        this.f7259.mo3458(c15502, 1.0f);
        this.f7259.mo3458(c15503, f);
        this.f7259.mo3458(c15504, -f);
        return this;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final C1550 m3454(boolean[] zArr, C1550 c1550) {
        C1550.EnumC1551 enumC1551;
        int mo3462 = this.f7259.mo3462();
        C1550 c15502 = null;
        float f = 0.0f;
        for (int i = 0; i < mo3462; i++) {
            float mo3461 = this.f7259.mo3461(i);
            if (mo3461 < 0.0f) {
                C1550 mo3465 = this.f7259.mo3465(i);
                if ((zArr == null || !zArr[mo3465.f7262]) && mo3465 != c1550 && (((enumC1551 = mo3465.f7272) == C1550.EnumC1551.SLACK || enumC1551 == C1550.EnumC1551.ERROR) && mo3461 < f)) {
                    f = mo3461;
                    c15502 = mo3465;
                }
            }
        }
        return c15502;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void m3455(C1558 c1558, C1550 c1550, boolean z) {
        if (c1550.f7269) {
            float mo3460 = this.f7259.mo3460(c1550);
            this.f7255 = (c1550.f7267 * mo3460) + this.f7255;
            this.f7259.mo3456(c1550, z);
            if (z) {
                c1550.m3467(this);
            }
            if (this.f7259.mo3462() == 0) {
                this.f7258 = true;
                c1558.f7312 = true;
            }
        }
    }
}
