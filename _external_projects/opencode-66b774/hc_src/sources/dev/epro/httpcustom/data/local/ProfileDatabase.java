package dev.epro.httpcustom.data.local;

import ads_mobile_sdk.pd;
import android.content.Context;
import dev.epro.r0.C9265849176590713551;
import dev.epro.r0.J196785984016436306;
import dev.epro.r0.O18369580107802500074;
import java.util.Arrays;
import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes.dex */
public abstract class ProfileDatabase extends J196785984016436306 {
    public static final Z11244019023321623390 l;
    public static volatile ProfileDatabase m;

    static {
        int ermbldawmgoc;
        izmyclvb.oeynnivvrnts0(113);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                ermbldawmgoc = ermbldawmgoc(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (ermbldawmgoc != 0) {
                switch (ermbldawmgoc) {
                    case 1:
                        l = (Z11244019023321623390) objArr[1];
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private static native int ermbldawmgoc(Object[] objArr);

    private native void vdpmfhennjkk();

    public abstract C9265849176590713551 s();

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.oeynnivvrnts0(pd.f1);
        }

        public static native List a(Context context);

        private native void pociffoknxuf();

        private native void pygcnpwkywcb(O18369580107802500074 o18369580107802500074);

        public final native ProfileDatabase b(Context context);

        public final native void c(Context context);

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            pygcnpwkywcb(o18369580107802500074);
        }

        private Z11244019023321623390() {
            pociffoknxuf();
        }
    }

    public ProfileDatabase() {
        vdpmfhennjkk();
    }
}
