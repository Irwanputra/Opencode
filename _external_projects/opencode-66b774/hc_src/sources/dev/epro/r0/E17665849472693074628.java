package dev.epro.r0;

import ads_mobile_sdk.z1;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.security.MessageDigest;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes.dex */
public abstract class E17665849472693074628 {
    static {
        izmyclvb.oeynnivvrnts0(120);
    }

    public static final native void a(F16705069398168805061 f16705069398168805061, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i);

    public static String b(z1 z1Var, int i, long j, Integer num) {
        int i2;
        if (i == 0) {
            throw null;
        }
        if (z1Var == null) {
            return "";
        }
        String str = z1Var.m0;
        String str2 = z1Var.n;
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
        String str3 = str2 + "." + i2 + "." + E17093345031926825464.e(j);
        if (str.length() > 0) {
            str3 = G6547577305291411977.s(str3, ".", str);
            if (num != null) {
                return str3 + "." + num;
            }
        }
        return str3;
    }

    public static final byte[] c(byte[] bArr, byte[] bArr2) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(new byte[]{0, 0, 0, 16});
        messageDigest.update(bArr);
        messageDigest.update(bArr2);
        byte[] digest = messageDigest.digest();
        if (digest.length < 4) {
            return null;
        }
        return new byte[]{0, digest[0], digest[1], digest[2], digest[3]};
    }

    public static final C10696704014433963524 d(Throwable th) {
        th.getClass();
        return new C10696704014433963524(th);
    }

    public static final long e(Q17957571128037780363 q17957571128037780363, int i, boolean z, boolean z2) {
        V11538895333762958192 v11538895333762958192 = q17957571128037780363.b;
        long j = q17957571128037780363.c;
        if (v11538895333762958192.d(i) >= v11538895333762958192.f) {
            return 9205357640488583168L;
        }
        return (Float.floatToRawIntBits(W7808703833045379622.p(q17957571128037780363.e(i, q17957571128037780363.a(((!z || z2) && (z || !z2)) ? Math.max(i + (-1), 0) : i) == q17957571128037780363.i(i)), 0.0f, (int) (j >> 32))) << 32) | (Float.floatToRawIntBits(W7808703833045379622.p(v11538895333762958192.b(r3), 0.0f, (int) (j & 4294967295L))) & 4294967295L);
    }

    public static String f(String str, Object... objArr) {
        int indexOf;
        String str2;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e) {
                    String str3 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    logger.getClass();
                    str2 = "<" + str3 + " threw " + e.getClass().getName() + ">";
                }
            }
            objArr[i2] = str2;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i3, str.length());
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

    public static final native int g(Map map);

    public static final native int h(Map map);

    public static void i(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            G4756000168812988315.f(window, z);
        } else {
            if (i >= 30) {
                G4756000168812988315.e(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final native String j(Throwable th);

    public static final void k(Object obj) {
        if (obj instanceof C10696704014433963524) {
            throw ((C10696704014433963524) obj).a;
        }
    }

    public static final long l(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final native Object m(L12602321637077960189 l12602321637077960189, K14749510448791472029 k14749510448791472029);
}
