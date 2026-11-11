.class public final Lcom/google/android/gms/internal/zzdtj$zzb;
.super Lcom/google/android/gms/internal/zzffu;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzfhg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzdtj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zzb"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzdtj$zzb$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzffu<",
        "Lcom/google/android/gms/internal/zzdtj$zzb;",
        "Lcom/google/android/gms/internal/zzdtj$zzb$zza;",
        ">;",
        "Lcom/google/android/gms/internal/zzfhg;"
    }
.end annotation


# static fields
.field private static volatile zzbbk:Lcom/google/android/gms/internal/zzfhk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzfhk<",
            "Lcom/google/android/gms/internal/zzdtj$zzb;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzlxi:Lcom/google/android/gms/internal/zzdtj$zzb;


# instance fields
.field private zzlwa:Ljava/lang/String;

.field private zzlwr:I

.field private zzlxd:I

.field private zzlxe:I


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    new-instance v0, Lcom/google/android/gms/internal/zzdtj$zzb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzdtj$zzb;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlxi:Lcom/google/android/gms/internal/zzdtj$zzb;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphh:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdtj$zzb;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzbiy()V

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffu;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlwa:Ljava/lang/String;

    return-void
.end method

.method private final zza(Lcom/google/android/gms/internal/zzdtb;)V
    .registers 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdtb;->zzhq()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlxd:I

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdtj$zzb;I)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdtj$zzb;->zzfz(I)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdtj$zzb;Lcom/google/android/gms/internal/zzdtb;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdtj$zzb;->zza(Lcom/google/android/gms/internal/zzdtb;)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdtj$zzb;Lcom/google/android/gms/internal/zzdtt;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdtj$zzb;->zza(Lcom/google/android/gms/internal/zzdtt;)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/zzdtj$zzb;Ljava/lang/String;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzdtj$zzb;->zzoi(Ljava/lang/String;)V

    return-void
.end method

.method private final zza(Lcom/google/android/gms/internal/zzdtt;)V
    .registers 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzdtt;->zzhq()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlwr:I

    return-void
.end method

.method public static zzbpp()Lcom/google/android/gms/internal/zzdtj$zzb$zza;
    .registers 3

    sget-object v0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlxi:Lcom/google/android/gms/internal/zzdtj$zzb;

    sget v1, Lcom/google/android/gms/internal/zzffu$zzg;->zzphj:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdtj$zzb;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzffu$zza;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/zzffu$zza;->zza(Lcom/google/android/gms/internal/zzffu;)Lcom/google/android/gms/internal/zzffu$zza;

    check-cast v1, Lcom/google/android/gms/internal/zzdtj$zzb$zza;

    return-object v1
.end method

.method public static zzbpq()Lcom/google/android/gms/internal/zzdtj$zzb;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlxi:Lcom/google/android/gms/internal/zzdtj$zzb;

    return-object v0
.end method

.method public static synthetic zzbpr()Lcom/google/android/gms/internal/zzdtj$zzb;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlxi:Lcom/google/android/gms/internal/zzdtj$zzb;

    return-object v0
.end method

.method private final zzfz(I)V
    .registers 2

    iput p1, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlxe:I

    return-void
.end method

