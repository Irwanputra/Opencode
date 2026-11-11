.class public final Lcom/google/android/gms/internal/zzdtd;
.super Lcom/google/android/gms/internal/zzffu;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzfhg;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzdtd$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzffu<",
        "Lcom/google/android/gms/internal/zzdtd;",
        "Lcom/google/android/gms/internal/zzdtd$zza;",
        ">;",
        "Lcom/google/android/gms/internal/zzfhg;"
    }
.end annotation


# static fields
.field private static volatile zzbbk:Lcom/google/android/gms/internal/zzfhk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzfhk<",
            "Lcom/google/android/gms/internal/zzdtd;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzlws:Lcom/google/android/gms/internal/zzdtd;


# instance fields
.field private zzlwa:Ljava/lang/String;

.field private zzlwb:Lcom/google/android/gms/internal/zzfes;

.field private zzlwr:I


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    new-instance v0, Lcom/google/android/gms/internal/zzdtd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzdtd;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzdtd;->zzlws:Lcom/google/android/gms/internal/zzdtd;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphh:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdtd;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzbiy()V

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffu;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdtd;->zzlwa:Ljava/lang/String;

    sget-object v0, Lcom/google/android/gms/internal/zzfes;->zzpfg:Lcom/google/android/gms/internal/zzfes;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdtd;->zzlwb:Lcom/google/android/gms/internal/zzfes;

    return-void
.end method

.method public static zzbot()Lcom/google/android/gms/internal/zzdtd;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdtd;->zzlws:Lcom/google/android/gms/internal/zzdtd;

    return-object v0
.end method

.method public static synthetic zzbou()Lcom/google/android/gms/internal/zzdtd;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdtd;->zzlws:Lcom/google/android/gms/internal/zzdtd;

    return-object v0
.end method


