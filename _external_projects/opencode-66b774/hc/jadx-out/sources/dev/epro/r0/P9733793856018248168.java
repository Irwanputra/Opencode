package dev.epro.r0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P9733793856018248168 extends R15896830329318850690 implements S14157914735975478504, R8540738700654750557, B18307494358031290147 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f440o;
    public Object p;
    public Object[] q;
    public PointerInputEventHandler r;
    public X7175349259954592591 s;
    public Y1086209215650239921 t = T7055906184043387232.a;
    public final D389890677992184566 u;
    public final D389890677992184566 v;
    public final D389890677992184566 w;
    public Y1086209215650239921 x;
    public long y;

    public P9733793856018248168(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.f440o = obj;
        this.p = obj2;
        this.q = objArr;
        this.r = pointerInputEventHandler;
        D389890677992184566 d389890677992184566 = new D389890677992184566(0, new Z7637734454282223795[16]);
        this.u = d389890677992184566;
        this.v = d389890677992184566;
        this.w = new D389890677992184566(0, new Z7637734454282223795[16]);
        this.y = 0L;
    }

    @Override // dev.epro.r0.R16749699847173633337
    public final void a() {
        j1();
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void a1() {
        j1();
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float c() {
        return R7033599853981556291.R(this).y.c();
    }

    public final Object h1(L12639328004344855510 l12639328004344855510, R4833348786910499294 r4833348786910499294) {
        H7219028874700587498 h7219028874700587498 = new H7219028874700587498(1, E18444280280170001567.H(r4833348786910499294));
        h7219028874700587498.t();
        Z7637734454282223795 z7637734454282223795 = new Z7637734454282223795(this, h7219028874700587498);
        synchronized (this.v) {
            this.u.b(z7637734454282223795);
            new D11771291342654552486(E18444280280170001567.H(E18444280280170001567.z(z7637734454282223795, z7637734454282223795, l12639328004344855510))).resumeWith(O9245300239821758723.a);
        }
        h7219028874700587498.v(new L13891208534469225493(z7637734454282223795, (byte) 6));
        return h7219028874700587498.r();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i1(dev.epro.r0.Y1086209215650239921 r7, dev.epro.r0.J17191566391535857141 r8) {
        /*
            r6 = this;
            dev.epro.r0.D389890677992184566 r0 = r6.v
            monitor-enter(r0)
            dev.epro.r0.D389890677992184566 r1 = r6.w     // Catch: java.lang.Throwable -> L6c
            dev.epro.r0.D389890677992184566 r2 = r6.u     // Catch: java.lang.Throwable -> L6c
            int r3 = r1.c     // Catch: java.lang.Throwable -> L6c
            r1.c(r3, r2)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r0)
            int r0 = r8.ordinal()     // Catch: java.lang.Throwable -> L21
            r1 = 0
            if (r0 == 0) goto L43
            r2 = 1
            if (r0 == r2) goto L23
            r2 = 2
            if (r0 != r2) goto L1b
            goto L43
        L1b:
            dev.epro.r0.M8821877208104636290 r7 = new dev.epro.r0.M8821877208104636290     // Catch: java.lang.Throwable -> L21
            r7.<init>()     // Catch: java.lang.Throwable -> L21
            throw r7     // Catch: java.lang.Throwable -> L21
        L21:
            r7 = move-exception
            goto L66
        L23:
            dev.epro.r0.D389890677992184566 r0 = r6.w     // Catch: java.lang.Throwable -> L21
            int r3 = r0.c     // Catch: java.lang.Throwable -> L21
            int r3 = r3 - r2
            java.lang.Object[] r0 = r0.a     // Catch: java.lang.Throwable -> L21
            int r2 = r0.length     // Catch: java.lang.Throwable -> L21
            if (r3 >= r2) goto L60
        L2d:
            if (r3 < 0) goto L60
            r2 = r0[r3]     // Catch: java.lang.Throwable -> L21
            dev.epro.r0.Z7637734454282223795 r2 = (dev.epro.r0.Z7637734454282223795) r2     // Catch: java.lang.Throwable -> L21
            dev.epro.r0.J17191566391535857141 r4 = r2.d     // Catch: java.lang.Throwable -> L21
            if (r8 != r4) goto L40
            dev.epro.r0.H7219028874700587498 r4 = r2.c     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L40
            r2.c = r1     // Catch: java.lang.Throwable -> L21
            r4.resumeWith(r7)     // Catch: java.lang.Throwable -> L21
        L40:
            int r3 = r3 + (-1)
            goto L2d
        L43:
            dev.epro.r0.D389890677992184566 r0 = r6.w     // Catch: java.lang.Throwable -> L21
            java.lang.Object[] r2 = r0.a     // Catch: java.lang.Throwable -> L21
            int r0 = r0.c     // Catch: java.lang.Throwable -> L21
            r3 = 0
        L4a:
            if (r3 >= r0) goto L60
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L21
            dev.epro.r0.Z7637734454282223795 r4 = (dev.epro.r0.Z7637734454282223795) r4     // Catch: java.lang.Throwable -> L21
            dev.epro.r0.J17191566391535857141 r5 = r4.d     // Catch: java.lang.Throwable -> L21
            if (r8 != r5) goto L5d
            dev.epro.r0.H7219028874700587498 r5 = r4.c     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L5d
            r4.c = r1     // Catch: java.lang.Throwable -> L21
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L21
        L5d:
            int r3 = r3 + 1
            goto L4a
        L60:
            dev.epro.r0.D389890677992184566 r6 = r6.w
            r6.i()
            return
        L66:
            dev.epro.r0.D389890677992184566 r6 = r6.w
            r6.i()
            throw r7
        L6c:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P9733793856018248168.i1(dev.epro.r0.Y1086209215650239921, dev.epro.r0.J17191566391535857141):void");
    }

    public final void j1() {
        X7175349259954592591 x7175349259954592591 = this.s;
        if (x7175349259954592591 != null) {
            x7175349259954592591.A(new D5264459092429484358("Pointer input was reset", (byte) 2));
            this.s = null;
        }
    }

    @Override // dev.epro.r0.B18307494358031290147
    public final void n0(Y1086209215650239921 y1086209215650239921, J17191566391535857141 j17191566391535857141, long j) {
        this.y = j;
        if (j17191566391535857141 == J17191566391535857141.a) {
            this.t = y1086209215650239921;
        }
        R4833348786910499294 r4833348786910499294 = null;
        if (this.s == null) {
            this.s = R7033599853981556291.E(V0(), null, L856869997670741194.d, new N12893830608069839869(this, r4833348786910499294, (byte) 10), 1);
        }
        i1(y1086209215650239921, j17191566391535857141);
        List list = y1086209215650239921.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                y1086209215650239921 = null;
                break;
            } else if (!I3887072968740112330.t((N13196868278329319633) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.x = y1086209215650239921;
    }

    @Override // dev.epro.r0.R8540738700654750557
    public final float s() {
        return R7033599853981556291.R(this).y.s();
    }

    @Override // dev.epro.r0.B18307494358031290147
    public final void u0() {
        j1();
    }

    @Override // dev.epro.r0.B18307494358031290147
    public final void x0() {
        Y1086209215650239921 y1086209215650239921 = this.x;
        if (y1086209215650239921 == null) {
            return;
        }
        List list = y1086209215650239921.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((N13196868278329319633) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    N13196868278329319633 n13196868278329319633 = (N13196868278329319633) list.get(i2);
                    long j = n13196868278329319633.a;
                    long j2 = n13196868278329319633.c;
                    long j3 = n13196868278329319633.b;
                    float f = n13196868278329319633.e;
                    boolean z = n13196868278329319633.d;
                    arrayList.add(new N13196868278329319633(j, j3, j2, false, f, j3, j2, z, z, n13196868278329319633.i, 0L, 1.0f, 0L));
                }
                Y1086209215650239921 y10862092156502399212 = new Y1086209215650239921(arrayList, null);
                this.t = y10862092156502399212;
                i1(y10862092156502399212, J17191566391535857141.a);
                i1(y10862092156502399212, J17191566391535857141.b);
                i1(y10862092156502399212, J17191566391535857141.c);
                this.x = null;
                return;
            }
        }
    }
}
