.class public abstract Lcom/google/android/gms/internal/zzko;
.super Lcom/google/android/gms/internal/zzev;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzkn;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzev;-><init>()V

    const-string v0, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder"

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
    const/4 p4, 0x0

    packed-switch p1, :pswitch_data_c2

    const/4 p1, 0x0

    return p1

    :pswitch_e
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/zzrd;->zzs(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzrc;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzkn;->zza(Lcom/google/android/gms/internal/zzrc;)V

    goto/16 :goto_95

    :pswitch_1b
    sget-object p1, Lcom/google/android/gms/ads/formats/PublisherAdViewOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/ads/formats/PublisherAdViewOptions;

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzkn;->zza(Lcom/google/android/gms/ads/formats/PublisherAdViewOptions;)V

    goto/16 :goto_95

    :pswitch_28
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/zzrg;->zzt(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzrf;

    move-result-object p1

    sget-object p4, Lcom/google/android/gms/internal/zzjn;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/zzjn;

    invoke-interface {p0, p1, p2}, Lcom/google/android/gms/internal/zzkn;->zza(Lcom/google/android/gms/internal/zzrf;Lcom/google/android/gms/internal/zzjn;)V

    goto :goto_95

    :pswitch_3c
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_43

    goto :goto_56

    :cond_43
    const-string p2, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"

    invoke-interface {p1, p2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    instance-of p4, p2, Lcom/google/android/gms/internal/zzld;

    if-eqz p4, :cond_51

    move-object p4, p2

    check-cast p4, Lcom/google/android/gms/internal/zzld;

    goto :goto_56

    :cond_51
    new-instance p4, Lcom/google/android/gms/internal/zzlf;

    invoke-direct {p4, p1}, Lcom/google/android/gms/internal/zzlf;-><init>(Landroid/os/IBinder;)V

    :goto_56
    invoke-interface {p0, p4}, Lcom/google/android/gms/internal/zzkn;->zzb(Lcom/google/android/gms/internal/zzld;)V

    goto :goto_95

    :pswitch_5a
    sget-object p1, Lcom/google/android/gms/internal/zzpe;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzpe;

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzkn;->zza(Lcom/google/android/gms/internal/zzpe;)V

    goto :goto_95

    :pswitch_66
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p4

    invoke-static {p4}, Lcom/google/android/gms/internal/zzra;->zzr(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzqz;

    move-result-object p4

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-static {p2}, Lcom/google/android/gms/internal/zzqx;->zzq(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzqw;

    move-result-object p2

    invoke-interface {p0, p1, p4, p2}, Lcom/google/android/gms/internal/zzkn;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzqz;Lcom/google/android/gms/internal/zzqw;)V

    goto :goto_95

    :pswitch_7e
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/zzqu;->zzp(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzqt;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzkn;->zza(Lcom/google/android/gms/internal/zzqt;)V

    goto :goto_95

    :pswitch_8a
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/zzqr;->zzo(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzqq;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzkn;->zza(Lcom/google/android/gms/internal/zzqq;)V

    :goto_95
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_c1

    :pswitch_99
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_a0

    goto :goto_b3

    :cond_a0
    const-string p2, "com.google.android.gms.ads.internal.client.IAdListener"

    invoke-interface {p1, p2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    instance-of p4, p2, Lcom/google/android/gms/internal/zzkh;

    if-eqz p4, :cond_ae

    move-object p4, p2

    check-cast p4, Lcom/google/android/gms/internal/zzkh;

    goto :goto_b3

    :cond_ae
    new-instance p4, Lcom/google/android/gms/internal/zzkj;

    invoke-direct {p4, p1}, Lcom/google/android/gms/internal/zzkj;-><init>(Landroid/os/IBinder;)V

    :goto_b3
    invoke-interface {p0, p4}, Lcom/google/android/gms/internal/zzkn;->zzb(Lcom/google/android/gms/internal/zzkh;)V

    goto :goto_95

    :pswitch_b7
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzkn;->zzdi()Lcom/google/android/gms/internal/zzkk;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Landroid/os/IInterface;)V

    :goto_c1
    return v0

    :pswitch_data_c2
    .packed-switch 0x1
        :pswitch_b7
        :pswitch_99
        :pswitch_8a
        :pswitch_7e
        :pswitch_66
        :pswitch_5a
        :pswitch_3c
        :pswitch_28
        :pswitch_1b
        :pswitch_e
    .end packed-switch
.end method
