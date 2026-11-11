.class public Ldev/epro/v2ray/util/Utils;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static clearClipboard(Landroid/content/Context;)V
    .registers 3

    const-string v0, "clipboard"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/ClipboardManager;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_12

    invoke-virtual {p0}, Landroid/content/ClipboardManager;->clearPrimaryClip()V

    goto :goto_1c

    :cond_12
    const/4 v0, 0x0

    const-string v1, "copy"

    invoke-static {v1, v0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    :goto_1c
    return-void
.end method

.method private static copyAsset(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/lang/String;)Z
    .registers 4

    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {p0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_5} :catch_34
    .catchall {:try_start_1 .. :try_end_5} :catchall_27

    :try_start_5
    new-instance p1, Ljava/io/File;

    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->createNewFile()Z

    new-instance p1, Ljava/io/FileOutputStream;

    invoke-direct {p1, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_12} :catch_35
    .catchall {:try_start_5 .. :try_end_12} :catchall_25

    :try_start_12
    invoke-static {p0, p1}, Ldev/epro/v2ray/util/Utils;->copyFile(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_18} :catch_23
    .catchall {:try_start_12 .. :try_end_18} :catchall_20

    const/4 p2, 0x1

    :try_start_19
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1f
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_1f} :catch_1f

    :catch_1f
    return p2

    :catchall_20
    move-exception p2

    move-object v0, p1

    goto :goto_29

    :catch_23
    move-object v0, p1

    goto :goto_35

    :catchall_25
    move-exception p2

    goto :goto_29

    :catchall_27
    move-exception p2

    move-object p0, v0

    :goto_29
    if-eqz v0, :cond_2e

    :try_start_2b
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    :cond_2e
    if-eqz p0, :cond_33

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_33
    .catch Ljava/io/IOException; {:try_start_2b .. :try_end_33} :catch_33

    :catch_33
    :cond_33
    throw p2

    :catch_34
    move-object p0, v0

    :catch_35
    :goto_35
    const/4 p1, 0x0

    if-eqz v0, :cond_3b

    :try_start_38
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    :cond_3b
    if-eqz p0, :cond_40

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_40
    .catch Ljava/io/IOException; {:try_start_38 .. :try_end_40} :catch_40

    :catch_40
    :cond_40
    return p1
.end method

