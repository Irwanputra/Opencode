.class public Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ$〺つふすそ;,
        Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ$くし〴〺ぅ;
    }
.end annotation


# static fields
.field public static final ぇぬぎばつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

.field public static final ぉざぅち〻:I


# instance fields
.field public 〳ぜぞぜべっ:Z

.field public 〺つふすそ:Ljava/lang/Thread;

.field public final ぁごぐすすぃ:Ljava/lang/Object;

.field public いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;

.field public おぐぴう〸ず:Z

.field public final くし〴〺ぅ:Ljava/lang/String;

.field public final げつ〴ぬぐ:Ljava/util/Vector;

.field public づざかべべ:I

.field public てぜきぽく:Ljava/util/Vector;

.field public なぎぱいぢぎ:Ljava/net/Socket;

.field public のぷのちつ:Ljava/lang/Thread;

.field public びぐびあび:Ljava/lang/String;

.field public へぬ〴づぞ:Ljava/util/Vector;

.field public ぺぁあねじ:Ljava/lang/Throwable;

.field public ぺふねづ〺:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    const-class v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;

    .line 1
    new-instance v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    invoke-direct {v1, v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;-><init>(Ljava/lang/Class;)V

    .line 2
    sput-object v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->ぇぬぎばつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\u001939Je;\u001c0o\u0019boIcn\u0019ehI3g\u0019gjA7k\u001benOf"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/high16 v1, 0x10000

    invoke-static {v0, v1}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sput v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->ぉざぅち〻:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .registers 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->げつ〴ぬぐ:Ljava/util/Vector;

    const/4 v0, 0x0

    iput-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->〺つふすそ:Ljava/lang/Thread;

    new-instance v1, Ljava/net/Socket;

    invoke-direct {v1}, Ljava/net/Socket;-><init>()V

    iput-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->なぎぱいぢぎ:Ljava/net/Socket;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->ぁごぐすすぃ:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->〳ぜぞぜべっ:Z

    iput-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->ぺぁあねじ:Ljava/lang/Throwable;

    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->てぜきぽく:Ljava/util/Vector;

    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->へぬ〴づぞ:Ljava/util/Vector;

    iput-boolean v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->おぐぴう〸ず:Z

    iput-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->びぐびあび:Ljava/lang/String;

    iput p2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->づざかべべ:I

    iput-object p3, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->くし〴〺ぅ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public 〳ぜぞぜべっ(Lcom/trilead/ssh2/crypto/CryptoWishList;Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぺふねづ〺;Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/びぐびあび;IILjava/security/SecureRandom;Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/いいにぽつ;)V
    .registers 24

    move-object/from16 v9, p0

    move-object/from16 v0, p1

    move-object/from16 v10, p3

    move/from16 v1, p4

    move/from16 v2, p5

    move-object/from16 v3, p7

    .line 1
    sget-object v4, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ$げつ〴ぬぐ;

    const-string v5, "\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "N`hAjm\u001b39AblNc9\u001affK7h\u001cfm\u001b6mL6nAj"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/16 v8, 0xf

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-nez v3, :cond_b7

    .line 2
    :try_start_33
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 3
    move-object v4, v3

    check-cast v4, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v4

    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v3, v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    aget-object v3, v3, v11

    invoke-static {v3}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_94

    .line 4
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 5
    move-object v4, v3

    check-cast v4, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v4

    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v3, v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    aget-object v3, v3, v8

    invoke-static {v3}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_94

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v4, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    invoke-virtual {v4, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\u001c`:\u001d1gN6nN`=H6lAb;\u001d1nKb=\u001aeoA6lJj>@19\u001cehOg<Oe=Ij<\u001eg=N1>Nki@b=AgfAehIgf\u001akh\u001dcf\u001cj9\u001e`i\u001cfm@6k\u001ac=Oa>J3f"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v7, v3}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_92
    .catch Ljava/lang/Exception; {:try_start_33 .. :try_end_92} :catch_93

    goto :goto_94

    :catch_93
    nop

    :cond_94
    :goto_94
    iget-object v3, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->くし〴〺ぅ:Ljava/lang/String;

    if-eqz v3, :cond_a6

    invoke-virtual {v9, v3}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->くし〴〺ぅ(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v3

    iget-object v4, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->なぎぱいぢぎ:Ljava/net/Socket;

    new-instance v5, Ljava/net/InetSocketAddress;

    invoke-direct {v5, v3, v12}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-virtual {v4, v5}, Ljava/net/Socket;->bind(Ljava/net/SocketAddress;)V

    :cond_a6
    iget-object v3, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->びぐびあび:Ljava/lang/String;

    invoke-virtual {v9, v3}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->くし〴〺ぅ(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v3

    iget-object v4, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->なぎぱいぢぎ:Ljava/net/Socket;

    new-instance v5, Ljava/net/InetSocketAddress;

    iget v6, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->づざかべべ:I

    invoke-direct {v5, v3, v6}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    goto/16 :goto_3c6

    :cond_b7
    instance-of v12, v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;

    const/16 v14, 0x400

    if-eqz v12, :cond_3d0

    .line 6
    :try_start_bd
    sget-object v12, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 7
    move-object v15, v12

    check-cast v15, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v15}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v15

    check-cast v12, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v12, v15}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v12

    aget-object v12, v12, v11

    invoke-static {v12}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_11e

    .line 8
    sget-object v12, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 9
    move-object v15, v12

    check-cast v15, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v15}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v15

    check-cast v12, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v12, v15}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v12

    aget-object v8, v12, v8

    invoke-static {v8}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_11e

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v6, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v12

    invoke-direct {v6, v5, v12}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    invoke-virtual {v6, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\u001c`:\u001d1gN6nN`=H6lAb;\u001d1nKb=\u001aeoA6lJjgIfmKalNkh@e<\u001ak;@f>Aek\u001dfo@jn\u001b1gH"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v5}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_11c
    .catch Ljava/lang/Exception; {:try_start_bd .. :try_end_11c} :catch_11d

    goto :goto_11e

    :catch_11d
    nop

    :cond_11e
    :goto_11e
    check-cast v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;

    iget-object v5, v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ$げつ〴ぬぐ;

    const-string v6, "H7j\u001a`iL4=Jek\u001a6;\u001ecfO3n@e:@enNj>\u001cef\u001aj9\u00190fHclAfo\u001akfHg;\u001akjAjf\u001bb<H`hL"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x4

    if-ne v5, v4, :cond_24e

    .line 10
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 11
    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〴ねぷぐくぼ()V

    iget-object v5, v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-virtual {v9, v5}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->くし〴〺ぅ(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v5

    iget-object v8, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->なぎぱいぢぎ:Ljava/net/Socket;

    new-instance v12, Ljava/net/InetSocketAddress;

    iget v15, v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;->〺つふすそ:I

    invoke-direct {v12, v5, v15}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-virtual {v8, v12, v1}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    iget-object v1, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->なぎぱいぢぎ:Ljava/net/Socket;

    invoke-virtual {v1, v2}, Ljava/net/Socket;->setSoTimeout(I)V

    iget-object v1, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->なぎぱいぢぎ:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    iget-object v2, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->なぎぱいぢぎ:Ljava/net/Socket;

    invoke-virtual {v2}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    iget-object v5, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->なぎぱいぢぎ:Ljava/net/Socket;

    invoke-virtual {v5, v13}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    new-array v5, v14, [B

    const/4 v8, 0x0

    aput-byte v7, v5, v8

    aput-byte v13, v5, v13

    iget v8, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->づざかべべ:I

    ushr-int/lit8 v12, v8, 0x8

    int-to-byte v12, v12

    aput-byte v12, v5, v11

    and-int/lit16 v8, v8, 0xff

    int-to-byte v8, v8

    const/4 v12, 0x3

    aput-byte v8, v5, v12

    iget-object v8, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->びぐびあび:Ljava/lang/String;

    invoke-virtual {v9, v8}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->くし〴〺ぅ(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v8

    invoke-virtual {v8}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v8

    const/4 v12, 0x0

    :goto_17d
    array-length v14, v8

    if-ge v12, v14, :cond_18a

    add-int/lit8 v14, v7, 0x1

    aget-byte v15, v8, v12

    aput-byte v15, v5, v7

    add-int/lit8 v12, v12, 0x1

    move v7, v14

    goto :goto_17d

    :cond_18a
    iget-object v3, v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/String;

    if-eqz v3, :cond_1a0

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v8

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v12

    const/4 v14, 0x0

    invoke-static {v8, v14, v5, v7, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v7, v3

    goto :goto_1a1

    :cond_1a0
    const/4 v14, 0x0

    :goto_1a1
    add-int/lit8 v3, v7, 0x1

    aput-byte v14, v5, v7

    invoke-virtual {v2, v5, v14, v3}, Ljava/io/OutputStream;->write([BII)V

    const/4 v2, 0x0

    const/4 v3, 0x6

    :goto_1aa
    if-ge v2, v3, :cond_1d8

    rsub-int/lit8 v7, v2, 0x6

    invoke-virtual {v1, v5, v2, v7}, Ljava/io/InputStream;->read([BII)I

    move-result v7

    if-lez v7, :cond_1b6

    add-int/2addr v2, v7

    goto :goto_1aa

    :cond_1b6
    new-instance v0, Ljava/io/IOException;

    invoke-static {v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\u001c4>\u001ec:\u001c4kMjk\u001c4gH0nA4kHaiMjg\u001eco\u00190lKd9Hgo\u00197>\u001akjMbgOjiO0o\u001dg>M6iNj<K"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1d8
    const/4 v2, 0x0

    aget-byte v3, v5, v2

    if-nez v3, :cond_226

    aget-byte v3, v5, v13

    const/16 v7, 0x5a

    if-ne v3, v7, :cond_1ea

    new-array v3, v11, [B

    invoke-virtual {v1, v3, v2, v11}, Ljava/io/InputStream;->read([BII)I

    goto/16 :goto_553

    :cond_1ea
    const-string v0, "\u001dk:\u001ba<\u001bfjM`fLf<@jg\u001c`gM0:\u001a4nAj<Kdi@6iMd;\u00193kO69\u001eai\u001d`fHelJ4g\u001a7>\u001ec:\u001c"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    aget-byte v1, v5, v13

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/IOException;

    invoke-static {v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\u001dc<\u001e6:Nch\u001b4>Lf=Ae9Ab<AklOdm\u001d0mO3"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_226
    new-instance v0, Ljava/io/IOException;

    invoke-static {v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "LdmKa9N1<M`m\u001a1=A6n\u001akiAc;\u001ed:L1n\u001d6i\u001bb:Jj<K4mO4nL7fIg9\u001e6f\u00194<\u001bg=Jel\u001a"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    aget-byte v2, v5, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_24e
    sget-object v4, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ$げつ〴ぬぐ;

    if-ne v5, v4, :cond_389

    .line 12
    sget-object v5, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 13
    check-cast v5, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〴ねぷぐくぼ()V

    iget-object v5, v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-virtual {v9, v5}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->くし〴〺ぅ(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v5

    iget-object v8, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->なぎぱいぢぎ:Ljava/net/Socket;

    new-instance v12, Ljava/net/InetSocketAddress;

    iget v15, v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;->〺つふすそ:I

    invoke-direct {v12, v5, v15}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-virtual {v8, v12, v1}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    iget-object v1, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->なぎぱいぢぎ:Ljava/net/Socket;

    invoke-virtual {v1, v2}, Ljava/net/Socket;->setSoTimeout(I)V

    iget-object v1, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->なぎぱいぢぎ:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    iget-object v2, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->なぎぱいぢぎ:Ljava/net/Socket;

    invoke-virtual {v2}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    iget-object v5, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->なぎぱいぢぎ:Ljava/net/Socket;

    invoke-virtual {v5, v13}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    new-array v5, v14, [B

    const/4 v8, 0x5

    const/4 v12, 0x0

    aput-byte v8, v5, v12

    aput-byte v11, v5, v13

    aput-byte v12, v5, v11

    const/4 v14, 0x3

    aput-byte v11, v5, v14

    invoke-virtual {v2, v5, v12, v7}, Ljava/io/OutputStream;->write([BII)V

    invoke-virtual {v9, v1, v5, v11}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->づざかべべ(Ljava/io/InputStream;[BI)V

    aget-byte v7, v5, v13

    and-int/lit16 v7, v7, 0xff

    if-eqz v7, :cond_2e7

    if-eq v7, v11, :cond_29d

    goto :goto_2e4

    :cond_29d
    iget-object v7, v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/String;

    iget-object v3, v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;->びぐびあび:Ljava/lang/String;

    if-eqz v7, :cond_2e4

    if-nez v3, :cond_2a6

    goto :goto_2e4

    :cond_2a6
    const/4 v12, 0x0

    aput-byte v13, v5, v12

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v14

    int-to-byte v14, v14

    aput-byte v14, v5, v13

    invoke-virtual {v7}, Ljava/lang/String;->getBytes()[B

    move-result-object v14

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v15

    invoke-static {v14, v12, v5, v11, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    add-int/2addr v7, v11

    add-int/lit8 v14, v7, 0x1

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v15

    int-to-byte v15, v15

    aput-byte v15, v5, v7

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v7

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v15

    invoke-static {v7, v12, v5, v14, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v3, v14

    invoke-virtual {v2, v5, v12, v3}, Ljava/io/OutputStream;->write([BII)V

    invoke-virtual {v9, v1, v5, v11}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->づざかべべ(Ljava/io/InputStream;[BI)V

    aget-byte v3, v5, v13

    if-nez v3, :cond_2e5

    goto :goto_2e8

    :cond_2e4
    :goto_2e4
    const/4 v12, 0x0

    :cond_2e5
    const/4 v3, 0x0

    goto :goto_2e9

    :cond_2e7
    const/4 v12, 0x0

    :goto_2e8
    const/4 v3, 0x1

    :goto_2e9
    if-eqz v3, :cond_367

    aput-byte v8, v5, v12

    aput-byte v13, v5, v13

    aput-byte v12, v5, v11

    iget-object v3, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->びぐびあび:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    array-length v7, v3

    const/4 v11, 0x3

    aput-byte v11, v5, v11

    int-to-byte v11, v7

    const/4 v14, 0x4

    aput-byte v11, v5, v14

    invoke-static {v3, v12, v5, v8, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v8, v7

    add-int/lit8 v3, v8, 0x1

    iget v7, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->づざかべべ:I

    ushr-int/lit8 v11, v7, 0x8

    int-to-byte v11, v11

    aput-byte v11, v5, v8

    add-int/lit8 v8, v3, 0x1

    and-int/lit16 v7, v7, 0xff

    int-to-byte v7, v7

    aput-byte v7, v5, v3

    const/4 v3, 0x0

    invoke-virtual {v2, v5, v3, v8}, Ljava/io/OutputStream;->write([BII)V

    const/4 v2, 0x4

    invoke-virtual {v9, v1, v5, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->づざかべべ(Ljava/io/InputStream;[BI)V

    aget-byte v3, v5, v13

    if-nez v3, :cond_340

    const/4 v3, 0x3

    aget-byte v4, v5, v3

    and-int/lit16 v4, v4, 0xff

    if-eq v4, v13, :cond_33a

    if-eq v4, v3, :cond_32f

    if-eq v4, v2, :cond_32c

    goto/16 :goto_553

    :cond_32c
    const/16 v2, 0x12

    goto :goto_33b

    :cond_32f
    invoke-virtual {v9, v1, v5, v13}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->づざかべべ(Ljava/io/InputStream;[BI)V

    const/4 v2, 0x0

    aget-byte v2, v5, v2

    and-int/lit16 v2, v2, 0xff

    add-int/lit8 v2, v2, 0x2

    goto :goto_33b

    :cond_33a
    const/4 v2, 0x6

    :goto_33b
    invoke-virtual {v9, v1, v5, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->づざかべべ(Ljava/io/InputStream;[BI)V

    goto/16 :goto_553

    :cond_340
    new-instance v0, Ljava/io/IOException;

    invoke-static {v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "LdmKa9N1<M`m\u001a1=A6n\u001akiAc;\u001ed:L1n\u001d6=\u00197:A`9A6oH7f\u001c7hOjgJb9\u001b`<H0hH1=I"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-byte v2, v5, v13

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_367
    new-instance v0, Ljava/io/IOException;

    invoke-static {v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "@`k\u001eag\u001aeg\u001b`;\u00194:Obm\u00191lN0<\u001c3m\u001bk9\u0019fl@6>Og>\u001e0=K6:A`;\u0019el\u001agi\u001c7k\u001e6lA1j\u001a"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_389
    new-instance v4, Ljava/net/InetSocketAddress;

    iget-object v5, v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    iget v6, v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;->〺つふすそ:I

    invoke-direct {v4, v5, v6}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    new-instance v5, Ljava/net/Proxy;

    sget-object v6, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    invoke-direct {v5, v6, v4}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V

    iget-object v4, v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;->くし〴〺ぅ:Ljava/lang/String;

    if-eqz v4, :cond_3a9

    iget-object v4, v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;->びぐびあび:Ljava/lang/String;

    if-eqz v4, :cond_3a9

    new-instance v4, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぺぁあねじ;

    invoke-direct {v4, v9, v3}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/ぺぁあねじ;-><init>(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;)V

    invoke-static {v4}, Ljava/net/Authenticator;->setDefault(Ljava/net/Authenticator;)V

    .line 14
    :cond_3a9
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 15
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〴ねぷぐくぼ()V

    new-instance v3, Ljava/net/Socket;

    invoke-direct {v3, v5}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    iput-object v3, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->なぎぱいぢぎ:Ljava/net/Socket;

    iget-object v3, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->びぐびあび:Ljava/lang/String;

    invoke-virtual {v9, v3}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->くし〴〺ぅ(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v3

    iget-object v4, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->なぎぱいぢぎ:Ljava/net/Socket;

    new-instance v5, Ljava/net/InetSocketAddress;

    iget v6, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->づざかべべ:I

    invoke-direct {v5, v3, v6}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    :goto_3c6
    invoke-virtual {v4, v5, v1}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    iget-object v1, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->なぎぱいぢぎ:Ljava/net/Socket;

    invoke-virtual {v1, v2}, Ljava/net/Socket;->setSoTimeout(I)V

    goto/16 :goto_553

    :cond_3d0
    instance-of v4, v3, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/なぎぱいぢぎ;

    if-eqz v4, :cond_5f1

    .line 16
    :try_start_3d4
    sget-object v4, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 17
    move-object v12, v4

    check-cast v12, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v12

    check-cast v4, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v4, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    aget-object v4, v4, v11

    invoke-static {v4}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_435

    .line 18
    sget-object v4, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 19
    move-object v11, v4

    check-cast v11, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v11}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v11

    check-cast v4, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v4, v11}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    aget-object v4, v4, v8

    invoke-static {v4}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_435

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v6, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v8

    invoke-direct {v6, v5, v8}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    invoke-virtual {v6, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\u001c`:\u001d1gN6nN`=H6lAb;\u001d1nKb=\u001aeoA6lJj<Jdl\u001c7j\u00193hNfo@0jJ`;\u001a1kA0h\u0019`>Mg=\u001e"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v7, v4}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_433
    .catch Ljava/lang/Exception; {:try_start_3d4 .. :try_end_433} :catch_434

    goto :goto_435

    :catch_434
    nop

    :cond_435
    :goto_435
    check-cast v3, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/なぎぱいぢぎ;

    iget-object v4, v3, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/なぎぱいぢぎ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-virtual {v9, v4}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->くし〴〺ぅ(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v4

    iget-object v5, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->なぎぱいぢぎ:Ljava/net/Socket;

    new-instance v6, Ljava/net/InetSocketAddress;

    iget v7, v3, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/なぎぱいぢぎ;->〺つふすそ:I

    invoke-direct {v6, v4, v7}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-virtual {v5, v6, v1}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    iget-object v1, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->なぎぱいぢぎ:Ljava/net/Socket;

    invoke-virtual {v1, v2}, Ljava/net/Socket;->setSoTimeout(I)V

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "I7mI6kL3jN1l\u001b09Mf<\u00190gOkgIjk\u001a`iLc"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->びぐびあび:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/16 v2, 0x3a

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    iget v2, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->づざかべべ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v2, " HTTP/1.0\r\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, v3, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/lang/String;

    const-string v4, "\u001c0<Jgf\u001b0<\u001dgf\u001db=\u001b`kL`m@a>Nkh\u001ecnH7"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "\r\n"

    if-eqz v2, :cond_4c3

    iget-object v2, v3, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/なぎぱいぢぎ;->びぐびあび:Ljava/lang/String;

    if-eqz v2, :cond_4c3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v3, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/なぎぱいぢぎ;->くし〴〺ぅ:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v3, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/なぎぱいぢぎ;->びぐびあび:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    invoke-static {v2}, Lcom/trilead/ssh2/crypto/Base64;->encode([B)[C

    move-result-object v2

    const-string v6, "H6mMa;Nb;L4:\u0019f>@anKfoJk>Mgi\u001dkf\u001ec9Kcf@a;\u001b1o@1mLdoA19M`i\u001db=@ff\u001de:\u0019"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append([C)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_4c3
    iget-object v2, v3, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/なぎぱいぢぎ;->づざかべべ:[Ljava/lang/String;

    if-eqz v2, :cond_4dc

    const/4 v2, 0x0

    :goto_4c8
    iget-object v6, v3, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/なぎぱいぢぎ;->づざかべべ:[Ljava/lang/String;

    array-length v7, v6

    if-ge v2, v7, :cond_4dc

    aget-object v7, v6, v2

    if-eqz v7, :cond_4d9

    aget-object v6, v6, v2

    invoke-virtual {v1, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_4d9
    add-int/lit8 v2, v2, 0x1

    goto :goto_4c8

    :cond_4dc
    invoke-virtual {v1, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->なぎぱいぢぎ:Ljava/net/Socket;

    invoke-virtual {v2}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V

    new-array v1, v14, [B

    iget-object v2, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->なぎぱいぢぎ:Ljava/net/Socket;

    invoke-virtual {v2}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    invoke-static {v2, v1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/io/InputStream;[B)I

    move-result v3

    new-instance v5, Ljava/lang/String;

    const/4 v6, 0x0

    invoke-direct {v5, v1, v6, v3, v4}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    const-string v3, "O6fMehLdjLb>L`j\u00193g\u001bkfN1o\u001d3:\u001aahH1"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    const-string v4, "\u001c0hH1;\u001ba;M0:\u001ba9Mbf\u001bghI4>\u001egk\u00197lHk;M`;K6gIelMem\u001b1:IeoLekI3=O`j\u001ak=\u001b`i\u001c3jHk=\u001d1o\u001e`:\u001a7;\u001bdlIa:\u0019bm\u001e6=Hgm\u001939\u001a7l\u001e3fNjjA4hI6<Ja=OffLjgA6jOj"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v3, :cond_5eb

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v6, 0xe

    if-lt v3, v6, :cond_5e5

    const/16 v3, 0x8

    invoke-virtual {v5, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v6, 0x20

    if-ne v3, v6, :cond_5e5

    const/16 v3, 0xc

    invoke-virtual {v5, v3}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-ne v7, v6, :cond_5e5

    const/16 v6, 0x9

    :try_start_53b
    invoke-virtual {v5, v6, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3
    :try_end_543
    .catch Ljava/lang/NumberFormatException; {:try_start_53b .. :try_end_543} :catch_5df

    if-ltz v3, :cond_5d9

    const/16 v6, 0x3e7

    if-gt v3, v6, :cond_5d9

    const/16 v4, 0xc8

    if-ne v3, v4, :cond_5cd

    :goto_54d
    invoke-static {v2, v1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/io/InputStream;[B)I

    move-result v3

    if-nez v3, :cond_5ca

    .line 20
    :goto_553
    new-instance v3, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;

    iget-object v1, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->なぎぱいぢぎ:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    iget-object v2, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->なぎぱいぢぎ:Ljava/net/Socket;

    invoke-virtual {v2}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    invoke-direct {v3, v1, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;-><init>(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    new-instance v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;

    iget-object v2, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->なぎぱいぢぎ:Ljava/net/Socket;

    invoke-virtual {v2}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    iget-object v4, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->なぎぱいぢぎ:Ljava/net/Socket;

    invoke-virtual {v4}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v4

    move-object/from16 v8, p6

    invoke-direct {v1, v2, v4, v8}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;-><init>(Ljava/io/InputStream;Ljava/io/OutputStream;Ljava/security/SecureRandom;)V

    iput-object v1, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;

    new-instance v11, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;

    iget-object v5, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->びぐびあび:Ljava/lang/String;

    iget v6, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->づざかべべ:I

    move-object v1, v11

    move-object/from16 v2, p0

    move-object/from16 v4, p1

    move-object/from16 v7, p2

    invoke-direct/range {v1 .. v8}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;-><init>(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/げつ〴ぬぐ;Lcom/trilead/ssh2/crypto/CryptoWishList;Ljava/lang/String;ILなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぺふねづ〺;Ljava/security/SecureRandom;)V

    iput-object v11, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->ぺふねづ〺:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;

    .line 21
    monitor-enter v11

    :try_start_58c
    iput-object v0, v11, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->ぺふねづ〺:Lcom/trilead/ssh2/crypto/CryptoWishList;

    iput-object v10, v11, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->てぜきぽく:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/びぐびあび;

    iget-object v1, v11, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    if-nez v1, :cond_5b1

    new-instance v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    invoke-direct {v1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;-><init>()V

    iput-object v1, v11, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iput-object v10, v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/びぐびあび;

    new-instance v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;

    iget-object v2, v11, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->ぇぬぎばつ:Ljava/security/SecureRandom;

    invoke-direct {v1, v0, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;-><init>(Lcom/trilead/ssh2/crypto/CryptoWishList;Ljava/security/SecureRandom;)V

    iget-object v0, v11, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;

    iput-object v1, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/びぐびあび;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;

    iget-object v0, v11, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;

    invoke-virtual {v1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ;->〺つふすそ()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->のぷのちつ([B)V
    :try_end_5b1
    .catchall {:try_start_58c .. :try_end_5b1} :catchall_5c7

    :cond_5b1
    monitor-exit v11

    .line 22
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ$げつ〴ぬぐ;

    invoke-direct {v1, v9}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ$げつ〴ぬぐ;-><init>(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->のぷのちつ:Ljava/lang/Thread;

    invoke-virtual {v0, v13}, Ljava/lang/Thread;->setDaemon(Z)V

    iget-object v0, v9, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->のぷのちつ:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void

    :catchall_5c7
    move-exception v0

    .line 23
    monitor-exit v11

    throw v0

    :cond_5ca
    move-object/from16 v8, p6

    goto :goto_54d

    .line 24
    :cond_5cd
    new-instance v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぁごぐすすぃ;

    const/16 v1, 0xd

    invoke-virtual {v5, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぁごぐすすぃ;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_5d9
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_5df
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5e5
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5eb
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5f1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "AbmKdgL4l@1jM19\u001eei@6o\u001db>HeoH0lL`oOj;\u001ekfNdoMd;Hao\u001bgm@glNei@6fA4;N"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_602

    :goto_601
    throw v0

    :goto_602
    goto :goto_601
.end method

.method public 〺つふすそ(Ljava/lang/Throwable;Z)V
    .registers 8

    if-nez p2, :cond_7

    :try_start_2
    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->なぎぱいぢぎ:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_7} :catch_7

    :catch_7
    :cond_7
    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->ぁごぐすすぃ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_a
    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->ぺぁあねじ:Ljava/lang/Throwable;
    :try_end_c
    .catchall {:try_start_a .. :try_end_c} :catchall_82

    const/4 v2, 0x1

    if-nez v1, :cond_4f

    if-ne p2, v2, :cond_3c

    const/16 p2, 0xb

    :try_start_13
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v3, ""

    .line 1
    new-instance v4, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/びぐびあび;

    invoke-direct {v4}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/びぐびあび;-><init>()V

    invoke-virtual {v4, v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/びぐびあび;->びぐびあび(I)V

    invoke-virtual {v4, p2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/びぐびあび;->ぺぁあねじ(I)V

    invoke-virtual {v4, v1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/びぐびあび;->〳ぜぞぜべっ(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/びぐびあび;->〳ぜぞぜべっ(Ljava/lang/String;)V

    invoke-virtual {v4}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/びぐびあび;->げつ〴ぬぐ()[B

    move-result-object p2

    .line 2
    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;

    if-eqz v1, :cond_35

    invoke-virtual {v1, p2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->げつ〴ぬぐ([B)V
    :try_end_35
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_35} :catch_35
    .catchall {:try_start_13 .. :try_end_35} :catchall_82

    :catch_35
    :cond_35
    :try_start_35
    iget-object p2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->なぎぱいぢぎ:Ljava/net/Socket;

    invoke-virtual {p2}, Ljava/net/Socket;->close()V
    :try_end_3a
    .catch Ljava/io/IOException; {:try_start_35 .. :try_end_3a} :catch_3b
    .catchall {:try_start_35 .. :try_end_3a} :catchall_82

    goto :goto_3c

    :catch_3b
    nop

    :cond_3c
    :goto_3c
    if-nez p1, :cond_4d

    :try_start_3e
    new-instance p1, Ljava/lang/Exception;

    const-string p2, "@7hHbo\u001ca;Obf\u001bg>H4f\u001cjfK6hHe;\u001dd;\u001dc"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    :cond_4d
    iput-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->ぺぁあねじ:Ljava/lang/Throwable;

    :cond_4f
    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->ぁごぐすすぃ:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0
    :try_end_55
    .catchall {:try_start_3e .. :try_end_55} :catchall_82

    monitor-enter p0

    :try_start_56
    iget-boolean p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->おぐぴう〸ず:Z

    if-nez p1, :cond_65

    iput-boolean v2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->おぐぴう〸ず:Z

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->へぬ〴づぞ:Ljava/util/Vector;

    invoke-virtual {p1}, Ljava/util/Vector;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Vector;

    goto :goto_66

    :cond_65
    const/4 p1, 0x0

    :goto_66
    monitor-exit p0
    :try_end_67
    .catchall {:try_start_56 .. :try_end_67} :catchall_7f

    if-eqz p1, :cond_7e

    const/4 p2, 0x0

    :goto_6a
    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge p2, v0, :cond_7e

    :try_start_70
    invoke-virtual {p1, p2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/くし〴〺ぅ;

    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->ぺぁあねじ:Ljava/lang/Throwable;

    invoke-interface {v0, v1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/くし〴〺ぅ;->げつ〴ぬぐ(Ljava/lang/Throwable;)V
    :try_end_7b
    .catch Ljava/lang/Exception; {:try_start_70 .. :try_end_7b} :catch_7b

    :catch_7b
    add-int/lit8 p2, p2, 0x1

    goto :goto_6a

    :cond_7e
    return-void

    :catchall_7f
    move-exception p1

    :try_start_80
    monitor-exit p0
    :try_end_81
    .catchall {:try_start_80 .. :try_end_81} :catchall_7f

    throw p1

    :catchall_82
    move-exception p1

    :try_start_83
    monitor-exit v0
    :try_end_84
    .catchall {:try_start_83 .. :try_end_84} :catchall_82

    goto :goto_86

    :goto_85
    throw p1

    :goto_86
    goto :goto_85
.end method

.method public ぁごぐすすぃ()Ljava/lang/Throwable;
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->ぁごぐすすぃ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->ぺぁあねじ:Ljava/lang/Throwable;

    monitor-exit v0

    return-object v1

    :catchall_7
    move-exception v1

    monitor-exit v0
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_7

    throw v1
.end method

.method public いいにぽつ(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/づざかべべ;II)V
    .registers 5

    new-instance v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ$くし〴〺ぅ;

    invoke-direct {v0, p0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ$くし〴〺ぅ;-><init>(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;)V

    iput-object p1, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ$くし〴〺ぅ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/づざかべべ;

    iput p2, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ$くし〴〺ぅ;->〺つふすそ:I

    iput p3, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ$くし〴〺ぅ;->くし〴〺ぅ:I

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->てぜきぽく:Ljava/util/Vector;

    monitor-enter p1

    :try_start_e
    iget-object p2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->てぜきぽく:Ljava/util/Vector;

    invoke-virtual {p2, v0}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    monitor-exit p1

    return-void

    :catchall_15
    move-exception p2

    monitor-exit p1
    :try_end_17
    .catchall {:try_start_e .. :try_end_17} :catchall_15

    throw p2
.end method

.method public final くし〴〺ぅ(Ljava/lang/String;)Ljava/net/InetAddress;
    .registers 12

    const/4 v0, 0x0

    if-nez p1, :cond_4

    goto :goto_57

    :cond_4
    const/16 v1, 0x2e

    .line 1
    invoke-static {p1, v1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぎきぁ〱ぢ(Ljava/lang/String;C)[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x4

    if-eq v2, v3, :cond_f

    goto :goto_57

    :cond_f
    new-array v2, v3, [B

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_13
    if-ge v5, v3, :cond_53

    aget-object v6, v1, v5

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_57

    aget-object v6, v1, v5

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x3

    if-le v6, v7, :cond_27

    goto :goto_57

    :cond_27
    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_29
    aget-object v8, v1, v5

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    if-ge v6, v8, :cond_48

    aget-object v8, v1, v5

    invoke-virtual {v8, v6}, Ljava/lang/String;->charAt(I)C

    move-result v8

    const/16 v9, 0x30

    if-lt v8, v9, :cond_57

    const/16 v9, 0x39

    if-le v8, v9, :cond_40

    goto :goto_57

    :cond_40
    mul-int/lit8 v7, v7, 0xa

    add-int/lit8 v8, v8, -0x30

    add-int/2addr v7, v8

    add-int/lit8 v6, v6, 0x1

    goto :goto_29

    :cond_48
    const/16 v6, 0xff

    if-le v7, v6, :cond_4d

    goto :goto_57

    :cond_4d
    int-to-byte v6, v7

    aput-byte v6, v2, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_13

    :cond_53
    invoke-static {p1, v2}, Ljava/net/InetAddress;->getByAddress(Ljava/lang/String;[B)Ljava/net/InetAddress;

    move-result-object v0

    :cond_57
    :goto_57
    if-eqz v0, :cond_5a

    return-object v0

    .line 2
    :cond_5a
    invoke-static {p1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object p1

    return-object p1
.end method

.method public げつ〴ぬぐ(Lcom/trilead/ssh2/crypto/cipher/BlockCipher;Lcom/trilead/ssh2/crypto/digest/MAC;)V
    .registers 5

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->くし〴〺ぅ:Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;

    invoke-virtual {v1, p1}, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->changeCipher(Lcom/trilead/ssh2/crypto/cipher/BlockCipher;)V

    iput-object p2, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->ぺぁあねじ:Lcom/trilead/ssh2/crypto/digest/MAC;

    invoke-virtual {p2}, Lcom/trilead/ssh2/crypto/digest/MAC;->size()I

    move-result v1

    new-array v1, v1, [B

    iput-object v1, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->いいにぽつ:[B

    invoke-virtual {p2}, Lcom/trilead/ssh2/crypto/digest/MAC;->size()I

    move-result p2

    new-array p2, p2, [B

    iput-object p2, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->ぺふねづ〺:[B

    invoke-interface {p1}, Lcom/trilead/ssh2/crypto/cipher/BlockCipher;->getBlockSize()I

    move-result p1

    iput p1, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->てぜきぽく:I

    const/16 p2, 0x8

    if-ge p1, p2, :cond_25

    iput p2, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->てぜきぽく:I

    :cond_25
    return-void
.end method

.method public final づざかべべ(Ljava/io/InputStream;[BI)V
    .registers 6

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p3, :cond_3b

    sub-int v1, p3, v0

    invoke-virtual {p1, p2, v0, v1}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    if-lez v1, :cond_d

    add-int/2addr v0, v1

    goto :goto_1

    :cond_d
    new-instance p1, Ljava/io/IOException;

    const-string p2, "H7j\u001a`iL4=Jek\u001a6;\u001ecfO3n@e:@enNj>\u001cef\u001aj9\u00190fHclAfo\u001akfHg;\u001akjAjf\u001bb<H`hL"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    sget-object p3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/おぐぴう〸ず/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-virtual {p3}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "\u001c4>\u001ec:\u001c4kMjk\u001c4gH0nA4kHaiMjg\u001eco\u00190lKd9Hgo\u00197>\u001akjMbgOjiO0o\u001dg>M6iNj<K"

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3b
    return-void
.end method

.method public てぜきぽく([B)V
    .registers 4

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->げつ〴ぬぐ:Ljava/util/Vector;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->げつ〴ぬぐ:Ljava/util/Vector;

    invoke-virtual {v1, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->げつ〴ぬぐ:Ljava/util/Vector;

    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    move-result p1

    const/16 v1, 0x64

    if-gt p1, v1, :cond_28

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->〺つふすそ:Ljava/lang/Thread;

    if-nez p1, :cond_26

    new-instance p1, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ$〺つふすそ;

    invoke-direct {p1, p0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ$〺つふすそ;-><init>(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;)V

    iput-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->〺つふすそ:Ljava/lang/Thread;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->〺つふすそ:Ljava/lang/Thread;

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    :cond_26
    monitor-exit v0

    return-void

    :cond_28
    new-instance p1, Ljava/io/IOException;

    const-string v1, "KamHjhKbkNcm\u001bc9\u001egf\u001b6>L`;Ljn\u0019e>A3m\u001edf@79Mgl\u001cgoH7k\u001a6=@6g\u001dd<@biM7;\u001dehNd;N3m\u001ekiM3i\u001e3=Oe;\u0019b:L7iJa=\u001aanOji\u001a7hO0nLcj\u001cd;\u001bk9J1kOej\u001bkjIchI4"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_38
    move-exception p1

    monitor-exit v0
    :try_end_3a
    .catchall {:try_start_3 .. :try_end_3a} :catchall_38

    throw p1
.end method

.method public なぎぱいぢぎ(I)Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ;
    .registers 6

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->ぺふねづ〺:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->なぎぱいぢぎ:Ljava/lang/Object;

    monitor-enter v1

    :goto_5
    :try_start_5
    iget-object v2, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->ぁごぐすすぃ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ;

    if-eqz v2, :cond_f

    iget v3, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ;->びぐびあび:I

    if-lt v3, p1, :cond_f

    monitor-exit v1

    return-object v2

    :cond_f
    iget-boolean v2, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->〳ぜぞぜべっ:Z
    :try_end_11
    .catchall {:try_start_5 .. :try_end_11} :catchall_35

    if-nez v2, :cond_1f

    :try_start_13
    iget-object v2, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->なぎぱいぢぎ:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->wait()V
    :try_end_18
    .catch Ljava/lang/InterruptedException; {:try_start_13 .. :try_end_18} :catch_19
    .catchall {:try_start_13 .. :try_end_18} :catchall_35

    goto :goto_5

    :catch_19
    :try_start_19
    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    throw p1

    :cond_1f
    new-instance p1, Ljava/io/IOException;

    const-string v2, "\u001a1>N0gH3=\u001c7nJ6;Kdi\u001cjl\u001b4:\u001ce;\u0019fg\u001969\u001bggA1m\u001acj@`nJfoOc<O0>Hfg\u00196gL19\u001c0gMa;\u001a0iHjmJejMehNkn@4mLfh\u001bdoM6mAjo\u001dk<NbiAbhI4gJk>I1n\u001ajh\u0019kkNkj\u001dc"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->ぁごぐすすぃ()Ljava/lang/Throwable;

    move-result-object v0

    invoke-direct {p1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :catchall_35
    move-exception p1

    monitor-exit v1
    :try_end_37
    .catchall {:try_start_19 .. :try_end_37} :catchall_35

    goto :goto_39

    :goto_38
    throw p1

    :goto_39
    goto :goto_38
.end method

.method public のぷのちつ([B)V
    .registers 4

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->ぁごぐすすぃ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    invoke-virtual {p0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->びぐびあび()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->〳ぜぞぜべっ:Z
    :try_end_9
    .catchall {:try_start_3 .. :try_end_9} :catchall_16

    :try_start_9
    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;

    invoke-virtual {v1, p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->げつ〴ぬぐ([B)V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_e} :catch_10
    .catchall {:try_start_9 .. :try_end_e} :catchall_16

    :try_start_e
    monitor-exit v0

    return-void

    :catch_10
    move-exception p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->〺つふすそ(Ljava/lang/Throwable;Z)V

    throw p1

    :catchall_16
    move-exception p1

    monitor-exit v0
    :try_end_18
    .catchall {:try_start_e .. :try_end_18} :catchall_16

    throw p1
.end method

.method public final びぐびあび()V
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->ぺぁあねじ:Ljava/lang/Throwable;

    if-nez v0, :cond_5

    return-void

    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "H7n\u0019e;\u001acnLfn\u001a0oM7k\u001b6jKgi\u001b4>I1:\u001dj=\u00193;\u001cb=\u001b3m\u001adf\u001cd>OknHej\u00190oIa9AcnJ`j\u001d6iIe9@a<KbgL4f\u001b4;Iko\u001effLe<Jjj"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->ぺぁあねじ:Ljava/lang/Throwable;

    invoke-virtual {v0, v1}, Ljava/io/IOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/io/IOException;

    throw v0
.end method

.method public へぬ〴づぞ([B)V
    .registers 4

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->のぷのちつ:Ljava/lang/Thread;

    if-eq v0, v1, :cond_2e

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->ぁごぐすすぃ:Ljava/lang/Object;

    monitor-enter v0

    :goto_b
    :try_start_b
    invoke-virtual {p0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->びぐびあび()V

    iget-boolean v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->〳ぜぞぜべっ:Z
    :try_end_10
    .catchall {:try_start_b .. :try_end_10} :catchall_2b

    if-nez v1, :cond_1f

    :try_start_12
    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;

    invoke-virtual {v1, p1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->げつ〴ぬぐ([B)V
    :try_end_17
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_17} :catch_19
    .catchall {:try_start_12 .. :try_end_17} :catchall_2b

    :try_start_17
    monitor-exit v0

    return-void

    :catch_19
    move-exception p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->〺つふすそ(Ljava/lang/Throwable;Z)V

    throw p1
    :try_end_1f
    .catchall {:try_start_17 .. :try_end_1f} :catchall_2b

    :cond_1f
    :try_start_1f
    iget-object v1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->ぁごぐすすぃ:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_24
    .catch Ljava/lang/InterruptedException; {:try_start_1f .. :try_end_24} :catch_25
    .catchall {:try_start_1f .. :try_end_24} :catchall_2b

    goto :goto_b

    :catch_25
    :try_start_25
    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    throw p1

    :catchall_2b
    move-exception p1

    monitor-exit v0
    :try_end_2d
    .catchall {:try_start_25 .. :try_end_2d} :catchall_2b

    throw p1

    :cond_2e
    new-instance p1, Ljava/io/IOException;

    const-string v0, "M3kJ3oO4jLcoN69\u001c3h\u001b`>\u001c19K1jAb;N`;\u001aemIkf\u001a4k\u001e1hLkg\u001c4<\u00197k\u001bf;H0g\u001ea:Ak:\u001ek:\u001ajlMj<M4:\u001e`l\u001e`n\u001c1n\u001efiO69\u001db;K7kHfhAf<Jd<\u001ebo@4i\u001ba<@4o\u001c6l\u001e1=\u001cbnIbj\u001dgn\u001b0:Oah\u001b09\u001c3iIdkKcn\u001d3kO7m\u001c"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_3f

    :goto_3e
    throw p1

    :goto_3f
    goto :goto_3e
.end method

.method public ぺぁあねじ()V
    .registers 16

    sget v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->ぉざぅち〻:I

    new-array v1, v0, [B

    .line 1
    :goto_4
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 2
    move-object v3, v2

    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v3

    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    aget-object v2, v2, v3

    const-string v4, "Ae:MdhKa>\u001cbg\u001cd:Ogf\u00190kAkjKbm\u0019ajHa"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v4, 0x5

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-nez v2, :cond_1c3

    :try_start_29
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_2b
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_29 .. :try_end_2b} :catch_ff
    .catch Ljava/lang/Exception; {:try_start_29 .. :try_end_2b} :catch_ff

    const/16 v7, 0x11

    const v8, 0x10808000

    const-string v9, "KcfLgn@b>L1kJ`kA4<Ia9\u001b3oNc<A0gLkk\u001a3i\u001a6iK7gJgn\u001b6gNc<Lak\u0019c:JaoK7m\u0019"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const v10, 0x7f11010b

    const-string v11, ""

    const-string v12, "O`;Lfl\u001a3;\u0019gfL0<\u001b39L4fNflM0oOdk\u001cd"

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "\u001edfAk:\u001dj:M19A4nN1;Oeg\u001dgfAk>\u001e1lLg"

    invoke-static {v13}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-lt v2, v7, :cond_a9

    .line 3
    :try_start_55
    sget-object v2, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    .line 4
    invoke-virtual {v2}, Landroid/app/Application;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-static {v2, v13}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_6d

    .line 5
    sget-object v2, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    .line 6
    invoke-virtual {v2}, Landroid/app/Application;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-static {v2, v12}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_ff

    .line 7
    :cond_6d
    sget-object v2, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 8
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    new-instance v7, Ljava/lang/String;

    .line 9
    sget-object v12, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 10
    check-cast v12, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v12, v4, v6}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->な〱ちぉじ(II)[B

    move-result-object v12

    invoke-direct {v7, v12}, Ljava/lang/String;-><init>([B)V

    invoke-interface {v2, v7, v11}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 11
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 12
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぷちぅぐね()V
    :try_end_8e
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_55 .. :try_end_8e} :catch_ff
    .catch Ljava/lang/Exception; {:try_start_55 .. :try_end_8e} :catch_ff

    .line 13
    :try_start_8e
    sget-object v2, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    .line 14
    invoke-virtual {v2, v10}, Landroid/app/Application;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V
    :try_end_9b
    .catch Ljava/lang/Exception; {:try_start_8e .. :try_end_9b} :catch_9b

    :catch_9b
    :try_start_9b
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2, v9}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v8}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 15
    :goto_a3
    sget-object v7, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    .line 16
    invoke-virtual {v7, v2}, Landroid/app/Application;->startActivity(Landroid/content/Intent;)V

    goto :goto_f8

    .line 17
    :cond_a9
    sget-object v2, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    .line 18
    invoke-virtual {v2}, Landroid/app/Application;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-static {v2, v13}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_c1

    .line 19
    sget-object v2, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    .line 20
    invoke-virtual {v2}, Landroid/app/Application;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-static {v2, v12}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_ff

    .line 21
    :cond_c1
    sget-object v2, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 22
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    new-instance v7, Ljava/lang/String;

    .line 23
    sget-object v12, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 24
    check-cast v12, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v12, v4, v6}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->な〱ちぉじ(II)[B

    move-result-object v12

    invoke-direct {v7, v12}, Ljava/lang/String;-><init>([B)V

    invoke-interface {v2, v7, v11}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 25
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 26
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぷちぅぐね()V
    :try_end_e2
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_9b .. :try_end_e2} :catch_ff
    .catch Ljava/lang/Exception; {:try_start_9b .. :try_end_e2} :catch_ff

    .line 27
    :try_start_e2
    sget-object v2, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    .line 28
    invoke-virtual {v2, v10}, Landroid/app/Application;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V
    :try_end_ef
    .catch Ljava/lang/Exception; {:try_start_e2 .. :try_end_ef} :catch_ef

    :catch_ef
    :try_start_ef
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2, v9}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v8}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    goto :goto_a3

    :goto_f8
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    invoke-static {v2}, Landroid/os/Process;->killProcess(I)V
    :try_end_ff
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_ef .. :try_end_ff} :catch_ff
    .catch Ljava/lang/Exception; {:try_start_ef .. :try_end_ff} :catch_ff

    :catch_ff
    :cond_ff
    :try_start_ff
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v7, "I1j\u001aejOb:\u001banH0iHkh\u001c3=AehNdi\u00196<\u001ag"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v2, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    new-instance v7, Ljava/util/Date;

    invoke-direct {v7}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2, v7}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    .line 29
    sget-object v8, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 30
    move-object v9, v8

    check-cast v9, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v9}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v9

    check-cast v8, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v8, v9}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    aget-object v8, v8, v3

    invoke-virtual {v2, v8}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v8

    invoke-virtual {v2, v7}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result v2

    if-gez v2, :cond_1c3

    .line 31
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 32
    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->ぷちぅぐね()V

    const-string v2, "O79A6hKcf\u001b3lA3f\u00194gJji\u0019km@0oJ3=O4"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v8, Ljava/text/SimpleDateFormat;

    const-string v9, "\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v10

    invoke-direct {v8, v9, v10}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v9, Ljava/util/Date;

    invoke-direct {v9}, Ljava/util/Date;-><init>()V

    invoke-virtual {v8, v9}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019glHd<JghA6jKg<\u001dfl\u001d`<A6f\u001adi\u001abn\u001c6;@"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    sget-object v8, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    const v9, 0x7f110105

    .line 34
    invoke-virtual {v8, v9}, Landroid/app/Application;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ざとぅぼこ〺(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 36
    sget-object v7, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    .line 37
    const-class v8, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2, v7, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〱〴なぱへて(Landroid/content/Context;Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_1c3

    new-instance v2, Landroid/content/Intent;

    .line 38
    sget-object v7, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    .line 39
    const-class v8, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    invoke-direct {v2, v7, v8}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v7, "La=\u001b69Ij:M`gI6iHa=JklMj=H0;\u001dkkAf"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 40
    sget-object v7, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    .line 41
    invoke-virtual {v7, v2}, Landroid/app/Application;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_1c1
    .catch Ljava/text/ParseException; {:try_start_ff .. :try_end_1c1} :catch_1c2
    .catch Ljava/lang/Exception; {:try_start_ff .. :try_end_1c1} :catch_1c2

    goto :goto_1c3

    :catch_1c2
    nop

    :cond_1c3
    :goto_1c3
    iget-object v2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->いいにぽつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;

    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v7, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->くし〴〺ぅ:Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;

    iget-object v8, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->ぇぬぎばつ:[B

    invoke-virtual {v7, v8, v6, v4}, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->read([BII)I

    iget-object v7, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->ぇぬぎばつ:[B

    aget-byte v8, v7, v6

    const/16 v9, 0xff

    and-int/2addr v8, v9

    shl-int/lit8 v8, v8, 0x18

    aget-byte v10, v7, v5

    and-int/2addr v10, v9

    shl-int/lit8 v10, v10, 0x10

    or-int/2addr v8, v10

    const/4 v10, 0x2

    aget-byte v11, v7, v10

    and-int/2addr v11, v9

    shl-int/lit8 v11, v11, 0x8

    or-int/2addr v8, v11

    const/4 v11, 0x3

    aget-byte v11, v7, v11

    and-int/2addr v11, v9

    or-int/2addr v8, v11

    aget-byte v7, v7, v3

    and-int/2addr v7, v9

    sget v11, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->ぉざぅち〻:I

    const-string v12, "\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    if-gt v8, v11, :cond_43c

    const/16 v11, 0xc

    if-lt v8, v11, :cond_43c

    sub-int/2addr v8, v7

    sub-int/2addr v8, v5

    if-ltz v8, :cond_428

    if-ge v8, v0, :cond_3f6

    iget-object v11, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->くし〴〺ぅ:Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;

    invoke-virtual {v11, v1, v6, v8}, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->read([BII)I

    iget-object v11, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->くし〴〺ぅ:Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;

    iget-object v13, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->おぐぴう〸ず:[B

    invoke-virtual {v11, v13, v6, v7}, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->read([BII)I

    iget-object v11, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->ぺぁあねじ:Lcom/trilead/ssh2/crypto/digest/MAC;

    if-eqz v11, :cond_25f

    iget-object v11, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->くし〴〺ぅ:Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;

    iget-object v13, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->いいにぽつ:[B

    array-length v14, v13

    invoke-virtual {v11, v13, v6, v14}, Lcom/trilead/ssh2/crypto/cipher/CipherInputStream;->readPlain([BII)I

    iget-object v11, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->ぺぁあねじ:Lcom/trilead/ssh2/crypto/digest/MAC;

    iget v13, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->〺つふすそ:I

    invoke-virtual {v11, v13}, Lcom/trilead/ssh2/crypto/digest/MAC;->initMac(I)V

    iget-object v11, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->ぺぁあねじ:Lcom/trilead/ssh2/crypto/digest/MAC;

    iget-object v13, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->ぇぬぎばつ:[B

    invoke-virtual {v11, v13, v6, v4}, Lcom/trilead/ssh2/crypto/digest/MAC;->update([BII)V

    iget-object v4, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->ぺぁあねじ:Lcom/trilead/ssh2/crypto/digest/MAC;

    invoke-virtual {v4, v1, v6, v8}, Lcom/trilead/ssh2/crypto/digest/MAC;->update([BII)V

    iget-object v4, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->ぺぁあねじ:Lcom/trilead/ssh2/crypto/digest/MAC;

    iget-object v11, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->おぐぴう〸ず:[B

    invoke-virtual {v4, v11, v6, v7}, Lcom/trilead/ssh2/crypto/digest/MAC;->update([BII)V

    iget-object v4, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->ぺぁあねじ:Lcom/trilead/ssh2/crypto/digest/MAC;

    iget-object v7, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->ぺふねづ〺:[B

    invoke-virtual {v4, v7, v6}, Lcom/trilead/ssh2/crypto/digest/MAC;->getMac([BI)V

    const/4 v4, 0x0

    :goto_23f
    iget-object v7, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->いいにぽつ:[B

    array-length v11, v7

    if-ge v4, v11, :cond_25f

    aget-byte v7, v7, v4

    iget-object v11, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->ぺふねづ〺:[B

    aget-byte v11, v11, v4

    if-ne v7, v11, :cond_24f

    add-int/lit8 v4, v4, 0x1

    goto :goto_23f

    :cond_24f
    new-instance v0, Ljava/io/IOException;

    const-string v1, "\u0019`nKehO0:A4i\u001ejf\u001cb9Mkl@d>\u001acg\u001e6nO6m@3nJek\u0019gg\u001d1>L3:\u0019`;\u001dbj@1oIei\u001afiA"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_25f
    iget v4, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->〺つふすそ:I

    add-int/2addr v4, v5

    iput v4, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->〺つふすそ:I

    sget-object v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〳ぜぞぜべっ;->ざとぅぼこ〺:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v4, 0x5a

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "J`=\u001d3fJc:A`=H`:H7l\u001eclK4:\u001c`<A6j\u001e1"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-byte v11, v1, v6

    and-int/2addr v11, v9

    invoke-static {v11}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/〺つふすそ;->げつ〴ぬぐ(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v11, "J1jHgf\u001bck\u001d1fN0gM0:\u001bklO0<A3iNd>@6"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v4, v7}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->げつ〴ぬぐ(ILjava/lang/String;)V

    .line 43
    aget-byte v2, v1, v6

    and-int/2addr v2, v9

    if-ne v2, v10, :cond_2b2

    goto/16 :goto_4

    :cond_2b2
    const/16 v4, 0x7e

    const v7, 0xfffd

    const/16 v10, 0x20

    const-string v11, "\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-ne v2, v3, :cond_315

    sget-object v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->ぇぬぎばつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;

    invoke-direct {v2, v1, v6, v8}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;-><init>([BII)V

    invoke-virtual {v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->〺つふすそ()I

    invoke-virtual {v2}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->げつ〴ぬぐ()Z

    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v2, v11}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->〳ぜぞぜべっ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :goto_2e1
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->length()I

    move-result v2

    if-ge v6, v2, :cond_2f6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuffer;->charAt(I)C

    move-result v2

    if-lt v2, v10, :cond_2f0

    if-gt v2, v4, :cond_2f0

    goto :goto_2f3

    :cond_2f0
    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuffer;->setCharAt(IC)V

    :goto_2f3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2e1

    :cond_2f6
    sget-object v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->ぇぬぎばつ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;

    const/16 v4, 0x32

    const-string v5, "DEBUG Message from remote: \'"

    invoke-static {v5}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\'"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/へぬ〴づぞ/げつ〴ぬぐ;->げつ〴ぬぐ(ILjava/lang/String;)V

    goto/16 :goto_4

    :cond_315
    const/4 v3, 0x3

    if-eq v2, v3, :cond_3e6

    if-ne v2, v5, :cond_394

    new-instance v0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;

    invoke-direct {v0, v1, v6, v8}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;-><init>([BII)V

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->〺つふすそ()I

    invoke-virtual {v0}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->ぺぁあねじ()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v0, v11}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/おぐぴう〸ず/くし〴〺ぅ;->〳ぜぞぜべっ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    if-le v0, v9, :cond_34c

    invoke-virtual {v2, v9}, Ljava/lang/StringBuffer;->setLength(I)V

    const/16 v0, 0xfe

    const/16 v3, 0x2e

    invoke-virtual {v2, v0, v3}, Ljava/lang/StringBuffer;->setCharAt(IC)V

    const/16 v0, 0xfd

    invoke-virtual {v2, v0, v3}, Ljava/lang/StringBuffer;->setCharAt(IC)V

    const/16 v0, 0xfc

    invoke-virtual {v2, v0, v3}, Ljava/lang/StringBuffer;->setCharAt(IC)V

    :cond_34c
    :goto_34c
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    if-ge v6, v0, :cond_361

    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->charAt(I)C

    move-result v0

    if-lt v0, v10, :cond_35b

    if-gt v0, v4, :cond_35b

    goto :goto_35e

    :cond_35b
    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuffer;->setCharAt(IC)V

    :goto_35e
    add-int/lit8 v6, v6, 0x1

    goto :goto_34c

    :cond_361
    new-instance v0, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "O6gI4;\u001bjnA3<\u0019f:\u001e6fNe;Ng;@kl@goAgoHjhM`=\u001bd;IkhHbhIg:LgkKdmK1k\u001aj=Nc>J6>IgoM6iH7f\u001e`lN4mJ3h\u001ac:\u0019fkMkm"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\u001a6>M`mHam\u001d7o\u001dafHjgNbhOf>\u0019`mOjhJf"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_394
    const/16 v3, 0x14

    if-eq v2, v3, :cond_3df

    const/16 v3, 0x15

    if-eq v2, v3, :cond_3df

    const/16 v3, 0x1e

    if-lt v2, v3, :cond_3a5

    const/16 v3, 0x31

    if-gt v2, v3, :cond_3a5

    goto :goto_3df

    :cond_3a5
    const/4 v3, 0x0

    :goto_3a6
    iget-object v4, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->てぜきぽく:Ljava/util/Vector;

    invoke-virtual {v4}, Ljava/util/Vector;->size()I

    move-result v4

    if-ge v6, v4, :cond_3c4

    iget-object v4, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->てぜきぽく:Ljava/util/Vector;

    invoke-virtual {v4, v6}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ$くし〴〺ぅ;

    iget v5, v4, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ$くし〴〺ぅ;->〺つふすそ:I

    if-gt v5, v2, :cond_3c1

    iget v5, v4, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ$くし〴〺ぅ;->くし〴〺ぅ:I

    if-gt v2, v5, :cond_3c1

    iget-object v3, v4, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ$くし〴〺ぅ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/づざかべべ;

    goto :goto_3c4

    :cond_3c1
    add-int/lit8 v6, v6, 0x1

    goto :goto_3a6

    :cond_3c4
    :goto_3c4
    if-eqz v3, :cond_3cb

    invoke-interface {v3, v1, v8}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/づざかべべ;->げつ〴ぬぐ([BI)V

    goto/16 :goto_4

    :cond_3cb
    new-instance v0, Ljava/io/IOException;

    const-string v1, "KblKagK3nAdlIb9I1gO6hK7>A6:K7fM1>Hbo\u001e39MciKffLjoI09K3iI3:Ag;Lam\u001b"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2, v12}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぉひのべい(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3df
    :goto_3df
    iget-object v2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->ぺふねづ〺:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;

    invoke-virtual {v2, v1, v8}, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/〺つふすそ;->げつ〴ぬぐ([BI)V

    goto/16 :goto_4

    :cond_3e6
    new-instance v0, Ljava/io/IOException;

    const-string v1, "H7;\u001b`iA3<Oc>H1g\u001c3o\u001ckf@cgNen\u001dgkHko\u0019k=OfiA1mK7o\u001bc>\u001bc<\u001eg;JalJ`m\u001ccjJd:H1=K7o\u00191kOjjO7kJ1n\u001effJ6;K6;\u001eb=\u001cjkN6j\u001ckmNaj\u00197<Hf<Id<\u001ed=\u001ckmNg9@1"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 44
    :cond_3f6
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Je9Kfh\u001d4<Aeo\u001ebfM4oJa<IgkA39I3:\u00190oKdlJe<A`n\u001bbg\u001bjj\u001cb;LkgO79J6kHk=\u001d"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "Ock\u001ac<Kc=N3<\u001dj:\u001c3nIkiIefIe9\u001dj;\u001aj"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_428
    new-instance v0, Ljava/io/IOException;

    const-string v1, "\u001e`l\u001bflM`=Ld<Nb;\u001d`;\u001da:Oa<Ke:KbjH1o\u0019e;\u001celJckL4>N1:\u001cejMfo\u001bb9\u001c3oNj9@dl\u001aef\u001c0iH4h\u001b7g\u00197:\u001aa:@0<AfnIenJdi"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v7, v12}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぉひのべい(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_43c
    new-instance v0, Ljava/io/IOException;

    const-string v1, "@k<NboJf9\u001djlJa>KdgA6f\u001cbiLamMa;Ac9I4=\u001be9\u001afgI3jJf:MdhKgj@3kK`kO3<I"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v8, v12}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぉひのべい(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_451

    :goto_450
    throw v0

    :goto_451
    goto :goto_450
.end method

.method public ぺふねづ〺(Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/づざかべべ;II)V
    .registers 8

    iget-object v0, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->てぜきぽく:Ljava/util/Vector;

    monitor-enter v0

    const/4 v1, 0x0

    :goto_4
    :try_start_4
    iget-object v2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->てぜきぽく:Ljava/util/Vector;

    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v2

    if-ge v1, v2, :cond_29

    iget-object v2, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->てぜきぽく:Ljava/util/Vector;

    invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ$くし〴〺ぅ;

    iget-object v3, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ$くし〴〺ぅ;->げつ〴ぬぐ:Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/づざかべべ;

    if-ne v3, p1, :cond_26

    iget v3, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ$くし〴〺ぅ;->〺つふすそ:I

    if-ne v3, p2, :cond_26

    iget v2, v2, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ$くし〴〺ぅ;->くし〴〺ぅ:I

    if-ne v2, p3, :cond_26

    iget-object p1, p0, Lなぎぱいぢぎ/ぺぁあねじ/げつ〴ぬぐ/ぉざぅち〻/いいにぽつ;->てぜきぽく:Ljava/util/Vector;

    invoke-virtual {p1, v1}, Ljava/util/Vector;->removeElementAt(I)V

    goto :goto_29

    :cond_26
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_29
    :goto_29
    monitor-exit v0

    return-void

    :catchall_2b
    move-exception p1

    monitor-exit v0
    :try_end_2d
    .catchall {:try_start_4 .. :try_end_2d} :catchall_2b

    goto :goto_2f

    :goto_2e
    throw p1

    :goto_2f
    goto :goto_2e
.end method
