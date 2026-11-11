.class public final Lcom/google/android/gms/internal/zzdsm;
.super Lcom/google/android/gms/internal/zzffu;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzfhg;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzdsm$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzffu<",
        "Lcom/google/android/gms/internal/zzdsm;",
        "Lcom/google/android/gms/internal/zzdsm$zza;",
        ">;",
        "Lcom/google/android/gms/internal/zzfhg;"
    }
.end annotation


# static fields
.field private static volatile zzbbk:Lcom/google/android/gms/internal/zzfhk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzfhk<",
            "Lcom/google/android/gms/internal/zzdsm;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzlvf:Lcom/google/android/gms/internal/zzdsm;


# instance fields
.field private zzlvc:I

.field private zzlvd:I

.field private zzlve:Lcom/google/android/gms/internal/zzfes;


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    new-instance v0, Lcom/google/android/gms/internal/zzdsm;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzdsm;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzdsm;->zzlvf:Lcom/google/android/gms/internal/zzdsm;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphh:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdsm;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzbiy()V

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffu;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/zzfes;->zzpfg:Lcom/google/android/gms/internal/zzfes;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdsm;->zzlve:Lcom/google/android/gms/internal/zzfes;

    return-void
.end method

.method public static zzbob()Lcom/google/android/gms/internal/zzdsm;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdsm;->zzlvf:Lcom/google/android/gms/internal/zzdsm;

    return-object v0
.end method

.method public static synthetic zzboc()Lcom/google/android/gms/internal/zzdsm;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdsm;->zzlvf:Lcom/google/android/gms/internal/zzdsm;

    return-object v0
.end method


