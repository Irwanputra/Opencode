package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B3714102630340914807 extends android.os.Binder implements dev.epro.r0.W6246905659779124559 {
    public final /* synthetic */ androidx.room.MultiInstanceInvalidationService a;

    /* JADX WARN: Multi-variable type inference failed */
    public B3714102630340914807(androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
        attachInterface(this, dev.epro.r0.W6246905659779124559.Uo);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
        dev.epro.r0.Y2182179812378499171 y2182179812378499171;
        java.lang.String str = dev.epro.r0.W6246905659779124559.Uo;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        int i3 = 0;
        dev.epro.r0.L11636844115202314953 y487518050172069157 = null;
        if (i == 1) {
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                dev.epro.r0.L11636844115202314953 l11636844115202314953QueryLocalInterface = strongBinder.queryLocalInterface(dev.epro.r0.L11636844115202314953.To);
                if (l11636844115202314953QueryLocalInterface == null || !(l11636844115202314953QueryLocalInterface instanceof dev.epro.r0.L11636844115202314953)) {
                    y487518050172069157 = new dev.epro.r0.Y487518050172069157();
                    ((dev.epro.r0.Y487518050172069157) y487518050172069157).a = strongBinder;
                } else {
                    y487518050172069157 = l11636844115202314953QueryLocalInterface;
                }
            }
            java.lang.String string = parcel.readString();
            y487518050172069157.getClass();
            if (string != null) {
                androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
                synchronized (multiInstanceInvalidationService.c) {
                    try {
                        int i4 = multiInstanceInvalidationService.a + 1;
                        multiInstanceInvalidationService.a = i4;
                        if (multiInstanceInvalidationService.c.register(y487518050172069157, java.lang.Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.b.put(java.lang.Integer.valueOf(i4), string);
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
            android.os.IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                dev.epro.r0.L11636844115202314953 l11636844115202314953QueryLocalInterface2 = strongBinder2.queryLocalInterface(dev.epro.r0.L11636844115202314953.To);
                if (l11636844115202314953QueryLocalInterface2 == null || !(l11636844115202314953QueryLocalInterface2 instanceof dev.epro.r0.L11636844115202314953)) {
                    y487518050172069157 = new dev.epro.r0.Y487518050172069157();
                    ((dev.epro.r0.Y487518050172069157) y487518050172069157).a = strongBinder2;
                } else {
                    y487518050172069157 = l11636844115202314953QueryLocalInterface2;
                }
            }
            int i5 = parcel.readInt();
            y487518050172069157.getClass();
            androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.a;
            synchronized (multiInstanceInvalidationService2.c) {
                multiInstanceInvalidationService2.c.unregister(y487518050172069157);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i6 = parcel.readInt();
        java.lang.String[] strArrCreateStringArray = parcel.createStringArray();
        strArrCreateStringArray.getClass();
        androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.a;
        synchronized (multiInstanceInvalidationService3.c) {
            try {
                java.lang.String str2 = (java.lang.String) multiInstanceInvalidationService3.b.get(java.lang.Integer.valueOf(i6));
                if (str2 != null) {
                    int iBeginBroadcast = multiInstanceInvalidationService3.c.beginBroadcast();
                    while (true) {
                        y2182179812378499171 = multiInstanceInvalidationService3.c;
                        if (i3 >= iBeginBroadcast) {
                            break;
                        }
                        try {
                            java.lang.Object broadcastCookie = y2182179812378499171.getBroadcastCookie(i3);
                            broadcastCookie.getClass();
                            java.lang.Integer num = (java.lang.Integer) broadcastCookie;
                            int iIntValue = num.intValue();
                            java.lang.String str3 = (java.lang.String) multiInstanceInvalidationService3.b.get(num);
                            if (i6 != iIntValue && str2.equals(str3)) {
                                try {
                                    multiInstanceInvalidationService3.c.getBroadcastItem(i3).a(strArrCreateStringArray);
                                } catch (android.os.RemoteException unused) {
                                }
                            }
                            i3++;
                        } catch (java.lang.Throwable th) {
                            multiInstanceInvalidationService3.c.finishBroadcast();
                            throw th;
                        }
                    }
                    y2182179812378499171.finishBroadcast();
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    public final android.os.IBinder asBinder() {
        return this;
    }
}
