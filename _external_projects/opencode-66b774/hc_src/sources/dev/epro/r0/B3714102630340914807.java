package dev.epro.r0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B3714102630340914807 extends Binder implements W6246905659779124559 {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public B3714102630340914807(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
        attachInterface(this, W6246905659779124559.Uo);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Y2182179812378499171 y2182179812378499171;
        String str = W6246905659779124559.Uo;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        int i3 = 0;
        L11636844115202314953 l11636844115202314953 = null;
        L11636844115202314953 l116368441152023149532 = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(L11636844115202314953.To);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof L11636844115202314953)) {
                    Y487518050172069157 y487518050172069157 = new Y487518050172069157();
                    y487518050172069157.a = readStrongBinder;
                    l11636844115202314953 = y487518050172069157;
                } else {
                    l11636844115202314953 = (L11636844115202314953) queryLocalInterface;
                }
            }
            String readString = parcel.readString();
            l11636844115202314953.getClass();
            if (readString != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
                synchronized (multiInstanceInvalidationService.c) {
                    try {
                        int i4 = multiInstanceInvalidationService.a + 1;
                        multiInstanceInvalidationService.a = i4;
                        if (multiInstanceInvalidationService.c.register(l11636844115202314953, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.b.put(Integer.valueOf(i4), readString);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.a--;
                        }
                    } finally {
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(L11636844115202314953.To);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof L11636844115202314953)) {
                    Y487518050172069157 y4875180501720691572 = new Y487518050172069157();
                    y4875180501720691572.a = readStrongBinder2;
                    l116368441152023149532 = y4875180501720691572;
                } else {
                    l116368441152023149532 = (L11636844115202314953) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            l116368441152023149532.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.a;
            synchronized (multiInstanceInvalidationService2.c) {
                multiInstanceInvalidationService2.c.unregister(l116368441152023149532);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int readInt2 = parcel.readInt();
        String[] createStringArray = parcel.createStringArray();
        createStringArray.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.a;
        synchronized (multiInstanceInvalidationService3.c) {
            try {
                String str2 = (String) multiInstanceInvalidationService3.b.get(Integer.valueOf(readInt2));
                if (str2 != null) {
                    int beginBroadcast = multiInstanceInvalidationService3.c.beginBroadcast();
                    while (true) {
                        y2182179812378499171 = multiInstanceInvalidationService3.c;
                        if (i3 >= beginBroadcast) {
                            break;
                        }
                        try {
                            Object broadcastCookie = y2182179812378499171.getBroadcastCookie(i3);
                            broadcastCookie.getClass();
                            Integer num = (Integer) broadcastCookie;
                            int intValue = num.intValue();
                            String str3 = (String) multiInstanceInvalidationService3.b.get(num);
                            if (readInt2 != intValue && str2.equals(str3)) {
                                try {
                                    ((L11636844115202314953) multiInstanceInvalidationService3.c.getBroadcastItem(i3)).a(createStringArray);
                                } catch (RemoteException unused) {
                                }
                            }
                            i3++;
                        } catch (Throwable th) {
                            multiInstanceInvalidationService3.c.finishBroadcast();
                            throw th;
                        }
                    }
                    y2182179812378499171.finishBroadcast();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
