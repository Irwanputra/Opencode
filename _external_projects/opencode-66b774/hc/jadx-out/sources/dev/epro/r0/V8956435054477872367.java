package dev.epro.r0;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V8956435054477872367 {
    public static final P5124777957357031757 b = new P5124777957357031757(Arrays.copyOf(new byte[]{42}, 1));
    public static final List c = K5751602218013079365.U("*");
    public static final V8956435054477872367 d = new V8956435054477872367(new B16853324304735504143((byte) 2));
    public final B16853324304735504143 a;

    public V8956435054477872367(B16853324304735504143 b16853324304735504143) {
        this.a = b16853324304735504143;
    }

    public static List b(String str) {
        List listO0 = M8927913404651150384.o0(str, new char[]{'.'}, 6);
        return S10823041268949770285.t(R9411874267597469228.K0(listO0), "") ? R9411874267597469228.y0(listO0) : listO0;
    }

    public final String a(String str) {
        String strU;
        String strU2;
        String strU3;
        List listO0;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List listB = b(unicode);
        B16853324304735504143 b16853324304735504143 = this.a;
        AtomicBoolean atomicBoolean = (AtomicBoolean) b16853324304735504143.a;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                ((CountDownLatch) b16853324304735504143.b).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        b16853324304735504143.g();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        b16853324304735504143.e = e;
                        if (z) {
                        }
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (((P5124777957357031757) b16853324304735504143.c) == null) {
            StringBuilder sb = new StringBuilder("Unable to load ");
            sb.append(b16853324304735504143.f);
            sb.append(" resource.");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            illegalStateException.initCause((IOException) b16853324304735504143.e);
            throw illegalStateException;
        }
        int size3 = listB.size();
        P5124777957357031757[] p5124777957357031757Arr = new P5124777957357031757[size3];
        for (int i = 0; i < size3; i++) {
            P5124777957357031757 p5124777957357031757 = P5124777957357031757.d;
            p5124777957357031757Arr[i] = J3301701597851028733.u((String) listB.get(i));
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                strU = null;
                break;
            }
            P5124777957357031757 p51247779573570317572 = (P5124777957357031757) b16853324304735504143.c;
            if (p51247779573570317572 == null) {
                S10823041268949770285.b0("bytes");
                throw null;
            }
            strU = M17147082063200071302.u(p51247779573570317572, p5124777957357031757Arr, i2);
            if (strU != null) {
                break;
            }
            i2++;
        }
        if (size3 > 1) {
            P5124777957357031757[] p5124777957357031757Arr2 = (P5124777957357031757[]) p5124777957357031757Arr.clone();
            int length = p5124777957357031757Arr2.length - 1;
            for (int i3 = 0; i3 < length; i3++) {
                p5124777957357031757Arr2[i3] = b;
                P5124777957357031757 p51247779573570317573 = (P5124777957357031757) b16853324304735504143.c;
                if (p51247779573570317573 == null) {
                    S10823041268949770285.b0("bytes");
                    throw null;
                }
                strU2 = M17147082063200071302.u(p51247779573570317573, p5124777957357031757Arr2, i3);
                if (strU2 != null) {
                    break;
                }
            }
            strU2 = null;
        } else {
            strU2 = null;
        }
        if (strU2 != null) {
            int i4 = size3 - 1;
            for (int i5 = 0; i5 < i4; i5++) {
                P5124777957357031757 p51247779573570317574 = (P5124777957357031757) b16853324304735504143.d;
                if (p51247779573570317574 == null) {
                    S10823041268949770285.b0("exceptionBytes");
                    throw null;
                }
                strU3 = M17147082063200071302.u(p51247779573570317574, p5124777957357031757Arr, i5);
                if (strU3 != null) {
                    break;
                }
            }
            strU3 = null;
        } else {
            strU3 = null;
        }
        if (strU3 != null) {
            listO0 = M8927913404651150384.o0("!".concat(strU3), new char[]{'.'}, 6);
        } else if (strU == null && strU2 == null) {
            listO0 = c;
        } else {
            List listO02 = O2161699089510411363.a;
            List listO03 = strU != null ? M8927913404651150384.o0(strU, new char[]{'.'}, 6) : listO02;
            if (strU2 != null) {
                listO02 = M8927913404651150384.o0(strU2, new char[]{'.'}, 6);
            }
            listO0 = listO03.size() > listO02.size() ? listO03 : listO02;
        }
        if (listB.size() == listO0.size() && ((String) listO0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listO0.get(0)).charAt(0) == '!') {
            size = listB.size();
            size2 = listO0.size();
        } else {
            size = listB.size();
            size2 = listO0.size() + 1;
        }
        return T2881242016550624223.E(T2881242016550624223.A(new V11146580314972738611(b(str), (byte) 1), size - size2), ".", null, 62);
    }
}
