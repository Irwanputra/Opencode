.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;
.super Ljava/lang/Thread;
.source ""


# instance fields
.field public 〳ぜぞぜべっ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

.field public 〺つふすそ:Ljava/io/InputStream;

.field public ぁごぐすすぃ:I

.field public くし〴〺ぅ:Ljava/io/OutputStream;

.field public づざかべべ:Ljava/net/Socket;

.field public なぎぱいぢぎ:Z

.field public びぐびあび:Ljava/net/Socket;


# direct methods
.method public constructor <init>(Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;Ljava/net/Socket;Ljava/net/Socket;Z)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    iput-object p2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->びぐびあび:Ljava/net/Socket;

    iput-object p3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->づざかべべ:Ljava/net/Socket;

    invoke-virtual {p2}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object p2

    iput-object p2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->〺つふすそ:Ljava/io/InputStream;

    iget-object p2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->づざかべべ:Ljava/net/Socket;

    invoke-virtual {p2}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p2

    iput-object p2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/io/OutputStream;

    iput-boolean p4, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->なぎぱいぢぎ:Z

    iput-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->〳ぜぞぜべっ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    return-void
.end method


# virtual methods
.method public run()V
    .registers 23

    move-object/from16 v1, p0

    const-string v0, "J0lOd<NbhHco@`=Ig;I`lOc<\u001cag\u001dj<L`lMbf\u001de;\u001a3>H4n\u001a7g@1nHgoKki\u00191kNdn\u001dboMa<IfnKd9K`j\u001dem\u00197>K7o\u001e69H6h\u001egk"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "\u001danMajN`n@4oO7=I09@ffI7fOe=OjkId"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "\u001af9A7hO3iO`iK`kM6:\u001ef;JekL1f\u001aao@k"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "\u001ae=K3fJ1nN7fL7mM`n@kg\u001b3m\u001a1jNc>Mk"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "H3nMjfIkmH3kHemN0lJ0kKjf\u001bc;\u001ejjHk"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "La=\u001b69Ij:M`gI6iHa=JklMj=H0;\u001dkkAf"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    :try_start_3e
    iget-boolean v7, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->なぎぱいぢぎ:Z

    if-eqz v7, :cond_47

    const/16 v7, 0x4000

    new-array v7, v7, [B

    goto :goto_4c

    :cond_47
    const v7, 0x8000

    new-array v7, v7, [B

    :goto_4c
    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v8

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v9

    check-cast v9, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v9}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v9

    check-cast v8, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v8, v9}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x4

    aget-object v8, v8, v9

    const-string v10, "Ae:MdhKa>\u001cbg\u001cd:Ogf\u00190kAkjKbm\u0019ajHa"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8
    :try_end_71
    .catch Ljava/lang/Exception; {:try_start_3e .. :try_end_71} :catch_6dc
    .catchall {:try_start_3e .. :try_end_71} :catchall_197

    const-string v10, "\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "Lb9J3nJ6iI1h\u001ajk\u001ef:AffM3g\u0019a>\u001be=\u001aa"

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    if-nez v8, :cond_50d

    :try_start_91
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_93
    .catch Ljava/lang/Exception; {:try_start_91 .. :try_end_93} :catch_447
    .catchall {:try_start_91 .. :try_end_93} :catchall_197

    const/16 v15, 0x11

    const-string v9, "O`;Lfl\u001a3;\u0019gfL0<\u001b39L4fNflM0oOdk\u001cd"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v13, "\u001edfAk:\u001dj:M19A4nN1;Oeg\u001dgfAk>\u001e1lLg"

    invoke-static {v13}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v8, "Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019glHd<JghA6jKg<\u001dfl\u001d`<A6f\u001adi\u001abn\u001c6;@"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-lt v14, v15, :cond_19a

    :try_start_b5
    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v14

    invoke-virtual {v14}, Landroid/app/Application;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v14

    invoke-static {v14, v13}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v13

    if-eqz v13, :cond_d1

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v13

    invoke-virtual {v13}, Landroid/app/Application;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v13

    invoke-static {v13, v9}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v9

    if-nez v9, :cond_1b8

    :cond_d1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v7, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v9

    invoke-direct {v7, v10, v9}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v9, Ljava/util/Date;

    invoke-direct {v9}, Ljava/util/Date;-><init>()V

    invoke-virtual {v7, v9}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v7

    const v8, 0x7f11010b

    invoke-virtual {v7, v8}, Landroid/app/Application;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v12, v2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ざとぅぼこ〺(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v2

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v7

    const-class v8, Lteam/dev/epro/apkcustom/sockets/Tun2SocksService;

    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2, v7, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〱〴なぱへて(Landroid/content/Context;Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_12d

    new-instance v2, Landroid/content/Intent;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v7

    const-class v8, Lteam/dev/epro/apkcustom/sockets/Tun2SocksService;

    invoke-direct {v2, v7, v8}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v2, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v7

    invoke-virtual {v7, v2}, Landroid/app/Application;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :cond_12d
    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v2

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v7

    const-class v8, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2, v7, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〱〴なぱへて(Landroid/content/Context;Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_154

    new-instance v2, Landroid/content/Intent;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v7

    const-class v8, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    invoke-direct {v2, v7, v8}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v2, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v7

    invoke-virtual {v7, v2}, Landroid/app/Application;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :cond_154
    iget-object v2, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->〺つふすそ:Ljava/io/InputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    iget-object v2, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/io/OutputStream;

    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const/4 v7, 0x0

    invoke-interface {v2, v5, v7}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2, v4, v7}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2, v3, v7}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_18c
    .catch Ljava/lang/Exception; {:try_start_b5 .. :try_end_18c} :catch_447
    .catchall {:try_start_b5 .. :try_end_18c} :catchall_197

    :try_start_18c
    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->〺つふすそ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_196
    .catch Ljava/lang/Exception; {:try_start_18c .. :try_end_196} :catch_196

    :catch_196
    return-void

    :catchall_197
    move-exception v0

    goto/16 :goto_6d1

    :cond_19a
    :try_start_19a
    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v14

    invoke-virtual {v14}, Landroid/app/Application;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v14

    invoke-static {v14, v13}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v13

    if-eqz v13, :cond_381

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v13

    invoke-virtual {v13}, Landroid/app/Application;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v13

    invoke-static {v13, v9}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v9
    :try_end_1b4
    .catch Ljava/lang/Exception; {:try_start_19a .. :try_end_1b4} :catch_447
    .catchall {:try_start_19a .. :try_end_1b4} :catchall_197

    if-nez v9, :cond_1b8

    goto/16 :goto_381

    :cond_1b8
    :try_start_1b8
    new-instance v13, Ljava/text/SimpleDateFormat;

    const-string v14, "I1j\u001aejOb:\u001banH0iHkh\u001c3=AehNdi\u00196<\u001ag"

    invoke-static {v14}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-direct {v13, v14}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    new-instance v14, Ljava/util/Date;

    invoke-direct {v14}, Ljava/util/Date;-><init>()V

    invoke-virtual {v13, v14}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v14

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v15

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v16

    check-cast v16, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual/range {v16 .. v16}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v9

    check-cast v15, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v15, v9}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    const/4 v15, 0x4

    aget-object v9, v9, v15

    invoke-virtual {v13, v9}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v9

    invoke-virtual {v13, v14}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v13

    invoke-virtual {v9, v13}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result v9

    if-gez v9, :cond_50d

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v7, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v9

    invoke-direct {v7, v10, v9}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v9, Ljava/util/Date;

    invoke-direct {v9}, Ljava/util/Date;-><init>()V

    invoke-virtual {v7, v9}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v7

    const v8, 0x7f110105

    invoke-virtual {v7, v8}, Landroid/app/Application;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v12, v2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ざとぅぼこ〺(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v2

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v7

    const-class v8, Lteam/dev/epro/apkcustom/sockets/Tun2SocksService;

    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2, v7, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〱〴なぱへて(Landroid/content/Context;Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_251

    new-instance v2, Landroid/content/Intent;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v7

    const-class v8, Lteam/dev/epro/apkcustom/sockets/Tun2SocksService;

    invoke-direct {v2, v7, v8}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v2, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v7

    invoke-virtual {v7, v2}, Landroid/app/Application;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :cond_251
    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v2

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v7

    const-class v8, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2, v7, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〱〴なぱへて(Landroid/content/Context;Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_278

    new-instance v2, Landroid/content/Intent;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v7

    const-class v8, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    invoke-direct {v2, v7, v8}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v2, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v7

    invoke-virtual {v7, v2}, Landroid/app/Application;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :cond_278
    iget-object v2, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->〺つふすそ:Ljava/io/InputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    iget-object v2, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/io/OutputStream;

    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const/4 v7, 0x0

    invoke-interface {v2, v5, v7}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2, v4, v7}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2, v3, v7}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_2b0
    .catch Ljava/lang/Exception; {:try_start_1b8 .. :try_end_2b0} :catch_2bb
    .catchall {:try_start_1b8 .. :try_end_2b0} :catchall_197

    :try_start_2b0
    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->〺つふすそ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_2ba
    .catch Ljava/lang/Exception; {:try_start_2b0 .. :try_end_2ba} :catch_2ba

    :catch_2ba
    return-void

    :catch_2bb
    :try_start_2bb
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v7, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v8

    invoke-direct {v7, v10, v8}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v8, Ljava/util/Date;

    invoke-direct {v8}, Ljava/util/Date;-><init>()V

    invoke-virtual {v7, v8}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v0

    const v7, 0x7f110105

    invoke-virtual {v0, v7}, Landroid/app/Application;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v12, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ざとぅぼこ〺(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v0

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v2

    const-class v7, Lteam/dev/epro/apkcustom/sockets/Tun2SocksService;

    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v0, v2, v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〱〴なぱへて(Landroid/content/Context;Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_317

    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v2

    const-class v7, Lteam/dev/epro/apkcustom/sockets/Tun2SocksService;

    invoke-direct {v0, v2, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/app/Application;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :cond_317
    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v0

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v2

    const-class v7, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v0, v2, v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〱〴なぱへて(Landroid/content/Context;Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_33e

    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v2

    const-class v7, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    invoke-direct {v0, v2, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/app/Application;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :cond_33e
    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->〺つふすそ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v0, v5, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v4, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_376
    .catch Ljava/lang/Exception; {:try_start_2bb .. :try_end_376} :catch_6dc
    .catchall {:try_start_2bb .. :try_end_376} :catchall_197

    :try_start_376
    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->〺つふすそ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_380
    .catch Ljava/lang/Exception; {:try_start_376 .. :try_end_380} :catch_380

    :catch_380
    return-void

    :cond_381
    :goto_381
    :try_start_381
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v7, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v9

    invoke-direct {v7, v10, v9}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v9, Ljava/util/Date;

    invoke-direct {v9}, Ljava/util/Date;-><init>()V

    invoke-virtual {v7, v9}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v7

    const v8, 0x7f11010b

    invoke-virtual {v7, v8}, Landroid/app/Application;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v12, v2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ざとぅぼこ〺(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v2

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v7

    const-class v8, Lteam/dev/epro/apkcustom/sockets/Tun2SocksService;

    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2, v7, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〱〴なぱへて(Landroid/content/Context;Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_3dd

    new-instance v2, Landroid/content/Intent;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v7

    const-class v8, Lteam/dev/epro/apkcustom/sockets/Tun2SocksService;

    invoke-direct {v2, v7, v8}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v2, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v7

    invoke-virtual {v7, v2}, Landroid/app/Application;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :cond_3dd
    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v2

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v7

    const-class v8, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2, v7, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〱〴なぱへて(Landroid/content/Context;Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_404

    new-instance v2, Landroid/content/Intent;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v7

    const-class v8, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    invoke-direct {v2, v7, v8}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v2, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v7

    invoke-virtual {v7, v2}, Landroid/app/Application;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :cond_404
    iget-object v2, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->〺つふすそ:Ljava/io/InputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    iget-object v2, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/io/OutputStream;

    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const/4 v7, 0x0

    invoke-interface {v2, v5, v7}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2, v4, v7}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2, v3, v7}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_43c
    .catch Ljava/lang/Exception; {:try_start_381 .. :try_end_43c} :catch_447
    .catchall {:try_start_381 .. :try_end_43c} :catchall_197

    :try_start_43c
    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->〺つふすそ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_446
    .catch Ljava/lang/Exception; {:try_start_43c .. :try_end_446} :catch_446

    :catch_446
    return-void

    :catch_447
    :try_start_447
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v7, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v8

    invoke-direct {v7, v10, v8}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v8, Ljava/util/Date;

    invoke-direct {v8}, Ljava/util/Date;-><init>()V

    invoke-virtual {v7, v8}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v0

    const v7, 0x7f11010b

    invoke-virtual {v0, v7}, Landroid/app/Application;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v12, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ざとぅぼこ〺(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v0

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v2

    const-class v7, Lteam/dev/epro/apkcustom/sockets/Tun2SocksService;

    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v0, v2, v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〱〴なぱへて(Landroid/content/Context;Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_4a3

    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v2

    const-class v7, Lteam/dev/epro/apkcustom/sockets/Tun2SocksService;

    invoke-direct {v0, v2, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/app/Application;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :cond_4a3
    invoke-static {}, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ()Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    move-result-object v0

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v2

    const-class v7, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v0, v2, v7}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〱〴なぱへて(Landroid/content/Context;Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_4ca

    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v2

    const-class v7, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;

    invoke-direct {v0, v2, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->げつ〴ぬぐ()Lteam/dev/epro/apkcustom/App;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/app/Application;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :cond_4ca
    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->〺つふすそ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v0, v5, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v4, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_502
    .catch Ljava/lang/Exception; {:try_start_447 .. :try_end_502} :catch_6dc
    .catchall {:try_start_447 .. :try_end_502} :catchall_197

    :try_start_502
    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->〺つふすそ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_50c
    .catch Ljava/lang/Exception; {:try_start_502 .. :try_end_50c} :catch_50c

    :catch_50c
    return-void

    :cond_50d
    :try_start_50d
    iget-object v8, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->〺つふすそ:Ljava/io/InputStream;

    invoke-virtual {v8, v7}, Ljava/io/InputStream;->read([B)I

    move-result v8

    if-gez v8, :cond_52b

    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->〺つふすそ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_51f
    .catch Ljava/lang/Exception; {:try_start_50d .. :try_end_51f} :catch_6dc
    .catchall {:try_start_50d .. :try_end_51f} :catchall_197

    :try_start_51f
    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->〺つふすそ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    :goto_524
    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_529
    .catch Ljava/lang/Exception; {:try_start_51f .. :try_end_529} :catch_6e3

    goto/16 :goto_6e3

    :cond_52b
    :try_start_52b
    iget-boolean v9, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->なぎぱいぢぎ:Z

    if-nez v9, :cond_6c2

    new-instance v9, Ljava/lang/String;

    const/4 v13, 0x0

    invoke-direct {v9, v7, v13, v8}, Ljava/lang/String;-><init>([BII)V

    const/16 v17, 0x1

    const/16 v18, 0x0

    const-string v19, "M`gOkkLkoJ7o\u001c1;\u001d79K`:Mem\u001af9\u0019dh\u001ec"

    invoke-static/range {v19 .. v19}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v19 .. v19}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    const/16 v20, 0x0

    const/16 v21, 0x5

    move-object/from16 v16, v9

    invoke-virtual/range {v16 .. v21}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v13

    if-eqz v13, :cond_6bc

    iget-object v13, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->〳ぜぞぜべっ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;

    invoke-virtual {v13}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〺つふすそ;->ぺふねづ〺()V

    const-string v13, "\r\n"

    invoke-virtual {v9, v13}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    const/4 v13, 0x0

    aget-object v14, v9, v13

    const/16 v13, 0x9

    const/16 v15, 0xc

    invoke-virtual {v14, v13, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v13

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v14

    const/4 v15, 0x1

    invoke-interface {v14, v2, v15}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v14

    if-eqz v14, :cond_5aa

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v15, Ljava/text/SimpleDateFormat;

    move-object/from16 v16, v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-direct {v15, v10, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v15, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\u001dg;JjmH`mA`oN4hK3=@1mNd>Nf=\u001cf;Hc"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    aget-object v15, v9, v0

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v12, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5ac

    :cond_5aa
    move-object/from16 v16, v0

    :goto_5ac
    const-string v0, "K39A0;K`>O0k\u0019emAfn\u0019klAe=Nd<H4jJ3"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    iput v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->ぁごぐすすぃ:I

    if-gez v0, :cond_6b8

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v13, "\u001eb>@chKgoLdoM6<NglH1:JkkKd;@f>\u001bc"

    invoke-static {v13}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x1

    invoke-interface {v0, v13, v14}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_6b1

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, v2, v14}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_60e

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v8, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v13

    invoke-direct {v8, v10, v13}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v13, Ljava/util/Date;

    invoke-direct {v13}, Ljava/util/Date;-><init>()V

    invoke-virtual {v8, v13}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "\u001cjkK0k\u001cjiAe:@09AaiK4:\u001balI6<K0nId9\u00191<\u00190;\u001b3k\u001d7nL6>Kf:\u001e7gIdjN3fMehM"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v12, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    :cond_60e
    const/4 v0, 0x0

    aget-object v0, v9, v0

    const-string v8, "O4nLc;HckJdj\u001a0nNa9\u001dc=Ofm\u001c6fJ6<\u001ba"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_669

    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v0

    const/4 v8, 0x1

    invoke-interface {v0, v2, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_65d

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v8, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v9

    invoke-direct {v8, v10, v9}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v9, Ljava/util/Date;

    invoke-direct {v9}, Ljava/util/Date;-><init>()V

    invoke-virtual {v8, v9}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "Hc>M`h\u001b1iAam\u001bcjM`o\u001ck;\u001b1g\u001c0oMjnJb=\u001a`lNaoA`>\u0019emNd;\u001bjm\u001ccmJ6f\u0019e:\u001behK"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v12, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    :cond_65d
    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/io/OutputStream;

    const-string v8, "HTTP/1.1 200 OK\r\n\r\n"

    invoke-virtual {v8}, Ljava/lang/String;->getBytes()[B

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/io/OutputStream;->write([B)V

    goto :goto_6c8

    :cond_669
    invoke-static {}, Lteam/dev/epro/apkcustom/App;->〺つふすそ()Landroid/content/SharedPreferences;

    move-result-object v0

    const/4 v8, 0x1

    invoke-interface {v0, v2, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_6a5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v8, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v9

    invoke-direct {v8, v10, v9}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v9, Ljava/util/Date;

    invoke-direct {v9}, Ljava/util/Date;-><init>()V

    invoke-virtual {v8, v9}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "I`kLg>LbnH6lJ0i\u001a1n@gi\u001c`h\u001c0kM0kL7:Nfo\u001a6hM7;Lf;\u001c1;I0gI1n\u001b7:\u001dgm\u001b4mI"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v12, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6a5
    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/io/OutputStream;

    const-string v8, "HTTP/1.0 200 Connection established\r\n\r\n"

    invoke-virtual {v8}, Ljava/lang/String;->getBytes()[B

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/io/OutputStream;->write([B)V

    goto :goto_6c8

    :cond_6b1
    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/io/OutputStream;

    const/4 v9, 0x0

    :goto_6b4
    invoke-virtual {v0, v7, v9, v8}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_6c8

    :cond_6b8
    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/io/OutputStream;

    const/4 v9, 0x0

    goto :goto_6b4

    :cond_6bc
    move-object/from16 v16, v0

    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/io/OutputStream;

    const/4 v9, 0x0

    goto :goto_6b4

    :cond_6c2
    move-object/from16 v16, v0

    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/io/OutputStream;

    const/4 v9, 0x0

    goto :goto_6b4

    :goto_6c8
    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_6cd
    .catch Ljava/lang/Exception; {:try_start_52b .. :try_end_6cd} :catch_6dc
    .catchall {:try_start_52b .. :try_end_6cd} :catchall_197

    move-object/from16 v0, v16

    goto/16 :goto_4c

    :goto_6d1
    :try_start_6d1
    iget-object v2, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->〺つふすそ:Ljava/io/InputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    iget-object v2, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/io/OutputStream;

    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_6db
    .catch Ljava/lang/Exception; {:try_start_6d1 .. :try_end_6db} :catch_6db

    :catch_6db
    throw v0

    :catch_6dc
    :try_start_6dc
    iget-object v0, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/くし〴〺ぅ;->〺つふすそ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_6e1
    .catch Ljava/lang/Exception; {:try_start_6dc .. :try_end_6e1} :catch_6e3

    goto/16 :goto_524

    :catch_6e3
    :goto_6e3
    return-void
.end method