.method private final zzoi(Ljava/lang/String;)V
    .registers 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlwa:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    sget-object v0, Lcom/google/android/gms/internal/zzdtk;->zzbbi:[I

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    aget p1, v0, p1

    const/4 v0, 0x0

    const/4 v2, 0x0

    packed-switch p1, :pswitch_data_104

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
    sget-object p1, Lcom/google/android/gms/internal/zzdtj$zzb;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p1, :cond_30

    const-class p1, Lcom/google/android/gms/internal/zzdtj$zzb;

    monitor-enter p1

    :try_start_1e
    sget-object p2, Lcom/google/android/gms/internal/zzdtj$zzb;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    if-nez p2, :cond_2b

    new-instance p2, Lcom/google/android/gms/internal/zzffu$zzb;

    sget-object p3, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlxi:Lcom/google/android/gms/internal/zzdtj$zzb;

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/zzffu$zzb;-><init>(Lcom/google/android/gms/internal/zzffu;)V

    sput-object p2, Lcom/google/android/gms/internal/zzdtj$zzb;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

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
    sget-object p1, Lcom/google/android/gms/internal/zzdtj$zzb;->zzbbk:Lcom/google/android/gms/internal/zzfhk;

    return-object p1

    :pswitch_33
    check-cast p2, Lcom/google/android/gms/internal/zzffb;

    check-cast p3, Lcom/google/android/gms/internal/zzffm;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_3a
    :goto_3a
    if-nez v2, :cond_99

    :try_start_3c
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcvt()I

    move-result p1

    if-eqz p1, :cond_75

    const/16 p3, 0xa

    if-eq p1, p3, :cond_6e

    const/16 p3, 0x10

    if-eq p1, p3, :cond_67

    const/16 p3, 0x18

    if-eq p1, p3, :cond_60

    const/16 p3, 0x20

    if-eq p1, p3, :cond_59

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzffu;->zza(ILcom/google/android/gms/internal/zzffb;)Z

    move-result p1

    if-nez p1, :cond_3a

    goto :goto_75

    :cond_59
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwd()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlwr:I

    goto :goto_3a

    :cond_60
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwc()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlxe:I

    goto :goto_3a

    :cond_67
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwd()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlxd:I

    goto :goto_3a

    :cond_6e
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzffb;->zzcwa()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlwa:Ljava/lang/String;
    :try_end_74
    .catch Lcom/google/android/gms/internal/zzfge; {:try_start_3c .. :try_end_74} :catch_8d
    .catch Ljava/io/IOException; {:try_start_3c .. :try_end_74} :catch_79
    .catchall {:try_start_3c .. :try_end_74} :catchall_77

    goto :goto_3a

    :cond_75
    :goto_75
    const/4 v2, 0x1

    goto :goto_3a

    :catchall_77
    move-exception p1

    goto :goto_98

    :catch_79
    move-exception p1

    :try_start_7a
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance p3, Lcom/google/android/gms/internal/zzfge;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/zzfge;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_8d
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/zzfge;->zzi(Lcom/google/android/gms/internal/zzfhe;)Lcom/google/android/gms/internal/zzfge;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_98
    .catchall {:try_start_7a .. :try_end_98} :catchall_77

    :goto_98
    throw p1

    :cond_99
    :pswitch_99
    sget-object p1, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlxi:Lcom/google/android/gms/internal/zzdtj$zzb;

    return-object p1

    :pswitch_9c
    check-cast p2, Lcom/google/android/gms/internal/zzffu$zzh;

    check-cast p3, Lcom/google/android/gms/internal/zzdtj$zzb;

    iget-object p1, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlwa:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlwa:Ljava/lang/String;

    iget-object v3, p3, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlwa:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v1

    iget-object v4, p3, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlwa:Ljava/lang/String;

    invoke-interface {p2, p1, v0, v3, v4}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlwa:Ljava/lang/String;

    iget p1, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlxd:I

    if-eqz p1, :cond_be

    const/4 v0, 0x1

    goto :goto_bf

    :cond_be
    const/4 v0, 0x0

    :goto_bf
    iget v3, p3, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlxd:I

    if-eqz v3, :cond_c5

    const/4 v4, 0x1

    goto :goto_c6

    :cond_c5
    const/4 v4, 0x0

    :goto_c6
    invoke-interface {p2, v0, p1, v4, v3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZIZI)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlxd:I

    iget p1, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlxe:I

    if-eqz p1, :cond_d2

    const/4 v0, 0x1

    goto :goto_d3

    :cond_d2
    const/4 v0, 0x0

    :goto_d3
    iget v3, p3, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlxe:I

    if-eqz v3, :cond_d9

    const/4 v4, 0x1

    goto :goto_da

    :cond_d9
    const/4 v4, 0x0

    :goto_da
    invoke-interface {p2, v0, p1, v4, v3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZIZI)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlxe:I

    iget p1, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlwr:I

    if-eqz p1, :cond_e6

    const/4 v0, 0x1

    goto :goto_e7

    :cond_e6
    const/4 v0, 0x0

    :goto_e7
    iget p3, p3, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlwr:I

    if-eqz p3, :cond_ec

    goto :goto_ed

    :cond_ec
    const/4 v1, 0x0

    :goto_ed
    invoke-interface {p2, v0, p1, v1, p3}, Lcom/google/android/gms/internal/zzffu$zzh;->zza(ZIZI)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlwr:I

    return-object p0

    :pswitch_f4
    new-instance p1, Lcom/google/android/gms/internal/zzdtj$zzb$zza;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/zzdtj$zzb$zza;-><init>(Lcom/google/android/gms/internal/zzdtk;)V

    return-object p1

    :pswitch_fa
    return-object v0

    :pswitch_fb
    sget-object p1, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlxi:Lcom/google/android/gms/internal/zzdtj$zzb;

    return-object p1

    :pswitch_fe
    new-instance p1, Lcom/google/android/gms/internal/zzdtj$zzb;

    invoke-direct {p1}, Lcom/google/android/gms/internal/zzdtj$zzb;-><init>()V

    return-object p1

    :pswitch_data_104
    .packed-switch 0x1
        :pswitch_fe
        :pswitch_fb
        :pswitch_fa
        :pswitch_f4
        :pswitch_9c
        :pswitch_33
        :pswitch_99
        :pswitch_17
        :pswitch_12
        :pswitch_11
    .end packed-switch
.end method

.method public final zza(Lcom/google/android/gms/internal/zzffg;)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlwa:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_e

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlwa:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/zzffg;->zzn(ILjava/lang/String;)V

    :cond_e
    iget v0, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlxd:I

    sget-object v1, Lcom/google/android/gms/internal/zzdtb;->zzlwl:Lcom/google/android/gms/internal/zzdtb;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzdtb;->zzhq()I

    move-result v1

    if-eq v0, v1, :cond_1e

    iget v0, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlxd:I

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zzaa(II)V

    :cond_1e
    iget v0, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlxe:I

    if-eqz v0, :cond_26

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zzab(II)V

    :cond_26
    iget v0, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlwr:I

    sget-object v1, Lcom/google/android/gms/internal/zzdtt;->zzlxs:Lcom/google/android/gms/internal/zzdtt;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzdtt;->zzhq()I

    move-result v1

    if-eq v0, v1, :cond_36

    iget v0, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlwr:I

    const/4 v1, 0x4

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/zzffg;->zzaa(II)V

    :cond_36
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzfio;->zza(Lcom/google/android/gms/internal/zzffg;)V

    return-void
.end method

.method public final zzho()I
    .registers 4

    iget v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    return v0

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlwa:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_17

    const/4 v0, 0x1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlwa:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzffg;->zzo(ILjava/lang/String;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_17
    iget v0, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlxd:I

    sget-object v2, Lcom/google/android/gms/internal/zzdtb;->zzlwl:Lcom/google/android/gms/internal/zzdtb;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzdtb;->zzhq()I

    move-result v2

    if-eq v0, v2, :cond_29

    const/4 v0, 0x2

    iget v2, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlxd:I

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzffg;->zzag(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_29
    iget v0, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlxe:I

    if-eqz v0, :cond_33

    const/4 v2, 0x3

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzffg;->zzae(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_33
    iget v0, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlwr:I

    sget-object v2, Lcom/google/android/gms/internal/zzdtt;->zzlxs:Lcom/google/android/gms/internal/zzdtt;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzdtt;->zzhq()I

    move-result v2

    if-eq v0, v2, :cond_45

    const/4 v0, 0x4

    iget v2, p0, Lcom/google/android/gms/internal/zzdtj$zzb;->zzlwr:I

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/zzffg;->zzag(II)I

    move-result v0

    add-int/2addr v1, v0

    :cond_45
    iget-object v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgr:Lcom/google/android/gms/internal/zzfio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzfio;->zzho()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/zzffu;->zzpgs:I

    return v0
.end method
