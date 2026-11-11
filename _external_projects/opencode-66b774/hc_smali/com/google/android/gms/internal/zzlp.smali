.class public abstract Lcom/google/android/gms/internal/zzlp;
.super Lcom/google/android/gms/internal/zzev;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzlo;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzev;-><init>()V

    const-string v0, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"

    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
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
    if-eq p1, v0, :cond_2c

    const/4 p4, 0x2

    if-eq p1, p4, :cond_28

    const/4 p4, 0x3

    if-eq p1, p4, :cond_24

    const/4 p4, 0x4

    if-eq p1, p4, :cond_20

    const/4 p4, 0x5

    if-eq p1, p4, :cond_18

    const/4 p1, 0x0

    return p1

    :cond_18
    invoke-static {p2}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;)Z

    move-result p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzlo;->onVideoMute(Z)V

    goto :goto_2f

    :cond_20
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzlo;->onVideoEnd()V

    goto :goto_2f

    :cond_24
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzlo;->onVideoPause()V

    goto :goto_2f

    :cond_28
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzlo;->onVideoPlay()V

    goto :goto_2f

    :cond_2c
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzlo;->onVideoStart()V

    :goto_2f
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v0
.end method
