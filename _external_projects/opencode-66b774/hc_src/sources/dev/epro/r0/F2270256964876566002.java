package dev.epro.r0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F2270256964876566002 extends R502132765509599220 {
    public final Context a;
    public final /* synthetic */ X11123940576545591343 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F2270256964876566002(X11123940576545591343 x11123940576545591343, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.b = x11123940576545591343;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        int i = G14026964626121631668.a;
        X11123940576545591343 x11123940576545591343 = this.b;
        Context context = this.a;
        int b = x11123940576545591343.b(context, i);
        AtomicBoolean atomicBoolean = Y2177079631878275493.a;
        if (b == 1 || b == 2 || b == 3 || b == 9) {
            Intent a = x11123940576545591343.a(context, b, "n");
            x11123940576545591343.f(context, b, a == null ? null : PendingIntent.getActivity(context, 0, a, 201326592));
        }
    }
}
