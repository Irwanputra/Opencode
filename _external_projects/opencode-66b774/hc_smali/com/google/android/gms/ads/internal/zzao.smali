.class public final Lcom/google/android/gms/ads/internal/zzao;
.super Lcom/google/android/gms/internal/zzbfm;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/ads/internal/zzao;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final zzaqo:Z

.field public final zzaqp:Z

.field public final zzaqr:Z

.field public final zzaqs:F

.field public final zzaqt:I

.field public final zzaqu:Z

.field public final zzaqv:Z

.field public 〺つふすそ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/google/android/gms/ads/internal/zzap;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/zzap;-><init>()V

    sput-object v0, Lcom/google/android/gms/ads/internal/zzao;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZZLjava/lang/String;ZFIZZ)V
    .registers 9

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzbfm;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/ads/internal/zzao;->zzaqo:Z

    iput-boolean p2, p0, Lcom/google/android/gms/ads/internal/zzao;->zzaqp:Z

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/zzao;->〺つふすそ:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/android/gms/ads/internal/zzao;->zzaqr:Z

    iput p5, p0, Lcom/google/android/gms/ads/internal/zzao;->zzaqs:F

    iput p6, p0, Lcom/google/android/gms/ads/internal/zzao;->zzaqt:I

    iput-boolean p7, p0, Lcom/google/android/gms/ads/internal/zzao;->zzaqu:Z

    iput-boolean p8, p0, Lcom/google/android/gms/ads/internal/zzao;->zzaqv:Z

    return-void
.end method

.method public constructor <init>(ZZZFIZZ)V
    .registers 8

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/zzbfm;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/ads/internal/zzao;->zzaqo:Z

    iput-boolean p2, p0, Lcom/google/android/gms/ads/internal/zzao;->zzaqp:Z

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzao;->〺つふすそ:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/google/android/gms/ads/internal/zzao;->zzaqr:Z

    iput p4, p0, Lcom/google/android/gms/ads/internal/zzao;->zzaqs:F

    iput p5, p0, Lcom/google/android/gms/ads/internal/zzao;->zzaqt:I

    iput-boolean p6, p0, Lcom/google/android/gms/ads/internal/zzao;->zzaqu:Z

    iput-boolean p7, p0, Lcom/google/android/gms/ads/internal/zzao;->zzaqv:Z

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 6

    invoke-static {p1}, Lcom/google/android/gms/internal/zzbfp;->zze(Landroid/os/Parcel;)I

    move-result p2

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzao;->zzaqo:Z

    const/4 v1, 0x2

    invoke-static {p1, v1, v0}, Lcom/google/android/gms/internal/zzbfp;->zza(Landroid/os/Parcel;IZ)V

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzao;->zzaqp:Z

    const/4 v1, 0x3

    invoke-static {p1, v1, v0}, Lcom/google/android/gms/internal/zzbfp;->zza(Landroid/os/Parcel;IZ)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzao;->〺つふすそ:Ljava/lang/String;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lcom/google/android/gms/internal/zzbfp;->zza(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzao;->zzaqr:Z

    const/4 v1, 0x5

    invoke-static {p1, v1, v0}, Lcom/google/android/gms/internal/zzbfp;->zza(Landroid/os/Parcel;IZ)V

    iget v0, p0, Lcom/google/android/gms/ads/internal/zzao;->zzaqs:F

    const/4 v1, 0x6

    invoke-static {p1, v1, v0}, Lcom/google/android/gms/internal/zzbfp;->zza(Landroid/os/Parcel;IF)V

    iget v0, p0, Lcom/google/android/gms/ads/internal/zzao;->zzaqt:I

    const/4 v1, 0x7

    invoke-static {p1, v1, v0}, Lcom/google/android/gms/internal/zzbfp;->zzc(Landroid/os/Parcel;II)V

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzao;->zzaqu:Z

    const/16 v1, 0x8

    invoke-static {p1, v1, v0}, Lcom/google/android/gms/internal/zzbfp;->zza(Landroid/os/Parcel;IZ)V

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzao;->zzaqv:Z

    const/16 v1, 0x9

    invoke-static {p1, v1, v0}, Lcom/google/android/gms/internal/zzbfp;->zza(Landroid/os/Parcel;IZ)V

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/zzbfp;->zzai(Landroid/os/Parcel;I)V

    return-void
.end method
