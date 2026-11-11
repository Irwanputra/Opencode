.class public final Lcom/google/android/gms/internal/zzdtl;
.super Lcom/google/android/gms/internal/zzffu;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzfhg;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzdtl$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzffu<",
        "Lcom/google/android/gms/internal/zzdtl;",
        "Lcom/google/android/gms/internal/zzdtl$zza;",
        ">;",
        "Lcom/google/android/gms/internal/zzfhg;"
    }
.end annotation


# static fields
.field private static volatile zzbbk:Lcom/google/android/gms/internal/zzfhk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzfhk<",
            "Lcom/google/android/gms/internal/zzdtl;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzlxk:Lcom/google/android/gms/internal/zzdtl;


# instance fields
.field private zzltn:I

.field private zzlxj:Lcom/google/android/gms/internal/zzdtn;


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    new-instance v0, Lcom/google/android/gms/internal/zzdtl;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzdtl;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzdtl;->zzlxk:Lcom/google/android/gms/internal/zzdtl;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphh:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdtl;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzbiy()V

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffu;-><init>()V

    return-void
.end method

.method private final setVersion(I)V
    .registers 2

    iput p1, p0, Lcom/google/android/gms/internal/zzdtl;->zzltn:I

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdtl;I)V
    .registers 2

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdtl;->setVersion(I)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdtl;Lcom/google/android/gms/internal/zzdtn;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdtl;->zza(Lcom/google/android/gms/internal/zzdtn;)V

    return-void
.end method

.method private final zza(Lcom/google/android/gms/internal/zzdtn;)V
    .registers 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtl;->zzlxj:Lcom/google/android/gms/internal/zzdtn;

    return-void
.end method