.method public static copyAssetFolder(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/lang/String;)Z
    .registers 12

    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {p0, p1}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    array-length v2, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    :goto_10
    if-ge v4, v2, :cond_88

    aget-object v5, v1, v4

    const-string v6, "."

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1a} :catch_89

    const-string v7, "/"

    if-eqz v6, :cond_5c

    :try_start_1e
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_2c

    const-string v8, ""

    goto :goto_3b

    :cond_2c
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    :goto_3b
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {p0, v6, v5}, Ldev/epro/v2ray/util/Utils;->copyAsset(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    goto :goto_84

    :cond_5c
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {p0, v6, v5}, Ldev/epro/v2ray/util/Utils;->copyAssetFolder(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5
    :try_end_84
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_84} :catch_89

    :goto_84
    and-int/2addr v3, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_10

    :cond_88
    return v3

    :catch_89
    return v0
.end method

.method private static copyFile(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .registers 5

    const/16 v0, 0x400

    new-array v0, v0, [B

    :goto_4
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_10

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_4

    :cond_10
    return-void
.end method

.method public static decode(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    :try_start_0
    new-instance v0, Ljava/lang/String;

    const/4 v1, 0x2

    invoke-static {p0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p0

    const-string v1, "UTF-8"

    invoke-direct {v0, p0, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_c} :catch_d

    return-object v0

    :catch_d
    const-string p0, ""

    return-object p0
.end method

.method public static encode(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Ldev/epro/v2ray/util/V2rayConfigUtil;->TYPE_PROTOCOL:Ljava/lang/String;

    if-nez v1, :cond_c

    const-string v1, "vmess://"

    goto :goto_e

    :cond_c
    sget-object v1, Ldev/epro/v2ray/util/V2rayConfigUtil;->TYPE_PROTOCOL:Ljava/lang/String;

    :goto_e
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "UTF-8"

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p0

    const/4 v1, 0x2

    invoke-static {p0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_23} :catch_24

    return-object p0

    :catch_24
    const-string p0, ""

    return-object p0
.end method

.method public static getClipboard(Landroid/content/Context;)Ljava/lang/String;
    .registers 2

    const-string v0, "clipboard"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/ClipboardManager;

    invoke-virtual {p0}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getDomesticDnsServers(Ljava/lang/String;)Ljava/util/ArrayList;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_23

    const-string v1, ","

    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_13
    if-ge v3, v2, :cond_23

    aget-object v4, v1, v3

    invoke-static {v4}, Ldev/epro/v2ray/util/Utils;->isPureIpAddress(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_20

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_20
    add-int/lit8 v3, v3, 0x1

    goto :goto_13

    :cond_23
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_2c

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2c
    return-object v0
.end method

.method public static getRemoteDnsServers(Ljava/lang/String;)Ljava/util/ArrayList;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_23

    const-string v1, ","

    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_13
    if-ge v3, v2, :cond_23

    aget-object v4, v1, v3

    invoke-static {v4}, Ldev/epro/v2ray/util/Utils;->isPureIpAddress(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_20

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_20
    add-int/lit8 v3, v3, 0x1

    goto :goto_13

    :cond_23
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_2c

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2c
    return-object v0
.end method

.method public static isIpAddress(Ljava/lang/String;)Z
    .registers 6

    const-string v0, ":"

    const-string v1, "/"

    const/4 v2, 0x0

    :try_start_5
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_10

    return v2

    :cond_10
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    if-lez v3, :cond_29

    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v3, v1

    const/4 v4, 0x2

    if-ne v3, v4, :cond_29

    const/4 v3, 0x1

    aget-object v3, v1, v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    if-lez v3, :cond_29

    aget-object p0, v1, v2

    :cond_29
    const-string v1, "::ffff:"

    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1
    :try_end_2f
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_2f} :catch_80

    const-string v3, "."

    if-eqz v1, :cond_3f

    :try_start_33
    invoke-virtual {p0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3f

    const/4 v1, 0x7

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_5b

    :cond_3f
    const-string v1, "[::ffff:"

    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5b

    invoke-virtual {p0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5b

    const/16 v1, 0x8

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    const-string v1, "]"

    const-string v3, ""

    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    :cond_5b
    :goto_5b
    const-string v1, "\\."

    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v3, v1

    const/4 v4, 0x4

    if-ne v3, v4, :cond_7b

    const/4 v3, 0x3

    aget-object v1, v1, v3

    invoke-virtual {v1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_76

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_76
    invoke-static {p0}, Ldev/epro/v2ray/util/Utils;->isIpv4Address(Ljava/lang/String;)Z

    move-result p0

    return p0

    :cond_7b
    invoke-static {p0}, Ldev/epro/v2ray/util/Utils;->isIpv6Address(Ljava/lang/String;)Z

    move-result p0
    :try_end_7f
    .catch Ljava/lang/Exception; {:try_start_33 .. :try_end_7f} :catch_80

    return p0

    :catch_80
    return v2
.end method

.method public static isIpv4Address(Ljava/lang/String;)Z
    .registers 2

    const-string v0, "^([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])$"

    invoke-virtual {p0, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static isIpv6Address(Ljava/lang/String;)Z
    .registers 3

    const-string v0, "["

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_22

    const-string v0, "]"

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_22

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    sub-int/2addr v1, v0

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :cond_22
    const-string v0, "^((?:[0-9A-Fa-f]{1,4}))?((?::[0-9A-Fa-f]{1,4}))*::((?:[0-9A-Fa-f]{1,4}))?((?::[0-9A-Fa-f]{1,4}))*|((?:[0-9A-Fa-f]{1,4}))((?::[0-9A-Fa-f]{1,4})){7}$"

    invoke-virtual {p0, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static isPureIpAddress(Ljava/lang/String;)Z
    .registers 2

    invoke-static {p0}, Ldev/epro/v2ray/util/Utils;->isIpv4Address(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_f

    invoke-static {p0}, Ldev/epro/v2ray/util/Utils;->isIpv6Address(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_d

    goto :goto_f

    :cond_d
    const/4 p0, 0x0

    goto :goto_10

    :cond_f
    :goto_f
    const/4 p0, 0x1

    :goto_10
    return p0
.end method

.method public static jsonToVmess(Ljava/lang/String;)Ldev/epro/v2ray/util/VmessBean;
    .registers 10

    new-instance v0, Ldev/epro/v2ray/util/VmessBean;

    invoke-direct {v0}, Ldev/epro/v2ray/util/VmessBean;-><init>()V

    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;

    invoke-direct {v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;-><init>()V

    const-class v2, Ldev/epro/v2ray/util/V2rayConfig;

    invoke-virtual {v1, p0, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;->〺つふすそ(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldev/epro/v2ray/util/V2rayConfig;

    invoke-virtual {p0}, Ldev/epro/v2ray/util/V2rayConfig;->getOutbounds()Ljava/util/ArrayList;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldev/epro/v2ray/bean/outbounds/OutboundBean;

    if-eqz p0, :cond_60

    invoke-virtual {p0}, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->getSettings()Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;

    move-result-object v2

    if-eqz v2, :cond_60

    invoke-virtual {v2}, Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;->getVnext()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_60

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldev/epro/v2ray/bean/outbounds/settings/vnext/VnextBean;

    invoke-virtual {v2}, Ldev/epro/v2ray/bean/outbounds/settings/vnext/VnextBean;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ldev/epro/v2ray/util/VmessBean;->setAddress(Ljava/lang/String;)V

    invoke-virtual {v2}, Ldev/epro/v2ray/bean/outbounds/settings/vnext/VnextBean;->getPort()I

    move-result v3

    invoke-virtual {v0, v3}, Ldev/epro/v2ray/util/VmessBean;->setPort(I)V

    invoke-virtual {v2}, Ldev/epro/v2ray/bean/outbounds/settings/vnext/VnextBean;->getUsers()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_60

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldev/epro/v2ray/bean/outbounds/settings/vnext/UsersBean;

    invoke-virtual {v2}, Ldev/epro/v2ray/bean/outbounds/settings/vnext/UsersBean;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ldev/epro/v2ray/util/VmessBean;->setId(Ljava/lang/String;)V

    invoke-virtual {v2}, Ldev/epro/v2ray/bean/outbounds/settings/vnext/UsersBean;->getAlterId()I

    move-result v3

    invoke-virtual {v0, v3}, Ldev/epro/v2ray/util/VmessBean;->setAlterId(I)V

    invoke-virtual {v2}, Ldev/epro/v2ray/bean/outbounds/settings/vnext/UsersBean;->getSecurity()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ldev/epro/v2ray/util/VmessBean;->setSecurity(Ljava/lang/String;)V

    :cond_60
    invoke-virtual {p0}, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->getStreamSettings()Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;

    move-result-object v2

    if-nez v2, :cond_67

    return-object v0

    :cond_67
    invoke-virtual {p0}, Ldev/epro/v2ray/bean/outbounds/OutboundBean;->getStreamSettings()Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;

    move-result-object p0

    if-nez p0, :cond_6e

    return-object v0

    :cond_6e
    invoke-virtual {p0}, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->getNetwork()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ldev/epro/v2ray/util/VmessBean;->setNetwork(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->getTlsSettings()Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;

    move-result-object v2

    if-eqz v2, :cond_86

    invoke-virtual {v2}, Ldev/epro/v2ray/bean/outbounds/stream/TlsSettingsBean;->isAllowInsecure()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ldev/epro/v2ray/util/VmessBean;->setStreamSecurity(Ljava/lang/String;)V

    :cond_86
    invoke-virtual {p0}, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->getNetwork()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    const/4 v3, -0x1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v4

    const/16 v5, 0xcca

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eq v4, v5, :cond_c9

    const/16 v5, 0xedc

    if-eq v4, v5, :cond_be

    const v5, 0x19e18

    if-eq v4, v5, :cond_b3

    const v5, 0x35223e

    if-eq v4, v5, :cond_a8

    goto :goto_d3

    :cond_a8
    const-string v4, "quic"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b1

    goto :goto_d3

    :cond_b1
    const/4 v3, 0x3

    goto :goto_d3

    :cond_b3
    const-string v4, "kcp"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_bc

    goto :goto_d3

    :cond_bc
    const/4 v3, 0x2

    goto :goto_d3

    :cond_be
    const-string v4, "ws"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c7

    goto :goto_d3

    :cond_c7
    const/4 v3, 0x1

    goto :goto_d3

    :cond_c9
    const-string v4, "h2"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d2

    goto :goto_d3

    :cond_d2
    const/4 v3, 0x0

    :goto_d3
    const-string v2, ", "

    if-eqz v3, :cond_1c3

    if-eq v3, v8, :cond_1a9

    if-eq v3, v7, :cond_193

    if-eq v3, v6, :cond_183

    invoke-virtual {p0}, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->getTcpSettings()Ldev/epro/v2ray/bean/outbounds/stream/tcp/TcpSettingsBean;

    move-result-object p0

    invoke-virtual {p0}, Ldev/epro/v2ray/bean/outbounds/stream/tcp/TcpSettingsBean;->getHeader()Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;

    move-result-object v3

    if-eqz v3, :cond_1fb

    invoke-virtual {p0}, Ldev/epro/v2ray/bean/outbounds/stream/tcp/TcpSettingsBean;->getHeader()Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;

    move-result-object v3

    invoke-virtual {v3}, Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;->getType()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1fb

    const-string v4, "http"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1fb

    invoke-virtual {v0, v3}, Ldev/epro/v2ray/util/VmessBean;->setHeaderType(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/bean/outbounds/stream/tcp/TcpSettingsBean;->getHeader()Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;

    move-result-object p0

    invoke-virtual {p0}, Ldev/epro/v2ray/bean/outbounds/stream/tcp/HeaderBean;->getRequest()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ごづごきえ;

    const-string v3, "headers"

    invoke-virtual {p0, v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ごづごきえ;->くし〴〺ぅ(Ljava/lang/String;)Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ごづごきえ;

    move-result-object v4

    .line 1
    iget-object v4, v4, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ごづごきえ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/は〲ぱなで;

    const-string v5, "Host"

    .line 2
    invoke-virtual {v4, v5}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/は〲ぱなで;->くし〴〺ぅ(Ljava/lang/Object;)Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/は〲ぱなで$づざかべべ;

    move-result-object v4

    if-eqz v4, :cond_118

    const/4 v4, 0x1

    goto :goto_119

    :cond_118
    const/4 v4, 0x0

    :goto_119
    const/4 v6, 0x0

    if-eqz v4, :cond_130

    .line 3
    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;

    invoke-direct {v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;-><init>()V

    invoke-virtual {p0, v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ごづごきえ;->くし〴〺ぅ(Ljava/lang/String;)Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ごづごきえ;

    move-result-object p0

    .line 4
    iget-object p0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ごづごきえ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/は〲ぱなで;

    .line 5
    invoke-virtual {p0, v5}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/は〲ぱなで;->くし〴〺ぅ(Ljava/lang/Object;)Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/は〲ぱなで$づざかべべ;

    move-result-object p0

    if-eqz p0, :cond_14b

    :goto_12d
    iget-object v6, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/は〲ぱなで$づざかべべ;->〳ぜぞぜべっ:Ljava/lang/Object;

    goto :goto_14b

    .line 6
    :cond_130
    iget-object v3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ごづごきえ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/は〲ぱなで;

    const-string v4, "path"

    .line 7
    invoke-virtual {v3, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/は〲ぱなで;->くし〴〺ぅ(Ljava/lang/Object;)Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/は〲ぱなで$づざかべべ;

    move-result-object v3

    if-eqz v3, :cond_13b

    const/4 v1, 0x1

    :cond_13b
    if-eqz v1, :cond_152

    .line 8
    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;

    invoke-direct {v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;-><init>()V

    .line 9
    iget-object p0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ごづごきえ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/は〲ぱなで;

    .line 10
    invoke-virtual {p0, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/は〲ぱなで;->くし〴〺ぅ(Ljava/lang/Object;)Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/じぜこほぱ/は〲ぱなで$づざかべべ;

    move-result-object p0

    if-eqz p0, :cond_14b

    goto :goto_12d

    .line 11
    :cond_14b
    :goto_14b
    check-cast v6, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;

    .line 12
    invoke-virtual {v1, v6}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;->なぎぱいぢぎ(Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぉざぅち〻;)Ljava/lang/String;

    move-result-object p0

    goto :goto_154

    :cond_152
    const-string p0, ""

    :goto_154
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_165
    :goto_165
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_17a

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-ge v8, v3, :cond_165

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_165

    :cond_17a
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ldev/epro/v2ray/util/VmessBean;->setRequestHost(Ljava/lang/String;)V

    goto/16 :goto_1fb

    :cond_183
    invoke-virtual {p0}, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->getQuicSettings()Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;

    move-result-object p0

    invoke-virtual {p0}, Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;->getSecurity()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldev/epro/v2ray/util/VmessBean;->setRequestHost(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;->getKey()Ljava/lang/String;

    move-result-object p0

    goto :goto_1f8

    :cond_193
    invoke-virtual {p0}, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->getKcpSettings()Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;

    move-result-object p0

    invoke-virtual {p0}, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->getHeader()Ldev/epro/v2ray/bean/outbounds/stream/kcp/HeaderBean;

    move-result-object v1

    if-eqz v1, :cond_1fb

    invoke-virtual {p0}, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->getHeader()Ldev/epro/v2ray/bean/outbounds/stream/kcp/HeaderBean;

    move-result-object p0

    invoke-virtual {p0}, Ldev/epro/v2ray/bean/outbounds/stream/kcp/HeaderBean;->getType()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ldev/epro/v2ray/util/VmessBean;->setHeaderType(Ljava/lang/String;)V

    goto :goto_1fb

    :cond_1a9
    invoke-virtual {p0}, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->getWsSettings()Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;

    move-result-object p0

    invoke-virtual {p0}, Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;->getHeaders()Ldev/epro/v2ray/bean/outbounds/stream/ws/HeadersBean;

    move-result-object v1

    if-eqz v1, :cond_1be

    invoke-virtual {p0}, Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;->getHeaders()Ldev/epro/v2ray/bean/outbounds/stream/ws/HeadersBean;

    move-result-object v1

    invoke-virtual {v1}, Ldev/epro/v2ray/bean/outbounds/stream/ws/HeadersBean;->getHost()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldev/epro/v2ray/util/VmessBean;->setRequestHost(Ljava/lang/String;)V

    :cond_1be
    invoke-virtual {p0}, Ldev/epro/v2ray/bean/outbounds/stream/ws/WsSettingsBean;->getPath()Ljava/lang/String;

    move-result-object p0

    goto :goto_1f8

    :cond_1c3
    invoke-virtual {p0}, Ldev/epro/v2ray/bean/outbounds/stream/StreamSettingsBean;->getHttpSettings()Ldev/epro/v2ray/bean/outbounds/stream/HttpSettingsBean;

    move-result-object p0

    invoke-virtual {p0}, Ldev/epro/v2ray/bean/outbounds/stream/HttpSettingsBean;->getHost()Ljava/util/List;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1d8
    :goto_1d8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1ed

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-ge v8, v4, :cond_1d8

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1d8

    :cond_1ed
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldev/epro/v2ray/util/VmessBean;->setRequestHost(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/bean/outbounds/stream/HttpSettingsBean;->getPath()Ljava/lang/String;

    move-result-object p0

    :goto_1f8
    invoke-virtual {v0, p0}, Ldev/epro/v2ray/util/VmessBean;->setPath(Ljava/lang/String;)V

    :cond_1fb
    :goto_1fb
    return-object v0
.end method

.method public static parseInt(Ljava/lang/String;)I
    .registers 1

    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_4} :catch_5

    return p0

    :catch_5
    const/4 p0, 0x0

    return p0
.end method

.method public static setClipboard(Landroid/content/Context;Ljava/lang/String;)V
    .registers 3

    const-string v0, "clipboard"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/ClipboardManager;

    const-string v0, "copy"

    invoke-static {v0, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    return-void
.end method

.method public static share2Clipboard(Landroid/content/Context;Ljava/lang/String;)I
    .registers 4

    const/4 v0, -0x1

    :try_start_1
    invoke-static {p1}, Ldev/epro/v2ray/util/Utils;->shareConfig_(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_c

    return v0

    :cond_c
    invoke-static {p0, p1}, Ldev/epro/v2ray/util/Utils;->setClipboard(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_f} :catch_11

    const/4 p0, 0x0

    return p0

    :catch_11
    return v0
.end method

.method public static shareConfig(Ljava/lang/String;)Ljava/lang/String;
    .registers 4

    invoke-static {p0}, Ldev/epro/v2ray/util/Utils;->jsonToVmess(Ljava/lang/String;)Ldev/epro/v2ray/util/VmessBean;

    move-result-object p0

    new-instance v0, Ldev/epro/v2ray/util/VmessQRCode;

    invoke-direct {v0}, Ldev/epro/v2ray/util/VmessQRCode;-><init>()V

    const-string v1, "2"

    invoke-virtual {v0, v1}, Ldev/epro/v2ray/util/VmessQRCode;->setV(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldev/epro/v2ray/util/VmessQRCode;->setPs(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getHeaderType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldev/epro/v2ray/util/VmessQRCode;->setType(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldev/epro/v2ray/util/VmessQRCode;->setAdd(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getPort()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldev/epro/v2ray/util/VmessQRCode;->setPort(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldev/epro/v2ray/util/VmessQRCode;->setId(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getAlterId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldev/epro/v2ray/util/VmessQRCode;->setAid(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getRequestHost()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldev/epro/v2ray/util/VmessQRCode;->setHost(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldev/epro/v2ray/util/VmessQRCode;->setPath(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getNetwork()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldev/epro/v2ray/util/VmessQRCode;->setNet(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldev/epro/v2ray/util/VmessBean;->getStreamSecurity()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ldev/epro/v2ray/util/VmessQRCode;->setTls(Ljava/lang/String;)V

    new-instance p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;

    invoke-direct {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;-><init>()V

    invoke-virtual {p0, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;->ぁごぐすすぃ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ldev/epro/v2ray/util/Utils;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static shareConfig_(Ljava/lang/String;)Ljava/lang/String;
    .registers 7

    invoke-static {p0}, Ldev/epro/v2ray/util/Utils;->jsonToVmess(Ljava/lang/String;)Ldev/epro/v2ray/util/VmessBean;

    move-result-object p0

    iget v0, p0, Ldev/epro/v2ray/util/VmessBean;->configType:I

    sget-object v1, Ldev/epro/v2ray/util/EConfigType;->VMESS:Ldev/epro/v2ray/util/EConfigType;

    iget v1, v1, Ldev/epro/v2ray/util/EConfigType;->value:I

    if-ne v0, v1, :cond_64

    new-instance v0, Ldev/epro/v2ray/util/VmessQRCode;

    invoke-direct {v0}, Ldev/epro/v2ray/util/VmessQRCode;-><init>()V

    iget v1, p0, Ldev/epro/v2ray/util/VmessBean;->configVersion:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ldev/epro/v2ray/util/VmessQRCode;->v:Ljava/lang/String;

    iget-object v1, p0, Ldev/epro/v2ray/util/VmessBean;->remarks:Ljava/lang/String;

    iput-object v1, v0, Ldev/epro/v2ray/util/VmessQRCode;->ps:Ljava/lang/String;

    iget-object v1, p0, Ldev/epro/v2ray/util/VmessBean;->address:Ljava/lang/String;

    iput-object v1, v0, Ldev/epro/v2ray/util/VmessQRCode;->add:Ljava/lang/String;

    iget v1, p0, Ldev/epro/v2ray/util/VmessBean;->port:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ldev/epro/v2ray/util/VmessQRCode;->port:Ljava/lang/String;

    iget-object v1, p0, Ldev/epro/v2ray/util/VmessBean;->id:Ljava/lang/String;

    iput-object v1, v0, Ldev/epro/v2ray/util/VmessQRCode;->id:Ljava/lang/String;

    iget v1, p0, Ldev/epro/v2ray/util/VmessBean;->alterId:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ldev/epro/v2ray/util/VmessQRCode;->aid:Ljava/lang/String;

    iget-object v1, p0, Ldev/epro/v2ray/util/VmessBean;->network:Ljava/lang/String;

    iput-object v1, v0, Ldev/epro/v2ray/util/VmessQRCode;->net:Ljava/lang/String;

    iget-object v1, p0, Ldev/epro/v2ray/util/VmessBean;->headerType:Ljava/lang/String;

    iput-object v1, v0, Ldev/epro/v2ray/util/VmessQRCode;->type:Ljava/lang/String;

    iget-object v1, p0, Ldev/epro/v2ray/util/VmessBean;->requestHost:Ljava/lang/String;

    iput-object v1, v0, Ldev/epro/v2ray/util/VmessQRCode;->host:Ljava/lang/String;

    iget-object v1, p0, Ldev/epro/v2ray/util/VmessBean;->path:Ljava/lang/String;

    iput-object v1, v0, Ldev/epro/v2ray/util/VmessQRCode;->path:Ljava/lang/String;

    iget-object p0, p0, Ldev/epro/v2ray/util/VmessBean;->streamSecurity:Ljava/lang/String;

    iput-object p0, v0, Ldev/epro/v2ray/util/VmessQRCode;->tls:Ljava/lang/String;

    new-instance p0, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;

    invoke-direct {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;-><init>()V

    invoke-virtual {p0, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぺふねづ〺;->ぁごぐすすぃ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "vmess://"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Ldev/epro/v2ray/util/Utils;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_64
    sget-object v1, Ldev/epro/v2ray/util/EConfigType;->SHADOWSOCKS:Ldev/epro/v2ray/util/EConfigType;

    iget v1, v1, Ldev/epro/v2ray/util/EConfigType;->value:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const-string v5, "#"

    if-ne v0, v1, :cond_b3

    invoke-static {v5}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/util/VmessBean;->remarks:Ljava/lang/String;

    invoke-static {v1}, Ldev/epro/v2ray/util/Utils;->urlEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v5, p0, Ldev/epro/v2ray/util/VmessBean;->security:Ljava/lang/String;

    aput-object v5, v1, v4

    iget-object v4, p0, Ldev/epro/v2ray/util/VmessBean;->id:Ljava/lang/String;

    aput-object v4, v1, v3

    iget-object v3, p0, Ldev/epro/v2ray/util/VmessBean;->address:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x3

    iget p0, p0, Ldev/epro/v2ray/util/VmessBean;->port:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v1, v2

    const-string p0, "%s:%s@%s:%s"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "ss://"

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p0}, Ldev/epro/v2ray/util/Utils;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_b3
    sget-object v1, Ldev/epro/v2ray/util/EConfigType;->SOCKS:Ldev/epro/v2ray/util/EConfigType;

    iget v1, v1, Ldev/epro/v2ray/util/EConfigType;->value:I

    if-ne v0, v1, :cond_f3

    invoke-static {v5}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/util/VmessBean;->remarks:Ljava/lang/String;

    invoke-static {v1}, Ldev/epro/v2ray/util/Utils;->urlEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Object;

    iget-object v2, p0, Ldev/epro/v2ray/util/VmessBean;->address:Ljava/lang/String;

    aput-object v2, v1, v4

    iget p0, p0, Ldev/epro/v2ray/util/VmessBean;->port:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v1, v3

    const-string p0, "%s:%s"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "socks://"

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p0}, Ldev/epro/v2ray/util/Utils;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_f3
    const-string p0, ""

    return-object p0
.end method

.method public static urlDecode(Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    :try_start_0
    const-string v0, "UTF-8"

    invoke-static {p0, v0}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_6} :catch_6

    :catch_6
    return-object p0
.end method

.method public static urlEncode(Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    :try_start_0
    const-string v0, "UTF-8"

    invoke-static {p0, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_6} :catch_6

    :catch_6
    return-object p0
.end method

.method public static userAssetPath(Landroid/content/Context;)Ljava/lang/String;
    .registers 3

    if-nez p0, :cond_5

    const-string p0, ""

    return-object p0

    :cond_5
    const-string v0, "assets"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_12

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_12
    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object p0

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
