.class public final Lcom/google/android/gms/common/internal/zzz;
.super Lcom/google/android/gms/internal/zzbfm;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/common/internal/zzz;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public 〳ぜぞぜべっ:Landroid/os/Bundle;

.field public 〺つふすそ:I

.field public ぁごぐすすぃ:[Lcom/google/android/gms/common/api/Scope;

.field public いいにぽつ:[Lcom/google/android/gms/common/zzc;

.field public くし〴〺ぅ:I

.field public づざかべべ:Ljava/lang/String;

.field public なぎぱいぢぎ:Landroid/os/IBinder;

.field public びぐびあび:I

.field public ぺぁあねじ:Landroid/accounts/Account;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/〺つふすそ;

    invoke-direct {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/〺つふすそ;-><init>()V

    sput-object v0, Lcom/google/android/gms/common/internal/zzz;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I)V
    .registers 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzbfm;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/common/internal/zzz;->〺つふすそ:I

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/ぺぁあねじ;->げつ〴ぬぐ:I

    iput v0, p0, Lcom/google/android/gms/common/internal/zzz;->びぐびあび:I

    iput p1, p0, Lcom/google/android/gms/common/internal/zzz;->くし〴〺ぅ:I

    return-void
.end method

.method public constructor <init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lcom/google/android/gms/common/zzc;)V
    .registers 10

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzbfm;-><init>()V

    iput p1, p0, Lcom/google/android/gms/common/internal/zzz;->〺つふすそ:I

    iput p2, p0, Lcom/google/android/gms/common/internal/zzz;->くし〴〺ぅ:I

    iput p3, p0, Lcom/google/android/gms/common/internal/zzz;->びぐびあび:I

    const-string p2, "com.google.android.gms"

    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_14

    iput-object p2, p0, Lcom/google/android/gms/common/internal/zzz;->づざかべべ:Ljava/lang/String;

    goto :goto_16

    :cond_14
    iput-object p4, p0, Lcom/google/android/gms/common/internal/zzz;->づざかべべ:Ljava/lang/String;

    :goto_16
    const/4 p2, 0x2

    if-ge p1, p2, :cond_46

    const/4 p1, 0x0

    if-eqz p5, :cond_43

    const-string p2, "com.google.android.gms.common.internal.IAccountAccessor"

    invoke-interface {p5, p2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    instance-of p3, p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ぺぁあねじ;

    if-eqz p3, :cond_29

    check-cast p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ぺぁあねじ;

    goto :goto_2e

    :cond_29
    new-instance p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/いいにぽつ;

    invoke-direct {p2, p5}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/いいにぽつ;-><init>(Landroid/os/IBinder;)V

    .line 1
    :goto_2e
    sget p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/げつ〴ぬぐ;->〺つふすそ:I

    if-eqz p2, :cond_43

    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    move-result-wide p3

    :try_start_36
    invoke-interface {p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/びぐびあび/くし〴〺ぅ/ぺぁあねじ;->〳ぜぞぜべっ()Landroid/accounts/Account;

    move-result-object p1
    :try_end_3a
    .catch Landroid/os/RemoteException; {:try_start_36 .. :try_end_3a} :catch_40
    .catchall {:try_start_36 .. :try_end_3a} :catchall_3b

    goto :goto_40

    :catchall_3b
    move-exception p1

    invoke-static {p3, p4}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    throw p1

    :catch_40
    :goto_40
    invoke-static {p3, p4}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 2
    :cond_43
    iput-object p1, p0, Lcom/google/android/gms/common/internal/zzz;->ぺぁあねじ:Landroid/accounts/Account;

    goto :goto_4a

    :cond_46
    iput-object p5, p0, Lcom/google/android/gms/common/internal/zzz;->なぎぱいぢぎ:Landroid/os/IBinder;

    iput-object p8, p0, Lcom/google/android/gms/common/internal/zzz;->ぺぁあねじ:Landroid/accounts/Account;

    :goto_4a
    iput-object p6, p0, Lcom/google/android/gms/common/internal/zzz;->ぁごぐすすぃ:[Lcom/google/android/gms/common/api/Scope;

    iput-object p7, p0, Lcom/google/android/gms/common/internal/zzz;->〳ぜぞぜべっ:Landroid/os/Bundle;

    iput-object p9, p0, Lcom/google/android/gms/common/internal/zzz;->いいにぽつ:[Lcom/google/android/gms/common/zzc;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 7

    invoke-static {p1}, Lcom/google/android/gms/internal/zzbfp;->zze(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/common/internal/zzz;->〺つふすそ:I

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Lcom/google/android/gms/internal/zzbfp;->zzc(Landroid/os/Parcel;II)V

    iget v1, p0, Lcom/google/android/gms/common/internal/zzz;->くし〴〺ぅ:I

    const/4 v2, 0x2

    invoke-static {p1, v2, v1}, Lcom/google/android/gms/internal/zzbfp;->zzc(Landroid/os/Parcel;II)V

    iget v1, p0, Lcom/google/android/gms/common/internal/zzz;->びぐびあび:I

    const/4 v2, 0x3

    invoke-static {p1, v2, v1}, Lcom/google/android/gms/internal/zzbfp;->zzc(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lcom/google/android/gms/common/internal/zzz;->づざかべべ:Ljava/lang/String;

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Lcom/google/android/gms/internal/zzbfp;->zza(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/common/internal/zzz;->なぎぱいぢぎ:Landroid/os/IBinder;

    const/4 v2, 0x5

    invoke-static {p1, v2, v1, v3}, Lcom/google/android/gms/internal/zzbfp;->zza(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    iget-object v1, p0, Lcom/google/android/gms/common/internal/zzz;->ぁごぐすすぃ:[Lcom/google/android/gms/common/api/Scope;

    const/4 v2, 0x6

    invoke-static {p1, v2, v1, p2, v3}, Lcom/google/android/gms/internal/zzbfp;->zza(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/common/internal/zzz;->〳ぜぞぜべっ:Landroid/os/Bundle;

    const/4 v2, 0x7

    invoke-static {p1, v2, v1, v3}, Lcom/google/android/gms/internal/zzbfp;->zza(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    iget-object v1, p0, Lcom/google/android/gms/common/internal/zzz;->ぺぁあねじ:Landroid/accounts/Account;

    const/16 v2, 0x8

    invoke-static {p1, v2, v1, p2, v3}, Lcom/google/android/gms/internal/zzbfp;->zza(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/common/internal/zzz;->いいにぽつ:[Lcom/google/android/gms/common/zzc;

    const/16 v2, 0xa

    invoke-static {p1, v2, v1, p2, v3}, Lcom/google/android/gms/internal/zzbfp;->zza(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/zzbfp;->zzai(Landroid/os/Parcel;I)V

    return-void
.end method
