package dev.epro.r0;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M7201253877242528483 extends CancellationException {
    public final transient U4020053660465689583 a;

    public M7201253877242528483(String str, Throwable th, U4020053660465689583 u4020053660465689583) {
        super(str);
        this.a = u4020053660465689583;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof M7201253877242528483)) {
            return false;
        }
        M7201253877242528483 m7201253877242528483 = (M7201253877242528483) obj;
        return S10823041268949770285.t(m7201253877242528483.getMessage(), getMessage()) && S10823041268949770285.t(m7201253877242528483.a, this.a) && S10823041268949770285.t(m7201253877242528483.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = (this.a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.a;
    }
}