# virtual methods
.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    sget-object v0, Lcom/google/android/gms/internal/zzdsn;->zzbbi:[I

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    aget p1, v0, p1

    const/4 v0, 0x0

    const/4 v2, 0x0

    packed-switch p1, :pswitch_data_e4

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_11
    return-object v0

    :pswitch_12
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_17
    sget-object p1, Lcom/google/android/gms/internal/zzdsm;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p1, :cond_30

    const-class p1, Lcom/google/android/gms/internal/zzdsm;

    monitor-enter p1

    :try_start_1e
    sget-object p2, Lcom/google/android/gms/internal/zzdsm;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p2, :cond_2b

    new-instance p2, Lcom/google/android/gms/internal/zzffu$zzb;

    sget-object p3, Lcom/google/android/gms/internal/zzdsm;->zzlvf:Lcom/google/android/gms/internal/zzdsm;

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/zzffu$zzb;-><init>(Lcom/google/android/gms/internal/zzffu;)V

    sput-object p2, Lcom/google/android/gms/internal/zzdsm;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

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
    sget-object p1, Lcom/google/android/gms/internal/zzdsm;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    return-object p1

    :pswitch_33
    check-cast p2, Lcom/google/android/gms/internal/zzffb;

    check-cast p3, Lcom/google/android/gms/internal/zzffm;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_3a
    :goto_3a
    if-nez v2, :cond_8e

    :try_start_3c
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcvt()I

    move-result p1

    if-eqz p1, :cond_6a

    const/16 p3, 0x8

    if-eq p1, p3, :cond_63

    const/16 p3, 0x10

    if-eq p1, p3, :cond_5c

    const/16 p3, 0x5a

    if-eq p1, p3, :cond_55

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzffu;->zza(ILcom/google/android/gms/internal/zzffb;)Z

    move-result p1

    if-nez p1, :cond_3a

    goto :goto_6a

    :cond_55
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwb()Lcom/google/android/gms/internal/zzfes;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdsm;->zzlve:Lcom/google/android/gms/internal/zzfes;

    goto :goto_3a

    :cond_5c
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwd()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdsm;->zzlvd:I

    goto :goto_3a

    :cond_63
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwd()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdsm;->zzlvc:I
    :try_end_69
    .catch Lcom/google/android/gms/internal/zzfge; {:try_start_3c .. :try_end_69} :catch_82
    .catch Ljava/io/IOException; {:try_start_3c .. :try_end_69} :catch_6e
    .catchall {:try_start_3c .. :try_end_69} :catchall_6c

    goto :goto_3a

    :cond_6a
    :goto_6a
    const/4 v2, 0x1

    goto :goto_3a

    :catchall_6c
    move-exception p1

    goto :goto_8d

    :catch_6e
    move-exception p1

    :try_start_6f
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance p3, Lcom/google/android/gms/internal/zzfge;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/zzfge;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_82
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_8d
    .catchall {:try_start_6f .. :try_end_8d} :catchall_6c

    :goto_8d
    throw p1

    :cond_8e
    :pswitch_8e
    sget-object p1, Lcom/google/android/gms/internal/zzdsm;->zzlvf:Lcom/google/android/gms/internal/zzdsm;

    return-object p1

    :pswitch_91
    check-cast p2, Lcom/google/android/gms/internal/zzffu$zzh;

    check-cast p3, Lcom/google/android/gms/internal/zzdsm;

    iget p1, p0, Lcom/google/android/gms/internal/zzdsm;->zzlvc:I

    if-eqz p1, :cond_9b

    const/4 v0, 0x1

    goto :goto_9c

    :cond_9b
    const/4 v0, 0x0

    :goto_9c
    iget v3, p3, Lcom/google/android/gms/internal/zzdsm;->zzlvc:I

    if-eqz v3, :cond_a2

    const/4 v4, 0x1

    goto :goto_a3

    :cond_a2
    const/4 v4, 0x0

    :goto_a3
    invoke-interface {p2, v0, p1, v4, v3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZIZI)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdsm;->zzlvc:I

    iget p1, p0, Lcom/google/android/gms/internal/zzdsm;->zzlvd:I

    if-eqz p1, :cond_af

    const/4 v0, 0x1

    goto :goto_b0

    :cond_af
    const/4 v0, 0x0

    :goto_b0
    iget v3, p3, Lcom/google/android/gms/internal/zzdsm;->zzlvd:I

    if-eqz v3, :cond_b6

    const/4 v4, 0x1

    goto :goto_b7

    :cond_b6
    const/4 v4, 0x0

    :goto_b7
    invoke-interface {p2, v0, p1, v4, v3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZIZI)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdsm;->zzlvd:I

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdsm;->zzlve:Lcom/google/android/gms/internal/zzfes;

    sget-object v0, Lcom/google/android/gms/internal/zzfes;->zzpfg:Lcom/google/android/gms/internal/zzfes;

    if-eq p1, v0, :cond_c5

    const/4 v3, 0x1

    goto :goto_c6

    :cond_c5
    const/4 v3, 0x0

    :goto_c6
    iget-object p3, p3, Lcom/google/android/gms/internal/zzdsm;->zzlve:Lcom/google/android/gms/internal/zzfes;

    if-eq p3, v0, :cond_cb

    goto :goto_cc

    :cond_cb
    const/4 v1, 0x0

    :goto_cc
    invoke-interface {p2, v3, p1, v1, p3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZLcom/google/android/gms/internal/zzfes;ZLcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzfes;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdsm;->zzlve:Lcom/google/android/gms/internal/zzfes;

    return-object p0

    :pswitch_d3
    new-instance p1, Lcom/google/android/gms/internal/zzdsm$zza;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/zzdsm$zza;-><init>(Lcom/google/android/gms/internal/zzdsn;)V

    return-object p1

    :pswitch_d9
    return-object v0

    :pswitch_da
    sget-object p1, Lcom/google/android/gms/internal/zzdsm;->zzlvf:Lcom/google/android/gms/internal/zzdsm;

    return-object p1

    :pswitch_dd
    new-instance p1, Lcom/google/android/gms/internal/zzdsm;

    invoke-direct {p1}, Lcom/google/android/gms/internal/zzdsm;-><init>()V

    return-object p1

    nop

    :pswitch_data_e4
    .packed-switch 0x1
        :pswitch_dd
        :pswitch_da
        :pswitch_d9
        :pswitch_d3
        :pswitch_91
        :pswitch_33
        :pswitch_8e
        :pswitch_17
        :pswitch_12
        :pswitch_11
    .end packed-switch
.end method

.method public final zza(Lcom/google/android/gms/internal/zzffg;)V
    .registers 4

    iget v0, p0, Lcom/google/android/gms/internal/zzdsm;->zzlvc:I

    sget-object v1, Lcom/google/android/gms/internal/zzdso;->zzlvg:Lcom/google/android/gms/internal/zzdso;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzdso;->zzhq()I

    move-result v1

    if-eq v0, v1, :cond_10

    iget v0, p0, Lcom/google/android/gms/internal/zzdsm;->zzlvc:I

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zzaa(II)V

    :cond_10
    iget v0, p0, Lcom/google/android/gms/internal/zzdsm;->zzlvd:I

    sget-object v1, Lcom/google/android/gms/internal/zzdsq;->zzlvn:Lcom/google/android/gms/internal/zzdsq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzdsq;->zzhq()I

    move-result v1

    if-eq v0, v1, :cond_20

    iget v0, p0, Lcom/google/android/gms/internal/zzdsm;->zzlvd:I

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zzaa(II)V

    :cond_20
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdsm;->zzlve:Lcom/google/android/gms/internal/zzfes;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfes;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2f

    const/16 v0, 0xb

    iget-object v1, p0, Lcom/google/android/gms/internal/zzdsm;->zzlve:Lcom/google/android/gms/internal/zzfes;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/zzffg;->zza(ILcom/google/android/gms/internal/zzfes;)V

    :cond_2f
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzfio;->zza(Lcom/google/android/gms/internal/zzffg;)V

    return-void
.end method

.method public final zzbny()Lcom/google/android/gms/internal/zzdso;
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzdsm;->zzlvc:I

    invoke-static {v0}, Lcom/google/android/gms/internal/zzdso;->zzfq(I)Lcom/google/android/gms/internal/zzdso;

    move-result-object v0

    if-nez v0, :cond_a

    sget-object v0, Lcom/google/android/gms/internal/zzdso;->zzlvl:Lcom/google/android/gms/internal/zzdso;

    :cond_a
    return-object v0
.end method

.method public final zzbnz()Lcom/google/android/gms/internal/zzdsq;
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzdsm;->zzlvd:I

    invoke-static {v0}, Lcom/google/android/gms/internal/zzdsq;->zzfr(I)Lcom/google/android/gms/internal/zzdsq;

    move-result-object v0

    if-nez v0, :cond_a

    sget-object v0, Lcom/google/android/gms/internal/zzdsq;->zzlvs:Lcom/google/android/gms/internal/zzdsq;

    :cond_a
    return-object v0
.end method

.method public final zzboa()Lcom/google/android/gms/internal/zzfes;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdsm;->zzlve:Lcom/google/android/gms/internal/zzfes;

    return-object v0
.end method

.method public final zzho()I
    .registers 4

    iget v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    return v0

    :cond_6
    iget v0, p0, Lcom/google/android/gms/internal/zzdsm;->zzlvc:I

    sget-object v1, Lcom/google/android/gms/internal/zzdso;->zzlvg:Lcom/google/android/gms/internal/zzdso;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzdso;->zzhq()I

    move-result v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_19

    const/4 v0, 0x1

    iget v1, p0, Lcom/google/android/gms/internal/zzdsm;->zzlvc:I

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzffg;->zzag(II)I

    move-result v0

    add-int/2addr v2, v0

    :cond_19
    iget v0, p0, Lcom/google/android/gms/internal/zzdsm;->zzlvd:I

    sget-object v1, Lcom/google/android/gms/internal/zzdsq;->zzlvn:Lcom/google/android/gms/internal/zzdsq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzdsq;->zzhq()I

    move-result v1

    if-eq v0, v1, :cond_2b

    const/4 v0, 0x2

    iget v1, p0, Lcom/google/android/gms/internal/zzdsm;->zzlvd:I

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzffg;->zzag(II)I

    move-result v0

    add-int/2addr v2, v0

    :cond_2b
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdsm;->zzlve:Lcom/google/android/gms/internal/zzfes;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfes;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3c

    const/16 v0, 0xb

    iget-object v1, p0, Lcom/google/android/gms/internal/zzdsm;->zzlve:Lcom/google/android/gms/internal/zzfes;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzffg;->zzc(ILcom/google/android/gms/internal/zzfes;)I

    move-result v0

    add-int/2addr v2, v0

    :cond_3c
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzho()I

    move-result v0

    add-int/2addr v0, v2

    iput v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    return v0
.end method
