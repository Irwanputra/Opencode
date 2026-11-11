.class public abstract Lcom/google/android/gms/internal/zzqr;
.super Lcom/google/android/gms/internal/zzev;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzqq;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzev;-><init>()V

    const-string v0, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener"

    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method

.method public static zzo(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzqq;
    .registers 3

    if-nez p0, :cond_4

    const/4 p0, 0x0

    return-object p0

    :cond_4
    const-string v0, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/zzqq;

    if-eqz v1, :cond_11

    check-cast v0, Lcom/google/android/gms/internal/zzqq;

    return-object v0

    :cond_11
    new-instance v0, Lcom/google/android/gms/internal/zzqs;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzqs;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .registers 6

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/zzev;->zza(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p4

    const/4 v0, 0x1

    if-eqz p4, :cond_8

    return v0

    :cond_8
    if-ne p1, v0, :cond_2d

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_12

    const/4 p1, 0x0

    goto :goto_26

    :cond_12
    const-string p2, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd"

    invoke-interface {p1, p2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    instance-of p4, p2, Lcom/google/android/gms/internal/zzqe;

    if-eqz p4, :cond_20

    move-object p1, p2

    check-cast p1, Lcom/google/android/gms/internal/zzqe;

    goto :goto_26

    :cond_20
    new-instance p2, Lcom/google/android/gms/internal/zzqg;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/zzqg;-><init>(Landroid/os/IBinder;)V

    move-object p1, p2

    :goto_26
    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzqq;->zza(Lcom/google/android/gms/internal/zzqe;)V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v0

    :cond_2d
    const/4 p1, 0x0

    return p1
.end method
