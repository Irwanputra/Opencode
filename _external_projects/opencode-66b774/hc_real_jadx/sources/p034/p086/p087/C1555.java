package p034.p086.p087;

import androidx.core.app.NotificationCompat;
import java.util.Arrays;
import java.util.Comparator;
import p034.p086.p087.C1548;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1555 extends C1548 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public C1550[] f7296;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public C1550[] f7297;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public C1556 f7298;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f7299;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f7300;

    /* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.なぎぱいぢぎ$〺つふすそ, reason: contains not printable characters */
    public class C1556 implements Comparable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C1550 f7301;

        public C1556(C1555 c1555) {
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f7301.f7262 - ((C1550) obj).f7262;
        }

        public String toString() {
            String str = "[ ";
            if (this.f7301 != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder m4207 = C2098.m4207(str);
                    m4207.append(this.f7301.f7261[i]);
                    m4207.append(" ");
                    str = m4207.toString();
                }
            }
            StringBuilder m4179 = C2098.m4179(str, "] ");
            m4179.append(this.f7301);
            return m4179.toString();
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.なぎぱいぢぎ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1557 implements Comparator<C1550> {
        public C1557(C1555 c1555) {
        }

        @Override // java.util.Comparator
        public int compare(C1550 c1550, C1550 c15502) {
            return c1550.f7262 - c15502.f7262;
        }
    }

    public C1555(C1552 c1552) {
        super(c1552);
        this.f7299 = NotificationCompat.FLAG_HIGH_PRIORITY;
        this.f7297 = new C1550[NotificationCompat.FLAG_HIGH_PRIORITY];
        this.f7296 = new C1550[NotificationCompat.FLAG_HIGH_PRIORITY];
        this.f7300 = 0;
        this.f7298 = new C1556(this);
    }

    @Override // p034.p086.p087.C1548, p034.p086.p087.C1558.InterfaceC1559
    public void clear() {
        this.f7300 = 0;
        this.f7255 = 0.0f;
    }

    @Override // p034.p086.p087.C1548, p034.p086.p087.C1558.InterfaceC1559
    public boolean isEmpty() {
        return this.f7300 == 0;
    }

    @Override // p034.p086.p087.C1548
    public String toString() {
        StringBuilder m4179 = C2098.m4179("", " goal -> (");
        m4179.append(this.f7255);
        m4179.append(") : ");
        String sb = m4179.toString();
        for (int i = 0; i < this.f7300; i++) {
            this.f7298.f7301 = this.f7297[i];
            StringBuilder m4207 = C2098.m4207(sb);
            m4207.append(this.f7298);
            m4207.append(" ");
            sb = m4207.toString();
        }
        return sb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0053, code lost:
    
        if (r8 < r7) goto L31;
     */
    @Override // p034.p086.p087.C1548, p034.p086.p087.C1558.InterfaceC1559
    /* renamed from: 〺つふすそ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p034.p086.p087.C1550 mo3445(p034.p086.p087.C1558 r11, boolean[] r12) {
        /*
            r10 = this;
            r11 = 0
            r0 = -1
            r1 = 0
            r2 = -1
        L4:
            int r3 = r10.f7300
            if (r1 >= r3) goto L5d
            づざかべべ.なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ[] r3 = r10.f7297
            r4 = r3[r1]
            int r5 = r4.f7262
            boolean r5 = r12[r5]
            if (r5 == 0) goto L13
            goto L5a
        L13:
            づざかべべ.なぎぱいぢぎ.〺つふすそ.なぎぱいぢぎ$〺つふすそ r5 = r10.f7298
            r5.f7301 = r4
            r4 = 8
            r6 = 1
            if (r2 != r0) goto L39
            r5.getClass()
        L1f:
            if (r4 < 0) goto L35
            づざかべべ.なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ r3 = r5.f7301
            float[] r3 = r3.f7261
            r3 = r3[r4]
            r7 = 0
            int r8 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r8 <= 0) goto L2d
            goto L35
        L2d:
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 >= 0) goto L32
            goto L36
        L32:
            int r4 = r4 + (-1)
            goto L1f
        L35:
            r6 = 0
        L36:
            if (r6 == 0) goto L5a
            goto L59
        L39:
            r3 = r3[r2]
            r5.getClass()
        L3e:
            if (r4 < 0) goto L56
            float[] r7 = r3.f7261
            r7 = r7[r4]
            づざかべべ.なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ r8 = r5.f7301
            float[] r8 = r8.f7261
            r8 = r8[r4]
            int r9 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r9 != 0) goto L51
            int r4 = r4 + (-1)
            goto L3e
        L51:
            int r3 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r3 >= 0) goto L56
            goto L57
        L56:
            r6 = 0
        L57:
            if (r6 == 0) goto L5a
        L59:
            r2 = r1
        L5a:
            int r1 = r1 + 1
            goto L4
        L5d:
            if (r2 != r0) goto L61
            r11 = 0
            return r11
        L61:
            づざかべべ.なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ[] r11 = r10.f7297
            r11 = r11[r2]
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p086.p087.C1555.mo3445(づざかべべ.なぎぱいぢぎ.〺つふすそ.びぐびあび, boolean[]):づざかべべ.なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ");
    }

    @Override // p034.p086.p087.C1548, p034.p086.p087.C1558.InterfaceC1559
    /* renamed from: げつ〴ぬぐ */
    public void mo3449(C1550 c1550) {
        this.f7298.f7301 = c1550;
        Arrays.fill(c1550.f7261, 0.0f);
        c1550.f7261[c1550.f7271] = 1.0f;
        m3474(c1550);
    }

    @Override // p034.p086.p087.C1548
    /* renamed from: てぜきぽく */
    public void mo3451(C1558 c1558, C1548 c1548, boolean z) {
        C1550 c1550 = c1548.f7257;
        if (c1550 == null) {
            return;
        }
        C1548.InterfaceC1549 interfaceC1549 = c1548.f7259;
        int mo3462 = interfaceC1549.mo3462();
        for (int i = 0; i < mo3462; i++) {
            C1550 mo3465 = interfaceC1549.mo3465(i);
            float mo3461 = interfaceC1549.mo3461(i);
            C1556 c1556 = this.f7298;
            c1556.f7301 = mo3465;
            boolean z2 = true;
            if (mo3465.f7266) {
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr = c1556.f7301.f7261;
                    fArr[i2] = (c1550.f7261[i2] * mo3461) + fArr[i2];
                    if (Math.abs(fArr[i2]) < 1.0E-4f) {
                        c1556.f7301.f7261[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    C1555.this.m3475(c1556.f7301);
                }
                z2 = false;
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f = c1550.f7261[i3];
                    if (f != 0.0f) {
                        float f2 = f * mo3461;
                        if (Math.abs(f2) < 1.0E-4f) {
                            f2 = 0.0f;
                        }
                        c1556.f7301.f7261[i3] = f2;
                    } else {
                        c1556.f7301.f7261[i3] = 0.0f;
                    }
                }
            }
            if (z2) {
                m3474(mo3465);
            }
            this.f7255 = (c1548.f7255 * mo3461) + this.f7255;
        }
        m3475(c1550);
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final void m3474(C1550 c1550) {
        int i;
        int i2 = this.f7300 + 1;
        C1550[] c1550Arr = this.f7297;
        if (i2 > c1550Arr.length) {
            C1550[] c1550Arr2 = (C1550[]) Arrays.copyOf(c1550Arr, c1550Arr.length * 2);
            this.f7297 = c1550Arr2;
            this.f7296 = (C1550[]) Arrays.copyOf(c1550Arr2, c1550Arr2.length * 2);
        }
        C1550[] c1550Arr3 = this.f7297;
        int i3 = this.f7300;
        c1550Arr3[i3] = c1550;
        int i4 = i3 + 1;
        this.f7300 = i4;
        if (i4 > 1 && c1550Arr3[i4 - 1].f7262 > c1550.f7262) {
            int i5 = 0;
            while (true) {
                i = this.f7300;
                if (i5 >= i) {
                    break;
                }
                this.f7296[i5] = this.f7297[i5];
                i5++;
            }
            Arrays.sort(this.f7296, 0, i, new C1557(this));
            for (int i6 = 0; i6 < this.f7300; i6++) {
                this.f7297[i6] = this.f7296[i6];
            }
        }
        c1550.f7266 = true;
        c1550.m3469(this);
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public final void m3475(C1550 c1550) {
        int i = 0;
        while (i < this.f7300) {
            if (this.f7297[i] == c1550) {
                while (true) {
                    int i2 = this.f7300;
                    if (i >= i2 - 1) {
                        this.f7300 = i2 - 1;
                        c1550.f7266 = false;
                        return;
                    } else {
                        C1550[] c1550Arr = this.f7297;
                        int i3 = i + 1;
                        c1550Arr[i] = c1550Arr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }
}
