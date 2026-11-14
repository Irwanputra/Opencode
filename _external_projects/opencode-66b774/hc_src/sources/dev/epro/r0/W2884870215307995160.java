package dev.epro.r0;

import ads_mobile_sdk.pd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class W2884870215307995160 extends RuntimeException {
    public final A8944194597127240917 a;

    public W2884870215307995160(A8944194597127240917 a8944194597127240917) {
        this.a = a8944194597127240917;
        if (a8944194597127240917.b) {
            return;
        }
        int[] iArr = {pd.d1, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = a8944194597127240917.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            M5991154792349372656 m5991154792349372656 = (M5991154792349372656) list.get(i);
            int i3 = m5991154792349372656.a;
            int i4 = 0;
            while (true) {
                if (i4 >= 9) {
                    i4 = -1;
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 < 0) {
                if (m5991154792349372656.a == 100) {
                    int i5 = i + 2;
                    if (i5 < size && ((M5991154792349372656) list.get(i5)).a == 1000) {
                        break;
                    } else {
                        P17571903987102865660.s0(arrayList);
                    }
                } else {
                    arrayList.add(m5991154792349372656);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i6 = 0; i6 < size2; i6++) {
            stackTraceElementArr[i6] = new StackTraceElement("$$compose", G6547577305291411977.n(((M5991154792349372656) arrayList.get(i6)).a, "m$"), "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        A8944194597127240917 a8944194597127240917 = this.a;
        if (!a8944194597127240917.b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        G9506192477171422664 F = K5751602218013079365.F();
        List list = a8944194597127240917.a;
        list.getClass();
        A10468597346719636873 a10468597346719636873 = new A10468597346719636873(list);
        int a = a10468597346719636873.a();
        for (int i = 0; i < a; i++) {
            ((M5991154792349372656) a10468597346719636873.get(i)).getClass();
        }
        G9506192477171422664 v = K5751602218013079365.v(F);
        v.getClass();
        A10468597346719636873 a104685973467196368732 = new A10468597346719636873(v);
        int a2 = a104685973467196368732.a();
        for (int i2 = 0; i2 < a2; i2++) {
            String str = (String) a104685973467196368732.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
