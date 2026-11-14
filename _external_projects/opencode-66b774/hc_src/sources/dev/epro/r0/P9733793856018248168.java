package dev.epro.r0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P9733793856018248168 extends R15896830329318850690 implements S14157914735975478504, R8540738700654750557, B18307494358031290147 {

    /* renamed from: o, reason: collision with root package name */
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

    public final void i1(Y1086209215650239921 y1086209215650239921, J17191566391535857141 j17191566391535857141) {
        H7219028874700587498 h7219028874700587498;
        H7219028874700587498 h72190288747005874982;
        synchronized (this.v) {
            D389890677992184566 d389890677992184566 = this.w;
            d389890677992184566.c(d389890677992184566.c, this.u);
        }
        try {
            int ordinal = j17191566391535857141.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    D389890677992184566 d3898906779921845662 = this.w;
                    int i = d3898906779921845662.c - 1;
                    Object[] objArr = d3898906779921845662.a;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            Z7637734454282223795 z7637734454282223795 = (Z7637734454282223795) objArr[i];
                            if (j17191566391535857141 == z7637734454282223795.d && (h72190288747005874982 = z7637734454282223795.c) != null) {
                                z7637734454282223795.c = null;
                                h72190288747005874982.resumeWith(y1086209215650239921);
                            }
                            i--;
                        }
                    }
                    this.w.i();
                }
                if (ordinal != 2) {
                    throw new M8821877208104636290();
                }
            }
            D389890677992184566 d3898906779921845663 = this.w;
            Object[] objArr2 = d3898906779921845663.a;
            int i2 = d3898906779921845663.c;
            for (int i3 = 0; i3 < i2; i3++) {
                Z7637734454282223795 z76377344542822237952 = (Z7637734454282223795) objArr2[i3];
                if (j17191566391535857141 == z76377344542822237952.d && (h7219028874700587498 = z76377344542822237952.c) != null) {
                    z76377344542822237952.c = null;
                    h7219028874700587498.resumeWith(y1086209215650239921);
                }
            }
            this.w.i();
        } catch (Throwable th) {
            this.w.i();
            throw th;
        }
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
