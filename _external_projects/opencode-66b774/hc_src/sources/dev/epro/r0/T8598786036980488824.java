package dev.epro.r0;

import ads_mobile_sdk.bn0;
import ads_mobile_sdk.jr0;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public abstract class T8598786036980488824 {
    static {
        izmyclvb.qgayjvbiagej2(344);
    }

    public static final native String A(R6894569913291645384 r6894569913291645384);

    public static final native void a(Set set, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i);

    public static O6641393078261985068 b(O6641393078261985068 o6641393078261985068) {
        return o6641393078261985068.a(o6641393078261985068.size() * 2);
    }

    public static final URL c(URL url, bn0 bn0Var, jr0 jr0Var) {
        bn0Var.getClass();
        String str = bn0Var.c;
        String url2 = url.toString();
        url2.getClass();
        Uri.Builder buildUpon = Uri.parse(Z13168519540281190457.D(false, url2, jr0Var != null ? jr0Var.R() : "%5Bgw_fbsaeid%5D", str)).buildUpon();
        buildUpon.appendQueryParameter("gmp_app_id", bn0Var.a);
        buildUpon.appendQueryParameter("fbs_aiid", bn0Var.b);
        if (buildUpon.build().getQueryParameter("fbs_aeid") == null) {
            buildUpon.appendQueryParameter("fbs_aeid", str);
        }
        return new URL(buildUpon.build().toString());
    }

    public static H1358060654748692575 d(H1358060654748692575 h1358060654748692575) {
        H6457936572911484476 h6457936572911484476 = h1358060654748692575.a;
        h6457936572911484476.b();
        return h6457936572911484476.i > 0 ? h1358060654748692575 : H1358060654748692575.b;
    }

    public static StaticLayout e(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            T12055643479535528558.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            T12055643479535528558.a("invalid end value");
        }
        if (i3 < 0) {
            T12055643479535528558.a("invalid maxLines value");
        }
        if (i < 0) {
            T12055643479535528558.a("invalid width value");
        }
        if (i4 < 0) {
            T12055643479535528558.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i3);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i4);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(z);
        obtain.setBreakStrategy(i6);
        obtain.setHyphenationFrequency(i9);
        obtain.setIndents(null, null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            obtain.setJustificationMode(i5);
        }
        if (i10 >= 28) {
            obtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i10 >= 33) {
            T3623367008917729099.q(obtain, i7, i8);
        }
        if (i10 >= 35) {
            obtain.setUseBoundsForWidth(false);
        }
        return obtain.build();
    }

    public static final native String f(String str);

    public static String g(B15200565448991586841 b15200565448991586841) {
        StringBuilder sb = new StringBuilder(b15200565448991586841.size());
        for (int i = 0; i < b15200565448991586841.size(); i++) {
            byte b = b15200565448991586841.b(i);
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static M4722199849958580248 h() {
        return (M4722199849958580248) D459204867321966484.b.e();
    }

    public static final native boolean i(Q7430090668634766253 q7430090668634766253);

    public static final native Set j(Q7430090668634766253 q7430090668634766253);

    public static final int k(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final Object[] l(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        O5378677881740157249.s0(0, i, 6, objArr, objArr2);
        O5378677881740157249.n0(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final native boolean m(Q7430090668634766253 q7430090668634766253);

    public static final native Q7430090668634766253 n(Q7430090668634766253 q7430090668634766253);

    public static M4722199849958580248 o(M4722199849958580248 m4722199849958580248) {
        if (m4722199849958580248 instanceof U15634453686864636590) {
            U15634453686864636590 u15634453686864636590 = (U15634453686864636590) m4722199849958580248;
            if (u15634453686864636590.t == Q9282725956684299602.g()) {
                u15634453686864636590.r = null;
                return m4722199849958580248;
            }
        }
        if (m4722199849958580248 instanceof S5331577176189851392) {
            S5331577176189851392 s5331577176189851392 = (S5331577176189851392) m4722199849958580248;
            if (s5331577176189851392.i == Q9282725956684299602.g()) {
                s5331577176189851392.h = null;
                return m4722199849958580248;
            }
        }
        M4722199849958580248 e = D459204867321966484.e(m4722199849958580248, null, false);
        e.j();
        return e;
    }

    public static LinkedHashSet p(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(E4951175994894594588.u0(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && S10823041268949770285.t(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set q(Set set, Iterable iterable) {
        set.getClass();
        iterable.getClass();
        Collection<?> d1 = iterable instanceof Collection ? (Collection) iterable : R9411874267597469228.d1(iterable);
        if (d1.isEmpty()) {
            return R9411874267597469228.h1(set);
        }
        if (!(d1 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(d1);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) d1).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static Object r(T6869589956726384891 t6869589956726384891, B13729205492206812220 b13729205492206812220) {
        M4722199849958580248 u15634453686864636590;
        M4722199849958580248 m4722199849958580248 = (M4722199849958580248) D459204867321966484.b.e();
        if (m4722199849958580248 instanceof U15634453686864636590) {
            U15634453686864636590 u156344536868646365902 = (U15634453686864636590) m4722199849958580248;
            if (u156344536868646365902.t == Q9282725956684299602.g()) {
                F4096073349764486348 f4096073349764486348 = u156344536868646365902.r;
                F4096073349764486348 f40960733497644863482 = u156344536868646365902.s;
                try {
                    ((U15634453686864636590) m4722199849958580248).r = D459204867321966484.i(t6869589956726384891, f4096073349764486348, true);
                    ((U15634453686864636590) m4722199849958580248).s = f40960733497644863482;
                    return b13729205492206812220.invoke();
                } finally {
                    u156344536868646365902.r = f4096073349764486348;
                    u156344536868646365902.s = f40960733497644863482;
                }
            }
        }
        if (m4722199849958580248 == null || (m4722199849958580248 instanceof A6237865184482427403)) {
            u15634453686864636590 = new U15634453686864636590(m4722199849958580248 instanceof A6237865184482427403 ? (A6237865184482427403) m4722199849958580248 : null, t6869589956726384891, null, true, false);
        } else {
            u15634453686864636590 = m4722199849958580248.u(t6869589956726384891);
        }
        try {
            M4722199849958580248 j = u15634453686864636590.j();
            try {
                Object invoke = b13729205492206812220.invoke();
                M4722199849958580248.q(j);
                u15634453686864636590.c();
                return invoke;
            } catch (Throwable th) {
                M4722199849958580248.q(j);
                throw th;
            }
        } catch (Throwable th2) {
            u15634453686864636590.c();
            throw th2;
        }
    }

    public static LinkedHashSet s(Set set, Iterable iterable) {
        set.getClass();
        iterable.getClass();
        Integer valueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(E4951175994894594588.u0(valueOf != null ? set.size() + valueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        P17571903987102865660.n0(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static LinkedHashSet t(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(E4951175994894594588.u0(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static final native H3496173676696092530 u(Q7430090668634766253 q7430090668634766253, Q7430090668634766253 q74300906686347662532, boolean z, A16201730628142697357 a16201730628142697357);

    public static final Object[] v(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        O5378677881740157249.s0(0, i, 6, objArr, objArr2);
        O5378677881740157249.n0(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] w(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        O5378677881740157249.s0(0, i, 6, objArr, objArr2);
        O5378677881740157249.n0(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static void x(M4722199849958580248 m4722199849958580248, M4722199849958580248 m47221998499585802482, F4096073349764486348 f4096073349764486348) {
        if (m4722199849958580248 != m47221998499585802482) {
            m47221998499585802482.getClass();
            M4722199849958580248.q(m4722199849958580248);
            m47221998499585802482.c();
        } else if (m4722199849958580248 instanceof U15634453686864636590) {
            ((U15634453686864636590) m4722199849958580248).r = f4096073349764486348;
        } else if (m4722199849958580248 instanceof S5331577176189851392) {
            ((S5331577176189851392) m4722199849958580248).h = f4096073349764486348;
        } else {
            Q11088980322693754445.i("Non-transparent snapshot was reused: ", m4722199849958580248);
        }
    }

    public static final native M17029230080475824499 y(R6894569913291645384 r6894569913291645384, Set set);

    public static Set z(Object obj) {
        Set singleton = Collections.singleton(obj);
        singleton.getClass();
        return singleton;
    }
}
