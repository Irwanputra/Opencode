.class public abstract Lcom/google/android/gms/internal/zzlm;
.super Lcom/google/android/gms/internal/zzev;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzll;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzev;-><init>()V

    const-string v0, "com.google.android.gms.ads.internal.client.IVideoController"

    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method

.method public static zzh(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzll;
    .registers 3

    if-nez p0, :cond_4

    const/4 p0, 0x0

    return-object p0

    :cond_4
    const-string v0, "com.google.android.gms.ads.internal.client.IVideoController"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/zzll;

    if-eqz v1, :cond_11

    check-cast v0, Lcom/google/android/gms/internal/zzll;

    return-object v0

    :cond_11
    new-instance v0, Lcom/google/android/gms/internal/zzln;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzln;-><init>(Landroid/os/IBinder;)V

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
    packed-switch p1, :pswitch_data_80

    const/4 p1, 0x0

    return p1

    :pswitch_d
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzll;->isClickToExpandEnabled()Z

    move-result p1

    goto :goto_66

    :pswitch_12
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzll;->zzij()Lcom/google/android/gms/internal/zzlo;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Landroid/os/IInterface;)V

    goto :goto_7f

    :pswitch_1d
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzll;->isCustomControlsEnabled()Z

    move-result p1

    goto :goto_66

    :pswitch_22
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzll;->getAspectRatio()F

    move-result p1

    goto :goto_50

    :pswitch_27
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_2f

    const/4 p1, 0x0

    goto :goto_43

    :cond_2f
    const-string p2, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"

    invoke-interface {p1, p2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    instance-of p4, p2, Lcom/google/android/gms/internal/zzlo;

    if-eqz p4, :cond_3d

    move-object p1, p2

    check-cast p1, Lcom/google/android/gms/internal/zzlo;

    goto :goto_43

    :cond_3d
    new-instance p2, Lcom/google/android/gms/internal/zzlq;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/zzlq;-><init>(Landroid/os/IBinder;)V

    move-object p1, p2

    :goto_43
    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzll;->zza(Lcom/google/android/gms/internal/zzlo;)V

    goto :goto_7c

    :pswitch_47
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzll;->zzii()F

    move-result p1

    goto :goto_50

    :pswitch_4c
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzll;->zzih()F

    move-result p1

    :goto_50
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeFloat(F)V

    goto :goto_7f

    :pswitch_57
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzll;->getPlaybackState()I

    move-result p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_7f

    :pswitch_62
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzll;->isMuted()Z

    move-result p1

    :goto_66
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Z)V

    goto :goto_7f

    :pswitch_6d
    invoke-static {p2}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;)Z

    move-result p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzll;->mute(Z)V

    goto :goto_7c

    :pswitch_75
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzll;->pause()V

    goto :goto_7c

    :pswitch_79
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzll;->play()V

    :goto_7c
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    :goto_7f
    return v0

    :pswitch_data_80
    .packed-switch 0x1
        :pswitch_79
        :pswitch_75
        :pswitch_6d
        :pswitch_62
        :pswitch_57
        :pswitch_4c
        :pswitch_47
        :pswitch_27
        :pswitch_22
        :pswitch_1d
        :pswitch_12
        :pswitch_d
    .end packed-switch
.end method
