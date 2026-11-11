.class public final Lcom/google/android/gms/internal/zzajl;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x11
.end annotation

.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# static fields
.field private static zzddd:Lcom/google/android/gms/internal/zzajl;


# instance fields
.field public zzczb:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zzqt()Lcom/google/android/gms/internal/zzajl;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzajl;->zzddd:Lcom/google/android/gms/internal/zzajl;

    if-nez v0, :cond_b

    new-instance v0, Lcom/google/android/gms/internal/zzajl;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzajl;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzajl;->zzddd:Lcom/google/android/gms/internal/zzajl;

    :cond_b
    sget-object v0, Lcom/google/android/gms/internal/zzajl;->zzddd:Lcom/google/android/gms/internal/zzajl;

    return-object v0
.end method
