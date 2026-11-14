package dev.epro.httpcustom.core.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dev.epro.r0.O18369580107802500074;
import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes.dex */
public final class CatalogRefreshReceiver extends BroadcastReceiver {
    public static final ArrayBlockingQueue a;

    static {
        int ewybgeplycoc;
        izmyclvb.oeynnivvrnts0(390);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                ewybgeplycoc = ewybgeplycoc(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (ewybgeplycoc != 0) {
                switch (ewybgeplycoc) {
                    case 1:
                        a = (ArrayBlockingQueue) objArr[1];
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void bunzgdiztahz();

    private static native int ewybgeplycoc(Object[] objArr);

    @Override // android.content.BroadcastReceiver
    public final native void onReceive(Context context, Intent intent);

    public static final class Y6921797927338498306 {
        static {
            izmyclvb.oeynnivvrnts0(979);
        }

        private native void hoztvnsotesc();

        private native void sqlvqlydhwvn(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Y6921797927338498306(O18369580107802500074 o18369580107802500074) {
            this();
            sqlvqlydhwvn(o18369580107802500074);
        }

        private Y6921797927338498306() {
            hoztvnsotesc();
        }
    }

    public static final class Z11244019023321623390 {
        public final String a;
        public final boolean b;

        static {
            izmyclvb.oeynnivvrnts0(62);
        }

        private native void yzqyodccbcnb(String str, boolean z);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Z11244019023321623390(String str, boolean z) {
            str.getClass();
            yzqyodccbcnb(str, z);
        }
    }

    public CatalogRefreshReceiver() {
        bunzgdiztahz();
    }
}
