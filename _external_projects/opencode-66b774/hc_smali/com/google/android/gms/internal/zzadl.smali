.class public abstract Lcom/google/android/gms/internal/zzadl;
.super Lcom/google/android/gms/internal/zzev;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzadk;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzev;-><init>()V

    const-string v0, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd"

    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method

.method public static zzz(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzadk;
    .registers 3

    if-nez p0, :cond_4

    const/4 p0, 0x0

    return-object p0

    :cond_4
    const-string v0, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/zzadk;

    if-eqz v1, :cond_11

    check-cast v0, Lcom/google/android/gms/internal/zzadk;

    return-object v0

    :cond_11
    new-instance v0, Lcom/google/android/gms/internal/zzadm;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzadm;-><init>(Landroid/os/IBinder;)V

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
    if-eq p1, v0, :cond_96

    const/4 p4, 0x2

    if-eq p1, p4, :cond_92

    const/4 p4, 0x3

    if-eq p1, p4, :cond_72

    const/16 p4, 0x22

    if-eq p1, p4, :cond_6a

    packed-switch p1, :pswitch_data_a6

    const/4 p1, 0x0

    return p1

    :pswitch_19
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzadk;->setUserId(Ljava/lang/String;)V

    goto/16 :goto_a1

    :pswitch_22
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzadk;->getMediationAdapterClassName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto/16 :goto_a4

    :pswitch_2e
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ(Landroid/os/IBinder;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzadk;->zzd(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)V

    goto/16 :goto_a1

    :pswitch_3b
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ(Landroid/os/IBinder;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzadk;->zzc(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)V

    goto :goto_a1

    :pswitch_47
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ(Landroid/os/IBinder;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzadk;->zzb(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)V

    goto :goto_a1

    :pswitch_53
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzadk;->destroy()V

    goto :goto_a1

    :pswitch_57
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzadk;->resume()V

    goto :goto_a1

    :pswitch_5b
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzadk;->pause()V

    goto :goto_a1

    :pswitch_5f
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzadk;->isLoaded()Z

    move-result p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Z)V

    goto :goto_a4

    :cond_6a
    invoke-static {p2}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;)Z

    move-result p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzadk;->setImmersiveMode(Z)V

    goto :goto_a1

    :cond_72
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_7a

    const/4 p1, 0x0

    goto :goto_8e

    :cond_7a
    const-string p2, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener"

    invoke-interface {p1, p2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    instance-of p4, p2, Lcom/google/android/gms/internal/zzadp;

    if-eqz p4, :cond_88

    move-object p1, p2

    check-cast p1, Lcom/google/android/gms/internal/zzadp;

    goto :goto_8e

    :cond_88
    new-instance p2, Lcom/google/android/gms/internal/zzadr;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/zzadr;-><init>(Landroid/os/IBinder;)V

    move-object p1, p2

    :goto_8e
    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzadk;->zza(Lcom/google/android/gms/internal/zzadp;)V

    goto :goto_a1

    :cond_92
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzadk;->show()V

    goto :goto_a1

    :cond_96
    sget-object p1, Lcom/google/android/gms/internal/zzadv;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzadv;

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzadk;->zza(Lcom/google/android/gms/internal/zzadv;)V

    :goto_a1
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    :goto_a4
    return v0

    nop

    :pswitch_data_a6
    .packed-switch 0x5
        :pswitch_5f
        :pswitch_5b
        :pswitch_57
        :pswitch_53
        :pswitch_47
        :pswitch_3b
        :pswitch_2e
        :pswitch_22
        :pswitch_19
    .end packed-switch
.end method
