package dev.epro.r0;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class S9853624340567802176 {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public S9853624340567802176(int i) {
        this.a = i;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public boolean a(Z102412548944701279 z102412548944701279) {
        if (z102412548944701279.f.get(null) == null) {
            return false;
        }
        Z3383101362411723454.s();
        return false;
    }

    public J18325703078859211263[] b(Z102412548944701279 z102412548944701279) {
        if (z102412548944701279.f.get(null) == null) {
            return null;
        }
        Z3383101362411723454.s();
        return null;
    }

    public abstract void c(Status status);

    public abstract void d(Exception exc);

    public abstract void e(Z102412548944701279 z102412548944701279);

    public /* bridge */ /* synthetic */ void f(K12477491117444883648 k12477491117444883648, boolean z) {
    }
}
