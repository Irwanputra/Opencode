.class public final Lcom/google/android/gms/internal/zzdru;
.super Lcom/google/android/gms/internal/zzffu;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzfhg;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzdru$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzffu<",
        "Lcom/google/android/gms/internal/zzdru;",
        "Lcom/google/android/gms/internal/zzdru$zza;",
        ">;",
        "Lcom/google/android/gms/internal/zzfhg;"
    }
.end annotation


# static fields
.field private static volatile zzbbk:Lcom/google/android/gms/internal/zzfhk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzfhk<",
            "Lcom/google/android/gms/internal/zzdru;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzluh:Lcom/google/android/gms/internal/zzdru;


# instance fields
.field private zzltx:I

.field private zzluf:Lcom/google/android/gms/internal/zzdrw;


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    new-instance v0, Lcom/google/android/gms/internal/zzdru;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzdru;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzdru;->zzluh:Lcom/google/android/gms/internal/zzdru;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphh:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdru;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzbiy()V

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffu;-><init>()V

    return-void
.end method

.method public static synthetic zzbnb()Lcom/google/android/gms/internal/zzdru;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdru;->zzluh:Lcom/google/android/gms/internal/zzdru;

    return-object v0
.end method

.method public static zzt(Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzdru;
    .registers 2

    sget-object v0, Lcom/google/android/gms/internal/zzdru;->zzluh:Lcom/google/android/gms/internal/zzdru;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/zzffu;->zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzffu;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/zzdru;

    return-object p0
.end method


# virtual methods
.method public final getKeySize()I
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzdru;->zzltx:I

    return v0
.end method

.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    sget-object v0, Lcom/google/android/gms/internal/zzdrv;->zzbbi:[I

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    aget p1, v0, p1

    const/4 v0, 0x0

    const/4 v2, 0x0

    packed-switch p1, :pswitch_data_e0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_11
    return-object v2

    :pswitch_12
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_17
    sget-object p1, Lcom/google/android/gms/internal/zzdru;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p1, :cond_30

    const-class p1, Lcom/google/android/gms/internal/zzdru;

    monitor-enter p1

    :try_start_1e
    sget-object p2, Lcom/google/android/gms/internal/zzdru;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p2, :cond_2b

    new-instance p2, Lcom/google/android/gms/internal/zzffu$zzb;

    sget-object p3, Lcom/google/android/gms/internal/zzdru;->zzluh:Lcom/google/android/gms/internal/zzdru;

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/zzffu$zzb;-><init>(Lcom/google/android/gms/internal/zzffu;)V

    sput-object p2, Lcom/google/android/gms/internal/zzdru;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    :cond_2b
    monitor-exit p1

    goto :goto_30

    :catchall_2d
    move-exception p2

    monitor-exit p1
    :try_end_2f
    .catchall {:try_start_1e .. :try_end_2f} :catchall_2d

    throw p2

    :cond_30
    :goto_30
    sget-object p1, Lcom/google/android/gms/internal/zzdru;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    return-object p1

    :pswitch_33
    check-cast p2, Lcom/google/android/gms/internal/zzffb;

    check-cast p3, Lcom/google/android/gms/internal/zzffm;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_3a
    :goto_3a
    if-nez v0, :cond_a9

    :try_start_3c
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcvt()I

    move-result p1

    if-eqz p1, :cond_85

    const/16 v3, 0xa

    if-eq p1, v3, :cond_58

    const/16 v3, 0x10

    if-eq p1, v3, :cond_51

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzffu;->zza(ILcom/google/android/gms/internal/zzffb;)Z

    move-result p1

    if-nez p1, :cond_3a

    goto :goto_85

    :cond_51
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwc()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdru;->zzltx:I

    goto :goto_3a

    :cond_58
    iget-object p1, p0, Lcom/google/android/gms/internal/zzdru;->zzluf:Lcom/google/android/gms/internal/zzdrw;

    if-eqz p1, :cond_6a

    sget v3, Lcom/google/android/gms/internal/zzffu$zzg;->zzphj:I

    invoke-virtual {p1, v3, v2, v2}, Lcom/google/android/gms/internal/zzdrw;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    check-cast v3, Lcom/google/android/gms/internal/zzdrw$zza;

    goto :goto_6b

    :cond_6a
    move-object v3, v2

    :goto_6b
    invoke-static {}, Lcom/google/android/gms/internal/zzdrw;->zzbnc()Lcom/google/android/gms/internal/zzdrw;

    move-result-object p1

    invoke-virtual {p2, p1, p3}, Lcom/google/android/gms/internal/zzffb;->zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzffm;)Lcom/google/android/gms/internal/zzffu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdrw;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdru;->zzluf:Lcom/google/android/gms/internal/zzdrw;

    if-eqz v3, :cond_3a

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzffu$zza;->zzcxs()Lcom/google/android/gms/internal/zzffu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdrw;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdru;->zzluf:Lcom/google/android/gms/internal/zzdrw;
    :try_end_84
    .catch Lcom/google/android/gms/internal/zzfge; {:try_start_3c .. :try_end_84} :catch_9d
    .catch Ljava/io/IOException; {:try_start_3c .. :try_end_84} :catch_89
    .catchall {:try_start_3c .. :try_end_84} :catchall_87

    goto :goto_3a

    :cond_85
    :goto_85
    const/4 v0, 0x1

    goto :goto_3a

    :catchall_87
    move-exception p1

    goto :goto_a8

    :catch_89
    move-exception p1

    :try_start_8a
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance p3, Lcom/google/android/gms/internal/zzfge;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/zzfge;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_9d
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_a8
    .catchall {:try_start_8a .. :try_end_a8} :catchall_87

    :goto_a8
    throw p1

    :cond_a9
    :pswitch_a9
    sget-object p1, Lcom/google/android/gms/internal/zzdru;->zzluh:Lcom/google/android/gms/internal/zzdru;

    return-object p1

    :pswitch_ac
    check-cast p2, Lcom/google/android/gms/internal/zzffu$zzh;

    check-cast p3, Lcom/google/android/gms/internal/zzdru;

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdru;->zzluf:Lcom/google/android/gms/internal/zzdrw;

    iget-object v2, p3, Lcom/google/android/gms/internal/zzdru;->zzluf:Lcom/google/android/gms/internal/zzdrw;

    invoke-interface {p2, p1, v2}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(Lcom/google/android/gms/internal/zzfhe;Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfhe;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdrw;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdru;->zzluf:Lcom/google/android/gms/internal/zzdrw;

    iget p1, p0, Lcom/google/android/gms/internal/zzdru;->zzltx:I

    if-eqz p1, :cond_c2

    const/4 v2, 0x1

    goto :goto_c3

    :cond_c2
    const/4 v2, 0x0

    :goto_c3
    iget p3, p3, Lcom/google/android/gms/internal/zzdru;->zzltx:I

    if-eqz p3, :cond_c8

    goto :goto_c9

    :cond_c8
    const/4 v1, 0x0

    :goto_c9
    invoke-interface {p2, v2, p1, v1, p3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZIZI)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdru;->zzltx:I

    return-object p0

    :pswitch_d0
    new-instance p1, Lcom/google/android/gms/internal/zzdru$zza;

    invoke-direct {p1, v2}, Lcom/google/android/gms/internal/zzdru$zza;-><init>(Lcom/google/android/gms/internal/zzdrv;)V

    return-object p1

    :pswitch_d6
    return-object v2

    :pswitch_d7
    sget-object p1, Lcom/google/android/gms/internal/zzdru;->zzluh:Lcom/google/android/gms/internal/zzdru;

    return-object p1

    :pswitch_da
    new-instance p1, Lcom/google/android/gms/internal/zzdru;

    invoke-direct {p1}, Lcom/google/android/gms/internal/zzdru;-><init>()V

    return-object p1

    :pswitch_data_e0
    .packed-switch 0x1
        :pswitch_da
        :pswitch_d7
        :pswitch_d6
        :pswitch_d0
        :pswitch_ac
        :pswitch_33
        :pswitch_a9
        :pswitch_17
        :pswitch_12
        :pswitch_11
    .end packed-switch
.end method

.method public final zza(Lcom/google/android/gms/internal/zzffg;)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdru;->zzluf:Lcom/google/android/gms/internal/zzdrw;

    if-eqz v0, :cond_e

    const/4 v1, 0x1

    if-nez v0, :cond_b

    invoke-static {}, Lcom/google/android/gms/internal/zzdrw;->zzbnc()Lcom/google/android/gms/internal/zzdrw;

    move-result-object v0

    :cond_b
    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zza(ILcom/google/android/gms/internal/zzfhe;)V

    :cond_e
    iget v0, p0, Lcom/google/android/gms/internal/zzdru;->zzltx:I

    if-eqz v0, :cond_16

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zzab(II)V

    :cond_16
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzfio;->zza(Lcom/google/android/gms/internal/zzffg;)V

    return-void
.end method

.method public final zzbna()Lcom/google/android/gms/internal/zzdrw;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdru;->zzluf:Lcom/google/android/gms/internal/zzdrw;

    if-nez v0, :cond_8

    invoke-static {}, Lcom/google/android/gms/internal/zzdrw;->zzbnc()Lcom/google/android/gms/internal/zzdrw;

    move-result-object v0

    :cond_8
    return-object v0
.end method

.method public final zzho()I
    .registers 4

    iget v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    return v0

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdru;->zzluf:Lcom/google/android/gms/internal/zzdrw;

    const/4 v1, 0x0

    if-eqz v0, :cond_17

    const/4 v2, 0x1

    if-nez v0, :cond_12

    invoke-static {}, Lcom/google/android/gms/internal/zzdrw;->zzbnc()Lcom/google/android/gms/internal/zzdrw;

    move-result-object v0

    :cond_12
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzffg;->zzc(ILcom/google/android/gms/internal/zzfhe;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_17
    iget v0, p0, Lcom/google/android/gms/internal/zzdru;->zzltx:I

    if-eqz v0, :cond_21

    const/4 v2, 0x2

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzffg;->zzae(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_21
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzho()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    return v0
.end method
