package dev.epro.r0;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Q15434108051134495466 {
    static {
        B14824868959299866349.o("ProcessUtils");
    }

    public static final boolean a(Context context, W1977247516027959386 w1977247516027959386) {
        String strI;
        Object next;
        Object objInvoke;
        context.getClass();
        w1977247516027959386.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            strI = C15025379344307230271.i();
        } else {
            strI = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, W13734796219485846113.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                objInvoke = declaredMethod.invoke(null, null);
                objInvoke.getClass();
            } catch (Throwable unused) {
                B14824868959299866349.n().getClass();
            }
            if (objInvoke instanceof String) {
                strI = (String) objInvoke;
            } else {
                int iMyPid = Process.myPid();
                Object systemService = context.getSystemService("activity");
                systemService.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    Iterator<T> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid) {
                            break;
                        }
                    }
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                    if (runningAppProcessInfo != null) {
                        strI = runningAppProcessInfo.processName;
                    }
                }
            }
        }
        return S10823041268949770285.t(strI, context.getApplicationInfo().processName);
    }
}
