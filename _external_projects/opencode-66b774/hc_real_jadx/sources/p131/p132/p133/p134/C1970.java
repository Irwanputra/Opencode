package p131.p132.p133.p134;

/* renamed from: なぎぱいぢぎ.〳ぜぞぜべっ.げつ〴ぬぐ.くし〴〺ぅ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1970 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static int f8587 = 5;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static String m4087() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        int lineNumber = stackTrace[2].getLineNumber();
        return className.substring(className.lastIndexOf(46) + 1) + ": " + methodName + "() [" + lineNumber + "] - ";
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static void m4088(Object obj) {
        if (f8587 > 4) {
            m4087();
            String.valueOf(obj);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static void m4089(Object obj) {
        if (f8587 > 0) {
            m4087();
            String.valueOf(obj);
            m4087();
            String.valueOf(obj);
        }
    }
}
