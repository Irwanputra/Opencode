package dev.epro.r0;

import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public final class B12153340152765236416 {
    public static final Z11244019023321623390 c;
    public static final H5336160545165318150 d;
    public final G15784312341299238612 a;
    public final Set b;

    static {
        int iGhvshguqivjv;
        izmyclvb.oeynnivvrnts0(398);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iGhvshguqivjv = ghvshguqivjv(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iGhvshguqivjv != 0) {
                switch (iGhvshguqivjv) {
                    case 1:
                        c = (Z11244019023321623390) objArr[1];
                        continue;
                    case 2:
                        d = (H5336160545165318150) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ B12153340152765236416(G15784312341299238612 g15784312341299238612, Set set, int i, O18369580107802500074 o18369580107802500074) {
        Object[] objArrUcbuaqghovja = ucbuaqghovja(g15784312341299238612, set, i, o18369580107802500074);
        this((G15784312341299238612) objArrUcbuaqghovja[0], (Set) objArrUcbuaqghovja[1]);
        efrfubynsuie1();
    }

    public static native B12153340152765236416 a(B12153340152765236416 b12153340152765236416, Set set);

    private native void efrfubynsuie();

    private native void efrfubynsuie1();

    private static native int ghvshguqivjv(Object[] objArr);

    private static native Object[] ucbuaqghovja(G15784312341299238612 g15784312341299238612, Set set, int i, O18369580107802500074 o18369580107802500074);

    private native void yaspfjwfjcha(G15784312341299238612 g15784312341299238612, Set<String> set);

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.oeynnivvrnts0(262);
        }

        public static native SortedSet a(String str);

        public static native SortedSet b(Iterable iterable);

        private native void lldrzrchlust();

        private native void qvmdzflsyslz(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            qvmdzflsyslz(o18369580107802500074);
        }

        private Z11244019023321623390() {
            lldrzrchlust();
        }
    }

    public B12153340152765236416(G15784312341299238612 g15784312341299238612, Set<String> set) {
        g15784312341299238612.getClass();
        set.getClass();
        yaspfjwfjcha(g15784312341299238612, set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public B12153340152765236416() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        efrfubynsuie();
    }
}
