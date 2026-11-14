package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class E17665849472693074628 {
    static {
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(120);
    }

    public static final native void a(dev.epro.r0.F16705069398168805061 f16705069398168805061, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i);

    public static java.lang.String b(ads_mobile_sdk.z1 z1Var, int i, long j, java.lang.Integer num) {
        int i2;
        if (i == 0) {
            throw null;
        }
        if (z1Var == null) {
            return "";
        }
        java.lang.String str = z1Var.m0;
        java.lang.String str2 = z1Var.n;
        switch (i) {
            case 1:
                i2 = 0;
                break;
            case 2:
                i2 = 1;
                break;
            case 3:
                i2 = 2;
                break;
            case 4:
                i2 = 3;
                break;
            case 5:
                i2 = 4;
                break;
            case 6:
                i2 = 5;
                break;
            case 7:
                i2 = 6;
                break;
            case 8:
                i2 = 8;
                break;
            case 9:
                i2 = 9;
                break;
            default:
                throw null;
        }
        java.lang.String strS = str2 + "." + i2 + "." + dev.epro.r0.E17093345031926825464.e(j);
        if (str.length() > 0) {
            strS = dev.epro.r0.G6547577305291411977.s(strS, ".", str);
            if (num != null) {
                return strS + "." + num;
            }
        }
        return strS;
    }

    public static final byte[] c(byte[] bArr, byte[] bArr2) throws java.security.NoSuchAlgorithmException {
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-1");
        messageDigest.update(new byte[]{0, 0, 0, 16});
        messageDigest.update(bArr);
        messageDigest.update(bArr2);
        byte[] bArrDigest = messageDigest.digest();
        if (bArrDigest.length < 4) {
            return null;
        }
        return new byte[]{0, bArrDigest[0], bArrDigest[1], bArrDigest[2], bArrDigest[3]};
    }

    public static final dev.epro.r0.C10696704014433963524 d(java.lang.Throwable th) {
        th.getClass();
        return new dev.epro.r0.C10696704014433963524(th);
    }

    public static final long e(dev.epro.r0.Q17957571128037780363 q17957571128037780363, int i, boolean z, boolean z2) {
        dev.epro.r0.V11538895333762958192 v11538895333762958192 = q17957571128037780363.b;
        long j = q17957571128037780363.c;
        int iD = v11538895333762958192.d(i);
        if (iD >= v11538895333762958192.f) {
            return 9205357640488583168L;
        }
        return (((long) java.lang.Float.floatToRawIntBits(dev.epro.r0.W7808703833045379622.p(q17957571128037780363.e(i, q17957571128037780363.a(((!z || z2) && (z || !z2)) ? java.lang.Math.max(i + (-1), 0) : i) == q17957571128037780363.i(i)), 0.0f, (int) (j >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(dev.epro.r0.W7808703833045379622.p(v11538895333762958192.b(iD), 0.0f, (int) (j & 4294967295L)))) & 4294967295L);
    }

    public static java.lang.String f(java.lang.String str, java.lang.Object... objArr) {
        int iIndexOf;
        java.lang.String string;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            java.lang.Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (java.lang.Exception e) {
                    java.lang.String str2 = obj.getClass().getName() + '@' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
                    java.util.logging.Logger logger = java.util.logging.Logger.getLogger("com.google.common.base.Strings");
                    java.util.logging.Level level = java.util.logging.Level.WARNING;
                    logger.getClass();
                    string = "<" + str2 + " threw " + e.getClass().getName() + ">";
                }
            }
            objArr[i2] = string;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i3)) != -1) {
            sb.append((java.lang.CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((java.lang.CharSequence) str, i3, str.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final native int g(java.util.Map map);

    public static final native int h(java.util.Map map);

    public static void i(android.view.Window window, boolean z) {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 35) {
            dev.epro.r0.G4756000168812988315.f(window, z);
        } else {
            if (i >= 30) {
                dev.epro.r0.G4756000168812988315.e(window, z);
                return;
            }
            android.view.View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final native java.lang.String j(java.lang.Throwable th);

    public static final void k(java.lang.Object obj) {
        if (obj instanceof dev.epro.r0.C10696704014433963524) {
            throw ((dev.epro.r0.C10696704014433963524) obj).a;
        }
    }

    public static final long l(long j, long j2) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j2 >> 32)) * java.lang.Float.intBitsToFloat((int) (j >> 32));
        return (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)) * java.lang.Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final native java.lang.Object m(dev.epro.r0.L12602321637077960189 l12602321637077960189, dev.epro.r0.K14749510448791472029 k14749510448791472029);
}
