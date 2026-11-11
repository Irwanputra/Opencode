.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ;
.super Ljava/lang/Thread;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ$げつ〴ぬぐ;
    }
.end annotation


# static fields
.field public static 〳ぜぞぜべっ:I

.field public static ぁごぐすすぃ:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector<",
            "L\u3066\u305c\u304d\u307d\u304f/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050/\u3078\u306c\u3034\u3065\u305e/\u307a\u3041\u3042\u306d\u3058/\u3052\u3064\u3034\u306c\u3050$\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation
.end field

.field public static final なぎぱいぢぎ:Ljava/lang/String;


# instance fields
.field public 〺つふすそ:Z

.field public くし〴〺ぅ:Ljava/net/ServerSocket;

.field public づざかべべ:I

.field public びぐびあび:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/〺つふすそ;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const-class v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/lang/String;

    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    sput-object v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ;->ぁごぐすすぃ:Ljava/util/Vector;

    const/16 v0, 0x1b9f

    sput v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ;->〳ぜぞぜべっ:I

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    return-void
.end method

.method public static 〺つふすそ(Ljava/lang/Exception;)V
    .registers 4

    invoke-virtual {p0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Exception;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p0

    const/4 v1, 0x0

    :goto_9
    array-length v2, p0

    if-ge v1, v2, :cond_22

    const-string v2, "\r\n"

    invoke-static {v0, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->いいにぽつ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_22
    return-void
.end method

.method public static げつ〴ぬぐ(Ljava/lang/String;)V
    .registers 6

    .line 1
    sget-object v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/lang/String;

    const-string v1, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    new-instance v2, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    const-string v4, "\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\u001dg;JjmH`mA`oN4hK3=@1mNd>Nf=\u001cf;Hc"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 9

    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ;->びぐびあび:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/〺つふすそ;

    if-nez v0, :cond_b

    new-instance v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/〺つふすそ;

    invoke-direct {v0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/〺つふすそ;-><init>()V

    iput-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ;->びぐびあび:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/〺つふすそ;

    :cond_b
    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ;->びぐびあび:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/〺つふすそ;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ;->〺つふすそ:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_15
    const/4 v3, 0x5

    if-ge v2, v3, :cond_2f

    :try_start_18
    new-instance v3, Ljava/net/ServerSocket;

    sget v4, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ;->〳ぜぞぜべっ:I

    invoke-direct {v3, v4}, Ljava/net/ServerSocket;-><init>(I)V

    iput-object v3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/net/ServerSocket;
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_21} :catch_22

    goto :goto_2f

    :catch_22
    nop

    const/4 v3, 0x4

    if-ne v2, v3, :cond_27

    return-void

    :cond_27
    const-wide/16 v3, 0x3e8

    :try_start_29
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2c
    .catch Ljava/lang/Exception; {:try_start_29 .. :try_end_2c} :catch_2c

    :catch_2c
    add-int/lit8 v2, v2, 0x1

    goto :goto_15

    :cond_2f
    :goto_2f
    :try_start_2f
    iget-object v2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/net/ServerSocket;

    invoke-virtual {v2}, Ljava/net/ServerSocket;->isClosed()Z

    move-result v2

    if-nez v2, :cond_135

    iget-object v2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/net/ServerSocket;

    invoke-virtual {v2}, Ljava/net/ServerSocket;->accept()Ljava/net/Socket;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v3

    const-string v4, "M4:\u001d4gH0=\u001adoO0oK6>@c9\u0019`mL7j\u001bkhOg"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_9e

    invoke-virtual {v2}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v3

    const-string v4, "H39\u001b3oH4fA6n\u001a`jKajMe<Og:N0oJcg\u001dg"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_9e

    invoke-virtual {v2}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v3

    const-string v4, "\u001d1:Lgn\u001e3>Ljm\u001abnN7j\u001bcgM1:I1iI3oNc"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_9e

    invoke-virtual {v2}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v3

    const-string v4, "\u0019b<\u001edg\u0019dhHf9M1oA7kAd:Lj=O0n\u001cd>\u001df"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_9e

    goto :goto_2f

    :cond_9e
    invoke-virtual {v2}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v3

    .line 1
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    const-string v5, "K7kM7<\u0019d>\u001c1<\u00194f\u001e4:O79Iji\u001cdkAbo\u001dk"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    invoke-virtual {v3, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v4, v3

    const/4 v3, 0x3

    if-ne v4, v3, :cond_dd

    .line 2
    sget-object v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ;->ぁごぐすすぃ:Ljava/util/Vector;

    invoke-virtual {v3}, Ljava/util/Vector;->size()I

    move-result v3

    if-nez v3, :cond_cc

    iput v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ;->づざかべべ:I

    :cond_cc
    new-instance v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ$げつ〴ぬぐ;

    iget v4, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ;->づざかべべ:I

    invoke-direct {v3, v2, v1, v4}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ$げつ〴ぬぐ;-><init>(Ljava/net/Socket;ZI)V

    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    iget v2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ;->づざかべべ:I

    add-int/2addr v2, v0

    iput v2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ;->づざかべべ:I

    goto/16 :goto_2f

    :cond_dd
    sget-object v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v5, Ljava/text/SimpleDateFormat;

    const-string v6, "\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v6, Ljava/util/Date;

    invoke-direct {v6}, Ljava/util/Date;-><init>()V

    invoke-virtual {v5, v6}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019g=\u00190=H0fAcn\u001d7m\u0019cl\u001ael\u001dcl\u001b4hM6n\u001eafL`m\u001c6:\u001e4f\u001def\u001ejjH09L`mMj9IjfJj=Aem"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ざとぅぼこ〺(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_12f
    .catch Ljava/lang/Exception; {:try_start_2f .. :try_end_12f} :catch_131

    goto/16 :goto_2f

    :catch_131
    move-exception v0

    invoke-static {v0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ;->〺つふすそ(Ljava/lang/Exception;)V

    :cond_135
    return-void
.end method
