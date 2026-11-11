.class public abstract Lcom/google/android/gms/internal/zzadq;
.super Lcom/google/android/gms/internal/zzev;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzadp;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzev;-><init>()V

    const-string v0, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener"

    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method

.method public static zzaa(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzadp;
    .registers 3

    if-nez p0, :cond_4

    const/4 p0, 0x0

    return-object p0

    :cond_4
    const-string v0, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/zzadp;

    if-eqz v1, :cond_11

    check-cast v0, Lcom/google/android/gms/internal/zzadp;

    return-object v0

    :cond_11
    new-instance v0, Lcom/google/android/gms/internal/zzadr;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzadr;-><init>(Landroid/os/IBinder;)V

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
    packed-switch p1, :pswitch_data_4c

    const/4 p1, 0x0

    return p1

    :pswitch_d
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzadp;->onRewardedVideoAdFailedToLoad(I)V

    goto :goto_48

    :pswitch_15
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzadp;->onRewardedVideoAdLeftApplication()V

    goto :goto_48

    :pswitch_19
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_21

    const/4 p1, 0x0

    goto :goto_35

    :cond_21
    const-string p2, "com.google.android.gms.ads.internal.reward.client.IRewardItem"

    invoke-interface {p1, p2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    instance-of p4, p2, Lcom/google/android/gms/internal/zzadh;

    if-eqz p4, :cond_2f

    move-object p1, p2

    check-cast p1, Lcom/google/android/gms/internal/zzadh;

    goto :goto_35

    :cond_2f
    new-instance p2, Lcom/google/android/gms/internal/zzadj;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/zzadj;-><init>(Landroid/os/IBinder;)V

    move-object p1, p2

    :goto_35
    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzadp;->zza(Lcom/google/android/gms/internal/zzadh;)V

    goto :goto_48

    :pswitch_39
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzadp;->onRewardedVideoAdClosed()V

    goto :goto_48

    :pswitch_3d
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzadp;->onRewardedVideoStarted()V

    goto :goto_48

    :pswitch_41
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzadp;->onRewardedVideoAdOpened()V

    goto :goto_48

    :pswitch_45
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzadp;->onRewardedVideoAdLoaded()V

    :goto_48
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v0

    :pswitch_data_4c
    .packed-switch 0x1
        :pswitch_45
        :pswitch_41
        :pswitch_3d
        :pswitch_39
        :pswitch_19
        :pswitch_15
        :pswitch_d
    .end packed-switch
.end method
