.class public Lteam/dev/epro/apkcustom/widgets/FileChooser;
.super Landroid/app/ListActivity;
.source ""


# static fields
.field public static final synthetic なぎぱいぢぎ:I


# instance fields
.field public 〺つふすそ:Ljava/lang/String;

.field public くし〴〺ぅ:Ljava/io/File;

.field public づざかべべ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

.field public びぐびあび:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/げつ〴ぬぐ;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Landroid/app/ListActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .registers 4

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FileChooser;->くし〴〺ぅ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->くし〴〺ぅ(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public getMenuInflater()Landroid/view/MenuInflater;
    .registers 2

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FileChooser;->くし〴〺ぅ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->〳ぜぞぜべっ()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public invalidateOptionsMenu()V
    .registers 2

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FileChooser;->くし〴〺ぅ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->ぺふねづ〺()V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .registers 3

    invoke-super {p0, p1}, Landroid/app/ListActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FileChooser;->くし〴〺ぅ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->てぜきぽく(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .registers 4

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FileChooser;->くし〴〺ぅ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->いいにぽつ()V

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FileChooser;->くし〴〺ぅ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->のぷのちつ(Landroid/os/Bundle;)V

    invoke-super {p0, p1}, Landroid/app/ListActivity;->onCreate(Landroid/os/Bundle;)V

    .line 1
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0x7f110052

    invoke-virtual {p0, v1}, Landroid/app/ListActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u001ce=\u001cg>\u001b4hHgfNenH1hI1>Jem@jiIjiKa"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :try_start_40
    invoke-virtual {p0}, Landroid/app/ListActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "\u001bknOgj\u001djgM1=Ng>\u0019f9OfgOjiM0<JjkJ`"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FileChooser;->〺つふすそ:Ljava/lang/String;
    :try_end_58
    .catch Ljava/lang/Exception; {:try_start_40 .. :try_end_58} :catch_59

    goto :goto_65

    :catch_59
    const-string v0, "\u001df>Kbo\u001c39\u001df:@c>A6>N6n\u001e0gAdg\u001dck\u0019c"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FileChooser;->〺つふすそ:Ljava/lang/String;

    :goto_65
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FileChooser;->くし〴〺ぅ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_85

    iget-object p1, p0, Lteam/dev/epro/apkcustom/widgets/FileChooser;->くし〴〺ぅ:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    move-result p1

    if-nez p1, :cond_85

    .line 3
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    const/high16 v0, -0x10000

    .line 4
    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    const-string v1, "Can\'t create directory"

    invoke-virtual {p1, v1, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->びぐびあび(Ljava/lang/String;I)V

    :cond_85
    iget-object p1, p0, Lteam/dev/epro/apkcustom/widgets/FileChooser;->くし〴〺ぅ:Ljava/io/File;

    invoke-virtual {p0, p1}, Lteam/dev/epro/apkcustom/widgets/FileChooser;->〺つふすそ(Ljava/io/File;)V

    return-void
.end method

.method public onListItemClick(Landroid/widget/ListView;Landroid/view/View;IJ)V
    .registers 11

    invoke-super/range {p0 .. p5}, Landroid/app/ListActivity;->onListItemClick(Landroid/widget/ListView;Landroid/view/View;IJ)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/widgets/FileChooser;->びぐびあび:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/げつ〴ぬぐ;

    .line 1
    iget-object p1, p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/げつ〴ぬぐ;->びぐびあび:Ljava/util/List;

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;

    .line 2
    iget-object p2, p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/lang/String;

    const-string p3, "M0<\u001dkj\u001abi\u00193=\u001a1oMf;\u001bg=OamL`m\u001cbo\u001c4"

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 3
    invoke-virtual {p2, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_160

    .line 4
    iget-object p2, p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/lang/String;

    const-string p3, "@09\u001df<M3iLk:J1=Laj@blL4hOdkMki\u001e6"

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 5
    invoke-virtual {p2, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_33

    goto/16 :goto_160

    .line 6
    :cond_33
    new-instance p2, Ljava/io/File;

    .line 7
    iget-object p1, p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;->づざかべべ:Ljava/lang/String;

    .line 8
    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance p1, Ljava/io/File;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object p4, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const p4, 0x7f110052

    invoke-virtual {p0, p4}, Landroid/app/ListActivity;->getString(I)Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p3, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p1, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 p3, 0x1

    new-array p3, p3, [Ljava/io/File;

    new-instance p5, Ljava/io/File;

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p5, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v0, 0x0

    aput-object p5, p3, v0

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p5

    if-nez p5, :cond_76

    invoke-virtual {p1}, Ljava/io/File;->mkdir()Z

    :cond_76
    aget-object p5, p3, v0

    invoke-virtual {p5}, Ljava/io/File;->exists()Z

    move-result p5

    if-eqz p5, :cond_d6

    new-instance p5, Ljava/io/File;

    invoke-virtual {p0, p4}, Landroid/app/ListActivity;->getString(I)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object p4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "K7kM7<\u0019d>\u001c1<\u00194f\u001e4:O79Iji\u001cdkAbo\u001dk"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 9
    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    if-lez v4, :cond_a9

    invoke-virtual {v2, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 10
    :cond_a9
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\u001c6lK0lN6oJc:\u0019e>Ma>\u001calHko\u001e1m\u001e7kJf"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\u001b3;M`iM0n@1j\u001df=O6iK7:M1gAj;Ib<\u0019g"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p5, p4, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    aput-object p5, p3, v0

    :cond_d6
    :try_start_d6
    invoke-virtual {p2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object p4

    new-instance p5, Ljava/io/File;

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p5, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p5}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_142

    new-instance p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;

    const p4, 0x7f1200f1

    invoke-direct {p1, p0, p4}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;-><init>(Landroid/content/Context;I)V

    const-string p4, "MbhMfj\u001aci\u001bgj\u001e1>\u0019cm\u001agjAghL4fM3h\u0019a"

    invoke-static {p4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    .line 11
    iget-object p5, p1, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/appcompat/app/AlertController$〺つふすそ;

    iput-object p4, p5, Landroidx/appcompat/app/AlertController$〺つふすそ;->びぐびあび:Ljava/lang/CharSequence;

    const-string p4, "Nj<L0n\u001cjfN0=J4j\u001adnA6i@7nN`nAj:I6fL1jLc>\u0019ajA09@a>\u001d3hJ6lIkk\u001b3lL7kM"

    invoke-static {p4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    .line 12
    iput-object p4, p5, Landroidx/appcompat/app/AlertController$〺つふすそ;->なぎぱいぢぎ:Ljava/lang/CharSequence;

    .line 13
    iput-boolean v0, p5, Landroidx/appcompat/app/AlertController$〺つふすそ;->ぺふねづ〺:Z

    .line 14
    new-instance p4, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/びぐびあび;

    invoke-direct {p4, p0, p3}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/びぐびあび;-><init>(Lteam/dev/epro/apkcustom/widgets/FileChooser;[Ljava/io/File;)V

    .line 15
    iput-object p4, p5, Landroidx/appcompat/app/AlertController$〺つふすそ;->てぜきぽく:Landroid/content/DialogInterface$OnDismissListener;

    const-string p4, "J0o@flIc=I1<N6mAe=Hao\u001dj;Hk9\u001d7hL0"

    invoke-static {p4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    .line 16
    new-instance v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ;

    invoke-direct {v0, p0, p2, p3}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ;-><init>(Lteam/dev/epro/apkcustom/widgets/FileChooser;Ljava/io/File;[Ljava/io/File;)V

    .line 17
    iput-object p4, p5, Landroidx/appcompat/app/AlertController$〺つふすそ;->ぁごぐすすぃ:Ljava/lang/CharSequence;

    iput-object v0, p5, Landroidx/appcompat/app/AlertController$〺つふすそ;->〳ぜぞぜべっ:Landroid/content/DialogInterface$OnClickListener;

    const-string p4, "M6gJd:O3iAeiJ6hH3lOfmIaoJ`n\u001a`h\u001e7"

    invoke-static {p4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    .line 18
    new-instance v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/〺つふすそ;

    invoke-direct {v0, p0, p3, p2}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/〺つふすそ;-><init>(Lteam/dev/epro/apkcustom/widgets/FileChooser;[Ljava/io/File;Ljava/io/File;)V

    .line 19
    iput-object p4, p5, Landroidx/appcompat/app/AlertController$〺つふすそ;->ぺぁあねじ:Ljava/lang/CharSequence;

    iput-object v0, p5, Landroidx/appcompat/app/AlertController$〺つふすそ;->いいにぽつ:Landroid/content/DialogInterface$OnClickListener;

    .line 20
    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;->びぐびあび()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;

    goto :goto_16c

    :cond_142
    aput-object p2, p3, v0

    aget-object p1, p3, v0

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    aget-object p3, p3, v0

    invoke-virtual {p3}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p1, p3}, Lteam/dev/epro/apkcustom/widgets/FileChooser;->げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_153
    .catch Ljava/io/IOException; {:try_start_d6 .. :try_end_153} :catch_154

    goto :goto_16c

    :catch_154
    invoke-virtual {p2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lteam/dev/epro/apkcustom/widgets/FileChooser;->げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_16c

    .line 21
    :cond_160
    :goto_160
    new-instance p2, Ljava/io/File;

    .line 22
    iget-object p1, p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;->づざかべべ:Ljava/lang/String;

    .line 23
    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lteam/dev/epro/apkcustom/widgets/FileChooser;->くし〴〺ぅ:Ljava/io/File;

    invoke-virtual {p0, p2}, Lteam/dev/epro/apkcustom/widgets/FileChooser;->〺つふすそ(Ljava/io/File;)V

    :goto_16c
    return-void
.end method

.method public onPostCreate(Landroid/os/Bundle;)V
    .registers 3

    invoke-super {p0, p1}, Landroid/app/ListActivity;->onPostCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FileChooser;->くし〴〺ぅ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->おぐぴう〸ず(Landroid/os/Bundle;)V

    return-void
.end method

.method public onPostResume()V
    .registers 2

    invoke-super {p0}, Landroid/app/ListActivity;->onPostResume()V

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FileChooser;->くし〴〺ぅ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->ぇぬぎばつ()V

    return-void
.end method

.method public onTitleChanged(Ljava/lang/CharSequence;I)V
    .registers 3

    invoke-super {p0, p1, p2}, Landroid/app/ListActivity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FileChooser;->くし〴〺ぅ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object p2

    invoke-virtual {p2, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->びえぁぜい(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setContentView(I)V
    .registers 3

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FileChooser;->くし〴〺ぅ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->でどあくず(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .registers 3

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FileChooser;->くし〴〺ぅ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->ぶでにく〼〳(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .registers 4

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/FileChooser;->くし〴〺ぅ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->〻ぞまぎな〻(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final 〺つふすそ(Ljava/io/File;)V
    .registers 19

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    iget-object v2, v0, Lteam/dev/epro/apkcustom/widgets/FileChooser;->〺つふすそ:Ljava/lang/String;

    const-string v3, "H7n\u001dkhJ`gA4;Ok9AchKblL4oOgfJcjA`"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    const-string v4, "\u001a7nN6:\u00190nN7>\u00191l\u001c1f@c<Ikh\u001ecmL39\u001d0"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v2, :cond_38

    invoke-static {v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\u001b`jIj;\u001ajiN0=\u0019a=J4f\u001de=\u001c3gJfjH7:\u001da"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_4d

    :cond_38
    invoke-static {v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\u001c39\u0019k;Oj>Ib=A`=N7oM7iKkoO7:Mg>Oc"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    :goto_4d
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/app/ListActivity;->setTitle(Ljava/lang/CharSequence;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const/4 v5, 0x0

    :try_start_62
    array-length v6, v1

    const/4 v7, 0x0

    :goto_64
    if-ge v7, v6, :cond_1b6

    aget-object v14, v1, v7

    new-instance v8, Ljava/util/Date;

    invoke-virtual {v14}, Ljava/io/File;->lastModified()J

    move-result-wide v9

    invoke-direct {v8, v9, v10}, Ljava/util/Date;-><init>(J)V

    new-instance v9, Ljava/text/SimpleDateFormat;

    const-string v10, "KkhI4;N0gMjj\u001e6k\u001e1g\u001b1<L1g\u001cdm\u001e4=\u001bcnAb;Adi\u00197g\u001eaoJ1j@e:\u001e`:Mgg\u001d7h\u001dbjM"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    sget-object v11, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v9, v10, v11}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {v9, v8}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v14}, Ljava/io/File;->isDirectory()Z

    move-result v8

    if-eqz v8, :cond_e5

    invoke-virtual {v14}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v8

    if-eqz v8, :cond_94

    array-length v8, v8

    goto :goto_95

    :cond_94
    const/4 v8, 0x0

    :goto_95
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v9

    if-nez v8, :cond_b1

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "\u001cjf\u001cj:@c<JkgN`mHkkLjl\u001b7o\u001edjJ1oI3"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    :goto_ad
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_c4

    :cond_b1
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "\u001a`nH3:J`>KfkH4;M0g@1fNkn\u0019fj@6o\u0019k"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto :goto_ad

    :goto_c4
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    new-instance v15, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;

    invoke-virtual {v14}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v14}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v12

    const-string v13, "M0<\u001dkj\u001abi\u00193=\u001a1oMf;\u001bg=OamL`m\u001cbo\u001c4"

    invoke-static {v13}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    move-object v8, v15

    invoke-direct/range {v8 .. v14}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1b1

    :cond_e5
    iget-object v8, v0, Lteam/dev/epro/apkcustom/widgets/FileChooser;->〺つふすそ:Ljava/lang/String;

    invoke-virtual {v8, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8
    :try_end_eb
    .catch Ljava/lang/Exception; {:try_start_62 .. :try_end_eb} :catch_1b5

    const-string v9, "L6oIf<A7fMfiL1:\u001efoI19O0j\u0019cn\u001bk9Ic"

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-eqz v8, :cond_136

    :try_start_f7
    invoke-virtual {v14}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1b1

    new-instance v15, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;

    invoke-virtual {v14}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v10

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14}, Ljava/io/File;->length()J

    move-result-wide v12

    invoke-virtual {v8, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v14}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v13

    const-string v16, "\u001e7gO7fNgiMb;\u0019`gJ4iJ6>\u001a3l\u001c0nM6lO0"

    invoke-static/range {v16 .. v16}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    move-object v8, v15

    move-object v9, v10

    move-object v10, v12

    move-object v12, v13

    move-object/from16 v13, v16

    invoke-direct/range {v8 .. v14}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    goto :goto_1ae

    :cond_136
    invoke-virtual {v14}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v8

    const-string v10, "\u001df>Kbo\u001c39\u001df:@c>A6>N6n\u001e0gAdg\u001dck\u0019c"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_17e

    invoke-virtual {v14}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v8

    const-string v10, "\u001d`f@1:MboK`mKbmAchL6n\u001a79\u0019j<KgnAe"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_17e

    invoke-virtual {v14}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v8

    const-string v10, "L3;LgiIgmH4;KkfJ7jHk9J4o\u001a`jJdg\u001d7"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1b1

    :cond_17e
    new-instance v15, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;

    invoke-virtual {v14}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v10

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14}, Ljava/io/File;->length()J

    move-result-wide v12

    invoke-virtual {v8, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v14}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v13

    const-string v16, "I`mO0nIk:\u001a6>M4nHj>\u001c1i\u0019chK1iIf9N`"

    invoke-static/range {v16 .. v16}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    move-object v8, v15

    move-object v9, v10

    move-object v10, v12

    move-object v12, v13

    move-object/from16 v13, v16

    invoke-direct/range {v8 .. v14}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    :goto_1ae
    invoke-virtual {v4, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1b1
    .catch Ljava/lang/Exception; {:try_start_f7 .. :try_end_1b1} :catch_1b5

    :cond_1b1
    :goto_1b1
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_64

    :catch_1b5
    nop

    :cond_1b6
    invoke-static {}, Ljava/util/Collections;->reverseOrder()Ljava/util/Comparator;

    move-result-object v1

    invoke-static {v2, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-static {}, Ljava/util/Collections;->reverseOrder()Ljava/util/Comparator;

    move-result-object v1

    invoke-static {v4, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v3, ""

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_202

    new-instance v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;

    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v10

    const-string v7, "\u001adm\u001ec9I`i\u001bb=\u001a`k\u001bd;Ne<KjoJclJbhJ7"

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "@fl\u001d3m\u001ac:L0:\u001dd=Ncf\u001dfl\u00191;\u001ab9K4gI0"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, ""

    const-string v11, "@09\u001df<M3iLk:J1=Laj@blL4hOdkMki\u001e6"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    move-object v6, v1

    move-object/from16 v12, p1

    invoke-direct/range {v6 .. v12}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/のぷのちつ/げつ〴ぬぐ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-virtual {v2, v5, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :cond_202
    new-instance v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/げつ〴ぬぐ;

    const v3, 0x7f0c004a

    invoke-direct {v1, v0, v3, v2}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/げつ〴ぬぐ;-><init>(Landroid/content/Context;ILjava/util/List;)V

    iput-object v1, v0, Lteam/dev/epro/apkcustom/widgets/FileChooser;->びぐびあび:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/げつ〴ぬぐ;

    invoke-virtual {v0, v1}, Landroid/app/ListActivity;->setListAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public final くし〴〺ぅ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;
    .registers 3

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FileChooser;->づざかべべ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    if-nez v0, :cond_e

    .line 1
    sget-object v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;->〺つふすそ:Lづざかべべ/づざかべべ/くし〴〺ぅ;

    new-instance v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    const/4 v1, 0x0

    .line 2
    invoke-direct {v0, p0, v1, v1, p0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;-><init>(Landroid/content/Context;Landroid/view/Window;Lづざかべべ/〺つふすそ/ぺふねづ〺/いいにぽつ;Ljava/lang/Object;)V

    .line 3
    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FileChooser;->づざかべべ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    :cond_e
    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FileChooser;->づざかべべ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺふねづ〺;

    return-object v0
.end method

.method public final げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/String;)V
    .registers 7

    invoke-static {}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->づざかべべ()Z

    move-result v0

    const/high16 v1, -0x10000

    if-eqz v0, :cond_26

    .line 1
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 2
    invoke-virtual {p0}, Landroid/app/ListActivity;->getWindow()Landroid/view/Window;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p2

    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    const-string v0, "JagLdj\u001e`mIkgLjm@3j\u00197h@b;@k<A1g\u001bji\u001ddiKk:L3fN`mI`<@j:O`<N09@bo\u0019gf@49\u001cfm@4;Mb>LcjI`n\u001a7m\u001cboMkj\u001e6>\u001ceg"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->づおぴ〱いづ(Landroid/view/View;Ljava/lang/String;I)V

    return-void

    :cond_26
    sget-boolean v0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぷぞてのほき:Z

    if-nez v0, :cond_89

    sget-boolean v0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->ぉひのべい:Z

    if-nez v0, :cond_89

    sget-boolean v0, Lteam/dev/epro/apkcustom/sockets/SSHTunnelService;->せづっ〸ちね:Z

    if-eqz v0, :cond_33

    goto :goto_89

    .line 3
    :cond_33
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "\u001ce=\u001cg>\u001b4hHgfNenH1hI1>Jem@jiIjiKa"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-static {v0, v1, p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->おぐぴう〸ず(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lteam/dev/epro/apkcustom/widgets/FileChooser;->〺つふすそ:Ljava/lang/String;

    const-string v0, "H7n\u001dkhJ`gA4;Ok9AchKblL4oOgfJcjA`"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_65

    .line 5
    sget-object p2, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 6
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    const-string v0, "O`m\u001eb:L1<\u001cf=J1lJ6;Kkn\u001ak<A0>@1kA1"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_7a

    .line 7
    :cond_65
    sget-object p2, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 8
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    new-instance v0, Ljava/lang/String;

    .line 9
    sget-object v1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    const/4 v2, 0x5

    const/4 v3, 0x0

    .line 10
    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1, v2, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->な〱ちぉじ(II)[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    :goto_7a
    invoke-interface {p2, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    const/4 p1, -0x1

    invoke-virtual {p0, p1}, Landroid/app/ListActivity;->setResult(I)V

    invoke-virtual {p0}, Landroid/app/ListActivity;->finish()V

    return-void

    .line 11
    :cond_89
    :goto_89
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 12
    invoke-virtual {p0}, Landroid/app/ListActivity;->getWindow()Landroid/view/Window;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p2

    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    const-string v0, "JagLdj\u001e`mIkgLjm@3j\u00197h@b;@k<A1g\u001bjkHdjNbi\u001d0n@bjAkoA19@7<\u001djoNd9Jak\u00193iAcjAkl\u001d3o\u0019cn\u001ael\u001aj>@bn\u00194k\u00197h\u001c0o"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->づおぴ〱いづ(Landroid/view/View;Ljava/lang/String;I)V

    return-void
.end method
