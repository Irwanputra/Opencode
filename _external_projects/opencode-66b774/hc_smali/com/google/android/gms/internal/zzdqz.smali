.class public final synthetic Lcom/google/android/gms/internal/zzdqz;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final synthetic zzltf:[I


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    invoke-static {}, Lcom/google/android/gms/internal/zzdsq;->values()[Lcom/google/android/gms/internal/zzdsq;

    const/4 v0, 0x6

    new-array v0, v0, [I

    sput-object v0, Lcom/google/android/gms/internal/zzdqz;->zzltf:[I

    :try_start_8
    sget-object v1, Lcom/google/android/gms/internal/zzdsq;->zzlvo:Lcom/google/android/gms/internal/zzdsq;

    const/4 v1, 0x1

    aput v1, v0, v1
    :try_end_d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_d} :catch_d

    :catch_d
    const/4 v0, 0x3

    :try_start_e
    sget-object v1, Lcom/google/android/gms/internal/zzdqz;->zzltf:[I

    sget-object v2, Lcom/google/android/gms/internal/zzdsq;->zzlvq:Lcom/google/android/gms/internal/zzdsq;

    const/4 v2, 0x2

    aput v2, v1, v0
    :try_end_15
    .catch Ljava/lang/NoSuchFieldError; {:try_start_e .. :try_end_15} :catch_15

    :catch_15
    :try_start_15
    sget-object v1, Lcom/google/android/gms/internal/zzdqz;->zzltf:[I

    sget-object v2, Lcom/google/android/gms/internal/zzdsq;->zzlvr:Lcom/google/android/gms/internal/zzdsq;

    const/4 v2, 0x4

    aput v0, v1, v2
    :try_end_1c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_15 .. :try_end_1c} :catch_1c

    :catch_1c
    return-void
.end method
