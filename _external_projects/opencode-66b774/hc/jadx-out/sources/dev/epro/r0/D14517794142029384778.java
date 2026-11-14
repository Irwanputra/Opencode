package dev.epro.r0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class D14517794142029384778 {
    public static final D14517794142029384778 a;
    public static Context b;
    public static boolean c;
    public static boolean d;
    public static final Z11244019023321623390 e;

    static {
        int iEfuivnqhhzwl;
        izmyclvb.oeynnivvrnts0(1024);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iEfuivnqhhzwl = efuivnqhhzwl(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iEfuivnqhhzwl != 0) {
                switch (iEfuivnqhhzwl) {
                    case 1:
                        a = (D14517794142029384778) objArr[1];
                        continue;
                    case 2:
                        e = (Z11244019023321623390) objArr[1];
                        continue;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native Object a(JSONObject jSONObject);

    public static native JSONObject b(String str, Object obj);

    public static native void c(E9947071562186447382 e9947071562186447382, boolean z);

    private static native int efuivnqhhzwl(Object[] objArr);

    private native void iaxjjgimclbo();

    public static final class Z11244019023321623390 extends BroadcastReceiver {
        static {
            izmyclvb.oeynnivvrnts0(421);
        }

        private native void sgkarhjggluj();

        @Override // android.content.BroadcastReceiver
        public final native void onReceive(Context context, Intent intent);

        public Z11244019023321623390() {
            sgkarhjggluj();
        }
    }

    private D14517794142029384778() {
        iaxjjgimclbo();
    }
}
