package dev.epro.r0;

import ads_mobile_sdk.jx1;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.view.KeyEvent;
import androidx.sqlite.SQLiteStatement;
import java.util.Iterator;
import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class P1789376955961125859 {
    public static final float a = 64.0f;

    static {
        izmyclvb.qgayjvbiagej2(67);
    }

    public static final native void a(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, F4096073349764486348 f40960733497644863483, F4096073349764486348 f40960733497644863484, F4096073349764486348 f40960733497644863485, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i);

    public static final native void b(String str, List list, int i, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, I1722681268793429505 i1722681268793429505, boolean z, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static final native void c(E17523205116624666034 e17523205116624666034, boolean z, I1722681268793429505 i1722681268793429505, float f, M3727281027331139839 m3727281027331139839, int i);

    public static final Integer d(I16631908410500040363 i16631908410500040363, String str) {
        I16631908410500040363 i16631908410500040363Y;
        int i = jx1.h;
        if (i16631908410500040363 == null) {
            i16631908410500040363Y = null;
        } else {
            try {
                i16631908410500040363Y = i16631908410500040363.y(str);
            } catch (Exception unused) {
                i16631908410500040363Y = null;
            }
        }
        if (i16631908410500040363Y == null) {
            return null;
        }
        try {
            return Integer.valueOf(Color.rgb(i16631908410500040363Y.w("r").j(), i16631908410500040363Y.w("g").j(), i16631908410500040363Y.w("b").j()));
        } catch (Exception unused2) {
            return null;
        }
    }

    public static boolean e(String str) {
        if (str == null || !str.startsWith("omid-native")) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if (!"omid-native".equals(uri.getScheme())) {
                return false;
            }
            T3224757362656795885.c(uri);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void f(long j, String str) {
        if (j >= 0) {
            return;
        }
        S10973172697741180971.j(str);
    }

    public static final int g(SQLiteStatement sQLiteStatement, String str) {
        sQLiteStatement.getClass();
        int columnCount = sQLiteStatement.getColumnCount();
        int i = 0;
        while (true) {
            if (i >= columnCount) {
                i = -1;
                break;
            }
            if (str.equals(sQLiteStatement.getColumnName(i))) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        String str2 = "`" + str + '`';
        int columnCount2 = sQLiteStatement.getColumnCount();
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount2) {
                i2 = -1;
                break;
            }
            if (str2.equals(sQLiteStatement.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = sQLiteStatement.getColumnCount();
            String strConcat = ".".concat(str);
            String str3 = "." + str + '`';
            for (int i3 = 0; i3 < columnCount3; i3++) {
                String columnName = sQLiteStatement.getColumnName(i3);
                if (columnName.length() >= str.length() + 2 && (Z13168519540281190457.z(columnName, strConcat, false) || (columnName.charAt(0) == '`' && Z13168519540281190457.z(columnName, str3, false)))) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static void h(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            Z3383101362411723454.s();
        }
    }

    public static final int i(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static boolean j(double d, int i, int i2) {
        return d >= ((double) i) && d < ((double) i2);
    }

    public static final boolean k(int i, KeyEvent keyEvent) {
        return ((int) (D15445857918358799638.J(keyEvent) >> 32)) == i;
    }

    public static final J14024120050125738337 l(V6281043481934004271 v6281043481934004271, J5715778638296486773 j5715778638296486773, Q15796038708469204840 q15796038708469204840, L14576235570718031614 l14576235570718031614, M3727281027331139839 m3727281027331139839) {
        if (q15796038708469204840 == null) {
            q15796038708469204840 = S12227320117525376577.q(j5715778638296486773);
        }
        q15796038708469204840.getClass();
        l14576235570718031614.getClass();
        L3530692241870850490 l3530692241870850490I = j5715778638296486773.i();
        l3530692241870850490I.getClass();
        J15730374346044043770 j15730374346044043770 = new J15730374346044043770(l3530692241870850490I, q15796038708469204840, l14576235570718031614);
        String strB = v6281043481934004271.b();
        if (strB != null) {
            return j15730374346044043770.L(v6281043481934004271, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        }
        S10973172697741180971.j("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static void m(int i, int i2) {
        String strD;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strD = S12227320117525376577.D("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    S10973172697741180971.j(G6547577305291411977.n(i2, "negative size: "));
                    return;
                }
                strD = S12227320117525376577.D("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strD);
        }
    }

    public static void n(int i, int i2) {
        if (i < 0 || i > i2) {
            W4415201450379021245.a(p(i, i2, "index"));
        }
    }

    public static void o(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? p(i, i3, "start index") : (i2 < 0 || i2 > i3) ? p(i2, i3, "end index") : S12227320117525376577.D("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String p(int i, int i2, String str) {
        if (i < 0) {
            return S12227320117525376577.D("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return S12227320117525376577.D("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        S10973172697741180971.j(G6547577305291411977.n(i2, "negative size: "));
        return null;
    }
}
