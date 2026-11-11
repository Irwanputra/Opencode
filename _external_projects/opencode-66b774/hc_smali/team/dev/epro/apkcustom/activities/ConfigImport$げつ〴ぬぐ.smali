.class public Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/おぐぴう〸ず/〺つふすそ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/activities/ConfigImport;->けときぜと()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/ConfigImport;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/activities/ConfigImport;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/ConfigImport;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ()V
    .registers 3

    const-wide/16 v0, 0x3e8

    :try_start_2
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_5} :catch_5

    :catch_5
    return-void
.end method

.method public げつ〴ぬぐ()V
    .registers 11

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/ConfigImport;

    .line 1
    iget-object v1, v0, Lteam/dev/epro/apkcustom/activities/ConfigImport;->ざとぅぼこ〺:Landroid/content/Intent;

    .line 2
    invoke-virtual {v1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    .line 3
    iput-object v1, v0, Lteam/dev/epro/apkcustom/activities/ConfigImport;->ぉざぅち〻:Landroid/net/Uri;

    .line 4
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/ConfigImport;

    .line 5
    iget-object v2, v1, Lteam/dev/epro/apkcustom/activities/ConfigImport;->ぉざぅち〻:Landroid/net/Uri;

    .line 6
    invoke-static {v1, v2}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;->づざかべべ(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1f

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/ConfigImport;

    .line 7
    iget-object v1, v1, Lteam/dev/epro/apkcustom/activities/ConfigImport;->ぉざぅち〻:Landroid/net/Uri;

    .line 8
    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    goto :goto_27

    :cond_1f
    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/ConfigImport;

    .line 9
    iget-object v2, v1, Lteam/dev/epro/apkcustom/activities/ConfigImport;->ぉざぅち〻:Landroid/net/Uri;

    .line 10
    invoke-static {v1, v2}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/づざかべべ;->づざかべべ(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    :goto_27
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/ConfigImport;

    const v4, 0x7f110052

    invoke-virtual {v3, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/io/File;

    new-instance v3, Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v1, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_68

    invoke-virtual {v1}, Ljava/io/File;->mkdir()Z

    :cond_68
    aget-object v3, v2, v5

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_ca

    new-instance v3, Ljava/io/File;

    iget-object v6, p0, Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/ConfigImport;

    invoke-virtual {v6, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    const-string v8, "K7kM7<\u0019d>\u001c1<\u00194f\u001e4:O79Iji\u001cdkAbo\u001dk"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 11
    invoke-virtual {v7, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v9

    if-lez v9, :cond_9d

    invoke-virtual {v7, v8}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v8

    invoke-virtual {v7, v5, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 12
    :cond_9d
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "\u001c6lK0lN6oJc:\u0019e>Ma>\u001calHko\u001e1m\u001e7kJf"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, "\u001b3;M`iM0n@1j\u001df=O6iK7:M1gAj;Ib<\u0019g"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v4, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    aput-object v3, v2, v5

    :cond_ca
    :try_start_ca
    invoke-virtual {v0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v1, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_138

    new-instance v1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;

    iget-object v3, p0, Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/ConfigImport;

    const v4, 0x7f1200f1

    invoke-direct {v1, v3, v4}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;-><init>(Landroid/content/Context;I)V

    const-string v3, "MbhMfj\u001aci\u001bgj\u001e1>\u0019cm\u001agjAghL4fM3h\u0019a"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 13
    iget-object v4, v1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/appcompat/app/AlertController$〺つふすそ;

    iput-object v3, v4, Landroidx/appcompat/app/AlertController$〺つふすそ;->びぐびあび:Ljava/lang/CharSequence;

    const-string v3, "Nj<L0n\u001cjfN0=J4j\u001adnA6i@7nN`nAj:I6fL1jLc>\u0019ajA09@a>\u001d3hJ6lIkk\u001b3lL7kM"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 14
    iput-object v3, v4, Landroidx/appcompat/app/AlertController$〺つふすそ;->なぎぱいぢぎ:Ljava/lang/CharSequence;

    .line 15
    iput-boolean v5, v4, Landroidx/appcompat/app/AlertController$〺つふすそ;->ぺふねづ〺:Z

    .line 16
    new-instance v3, Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ$くし〴〺ぅ;

    invoke-direct {v3, p0, v2}, Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ$くし〴〺ぅ;-><init>(Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ;[Ljava/io/File;)V

    .line 17
    iput-object v3, v4, Landroidx/appcompat/app/AlertController$〺つふすそ;->てぜきぽく:Landroid/content/DialogInterface$OnDismissListener;

    const-string v3, "J0o@flIc=I1<N6mAe=Hao\u001dj;Hk9\u001d7hL0"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 18
    new-instance v5, Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ$〺つふすそ;

    invoke-direct {v5, p0, v0, v2}, Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ$〺つふすそ;-><init>(Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ;Ljava/io/File;[Ljava/io/File;)V

    .line 19
    iput-object v3, v4, Landroidx/appcompat/app/AlertController$〺つふすそ;->ぁごぐすすぃ:Ljava/lang/CharSequence;

    iput-object v5, v4, Landroidx/appcompat/app/AlertController$〺つふすそ;->〳ぜぞぜべっ:Landroid/content/DialogInterface$OnClickListener;

    const-string v3, "M6gJd:O3iAeiJ6hH3lOfmIaoJ`n\u001a`h\u001e7"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 20
    new-instance v5, Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-direct {v5, p0, v2, v0}, Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ$げつ〴ぬぐ;-><init>(Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ;[Ljava/io/File;Ljava/io/File;)V

    .line 21
    iput-object v3, v4, Landroidx/appcompat/app/AlertController$〺つふすそ;->ぺぁあねじ:Ljava/lang/CharSequence;

    iput-object v5, v4, Landroidx/appcompat/app/AlertController$〺つふすそ;->いいにぽつ:Landroid/content/DialogInterface$OnClickListener;

    .line 22
    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;->びぐびあび()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;

    goto :goto_14f

    :cond_138
    aput-object v0, v2, v5

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/ConfigImport;

    aget-object v2, v2, v5

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lteam/dev/epro/apkcustom/activities/ConfigImport;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/ConfigImport;Ljava/lang/String;)V
    :try_end_145
    .catch Ljava/io/IOException; {:try_start_ca .. :try_end_145} :catch_146

    goto :goto_14f

    :catch_146
    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/ConfigImport$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/ConfigImport;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lteam/dev/epro/apkcustom/activities/ConfigImport;->ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/ConfigImport;Ljava/lang/String;)V

    :goto_14f
    return-void
.end method
