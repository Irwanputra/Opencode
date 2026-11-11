.class public Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public 〳ぜぞぜべっ:Z

.field public 〺つふすそ:[Ljava/lang/String;

.field public ぁごぐすすぃ:Z

.field public くし〴〺ぅ:Ljava/lang/Process;

.field public づざかべべ:Lde/blinkt/openvpn/core/OpenVPNService;

.field public なぎぱいぢぎ:Ljava/lang/String;

.field public びぐびあび:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lde/blinkt/openvpn/core/OpenVPNService;[Ljava/lang/String;Ljava/lang/String;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->ぁごぐすすぃ:Z

    iput-boolean v0, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->〳ぜぞぜべっ:Z

    iput-object p2, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->〺つふすそ:[Ljava/lang/String;

    iput-object p3, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->びぐびあび:Ljava/lang/String;

    iput-object p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNService;

    return-void
.end method


# virtual methods
.method public run()V
    .registers 18

    move-object/from16 v1, p0

    const-string v2, "\n"

    const-string v3, "\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "\u001ccnKeh\u001e09\u001bjh\u001dahM7n@dgOfgM4oJ`iKkh\u001a0iJdo\u001ad9K`fH0m@dj\u001a0h\u001e3kObm@b>N"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "Je;K7lLjfJ6j\u001df;L6h\u001a6kLg:\u001aco\u001bdjLa"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "\u001dk;HghOgoMj<Iko\u001c4h@3oOckIeiLb9\u001e1h\u001d0hNfg\u001bgnMdn@bmIgfO0<N0g\u001e09\u001bk=A"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "HejMbn\u001b4nA4;M1jO4;M4<Nb:O3;J`;Lco@cgHdmKan@4>M6kOgo\u0019bl\u001b0oIei\u001c4m\u0019c>\u001d4:Mg;\u001ebmK4j\u001a4kNaj\u001b3nMai\u00197j\u001cbi\u001edm\u001eem\u001afiLfjLcn\u001b4l\u001ebj\u00197h\u001edmA`j\u001c`"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lde/blinkt/openvpn/core/ConnectionStatus;->ぁごぐすすぃ:Lde/blinkt/openvpn/core/ConnectionStatus;

    const-string v9, "\u001denJeg\u0019anO1;M`nKbgN3=AfhIfi@0;Lc9Lj=\u00191n\u001cfmIf9\u001bd9\u001c0oOb>He9@fjIe;\u001d"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "\u001ejkAemKco\u001agl\u0019cjL7=Ja=\u001e0o\u001ba=\u001cc:\u001db"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "Odo\u001e7fN6m\u001ceh\u001bgg\u001defL4oAem\u001d`k\u001eeo\u001bg=\u001egiAjj\u001c0lN0l\u001dcgIb>\u001bg9\u00194lJag\u001b7k@"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "\u001djf\u001eagIjjO19@j<AamNefJ1fH4=Kc9Mc:Jg<\u001c7fK0i\u001akm\u001dbjI0i\u001bklA7hKb<\u001d`fL"

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "\u001agfHa:\u001acmLe=HeoA49\u001bk;\u001aag\u001dc<H1j\u001d6h\u001cknJ1oJb=L3o@e9I`mJkmJ3<NemIeo\u001e"

    invoke-static {v13}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const v14, 0x7f1101af

    const v15, 0x7f110301

    :try_start_70
    iget-object v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->〺つふすそ:[Ljava/lang/String;

    invoke-virtual {v1, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->げつ〴ぬぐ([Ljava/lang/String;)V
    :try_end_75
    .catch Ljava/lang/Exception; {:try_start_70 .. :try_end_75} :catch_151
    .catchall {:try_start_70 .. :try_end_75} :catchall_14c

    :try_start_75
    iget-object v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->くし〴〺ぅ:Ljava/lang/Process;

    if-eqz v0, :cond_9b

    invoke-virtual {v0}, Ljava/lang/Process;->waitFor()I

    move-result v0
    :try_end_7d
    .catch Ljava/lang/IllegalThreadStateException; {:try_start_75 .. :try_end_7d} :catch_88
    .catch Ljava/lang/InterruptedException; {:try_start_75 .. :try_end_7d} :catch_7e

    goto :goto_9c

    :catch_7e
    move-exception v0

    invoke-static {v12}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    goto :goto_91

    :catch_88
    move-exception v0

    invoke-static {v13}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v0}, Ljava/lang/IllegalThreadStateException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    :goto_91
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->いいにぽつ(Ljava/lang/String;)V

    :cond_9b
    const/4 v0, 0x0

    :goto_9c
    if-eqz v0, :cond_c9

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->いいにぽつ(Ljava/lang/String;)V

    iget-boolean v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->ぁごぐすすぃ:Z

    if-eqz v0, :cond_c9

    iget-object v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->〺つふすそ:[Ljava/lang/String;

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぇいうげ〱〹([Ljava/lang/String;)[Ljava/lang/String;

    iget-object v11, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->〺つふすそ:[Ljava/lang/String;

    invoke-virtual {v0, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_c9

    iput-object v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->〺つふすそ:[Ljava/lang/String;

    invoke-static {v7}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->のぷのちつ(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->run()V

    :cond_c9
    iget-boolean v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->〳ぜぞぜべっ:Z

    if-nez v0, :cond_d0

    invoke-static {v10, v9, v15, v8}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぇ〳〲〺すっ(Ljava/lang/String;Ljava/lang/String;ILde/blinkt/openvpn/core/ConnectionStatus;)V

    :cond_d0
    iget-object v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->なぎぱいぢぎ:Ljava/lang/String;

    if-eqz v0, :cond_146

    :try_start_d4
    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v7, Ljava/io/FileWriter;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->なぎぱいぢぎ:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v7, v5}, Ljava/io/FileWriter;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v7}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    new-instance v5, Ljava/text/SimpleDateFormat;

    sget-object v7, Ljava/util/Locale;->GERMAN:Ljava/util/Locale;

    invoke-direct {v5, v4, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-static {}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->びぐびあび()[Lde/blinkt/openvpn/core/LogItem;

    move-result-object v4

    array-length v7, v4

    const/4 v8, 0x0

    :goto_fc
    if-ge v8, v7, :cond_12c

    aget-object v9, v4, v8

    new-instance v10, Ljava/util/Date;

    .line 1
    iget-wide v11, v9, Lde/blinkt/openvpn/core/LogItem;->なぎぱいぢぎ:J

    .line 2
    invoke-direct {v10, v11, v12}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v5, v10}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v10, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNService;

    invoke-virtual {v9, v10}, Lde/blinkt/openvpn/core/LogItem;->〳ぜぞぜべっ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_fc

    :cond_12c
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V

    invoke-static {v14}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->〳ぜぞぜべっ(I)V
    :try_end_132
    .catch Ljava/io/IOException; {:try_start_d4 .. :try_end_132} :catch_133

    goto :goto_146

    :catch_133
    move-exception v0

    invoke-static {v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->いいにぽつ(Ljava/lang/String;)V

    :cond_146
    :goto_146
    iget-boolean v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->〳ぜぞぜべっ:Z

    if-nez v0, :cond_231

    goto/16 :goto_22c

    :catchall_14c
    move-exception v0

    move-object/from16 v16, v0

    goto/16 :goto_232

    :catch_151
    move-exception v0

    .line 3
    :try_start_152
    sget-object v16, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->げつ〴ぬぐ:Ljava/util/LinkedList;

    .line 4
    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
    :try_end_157
    .catchall {:try_start_152 .. :try_end_157} :catchall_14c

    :try_start_157
    iget-object v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->くし〴〺ぅ:Ljava/lang/Process;

    if-eqz v0, :cond_17d

    invoke-virtual {v0}, Ljava/lang/Process;->waitFor()I

    move-result v0
    :try_end_15f
    .catch Ljava/lang/IllegalThreadStateException; {:try_start_157 .. :try_end_15f} :catch_16a
    .catch Ljava/lang/InterruptedException; {:try_start_157 .. :try_end_15f} :catch_160

    goto :goto_17e

    :catch_160
    move-exception v0

    invoke-static {v12}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    goto :goto_173

    :catch_16a
    move-exception v0

    invoke-static {v13}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v0}, Ljava/lang/IllegalThreadStateException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    :goto_173
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->いいにぽつ(Ljava/lang/String;)V

    :cond_17d
    const/4 v0, 0x0

    :goto_17e
    if-eqz v0, :cond_1ab

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->いいにぽつ(Ljava/lang/String;)V

    iget-boolean v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->ぁごぐすすぃ:Z

    if-eqz v0, :cond_1ab

    iget-object v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->〺つふすそ:[Ljava/lang/String;

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぇいうげ〱〹([Ljava/lang/String;)[Ljava/lang/String;

    iget-object v11, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->〺つふすそ:[Ljava/lang/String;

    invoke-virtual {v0, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1ab

    iput-object v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->〺つふすそ:[Ljava/lang/String;

    invoke-static {v7}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->のぷのちつ(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->run()V

    :cond_1ab
    iget-boolean v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->〳ぜぞぜべっ:Z

    if-nez v0, :cond_1b2

    invoke-static {v10, v9, v15, v8}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぇ〳〲〺すっ(Ljava/lang/String;Ljava/lang/String;ILde/blinkt/openvpn/core/ConnectionStatus;)V

    :cond_1b2
    iget-object v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->なぎぱいぢぎ:Ljava/lang/String;

    if-eqz v0, :cond_228

    :try_start_1b6
    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v7, Ljava/io/FileWriter;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->なぎぱいぢぎ:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v7, v5}, Ljava/io/FileWriter;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v7}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    new-instance v5, Ljava/text/SimpleDateFormat;

    sget-object v7, Ljava/util/Locale;->GERMAN:Ljava/util/Locale;

    invoke-direct {v5, v4, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-static {}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->びぐびあび()[Lde/blinkt/openvpn/core/LogItem;

    move-result-object v4

    array-length v7, v4

    const/4 v8, 0x0

    :goto_1de
    if-ge v8, v7, :cond_20e

    aget-object v9, v4, v8

    new-instance v10, Ljava/util/Date;

    .line 5
    iget-wide v11, v9, Lde/blinkt/openvpn/core/LogItem;->なぎぱいぢぎ:J

    .line 6
    invoke-direct {v10, v11, v12}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v5, v10}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v10, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNService;

    invoke-virtual {v9, v10}, Lde/blinkt/openvpn/core/LogItem;->〳ぜぞぜべっ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_1de

    :cond_20e
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V

    invoke-static {v14}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->〳ぜぞぜべっ(I)V
    :try_end_214
    .catch Ljava/io/IOException; {:try_start_1b6 .. :try_end_214} :catch_215

    goto :goto_228

    :catch_215
    move-exception v0

    invoke-static {v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->いいにぽつ(Ljava/lang/String;)V

    :cond_228
    :goto_228
    iget-boolean v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->〳ぜぞぜべっ:Z

    if-nez v0, :cond_231

    :goto_22c
    iget-object v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNService;

    .line 7
    invoke-virtual {v0}, Lde/blinkt/openvpn/core/OpenVPNService;->ぉひのべい()V

    :cond_231
    return-void

    .line 8
    :goto_232
    :try_start_232
    iget-object v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->くし〴〺ぅ:Ljava/lang/Process;

    if-eqz v0, :cond_258

    invoke-virtual {v0}, Ljava/lang/Process;->waitFor()I

    move-result v0
    :try_end_23a
    .catch Ljava/lang/IllegalThreadStateException; {:try_start_232 .. :try_end_23a} :catch_245
    .catch Ljava/lang/InterruptedException; {:try_start_232 .. :try_end_23a} :catch_23b

    goto :goto_259

    :catch_23b
    move-exception v0

    invoke-static {v12}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    goto :goto_24e

    :catch_245
    move-exception v0

    invoke-static {v13}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v0}, Ljava/lang/IllegalThreadStateException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    :goto_24e
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->いいにぽつ(Ljava/lang/String;)V

    :cond_258
    const/4 v0, 0x0

    :goto_259
    if-eqz v0, :cond_286

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->いいにぽつ(Ljava/lang/String;)V

    iget-boolean v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->ぁごぐすすぃ:Z

    if-eqz v0, :cond_286

    iget-object v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->〺つふすそ:[Ljava/lang/String;

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぇいうげ〱〹([Ljava/lang/String;)[Ljava/lang/String;

    iget-object v11, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->〺つふすそ:[Ljava/lang/String;

    invoke-virtual {v0, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_286

    iput-object v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->〺つふすそ:[Ljava/lang/String;

    invoke-static {v7}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->のぷのちつ(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->run()V

    :cond_286
    iget-boolean v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->〳ぜぞぜべっ:Z

    if-nez v0, :cond_28d

    invoke-static {v10, v9, v15, v8}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぇ〳〲〺すっ(Ljava/lang/String;Ljava/lang/String;ILde/blinkt/openvpn/core/ConnectionStatus;)V

    :cond_28d
    iget-object v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->なぎぱいぢぎ:Ljava/lang/String;

    if-eqz v0, :cond_303

    :try_start_291
    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v7, Ljava/io/FileWriter;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->なぎぱいぢぎ:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v7, v5}, Ljava/io/FileWriter;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v7}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    new-instance v5, Ljava/text/SimpleDateFormat;

    sget-object v7, Ljava/util/Locale;->GERMAN:Ljava/util/Locale;

    invoke-direct {v5, v4, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-static {}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->びぐびあび()[Lde/blinkt/openvpn/core/LogItem;

    move-result-object v4

    array-length v7, v4

    const/4 v8, 0x0

    :goto_2b9
    if-ge v8, v7, :cond_2e9

    aget-object v9, v4, v8

    new-instance v10, Ljava/util/Date;

    .line 9
    iget-wide v11, v9, Lde/blinkt/openvpn/core/LogItem;->なぎぱいぢぎ:J

    .line 10
    invoke-direct {v10, v11, v12}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v5, v10}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v10, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNService;

    invoke-virtual {v9, v10}, Lde/blinkt/openvpn/core/LogItem;->〳ぜぞぜべっ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_2b9

    :cond_2e9
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V

    invoke-static {v14}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->〳ぜぞぜべっ(I)V
    :try_end_2ef
    .catch Ljava/io/IOException; {:try_start_291 .. :try_end_2ef} :catch_2f0

    goto :goto_303

    :catch_2f0
    move-exception v0

    invoke-static {v6}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->いいにぽつ(Ljava/lang/String;)V

    :cond_303
    :goto_303
    iget-boolean v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->〳ぜぞぜべっ:Z

    if-nez v0, :cond_30c

    iget-object v0, v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNService;

    .line 11
    invoke-virtual {v0}, Lde/blinkt/openvpn/core/OpenVPNService;->ぉひのべい()V

    .line 12
    :cond_30c
    goto :goto_30e

    :goto_30d
    throw v16

    :goto_30e
    goto :goto_30d
.end method

.method public final げつ〴ぬぐ([Ljava/lang/String;)V
    .registers 11

    sget-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    invoke-static {v1, p1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    new-instance v2, Ljava/lang/ProcessBuilder;

    invoke-direct {v2, v1}, Ljava/lang/ProcessBuilder;-><init>(Ljava/util/List;)V

    const/4 v1, 0x0

    .line 1
    aget-object p1, p1, v1

    const-string v3, "I19H6g\u001cjlJ4>\u001e4:\u001b3hJ4o\u001a7>Og9@f9Na"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "\u001cjmKk9Ok;M09\u001ee9A3fNbhIc;OagOekJk"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v3, v4}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2}, Ljava/lang/ProcessBuilder;->environment()Ljava/util/Map;

    move-result-object v3

    const-string v4, "\u001dd>A0iN0hN0iJ09\u001d0k\u001df=K`nKglMam\u001c3"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v5, "\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v3, :cond_4c

    move-object v3, p1

    goto :goto_50

    :cond_4c
    invoke-static {p1, v5, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :goto_50
    iget-object v6, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->びぐびあび:Ljava/lang/String;

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6c

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->びぐびあび:Ljava/lang/String;

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 2
    :cond_6c
    invoke-virtual {v2}, Ljava/lang/ProcessBuilder;->environment()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-virtual {v2, p1}, Ljava/lang/ProcessBuilder;->redirectErrorStream(Z)Ljava/lang/ProcessBuilder;

    :try_start_77
    invoke-virtual {v2}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    move-result-object v2

    iput-object v2, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->くし〴〺ぅ:Ljava/lang/Process;

    invoke-virtual {v2}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    iget-object v2, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->くし〴〺ぅ:Ljava/lang/Process;

    invoke-virtual {v2}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    new-instance v3, Ljava/io/BufferedReader;

    new-instance v4, Ljava/io/InputStreamReader;

    invoke-direct {v4, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v3, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    :goto_94
    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_9b

    return-void

    :cond_9b
    const-string v4, "\u001e3lL3<HggN7=K3<Nc9\u001c0i\u001ddjOeiHg:@e"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_b3

    const/16 v4, 0xb

    invoke-virtual {v2, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->なぎぱいぢぎ:Ljava/lang/String;

    :cond_b3
    const-string v4, "\u001d4nOj:\u001ea;@diIa:Kf>\u001d7nNbjO4>@b=JdjLei\u001ee>\u0019gmOdoLf9L0mHf:KfjNki\u001egoJ6=Ab;\u0019kh\u00190g\u001eeoK4:JgmN`>\u001ebmK3mHbl"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_d3

    const-string v4, "M7lAk;\u0019a;Nj:Ijh\u001ejoN4kMk:Maf\u001b1oIe"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_d5

    :cond_d3
    iput-boolean p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->ぁごぐすすぃ:Z

    :cond_d5
    const-string v4, "(\\d+).(\\d+) ([0-9a-f])+ (.*)"

    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    move-result v5

    if-eqz v5, :cond_172

    const/4 v2, 0x3

    invoke-virtual {v4, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    const/16 v5, 0x10

    invoke-static {v2, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v2

    const/4 v5, 0x4

    invoke-virtual {v4, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v4

    and-int/lit8 v6, v2, 0xf

    sget-object v7, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    and-int/lit8 v8, v2, 0x10

    if-eqz v8, :cond_100

    sget-object v7, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    goto :goto_111

    :cond_100
    and-int/lit8 v8, v2, 0x20

    if-eqz v8, :cond_105

    goto :goto_109

    :cond_105
    and-int/lit8 v8, v2, 0x40

    if-eqz v8, :cond_10b

    :goto_109
    move-object v7, v0

    goto :goto_111

    :cond_10b
    and-int/lit16 v2, v2, 0x80

    if-eqz v2, :cond_111

    sget-object v7, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;->なぎぱいぢぎ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    :cond_111
    :goto_111
    const-string v2, "Ha;M3<I0iHa;M6lLckMcoMcf\u001e7mJajHa"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_125

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    :cond_125
    const-string v2, "LjmOd=\u001edjH0:\u001bd=\u001d`k@gnL3=\u001admMe9\u001c`"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_145

    const-string v2, "Kb9\u001a6o\u001d4:Od<\u001cahI0jKbj\u001afg\u001a0oL1l\u001ed"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_155

    :cond_145
    const-string v2, "Akk\u001a49Lb<Ajl\u001d1g@19HjkMgjAjh\u001c`9\u001cd"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_157

    :cond_155
    const/4 v2, 0x1

    goto :goto_158

    :cond_157
    const/4 v2, 0x0

    .line 3
    :goto_158
    sget-object v5, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->げつ〴ぬぐ:Ljava/util/LinkedList;

    new-instance v5, Lde/blinkt/openvpn/core/LogItem;

    invoke-direct {v5, v7, v6, v4}, Lde/blinkt/openvpn/core/LogItem;-><init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;ILjava/lang/String;)V

    .line 4
    invoke-static {v5, v1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ざとぅぼこ〺(Lde/blinkt/openvpn/core/LogItem;Z)V

    if-ne v2, p1, :cond_18e

    const-string v2, "Ofo\u001cc=\u001ca=I1n\u001ccoA0fL1:\u0019cf\u001b0m@jgJ3:McmH3>Jbo\u001e7jNg<Me;\u001akl\u001cahMgo\u001c6lIchHciL1<Lb9L7o\u001ea;J49Acl\u00196l@gn\u00190fOk=\u001bb<L`<M1i\u001e7<\u001ebl\u001b`k\u001b6>Jei\u001adf\u001ekf\u0019co\u001c6g\u00191;\u001dgkOc;@6k\u001e7<Ja:@b<\u001ag;\u001e6<Ogn\u001ckl\u001bkg\u001d0n\u0019ffOko\u00190iL1jHdj\u0019k="

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 5
    invoke-static {v2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->いいにぽつ(Ljava/lang/String;)V

    goto :goto_18e

    :cond_172
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Nk=JffA69\u001e0hO1;Kf<HakHfnA1i\u001aa=A1"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->のぷのちつ(Ljava/lang/String;)V

    :cond_18e
    :goto_18e
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v2

    if-nez v2, :cond_196

    goto/16 :goto_94

    :cond_196
    new-instance p1, Ljava/lang/InterruptedException;

    const-string v0, "M1>A7g\u001d6m\u001dfjM1=O0oKe>O0i\u001dg=Lam\u001e7oOe9\u0019jn\u001ac<\u001d3hOkn\u001a1:\u00194=Ob9Je9Nc:A7=OghHef\u001e1>\u001cbkOc=\u001a7;H49@flOkfKgi"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1a6
    .catch Ljava/lang/InterruptedException; {:try_start_77 .. :try_end_1a6} :catch_1a6
    .catch Ljava/io/IOException; {:try_start_77 .. :try_end_1a6} :catch_1a6

    .line 6
    :catch_1a6
    sget-object p1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->げつ〴ぬぐ:Ljava/util/LinkedList;

    .line 7
    iget-object p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->くし〴〺ぅ:Ljava/lang/Process;

    invoke-virtual {p1}, Ljava/lang/Process;->destroy()V

    return-void
.end method
