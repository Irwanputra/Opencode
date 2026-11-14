package dev.epro.r0;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F12902864952249894497 implements Iterable, D14639766352081121636 {
    public static final F12902864952249894497 b = new F12902864952249894497(new String[0]);
    public final String[] a;

    public F12902864952249894497(String[] strArr) {
        strArr.getClass();
        this.a = strArr;
    }

    public final String a(String str) {
        String[] strArr = this.a;
        strArr.getClass();
        int length = strArr.length - 2;
        int iP = T18016951143603335921.P(length, 0, -2);
        if (iP > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iP) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof F12902864952249894497) {
            return Arrays.equals(this.a, ((F12902864952249894497) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        H9390398899829886498[] h9390398899829886498Arr = new H9390398899829886498[size];
        for (int i = 0; i < size; i++) {
            h9390398899829886498Arr[i] = new H9390398899829886498(X7410747940286448830.e(this, i), X7410747940286448830.g(this, i));
        }
        return new Z1085125311131623997(h9390398899829886498Arr);
    }

    public final int size() {
        return this.a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strE = X7410747940286448830.e(this, i);
            String strG = X7410747940286448830.g(this, i);
            sb.append(strE);
            sb.append(": ");
            if (L14928198200995638215.j(strE)) {
                strG = "██";
            }
            sb.append(strG);
            sb.append("\n");
        }
        return sb.toString();
    }
}
