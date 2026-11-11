.class public final synthetic Lcom/google/android/gms/internal/zztf;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final zzbzp:Ljava/lang/Runnable;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/google/android/gms/internal/zztf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zztf;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zztf;->zzbzp:Ljava/lang/Runnable;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzeu()Lcom/google/android/gms/internal/zztg;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zztg;->zzkv()V

    return-void
.end method
