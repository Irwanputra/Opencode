package dev.epro.r0;

import android.content.Context;
import android.view.View;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public abstract class G16660188620551127941 {
    public static ClassLoader a;
    public static Thread b;
    public static final F17594658268783405200 c;
    public static final I13087925019311684776[] d;
    public static final Y4261039727803185691 e;
    public static final int[] f;
    public static final Z14997871575210439922 g;
    public static Z7022156542152740569 h;
    public static Z7022156542152740569 i;
    public static Z7022156542152740569 j;

    static {
        int otdsvkjdlkde;
        izmyclvb.dpqpjfpoanwt1(219);
        Object[] objArr = new Object[5];
        while (true) {
            try {
                otdsvkjdlkde = otdsvkjdlkde(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (otdsvkjdlkde != 0) {
                switch (otdsvkjdlkde) {
                    case 1:
                        c = (F17594658268783405200) objArr[1];
                        continue;
                    case 2:
                        d = (I13087925019311684776[]) objArr[1];
                        continue;
                    case 3:
                        e = (Y4261039727803185691) objArr[1];
                        continue;
                    case 4:
                        f = (int[]) objArr[1];
                        continue;
                    case 5:
                        g = (Z14997871575210439922) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static BigInteger A(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public static final G8001132634698687269 B(J196785984016436306 j196785984016436306, boolean z, K14749510448791472029 k14749510448791472029) {
        B8553891759473824940 b8553891759473824940 = (B8553891759473824940) k14749510448791472029.getContext().get(B8553891759473824940.b);
        G8001132634698687269 g8001132634698687269 = b8553891759473824940 != null ? b8553891759473824940.a : null;
        if (!j196785984016436306.k()) {
            A2789795882633926065 a2789795882633926065 = j196785984016436306.a;
            if (a2789795882633926065 == null) {
                S10823041268949770285.b0("coroutineScope");
                throw null;
            }
            G8001132634698687269 g80011326346986872692 = a2789795882633926065.a;
            if (g8001132634698687269 == null) {
                g8001132634698687269 = I3826119971291161142.a;
            }
            return g80011326346986872692.plus(g8001132634698687269);
        }
        if (g8001132634698687269 != null) {
            A2789795882633926065 a27897958826339260652 = j196785984016436306.a;
            if (a27897958826339260652 != null) {
                return a27897958826339260652.a.plus(g8001132634698687269);
            }
            S10823041268949770285.b0("coroutineScope");
            throw null;
        }
        if (z) {
            G8001132634698687269 g80011326346986872693 = j196785984016436306.b;
            if (g80011326346986872693 != null) {
                return g80011326346986872693;
            }
            S10823041268949770285.b0("transactionContext");
            throw null;
        }
        A2789795882633926065 a27897958826339260653 = j196785984016436306.a;
        if (a27897958826339260653 != null) {
            return a27897958826339260653.a;
        }
        S10823041268949770285.b0("coroutineScope");
        throw null;
    }

    public static final I1722681268793429505 C(I1722681268793429505 i1722681268793429505, F4096073349764486348 f4096073349764486348) {
        return i1722681268793429505.Q0(new J1146268616257771382(f4096073349764486348));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void D(O3606826322388932410 o3606826322388932410, long j2, F4096073349764486348 f4096073349764486348) {
        F14416013867653465450 f14416013867653465450 = new F14416013867653465450(j2);
        N2926609135397098215 n2926609135397098215 = N2926609135397098215.h;
        V12319504402545346730.s(3, n2926609135397098215);
        M15964426641105106347 m15964426641105106347 = new M15964426641105106347(o3606826322388932410, f14416013867653465450, n2926609135397098215, L12370209971704518967.e, Z860808776098365610.h, (R14062301455140331524) f4096073349764486348, null);
        int i2 = O3606826322388932410.g;
        o3606826322388932410.h(m15964426641105106347, false);
    }

    public static final Object E(J196785984016436306 j196785984016436306, boolean z, boolean z2, F4096073349764486348 f4096073349764486348) {
        j196785984016436306.getClass();
        ThreadLocal threadLocal = j196785984016436306.i;
        j196785984016436306.a();
        if (j196785984016436306.k() && !j196785984016436306.l()) {
            G8001132634698687269 g8001132634698687269 = (G8001132634698687269) threadLocal.get();
            if ((g8001132634698687269 != null ? (B8553891759473824940) g8001132634698687269.get(B8553891759473824940.b) : null) != null) {
                S10973172697741180971.m("Cannot access database on a different coroutine context inherited from a suspending transaction.");
                return null;
            }
        }
        G8001132634698687269 g80011326346986872692 = (G8001132634698687269) threadLocal.get();
        if (g80011326346986872692 == null) {
            g80011326346986872692 = I3826119971291161142.a;
        }
        return V16504496955554646429.k(new B16233345865283492429(g80011326346986872692, j196785984016436306, z2, z, f4096073349764486348, (R4833348786910499294) null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008d, code lost:
    
        if (r10 == r7) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(dev.epro.r0.J196785984016436306 r8, dev.epro.r0.T18105441618807534448 r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            boolean r0 = r10 instanceof dev.epro.r0.W4419140550878083945
            if (r0 == 0) goto L13
            r0 = r10
            dev.epro.r0.W4419140550878083945 r0 = (dev.epro.r0.W4419140550878083945) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            dev.epro.r0.W4419140550878083945 r0 = new dev.epro.r0.W4419140550878083945
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.v
            int r1 = r0.w
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L47
            if (r1 == r5) goto L43
            if (r1 == r4) goto L3f
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            dev.epro.r0.E17665849472693074628.k(r10)
            return r10
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return r6
        L37:
            dev.epro.r0.T18105441618807534448 r9 = r0.u
            dev.epro.r0.J196785984016436306 r8 = r0.t
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L90
        L3f:
            dev.epro.r0.E17665849472693074628.k(r10)
            return r10
        L43:
            dev.epro.r0.E17665849472693074628.k(r10)
            return r10
        L47:
            dev.epro.r0.E17665849472693074628.k(r10)
            boolean r10 = r8.k()
            if (r10 == 0) goto L61
            dev.epro.r0.P10410169637657332617 r10 = new dev.epro.r0.P10410169637657332617
            r1 = 8
            r10.<init>(r8, r9, r6, r1)
            r0.w = r5
            java.lang.Object r8 = dev.epro.r0.O8620973563946607355.b0(r0, r10, r8)
            if (r8 != r7) goto L60
            goto La3
        L60:
            return r8
        L61:
            boolean r10 = r8.k()
            if (r10 == 0) goto L83
            boolean r10 = r8.o()
            if (r10 == 0) goto L83
            boolean r10 = r8.l()
            if (r10 == 0) goto L83
            dev.epro.r0.L17941041579542105815 r10 = new dev.epro.r0.L17941041579542105815
            r10.<init>(r8, r6, r9, r5)
            r0.w = r4
            r9 = 0
            java.lang.Object r8 = r8.r(r9, r10, r0)
            if (r8 != r7) goto L82
            goto La3
        L82:
            return r8
        L83:
            r0.t = r8
            r0.u = r9
            r0.w = r3
            dev.epro.r0.G8001132634698687269 r10 = B(r8, r5, r0)
            if (r10 != r7) goto L90
            goto La3
        L90:
            dev.epro.r0.G8001132634698687269 r10 = (dev.epro.r0.G8001132634698687269) r10
            dev.epro.r0.Y14354959068095823168 r1 = new dev.epro.r0.Y14354959068095823168
            r1.<init>(r6, r9, r8)
            r0.t = r6
            r0.u = r6
            r0.w = r2
            java.lang.Object r8 = dev.epro.r0.R7033599853981556291.d0(r10, r1, r0)
            if (r8 != r7) goto La4
        La3:
            return r7
        La4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G16660188620551127941.F(dev.epro.r0.J196785984016436306, dev.epro.r0.T18105441618807534448, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G(dev.epro.r0.R4833348786910499294 r16, dev.epro.r0.J196785984016436306 r17, boolean r18, boolean r19, dev.epro.r0.F4096073349764486348 r20) {
        /*
            r0 = r16
            boolean r1 = r0 instanceof dev.epro.r0.L396170640694521871
            if (r1 == 0) goto L16
            r1 = r0
            dev.epro.r0.L396170640694521871 r1 = (dev.epro.r0.L396170640694521871) r1
            int r2 = r1.y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.y = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            dev.epro.r0.L396170640694521871 r1 = new dev.epro.r0.L396170640694521871
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.x
            int r1 = r7.y
            r2 = 0
            r3 = 3
            r4 = 2
            r8 = 1
            dev.epro.r0.Z3437138737604933638 r9 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L4c
            if (r1 == r8) goto L48
            if (r1 == r4) goto L38
            if (r1 != r3) goto L32
            dev.epro.r0.E17665849472693074628.k(r0)
            return r0
        L32:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r0)
            return r2
        L38:
            boolean r1 = r7.w
            boolean r4 = r7.v
            dev.epro.r0.F4096073349764486348 r5 = r7.u
            dev.epro.r0.J196785984016436306 r6 = r7.t
            dev.epro.r0.E17665849472693074628.k(r0)
            r14 = r1
            r13 = r4
            r15 = r5
            r12 = r6
            goto L9b
        L48:
            dev.epro.r0.E17665849472693074628.k(r0)
            return r0
        L4c:
            dev.epro.r0.E17665849472693074628.k(r0)
            boolean r0 = r17.k()
            if (r0 == 0) goto L7d
            boolean r0 = r17.o()
            if (r0 == 0) goto L7d
            boolean r0 = r17.l()
            if (r0 == 0) goto L7d
            dev.epro.r0.K16053060172215145989 r0 = new dev.epro.r0.K16053060172215145989
            r4 = 0
            r6 = 1
            r3 = r17
            r2 = r18
            r1 = r19
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1 = r2
            r2 = r0
            r0 = r3
            r7.y = r8
            java.lang.Object r0 = r0.r(r1, r2, r7)
            if (r0 != r9) goto L7c
            goto Laf
        L7c:
            return r0
        L7d:
            r0 = r17
            r1 = r18
            r5 = r19
            r7.t = r0
            r6 = r20
            r7.u = r6
            r7.v = r1
            r7.w = r5
            r7.y = r4
            dev.epro.r0.G8001132634698687269 r4 = B(r0, r5, r7)
            if (r4 != r9) goto L96
            goto Laf
        L96:
            r12 = r0
            r13 = r1
            r0 = r4
            r14 = r5
            r15 = r6
        L9b:
            dev.epro.r0.G8001132634698687269 r0 = (dev.epro.r0.G8001132634698687269) r0
            dev.epro.r0.Z15853133007095729891 r10 = new dev.epro.r0.Z15853133007095729891
            r11 = 0
            r10.<init>(r11, r12, r13, r14, r15)
            r7.t = r2
            r7.u = r2
            r7.y = r3
            java.lang.Object r0 = dev.epro.r0.R7033599853981556291.d0(r0, r10, r7)
            if (r0 != r9) goto Lb0
        Laf:
            return r9
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G16660188620551127941.G(dev.epro.r0.R4833348786910499294, dev.epro.r0.J196785984016436306, boolean, boolean, dev.epro.r0.F4096073349764486348):java.lang.Object");
    }

    public static final native Serializable H(F1635012617202830795 f1635012617202830795, L17241509741254134329 l17241509741254134329, V1842106953381793055 v1842106953381793055, K14749510448791472029 k14749510448791472029);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(java.io.File r4, dev.epro.r0.F4096073349764486348 r5, dev.epro.r0.K14749510448791472029 r6) {
        /*
            boolean r0 = r6 instanceof dev.epro.r0.T12729986932251959667
            if (r0 == 0) goto L13
            r0 = r6
            dev.epro.r0.T12729986932251959667 r0 = (dev.epro.r0.T12729986932251959667) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            dev.epro.r0.T12729986932251959667 r0 = new dev.epro.r0.T12729986932251959667
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.u
            int r1 = r0.v
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.io.File r4 = r0.t
            dev.epro.r0.E17665849472693074628.k(r6)     // Catch: java.io.IOException -> L27
            return r6
        L27:
            r5 = move-exception
            goto L41
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            r4 = 0
            return r4
        L30:
            dev.epro.r0.E17665849472693074628.k(r6)
            r0.t = r4     // Catch: java.io.IOException -> L27
            r0.v = r2     // Catch: java.io.IOException -> L27
            java.lang.Object r4 = r5.invoke(r0)     // Catch: java.io.IOException -> L27
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r4 != r5) goto L40
            return r5
        L40:
            return r4
        L41:
            boolean r6 = r5 instanceof dev.epro.r0.G6332201275426833390
            if (r6 != 0) goto La5
            r4.getClass()
            boolean r6 = r4.exists()
            if (r6 == 0) goto La0
            boolean r6 = r4.isFile()
            if (r6 == 0) goto L7a
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L6a
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L65
            java.io.IOException r4 = dev.epro.r0.I3887072968740112330.m(r4, r5)
            goto La4
        L65:
            java.io.IOException r4 = dev.epro.r0.I3887072968740112330.m(r4, r5)
            goto La4
        L6a:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L75
            java.io.IOException r4 = dev.epro.r0.I3887072968740112330.m(r4, r5)
            goto La4
        L75:
            java.io.IOException r4 = dev.epro.r0.I3887072968740112330.m(r4, r5)
            goto La4
        L7a:
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L90
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L8b
            java.io.IOException r4 = dev.epro.r0.I3887072968740112330.m(r4, r5)
            goto La4
        L8b:
            java.io.IOException r4 = dev.epro.r0.I3887072968740112330.m(r4, r5)
            goto La4
        L90:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L9b
            java.io.IOException r4 = dev.epro.r0.I3887072968740112330.m(r4, r5)
            goto La4
        L9b:
            java.io.IOException r4 = dev.epro.r0.I3887072968740112330.m(r4, r5)
            goto La4
        La0:
            java.io.IOException r4 = dev.epro.r0.I3887072968740112330.m(r4, r5)
        La4:
            throw r4
        La5:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G16660188620551127941.I(java.io.File, dev.epro.r0.F4096073349764486348, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public static Object J(B13729205492206812220 b13729205492206812220, K14749510448791472029 k14749510448791472029) {
        return R7033599853981556291.d0(I3826119971291161142.a, new E13942609761711486177(b13729205492206812220, null, (byte) 23), k14749510448791472029);
    }

    public static final native Integer K(A16842337154698931828 a16842337154698931828);

    public static final native Object L(Context context, G2190230421268324049 g2190230421268324049, String str, boolean z, R14062301455140331524 r14062301455140331524);

    public static byte[] M(BigInteger bigInteger, int i2) {
        if (bigInteger.signum() == -1) {
            S10973172697741180971.j("integer must be nonnegative");
            return null;
        }
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i2) {
            return byteArray;
        }
        int i3 = i2 + 1;
        if (byteArray.length > i3) {
            W4415201450379021245.c("integer too large");
            return null;
        }
        if (byteArray.length != i3) {
            byte[] bArr = new byte[i2];
            System.arraycopy(byteArray, 0, bArr, i2 - byteArray.length, byteArray.length);
            return bArr;
        }
        if (byteArray[0] == 0) {
            return Arrays.copyOfRange(byteArray, 1, byteArray.length);
        }
        W4415201450379021245.c("integer too large");
        return null;
    }

    public static String N(long j2) {
        return "PointerId(value=" + j2 + ")";
    }

    public static final native A16842337154698931828 O(A16842337154698931828 a16842337154698931828, String str);

    /* JADX WARN: Code restructure failed: missing block: B:12:0x009d, code lost:
    
        if (r1 == null) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.ClassLoader P() {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G16660188620551127941.P():java.lang.ClassLoader");
    }

    public static final native void a(Integer num, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, I1722681268793429505 i1722681268793429505, float f2, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void b(long j2, W1972671267364756056 w1972671267364756056, W1972671267364756056 w19726712673647560562, W1972671267364756056 w19726712673647560563, W1972671267364756056 w19726712673647560564, W1972671267364756056 w19726712673647560565, W1972671267364756056 w19726712673647560566, W1972671267364756056 w19726712673647560567, W1972671267364756056 w19726712673647560568);

    public static final native void c(int i2, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, Integer num);

    public static final native void d(T10243012841839397329 t10243012841839397329, L2387191309177986288 l2387191309177986288, View view);

    public static final native void e(G17854281415623469737 g17854281415623469737, boolean z, F4096073349764486348 f4096073349764486348, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void f(G17854281415623469737 g17854281415623469737, float f2, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void g(boolean z, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void h(H8673207839164499646 h8673207839164499646, G16768067413993841943 g16768067413993841943, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void i(T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void j(F16371047080953224077 f16371047080953224077, long j2, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, X9670034645768802687 x9670034645768802687, F4096073349764486348 f40960733497644863482, O14970126286626299582 o14970126286626299582, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void k(F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, B13729205492206812220 b13729205492206812220, O14970126286626299582 o14970126286626299582, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void l(F16371047080953224077 f16371047080953224077, E17523205116624666034 e17523205116624666034, int i2, H10681976249452161517 h10681976249452161517, H10681976249452161517 h106819762494521615172, H10681976249452161517 h106819762494521615173, M3727281027331139839 m3727281027331139839, int i3);

    public static final native void m(int i2, M3727281027331139839 m3727281027331139839);

    public static final native void n(O14970126286626299582 o14970126286626299582, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void o(List list, Set set, Set set2, Set set3, boolean z, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, F4096073349764486348 f40960733497644863483, F4096073349764486348 f40960733497644863484, L12639328004344855510 l12639328004344855510, L12639328004344855510 l126393280043448555102, F4096073349764486348 f40960733497644863485, E17523205116624666034 e17523205116624666034, I1722681268793429505 i1722681268793429505, boolean z2, M3727281027331139839 m3727281027331139839, int i2, int i3);

    private static native int otdsvkjdlkde(Object[] objArr);

    public static final native void p(List list, Set set, Set set2, Set set3, boolean z, boolean z2, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, F4096073349764486348 f40960733497644863483, F4096073349764486348 f40960733497644863484, L12639328004344855510 l12639328004344855510, L12639328004344855510 l126393280043448555102, F4096073349764486348 f40960733497644863485, E17523205116624666034 e17523205116624666034, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static final native void q(A14297323445478321382 a14297323445478321382, boolean z, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, F4096073349764486348 f40960733497644863483, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void r(String str, int i2, String str2, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i3);

    public static final native void s(String str, boolean z, boolean z2, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, M3727281027331139839 m3727281027331139839, int i2);

    public static final M7798980774515057476 t(M7798980774515057476 m7798980774515057476) {
        if (m7798980774515057476 == null) {
            m7798980774515057476 = null;
        }
        if (m7798980774515057476 != null) {
            return m7798980774515057476;
        }
        N2332913310205178802.b("Inconsistent composition");
        Z3383101362411723454.n();
        return null;
    }

    public static final G1892398518770611911 u(C6935141804827476266 c6935141804827476266, Y18072866666914382106 y18072866666914382106, V12816289154094534935 v12816289154094534935) {
        int i2;
        A4783298371339261043 a4783298371339261043 = E3422549137300678133.S(y18072866666914382106.a).c;
        D389890677992184566 d389890677992184566 = v12816289154094534935.a;
        int i3 = 1;
        if (!(d389890677992184566.c != 0) && a4783298371339261043.isEmpty()) {
            return R1911624190916196378.a;
        }
        G1892398518770611911 g1892398518770611911 = new G1892398518770611911();
        if (v12816289154094534935.a.c != 0) {
            int i4 = d389890677992184566.c;
            if (i4 == 0) {
                K2042933864045806308.n("MutableVector is empty.");
                return null;
            }
            Object[] objArr = d389890677992184566.a;
            int i5 = ((Q14128584391259813747) objArr[0]).a;
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = ((Q14128584391259813747) objArr[i6]).a;
                if (i7 < i5) {
                    i5 = i7;
                }
            }
            if (i5 < 0) {
                Y16081827717826519461.a("negative minIndex");
            }
            int i8 = d389890677992184566.c;
            if (i8 == 0) {
                K2042933864045806308.n("MutableVector is empty.");
                return null;
            }
            Object[] objArr2 = d389890677992184566.a;
            int i9 = ((Q14128584391259813747) objArr2[0]).b;
            for (int i10 = 0; i10 < i8; i10++) {
                int i11 = ((Q14128584391259813747) objArr2[i10]).b;
                if (i11 > i9) {
                    i9 = i11;
                }
            }
            i2 = Math.min(i9, c6935141804827476266.a() - 1);
            i3 = i5;
        } else {
            i2 = 0;
        }
        int a2 = a4783298371339261043.a();
        for (int i12 = 0; i12 < a2; i12++) {
            U11129743795775183256 u11129743795775183256 = (U11129743795775183256) a4783298371339261043.get(i12);
            int C = E18444280280170001567.C(u11129743795775183256.c, c6935141804827476266, u11129743795775183256.a);
            if ((i3 > C || C > i2) && C >= 0 && C < c6935141804827476266.a()) {
                g1892398518770611911.a(C);
            }
        }
        if (i3 <= i2) {
            while (true) {
                g1892398518770611911.a(i3);
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        int i13 = g1892398518770611911.b;
        if (i13 == 0) {
            return g1892398518770611911;
        }
        int[] iArr = g1892398518770611911.a;
        iArr.getClass();
        Arrays.sort(iArr, 0, i13);
        return g1892398518770611911;
    }

    public static final native Object v(O4934609777781722916 o4934609777781722916, N10368656157487105422 n10368656157487105422, R3973953837743337528 r3973953837743337528, T130893256936620929 t130893256936620929, R4833348786910499294 r4833348786910499294);

    public static final double w(double d2, N13798149404328803870 n13798149404328803870, N13798149404328803870 n137981494043288038702) {
        long convert = n137981494043288038702.a.convert(1L, n13798149404328803870.a);
        return convert > 0 ? d2 * convert : d2 / r8.convert(1L, r9);
    }

    public static final native Integer x(A16842337154698931828 a16842337154698931828, String str);

    public static final boolean y(long j2, long j3) {
        return j2 == j3;
    }

    public static C9610972087028600954 z(C9610972087028600954 c9610972087028600954, F10342546226345611902 f10342546226345611902, S16571168858015125610 s16571168858015125610, R8540738700654750557 r8540738700654750557, U14340554418656580554 u14340554418656580554) {
        if (c9610972087028600954 != null && f10342546226345611902 == c9610972087028600954.a && H4776669175763245653.l(s16571168858015125610, f10342546226345611902).equals(c9610972087028600954.b) && r8540738700654750557.c() == c9610972087028600954.c.a && u14340554418656580554 == c9610972087028600954.d) {
            return c9610972087028600954;
        }
        C9610972087028600954 c96109720870286009542 = C9610972087028600954.h;
        if (c96109720870286009542 != null && f10342546226345611902 == c96109720870286009542.a && H4776669175763245653.l(s16571168858015125610, f10342546226345611902).equals(c96109720870286009542.b) && r8540738700654750557.c() == c96109720870286009542.c.a && u14340554418656580554 == c96109720870286009542.d) {
            return c96109720870286009542;
        }
        C9610972087028600954 c96109720870286009543 = new C9610972087028600954(f10342546226345611902, H4776669175763245653.l(s16571168858015125610, f10342546226345611902), new V14115061890849225617(r8540738700654750557.c(), r8540738700654750557.s()), u14340554418656580554);
        C9610972087028600954.h = c96109720870286009543;
        return c96109720870286009543;
    }
}
