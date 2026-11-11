package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzbs;
import java.io.DataInputStream;
import java.io.IOException;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzabj extends zzbfm {
    public static final Parcelable.Creator<zzabj> CREATOR = new zzabl();
    private ParcelFileDescriptor zzcpy;
    private Parcelable zzcpz;
    private boolean zzcqa;

    public zzabj(ParcelFileDescriptor parcelFileDescriptor) {
        this.zzcpy = parcelFileDescriptor;
        this.zzcpz = null;
        this.zzcqa = true;
    }

    public zzabj(zzbfq zzbfqVar) {
        this.zzcpy = null;
        this.zzcpz = zzbfqVar;
        this.zzcqa = false;
    }

    private final <T> ParcelFileDescriptor zze(byte[] bArr) {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        ParcelFileDescriptor[] createPipe;
        try {
            createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
        } catch (IOException e) {
            e = e;
            autoCloseOutputStream = null;
        }
        try {
            new Thread(new zzabk(this, autoCloseOutputStream, bArr)).start();
            return createPipe[0];
        } catch (IOException e2) {
            e = e2;
            zzakb.zzb("Error transporting the ad response", e);
            zzbs.zzem().zza(e, "LargeParcelTeleporter.pipeData.2");
            if (autoCloseOutputStream != null) {
                try {
                    autoCloseOutputStream.close();
                } catch (IOException unused) {
                }
            }
            return null;
        }
    }

    private final ParcelFileDescriptor zznn() {
        if (this.zzcpy == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.zzcpz.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                this.zzcpy = zze(marshall);
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        return this.zzcpy;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zznn();
        int zze = zzbfp.zze(parcel);
        zzbfp.zza(parcel, 2, (Parcelable) this.zzcpy, i, false);
        zzbfp.zzai(parcel, zze);
    }

    public final <T extends zzbfq> T zza(Parcelable.Creator<T> creator) {
        if (this.zzcqa) {
            if (this.zzcpy == null) {
                zzakb.e("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.zzcpy));
            try {
                try {
                    int readInt = dataInputStream.readInt();
                    byte[] bArr = new byte[readInt];
                    dataInputStream.readFully(bArr, 0, readInt);
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.unmarshall(bArr, 0, readInt);
                        obtain.setDataPosition(0);
                        this.zzcpz = creator.createFromParcel(obtain);
                        obtain.recycle();
                        this.zzcqa = false;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (IOException e) {
                    zzakb.zzb("Could not read from parcel file descriptor", e);
                    try {
                        dataInputStream.close();
                    } catch (IOException unused) {
                    }
                    return null;
                }
            } finally {
                try {
                    dataInputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        return (T) this.zzcpz;
    }
}
