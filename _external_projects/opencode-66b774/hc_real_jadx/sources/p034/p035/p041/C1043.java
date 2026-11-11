package p034.p035.p041;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import p034.p035.p043.C1067;

/* renamed from: づざかべべ.〳ぜぞぜべっ.づざかべべ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1043 extends C1067 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final /* synthetic */ int f5473 = 0;

    /* renamed from: づざかべべ.〳ぜぞぜべっ.づざかべべ.げつ〴ぬぐ$〺つふすそ, reason: contains not printable characters */
    public interface InterfaceC1044 {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.づざかべべ.げつ〴ぬぐ$くし〴〺ぅ, reason: contains not printable characters */
    public interface InterfaceC1045 {
        /* renamed from: びぐびあび */
        void mo537(int i);
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.づざかべべ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC1046 implements Runnable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ String[] f5474;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final /* synthetic */ Activity f5475;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final /* synthetic */ int f5476;

        public RunnableC1046(String[] strArr, Activity activity, int i) {
            this.f5474 = strArr;
            this.f5475 = activity;
            this.f5476 = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f5474.length];
            PackageManager packageManager = this.f5475.getPackageManager();
            String packageName = this.f5475.getPackageName();
            int length = this.f5474.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f5474[i], packageName);
            }
            ((InterfaceC1044) this.f5475).onRequestPermissionsResult(this.f5476, this.f5474, iArr);
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static boolean m2380(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static void m2381(Activity activity, String[] strArr, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof InterfaceC1045) {
                ((InterfaceC1045) activity).mo537(i);
            }
            activity.requestPermissions(strArr, i);
        } else if (activity instanceof InterfaceC1044) {
            new Handler(Looper.getMainLooper()).post(new RunnableC1046(strArr, activity, i));
        }
    }
}
