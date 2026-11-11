.class public abstract Lcom/google/android/gms/internal/zzdue;
.super Lcom/google/android/gms/internal/zzdub;
.source ""


# direct methods
.method private constructor <init>([B)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdub;-><init>([B)V

    return-void
.end method

.method public synthetic constructor <init>([BLcom/google/android/gms/internal/zzduc;)V
    .registers 3

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdue;-><init>([B)V

    return-void
.end method

.method private static zza([IIIII)V
    .registers 7

    aget v0, p0, p1

    aget v1, p0, p2

    add-int/2addr v0, v1

    aput v0, p0, p1

    aget v0, p0, p4

    aget v1, p0, p1

    xor-int/2addr v0, v1

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzdub;->rotateLeft(II)I

    move-result v0

    aput v0, p0, p4

    aget v0, p0, p3

    aget v1, p0, p4

    add-int/2addr v0, v1

    aput v0, p0, p3

    aget v0, p0, p2

    aget v1, p0, p3

    xor-int/2addr v0, v1

    const/16 v1, 0xc

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzdub;->rotateLeft(II)I

    move-result v0

    aput v0, p0, p2

    aget v0, p0, p1

    aget v1, p0, p2

    add-int/2addr v0, v1

    aput v0, p0, p1

    aget v0, p0, p4

    aget p1, p0, p1

    xor-int/2addr p1, v0

    const/16 v0, 0x8

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/zzdub;->rotateLeft(II)I

    move-result p1

    aput p1, p0, p4

    aget p1, p0, p3

    aget p4, p0, p4

    add-int/2addr p1, p4

    aput p1, p0, p3

    aget p1, p0, p2

    aget p3, p0, p3

    xor-int/2addr p1, p3

    const/4 p3, 0x7

    invoke-static {p1, p3}, Lcom/google/android/gms/internal/zzdub;->rotateLeft(II)I

    move-result p1

    aput p1, p0, p2

    return-void
.end method

.method private static zza([I[B)V
    .registers 5

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/zzdub;->zza(Ljava/nio/ByteBuffer;)[I

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-static {p1, v1, p0, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public static synthetic zzb([I[B)V
    .registers 2

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/zzdue;->zza([I[B)V

    return-void
.end method

.method private static zzh([I)V
    .registers 4

    sget-object v0, Lcom/google/android/gms/internal/zzdub;->zzlyk:[I

    array-length v1, v0

    const/4 v2, 0x0

    invoke-static {v0, v2, p0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public static synthetic zzi([I)V
    .registers 1

    invoke-static {p0}, Lcom/google/android/gms/internal/zzdue;->zzh([I)V

    return-void
.end method


# virtual methods
.method public final zzf([I)V
    .registers 18

    move-object/from16 v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_4
    const/16 v3, 0xa

    if-ge v2, v3, :cond_3b

    const/4 v4, 0x4

    const/16 v5, 0x8

    const/16 v6, 0xc

    invoke-static {v0, v1, v4, v5, v6}, Lcom/google/android/gms/internal/zzdue;->zza([IIIII)V

    const/4 v7, 0x1

    const/4 v8, 0x5

    const/16 v9, 0x9

    const/16 v10, 0xd

    invoke-static {v0, v7, v8, v9, v10}, Lcom/google/android/gms/internal/zzdue;->zza([IIIII)V

    const/4 v11, 0x2

    const/4 v12, 0x6

    const/16 v13, 0xe

    invoke-static {v0, v11, v12, v3, v13}, Lcom/google/android/gms/internal/zzdue;->zza([IIIII)V

    const/4 v14, 0x3

    const/4 v15, 0x7

    const/16 v4, 0xb

    const/16 v9, 0xf

    invoke-static {v0, v14, v15, v4, v9}, Lcom/google/android/gms/internal/zzdue;->zza([IIIII)V

    invoke-static {v0, v1, v8, v3, v9}, Lcom/google/android/gms/internal/zzdue;->zza([IIIII)V

    invoke-static {v0, v7, v12, v4, v6}, Lcom/google/android/gms/internal/zzdue;->zza([IIIII)V

    invoke-static {v0, v11, v15, v5, v10}, Lcom/google/android/gms/internal/zzdue;->zza([IIIII)V

    const/16 v3, 0x9

    const/4 v4, 0x4

    invoke-static {v0, v14, v4, v3, v13}, Lcom/google/android/gms/internal/zzdue;->zza([IIIII)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_3b
    return-void
.end method
