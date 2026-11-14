package dev.epro.r0;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class Y2177079631878275493 {
    public static final AtomicBoolean a = new AtomicBoolean();
    public static final AtomicBoolean b = new AtomicBoolean();
    public static final /* synthetic */ int c = 0;

    public static void a(Context context) {
        G14026964626121631668 g14026964626121631668 = G14026964626121631668.b;
        int b2 = g14026964626121631668.b(context, 11925000);
        if (b2 != 0) {
            Intent a2 = g14026964626121631668.a(context, b2, "e");
            new StringBuilder(String.valueOf(b2).length() + 46);
            if (a2 != null) {
                throw new S1166108694551160080("Google Play Services not available");
            }
            throw new D6397819829364700013();
        }
    }
}
