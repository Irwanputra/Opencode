package ads_mobile_sdk;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.webkit.WebView;
import dev.epro.r0.C2488272584835726867;
import dev.epro.r0.D16457379462628768197;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.H13673682671831771655;
import dev.epro.r0.H7244645155502647900;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.J10922886535334311319;
import dev.epro.r0.K15572083692188606544;
import dev.epro.r0.K17289497074290777238;
import dev.epro.r0.K4548097313143615345;
import dev.epro.r0.L622219180424329983;
import dev.epro.r0.N17304285488307381535;
import dev.epro.r0.P16422848101170923038;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.R9411874267597469228;
import dev.epro.r0.S11564727846197427291;
import dev.epro.r0.S4967920478913205567;
import dev.epro.r0.U4857089234315512256;
import dev.epro.r0.X18093340194006634422;
import dev.epro.r0.Z115818233709597990;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class d62 implements N17304285488307381535, C2488272584835726867, J10922886535334311319, K17289497074290777238, X18093340194006634422, H13673682671831771655, K4548097313143615345, H7244645155502647900 {
    public static final d62 a = new d62();
    public static final d62 a$1 = new d62();

    public d62() {
        Process.myUid();
        Process.myPid();
    }

    public static void a(P16422848101170923038 p16422848101170923038, Bundle bundle, String str) {
        Object objP;
        ArrayList arrayList = p16422848101170923038.a;
        if (arrayList.isEmpty()) {
            xv.c("Unable to parse empty JsonArray for key: ".concat(str), null);
            return;
        }
        K15572083692188606544 k15572083692188606544 = (K15572083692188606544) R9411874267597469228.A0(p16422848101170923038);
        k15572083692188606544.getClass();
        int i = 0;
        if (k15572083692188606544 instanceof I16631908410500040363) {
            ArrayList arrayList2 = new ArrayList(Z115818233709597990.k0(p16422848101170923038, 10));
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                arrayList2.add(b(((K15572083692188606544) obj).l()));
            }
            bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Bundle[0]));
            return;
        }
        if (!(k15572083692188606544 instanceof D16457379462628768197)) {
            xv.c("Unable to parse array element type: " + k15572083692188606544, null);
            return;
        }
        ArrayList arrayList3 = new ArrayList(Z115818233709597990.k0(p16422848101170923038, 10));
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            D16457379462628768197 d16457379462628768197M = ((K15572083692188606544) obj2).m();
            Serializable serializable = d16457379462628768197M.a;
            if (serializable instanceof Boolean) {
                objP = Boolean.valueOf(d16457379462628768197M.b());
            } else if (serializable instanceof Number) {
                Number numberO = d16457379462628768197M.o();
                int iIntValue = numberO.intValue();
                double dDoubleValue = numberO.doubleValue();
                objP = ((double) iIntValue) == dDoubleValue ? Integer.valueOf(iIntValue) : Double.valueOf(dDoubleValue);
            } else if (serializable instanceof String) {
                objP = d16457379462628768197M.p();
            } else {
                xv.c("Unexpected primitive json type: " + d16457379462628768197M, null);
                objP = null;
            }
            objP.getClass();
            arrayList3.add(objP);
        }
        if (R9411874267597469228.B0(arrayList3) instanceof String) {
            ArrayList arrayList4 = new ArrayList(Z115818233709597990.k0(arrayList3, 10));
            int size3 = arrayList3.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList3.get(i4);
                i4++;
                arrayList4.add(obj3.toString());
            }
            bundle.putStringArray(str, (String[]) arrayList4.toArray(new String[0]));
            return;
        }
        if (R9411874267597469228.B0(arrayList3) instanceof Integer) {
            int size4 = arrayList3.size();
            int[] iArr = new int[size4];
            while (i < size4) {
                Object obj4 = arrayList3.get(i);
                obj4.getClass();
                iArr[i] = ((Integer) obj4).intValue();
                i++;
            }
            bundle.putIntArray(str, iArr);
            return;
        }
        if (R9411874267597469228.B0(arrayList3) instanceof Double) {
            int size5 = arrayList3.size();
            double[] dArr = new double[size5];
            while (i < size5) {
                Object obj5 = arrayList3.get(i);
                obj5.getClass();
                dArr[i] = ((Double) obj5).doubleValue();
                i++;
            }
            bundle.putDoubleArray(str, dArr);
            return;
        }
        if (!(R9411874267597469228.B0(arrayList3) instanceof Boolean)) {
            xv.c("Unable to parse array element type: " + R9411874267597469228.B0(arrayList3), null);
            return;
        }
        int size6 = arrayList3.size();
        boolean[] zArr = new boolean[size6];
        while (i < size6) {
            Object obj6 = arrayList3.get(i);
            obj6.getClass();
            zArr[i] = ((Boolean) obj6).booleanValue();
            i++;
        }
        bundle.putBooleanArray(str, zArr);
    }

    public static Bundle b(I16631908410500040363 i16631908410500040363) {
        i16631908410500040363.getClass();
        Bundle bundleC = c(i16631908410500040363);
        return bundleC == null ? new Bundle() : bundleC;
    }

    public static Bundle c(I16631908410500040363 i16631908410500040363) {
        i16631908410500040363.getClass();
        try {
            Bundle bundle = new Bundle();
            Iterator it = ((S11564727846197427291) i16631908410500040363.a.keySet()).iterator();
            while (((L622219180424329983) it).hasNext()) {
                String str = (String) ((L622219180424329983) it).a().f;
                K15572083692188606544 k15572083692188606544W = i16631908410500040363.w(str);
                k15572083692188606544W.getClass();
                if (k15572083692188606544W instanceof D16457379462628768197) {
                    D16457379462628768197 d16457379462628768197M = k15572083692188606544W.m();
                    str.getClass();
                    a(d16457379462628768197M, bundle, str);
                } else if (k15572083692188606544W instanceof P16422848101170923038) {
                    P16422848101170923038 p16422848101170923038K = k15572083692188606544W.k();
                    str.getClass();
                    a(p16422848101170923038K, bundle, str);
                } else if (k15572083692188606544W instanceof I16631908410500040363) {
                    bundle.putBundle(str, b(k15572083692188606544W.l()));
                }
            }
            return bundle;
        } catch (Exception e) {
            ArrayList arrayList = G6547577305291411977.l(e).s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList.add(message);
            return null;
        }
    }

    public static P16422848101170923038 e(I16631908410500040363 i16631908410500040363, String str) {
        str.getClass();
        if (i16631908410500040363 == null) {
            return null;
        }
        try {
            return i16631908410500040363.x(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // dev.epro.r0.H7244645155502647900
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public Object mo2a() {
        throw null;
    }

    @Override // dev.epro.r0.H7244645155502647900
    public Object a(S4967920478913205567 s4967920478913205567) {
        throw null;
    }

    @Override // dev.epro.r0.H7244645155502647900
    public Object a(U4857089234315512256 u4857089234315512256) {
        throw null;
    }

    @Override // dev.epro.r0.H7244645155502647900
    public Object a$1() {
        throw null;
    }

    @Override // dev.epro.r0.H7244645155502647900
    public Object b(boolean z) {
        throw null;
    }

    @Override // dev.epro.r0.K4548097313143615345
    public Object d(R4833348786910499294 r4833348786910499294) {
        return new xu0(new of2());
    }

    @Override // dev.epro.r0.K4548097313143615345
    /* JADX INFO: renamed from: a */
    public cw0 mo19a() {
        return cw0.PICTURE_IN_PICTURE_AD_REQUEST;
    }

    public static Bundle a(String str) {
        try {
            return c(R7033599853981556291.K(str).l());
        } catch (Exception e) {
            ArrayList arrayList = G6547577305291411977.l(e).s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList.add(message);
            return null;
        }
    }

    public static I16631908410500040363 a(K15572083692188606544 k15572083692188606544) {
        if (k15572083692188606544 == null) {
            return null;
        }
        try {
            return k15572083692188606544.l();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(D16457379462628768197 d16457379462628768197, Bundle bundle, String str) {
        Serializable serializable = d16457379462628768197.a;
        if (serializable instanceof Boolean) {
            bundle.putBoolean(str, d16457379462628768197.b());
            return;
        }
        if (serializable instanceof Number) {
            Number numberO = d16457379462628768197.o();
            int iIntValue = numberO.intValue();
            double dDoubleValue = numberO.doubleValue();
            if (iIntValue == dDoubleValue) {
                bundle.putInt(str, iIntValue);
                return;
            } else {
                bundle.putDouble(str, dDoubleValue);
                return;
            }
        }
        if (serializable instanceof String) {
            bundle.putString(str, d16457379462628768197.p());
            return;
        }
        xv.c("Unexpected primitive json type: " + d16457379462628768197, null);
    }

    public static boolean a(I16631908410500040363 i16631908410500040363, String str, boolean z) {
        if (i16631908410500040363 != null) {
            try {
                return i16631908410500040363.w(str).b();
            } catch (Exception unused) {
            }
        }
        return z;
    }

    public void a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            if (objArr.length > 0) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        sb.append("null");
                    } else if (obj instanceof String) {
                        String string = obj.toString();
                        if (string.startsWith("{")) {
                            sb.append(string);
                        } else {
                            sb.append('\"');
                            sb.append(string);
                            sb.append('\"');
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append(",");
                }
                sb.setLength(sb.length() - 1);
            }
            sb.append(")}");
            String string2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            if (Looper.myLooper() == handler.getLooper()) {
                a(webView, string2);
            } else {
                handler.post(new c62(this, webView, string2));
            }
        }
    }

    public static int a(I16631908410500040363 i16631908410500040363, String str, int i) {
        if (i16631908410500040363 != null) {
            try {
                return i16631908410500040363.w(str).j();
            } catch (Exception unused) {
            }
        }
        return i;
    }

    public static I16631908410500040363 a(P16422848101170923038 p16422848101170923038, int i) {
        if (p16422848101170923038 == null) {
            return null;
        }
        ArrayList arrayList = p16422848101170923038.a;
        if (i >= arrayList.size()) {
            return null;
        }
        try {
            return ((K15572083692188606544) arrayList.get(i)).l();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                webView.evaluateJavascript(str, null);
            } catch (IllegalStateException unused) {
                webView.loadUrl("javascript: " + str);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static String a(I16631908410500040363 i16631908410500040363, String str, String str2) {
        if (i16631908410500040363 != null) {
            try {
                String strP = i16631908410500040363.w(str).p();
                strP.getClass();
                return strP;
            } catch (Exception unused) {
            }
        }
        return str2;
    }
}
