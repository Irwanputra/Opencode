.class public Lde/blinkt/openvpn/core/OpenVPNService$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lde/blinkt/openvpn/core/OpenVPNService;->onStartCommand(Landroid/content/Intent;II)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lde/blinkt/openvpn/core/OpenVPNService;


# direct methods
.method public constructor <init>(Lde/blinkt/openvpn/core/OpenVPNService;)V
    .registers 2

    iput-object p1, p0, Lde/blinkt/openvpn/core/OpenVPNService$〺つふすそ;->〺つふすそ:Lde/blinkt/openvpn/core/OpenVPNService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 16

    iget-object v0, p0, Lde/blinkt/openvpn/core/OpenVPNService$〺つふすそ;->〺つふすそ:Lde/blinkt/openvpn/core/OpenVPNService;

    .line 1
    sget-boolean v1, Lde/blinkt/openvpn/core/OpenVPNService;->どぇぞほだ:Z

    .line 2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    sget-object v1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v2, "\u0019jkL1<\u001b3o\u00190o\u001djf\u001c`;H1n\u00193=\u001ebg\u001e7mMf"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    .line 4
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_33

    .line 5
    sget-object v1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v2, "\u001c1m\u001d1jKjhOdn\u00190:MciNen\u001b4oKfj\u001ae9\u001bf"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 6
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_33

    .line 7
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 8
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->〴ねぷぐくぼ()V

    :cond_33
    :try_start_33
    iget-object v1, v0, Lde/blinkt/openvpn/core/OpenVPNService;->〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljava/io/FileWriter;

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぇ〳〲〺すっ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/io/FileWriter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0, v3}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/io/FileWriter;->write(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/FileWriter;->flush()V

    invoke-virtual {v2}, Ljava/io/FileWriter;->close()V
    :try_end_4e
    .catch Ljava/io/IOException; {:try_start_33 .. :try_end_4e} :catch_2c2

    .line 10
    invoke-virtual {v0}, Landroid/net/VpnService;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    .line 11
    new-instance v2, Ljava/util/Vector;

    invoke-direct {v2}, Ljava/util/Vector;-><init>()V

    .line 12
    invoke-static {}, Lde/blinkt/openvpn/core/NativeUtils;->げつ〴ぬぐ()Ljava/lang/String;

    move-result-object v4

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1c

    const/4 v7, 0x1

    if-lt v5, v6, :cond_7f

    new-instance v3, Ljava/io/File;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v4

    iget-object v4, v4, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    const-string v5, "H0mLe<@f:N0o@`kH7:J6nK7<N6k\u001ejm\u001e`"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    goto/16 :goto_17c

    :cond_7f
    const/16 v6, 0x15

    const/4 v8, 0x2

    if-lt v5, v6, :cond_87

    .line 13
    sget-object v5, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    goto :goto_91

    :cond_87
    new-array v5, v8, [Ljava/lang/String;

    .line 14
    sget-object v6, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    aput-object v6, v5, v3

    sget-object v6, Landroid/os/Build;->CPU_ABI2:Ljava/lang/String;

    aput-object v6, v5, v7

    :goto_91
    aget-object v6, v5, v3

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_ad

    const v6, 0x7f110030

    new-array v8, v8, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v8, v3

    aput-object v4, v8, v7

    invoke-static {v6, v8}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぇぬぎばつ(I[Ljava/lang/Object;)V

    new-array v5, v7, [Ljava/lang/String;

    aput-object v4, v5, v3

    :cond_ad
    array-length v3, v5

    const/4 v4, 0x0

    :goto_af
    if-ge v4, v3, :cond_2ab

    aget-object v6, v5, v4

    new-instance v7, Ljava/io/File;

    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v8

    const-string v9, "\u00193l\u001a`gNehO`=\u001a7o\u001abkHbkOej\u001b6j\u00190<M0"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    .line 15
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    const-string v11, "\u001ae:\u001bb9Jc>Hg:KbjMfj\u001dbiI6g\u001cklLd9\u0019e"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "@k>Lb;Oe9\u001ddkIkhIkmMb>H1iH0h@khOd"

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const/16 v13, 0x10

    if-lt v10, v13, :cond_e3

    move-object v14, v11

    goto :goto_e4

    :cond_e3
    move-object v14, v12

    .line 16
    :goto_e4
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, "K7kM7<\u0019d>\u001c1<\u00194f\u001e4:O79Iji\u001cdkAbo\u001dk"

    invoke-static {v14}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v7, v8, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v8

    if-eqz v8, :cond_10a

    invoke-virtual {v7}, Ljava/io/File;->canExecute()Z

    move-result v8

    if-nez v8, :cond_178

    .line 17
    :cond_10a
    :try_start_10a
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    if-lt v10, v13, :cond_116

    goto :goto_117

    :cond_116
    move-object v11, v12

    :goto_117
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v6
    :try_end_128
    .catch Ljava/io/IOException; {:try_start_10a .. :try_end_128} :catch_156

    :try_start_128
    new-instance v8, Ljava/io/FileOutputStream;

    invoke-direct {v8, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const/16 v9, 0x1000

    new-array v9, v9, [B

    :goto_131
    invoke-virtual {v6, v9}, Ljava/io/InputStream;->read([B)I

    move-result v10

    if-lez v10, :cond_13c

    const/4 v11, 0x0

    invoke-virtual {v8, v9, v11, v10}, Ljava/io/FileOutputStream;->write([BII)V

    goto :goto_131

    :cond_13c
    invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V

    const/4 v6, 0x1

    invoke-virtual {v7, v6}, Ljava/io/File;->setExecutable(Z)Z

    move-result v6

    if-nez v6, :cond_154

    const-string v6, "K4k\u001d0o\u001bal\u0019aoNkk\u001b`f\u001cgg\u001cbn\u001bc<Ab9Agi\u001a7g\u001eemI0gMc9M6mMjl\u001dafOk>N4<J0k\u001a6=L7kMe<\u001d3h\u001d3>\u001e6fL7=\u001c1;HkgLg9\u001del"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->いいにぽつ(Ljava/lang/String;)V

    goto :goto_175

    :cond_154
    const/4 v6, 0x1

    goto :goto_176

    :catch_156
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "\u001b7<LjoA6:O4kN3f\u0019bh\u001dd>Ncg\u001c6oLb;Kc9\u001aa>\u001be=Lk>\u0019f=Hf:A4hHkhO1n\u0019aj\u001c1gO`o@1i@7i@ei\u00197jHaoLfmNa=NelMk;K6g"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->のぷのちつ(Ljava/lang/String;)V
    :try_end_172
    .catch Ljava/io/IOException; {:try_start_128 .. :try_end_172} :catch_173

    goto :goto_175

    .line 18
    :catch_173
    sget-object v6, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->げつ〴ぬぐ:Ljava/util/LinkedList;

    :goto_175
    const/4 v6, 0x0

    :goto_176
    if-eqz v6, :cond_2a7

    .line 19
    :cond_178
    invoke-virtual {v7}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    :goto_17c
    if-nez v3, :cond_18d

    const-string v2, "K`;L0>NclKc<\u001b4g\u001c`<Oe9AfkL`;\u001bfmLahO19\u0019k<L3lKbj\u001dajL4nK3j\u001dbj\u001a1kKbgA"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 20
    invoke-static {v2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->いいにぽつ(Ljava/lang/String;)V

    const/4 v2, 0x0

    goto :goto_1b0

    :cond_18d
    invoke-virtual {v2, v3}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    const-string v3, "NdoH3<HdkLb>K3>\u00193gJ6kA4j\u00193:A0hIe"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぇ〳〲〺すっ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v3

    new-array v3, v3, [Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/util/Vector;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    :goto_1b0
    const/4 v3, 0x1

    .line 21
    iput-boolean v3, v0, Lde/blinkt/openvpn/core/OpenVPNService;->おぐぴう〸ず:Z

    .line 22
    iget-object v4, v0, Lde/blinkt/openvpn/core/OpenVPNService;->ぉざぅち〻:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;

    const-wide/16 v5, 0x3e8

    if-eqz v4, :cond_1ca

    iget-object v7, v0, Lde/blinkt/openvpn/core/OpenVPNService;->ぶでにく〼〳:Ljava/lang/Runnable;

    if-eqz v7, :cond_1c1

    check-cast v7, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;

    .line 23
    iput-boolean v3, v7, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;->〳ぜぞぜべっ:Z

    .line 24
    :cond_1c1
    invoke-interface {v4, v3}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->げつ〴ぬぐ(Z)Z

    move-result v4

    if-eqz v4, :cond_1ca

    :try_start_1c7
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1ca
    .catch Ljava/lang/InterruptedException; {:try_start_1c7 .. :try_end_1ca} :catch_1ca

    .line 25
    :catch_1ca
    :cond_1ca
    iget-object v7, v0, Lde/blinkt/openvpn/core/OpenVPNService;->づざかべべ:Ljava/lang/Object;

    monitor-enter v7

    :try_start_1cd
    iget-object v4, v0, Lde/blinkt/openvpn/core/OpenVPNService;->ぁごぐすすぃ:Ljava/lang/Thread;

    if-eqz v4, :cond_1d7

    invoke-virtual {v4}, Ljava/lang/Thread;->interrupt()V
    :try_end_1d4
    .catchall {:try_start_1cd .. :try_end_1d4} :catchall_2a4

    :try_start_1d4
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1d7
    .catch Ljava/lang/InterruptedException; {:try_start_1d4 .. :try_end_1d7} :catch_1d7
    .catchall {:try_start_1d4 .. :try_end_1d7} :catchall_2a4

    :catch_1d7
    :cond_1d7
    :try_start_1d7
    monitor-exit v7
    :try_end_1d8
    .catchall {:try_start_1d7 .. :try_end_1d8} :catchall_2a4

    const/4 v4, 0x0

    .line 26
    iput-boolean v4, v0, Lde/blinkt/openvpn/core/OpenVPNService;->おぐぴう〸ず:Z

    .line 27
    invoke-static {v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぅみぱぎぎ(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v5

    const-string v6, "\u001b6k\u001dd:H1fLkf\u001acmO4j\u001ejhNgmN6<Ac9Nc"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 28
    new-instance v4, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;

    iget-object v5, v0, Lde/blinkt/openvpn/core/OpenVPNService;->〳ぜぞぜべっ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    invoke-direct {v4, v5, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;-><init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;Lde/blinkt/openvpn/core/OpenVPNService;)V

    .line 29
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v6

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "O49Ok9JchLckJ`j\u00197hKg:Jc;Ld>Iji@j"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Landroid/net/LocalSocket;

    invoke-direct {v6}, Landroid/net/LocalSocket;-><init>()V

    iput-object v6, v4, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぺぁあねじ:Landroid/net/LocalSocket;

    const/16 v6, 0x8

    :goto_21d
    if-lez v6, :cond_23c

    iget-object v7, v4, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぺぁあねじ:Landroid/net/LocalSocket;

    invoke-virtual {v7}, Landroid/net/LocalSocket;->isBound()Z

    move-result v7

    if-nez v7, :cond_23c

    :try_start_227
    iget-object v7, v4, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぺぁあねじ:Landroid/net/LocalSocket;

    new-instance v8, Landroid/net/LocalSocketAddress;

    sget-object v9, Landroid/net/LocalSocketAddress$Namespace;->FILESYSTEM:Landroid/net/LocalSocketAddress$Namespace;

    invoke-direct {v8, v5, v9}, Landroid/net/LocalSocketAddress;-><init>(Ljava/lang/String;Landroid/net/LocalSocketAddress$Namespace;)V

    invoke-virtual {v7, v8}, Landroid/net/LocalSocket;->bind(Landroid/net/LocalSocketAddress;)V
    :try_end_233
    .catch Ljava/io/IOException; {:try_start_227 .. :try_end_233} :catch_234

    goto :goto_239

    :catch_234
    const-wide/16 v7, 0x12c

    :try_start_236
    invoke-static {v7, v8}, Ljava/lang/Thread;->sleep(J)V
    :try_end_239
    .catch Ljava/lang/InterruptedException; {:try_start_236 .. :try_end_239} :catch_239

    :catch_239
    :goto_239
    add-int/lit8 v6, v6, -0x1

    goto :goto_21d

    :cond_23c
    :try_start_23c
    new-instance v5, Landroid/net/LocalServerSocket;

    iget-object v6, v4, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぺぁあねじ:Landroid/net/LocalSocket;

    invoke-virtual {v6}, Landroid/net/LocalSocket;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v6

    invoke-direct {v5, v6}, Landroid/net/LocalServerSocket;-><init>(Ljava/io/FileDescriptor;)V

    iput-object v5, v4, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->ぁごぐすすぃ:Landroid/net/LocalServerSocket;
    :try_end_249
    .catch Ljava/io/IOException; {:try_start_23c .. :try_end_249} :catch_24a

    goto :goto_24d

    .line 30
    :catch_24a
    sget-object v3, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->げつ〴ぬぐ:Ljava/util/LinkedList;

    const/4 v3, 0x0

    :goto_24d
    if-eqz v3, :cond_2c4

    .line 31
    new-instance v3, Ljava/lang/Thread;

    const-string v5, "Na9O7;IjfO1n\u001ac9\u001ecj\u0019ei\u001d4f\u001dcf\u0019`:\u001ddmIejLa9Ag;O7f\u001bcl@7;\u001e7m\u001dk:I09\u001bc>\u001a"

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    iput-object v4, v0, Lde/blinkt/openvpn/core/OpenVPNService;->ぉざぅち〻:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;

    const-string v3, "IbiJcfKbh\u001ab:KeiOc=Ib>NjkLfk\u001d0k\u001cbn\u001dfiOjnOafL6iJffL6l\u001ej=A7i@4kHdn\u001c"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->のぷのちつ(Ljava/lang/String;)V

    new-instance v3, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;

    invoke-direct {v3, v0, v2, v1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/のぷのちつ;-><init>(Lde/blinkt/openvpn/core/OpenVPNService;[Ljava/lang/String;Ljava/lang/String;)V

    iput-object v3, v0, Lde/blinkt/openvpn/core/OpenVPNService;->ぶでにく〼〳:Ljava/lang/Runnable;

    iget-object v1, v0, Lde/blinkt/openvpn/core/OpenVPNService;->づざかべべ:Ljava/lang/Object;

    monitor-enter v1

    :try_start_27a
    new-instance v2, Ljava/lang/Thread;

    const-string v4, "Kgk\u001e3l\u001aa;\u001a1=\u00191:OahIdk\u001aaf\u001b4>N3=Me<Oj9\u001e0;Lg>I7:\u001d1j\u001b7fH0f\u00191>\u001dgjJ6kO"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iput-object v2, v0, Lde/blinkt/openvpn/core/OpenVPNService;->ぁごぐすすぃ:Ljava/lang/Thread;

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    monitor-exit v1
    :try_end_28f
    .catchall {:try_start_27a .. :try_end_28f} :catchall_2a1

    new-instance v1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/net/VpnService;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/てぜきぽく;

    invoke-direct {v2, v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/てぜきぽく;-><init>(Lde/blinkt/openvpn/core/OpenVPNService;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_2c7

    :catchall_2a1
    move-exception v0

    :try_start_2a2
    monitor-exit v1
    :try_end_2a3
    .catchall {:try_start_2a2 .. :try_end_2a3} :catchall_2a1

    throw v0

    :catchall_2a4
    move-exception v0

    .line 32
    :try_start_2a5
    monitor-exit v7
    :try_end_2a6
    .catchall {:try_start_2a5 .. :try_end_2a6} :catchall_2a4

    throw v0

    :cond_2a7
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_af

    .line 33
    :cond_2ab
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Cannot find any execulte for this device\'s ABIs "

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 34
    :catch_2c2
    sget-object v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->げつ〴ぬぐ:Ljava/util/LinkedList;

    .line 35
    :cond_2c4
    invoke-virtual {v0}, Lde/blinkt/openvpn/core/OpenVPNService;->ぉひのべい()V

    :goto_2c7
    return-void
.end method
