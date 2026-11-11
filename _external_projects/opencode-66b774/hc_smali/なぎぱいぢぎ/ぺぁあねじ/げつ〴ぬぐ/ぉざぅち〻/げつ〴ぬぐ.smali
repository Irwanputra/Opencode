.class public Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public げつ〴ぬぐ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .registers 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "SSH-2.0-easyPro\r\n"

    const-string v1, "\u001c0<Jgf\u001b0<\u001dgf\u001db=\u001b`kL`m@a>Nkh\u001ecnH7"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p2}, Ljava/io/OutputStream;->flush()V

    const/16 p2, 0x400

    new-array p2, p2, [B

    const/4 v0, 0x0

    const/4 v2, 0x0

    :goto_1f
    const v3, 0x3b9ac9fe

    const-string v4, "O3i\u001cd>Odh\u001aegL3fA4iHkl\u001cj<Ad<@knN4"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-ge v2, v3, :cond_7f

    invoke-static {p1, p2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/io/InputStream;[B)I

    move-result v3

    new-instance v5, Ljava/lang/String;

    invoke-direct {v5, p2, v0, v3, v1}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    iput-object v5, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-virtual {v5, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7c

    const-string p1, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    new-instance p2, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v1, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v0, "\u001dg;JjmH`mA`oN4hK3=@1mNd>Nf=\u001cf;Hc"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, p1, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぶひせが(Ljava/text/SimpleDateFormat;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    iget-object p2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, ""

    invoke-static {p2, p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_7f

    :cond_7c
    add-int/lit8 v2, v2, 0x1

    goto :goto_1f

    :cond_7f
    :goto_7f
    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-virtual {p1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_c8

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    const-string p2, "\u001ae9IclAd:\u001ccg\u0019elK0gKcf\u001a1lOdnNd;A7"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_9e

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    const/16 p2, 0x9

    goto :goto_b4

    :cond_9e
    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    const-string p2, "Kk9J1kAd:\u001c`nHk:\u0019jm\u001a4fOb:NgnM7fMa"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_b8

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    const/16 p2, 0x8

    :goto_b4
    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    return-void

    :cond_b8
    new-instance p1, Ljava/io/IOException;

    const-string p2, "K`hJ4h\u001eak\u001de>N1g\u001bki\u001bd9\u001dk<Me:L`:\u0019b:Ab:\u001cgnIkoA6;@3=\u001d`l\u001cghHd:LgjI`l\u001a6k\u001bk;K1o\u001de:Jc:J39Ajg\u0019k<MamM4m\u001c1iO`9O7=Aa<K4g\u001bj;Kgl@`>N6fM`i@3=@1"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c8
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Malformed server identification string. There was no line starting with \'SSH-\' amongst the first 50 lines."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_d1

    :goto_d0
    throw p1

    :goto_d1
    goto :goto_d0
.end method

.method public static final くし〴〺ぅ(Ljava/io/InputStream;[B)I
    .registers 9

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_4
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_50

    add-int/lit8 v5, v0, 0x1

    int-to-byte v6, v4

    aput-byte v6, p1, v0

    const/16 v0, 0xd

    if-ne v4, v0, :cond_17

    const/4 v2, 0x1

    :goto_15
    move v0, v5

    goto :goto_4

    :cond_17
    const/16 v0, 0xa

    if-ne v4, v0, :cond_1c

    return v3

    :cond_1c
    if-eq v2, v1, :cond_40

    add-int/lit8 v3, v3, 0x1

    array-length v0, p1

    if-ge v5, v0, :cond_24

    goto :goto_15

    :cond_24
    new-instance p0, Ljava/io/IOException;

    const-string v0, "\u0019ffK6g@dmA4l\u001dam\u001e1>\u001ccf\u001dchNg>\u001a4<\u001c3lMdm\u001dk9I6m\u001ejgJahO1k\u001a7:O3jO4<I3=\u001e4fHk>\u001a3mN6lK0:\u0019kl\u001ccfKaf\u0019alL1<Hgi"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    array-length p1, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_40
    new-instance p0, Ljava/io/IOException;

    const-string p1, "\u001d0<M6m\u001ej9JehJc;\u001d6kN3;Kd9\u001c1i\u001eaf\u001bbgM`fH`l\u001ekjHkfM4f\u001eefLfk\u001ccf\u001a4f\u001e`i\u001e4gI3l@bh\u001aegKbm\u001eflA7mAgjA1n@4fJ4j\u001ck>Mel\u001cg=Abg\u001cd;L1iIeh\u001e3f\u001cfoLdjLbfOeg\u001cgiHbh\u001c6=\u001ce=\u001b7:\u001a`oO7h@do\u001ck=O"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_50
    new-instance p0, Ljava/io/IOException;

    const-string p1, "N`gN3n\u001ajfOen@c<\u001d0gLao\u0019ko\u001e0=Ka;Mb9KgmM4:Me<Ib<\u001d0jNg:A`kKc9\u001c0:Lj<K"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_61

    :goto_60
    throw p0

    :goto_61
    goto :goto_60
.end method


# virtual methods
.method public 〺つふすそ()[B
    .registers 3

    :try_start_0
    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    const-string v1, "\u001c0<Jgf\u001b0<\u001dgf\u001db=\u001b`kL`m@a>Nkh\u001ecnH7"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0
    :try_end_10
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_10} :catch_11

    goto :goto_17

    :catch_11
    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    :goto_17
    return-object v0
.end method

.method public げつ〴ぬぐ()[B
    .registers 3

    const-string v0, "O1l\u001ea9K6>Jf>I3<Kjm\u001eakH7o\u001aaiLc>@k"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :try_start_a
    const-string v1, "\u001c0<Jgf\u001b0<\u001dgf\u001db=\u001b`kL`m@a>Nkh\u001ecnH7"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0
    :try_end_18
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_a .. :try_end_18} :catch_19

    goto :goto_1d

    :catch_19
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    :goto_1d
    return-object v0
.end method
