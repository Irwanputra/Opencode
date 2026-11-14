package dev.epro.r0;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class X11923164775252425411 extends L14144435763408236280 implements IInterface {
    public final int j;

    public X11923164775252425411(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", (byte) 3);
        if (bArr.length == 25) {
            this.j = Arrays.hashCode(bArr);
        } else {
            K2042933864045806308.h();
            throw null;
        }
    }

    public static byte[] e(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // dev.epro.r0.L14144435763408236280
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            F17886576884473518056 f17886576884473518056 = new F17886576884473518056(d());
            parcel2.writeNoException();
            R17194208210488071321.b(parcel2, f17886576884473518056);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.j);
        return true;
    }

    public abstract byte[] d();

    public final boolean equals(Object obj) {
        if (!(obj instanceof X11923164775252425411)) {
            return false;
        }
        try {
            X11923164775252425411 x11923164775252425411 = (X11923164775252425411) obj;
            if (x11923164775252425411.j != this.j) {
                return false;
            }
            return Arrays.equals(d(), (byte[]) F17886576884473518056.e(new F17886576884473518056(x11923164775252425411.d())));
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return this.j;
    }
}
