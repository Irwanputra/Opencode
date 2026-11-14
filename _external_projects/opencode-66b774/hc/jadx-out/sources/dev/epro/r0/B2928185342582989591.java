package dev.epro.r0;

import android.net.http.CallbackException;
import android.net.http.HttpException;
import android.net.http.InlineExecutionProhibitedException;
import android.net.http.NetworkException;
import android.net.http.QuicException;
import android.view.inputmethod.SelectGesture;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class B2928185342582989591 {
    public static /* bridge */ /* synthetic */ boolean B(Exception exc) {
        return exc instanceof NetworkException;
    }

    public static /* bridge */ /* synthetic */ boolean C(Exception exc) {
        return exc instanceof CallbackException;
    }

    public static /* bridge */ /* synthetic */ boolean D(Exception exc) {
        return exc instanceof HttpException;
    }

    public static /* bridge */ /* synthetic */ CallbackException e(Exception exc) {
        return (CallbackException) exc;
    }

    public static /* bridge */ /* synthetic */ HttpException g(Exception exc) {
        return (HttpException) exc;
    }

    public static /* bridge */ /* synthetic */ NetworkException h(Exception exc) {
        return (NetworkException) exc;
    }

    public static /* bridge */ /* synthetic */ QuicException i(Exception exc) {
        return (QuicException) exc;
    }

    public static /* bridge */ /* synthetic */ Class j() {
        return SelectGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean t(Exception exc) {
        return exc instanceof InlineExecutionProhibitedException;
    }

    public static /* bridge */ /* synthetic */ boolean y(Exception exc) {
        return exc instanceof QuicException;
    }
}
