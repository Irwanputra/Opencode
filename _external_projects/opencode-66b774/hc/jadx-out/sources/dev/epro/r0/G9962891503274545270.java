package dev.epro.r0;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class G9962891503274545270 extends W287267600478292859 {
    public static final Z11244019023321623390 c;
    public final Map a;
    public final V5566771124704147141 b;

    static {
        int iWgvfwpwuyked;
        izmyclvb.dpqpjfpoanwt1(2216);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iWgvfwpwuyked = wgvfwpwuyked(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iWgvfwpwuyked != 0) {
                switch (iWgvfwpwuyked) {
                    case 1:
                        c = (Z11244019023321623390) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void owwdrjpcfeun(Map<String, Object> map, V5566771124704147141 v5566771124704147141);

    private native void vjredcwjenbn(Map map, V5566771124704147141 v5566771124704147141, O18369580107802500074 o18369580107802500074);

    private static native int wgvfwpwuyked(Object[] objArr);

    @Override // dev.epro.r0.W287267600478292859
    public final native Set a();

    @Override // dev.epro.r0.W287267600478292859
    public final native int c();

    @Override // java.util.AbstractMap, java.util.Map
    public final native void clear();

    @Override // java.util.AbstractMap, java.util.Map
    public final native boolean containsKey(Object obj);

    public final native G9962891503274545270 e();

    public final native Object f(Object obj);

    public final native Y6921797927338498306 g(String str);

    @Override // java.util.AbstractMap, java.util.Map
    public final native Object get(Object obj);

    @Override // java.util.Map
    public final native /* bridge */ Object getOrDefault(Object obj, Object obj2);

    public final native Object h(Object obj);

    @Override // java.util.AbstractMap, java.util.Map
    public final native Object put(Object obj, Object obj2);

    @Override // java.util.AbstractMap, java.util.Map
    public final native void putAll(Map map);

    @Override // java.util.AbstractMap, java.util.Map
    public final native Object remove(Object obj);

    @Override // java.util.Map
    public final native /* bridge */ boolean remove(Object obj, Object obj2);

    @Override // java.util.AbstractMap
    public final native String toString();

    public static final class Y6921797927338498306 {
        public final U5098391714541788053 a;

        static {
            izmyclvb.dpqpjfpoanwt1(740);
        }

        private native void zaiqxhkyimzd(U5098391714541788053 u5098391714541788053);

        public Y6921797927338498306(U5098391714541788053 u5098391714541788053) {
            u5098391714541788053.getClass();
            zaiqxhkyimzd(u5098391714541788053);
        }
    }

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.dpqpjfpoanwt1(573);
        }

        public static native G9962891503274545270 a(Map map, V5566771124704147141 v5566771124704147141);

        private native void jvmfgyhgzmlj(O18369580107802500074 o18369580107802500074);

        private native void xwysahwseljv();

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            jvmfgyhgzmlj(o18369580107802500074);
        }

        private Z11244019023321623390() {
            xwysahwseljv();
        }
    }

    private G9962891503274545270(Map<String, Object> map, V5566771124704147141 v5566771124704147141) {
        owwdrjpcfeun(map, v5566771124704147141);
    }

    public /* synthetic */ G9962891503274545270(Map map, V5566771124704147141 v5566771124704147141, O18369580107802500074 o18369580107802500074) {
        this(map, v5566771124704147141);
        vjredcwjenbn(map, v5566771124704147141, o18369580107802500074);
    }
}
