package p034.p086.p087;

import java.io.PrintStream;
import java.util.Arrays;
import p034.p086.p087.C1548;
import p034.p086.p087.C1550;
import p034.p086.p087.p088.C1517;

/* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1558 {

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static boolean f7303 = false;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public static int f7304 = 1000;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public static long f7305;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public InterfaceC1559 f7310;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public InterfaceC1559 f7311;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final C1552 f7314;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C1548[] f7315;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean f7312 = false;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f7307 = 0;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f7317 = 32;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f7313 = 32;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f7308 = false;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean[] f7306 = new boolean[32];

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f7319 = 1;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int f7309 = 0;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f7320 = 32;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public C1550[] f7316 = new C1550[f7304];

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public int f7318 = 0;

    /* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.びぐびあび$げつ〴ぬぐ, reason: contains not printable characters */
    public interface InterfaceC1559 {
        void clear();

        boolean isEmpty();

        /* renamed from: 〺つふすそ */
        C1550 mo3445(C1558 c1558, boolean[] zArr);

        /* renamed from: げつ〴ぬぐ */
        void mo3449(C1550 c1550);
    }

    public C1558() {
        this.f7315 = null;
        this.f7315 = new C1548[32];
        m3485();
        C1552 c1552 = new C1552();
        this.f7314 = c1552;
        this.f7311 = new C1555(c1552);
        this.f7310 = new C1548(c1552);
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m3476(C1550 c1550, C1550 c15502, C1550 c15503, C1550 c15504, float f, int i) {
        C1548 m3491 = m3491();
        m3491.m3453(c1550, c15502, c15503, c15504, f);
        if (i != 8) {
            m3491.m3448(this, i);
        }
        m3483(m3491);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m3477(C1550 c1550, C1550 c15502, int i, float f, C1550 c15503, C1550 c15504, int i2, int i3) {
        int i4;
        float f2;
        C1548 m3491 = m3491();
        if (c15502 == c15503) {
            m3491.f7259.mo3458(c1550, 1.0f);
            m3491.f7259.mo3458(c15504, 1.0f);
            m3491.f7259.mo3458(c15502, -2.0f);
        } else {
            if (f == 0.5f) {
                m3491.f7259.mo3458(c1550, 1.0f);
                m3491.f7259.mo3458(c15502, -1.0f);
                m3491.f7259.mo3458(c15503, -1.0f);
                m3491.f7259.mo3458(c15504, 1.0f);
                if (i > 0 || i2 > 0) {
                    i4 = (-i) + i2;
                    f2 = i4;
                }
            } else if (f <= 0.0f) {
                m3491.f7259.mo3458(c1550, -1.0f);
                m3491.f7259.mo3458(c15502, 1.0f);
                f2 = i;
            } else if (f >= 1.0f) {
                m3491.f7259.mo3458(c15504, -1.0f);
                m3491.f7259.mo3458(c15503, 1.0f);
                i4 = -i2;
                f2 = i4;
            } else {
                float f3 = 1.0f - f;
                m3491.f7259.mo3458(c1550, f3 * 1.0f);
                m3491.f7259.mo3458(c15502, f3 * (-1.0f));
                m3491.f7259.mo3458(c15503, (-1.0f) * f);
                m3491.f7259.mo3458(c15504, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    m3491.f7255 = (i2 * f) + ((-i) * f3);
                }
            }
            m3491.f7255 = f2;
        }
        if (i3 != 8) {
            m3491.m3448(this, i3);
        }
        m3483(m3491);
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void m3478(C1550 c1550, C1550 c15502, int i, int i2) {
        C1548 m3491 = m3491();
        C1550 m3494 = m3494();
        m3494.f7271 = 0;
        m3491.m3452(c1550, c15502, m3494, i);
        if (i2 != 8) {
            m3491.f7259.mo3458(m3496(i2, null), (int) (m3491.f7259.mo3460(m3494) * (-1.0f)));
        }
        m3483(m3491);
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final void m3479() {
        for (int i = 0; i < this.f7309; i++) {
            C1548 c1548 = this.f7315[i];
            c1548.f7257.f7267 = c1548.f7255;
        }
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public final void m3480() {
        int i = this.f7317 * 2;
        this.f7317 = i;
        this.f7315 = (C1548[]) Arrays.copyOf(this.f7315, i);
        C1552 c1552 = this.f7314;
        c1552.f7283 = (C1550[]) Arrays.copyOf(c1552.f7283, this.f7317);
        int i2 = this.f7317;
        this.f7306 = new boolean[i2];
        this.f7313 = i2;
        this.f7320 = i2;
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public void m3481() {
        if (this.f7311.isEmpty()) {
            m3479();
            return;
        }
        if (this.f7308) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f7309) {
                    z = true;
                    break;
                } else if (!this.f7315[i].f7258) {
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                m3479();
                return;
            }
        }
        m3487(this.f7311);
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public int m3482(Object obj) {
        C1550 c1550 = ((C1517) obj).f7001;
        if (c1550 != null) {
            return (int) (c1550.f7267 + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x01af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b0  */
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m3483(p034.p086.p087.C1548 r17) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p086.p087.C1558.m3483(づざかべべ.なぎぱいぢぎ.〺つふすそ.〺つふすそ):void");
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C1550 m3484(C1550.EnumC1551 enumC1551, String str) {
        C1550 m3473 = this.f7314.f7281.m3473();
        if (m3473 == null) {
            m3473 = new C1550(enumC1551);
        } else {
            m3473.m3468();
        }
        m3473.f7272 = enumC1551;
        int i = this.f7318;
        int i2 = f7304;
        if (i >= i2) {
            int i3 = i2 * 2;
            f7304 = i3;
            this.f7316 = (C1550[]) Arrays.copyOf(this.f7316, i3);
        }
        C1550[] c1550Arr = this.f7316;
        int i4 = this.f7318;
        this.f7318 = i4 + 1;
        c1550Arr[i4] = m3473;
        return m3473;
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public final void m3485() {
        for (int i = 0; i < this.f7309; i++) {
            C1548 c1548 = this.f7315[i];
            if (c1548 != null) {
                this.f7314.f7280.m3472(c1548);
            }
            this.f7315[i] = null;
        }
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public void m3486() {
        C1552 c1552;
        int i = 0;
        while (true) {
            c1552 = this.f7314;
            C1550[] c1550Arr = c1552.f7283;
            if (i >= c1550Arr.length) {
                break;
            }
            C1550 c1550 = c1550Arr[i];
            if (c1550 != null) {
                c1550.m3468();
            }
            i++;
        }
        C1554<C1550> c1554 = c1552.f7281;
        C1550[] c1550Arr2 = this.f7316;
        int i2 = this.f7318;
        c1554.getClass();
        if (i2 > c1550Arr2.length) {
            i2 = c1550Arr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C1550 c15502 = c1550Arr2[i3];
            int i4 = c1554.f7294;
            Object[] objArr = c1554.f7295;
            if (i4 < objArr.length) {
                objArr[i4] = c15502;
                c1554.f7294 = i4 + 1;
            }
        }
        this.f7318 = 0;
        Arrays.fill(this.f7314.f7283, (Object) null);
        this.f7307 = 0;
        this.f7311.clear();
        this.f7319 = 1;
        for (int i5 = 0; i5 < this.f7309; i5++) {
            C1548[] c1548Arr = this.f7315;
            if (c1548Arr[i5] != null) {
                c1548Arr[i5].getClass();
            }
        }
        m3485();
        this.f7309 = 0;
        this.f7310 = new C1548(this.f7314);
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public void m3487(InterfaceC1559 interfaceC1559) {
        float f;
        int i;
        boolean z;
        C1550.EnumC1551 enumC1551 = C1550.EnumC1551.UNRESTRICTED;
        int i2 = 0;
        while (true) {
            f = 0.0f;
            i = 1;
            if (i2 >= this.f7309) {
                z = false;
                break;
            }
            C1548[] c1548Arr = this.f7315;
            if (c1548Arr[i2].f7257.f7272 != enumC1551 && c1548Arr[i2].f7255 < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            boolean z2 = false;
            int i3 = 0;
            while (!z2) {
                i3 += i;
                float f2 = Float.MAX_VALUE;
                int i4 = 0;
                int i5 = -1;
                int i6 = -1;
                int i7 = 0;
                while (i4 < this.f7309) {
                    C1548 c1548 = this.f7315[i4];
                    if (c1548.f7257.f7272 != enumC1551 && !c1548.f7258 && c1548.f7255 < f) {
                        int mo3462 = c1548.f7259.mo3462();
                        int i8 = 0;
                        while (i8 < mo3462) {
                            C1550 mo3465 = c1548.f7259.mo3465(i8);
                            float mo3460 = c1548.f7259.mo3460(mo3465);
                            if (mo3460 > f) {
                                for (int i9 = 0; i9 < 9; i9++) {
                                    float f3 = mo3465.f7263[i9] / mo3460;
                                    if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                        i6 = mo3465.f7262;
                                        i7 = i9;
                                        f2 = f3;
                                        i5 = i4;
                                    }
                                }
                            }
                            i8++;
                            f = 0.0f;
                        }
                    }
                    i4++;
                    f = 0.0f;
                }
                if (i5 != -1) {
                    C1548 c15482 = this.f7315[i5];
                    c15482.f7257.f7265 = -1;
                    c15482.m3447(this.f7314.f7283[i6]);
                    C1550 c1550 = c15482.f7257;
                    c1550.f7265 = i5;
                    c1550.m3470(this, c15482);
                } else {
                    z2 = true;
                }
                if (i3 > this.f7319 / 2) {
                    z2 = true;
                }
                f = 0.0f;
                i = 1;
            }
        }
        m3492(interfaceC1559);
        m3479();
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void m3488(C1550 c1550, int i) {
        C1548 m3491;
        C1548.InterfaceC1549 interfaceC1549;
        float f;
        int i2 = c1550.f7265;
        if (i2 == -1) {
            c1550.m3471(this, i);
            for (int i3 = 0; i3 < this.f7307 + 1; i3++) {
                C1550 c15502 = this.f7314.f7283[i3];
            }
            return;
        }
        if (i2 != -1) {
            C1548 c1548 = this.f7315[i2];
            if (!c1548.f7258) {
                if (c1548.f7259.mo3462() == 0) {
                    c1548.f7258 = true;
                } else {
                    m3491 = m3491();
                    if (i < 0) {
                        m3491.f7255 = i * (-1);
                        interfaceC1549 = m3491.f7259;
                        f = 1.0f;
                    } else {
                        m3491.f7255 = i;
                        interfaceC1549 = m3491.f7259;
                        f = -1.0f;
                    }
                    interfaceC1549.mo3458(c1550, f);
                }
            }
            c1548.f7255 = i;
            return;
        }
        m3491 = m3491();
        m3491.f7257 = c1550;
        float f2 = i;
        c1550.f7267 = f2;
        m3491.f7255 = f2;
        m3491.f7258 = true;
        m3483(m3491);
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public C1550 m3489(Object obj) {
        C1550 c1550 = null;
        if (obj == null) {
            return null;
        }
        if (this.f7319 + 1 >= this.f7313) {
            m3480();
        }
        if (obj instanceof C1517) {
            C1517 c1517 = (C1517) obj;
            c1550 = c1517.f7001;
            if (c1550 == null) {
                c1517.m3330();
                c1550 = c1517.f7001;
            }
            int i = c1550.f7262;
            if (i == -1 || i > this.f7307 || this.f7314.f7283[i] == null) {
                if (i != -1) {
                    c1550.m3468();
                }
                int i2 = this.f7307 + 1;
                this.f7307 = i2;
                this.f7319++;
                c1550.f7262 = i2;
                c1550.f7272 = C1550.EnumC1551.UNRESTRICTED;
                this.f7314.f7283[i2] = c1550;
            }
        }
        return c1550;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void m3490(C1550 c1550, C1550 c15502, int i, int i2) {
        C1548 m3491 = m3491();
        C1550 m3494 = m3494();
        m3494.f7271 = 0;
        m3491.m3450(c1550, c15502, m3494, i);
        if (i2 != 8) {
            m3491.f7259.mo3458(m3496(i2, null), (int) (m3491.f7259.mo3460(m3494) * (-1.0f)));
        }
        m3483(m3491);
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public C1548 m3491() {
        C1548 m3473 = this.f7314.f7280.m3473();
        if (m3473 == null) {
            m3473 = new C1548(this.f7314);
            f7305++;
        } else {
            m3473.f7257 = null;
            m3473.f7259.clear();
            m3473.f7255 = 0.0f;
            m3473.f7258 = false;
        }
        C1550.f7260++;
        return m3473;
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public final int m3492(InterfaceC1559 interfaceC1559) {
        for (int i = 0; i < this.f7319; i++) {
            this.f7306[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.f7319 * 2) {
                return i2;
            }
            C1550 c1550 = ((C1548) interfaceC1559).f7257;
            if (c1550 != null) {
                this.f7306[c1550.f7262] = true;
            }
            C1550 mo3445 = interfaceC1559.mo3445(this, this.f7306);
            if (mo3445 != null) {
                boolean[] zArr = this.f7306;
                int i3 = mo3445.f7262;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (mo3445 != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f7309; i5++) {
                    C1548 c1548 = this.f7315[i5];
                    if (c1548.f7257.f7272 != C1550.EnumC1551.UNRESTRICTED && !c1548.f7258 && c1548.f7259.mo3464(mo3445)) {
                        float mo3460 = c1548.f7259.mo3460(mo3445);
                        if (mo3460 < 0.0f) {
                            float f2 = (-c1548.f7255) / mo3460;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C1548 c15482 = this.f7315[i4];
                    c15482.f7257.f7265 = -1;
                    c15482.m3447(mo3445);
                    C1550 c15502 = c15482.f7257;
                    c15502.f7265 = i4;
                    c15502.m3470(this, c15482);
                }
            } else {
                z = true;
            }
        }
        return i2;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C1548 m3493(C1550 c1550, C1550 c15502, int i, int i2) {
        if (i2 == 8 && c15502.f7269 && c1550.f7265 == -1) {
            c1550.m3471(this, c15502.f7267 + i);
            return null;
        }
        C1548 m3491 = m3491();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            m3491.f7255 = i;
        }
        if (z) {
            m3491.f7259.mo3458(c1550, 1.0f);
            m3491.f7259.mo3458(c15502, -1.0f);
        } else {
            m3491.f7259.mo3458(c1550, -1.0f);
            m3491.f7259.mo3458(c15502, 1.0f);
        }
        if (i2 != 8) {
            m3491.m3448(this, i2);
        }
        m3483(m3491);
        return m3491;
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public C1550 m3494() {
        if (this.f7319 + 1 >= this.f7313) {
            m3480();
        }
        C1550 m3484 = m3484(C1550.EnumC1551.SLACK, null);
        int i = this.f7307 + 1;
        this.f7307 = i;
        this.f7319++;
        m3484.f7262 = i;
        this.f7314.f7283[i] = m3484;
        return m3484;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final void m3495(C1548 c1548) {
        int i;
        if (c1548.f7258) {
            c1548.f7257.m3471(this, c1548.f7255);
        } else {
            C1548[] c1548Arr = this.f7315;
            int i2 = this.f7309;
            c1548Arr[i2] = c1548;
            C1550 c1550 = c1548.f7257;
            c1550.f7265 = i2;
            this.f7309 = i2 + 1;
            c1550.m3470(this, c1548);
        }
        if (this.f7312) {
            int i3 = 0;
            while (i3 < this.f7309) {
                C1548[] c1548Arr2 = this.f7315;
                if (c1548Arr2[i3] == null) {
                    PrintStream printStream = System.out;
                }
                if (c1548Arr2[i3] != null && c1548Arr2[i3].f7258) {
                    C1548 c15482 = c1548Arr2[i3];
                    c15482.f7257.m3471(this, c15482.f7255);
                    this.f7314.f7280.m3472(c15482);
                    this.f7315[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f7309;
                        if (i4 >= i) {
                            break;
                        }
                        C1548[] c1548Arr3 = this.f7315;
                        int i6 = i4 - 1;
                        c1548Arr3[i6] = c1548Arr3[i4];
                        if (c1548Arr3[i6].f7257.f7265 == i4) {
                            c1548Arr3[i6].f7257.f7265 = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f7315[i5] = null;
                    }
                    this.f7309 = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f7312 = false;
        }
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public C1550 m3496(int i, String str) {
        if (this.f7319 + 1 >= this.f7313) {
            m3480();
        }
        C1550 m3484 = m3484(C1550.EnumC1551.ERROR, str);
        int i2 = this.f7307 + 1;
        this.f7307 = i2;
        this.f7319++;
        m3484.f7262 = i2;
        m3484.f7271 = i;
        this.f7314.f7283[i2] = m3484;
        this.f7311.mo3449(m3484);
        return m3484;
    }
}
