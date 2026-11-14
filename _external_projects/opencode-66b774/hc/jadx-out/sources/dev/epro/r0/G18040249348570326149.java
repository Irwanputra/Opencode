package dev.epro.r0;

import android.app.NotificationManager;
import android.content.Context;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class G18040249348570326149 implements S7864201625552763331 {
    public final /* synthetic */ NotificationManager a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ long c;

    static {
        izmyclvb.dpqpjfpoanwt1(850);
    }

    private native void irwhbopruunn(NotificationManager notificationManager, Context context, long j);

    @Override // dev.epro.r0.S7864201625552763331
    public final native Object emit(Object obj, R4833348786910499294 r4833348786910499294);

    public G18040249348570326149(NotificationManager notificationManager, Context context, long j) {
        this.a = notificationManager;
        this.b = context;
        this.c = j;
        irwhbopruunn(notificationManager, context, j);
    }
}
