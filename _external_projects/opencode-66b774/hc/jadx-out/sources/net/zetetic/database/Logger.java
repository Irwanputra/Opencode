package net.zetetic.database;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public class Logger {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private static LogTarget target;

    static {
        setTarget(new LogcatTarget());
    }

    public static void d(String str, String str2) {
        getTarget().log(3, str, str2, null);
    }

    public static void e(String str, String str2) {
        getTarget().log(6, str, str2, null);
    }

    private static LogTarget getTarget() {
        if (target == null) {
            setTarget(new NoopTarget());
        }
        return target;
    }

    public static void i(String str, String str2) {
        getTarget().log(4, str, str2, null);
    }

    public static boolean isLoggable(String str, int i) {
        return getTarget().isLoggable(str, i);
    }

    public static void setTarget(LogTarget logTarget) {
        target = logTarget;
    }

    public static void v(String str, String str2) {
        getTarget().log(2, str, str2, null);
    }

    public static void w(String str, String str2) {
        getTarget().log(5, str, str2, null);
    }

    public static void wtf(String str, String str2) {
        getTarget().log(7, str, str2, null);
    }

    public static void d(String str, String str2, Throwable th) {
        getTarget().log(3, str, str2, th);
    }

    public static void e(String str, String str2, Throwable th) {
        getTarget().log(6, str, str2, th);
    }

    public static void i(String str, String str2, Throwable th) {
        getTarget().log(4, str, str2, th);
    }

    public static void v(String str, String str2, Throwable th) {
        getTarget().log(2, str, str2, th);
    }

    public static void w(String str, String str2, Throwable th) {
        getTarget().log(5, str, str2, th);
    }

    public static void wtf(String str, String str2, Throwable th) {
        getTarget().log(7, str, str2, th);
    }
}
