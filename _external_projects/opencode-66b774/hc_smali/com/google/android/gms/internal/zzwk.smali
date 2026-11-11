.class public final synthetic Lcom/google/android/gms/internal/zzwk;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static synthetic zzcfz:[I

.field public static final synthetic zzcga:[I


# direct methods
.method public static constructor <clinit>()V
    .registers 6

    invoke-static {}, Lcom/google/ads/AdRequest$ErrorCode;->values()[Lcom/google/ads/AdRequest$ErrorCode;

    const/4 v0, 0x4

    new-array v1, v0, [I

    sput-object v1, Lcom/google/android/gms/internal/zzwk;->zzcga:[I

    const/4 v2, 0x1

    const/4 v3, 0x3

    :try_start_a
    aput v2, v1, v3
    :try_end_c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_c} :catch_c

    :catch_c
    const/4 v1, 0x0

    const/4 v4, 0x2

    :try_start_e
    sget-object v5, Lcom/google/android/gms/internal/zzwk;->zzcga:[I

    aput v4, v5, v1
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_e .. :try_end_12} :catch_12

    :catch_12
    :try_start_12
    sget-object v5, Lcom/google/android/gms/internal/zzwk;->zzcga:[I

    aput v3, v5, v4
    :try_end_16
    .catch Ljava/lang/NoSuchFieldError; {:try_start_12 .. :try_end_16} :catch_16

    :catch_16
    :try_start_16
    sget-object v5, Lcom/google/android/gms/internal/zzwk;->zzcga:[I

    aput v0, v5, v2
    :try_end_1a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_16 .. :try_end_1a} :catch_1a

    :catch_1a
    invoke-static {}, Lcom/google/ads/AdRequest$Gender;->values()[Lcom/google/ads/AdRequest$Gender;

    new-array v0, v3, [I

    sput-object v0, Lcom/google/android/gms/internal/zzwk;->zzcfz:[I

    :try_start_21
    aput v2, v0, v4
    :try_end_23
    .catch Ljava/lang/NoSuchFieldError; {:try_start_21 .. :try_end_23} :catch_23

    :catch_23
    :try_start_23
    sget-object v0, Lcom/google/android/gms/internal/zzwk;->zzcfz:[I

    aput v4, v0, v2
    :try_end_27
    .catch Ljava/lang/NoSuchFieldError; {:try_start_23 .. :try_end_27} :catch_27

    :catch_27
    :try_start_27
    sget-object v0, Lcom/google/android/gms/internal/zzwk;->zzcfz:[I

    aput v3, v0, v1
    :try_end_2b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_27 .. :try_end_2b} :catch_2b

    :catch_2b
    return-void
.end method
