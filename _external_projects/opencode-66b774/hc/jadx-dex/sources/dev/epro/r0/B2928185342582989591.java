package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract /* synthetic */ class B2928185342582989591 {
    public static /* bridge */ /* synthetic */ boolean B(java.lang.Exception exc) {
        return exc instanceof android.net.http.NetworkException;
    }

    public static /* bridge */ /* synthetic */ boolean C(java.lang.Exception exc) {
        return exc instanceof android.net.http.CallbackException;
    }

    public static /* bridge */ /* synthetic */ boolean D(java.lang.Exception exc) {
        return exc instanceof android.net.http.HttpException;
    }

    public static /* bridge */ /* synthetic */ android.net.http.CallbackException e(java.lang.Exception exc) {
        return (android.net.http.CallbackException) exc;
    }

    public static /* bridge */ /* synthetic */ android.net.http.HttpException g(java.lang.Exception exc) {
        return (android.net.http.HttpException) exc;
    }

    public static /* bridge */ /* synthetic */ android.net.http.NetworkException h(java.lang.Exception exc) {
        return (android.net.http.NetworkException) exc;
    }

    public static /* bridge */ /* synthetic */ android.net.http.QuicException i(java.lang.Exception exc) {
        return (android.net.http.QuicException) exc;
    }

    public static /* bridge */ /* synthetic */ java.lang.Class j() {
        return android.view.inputmethod.SelectGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean t(java.lang.Exception exc) {
        return exc instanceof android.net.http.InlineExecutionProhibitedException;
    }

    public static /* bridge */ /* synthetic */ boolean y(java.lang.Exception exc) {
        return exc instanceof android.net.http.QuicException;
    }
}
