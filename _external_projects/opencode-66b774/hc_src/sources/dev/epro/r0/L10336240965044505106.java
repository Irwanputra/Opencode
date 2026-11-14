package dev.epro.r0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public abstract class L10336240965044505106 {
    public static final List a;
    public static final List b;
    public static final String c;

    static {
        int sfqjybxehfty;
        izmyclvb.dpqpjfpoanwt1(1762);
        Object[] objArr = new Object[10];
        while (true) {
            try {
                sfqjybxehfty = sfqjybxehfty(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (sfqjybxehfty != 0) {
                switch (sfqjybxehfty) {
                    case 1:
                        a = (List) objArr[1];
                        continue;
                    case 2:
                        b = (List) objArr[1];
                        continue;
                    case 3:
                        c = (String) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native ArrayList a(String str);

    private static native int sfqjybxehfty(Object[] objArr);
}