# virtual methods
.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    sget-object v0, Lcom/google/android/gms/internal/zzdte;->zzbbi:[I

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    aget p1, v0, p1

    const/4 v0, 0x0

    const/4 v2, 0x0

    packed-switch p1, :pswitch_data_e8

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
    sget-object p1, Lcom/google/android/gms/internal/zzdtd;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p1, :cond_30

    const-class p1, Lcom/google/android/gms/internal/zzdtd;

    monitor-enter p1

    :try_start_1e
    sget-object p2, Lcom/google/android/gms/internal/zzdtd;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p2, :cond_2b

    new-instance p2, Lcom/google/android/gms/internal/zzffu$zzb;

    sget-object p3, Lcom/google/android/gms/internal/zzdtd;->zzlws:Lcom/google/android/gms/internal/zzdtd;

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/zzffu$zzb;-><init>(Lcom/google/android/gms/internal/zzffu;)V

    sput-object p2, Lcom/google/android/gms/internal/zzdtd;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

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
    sget-object p1, Lcom/google/android/gms/internal/zzdtd;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

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

    const/16 p3, 0xa

    if-eq p1, p3, :cond_63

    const/16 p3, 0x12

    if-eq p1, p3, :cond_5c

    const/16 p3, 0x18

    if-eq p1, p3, :cond_55

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzffu;->zza(ILcom/google/android/gms/internal/zzffb;)Z

    move-result p1

    if-nez p1, :cond_3a

    goto :goto_6a

    :cond_55
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwd()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdtd;->zzlwr:I

    goto :goto_3a

    :cond_5c
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwb()Lcom/google/android/gms/internal/zzfes;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtd;->zzlwb:Lcom/google/android/gms/internal/zzfes;

    goto :goto_3a

    :cond_63
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwa()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtd;->zzlwa:Ljava/lang/String;
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
    sget-object p1, Lcom/google/android/gms/internal/zzdtd;->zzlws:Lcom/google/android/gms/internal/zzdtd;

    return-object p1

    :pswitch_91
    check-cast p2, Lcom/google/android/gms/internal/zzffu$zzh;

    check-cast p3, Lcom/google/android/gms/internal/zzdtd;

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdtd;->zzlwa:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtd;->zzlwa:Ljava/lang/String;

    iget-object v3, p3, Lcom/google/android/gms/internal/zzdtd;->zzlwa:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v1

    iget-object v4, p3, Lcom/google/android/gms/internal/zzdtd;->zzlwa:Ljava/lang/String;

    invoke-interface {p2, p1, v0, v3, v4}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtd;->zzlwa:Ljava/lang/String;

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdtd;->zzlwb:Lcom/google/android/gms/internal/zzfes;

    sget-object v0, Lcom/google/android/gms/internal/zzfes;->zzpfg:Lcom/google/android/gms/internal/zzfes;

    if-eq p1, v0, :cond_b5

    const/4 v3, 0x1

    goto :goto_b6

    :cond_b5
    const/4 v3, 0x0

    :goto_b6
    iget-object v4, p3, Lcom/google/android/gms/internal/zzdtd;->zzlwb:Lcom/google/android/gms/internal/zzfes;

    if-eq v4, v0, :cond_bc

    const/4 v0, 0x1

    goto :goto_bd

    :cond_bc
    const/4 v0, 0x0

    :goto_bd
    invoke-interface {p2, v3, p1, v0, v4}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZLcom/google/android/gms/internal/zzfes;ZLcom/google/android/gms/internal/zzfes;)Lcom/google/android/gms/internal/zzfes;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtd;->zzlwb:Lcom/google/android/gms/internal/zzfes;

    iget p1, p0, Lcom/google/android/gms/internal/zzdtd;->zzlwr:I

    if-eqz p1, :cond_c9

    const/4 v0, 0x1

    goto :goto_ca

    :cond_c9
    const/4 v0, 0x0

    :goto_ca
    iget p3, p3, Lcom/google/android/gms/internal/zzdtd;->zzlwr:I

    if-eqz p3, :cond_cf

    goto :goto_d0

    :cond_cf
    const/4 v1, 0x0

    :goto_d0
    invoke-interface {p2, v0, p1, v1, p3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZIZI)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdtd;->zzlwr:I

    return-object p0

    :pswitch_d7
    new-instance p1, Lcom/google/android/gms/internal/zzdtd$zza;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/zzdtd$zza;-><init>(Lcom/google/android/gms/internal/zzdte;)V

    return-object p1

    :pswitch_dd
    return-object v0

    :pswitch_de
    sget-object p1, Lcom/google/android/gms/internal/zzdtd;->zzlws:Lcom/google/android/gms/internal/zzdtd;

    return-object p1

    :pswitch_e1
    new-instance p1, Lcom/google/android/gms/internal/zzdtd;

    invoke-direct {p1}, Lcom/google/android/gms/internal/zzdtd;-><init>()V

    return-object p1

    nop

    :pswitch_data_e8
    .packed-switch 0x1
        :pswitch_e1
        :pswitch_de
        :pswitch_dd
        :pswitch_d7
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

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtd;->zzlwa:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_e

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/google/android/gms/internal/zzdtd;->zzlwa:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/zzffg;->zzn(ILjava/lang/String;)V

    :cond_e
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtd;->zzlwb:Lcom/google/android/gms/internal/zzfes;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfes;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1c

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/google/android/gms/internal/zzdtd;->zzlwb:Lcom/google/android/gms/internal/zzfes;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/zzffg;->zza(ILcom/google/android/gms/internal/zzfes;)V

    :cond_1c
    iget v0, p0, Lcom/google/android/gms/internal/zzdtd;->zzlwr:I

    sget-object v1, Lcom/google/android/gms/internal/zzdtt;->zzlxs:Lcom/google/android/gms/internal/zzdtt;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzdtt;->zzhq()I

    move-result v1

    if-eq v0, v1, :cond_2c

    iget v0, p0, Lcom/google/android/gms/internal/zzdtd;->zzlwr:I

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zzaa(II)V

    :cond_2c
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzfio;->zza(Lcom/google/android/gms/internal/zzffg;)V

    return-void
.end method

.method public final zzbon()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtd;->zzlwa:Ljava/lang/String;

    return-object v0
.end method

.method public final zzboo()Lcom/google/android/gms/internal/zzfes;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtd;->zzlwb:Lcom/google/android/gms/internal/zzfes;

    return-object v0
.end method

.method public final zzho()I
    .registers 4

    iget v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    return v0

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtd;->zzlwa:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_17

    const/4 v0, 0x1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzdtd;->zzlwa:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzffg;->zzo(ILjava/lang/String;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_17
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtd;->zzlwb:Lcom/google/android/gms/internal/zzfes;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfes;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_27

    const/4 v0, 0x2

    iget-object v2, p0, Lcom/google/android/gms/internal/zzdtd;->zzlwb:Lcom/google/android/gms/internal/zzfes;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzffg;->zzc(ILcom/google/android/gms/internal/zzfes;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_27
    iget v0, p0, Lcom/google/android/gms/internal/zzdtd;->zzlwr:I

    sget-object v2, Lcom/google/android/gms/internal/zzdtt;->zzlxs:Lcom/google/android/gms/internal/zzdtt;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzdtt;->zzhq()I

    move-result v2

    if-eq v0, v2, :cond_39

    const/4 v0, 0x3

    iget v2, p0, Lcom/google/android/gms/internal/zzdtd;->zzlwr:I

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzffg;->zzag(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_39
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzho()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    return v0
.end method
