package dev.epro.r0;

import ads_mobile_sdk.q9;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageInfo;
import android.view.KeyEvent;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V1475975160983963926 {
    public static final H2594219511033957437 a;
    public static final H2594219511033957437 b;
    public static final L11948343786350204717 c;
    public static final E17149812035295265804 d;
    public static final M10846389789027735899 e;
    public static final J3301701597851028733 f;
    public static final Y4261039727803185691 g;
    public static final Y4261039727803185691 h;
    public static final Y4261039727803185691 i;
    public static final float j;
    public static final Y4261039727803185691 k;
    public static final E17149812035295265804 l;
    public static final Object m;
    public static final Z14997871575210439922 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Z7022156542152740569 f535o;
    public static Z7022156542152740569 p;
    public static Z7022156542152740569 q;
    public static Z7022156542152740569 r;

    /* JADX WARN: Code restructure failed: missing block: B:47:0x007d, code lost:
    
        r2 = java.lang.Math.max(r2, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A(java.nio.ByteBuffer r9) throws dev.epro.r0.T8357592731553964110 {
        /*
            dev.epro.r0.I18375393507362144511 r0 = new dev.epro.r0.I18375393507362144511     // Catch: dev.epro.r0.I3603276906376719046 -> L87
            r0.<init>(r9)     // Catch: dev.epro.r0.I3603276906376719046 -> L87
            byte r9 = r0.e     // Catch: dev.epro.r0.I3603276906376719046 -> L87
            r1 = 1
            r2 = r1
        L9:
            r3 = 2
            if (r9 == r3) goto L86
            r4 = 3
            if (r9 != r4) goto L81
            int r9 = r0.d     // Catch: dev.epro.r0.I3603276906376719046 -> L87
            if (r9 != r3) goto L81
            java.lang.String r9 = "uses-sdk"
            byte r5 = r0.e     // Catch: dev.epro.r0.I3603276906376719046 -> L87
            r6 = 0
            r7 = 4
            if (r5 == r4) goto L1f
            if (r5 == r7) goto L1f
            r5 = r6
            goto L21
        L1f:
            java.lang.String r5 = r0.f     // Catch: dev.epro.r0.I3603276906376719046 -> L87
        L21:
            boolean r9 = r9.equals(r5)     // Catch: dev.epro.r0.I3603276906376719046 -> L87
            if (r9 == 0) goto L81
            byte r9 = r0.e     // Catch: dev.epro.r0.I3603276906376719046 -> L87
            if (r9 == r4) goto L2e
            if (r9 == r7) goto L2e
            goto L30
        L2e:
            java.lang.String r6 = r0.g     // Catch: dev.epro.r0.I3603276906376719046 -> L87
        L30:
            boolean r9 = r6.isEmpty()     // Catch: dev.epro.r0.I3603276906376719046 -> L87
            if (r9 == 0) goto L81
            r9 = 0
            r5 = r9
        L38:
            byte r6 = r0.e     // Catch: dev.epro.r0.I3603276906376719046 -> L87
            if (r6 == r4) goto L3e
            r6 = -1
            goto L40
        L3e:
            int r6 = r0.h     // Catch: dev.epro.r0.I3603276906376719046 -> L87
        L40:
            if (r5 >= r6) goto L7c
            int r6 = r0.c(r5)     // Catch: dev.epro.r0.I3603276906376719046 -> L87
            r8 = 16843276(0x101020c, float:2.3695027E-38)
            if (r6 != r8) goto L79
            dev.epro.r0.V17270971036940711241 r6 = r0.a(r5)     // Catch: dev.epro.r0.I3603276906376719046 -> L87
            int r6 = r6.b     // Catch: dev.epro.r0.I3603276906376719046 -> L87
            if (r6 == r1) goto L5f
            if (r6 == r4) goto L5e
            switch(r6) {
                case 16: goto L5c;
                case 17: goto L5c;
                case 18: goto L5a;
                default: goto L58;
            }     // Catch: dev.epro.r0.I3603276906376719046 -> L87
        L58:
            r4 = r9
            goto L5f
        L5a:
            r4 = r7
            goto L5f
        L5c:
            r4 = r3
            goto L5f
        L5e:
            r4 = r1
        L5f:
            if (r4 == r1) goto L70
            if (r4 != r3) goto L68
            int r9 = r0.b(r5)     // Catch: dev.epro.r0.I3603276906376719046 -> L87
            goto L7d
        L68:
            dev.epro.r0.T8357592731553964110 r9 = new dev.epro.r0.T8357592731553964110     // Catch: dev.epro.r0.I3603276906376719046 -> L87
            java.lang.String r0 = "Unable to determine APK's minimum supported Android: unsupported value type in AndroidManifest.xml's minSdkVersion. Only integer values supported."
            r9.<init>(r0)     // Catch: dev.epro.r0.I3603276906376719046 -> L87
            throw r9     // Catch: dev.epro.r0.I3603276906376719046 -> L87
        L70:
            java.lang.String r9 = r0.d(r5)     // Catch: dev.epro.r0.I3603276906376719046 -> L87
            int r9 = z(r9)     // Catch: dev.epro.r0.I3603276906376719046 -> L87
            goto L7d
        L79:
            int r5 = r5 + 1
            goto L38
        L7c:
            r9 = r1
        L7d:
            int r2 = java.lang.Math.max(r2, r9)     // Catch: dev.epro.r0.I3603276906376719046 -> L87
        L81:
            int r9 = r0.e()     // Catch: dev.epro.r0.I3603276906376719046 -> L87
            goto L9
        L86:
            return r2
        L87:
            r9 = move-exception
            dev.epro.r0.T8357592731553964110 r0 = new dev.epro.r0.T8357592731553964110
            java.lang.String r1 = "Unable to determine APK's minimum supported Android platform version: malformed binary resource: AndroidManifest.xml"
            r0.<init>(r1, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V1475975160983963926.A(java.nio.ByteBuffer):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
    
        if (r0.e == 3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        r3 = r0.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        if (r9 >= r3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0041, code lost:
    
        r5 = r0.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
    
        if ("package".equals(r5.d.c(r5.a)) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        r3 = r0.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        if (r3 == 3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        if (r3 == 4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005b, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005d, code lost:
    
        r3 = r0.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0063, code lost:
    
        if (r3.isEmpty() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0069, code lost:
    
        return r0.d(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006a, code lost:
    
        r9 = r9 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String B(java.nio.ByteBuffer r9) throws dev.epro.r0.C15632080896631311437 {
        /*
            dev.epro.r0.I18375393507362144511 r0 = new dev.epro.r0.I18375393507362144511     // Catch: dev.epro.r0.I3603276906376719046 -> L73
            r0.<init>(r9)     // Catch: dev.epro.r0.I3603276906376719046 -> L73
            byte r9 = r0.e     // Catch: dev.epro.r0.I3603276906376719046 -> L73
        L7:
            r1 = 2
            r2 = 0
            if (r9 == r1) goto L72
            r1 = 3
            if (r9 != r1) goto L6d
            int r9 = r0.d     // Catch: dev.epro.r0.I3603276906376719046 -> L73
            r3 = 1
            if (r9 != r3) goto L6d
            java.lang.String r9 = "manifest"
            byte r3 = r0.e     // Catch: dev.epro.r0.I3603276906376719046 -> L73
            r4 = 4
            if (r3 == r1) goto L1e
            if (r3 == r4) goto L1e
            r3 = r2
            goto L20
        L1e:
            java.lang.String r3 = r0.f     // Catch: dev.epro.r0.I3603276906376719046 -> L73
        L20:
            boolean r9 = r9.equals(r3)     // Catch: dev.epro.r0.I3603276906376719046 -> L73
            if (r9 == 0) goto L6d
            byte r9 = r0.e     // Catch: dev.epro.r0.I3603276906376719046 -> L73
            if (r9 == r1) goto L2e
            if (r9 == r4) goto L2e
            r9 = r2
            goto L30
        L2e:
            java.lang.String r9 = r0.g     // Catch: dev.epro.r0.I3603276906376719046 -> L73
        L30:
            boolean r9 = r9.isEmpty()     // Catch: dev.epro.r0.I3603276906376719046 -> L73
            if (r9 == 0) goto L6d
            r9 = 0
        L37:
            byte r3 = r0.e     // Catch: dev.epro.r0.I3603276906376719046 -> L73
            if (r3 == r1) goto L3d
            r3 = -1
            goto L3f
        L3d:
            int r3 = r0.h     // Catch: dev.epro.r0.I3603276906376719046 -> L73
        L3f:
            if (r9 >= r3) goto L72
            java.lang.String r3 = "package"
            dev.epro.r0.V17270971036940711241 r5 = r0.a(r9)     // Catch: dev.epro.r0.I3603276906376719046 -> L73
            dev.epro.r0.F11254987978987383037 r6 = r5.d     // Catch: dev.epro.r0.I3603276906376719046 -> L73
            long r7 = r5.a     // Catch: dev.epro.r0.I3603276906376719046 -> L73
            java.lang.String r5 = r6.c(r7)     // Catch: dev.epro.r0.I3603276906376719046 -> L73
            boolean r3 = r3.equals(r5)     // Catch: dev.epro.r0.I3603276906376719046 -> L73
            if (r3 == 0) goto L6a
            byte r3 = r0.e     // Catch: dev.epro.r0.I3603276906376719046 -> L73
            if (r3 == r1) goto L5d
            if (r3 == r4) goto L5d
            r3 = r2
            goto L5f
        L5d:
            java.lang.String r3 = r0.g     // Catch: dev.epro.r0.I3603276906376719046 -> L73
        L5f:
            boolean r3 = r3.isEmpty()     // Catch: dev.epro.r0.I3603276906376719046 -> L73
            if (r3 == 0) goto L6a
            java.lang.String r9 = r0.d(r9)     // Catch: dev.epro.r0.I3603276906376719046 -> L73
            return r9
        L6a:
            int r9 = r9 + 1
            goto L37
        L6d:
            int r9 = r0.e()     // Catch: dev.epro.r0.I3603276906376719046 -> L73
            goto L7
        L72:
            return r2
        L73:
            r9 = move-exception
            dev.epro.r0.C15632080896631311437 r0 = new dev.epro.r0.C15632080896631311437
            java.lang.String r1 = "Unable to determine APK package name: malformed binary resource: AndroidManifest.xml"
            r0.<init>(r1, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V1475975160983963926.B(java.nio.ByteBuffer):java.lang.String");
    }

    public static final native int C(int i2, String str, Map map);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void D(V6844203142031704410 v6844203142031704410) {
        if (((R15896830329318850690) v6844203142031704410).a.n) {
            R7033599853981556291.P(v6844203142031704410, 1).m1();
        }
    }

    public static final boolean E(KeyEvent keyEvent) {
        long J = D15445857918358799638.J(keyEvent);
        int i2 = N6199192456012754706.O;
        return N6199192456012754706.a(J, N6199192456012754706.h) || N6199192456012754706.a(J, N6199192456012754706.r) || N6199192456012754706.a(J, N6199192456012754706.E);
    }

    public static final I1722681268793429505 F(I1722681268793429505 i1722681268793429505, Object obj) {
        return i1722681268793429505.Q0(new R4942062994321361325(obj));
    }

    public static final native Object G(Exception exc);

    public static void H(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static String I(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
        P5124777957357031757 p5124777957357031757 = P5124777957357031757.d;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        encoded.getClass();
        P5124777957357031757 p5124777957357031757Y = J3301701597851028733.y(encoded);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(p5124777957357031757Y.a, 0, p5124777957357031757Y.b());
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return "sha256/".concat(new P5124777957357031757(bArrDigest).a());
    }

    public static void J(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i8;
        }
    }

    public static void K(int i2, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float fMax = (i2 - i4) / Math.max(iArr.length - 1, 1);
        float f2 = (z && iArr.length == 1) ? fMax : 0.0f;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                iArr2[length] = Math.round(f2);
                f2 += i6 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i7 = 0;
        while (i3 < length2) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f2);
            f2 += i8 + fMax;
            i3++;
            i7++;
        }
    }

    public static void L(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = (i2 - i4) / (iArr.length + 1);
        if (z) {
            float f2 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i6 = iArr[length2];
                iArr2[length2] = Math.round(f2);
                f2 += i6 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f3 = length;
        int i7 = 0;
        while (i3 < length3) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f3);
            f3 += i8 + length;
            i3++;
            i7++;
        }
    }

    public static final long M(long j2, long j3) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) + ((int) (j3 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + ((int) (j3 & 4294967295L)))) & 4294967295L);
    }

    public static final D13766921851167432738 N(E3422549137300678133 e3422549137300678133, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2) {
        Object obj;
        V4416135141588678913.v(e3422549137300678133, m3727281027331139839);
        Object objV = V4416135141588678913.v(f4096073349764486348, m3727281027331139839);
        Object[] objArr = new Object[0];
        Object objM = m3727281027331139839.M();
        Object obj2 = O9023047933786425027.a;
        if (objM == obj2) {
            objM = new G5865513469313204166((byte) 1);
            m3727281027331139839.k0(objM);
        }
        Object obj3 = (String) C468629748621011703.k(objArr, (B13729205492206812220) objM, m3727281027331139839, 48);
        H5360721299395888827 h5360721299395888827 = (H5360721299395888827) m3727281027331139839.j(C17876869684850709537.a);
        if (h5360721299395888827 == null) {
            m3727281027331139839.a0(1213380307);
            Object baseContext = (Context) m3727281027331139839.j(T15795698139970521497.b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof H5360721299395888827) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            h5360721299395888827 = (H5360721299395888827) baseContext;
        } else {
            m3727281027331139839.a0(1213379439);
        }
        m3727281027331139839.q(false);
        if (h5360721299395888827 == null) {
            S10973172697741180971.m("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        Object objH = h5360721299395888827.h();
        Object objM2 = m3727281027331139839.M();
        if (objM2 == obj2) {
            objM2 = new I14541140868895480020();
            m3727281027331139839.k0(objM2);
        }
        I14541140868895480020 i14541140868895480020 = (I14541140868895480020) objM2;
        Object objM3 = m3727281027331139839.M();
        if (objM3 == obj2) {
            objM3 = new D13766921851167432738(i14541140868895480020);
            m3727281027331139839.k0(objM3);
        }
        D13766921851167432738 d13766921851167432738 = (D13766921851167432738) objM3;
        boolean zH = m3727281027331139839.h(i14541140868895480020) | m3727281027331139839.h(objH) | m3727281027331139839.f(obj3) | m3727281027331139839.h(e3422549137300678133) | m3727281027331139839.f(objV);
        Object objM4 = m3727281027331139839.M();
        if (zH || objM4 == obj2) {
            obj = e3422549137300678133;
            objM4 = new O15179950344889198026((Object) i14541140868895480020, objH, obj3, obj, objV, (byte) 0);
            m3727281027331139839.k0(objM4);
        } else {
            obj = e3422549137300678133;
        }
        F4096073349764486348 f40960733497644863482 = (F4096073349764486348) objM4;
        boolean zF = m3727281027331139839.f(objH) | m3727281027331139839.f(obj3) | m3727281027331139839.f(obj);
        Object objM5 = m3727281027331139839.M();
        if (zF || objM5 == obj2) {
            objM5 = new I8347111651163613119(f40960733497644863482);
            m3727281027331139839.k0(objM5);
        }
        return d13766921851167432738;
    }

    public static final long O(long j2) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j2 >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x01ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v69, types: [dev.epro.r0.V12242721515760750181[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23, types: [int] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void P(android.content.Context r18, java.util.concurrent.Executor r19, dev.epro.r0.O16368343340005843063 r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V1475975160983963926.P(android.content.Context, java.util.concurrent.Executor, dev.epro.r0.O16368343340005843063, boolean):void");
    }

    public static final native void a(Set set, F4096073349764486348 f4096073349764486348, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(boolean r25, dev.epro.r0.F4096073349764486348 r26, dev.epro.r0.I1722681268793429505 r27, dev.epro.r0.T15443218846549482730 r28, dev.epro.r0.M3727281027331139839 r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V1475975160983963926.b(boolean, dev.epro.r0.F4096073349764486348, dev.epro.r0.I1722681268793429505, dev.epro.r0.T15443218846549482730, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    public static final void c(O10206500821474463585 o10206500821474463585, I1722681268793429505 i1722681268793429505, W5896017744614017491 w5896017744614017491, T1241271073913685060 t1241271073913685060, A6527624962738679687 a6527624962738679687, B13906740428466697912 b13906740428466697912, J3971902247911265635 j3971902247911265635, boolean z, N11829648573770870927 n11829648573770870927, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2) {
        I1722681268793429505 i17226812687934295052;
        T1241271073913685060 t12412710739136850602;
        J3971902247911265635 j39719022479112656352;
        boolean z2;
        N11829648573770870927 n118296485737708709272;
        T1241271073913685060 d6962450040782876658;
        N11829648573770870927 n11829648573770870927B;
        int i3;
        J3971902247911265635 j39719022479112656353;
        int i4;
        boolean z3;
        B13906740428466697912 b139067404284666979122;
        m3727281027331139839.b0(-2072102870);
        int i5 = i2 | (m3727281027331139839.f(o10206500821474463585) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i17226812687934295052 = i1722681268793429505;
            i5 |= m3727281027331139839.f(i17226812687934295052) ? 32 : 16;
        } else {
            i17226812687934295052 = i1722681268793429505;
        }
        int i6 = i5 | (m3727281027331139839.f(w5896017744614017491) ? 256 : 128) | 373320704;
        int i7 = m3727281027331139839.h(f4096073349764486348) ? 4 : 2;
        if (m3727281027331139839.R(i6 & 1, ((306783379 & i6) == 306783378 && (i7 & 3) == 2) ? false : true)) {
            m3727281027331139839.W();
            int i8 = i2 & 1;
            Object obj = O9023047933786425027.a;
            if (i8 == 0 || m3727281027331139839.z()) {
                d6962450040782876658 = new D6962450040782876658(0.0f, 0.0f, 0.0f, 0.0f);
                X14364139104409853146 x14364139104409853146A = O13877966917012660236.a(m3727281027331139839);
                boolean zF = m3727281027331139839.f(x14364139104409853146A);
                Object objM = m3727281027331139839.M();
                if (zF || objM == obj) {
                    objM = new F12226692988277696362(x14364139104409853146A);
                    m3727281027331139839.k0(objM);
                }
                n11829648573770870927B = F12841283984235263986.b(m3727281027331139839);
                i3 = i7;
                j39719022479112656353 = (F12226692988277696362) objM;
                i4 = i6 & (-1908408321);
                z3 = true;
            } else {
                m3727281027331139839.U();
                d6962450040782876658 = t1241271073913685060;
                n11829648573770870927B = n11829648573770870927;
                i4 = i6 & (-1908408321);
                i3 = i7;
                j39719022479112656353 = j3971902247911265635;
                z3 = z;
            }
            m3727281027331139839.r();
            int i9 = (i4 & 14) | 48;
            boolean z4 = (((i9 & 14) ^ 6) > 4 && m3727281027331139839.f(o10206500821474463585)) || (i9 & 6) == 4;
            Object objM2 = m3727281027331139839.M();
            if (z4 || objM2 == obj) {
                b139067404284666979122 = b13906740428466697912;
                objM2 = new Y11743982849937672487(new B1246560328695757114(o10206500821474463585, b139067404284666979122, (byte) 2));
                m3727281027331139839.k0(objM2);
            } else {
                b139067404284666979122 = b13906740428466697912;
            }
            int i10 = i4 >> 3;
            int i11 = (i10 & 14) | 196608;
            N11829648573770870927 n118296485737708709273 = n11829648573770870927B;
            T1241271073913685060 t12412710739136850603 = d6962450040782876658;
            boolean z5 = z3;
            C775827382551829194.l(i17226812687934295052, w5896017744614017491, (Y11743982849937672487) objM2, t12412710739136850603, j39719022479112656353, z5, n118296485737708709273, a6527624962738679687, b139067404284666979122, f4096073349764486348, m3727281027331139839, (i10 & 112) | i11 | 817916928, 6 | ((i3 << 3) & 112));
            t12412710739136850602 = t12412710739136850603;
            n118296485737708709272 = n118296485737708709273;
            z2 = z5;
            j39719022479112656352 = j39719022479112656353;
        } else {
            m3727281027331139839.U();
            t12412710739136850602 = t1241271073913685060;
            j39719022479112656352 = j3971902247911265635;
            z2 = z;
            n118296485737708709272 = n11829648573770870927;
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new I2482465896198927795(o10206500821474463585, i1722681268793429505, w5896017744614017491, t12412710739136850602, a6527624962738679687, b13906740428466697912, j39719022479112656352, z2, n118296485737708709272, f4096073349764486348, i2);
        }
    }

    public static final native void d(F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void e(O16976014510051314574 o16976014510051314574, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void f(int i2, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, String str);

    public static final native void g(R6894569913291645384 r6894569913291645384, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void h(G5228233348020726252 g5228233348020726252, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void i(Q7430090668634766253 q7430090668634766253, T12100831175298321930 t12100831175298321930, int i2, B13729205492206812220 b13729205492206812220, I1722681268793429505 i1722681268793429505, boolean z, boolean z2, M3727281027331139839 m3727281027331139839, int i3, int i4);

    public static q9 j(int i2) throws Exception {
        q9 q9Var = (q9) q9.c.get(Integer.valueOf(i2));
        if (q9Var != null) {
            return q9Var;
        }
        throw new Exception("Invalid for value enum " + V1475975160983963926.class.getName() + ": " + i2);
    }

    public static final native T10722827393820565395 k(G1166402862991950746 g1166402862991950746, Throwable th);

    public static final boolean l(Z7637734454282223795 z7637734454282223795) {
        List list = z7637734454282223795.e.t.a;
        int size = list.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (((N13196868278329319633) list.get(i2)).d) {
                z = true;
                break;
            }
            i2++;
        }
        return !z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (l(r6) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:19:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(dev.epro.r0.Z7637734454282223795 r6, dev.epro.r0.J17191566391535857141 r7, dev.epro.r0.B401944902727389462 r8) {
        /*
            boolean r0 = r8 instanceof dev.epro.r0.C14160250379444125946
            if (r0 == 0) goto L13
            r0 = r8
            dev.epro.r0.C14160250379444125946 r0 = (dev.epro.r0.C14160250379444125946) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            dev.epro.r0.C14160250379444125946 r0 = new dev.epro.r0.C14160250379444125946
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.v
            int r1 = r0.w
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            dev.epro.r0.J17191566391535857141 r6 = r0.u
            dev.epro.r0.Z7637734454282223795 r7 = r0.t
            dev.epro.r0.E17665849472693074628.k(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L4b
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            r6 = 0
            return r6
        L33:
            dev.epro.r0.E17665849472693074628.k(r8)
            boolean r8 = l(r6)
            if (r8 != 0) goto L64
        L3c:
            r0.t = r6
            r0.u = r7
            r0.w = r2
            java.lang.Object r8 = r6.a(r7, r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r8 != r1) goto L4b
            return r1
        L4b:
            dev.epro.r0.Y1086209215650239921 r8 = (dev.epro.r0.Y1086209215650239921) r8
            java.util.List r8 = r8.a
            int r1 = r8.size()
            r3 = 0
        L54:
            if (r3 >= r1) goto L64
            java.lang.Object r4 = r8.get(r3)
            dev.epro.r0.N13196868278329319633 r4 = (dev.epro.r0.N13196868278329319633) r4
            boolean r4 = r4.d
            if (r4 == 0) goto L61
            goto L3c
        L61:
            int r3 = r3 + 1
            goto L54
        L64:
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V1475975160983963926.m(dev.epro.r0.Z7637734454282223795, dev.epro.r0.J17191566391535857141, dev.epro.r0.B401944902727389462):java.lang.Object");
    }

    public static final Object n(S14157914735975478504 s14157914735975478504, L12639328004344855510 l12639328004344855510, R4833348786910499294 r4833348786910499294) {
        Object objH1 = ((P9733793856018248168) s14157914735975478504).h1(new M4874962628954682344(r4833348786910499294.getContext(), l12639328004344855510, null, (byte) 1), r4833348786910499294);
        return objH1 == Z3437138737604933638.a ? objH1 : O9245300239821758723.a;
    }

    public static final ArrayList o(int i2, int i3, int i4) {
        int i5 = i2 - ((i3 - 1) * i4);
        int i6 = i5 / i3;
        int i7 = i5 % i3;
        ArrayList arrayList = new ArrayList(i3);
        int i8 = 0;
        while (i8 < i3) {
            arrayList.add(Integer.valueOf((i8 < i7 ? 1 : 0) + i6));
            i8++;
        }
        return arrayList;
    }

    public static final Object p(E8321115364184429049 e8321115364184429049, int i2) {
        Object obj;
        e8321115364184429049.getClass();
        int iO = I3887072968740112330.o(e8321115364184429049.d, i2, e8321115364184429049.b);
        if (iO < 0 || (obj = e8321115364184429049.c[iO]) == m) {
            return null;
        }
        return obj;
    }

    public static final native int q(Q13589697022030407439 q13589697022030407439);

    public static final boolean r(S6349823729575121924 s6349823729575121924, float f2, float f3) {
        float f4 = s6349823729575121924.a;
        if (f2 > s6349823729575121924.c || f4 > f2) {
            return false;
        }
        return f3 <= s6349823729575121924.d && s6349823729575121924.b <= f3;
    }

    public static boolean s(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = s(file2) && z;
        }
        return z;
    }

    public static boolean t(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static J13328905385734298453 u(Y12887846282176508602 y12887846282176508602) throws G3596274300958059526 {
        C16290937579972779475 c16290937579972779475G;
        if (y12887846282176508602.size() < 22) {
            c16290937579972779475G = null;
        } else {
            C16290937579972779475 c16290937579972779475G2 = T3224757362656795885.g(y12887846282176508602, 0);
            c16290937579972779475G = c16290937579972779475G2 != null ? c16290937579972779475G2 : T3224757362656795885.g(y12887846282176508602, 65535);
        }
        if (c16290937579972779475G == null) {
            throw new G3596274300958059526("ZIP End of Central Directory record not found");
        }
        ByteBuffer byteBuffer = (ByteBuffer) c16290937579972779475G.a;
        long jLongValue = ((Long) c16290937579972779475G.b).longValue();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        T3224757362656795885.d(byteBuffer);
        long j2 = ((long) byteBuffer.getInt(byteBuffer.position() + 16)) & 4294967295L;
        if (j2 > jLongValue) {
            StringBuilder sbR = E12098517352909843120.r("ZIP Central Directory start offset out of range: ", ". ZIP End of Central Directory offset: ", j2);
            sbR.append(jLongValue);
            throw new G3596274300958059526(sbR.toString());
        }
        T3224757362656795885.d(byteBuffer);
        long j3 = ((long) byteBuffer.getInt(byteBuffer.position() + 12)) & 4294967295L;
        long j4 = j2 + j3;
        if (j4 <= jLongValue) {
            T3224757362656795885.d(byteBuffer);
            return new J13328905385734298453(j2, j3, byteBuffer.getShort(byteBuffer.position() + 10) & 65535, jLongValue, byteBuffer);
        }
        StringBuilder sbR2 = E12098517352909843120.r("ZIP Central Directory overlaps with End of Central Directory. CD end: ", ", EoCD start: ", j4);
        sbR2.append(jLongValue);
        throw new G3596274300958059526(sbR2.toString());
    }

    public static final void v(E8321115364184429049 e8321115364184429049) {
        int i2 = e8321115364184429049.d;
        int[] iArr = e8321115364184429049.b;
        Object[] objArr = e8321115364184429049.c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != m) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        e8321115364184429049.a = false;
        e8321115364184429049.d = i3;
    }

    public static ByteBuffer w(Y12887846282176508602 y12887846282176508602) throws C15632080896631311437 {
        X13396380553427713373 x13396380553427713373;
        try {
            J13328905385734298453 j13328905385734298453U = u(y12887846282176508602);
            String[] strArr = J5891810409609129928.a;
            ArrayList arrayListL = T3224757362656795885.l(y12887846282176508602, j13328905385734298453U);
            int size = arrayListL.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    x13396380553427713373 = null;
                    break;
                }
                Object obj = arrayListL.get(i2);
                i2++;
                x13396380553427713373 = (X13396380553427713373) obj;
                if ("AndroidManifest.xml".equals(x13396380553427713373.g)) {
                    break;
                }
            }
            if (x13396380553427713373 == null) {
                throw new C15632080896631311437("Missing AndroidManifest.xml");
            }
            B11059234153875532973 b11059234153875532973E = y12887846282176508602.e(0L, j13328905385734298453U.a);
            try {
                return ByteBuffer.wrap(Z10210542706506868338.a(b11059234153875532973E, x13396380553427713373, ((Y12887846282176508602) b11059234153875532973E).size()));
            } catch (G3596274300958059526 e2) {
                throw new C15632080896631311437("Failed to read AndroidManifest.xml", e2);
            }
        } catch (G3596274300958059526 e3) {
            throw new C15632080896631311437("Not a valid ZIP archive", e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0089, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int x(java.nio.ByteBuffer r9, java.lang.String r10, int r11) throws dev.epro.r0.C15632080896631311437 {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V1475975160983963926.x(java.nio.ByteBuffer, java.lang.String, int):int");
    }

    public static final Object y(G17613326942144185441 g17613326942144185441) {
        Object objK = g17613326942144185441.k();
        V2011418798970996039 v2011418798970996039 = objK instanceof V2011418798970996039 ? (V2011418798970996039) objK : null;
        if (v2011418798970996039 != null) {
            return v2011418798970996039.f541o;
        }
        return null;
    }

    public static int z(String str) throws Z5785049269874273963 {
        char cCharAt = str.isEmpty() ? ' ' : str.charAt(0);
        if (cCharAt < 'A' || cCharAt > 'Z') {
            throw new Z5785049269874273963(G6547577305291411977.s("Unable to determine APK's minimum supported Android platform version : Unsupported codename in AndroidManifest.xml's minSdkVersion: \"", str, "\""));
        }
        C16290937579972779475[] c16290937579972779475Arr = B11964701839924937722.a;
        int iBinarySearch = Arrays.binarySearch(c16290937579972779475Arr, new C16290937579972779475(Character.valueOf(cCharAt), null), B11964701839924937722.b);
        if (iBinarySearch >= 0) {
            return ((Integer) c16290937579972779475Arr[iBinarySearch].b).intValue();
        }
        if ((-1) - iBinarySearch == 0) {
            return 1;
        }
        C16290937579972779475 c16290937579972779475 = c16290937579972779475Arr[(-2) - iBinarySearch];
        return (cCharAt - ((Character) c16290937579972779475.a).charValue()) + ((Integer) c16290937579972779475.b).intValue();
    }

    static {
        izmyclvb.qgayjvbiagej2(2030);
        a = new H2594219511033957437((byte) 3);
        byte b2 = 2;
        b = new H2594219511033957437(b2);
        c = new L11948343786350204717();
        byte b3 = 1;
        d = new E17149812035295265804(b3);
        e = new M10846389789027735899(b2);
        f = new J3301701597851028733(b3);
        g = Y4261039727803185691.q;
        Y4261039727803185691 y4261039727803185691 = Y4261039727803185691.h;
        h = y4261039727803185691;
        i = y4261039727803185691;
        j = 1.0f;
        k = Y4261039727803185691.g;
        l = new E17149812035295265804((byte) 21);
        m = new Object();
        n = new Z14997871575210439922((byte) 24);
    }
}
