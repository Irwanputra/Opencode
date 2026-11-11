.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/げつ〴ぬぐ$〺つふすそ$げつ〴ぬぐ;
.super Ljava/security/SecureRandomSpi;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/げつ〴ぬぐ$〺つふすそ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# static fields
.field public static final くし〴〺ぅ:Ljava/io/File;

.field public static づざかべべ:Ljava/io/DataInputStream;

.field public static なぎぱいぢぎ:Ljava/io/OutputStream;

.field public static final びぐびあび:Ljava/lang/Object;


# instance fields
.field public 〺つふすそ:Z


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    new-instance v0, Ljava/io/File;

    const-string v1, "A4n\u001cb<\u001egg\u001ab9\u001cc:Oj<\u001bbnI`kAefOenM1"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sput-object v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/げつ〴ぬぐ$〺つふすそ$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/io/File;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/げつ〴ぬぐ$〺つふすそ$げつ〴ぬぐ;->びぐびあび:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/security/SecureRandomSpi;-><init>()V

    return-void
.end method


# virtual methods
.method public engineGenerateSeed(I)[B
    .registers 2

    new-array p1, p1, [B

    invoke-virtual {p0, p1}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/げつ〴ぬぐ$〺つふすそ$げつ〴ぬぐ;->engineNextBytes([B)V

    return-object p1
.end method

.method public engineNextBytes([B)V
    .registers 5

    iget-boolean v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/げつ〴ぬぐ$〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Z

    if-nez v0, :cond_b

    .line 1
    invoke-static {}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/げつ〴ぬぐ$〺つふすそ;->〺つふすそ()[B

    move-result-object v0

    .line 2
    invoke-virtual {p0, v0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/げつ〴ぬぐ$〺つふすそ$げつ〴ぬぐ;->engineSetSeed([B)V

    :cond_b
    :try_start_b
    sget-object v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/げつ〴ぬぐ$〺つふすそ$げつ〴ぬぐ;->びぐびあび:Ljava/lang/Object;

    monitor-enter v0
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_e} :catch_1f

    :try_start_e
    invoke-virtual {p0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/げつ〴ぬぐ$〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ()Ljava/io/DataInputStream;

    move-result-object v1

    monitor-exit v0
    :try_end_13
    .catchall {:try_start_e .. :try_end_13} :catchall_1c

    :try_start_13
    monitor-enter v1
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_14} :catch_1f

    :try_start_14
    invoke-virtual {v1, p1}, Ljava/io/DataInputStream;->readFully([B)V

    monitor-exit v1

    return-void

    :catchall_19
    move-exception p1

    monitor-exit v1
    :try_end_1b
    .catchall {:try_start_14 .. :try_end_1b} :catchall_19

    :try_start_1b
    throw p1
    :try_end_1c
    .catch Ljava/io/IOException; {:try_start_1b .. :try_end_1c} :catch_1f

    :catchall_1c
    move-exception p1

    :try_start_1d
    monitor-exit v0
    :try_end_1e
    .catchall {:try_start_1d .. :try_end_1e} :catchall_1c

    :try_start_1e
    throw p1
    :try_end_1f
    .catch Ljava/io/IOException; {:try_start_1e .. :try_end_1f} :catch_1f

    :catch_1f
    move-exception p1

    new-instance v0, Ljava/lang/SecurityException;

    const-string v1, "M`mLj>OcgMkl\u001aei\u001d3h\u001dbnJ79\u001cfnMfoI7:\u001bdj@am\u001cgo\u001919@0nH3lAdk\u001d3>Nko\u001a3hK"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/げつ〴ぬぐ$〺つふすそ$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/io/File;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public engineSetSeed([B)V
    .registers 6

    const/4 v0, 0x1

    :try_start_1
    sget-object v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/げつ〴ぬぐ$〺つふすそ$げつ〴ぬぐ;->びぐびあび:Ljava/lang/Object;

    monitor-enter v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_4} :catch_28
    .catchall {:try_start_1 .. :try_end_4} :catchall_26

    .line 1
    :try_start_4
    monitor-enter v1
    :try_end_5
    .catchall {:try_start_4 .. :try_end_5} :catchall_1f

    :try_start_5
    sget-object v2, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/げつ〴ぬぐ$〺つふすそ$げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/io/OutputStream;

    if-nez v2, :cond_12

    new-instance v2, Ljava/io/FileOutputStream;

    sget-object v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/げつ〴ぬぐ$〺つふすそ$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/io/File;

    invoke-direct {v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    sput-object v2, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/げつ〴ぬぐ$〺つふすそ$げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/io/OutputStream;

    :cond_12
    sget-object v2, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/げつ〴ぬぐ$〺つふすそ$げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/io/OutputStream;

    monitor-exit v1
    :try_end_15
    .catchall {:try_start_5 .. :try_end_15} :catchall_21

    .line 2
    :try_start_15
    monitor-exit v1
    :try_end_16
    .catchall {:try_start_15 .. :try_end_16} :catchall_1f

    :try_start_16
    invoke-virtual {v2, p1}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V
    :try_end_1c
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_1c} :catch_28
    .catchall {:try_start_16 .. :try_end_1c} :catchall_26

    :goto_1c
    iput-boolean v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/げつ〴ぬぐ$〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Z

    goto :goto_43

    :catchall_1f
    move-exception p1

    goto :goto_24

    :catchall_21
    move-exception p1

    .line 3
    :try_start_22
    monitor-exit v1
    :try_end_23
    .catchall {:try_start_22 .. :try_end_23} :catchall_21

    :try_start_23
    throw p1

    .line 4
    :goto_24
    monitor-exit v1
    :try_end_25
    .catchall {:try_start_23 .. :try_end_25} :catchall_1f

    :try_start_25
    throw p1
    :try_end_26
    .catch Ljava/io/IOException; {:try_start_25 .. :try_end_26} :catch_28
    .catchall {:try_start_25 .. :try_end_26} :catchall_26

    :catchall_26
    move-exception p1

    goto :goto_44

    :catch_28
    :try_start_28
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u0019g=\u001bdm\u001aj9A0:\u001efk\u001cflLem\u001eg:\u001djo\u001b3k\u00193gO7fO0;\u001b`g\u001ce9Hko\u001c39\u001abhKam\u0019k=Jfm\u001d"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/げつ〴ぬぐ$〺つふすそ$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/io/File;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_42
    .catchall {:try_start_28 .. :try_end_42} :catchall_26

    goto :goto_1c

    :goto_43
    return-void

    :goto_44
    iput-boolean v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/げつ〴ぬぐ$〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Z

    goto :goto_48

    :goto_47
    throw p1

    :goto_48
    goto :goto_47
.end method

.method public final げつ〴ぬぐ()Ljava/io/DataInputStream;
    .registers 6

    sget-object v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/げつ〴ぬぐ$〺つふすそ$げつ〴ぬぐ;->びぐびあび:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    sget-object v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/げつ〴ぬぐ$〺つふすそ$げつ〴ぬぐ;->づざかべべ:Ljava/io/DataInputStream;
    :try_end_5
    .catchall {:try_start_3 .. :try_end_5} :catchall_49

    if-nez v1, :cond_45

    :try_start_7
    new-instance v1, Ljava/io/DataInputStream;

    new-instance v2, Ljava/io/FileInputStream;

    sget-object v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/げつ〴ぬぐ$〺つふすそ$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/io/File;

    invoke-direct {v2, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    sput-object v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/げつ〴ぬぐ$〺つふすそ$げつ〴ぬぐ;->づざかべべ:Ljava/io/DataInputStream;
    :try_end_15
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_15} :catch_16
    .catchall {:try_start_7 .. :try_end_15} :catchall_49

    goto :goto_45

    :catch_16
    move-exception v1

    :try_start_17
    new-instance v2, Ljava/lang/SecurityException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "J3fJa=\u001da>\u001b19\u001ae:\u001c4l\u0019`i\u001d1=Ia=Ngk@4"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/げつ〴ぬぐ$〺つふすそ$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/io/File;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "\u001bchM6mJfmAcnHc;\u001ef9\u001d7gM3k@1;\u001agi\u001ec"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_45
    :goto_45
    sget-object v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/てぜきぽく/げつ〴ぬぐ$〺つふすそ$げつ〴ぬぐ;->づざかべべ:Ljava/io/DataInputStream;

    monitor-exit v0

    return-object v1

    :catchall_49
    move-exception v1

    monitor-exit v0
    :try_end_4b
    .catchall {:try_start_17 .. :try_end_4b} :catchall_49

    throw v1
.end method
