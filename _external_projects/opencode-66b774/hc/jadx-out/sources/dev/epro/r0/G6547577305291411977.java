package dev.epro.r0;

import ads_mobile_sdk.cc2;
import ads_mobile_sdk.ji3;
import ads_mobile_sdk.th3;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class G6547577305291411977 {
    public static void A(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void B(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static String C(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ String D(int i) {
        switch (i) {
            case 1:
                return "Alias";
            case 2:
                return "Anchor";
            case 3:
                return "BlockEnd";
            case 4:
                return "BlockEntry";
            case 5:
                return "BlockMappingStart";
            case 6:
                return "BlockSequenceStart";
            case 7:
                return "Directive";
            case 8:
                return "DocumentEnd";
            case 9:
                return "DocumentStart";
            case 10:
                return "FlowEntry";
            case 11:
                return "FlowMappingEnd";
            case 12:
                return "FlowMappingStart";
            case 13:
                return "FlowSequenceEnd";
            case 14:
                return "FlowSequenceStart";
            case 15:
                return "Key";
            case 16:
                return "Scalar";
            case 17:
                return "StreamEnd";
            case 18:
                return "StreamStart";
            case 19:
                return "Tag";
            case 20:
                return "Value";
            case 21:
                return "Whitespace";
            case 22:
                return "Comment";
            case 23:
                return "Error";
            default:
                return "null";
        }
    }

    public static int _a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    public static int _a$1(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 1000 ? 0 : 4;
        }
        return 3;
    }

    public static int _a$2(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static /* synthetic */ boolean a(int i) {
        return i != 1 ? d(i) : c(i);
    }

    public static Number b(int i, D13396727227989475489 d13396727227989475489) {
        if (i == 1) {
            return Double.valueOf(d13396727227989475489.v());
        }
        if (i == 2) {
            return new H1162839155067368006(d13396727227989475489.F());
        }
        if (i == 3) {
            String strF = d13396727227989475489.F();
            if (strF.indexOf(46) >= 0) {
                return e(strF, d13396727227989475489);
            }
            try {
                return Long.valueOf(Long.parseLong(strF));
            } catch (NumberFormatException unused) {
                return e(strF, d13396727227989475489);
            }
        }
        String strF2 = d13396727227989475489.F();
        try {
            return B5998207562248239613.G(strF2);
        } catch (NumberFormatException e) {
            StringBuilder sbG = X2485016533998461232.g("Cannot parse ", strF2, "; at path ");
            sbG.append(d13396727227989475489.o(true));
            throw new J18177443637724208589(sbG.toString(), e);
        }
    }

    public static final boolean c(int i) {
        return !I7816358627352036208.a();
    }

    public static final boolean d(int i) {
        Boolean bool;
        if (I7816358627352036208.a()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (Exception unused) {
                I7816358627352036208.a.getClass();
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static Double e(String str, D13396727227989475489 d13396727227989475489) throws H5369259335675503737 {
        try {
            Double dValueOf = Double.valueOf(str);
            if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                if (d13396727227989475489.f194o != 1) {
                    throw new H5369259335675503737("JSON forbids NaN and infinities: " + dValueOf + "; at path " + d13396727227989475489.o(true));
                }
            }
            return dValueOf;
        } catch (NumberFormatException e) {
            StringBuilder sbG = X2485016533998461232.g("Cannot parse ", str, "; at path ");
            sbG.append(d13396727227989475489.o(true));
            throw new J18177443637724208589(sbG.toString(), e);
        }
    }

    public static /* synthetic */ short f(int i) {
        if (i == 1) {
            return (short) 0;
        }
        if (i == 2) {
            return (short) 1;
        }
        if (i == 3) {
            return (short) 2;
        }
        if (i == 4) {
            return (short) 1000;
        }
        throw null;
    }

    public static /* synthetic */ byte g(int i) {
        if (i == 1) {
            return (byte) 0;
        }
        if (i == 2) {
            return (byte) 1;
        }
        if (i == 3) {
            return (byte) 2;
        }
        if (i == 4) {
            return (byte) 3;
        }
        if (i == 5) {
            return (byte) 4;
        }
        throw null;
    }

    public static int h(int i, int i2, List list) {
        return (list.hashCode() + i) * i2;
    }

    public static int i(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static int j(int i, long j, int i2) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int k(ArrayList arrayList, int i, int i2) {
        return (arrayList.hashCode() + i) * i2;
    }

    public static cc2 l(Exception exc) {
        th3 th3VarA = ji3.a();
        th3VarA.a(exc);
        return th3VarA.e();
    }

    public static ClassCastException m(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String n(int i, String str) {
        return str + i;
    }

    public static String o(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String p(int i, String str, String str2, String str3, String str4) {
        return str + str2 + str3 + i + str4;
    }

    public static String q(S791998171526486711 s791998171526486711, String str, String str2) {
        return M8927913404651150384.D0(s791998171526486711.n(str, str2)).toString();
    }

    public static String r(String str, String str2) {
        return str + str2;
    }

    public static String s(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String t(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String u(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String v(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String w(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static StringBuilder x(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder y(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static /* synthetic */ void z(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            } else {
                K2042933864045806308.h();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }
}
