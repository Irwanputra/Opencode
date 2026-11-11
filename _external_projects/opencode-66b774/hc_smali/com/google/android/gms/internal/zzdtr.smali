.class public final Lcom/google/android/gms/internal/zzdtr;
.super Lcom/google/android/gms/internal/zzffu;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzfhg;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzdtr$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzffu<",
        "Lcom/google/android/gms/internal/zzdtr;",
        "Lcom/google/android/gms/internal/zzdtr$zza;",
        ">;",
        "Lcom/google/android/gms/internal/zzfhg;"
    }
.end annotation


# static fields
.field private static volatile zzbbk:Lcom/google/android/gms/internal/zzfhk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzfhk<",
            "Lcom/google/android/gms/internal/zzdtr;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzlxr:Lcom/google/android/gms/internal/zzdtr;


# instance fields
.field private zzlxp:Ljava/lang/String;

.field private zzlxq:Lcom/google/android/gms/internal/zzdtd;


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    new-instance v0, Lcom/google/android/gms/internal/zzdtr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzdtr;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzdtr;->zzlxr:Lcom/google/android/gms/internal/zzdtr;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphh:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdtr;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzbiy()V

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffu;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdtr;->zzlxp:Ljava/lang/String;

    return-void
.end method

.method public static zzam(Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzdtr;
    .registers 2

    sget-object v0, Lcom/google/android/gms/internal/zzdtr;->zzlxr:Lcom/google/android/gms/internal/zzdtr;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/zzffu;->zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzffu;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/zzdtr;

    return-object p0
.end method

.method public static zzbqd()Lcom/google/android/gms/internal/zzdtr;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdtr;->zzlxr:Lcom/google/android/gms/internal/zzdtr;

    return-object v0
.end method

.method public static synthetic zzbqe()Lcom/google/android/gms/internal/zzdtr;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdtr;->zzlxr:Lcom/google/android/gms/internal/zzdtr;

    return-object v0
.end method


# virtual methods
.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    sget-object v0, Lcom/google/android/gms/internal/zzdts;->zzbbi:[I

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    aget p1, v0, p1

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_e6

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_10
    return-object v0

    :pswitch_11
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_16
    sget-object p1, Lcom/google/android/gms/internal/zzdtr;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p1, :cond_2f

    const-class p1, Lcom/google/android/gms/internal/zzdtr;

    monitor-enter p1

    :try_start_1d
    sget-object p2, Lcom/google/android/gms/internal/zzdtr;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p2, :cond_2a

    new-instance p2, Lcom/google/android/gms/internal/zzffu$zzb;

    sget-object p3, Lcom/google/android/gms/internal/zzdtr;->zzlxr:Lcom/google/android/gms/internal/zzdtr;

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/zzffu$zzb;-><init>(Lcom/google/android/gms/internal/zzffu;)V

    sput-object p2, Lcom/google/android/gms/internal/zzdtr;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    :cond_2a
    monitor-exit p1

    goto :goto_2f

    :catchall_2c
    move-exception p2

    monitor-exit p1
    :try_end_2e
    .catchall {:try_start_1d .. :try_end_2e} :catchall_2c

    throw p2

    :cond_2f
    :goto_2f
    sget-object p1, Lcom/google/android/gms/internal/zzdtr;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    return-object p1

    :pswitch_32
    check-cast p2, Lcom/google/android/gms/internal/zzffb;

    check-cast p3, Lcom/google/android/gms/internal/zzffm;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    :cond_3a
    :goto_3a
    if-nez p1, :cond_a9

    :try_start_3c
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcvt()I

    move-result v2

    if-eqz v2, :cond_85

    const/16 v3, 0xa

    if-eq v2, v3, :cond_7e

    const/16 v3, 0x12

    if-eq v2, v3, :cond_51

    invoke-virtual {p0, v2, p2}, Lcom/google/android/gms/internal/zzffu;->zza(ILcom/google/android/gms/internal/zzffb;)Z

    move-result v2

    if-nez v2, :cond_3a

    goto :goto_85

    :cond_51
    iget-object v2, p0, Lcom/google/android/gms/internal/zzdtr;->zzlxq:Lcom/google/android/gms/internal/zzdtd;

    if-eqz v2, :cond_63

    sget v3, Lcom/google/android/gms/internal/zzffu$zzg;->zzphj:I

    invoke-virtual {v2, v3, v0, v0}, Lcom/google/android/gms/internal/zzdtd;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    check-cast v3, Lcom/google/android/gms/internal/zzdtd$zza;

    goto :goto_64

    :cond_63
    move-object v3, v0

    :goto_64
    invoke-static {}, Lcom/google/android/gms/internal/zzdtd;->zzbot()Lcom/google/android/gms/internal/zzdtd;

    move-result-object v2

    invoke-virtual {p2, v2, p3}, Lcom/google/android/gms/internal/zzffb;->zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzffm;)Lcom/google/android/gms/internal/zzffu;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/zzdtd;

    iput-object v2, p0, Lcom/google/android/gms/internal/zzdtr;->zzlxq:Lcom/google/android/gms/internal/zzdtd;

    if-eqz v3, :cond_3a

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzffu$zza;->zzcxs()Lcom/google/android/gms/internal/zzffu;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/zzdtd;

    iput-object v2, p0, Lcom/google/android/gms/internal/zzdtr;->zzlxq:Lcom/google/android/gms/internal/zzdtd;

    goto :goto_3a

    :cond_7e
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwa()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/zzdtr;->zzlxp:Ljava/lang/String;
    :try_end_84
    .catch Lcom/google/android/gms/internal/zzfge; {:try_start_3c .. :try_end_84} :catch_9d
    .catch Ljava/io/IOException; {:try_start_3c .. :try_end_84} :catch_89
    .catchall {:try_start_3c .. :try_end_84} :catchall_87

    goto :goto_3a

    :cond_85
    :goto_85
    const/4 p1, 0x1

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
    sget-object p1, Lcom/google/android/gms/internal/zzdtr;->zzlxr:Lcom/google/android/gms/internal/zzdtr;

    return-object p1

    :pswitch_ac
    check-cast p2, Lcom/google/android/gms/internal/zzffu$zzh;

    check-cast p3, Lcom/google/android/gms/internal/zzdtr;

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdtr;->zzlxp:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtr;->zzlxp:Ljava/lang/String;

    iget-object v2, p3, Lcom/google/android/gms/internal/zzdtr;->zzlxp:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    xor-int/2addr v1, v2

    iget-object v2, p3, Lcom/google/android/gms/internal/zzdtr;->zzlxp:Ljava/lang/String;

    invoke-interface {p2, p1, v0, v1, v2}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtr;->zzlxp:Ljava/lang/String;

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdtr;->zzlxq:Lcom/google/android/gms/internal/zzdtd;

    iget-object p3, p3, Lcom/google/android/gms/internal/zzdtr;->zzlxq:Lcom/google/android/gms/internal/zzdtd;

    invoke-interface {p2, p1, p3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(Lcom/google/android/gms/internal/zzfhe;Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfhe;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdtd;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtr;->zzlxq:Lcom/google/android/gms/internal/zzdtd;

    return-object p0

    :pswitch_d5
    new-instance p1, Lcom/google/android/gms/internal/zzdtr$zza;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/zzdtr$zza;-><init>(Lcom/google/android/gms/internal/zzdts;)V

    return-object p1

    :pswitch_db
    return-object v0

    :pswitch_dc
    sget-object p1, Lcom/google/android/gms/internal/zzdtr;->zzlxr:Lcom/google/android/gms/internal/zzdtr;

    return-object p1

    :pswitch_df
    new-instance p1, Lcom/google/android/gms/internal/zzdtr;

    invoke-direct {p1}, Lcom/google/android/gms/internal/zzdtr;-><init>()V

    return-object p1

    nop

    :pswitch_data_e6
    .packed-switch 0x1
        :pswitch_df
        :pswitch_dc
        :pswitch_db
        :pswitch_d5
        :pswitch_ac
        :pswitch_32
        :pswitch_a9
        :pswitch_16
        :pswitch_11
        :pswitch_10
    .end packed-switch
.end method

.method public final zza(Lcom/google/android/gms/internal/zzffg;)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtr;->zzlxp:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_e

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/google/android/gms/internal/zzdtr;->zzlxp:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/zzffg;->zzn(ILjava/lang/String;)V

    :cond_e
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtr;->zzlxq:Lcom/google/android/gms/internal/zzdtd;

    if-eqz v0, :cond_1c

    const/4 v1, 0x2

    if-nez v0, :cond_19

    invoke-static {}, Lcom/google/android/gms/internal/zzdtd;->zzbot()Lcom/google/android/gms/internal/zzdtd;

    move-result-object v0

    :cond_19
    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zza(ILcom/google/android/gms/internal/zzfhe;)V

    :cond_1c
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzfio;->zza(Lcom/google/android/gms/internal/zzffg;)V

    return-void
.end method

.method public final zzbqb()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtr;->zzlxp:Ljava/lang/String;

    return-object v0
.end method

.method public final zzbqc()Lcom/google/android/gms/internal/zzdtd;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtr;->zzlxq:Lcom/google/android/gms/internal/zzdtd;

    if-nez v0, :cond_8

    invoke-static {}, Lcom/google/android/gms/internal/zzdtd;->zzbot()Lcom/google/android/gms/internal/zzdtd;

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
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtr;->zzlxp:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_17

    const/4 v0, 0x1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzdtr;->zzlxp:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzffg;->zzo(ILjava/lang/String;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_17
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtr;->zzlxq:Lcom/google/android/gms/internal/zzdtd;

    if-eqz v0, :cond_27

    const/4 v2, 0x2

    if-nez v0, :cond_22

    invoke-static {}, Lcom/google/android/gms/internal/zzdtd;->zzbot()Lcom/google/android/gms/internal/zzdtd;

    move-result-object v0

    :cond_22
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzffg;->zzc(ILcom/google/android/gms/internal/zzfhe;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_27
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzho()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    return v0
.end method
