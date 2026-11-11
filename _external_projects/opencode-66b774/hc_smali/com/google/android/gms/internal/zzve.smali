.class public abstract Lcom/google/android/gms/internal/zzve;
.super Lcom/google/android/gms/internal/zzev;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzvd;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzev;-><init>()V

    const-string v0, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener"

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
    packed-switch p1, :pswitch_data_70

    const/4 p1, 0x0

    return p1

    :pswitch_d
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvd;->onVideoEnd()V

    goto :goto_6c

    :pswitch_11
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/zzqn;->zzn(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzqm;

    move-result-object p1

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lcom/google/android/gms/internal/zzvd;->zzb(Lcom/google/android/gms/internal/zzqm;Ljava/lang/String;)V

    goto :goto_6c

    :pswitch_21
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lcom/google/android/gms/internal/zzvd;->onAppEvent(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_6c

    :pswitch_2d
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvd;->onAdImpression()V

    goto :goto_6c

    :pswitch_31
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_39

    const/4 p1, 0x0

    goto :goto_4d

    :cond_39
    const-string p2, "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata"

    invoke-interface {p1, p2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    instance-of p4, p2, Lcom/google/android/gms/internal/zzvg;

    if-eqz p4, :cond_47

    move-object p1, p2

    check-cast p1, Lcom/google/android/gms/internal/zzvg;

    goto :goto_4d

    :cond_47
    new-instance p2, Lcom/google/android/gms/internal/zzvi;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/zzvi;-><init>(Landroid/os/IBinder;)V

    move-object p1, p2

    :goto_4d
    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzvd;->zza(Lcom/google/android/gms/internal/zzvg;)V

    goto :goto_6c

    :pswitch_51
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvd;->onAdLoaded()V

    goto :goto_6c

    :pswitch_55
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvd;->onAdOpened()V

    goto :goto_6c

    :pswitch_59
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvd;->onAdLeftApplication()V

    goto :goto_6c

    :pswitch_5d
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzvd;->onAdFailedToLoad(I)V

    goto :goto_6c

    :pswitch_65
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvd;->onAdClosed()V

    goto :goto_6c

    :pswitch_69
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvd;->onAdClicked()V

    :goto_6c
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return v0

    :pswitch_data_70
    .packed-switch 0x1
        :pswitch_69
        :pswitch_65
        :pswitch_5d
        :pswitch_59
        :pswitch_55
        :pswitch_51
        :pswitch_31
        :pswitch_2d
        :pswitch_21
        :pswitch_11
        :pswitch_d
    .end packed-switch
.end method
