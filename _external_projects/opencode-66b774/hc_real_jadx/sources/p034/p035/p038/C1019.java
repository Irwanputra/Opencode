package p034.p035.p038;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import java.util.ArrayList;
import p034.p035.p040.C1025;
import p034.p035.p040.C1026;
import p034.p035.p040.C1027;
import p034.p035.p040.C1032;
import p034.p035.p040.C1036;
import p034.p035.p040.CallableC1022;
import p034.p035.p040.RunnableC1023;
import p034.p035.p043.p044.AbstractC1059;
import p034.p035.p043.p044.C1062;
import p034.p035.p043.p044.C1064;
import p034.p035.p043.p044.InterfaceC1058;
import p034.p080.C1493;
import p034.p080.C1505;

@SuppressLint({"NewApi"})
/* renamed from: づざかべべ.〳ぜぞぜべっ.ぁごぐすすぃ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1019 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final C1505<String, Typeface> f5408;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final C1007 f5409;

    static {
        C1007 c1012;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            c1012 = new C1020();
        } else if (i >= 28) {
            c1012 = new C1004();
        } else if (i >= 26) {
            c1012 = new C1006();
        } else {
            if (i >= 24) {
                if (C1018.f5407 != null) {
                    c1012 = new C1018();
                }
            }
            c1012 = i >= 21 ? new C1012() : new C1007();
        }
        f5409 = c1012;
        f5408 = new C1505<>(16);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static Typeface m2362(Context context, Resources resources, int i, String str, int i2) {
        Typeface mo2339 = f5409.mo2339(context, resources, i, str, i2);
        if (mo2339 != null) {
            f5408.m3284(m2363(resources, i, i2), mo2339);
        }
        return mo2339;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static String m2363(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static Typeface m2364(Context context, InterfaceC1058 interfaceC1058, Resources resources, int i, int i2, AbstractC1059 abstractC1059, Handler handler, boolean z) {
        Typeface mo2336;
        if (interfaceC1058 instanceof C1064) {
            C1064 c1064 = (C1064) interfaceC1058;
            boolean z2 = true;
            if (!z ? abstractC1059 != null : c1064.f5517 != 0) {
                z2 = false;
            }
            int i3 = z ? c1064.f5516 : -1;
            C1026 c1026 = c1064.f5518;
            C1505<String, Typeface> c1505 = C1027.f5428;
            String str = c1026.f5424 + "-" + i2;
            mo2336 = C1027.f5428.m3286(str);
            if (mo2336 != null) {
                if (abstractC1059 != null) {
                    abstractC1059.mo2400(mo2336);
                }
            } else if (z2 && i3 == -1) {
                C1027.C1031 m2366 = C1027.m2366(context, c1026, i2);
                if (abstractC1059 != null) {
                    int i4 = m2366.f5438;
                    if (i4 == 0) {
                        abstractC1059.m2397(m2366.f5439, handler);
                    } else {
                        abstractC1059.m2399(i4, handler);
                    }
                }
                mo2336 = m2366.f5439;
            } else {
                CallableC1022 callableC1022 = new CallableC1022(context, c1026, i2, str);
                mo2336 = null;
                if (z2) {
                    try {
                        mo2336 = ((C1027.C1031) C1027.f5426.m2368(callableC1022, i3)).f5439;
                    } catch (InterruptedException unused) {
                    }
                } else {
                    C1025 c1025 = abstractC1059 == null ? null : new C1025(abstractC1059, handler);
                    synchronized (C1027.f5427) {
                        C1493<String, ArrayList<C1032.InterfaceC1034<C1027.C1031>>> c1493 = C1027.f5430;
                        ArrayList<C1032.InterfaceC1034<C1027.C1031>> orDefault = c1493.getOrDefault(str, null);
                        if (orDefault == null) {
                            if (c1025 != null) {
                                ArrayList<C1032.InterfaceC1034<C1027.C1031>> arrayList = new ArrayList<>();
                                arrayList.add(c1025);
                                c1493.put(str, arrayList);
                            }
                            C1032 c1032 = C1027.f5426;
                            C1036 c1036 = new C1036(str);
                            c1032.getClass();
                            c1032.m2369(new RunnableC1023(c1032, callableC1022, new Handler(), c1036));
                        } else if (c1025 != null) {
                            orDefault.add(c1025);
                        }
                    }
                }
            }
        } else {
            mo2336 = f5409.mo2336(context, (C1062) interfaceC1058, resources, i2);
            if (abstractC1059 != null) {
                if (mo2336 != null) {
                    abstractC1059.m2397(mo2336, handler);
                } else {
                    abstractC1059.m2399(-3, handler);
                }
            }
        }
        if (mo2336 != null) {
            f5408.m3284(m2363(resources, i, i2), mo2336);
        }
        return mo2336;
    }
}