.method public static zzaj(Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzdtl;
    .registers 2

    sget-object v0, Lcom/google/android/gms/internal/zzdtl;->zzlxk:Lcom/google/android/gms/internal/zzdtl;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/zzffu;->zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzffu;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/zzdtl;

    return-object p0
.end method

.method public static zzbpt()Lcom/google/android/gms/internal/zzdtl$zza;
    .registers 3

    sget-object v0, Lcom/google/android/gms/internal/zzdtl;->zzlxk:Lcom/google/android/gms/internal/zzdtl;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphj:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdtl;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    check-cast v1, Lcom/google/android/gms/internal/zzdtl$zza;

    return-object v1
.end method

.method public static synthetic zzbpu()Lcom/google/android/gms/internal/zzdtl;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdtl;->zzlxk:Lcom/google/android/gms/internal/zzdtl;

    return-object v0
.end method


# virtual methods
.method public final getVersion()I
    .registers 2

    iget v0, p0, Lcom/google/android/gms/internal/zzdtl;->zzltn:I

    return v0
.end method

.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    sget-object v0, Lcom/google/android/gms/internal/zzdtm;->zzbbi:[I

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
    sget-object p1, Lcom/google/android/gms/internal/zzdtl;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p1, :cond_30

    const-class p1, Lcom/google/android/gms/internal/zzdtl;

    monitor-enter p1

    :try_start_1e
    sget-object p2, Lcom/google/android/gms/internal/zzdtl;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p2, :cond_2b

    new-instance p2, Lcom/google/android/gms/internal/zzffu$zzb;

    sget-object p3, Lcom/google/android/gms/internal/zzdtl;->zzlxk:Lcom/google/android/gms/internal/zzdtl;

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/zzffu$zzb;-><init>(Lcom/google/android/gms/internal/zzffu;)V

    sput-object p2, Lcom/google/android/gms/internal/zzdtl;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

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
    sget-object p1, Lcom/google/android/gms/internal/zzdtl;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

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

    const/16 v3, 0x8

    if-eq p1, v3, :cond_7e

    const/16 v3, 0x12

    if-eq p1, v3, :cond_51

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzffu;->zza(ILcom/google/android/gms/internal/zzffb;)Z

    move-result p1

    if-nez p1, :cond_3a

    goto :goto_85

    :cond_51
    iget-object p1, p0, Lcom/google/android/gms/internal/zzdtl;->zzlxj:Lcom/google/android/gms/internal/zzdtn;

    if-eqz p1, :cond_63

    sget v3, Lcom/google/android/gms/internal/zzffu$zzg;->zzphj:I

    invoke-virtual {p1, v3, v2, v2}, Lcom/google/android/gms/internal/zzdtn;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    check-cast v3, Lcom/google/android/gms/internal/zzdtn$zza;

    goto :goto_64

    :cond_63
    move-object v3, v2

    :goto_64
    invoke-static {}, Lcom/google/android/gms/internal/zzdtn;->zzbpw()Lcom/google/android/gms/internal/zzdtn;

    move-result-object p1

    invoke-virtual {p2, p1, p3}, Lcom/google/android/gms/internal/zzffb;->zza(Lcom/google/android/gms/internal/zzffu;Lcom/google/android/gms/internal/zzffm;)Lcom/google/android/gms/internal/zzffu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdtn;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtl;->zzlxj:Lcom/google/android/gms/internal/zzdtn;

    if-eqz v3, :cond_3a

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzffu$zza;->zzcxs()Lcom/google/android/gms/internal/zzffu;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdtn;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtl;->zzlxj:Lcom/google/android/gms/internal/zzdtn;

    goto :goto_3a

    :cond_7e
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwc()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdtl;->zzltn:I
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
    sget-object p1, Lcom/google/android/gms/internal/zzdtl;->zzlxk:Lcom/google/android/gms/internal/zzdtl;

    return-object p1

    :pswitch_ac
    check-cast p2, Lcom/google/android/gms/internal/zzffu$zzh;

    check-cast p3, Lcom/google/android/gms/internal/zzdtl;

    iget p1, p0, Lcom/google/android/gms/internal/zzdtl;->zzltn:I

    if-eqz p1, :cond_b6

    const/4 v2, 0x1

    goto :goto_b7

    :cond_b6
    const/4 v2, 0x0

    :goto_b7
    iget v3, p3, Lcom/google/android/gms/internal/zzdtl;->zzltn:I

    if-eqz v3, :cond_bc

    goto :goto_bd

    :cond_bc
    const/4 v1, 0x0

    :goto_bd
    invoke-interface {p2, v2, p1, v1, v3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZIZI)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdtl;->zzltn:I

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdtl;->zzlxj:Lcom/google/android/gms/internal/zzdtn;

    iget-object p3, p3, Lcom/google/android/gms/internal/zzdtl;->zzlxj:Lcom/google/android/gms/internal/zzdtn;

    invoke-interface {p2, p1, p3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(Lcom/google/android/gms/internal/zzfhe;Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfhe;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzdtn;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtl;->zzlxj:Lcom/google/android/gms/internal/zzdtn;

    return-object p0

    :pswitch_d0
    new-instance p1, Lcom/google/android/gms/internal/zzdtl$zza;

    invoke-direct {p1, v2}, Lcom/google/android/gms/internal/zzdtl$zza;-><init>(Lcom/google/android/gms/internal/zzdtm;)V

    return-object p1

    :pswitch_d6
    return-object v2

    :pswitch_d7
    sget-object p1, Lcom/google/android/gms/internal/zzdtl;->zzlxk:Lcom/google/android/gms/internal/zzdtl;

    return-object p1

    :pswitch_da
    new-instance p1, Lcom/google/android/gms/internal/zzdtl;

    invoke-direct {p1}, Lcom/google/android/gms/internal/zzdtl;-><init>()V

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

    iget v0, p0, Lcom/google/android/gms/internal/zzdtl;->zzltn:I

    if-eqz v0, :cond_8

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zzab(II)V

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtl;->zzlxj:Lcom/google/android/gms/internal/zzdtn;

    if-eqz v0, :cond_16

    const/4 v1, 0x2

    if-nez v0, :cond_13

    invoke-static {}, Lcom/google/android/gms/internal/zzdtn;->zzbpw()Lcom/google/android/gms/internal/zzdtn;

    move-result-object v0

    :cond_13
    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zza(ILcom/google/android/gms/internal/zzfhe;)V

    :cond_16
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzfio;->zza(Lcom/google/android/gms/internal/zzffg;)V

    return-void
.end method

.method public final zzbps()Lcom/google/android/gms/internal/zzdtn;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtl;->zzlxj:Lcom/google/android/gms/internal/zzdtn;

    if-nez v0, :cond_8

    invoke-static {}, Lcom/google/android/gms/internal/zzdtn;->zzbpw()Lcom/google/android/gms/internal/zzdtn;

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
    iget v0, p0, Lcom/google/android/gms/internal/zzdtl;->zzltn:I

    const/4 v1, 0x0

    if-eqz v0, :cond_11

    const/4 v2, 0x1

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzffg;->zzae(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_11
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtl;->zzlxj:Lcom/google/android/gms/internal/zzdtn;

    if-eqz v0, :cond_21

    const/4 v2, 0x2

    if-nez v0, :cond_1c

    invoke-static {}, Lcom/google/android/gms/internal/zzdtn;->zzbpw()Lcom/google/android/gms/internal/zzdtn;

    move-result-object v0

    :cond_1c
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzffg;->zzc(ILcom/google/android/gms/internal/zzfhe;)I

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
