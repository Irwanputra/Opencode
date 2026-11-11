.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public 〺つふすそ:Ljava/net/Socket;

.field public くし〴〺ぅ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/くし〴〺ぅ;


# direct methods
.method public constructor <init>(Ljava/net/Socket;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/げつ〴ぬぐ;

    iput-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/げつ〴ぬぐ;->〺つふすそ:Ljava/net/Socket;

    return-void
.end method


# virtual methods
.method public run()V
    .registers 20

    move-object/from16 v1, p0

    const-string v0, "K7kM7<\u0019d>\u001c1<\u00194f\u001e4:O79Iji\u001cdkAbo\u001dk"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :try_start_c
    iget-object v2, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/げつ〴ぬぐ;->〺つふすそ:Ljava/net/Socket;

    invoke-virtual {v2}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    iget-object v3, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/げつ〴ぬぐ;->〺つふすそ:Ljava/net/Socket;

    invoke-virtual {v3}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v3

    const v4, 0x19000

    new-array v5, v4, [B

    const/4 v6, 0x3

    const/4 v7, 0x0

    invoke-virtual {v2, v5, v7, v6}, Ljava/io/InputStream;->read([BII)I

    const/4 v8, 0x2

    new-array v9, v8, [B

    const/4 v10, 0x5

    aput-byte v10, v9, v7

    const/4 v11, 0x1

    aput-byte v7, v9, v11

    const/16 v12, 0xa

    new-array v13, v12, [B

    invoke-virtual {v3, v9}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V

    invoke-virtual {v2, v5, v7, v12}, Ljava/io/InputStream;->read([BII)I

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v14, 0x4

    aget-byte v15, v5, v14

    and-int/lit16 v15, v15, 0xff

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-byte v15, v5, v10

    and-int/lit16 v15, v15, 0xff

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v15, 0x6

    aget-byte v4, v5, v15

    and-int/lit16 v4, v4, 0xff

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x7

    aget-byte v4, v5, v0

    and-int/lit16 v4, v4, 0xff

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/16 v9, 0x8

    aget-byte v12, v5, v9

    and-int/lit16 v12, v12, 0xff

    mul-int/lit16 v12, v12, 0x100

    const/16 v16, 0x9

    aget-byte v9, v5, v16

    and-int/lit16 v9, v9, 0xff

    add-int/2addr v12, v9

    new-instance v9, Ljava/net/Socket;

    invoke-direct {v9, v4, v12}, Ljava/net/Socket;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v9}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    invoke-virtual {v9}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v12

    invoke-virtual {v9}, Ljava/net/Socket;->getLocalAddress()Ljava/net/InetAddress;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v17

    invoke-virtual {v9}, Ljava/net/Socket;->getLocalPort()I

    move-result v0

    aput-byte v10, v13, v7

    aput-byte v7, v13, v11

    aput-byte v7, v13, v8

    aput-byte v11, v13, v6

    aget-byte v18, v17, v7

    aput-byte v18, v13, v14

    aget-byte v11, v17, v11

    aput-byte v11, v13, v10

    aget-byte v8, v17, v8

    aput-byte v8, v13, v15

    aget-byte v6, v17, v6

    const/4 v8, 0x7

    aput-byte v6, v13, v8

    shr-int/lit8 v6, v0, 0x8

    int-to-byte v6, v6

    const/16 v8, 0x8

    aput-byte v6, v13, v8

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    aput-byte v0, v13, v16

    const/16 v0, 0xa

    invoke-virtual {v3, v13, v7, v0}, Ljava/io/OutputStream;->write([BII)V

    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V

    new-instance v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/くし〴〺ぅ;

    iget-object v6, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/げつ〴ぬぐ;->〺つふすそ:Ljava/net/Socket;

    invoke-direct {v0, v4, v3, v6, v9}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/くし〴〺ぅ;-><init>(Ljava/io/InputStream;Ljava/io/OutputStream;Ljava/net/Socket;Ljava/net/Socket;)V

    iput-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/げつ〴ぬぐ;->くし〴〺ぅ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/くし〴〺ぅ;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :goto_cf
    const v3, 0x19000

    invoke-virtual {v2, v5, v7, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    if-lez v4, :cond_e5

    invoke-virtual {v1, v9, v4}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/net/Socket;I)V

    invoke-virtual {v12, v5, v7, v4}, Ljava/io/OutputStream;->write([BII)V

    invoke-virtual {v0, v5, v7, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    invoke-virtual {v12}, Ljava/io/OutputStream;->flush()V
    :try_end_e4
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_e4} :catch_f6
    .catchall {:try_start_c .. :try_end_e4} :catchall_ed

    goto :goto_cf

    :cond_e5
    :try_start_e5
    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/げつ〴ぬぐ;->〺つふすそ:Ljava/net/Socket;

    if-eqz v0, :cond_fb

    :goto_e9
    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_ec
    .catch Ljava/io/IOException; {:try_start_e5 .. :try_end_ec} :catch_fb

    goto :goto_fb

    :catchall_ed
    move-exception v0

    :try_start_ee
    iget-object v2, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/げつ〴ぬぐ;->〺つふすそ:Ljava/net/Socket;

    if-eqz v2, :cond_f5

    invoke-virtual {v2}, Ljava/net/Socket;->close()V
    :try_end_f5
    .catch Ljava/io/IOException; {:try_start_ee .. :try_end_f5} :catch_f5

    :catch_f5
    :cond_f5
    throw v0

    :catch_f6
    :try_start_f6
    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/げつ〴ぬぐ;->〺つふすそ:Ljava/net/Socket;
    :try_end_f8
    .catch Ljava/io/IOException; {:try_start_f6 .. :try_end_f8} :catch_fb

    if-eqz v0, :cond_fb

    goto :goto_e9

    :catch_fb
    :cond_fb
    :goto_fb
    return-void
.end method

.method public final げつ〴ぬぐ(Ljava/net/Socket;I)V
    .registers 7

    const-string v0, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    const-string v3, "\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v2, "Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019ggH3hL6=@fgJkh\u001aan@jjAehO1>Keh\u001e0:\u001e"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぶひせが(Ljava/text/SimpleDateFormat;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    const v2, 0x7f110052

    .line 2
    invoke-virtual {v1, v2}, Landroid/app/Application;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\u00194i\u001afj@g>\u0019efH4jHbk\u001bdiKflLkiK1;Ldi\u001d3gIc;\u0019b;M6i\u001ccn\u001b3;\u00194nAk>Af>O4m\u001a"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/net/Socket;->getPort()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "\u001b7oNa:Hg>\u001ag9H1fMgf\u001ba<NfmLfgL6jJ`"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/げつ〴ぬぐ;->〺つふすそ:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object p1

    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "NdkJ3m\u001bgoIdgA1k@b=\u001dcmAgg\u001dbi\u001d7m\u0019b"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    int-to-long p1, p2

    new-instance v1, Ljava/util/Locale;

    const-string v2, "\u001ej<\u001ebmJegI4:I4>Hc>\u0019j9Jd:K1g@d:J3"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    invoke-static {p1, p2, v1}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/なぎぱいぢぎ;->〺つふすそ(JLjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "O79A6hKcf\u001b3lA3f\u00194gJji\u0019km@0oJ3=O4"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
