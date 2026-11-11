.class public final synthetic Lcom/google/android/gms/internal/zzdqw;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final synthetic zzltf:[I

.field public static final synthetic zzltg:[I

.field public static final synthetic zzlth:[I


# direct methods
.method public static constructor <clinit>()V
    .registers 7

    invoke-static {}, Lcom/google/android/gms/internal/zzdsa;->values()[Lcom/google/android/gms/internal/zzdsa;

    const/4 v0, 0x4

    new-array v1, v0, [I

    sput-object v1, Lcom/google/android/gms/internal/zzdqw;->zzlth:[I

    const/4 v2, 0x1

    :try_start_9
    sget-object v3, Lcom/google/android/gms/internal/zzdsa;->zzlul:Lcom/google/android/gms/internal/zzdsa;

    aput v2, v1, v2
    :try_end_d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_d} :catch_d

    :catch_d
    const/4 v1, 0x2

    :try_start_e
    sget-object v3, Lcom/google/android/gms/internal/zzdqw;->zzlth:[I

    sget-object v4, Lcom/google/android/gms/internal/zzdsa;->zzlum:Lcom/google/android/gms/internal/zzdsa;

    aput v1, v3, v1
    :try_end_14
    .catch Ljava/lang/NoSuchFieldError; {:try_start_e .. :try_end_14} :catch_14

    :catch_14
    invoke-static {}, Lcom/google/android/gms/internal/zzdso;->values()[Lcom/google/android/gms/internal/zzdso;

    const/4 v3, 0x6

    new-array v4, v3, [I

    sput-object v4, Lcom/google/android/gms/internal/zzdqw;->zzltg:[I

    :try_start_1c
    sget-object v5, Lcom/google/android/gms/internal/zzdso;->zzlvi:Lcom/google/android/gms/internal/zzdso;

    aput v2, v4, v1
    :try_end_20
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1c .. :try_end_20} :catch_20

    :catch_20
    const/4 v4, 0x3

    :try_start_21
    sget-object v5, Lcom/google/android/gms/internal/zzdqw;->zzltg:[I

    sget-object v6, Lcom/google/android/gms/internal/zzdso;->zzlvj:Lcom/google/android/gms/internal/zzdso;

    aput v1, v5, v4
    :try_end_27
    .catch Ljava/lang/NoSuchFieldError; {:try_start_21 .. :try_end_27} :catch_27

    :catch_27
    :try_start_27
    sget-object v5, Lcom/google/android/gms/internal/zzdqw;->zzltg:[I

    sget-object v6, Lcom/google/android/gms/internal/zzdso;->zzlvk:Lcom/google/android/gms/internal/zzdso;

    aput v4, v5, v0
    :try_end_2d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_27 .. :try_end_2d} :catch_2d

    :catch_2d
    invoke-static {}, Lcom/google/android/gms/internal/zzdsq;->values()[Lcom/google/android/gms/internal/zzdsq;

    new-array v3, v3, [I

    sput-object v3, Lcom/google/android/gms/internal/zzdqw;->zzltf:[I

    :try_start_34
    sget-object v5, Lcom/google/android/gms/internal/zzdsq;->zzlvo:Lcom/google/android/gms/internal/zzdsq;

    aput v2, v3, v2
    :try_end_38
    .catch Ljava/lang/NoSuchFieldError; {:try_start_34 .. :try_end_38} :catch_38

    :catch_38
    :try_start_38
    sget-object v2, Lcom/google/android/gms/internal/zzdqw;->zzltf:[I

    sget-object v3, Lcom/google/android/gms/internal/zzdsq;->zzlvq:Lcom/google/android/gms/internal/zzdsq;

    aput v1, v2, v4
    :try_end_3e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_38 .. :try_end_3e} :catch_3e

    :catch_3e
    :try_start_3e
    sget-object v1, Lcom/google/android/gms/internal/zzdqw;->zzltf:[I

    sget-object v2, Lcom/google/android/gms/internal/zzdsq;->zzlvr:Lcom/google/android/gms/internal/zzdsq;

    aput v4, v1, v0
    :try_end_44
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3e .. :try_end_44} :catch_44

    :catch_44
    return-void
.end method
