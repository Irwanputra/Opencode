package p034.p105.p106;

import android.os.Build;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p034.p035.p045.C1096;
import p034.p080.AbstractC1495;
import p034.p080.C1502;

/* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ざっざへづ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1796 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final AbstractC1787 f8082;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final AbstractC1787 f8083;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final int[] f8084 = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ざっざへづ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1797 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean f8085;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public C1794 f8086;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public Fragment f8087;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public boolean f8088;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public C1794 f8089;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public Fragment f8090;
    }

    static {
        AbstractC1787 abstractC1787 = null;
        f8082 = Build.VERSION.SDK_INT >= 21 ? new C1801() : null;
        try {
            abstractC1787 = (AbstractC1787) Class.forName("づざかべべ.は〲ぱなで.なぎぱいぢぎ").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
        }
        f8083 = abstractC1787;
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static ArrayList<View> m3850(AbstractC1787 abstractC1787, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.f1186;
        if (view2 != null) {
            abstractC1787.m3832(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        abstractC1787.mo3767(obj, arrayList2);
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0086, code lost:
    
        if (r6.f1180 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0038, code lost:
    
        if (r6.f1201 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0088, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0074, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3851(p034.p105.p106.C1794 r11, p034.p105.p106.AbstractC1788.C1789 r12, android.util.SparseArray<p034.p105.p106.C1796.C1797> r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p105.p106.C1796.m3851(づざかべべ.ぺふねづ〺.げつ〴ぬぐ.げつ〴ぬぐ, づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぇぬぎばつ$げつ〴ぬぐ, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static AbstractC1787 m3852(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            fragment.m529();
            Object m506 = fragment.m506();
            if (m506 != null) {
                arrayList.add(m506);
            }
            Object m527 = fragment.m527();
            if (m527 != null) {
                arrayList.add(m527);
            }
        }
        if (fragment2 != null) {
            fragment2.m513();
            Object m507 = fragment2.m507();
            if (m507 != null) {
                arrayList.add(m507);
            }
            fragment2.m514();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AbstractC1787 abstractC1787 = f8082;
        if (abstractC1787 != null && m3861(abstractC1787, arrayList)) {
            return abstractC1787;
        }
        AbstractC1787 abstractC17872 = f8083;
        if (abstractC17872 != null && m3861(abstractC17872, arrayList)) {
            return abstractC17872;
        }
        if (abstractC1787 == null && abstractC17872 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static Object m3853(AbstractC1787 abstractC1787, Fragment fragment, boolean z) {
        Object obj = null;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.m506();
        } else {
            fragment.m529();
        }
        return abstractC1787.mo3768(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0431 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0210  */
    /* JADX WARN: Type inference failed for: r13v4, types: [づざかべべ.づざかべべ.〳ぜぞぜべっ] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3854(p034.p105.p106.LayoutInflaterFactory2C1815 r38, java.util.ArrayList<p034.p105.p106.C1794> r39, java.util.ArrayList<java.lang.Boolean> r40, int r41, int r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p105.p106.C1796.m3854(づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぺぁあねじ, java.util.ArrayList, java.util.ArrayList, int, int, boolean):void");
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static void m3855(Fragment fragment, Fragment fragment2, boolean z, C1502<String, View> c1502, boolean z2) {
        if (z) {
            fragment2.m521();
        } else {
            fragment.m521();
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static void m3856(ArrayList<View> arrayList, C1502<String, View> c1502, Collection<String> collection) {
        for (int i = c1502.f6910 - 1; i >= 0; i--) {
            View m3255 = c1502.m3255(i);
            if (collection.contains(C1096.m2497(m3255))) {
                arrayList.add(m3255);
            }
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static C1502<String, View> m3857(AbstractC1787 abstractC1787, C1502<String, String> c1502, Object obj, C1797 c1797) {
        ArrayList<String> arrayList;
        Fragment fragment = c1797.f8087;
        View view = fragment.f1186;
        if (c1502.isEmpty() || obj == null || view == null) {
            c1502.clear();
            return null;
        }
        C1502<String, View> c15022 = new C1502<>();
        abstractC1787.m3833(c15022, view);
        C1794 c1794 = c1797.f8086;
        if (c1797.f8085) {
            arrayList = c1794.f8046;
        } else {
            fragment.m521();
            arrayList = c1794.f8038;
        }
        if (arrayList != null) {
            AbstractC1495.m3266(c15022, arrayList);
            AbstractC1495.m3266(c15022, c1502.values());
        }
        int i = c1502.f6910;
        while (true) {
            i--;
            if (i < 0) {
                return c15022;
            }
            if (!c15022.containsKey(c1502.m3255(i))) {
                c1502.m3254(i);
            }
        }
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static Object m3858(AbstractC1787 abstractC1787, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (z) {
            obj = fragment2.m527();
        } else {
            fragment.m514();
            obj = null;
        }
        return abstractC1787.mo3775(abstractC1787.mo3768(obj));
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static C1502<String, View> m3859(AbstractC1787 abstractC1787, C1502<String, String> c1502, Object obj, C1797 c1797) {
        ArrayList<String> arrayList;
        if (c1502.isEmpty() || obj == null) {
            c1502.clear();
            return null;
        }
        Fragment fragment = c1797.f8090;
        C1502<String, View> c15022 = new C1502<>();
        abstractC1787.m3833(c15022, fragment.m509());
        C1794 c1794 = c1797.f8089;
        if (c1797.f8088) {
            fragment.m521();
            arrayList = c1794.f8038;
        } else {
            arrayList = c1794.f8046;
        }
        AbstractC1495.m3266(c15022, arrayList);
        AbstractC1495.m3266(c1502, c15022.keySet());
        return c15022;
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static void m3860(AbstractC1787 abstractC1787, Object obj, Object obj2, C1502<String, View> c1502, boolean z, C1794 c1794) {
        ArrayList<String> arrayList = c1794.f8046;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = c1502.get((z ? c1794.f8038 : c1794.f8046).get(0));
        abstractC1787.mo3776(obj, view);
        if (obj2 != null) {
            abstractC1787.mo3776(obj2, view);
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static boolean m3861(AbstractC1787 abstractC1787, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!abstractC1787.mo3777(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public static void m3862(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static Object m3863(AbstractC1787 abstractC1787, Fragment fragment, boolean z) {
        Object obj = null;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.m507();
        } else {
            fragment.m513();
        }
        return abstractC1787.mo3768(obj);
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static View m3864(C1502<String, View> c1502, C1797 c1797, Object obj, boolean z) {
        ArrayList<String> arrayList;
        C1794 c1794 = c1797.f8086;
        if (obj == null || c1502 == null || (arrayList = c1794.f8046) == null || arrayList.isEmpty()) {
            return null;
        }
        return c1502.get((z ? c1794.f8046 : c1794.f8038).get(0));
    }
}
