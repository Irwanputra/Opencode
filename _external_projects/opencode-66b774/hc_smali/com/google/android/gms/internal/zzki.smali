.class public abstract Lcom/google/android/gms/internal/zzki;
.super Lcom/google/android/gms/internal/zzev;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzkh;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzev;-><init>()V

    const-string v0, "com.google.android.gms.ads.internal.client.IAdListener"

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
    packed-switch p1, :pswitch_data_30

    const/4 p1, 0x0

    return p1

    :pswitch_d
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzkh;->onAdImpression()V

    goto :goto_2c

    :pswitch_11
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzkh;->onAdClicked()V

    goto :goto_2c

    :pswitch_15
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzkh;->onAdOpened()V

    goto :goto_2c

    :pswitch_19
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzkh;->onAdLoaded()V

    goto :goto_2c

    :pswitch_1d
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzkh;->onAdLeftApplication()V

    goto :goto_2c

    :pswitch_21
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzkh;->onAdFailedToLoad(I)V

    goto :goto_2c

    :pswitch_29
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzkh;->onAdClosed()V

    :goto_2c
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v0

    :pswitch_data_30
    .packed-switch 0x1
        :pswitch_29
        :pswitch_21
        :pswitch_1d
        :pswitch_19
        :pswitch_15
        :pswitch_11
        :pswitch_d
    .end packed-switch
.end method
