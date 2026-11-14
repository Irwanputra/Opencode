package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class d62 implements dev.epro.r0.N17304285488307381535, dev.epro.r0.C2488272584835726867, dev.epro.r0.J10922886535334311319, dev.epro.r0.K17289497074290777238, dev.epro.r0.X18093340194006634422, dev.epro.r0.H13673682671831771655, dev.epro.r0.K4548097313143615345, dev.epro.r0.H7244645155502647900 {
    public static final ads_mobile_sdk.d62 a = new ads_mobile_sdk.d62();
    public static final ads_mobile_sdk.d62 a$1 = new ads_mobile_sdk.d62();

    public d62() {
        android.os.Process.myUid();
        android.os.Process.myPid();
    }

    public static void a(dev.epro.r0.P16422848101170923038 p16422848101170923038, android.os.Bundle bundle, java.lang.String str) {
        java.lang.Object objP;
        java.util.ArrayList arrayList = p16422848101170923038.a;
        if (arrayList.isEmpty()) {
            ads_mobile_sdk.xv.c("Unable to parse empty JsonArray for key: ".concat(str), null);
            return;
        }
        dev.epro.r0.K15572083692188606544 k15572083692188606544 = (dev.epro.r0.K15572083692188606544) dev.epro.r0.R9411874267597469228.A0(p16422848101170923038);
        k15572083692188606544.getClass();
        int i = 0;
        if (k15572083692188606544 instanceof dev.epro.r0.I16631908410500040363) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(dev.epro.r0.Z115818233709597990.k0(p16422848101170923038, 10));
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                java.lang.Object obj = arrayList.get(i2);
                i2++;
                arrayList2.add(b(((dev.epro.r0.K15572083692188606544) obj).l()));
            }
            bundle.putParcelableArray(str, (android.os.Parcelable[]) arrayList2.toArray(new android.os.Bundle[0]));
            return;
        }
        if (!(k15572083692188606544 instanceof dev.epro.r0.D16457379462628768197)) {
            ads_mobile_sdk.xv.c("Unable to parse array element type: " + k15572083692188606544, null);
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(dev.epro.r0.Z115818233709597990.k0(p16422848101170923038, 10));
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            java.lang.Object obj2 = arrayList.get(i3);
            i3++;
            dev.epro.r0.D16457379462628768197 d16457379462628768197M = ((dev.epro.r0.K15572083692188606544) obj2).m();
            java.io.Serializable serializable = d16457379462628768197M.a;
            if (serializable instanceof java.lang.Boolean) {
                objP = java.lang.Boolean.valueOf(d16457379462628768197M.b());
            } else if (serializable instanceof java.lang.Number) {
                java.lang.Number numberO = d16457379462628768197M.o();
                int iIntValue = numberO.intValue();
                double dDoubleValue = numberO.doubleValue();
                objP = ((double) iIntValue) == dDoubleValue ? java.lang.Integer.valueOf(iIntValue) : java.lang.Double.valueOf(dDoubleValue);
            } else if (serializable instanceof java.lang.String) {
                objP = d16457379462628768197M.p();
            } else {
                ads_mobile_sdk.xv.c("Unexpected primitive json type: " + d16457379462628768197M, null);
                objP = null;
            }
            objP.getClass();
            arrayList3.add(objP);
        }
        if (dev.epro.r0.R9411874267597469228.B0(arrayList3) instanceof java.lang.String) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList(dev.epro.r0.Z115818233709597990.k0(arrayList3, 10));
            int size3 = arrayList3.size();
            int i4 = 0;
            while (i4 < size3) {
                java.lang.Object obj3 = arrayList3.get(i4);
                i4++;
                arrayList4.add(obj3.toString());
            }
            bundle.putStringArray(str, (java.lang.String[]) arrayList4.toArray(new java.lang.String[0]));
            return;
        }
        if (dev.epro.r0.R9411874267597469228.B0(arrayList3) instanceof java.lang.Integer) {
            int size4 = arrayList3.size();
            int[] iArr = new int[size4];
            while (i < size4) {
                java.lang.Object obj4 = arrayList3.get(i);
                obj4.getClass();
                iArr[i] = ((java.lang.Integer) obj4).intValue();
                i++;
            }
            bundle.putIntArray(str, iArr);
            return;
        }
        if (dev.epro.r0.R9411874267597469228.B0(arrayList3) instanceof java.lang.Double) {
            int size5 = arrayList3.size();
            double[] dArr = new double[size5];
            while (i < size5) {
                java.lang.Object obj5 = arrayList3.get(i);
                obj5.getClass();
                dArr[i] = ((java.lang.Double) obj5).doubleValue();
                i++;
            }
            bundle.putDoubleArray(str, dArr);
            return;
        }
        if (!(dev.epro.r0.R9411874267597469228.B0(arrayList3) instanceof java.lang.Boolean)) {
            ads_mobile_sdk.xv.c("Unable to parse array element type: " + dev.epro.r0.R9411874267597469228.B0(arrayList3), null);
            return;
        }
        int size6 = arrayList3.size();
        boolean[] zArr = new boolean[size6];
        while (i < size6) {
            java.lang.Object obj6 = arrayList3.get(i);
            obj6.getClass();
            zArr[i] = ((java.lang.Boolean) obj6).booleanValue();
            i++;
        }
        bundle.putBooleanArray(str, zArr);
    }

    public static android.os.Bundle b(dev.epro.r0.I16631908410500040363 i16631908410500040363) {
        i16631908410500040363.getClass();
        android.os.Bundle bundleC = c(i16631908410500040363);
        return bundleC == null ? new android.os.Bundle() : bundleC;
    }

    public static android.os.Bundle c(dev.epro.r0.I16631908410500040363 i16631908410500040363) {
        i16631908410500040363.getClass();
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            dev.epro.r0.L622219180424329983 it = i16631908410500040363.a.keySet().iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.a().f;
                dev.epro.r0.K15572083692188606544 k15572083692188606544W = i16631908410500040363.w(str);
                k15572083692188606544W.getClass();
                if (k15572083692188606544W instanceof dev.epro.r0.D16457379462628768197) {
                    dev.epro.r0.D16457379462628768197 d16457379462628768197M = k15572083692188606544W.m();
                    str.getClass();
                    a(d16457379462628768197M, bundle, str);
                } else if (k15572083692188606544W instanceof dev.epro.r0.P16422848101170923038) {
                    dev.epro.r0.P16422848101170923038 p16422848101170923038K = k15572083692188606544W.k();
                    str.getClass();
                    a(p16422848101170923038K, bundle, str);
                } else if (k15572083692188606544W instanceof dev.epro.r0.I16631908410500040363) {
                    bundle.putBundle(str, b(k15572083692188606544W.l()));
                }
            }
            return bundle;
        } catch (java.lang.Exception e) {
            java.util.ArrayList arrayList = dev.epro.r0.G6547577305291411977.l(e).s;
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList.add(message);
            return null;
        }
    }

    public static dev.epro.r0.P16422848101170923038 e(dev.epro.r0.I16631908410500040363 i16631908410500040363, java.lang.String str) {
        str.getClass();
        if (i16631908410500040363 == null) {
            return null;
        }
        try {
            return i16631908410500040363.x(str);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public java.lang.Object m3a() {
        throw null;
    }

    public java.lang.Object a(dev.epro.r0.S4967920478913205567 s4967920478913205567) {
        throw null;
    }

    public java.lang.Object a(dev.epro.r0.U4857089234315512256 u4857089234315512256) {
        throw null;
    }

    public java.lang.Object a$1() {
        throw null;
    }

    public java.lang.Object b(boolean z) {
        throw null;
    }

    public java.lang.Object d(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        return new ads_mobile_sdk.xu0(new ads_mobile_sdk.of2());
    }

    public ads_mobile_sdk.cw0 a() {
        return ads_mobile_sdk.cw0.PICTURE_IN_PICTURE_AD_REQUEST;
    }

    public static android.os.Bundle a(java.lang.String str) {
        try {
            return c(dev.epro.r0.R7033599853981556291.K(str).l());
        } catch (java.lang.Exception e) {
            java.util.ArrayList arrayList = dev.epro.r0.G6547577305291411977.l(e).s;
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList.add(message);
            return null;
        }
    }

    public static dev.epro.r0.I16631908410500040363 a(dev.epro.r0.K15572083692188606544 k15572083692188606544) {
        if (k15572083692188606544 == null) {
            return null;
        }
        try {
            return k15572083692188606544.l();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static void a(dev.epro.r0.D16457379462628768197 d16457379462628768197, android.os.Bundle bundle, java.lang.String str) {
        java.io.Serializable serializable = d16457379462628768197.a;
        if (serializable instanceof java.lang.Boolean) {
            bundle.putBoolean(str, d16457379462628768197.b());
            return;
        }
        if (serializable instanceof java.lang.Number) {
            java.lang.Number numberO = d16457379462628768197.o();
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
        if (serializable instanceof java.lang.String) {
            bundle.putString(str, d16457379462628768197.p());
            return;
        }
        ads_mobile_sdk.xv.c("Unexpected primitive json type: " + d16457379462628768197, null);
    }

    public static boolean a(dev.epro.r0.I16631908410500040363 i16631908410500040363, java.lang.String str, boolean z) {
        if (i16631908410500040363 != null) {
            try {
                return i16631908410500040363.w(str).b();
            } catch (java.lang.Exception unused) {
            }
        }
        return z;
    }

    public void a(android.webkit.WebView webView, java.lang.String str, java.lang.Object... objArr) {
        if (webView != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
            sb.append("if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            if (objArr.length > 0) {
                for (java.lang.Object obj : objArr) {
                    if (obj == null) {
                        sb.append("null");
                    } else if (obj instanceof java.lang.String) {
                        java.lang.String string = obj.toString();
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
            java.lang.String string2 = sb.toString();
            android.os.Handler handler = webView.getHandler();
            if (handler == null) {
                handler = new android.os.Handler(android.os.Looper.getMainLooper());
            }
            if (android.os.Looper.myLooper() == handler.getLooper()) {
                a(webView, string2);
            } else {
                handler.post(new ads_mobile_sdk.c62(this, webView, string2));
            }
        }
    }

    public static int a(dev.epro.r0.I16631908410500040363 i16631908410500040363, java.lang.String str, int i) {
        if (i16631908410500040363 != null) {
            try {
                return i16631908410500040363.w(str).j();
            } catch (java.lang.Exception unused) {
            }
        }
        return i;
    }

    public static dev.epro.r0.I16631908410500040363 a(dev.epro.r0.P16422848101170923038 p16422848101170923038, int i) {
        if (p16422848101170923038 == null) {
            return null;
        }
        java.util.ArrayList arrayList = p16422848101170923038.a;
        if (i >= arrayList.size()) {
            return null;
        }
        try {
            return ((dev.epro.r0.K15572083692188606544) arrayList.get(i)).l();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static void a(android.webkit.WebView webView, java.lang.String str) {
        if (webView == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                webView.evaluateJavascript(str, null);
            } catch (java.lang.IllegalStateException unused) {
                webView.loadUrl("javascript: " + str);
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
    }

    public static java.lang.String a(dev.epro.r0.I16631908410500040363 i16631908410500040363, java.lang.String str, java.lang.String str2) {
        if (i16631908410500040363 != null) {
            try {
                java.lang.String strP = i16631908410500040363.w(str).p();
                strP.getClass();
                return strP;
            } catch (java.lang.Exception unused) {
            }
        }
        return str2;
    }
}
