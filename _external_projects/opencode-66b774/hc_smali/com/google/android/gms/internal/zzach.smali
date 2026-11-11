.class public final Lcom/google/android/gms/internal/zzach;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final mLock:Ljava/lang/Object;

.field private zzcrt:Ljava/lang/String;

.field private zzcru:Ljava/lang/String;

.field private zzcrv:Lcom/google/android/gms/internal/zzalf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzalf<",
            "Lcom/google/android/gms/internal/zzacn;",
            ">;"
        }
    .end annotation
.end field

.field private zzcrw:Lcom/google/android/gms/ads/internal/gmsg/zzt;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/ads/internal/gmsg/zzt<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private zzcrx:Lcom/google/android/gms/ads/internal/gmsg/zzt;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/ads/internal/gmsg/zzt<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private zzcry:Lcom/google/android/gms/ads/internal/gmsg/zzt;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/ads/internal/gmsg/zzt<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzach;->mLock:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/zzalf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzalf;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzach;->zzcrv:Lcom/google/android/gms/internal/zzalf;

    new-instance v0, Lcom/google/android/gms/internal/zzaci;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzaci;-><init>(Lcom/google/android/gms/internal/zzach;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzach;->zzcrw:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    new-instance v0, Lcom/google/android/gms/internal/zzacj;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzacj;-><init>(Lcom/google/android/gms/internal/zzach;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzach;->zzcrx:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    new-instance v0, Lcom/google/android/gms/internal/zzack;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzack;-><init>(Lcom/google/android/gms/internal/zzach;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzach;->zzcry:Lcom/google/android/gms/ads/internal/gmsg/zzt;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzach;->mContext:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzach;->zzcru:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzach;->zzcrt:Ljava/lang/String;

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzach;)Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzach;->mLock:Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic zzb(Lcom/google/android/gms/internal/zzach;)Lcom/google/android/gms/internal/zzalf;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzach;->zzcrv:Lcom/google/android/gms/internal/zzalf;

    return-object p0
.end method

.method public static synthetic zzc(Lcom/google/android/gms/internal/zzach;)Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzach;->zzcrt:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic zzd(Lcom/google/android/gms/internal/zzach;)Landroid/content/Context;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzach;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic zze(Lcom/google/android/gms/internal/zzach;)Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/google/android/gms/internal/zzach;->zzcru:Ljava/lang/String;

    return-object p0
.end method
