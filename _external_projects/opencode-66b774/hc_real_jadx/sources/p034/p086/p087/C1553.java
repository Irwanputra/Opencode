package p034.p086.p087;

import java.util.Arrays;
import p034.p086.p087.C1548;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1553 implements C1548.InterfaceC1549 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1548 f7285;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C1552 f7288;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int f7289 = 0;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f7292 = 8;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int[] f7290 = new int[8];

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int[] f7291 = new int[8];

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public float[] f7286 = new float[8];

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f7284 = -1;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f7293 = -1;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f7287 = false;

    public C1553(C1548 c1548, C1552 c1552) {
        this.f7285 = c1548;
        this.f7288 = c1552;
    }

    @Override // p034.p086.p087.C1548.InterfaceC1549
    public final void clear() {
        int i = this.f7284;
        for (int i2 = 0; i != -1 && i2 < this.f7289; i2++) {
            C1550 c1550 = this.f7288.f7283[this.f7290[i]];
            if (c1550 != null) {
                c1550.m3467(this.f7285);
            }
            i = this.f7291[i];
        }
        this.f7284 = -1;
        this.f7293 = -1;
        this.f7287 = false;
        this.f7289 = 0;
    }

    public String toString() {
        int i = this.f7284;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f7289; i2++) {
            StringBuilder m4207 = C2098.m4207(C2098.m4205(str, " -> "));
            m4207.append(this.f7286[i]);
            m4207.append(" : ");
            StringBuilder m42072 = C2098.m4207(m4207.toString());
            m42072.append(this.f7288.f7283[this.f7290[i]]);
            str = m42072.toString();
            i = this.f7291[i];
        }
        return str;
    }

    @Override // p034.p086.p087.C1548.InterfaceC1549
    /* renamed from: 〳ぜぞぜべっ */
    public final float mo3456(C1550 c1550, boolean z) {
        int i = this.f7284;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f7289) {
            if (this.f7290[i] == c1550.f7262) {
                if (i == this.f7284) {
                    this.f7284 = this.f7291[i];
                } else {
                    int[] iArr = this.f7291;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c1550.m3467(this.f7285);
                }
                c1550.f7268--;
                this.f7289--;
                this.f7290[i] = -1;
                if (this.f7287) {
                    this.f7293 = i;
                }
                return this.f7286[i];
            }
            i2++;
            i3 = i;
            i = this.f7291[i];
        }
        return 0.0f;
    }

    @Override // p034.p086.p087.C1548.InterfaceC1549
    /* renamed from: 〺つふすそ */
    public void mo3457(C1550 c1550, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f7284;
            if (i == -1) {
                this.f7284 = 0;
                this.f7286[0] = f;
                this.f7290[0] = c1550.f7262;
                this.f7291[0] = -1;
                c1550.f7268++;
                c1550.m3469(this.f7285);
                this.f7289++;
                if (this.f7287) {
                    return;
                }
                int i2 = this.f7293 + 1;
                this.f7293 = i2;
                int[] iArr = this.f7290;
                if (i2 >= iArr.length) {
                    this.f7287 = true;
                    this.f7293 = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f7289; i4++) {
                int[] iArr2 = this.f7290;
                int i5 = iArr2[i];
                int i6 = c1550.f7262;
                if (i5 == i6) {
                    float[] fArr = this.f7286;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f7284) {
                            this.f7284 = this.f7291[i];
                        } else {
                            int[] iArr3 = this.f7291;
                            iArr3[i3] = iArr3[i];
                        }
                        if (z) {
                            c1550.m3467(this.f7285);
                        }
                        if (this.f7287) {
                            this.f7293 = i;
                        }
                        c1550.f7268--;
                        this.f7289--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i3 = i;
                }
                i = this.f7291[i];
            }
            int i7 = this.f7293;
            int i8 = i7 + 1;
            if (this.f7287) {
                int[] iArr4 = this.f7290;
                if (iArr4[i7] != -1) {
                    i7 = iArr4.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr5 = this.f7290;
            if (i7 >= iArr5.length && this.f7289 < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.f7290;
                    if (i9 >= iArr6.length) {
                        break;
                    }
                    if (iArr6[i9] == -1) {
                        i7 = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr7 = this.f7290;
            if (i7 >= iArr7.length) {
                i7 = iArr7.length;
                int i10 = this.f7292 * 2;
                this.f7292 = i10;
                this.f7287 = false;
                this.f7293 = i7 - 1;
                this.f7286 = Arrays.copyOf(this.f7286, i10);
                this.f7290 = Arrays.copyOf(this.f7290, this.f7292);
                this.f7291 = Arrays.copyOf(this.f7291, this.f7292);
            }
            this.f7290[i7] = c1550.f7262;
            this.f7286[i7] = f;
            int[] iArr8 = this.f7291;
            if (i3 != -1) {
                iArr8[i7] = iArr8[i3];
                iArr8[i3] = i7;
            } else {
                iArr8[i7] = this.f7284;
                this.f7284 = i7;
            }
            c1550.f7268++;
            c1550.m3469(this.f7285);
            this.f7289++;
            if (!this.f7287) {
                this.f7293++;
            }
            int i11 = this.f7293;
            int[] iArr9 = this.f7290;
            if (i11 >= iArr9.length) {
                this.f7287 = true;
                this.f7293 = iArr9.length - 1;
            }
        }
    }

    @Override // p034.p086.p087.C1548.InterfaceC1549
    /* renamed from: ぁごぐすすぃ */
    public final void mo3458(C1550 c1550, float f) {
        if (f == 0.0f) {
            mo3456(c1550, true);
            return;
        }
        int i = this.f7284;
        if (i == -1) {
            this.f7284 = 0;
            this.f7286[0] = f;
            this.f7290[0] = c1550.f7262;
            this.f7291[0] = -1;
            c1550.f7268++;
            c1550.m3469(this.f7285);
            this.f7289++;
            if (this.f7287) {
                return;
            }
            int i2 = this.f7293 + 1;
            this.f7293 = i2;
            int[] iArr = this.f7290;
            if (i2 >= iArr.length) {
                this.f7287 = true;
                this.f7293 = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f7289; i4++) {
            int[] iArr2 = this.f7290;
            int i5 = iArr2[i];
            int i6 = c1550.f7262;
            if (i5 == i6) {
                this.f7286[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i3 = i;
            }
            i = this.f7291[i];
        }
        int i7 = this.f7293;
        int i8 = i7 + 1;
        if (this.f7287) {
            int[] iArr3 = this.f7290;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f7290;
        if (i7 >= iArr4.length && this.f7289 < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f7290;
                if (i9 >= iArr5.length) {
                    break;
                }
                if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr6 = this.f7290;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.f7292 * 2;
            this.f7292 = i10;
            this.f7287 = false;
            this.f7293 = i7 - 1;
            this.f7286 = Arrays.copyOf(this.f7286, i10);
            this.f7290 = Arrays.copyOf(this.f7290, this.f7292);
            this.f7291 = Arrays.copyOf(this.f7291, this.f7292);
        }
        this.f7290[i7] = c1550.f7262;
        this.f7286[i7] = f;
        int[] iArr7 = this.f7291;
        if (i3 != -1) {
            iArr7[i7] = iArr7[i3];
            iArr7[i3] = i7;
        } else {
            iArr7[i7] = this.f7284;
            this.f7284 = i7;
        }
        c1550.f7268++;
        c1550.m3469(this.f7285);
        int i11 = this.f7289 + 1;
        this.f7289 = i11;
        if (!this.f7287) {
            this.f7293++;
        }
        int[] iArr8 = this.f7290;
        if (i11 >= iArr8.length) {
            this.f7287 = true;
        }
        if (this.f7293 >= iArr8.length) {
            this.f7287 = true;
            this.f7293 = iArr8.length - 1;
        }
    }

    @Override // p034.p086.p087.C1548.InterfaceC1549
    /* renamed from: いいにぽつ */
    public void mo3459(float f) {
        int i = this.f7284;
        for (int i2 = 0; i != -1 && i2 < this.f7289; i2++) {
            float[] fArr = this.f7286;
            fArr[i] = fArr[i] / f;
            i = this.f7291[i];
        }
    }

    @Override // p034.p086.p087.C1548.InterfaceC1549
    /* renamed from: くし〴〺ぅ */
    public final float mo3460(C1550 c1550) {
        int i = this.f7284;
        for (int i2 = 0; i != -1 && i2 < this.f7289; i2++) {
            if (this.f7290[i] == c1550.f7262) {
                return this.f7286[i];
            }
            i = this.f7291[i];
        }
        return 0.0f;
    }

    @Override // p034.p086.p087.C1548.InterfaceC1549
    /* renamed from: げつ〴ぬぐ */
    public float mo3461(int i) {
        int i2 = this.f7284;
        for (int i3 = 0; i2 != -1 && i3 < this.f7289; i3++) {
            if (i3 == i) {
                return this.f7286[i2];
            }
            i2 = this.f7291[i2];
        }
        return 0.0f;
    }

    @Override // p034.p086.p087.C1548.InterfaceC1549
    /* renamed from: づざかべべ */
    public int mo3462() {
        return this.f7289;
    }

    @Override // p034.p086.p087.C1548.InterfaceC1549
    /* renamed from: なぎぱいぢぎ */
    public float mo3463(C1548 c1548, boolean z) {
        float mo3460 = mo3460(c1548.f7257);
        mo3456(c1548.f7257, z);
        C1548.InterfaceC1549 interfaceC1549 = c1548.f7259;
        int mo3462 = interfaceC1549.mo3462();
        for (int i = 0; i < mo3462; i++) {
            C1550 mo3465 = interfaceC1549.mo3465(i);
            mo3457(mo3465, interfaceC1549.mo3460(mo3465) * mo3460, z);
        }
        return mo3460;
    }

    @Override // p034.p086.p087.C1548.InterfaceC1549
    /* renamed from: びぐびあび */
    public boolean mo3464(C1550 c1550) {
        int i = this.f7284;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f7289; i2++) {
            if (this.f7290[i] == c1550.f7262) {
                return true;
            }
            i = this.f7291[i];
        }
        return false;
    }

    @Override // p034.p086.p087.C1548.InterfaceC1549
    /* renamed from: ぺぁあねじ */
    public C1550 mo3465(int i) {
        int i2 = this.f7284;
        for (int i3 = 0; i2 != -1 && i3 < this.f7289; i3++) {
            if (i3 == i) {
                return this.f7288.f7283[this.f7290[i2]];
            }
            i2 = this.f7291[i2];
        }
        return null;
    }

    @Override // p034.p086.p087.C1548.InterfaceC1549
    /* renamed from: ぺふねづ〺 */
    public void mo3466() {
        int i = this.f7284;
        for (int i2 = 0; i != -1 && i2 < this.f7289; i2++) {
            float[] fArr = this.f7286;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f7291[i];
        }
    }
}
