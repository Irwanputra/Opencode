.class public Lteam/dev/epro/apkcustom/activities/GeneratedConfig;
.super Landroidx/appcompat/app/AppCompatActivity;
.source ""


# instance fields
.field public 〻ぞまぎな〻:Ljava/io/File;

.field public ぇ〳〲〺すっ:Z

.field public ぉ〲なぱぽた:Ljava/util/UUID;

.field public ぉざぅち〻:Ljava/lang/String;

.field public ごづごきえ:Lcom/github/clans/fab/FloatingActionMenu;

.field public ざっざへづ:Lcom/github/clans/fab/FloatingActionButton;

.field public ざとぅぼこ〺:Landroid/widget/EditText;

.field public でどあくず:Lcom/github/clans/fab/FloatingActionButton;

.field public なぶひせが:Landroid/view/View$OnClickListener;

.field public は〲ぱなで:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

.field public びえぁぜい:Z

.field public ぶでにく〼〳:Ljava/io/File;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    new-instance v0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lteam/dev/epro/apkcustom/activities/GeneratedConfig$げつ〴ぬぐ;-><init>(Lteam/dev/epro/apkcustom/activities/GeneratedConfig;)V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->なぶひせが:Landroid/view/View$OnClickListener;

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .registers 3

    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c001e

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ぉ〲なぱぽた:Ljava/util/UUID;

    const p1, 0x7f0900bc

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ざとぅぼこ〺:Landroid/widget/EditText;

    const p1, 0x7f090116

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/github/clans/fab/FloatingActionMenu;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ごづごきえ:Lcom/github/clans/fab/FloatingActionMenu;

    const p1, 0x7f090119

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/github/clans/fab/FloatingActionButton;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ざっざへづ:Lcom/github/clans/fab/FloatingActionButton;

    const p1, 0x7f090115

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/github/clans/fab/FloatingActionButton;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->でどあくず:Lcom/github/clans/fab/FloatingActionButton;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ごづごきえ:Lcom/github/clans/fab/FloatingActionMenu;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/github/clans/fab/FloatingActionMenu;->setClosedOnTouchOutside(Z)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ざっざへづ:Lcom/github/clans/fab/FloatingActionButton;

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->なぶひせが:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0}, Lcom/github/clans/fab/FloatingActionButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->でどあくず:Lcom/github/clans/fab/FloatingActionButton;

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->なぶひせが:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0}, Lcom/github/clans/fab/FloatingActionButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onPause()V
    .registers 5

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ざとぅぼこ〺:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    .line 1
    :try_start_e
    new-instance v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/〺つふすそ;

    invoke-direct {v1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/〺つふすそ;-><init>()V

    new-instance v2, Ljava/io/InputStreamReader;

    new-instance v3, Ljava/io/ByteArrayInputStream;

    invoke-direct {v3, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v1, v2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/〺つふすそ;->いいにぽつ(Ljava/io/Reader;)V

    invoke-virtual {v1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/〺つふすそ;->くし〴〺ぅ()Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->は〲ぱなで:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    .line 2
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 3
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "H`oLkn\u001d6mH3<\u0019k>\u001agnIkiLcgJ`>O6;I6"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->は〲ぱなで:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {v2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->ぺぁあねじ()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-static {p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/は〲ぱなで;->なぎぱいぢぎ(Landroid/content/Context;)Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/は〲ぱなで;

    move-result-object v0

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->は〲ぱなで:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {v0, v1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/は〲ぱなで;->げつ〴ぬぐ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;)V
    :try_end_4c
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_4c} :catch_4e

    const/4 v0, 0x1

    goto :goto_4f

    :catch_4e
    const/4 v0, 0x0

    :goto_4f
    if-eqz v0, :cond_93

    .line 4
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 5
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ざとぅぼこ〺:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "H6mN69K0i\u001b`h\u001a7h@0jN6:\u001bfo\u001d`oJjkN6"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 6
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 7
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ざとぅぼこ〺:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "L1hLclNjiN`n@em\u001b7>Kak\u001c09H6m\u001e6mLj"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_93
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .registers 4

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    const/16 p2, 0x781

    if-eq p1, p2, :cond_8

    goto :goto_2e

    :cond_8
    array-length p1, p3

    const/high16 p2, -0x10000

    if-lez p1, :cond_24

    const/4 p1, 0x0

    aget p1, p3, p1

    if-nez p1, :cond_24

    :try_start_12
    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ざとぅぼこ〺:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->けときぜと(Ljava/lang/String;)V
    :try_end_1f
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_1f} :catch_20

    goto :goto_2e

    :catch_20
    const p1, 0x7f110108

    goto :goto_27

    :cond_24
    const p1, 0x7f110236

    :goto_27
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->おかぷせ〱(Ljava/lang/String;I)V

    :goto_2e
    return-void
.end method

.method public onResume()V
    .registers 4

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    .line 1
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v1, "L1hLclNjiN`n@em\u001b7>Kak\u001c09H6m\u001e6mLj"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    .line 2
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/high16 v1, -0x10000

    const-string v2, "M0f\u0019djL6<KgmLaiJ1;KknKd:Ia9@cf\u0019kk\u0019bk\u001b4>OdjK6<Jg;\u001a0k@ckMalLblAkg\u001a"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v0, :cond_2f

    .line 3
    sget-object v0, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 4
    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v0, v2, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->びぐびあび(Ljava/lang/String;I)V

    return-void

    :cond_2f
    :try_start_2f
    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ぷぞてのほき()V
    :try_end_32
    .catch Ljava/lang/Exception; {:try_start_2f .. :try_end_32} :catch_33

    goto :goto_3a

    .line 5
    :catch_33
    sget-object v0, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 6
    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v0, v2, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->びぐびあび(Ljava/lang/String;I)V

    :goto_3a
    return-void
.end method

.method public final おかぷせ〱(Ljava/lang/String;I)V
    .registers 4

    .line 1
    sget-object v0, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 2
    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->びぐびあび(Ljava/lang/String;I)V

    return-void
.end method

.method public final けときぜと(Ljava/lang/String;)V
    .registers 9

    const-string v0, "\u00190l\u001cjnOd;JcmMdiKdiO`;Ljk@j;KjmA4"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ぉ〲なぱぽた:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v3, 0x7f110052

    invoke-virtual {p0, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ぶでにく〼〳:Ljava/io/File;

    new-instance v1, Ljava/io/File;

    invoke-virtual {p0, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    const-string v3, "H`jL1:\u00197n\u001d69J3k\u001bjhIjhHghM`;\u001a1j@a"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->〻ぞまぎな〻:Ljava/io/File;

    const-string v0, "\u001d7jN6;\u0019elM6m\u00190mNa=I`l\u00196<\u001da<\u001b09\u001ck:JjoH6n\u001cc:HemN1:\u0019g9Jcn\u001c1l\u001c`=K`>M`n\u001dd=\u001e4oL7;JboLff\u00193l\u001ekkLbn\u001c7=K`="

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_6e

    const/4 v1, 0x1

    goto :goto_6f

    :cond_6e
    const/4 v1, 0x0

    :goto_6f
    iput-boolean v1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ぇ〳〲〺すっ:Z

    const-string v1, "\u001d7jN6;\u0019elM6m\u00190mNa=I`l\u00196<\u001da<\u001b09\u001ckfL1h\u001abj\u001cb>J3;\u001b0>HffN`o\u001c1=Kj9\u001b4k@kfIk>M1:\u001denJgmAbfO6nId>M09MdhN6j"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    if-eqz v4, :cond_83

    const/4 v4, 0x1

    goto :goto_84

    :cond_83
    const/4 v4, 0x0

    :goto_84
    iput-boolean v4, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->びえぁぜい:Z

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x17

    if-lt v5, v6, :cond_9f

    iget-boolean v5, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ぇ〳〲〺すっ:Z

    if-nez v5, :cond_92

    if-eqz v4, :cond_9f

    :cond_92
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/String;

    aput-object v1, p1, v3

    aput-object v0, p1, v2

    const/16 v0, 0x781

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    return-void

    :cond_9f
    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ぶでにく〼〳:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_c0

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ぶでにく〼〳:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-eqz v0, :cond_b0

    goto :goto_c0

    :cond_b0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "@jnNgn\u001d4>\u001b7=\u0019c=Ak<J1l\u001ek<I`mLejI4gK3oOeoLk9Hk=\u001a69Lc<\u001e6:\u001d3jH0i\u001a3>\u001c"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c0
    :goto_c0
    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->〻ぞまぎな〻:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    move-result v0

    if-eqz v0, :cond_df

    new-instance v0, Ljava/io/FileWriter;

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->〻ぞまぎな〻:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V

    new-instance v1, Ljava/io/BufferedWriter;

    invoke-direct {v1, v0}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {v1, p1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/BufferedWriter;->close()V

    return-void

    :cond_df
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "\u001ebgO3i\u001a`;\u001bko\u001aj9Nd;Oao\u001a6h\u001b6kN3>Kk;IejN0nOjlN0=I4lO7j\u001abh\u001c3;\u001e4h\u001cf;\u0019"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ぷぞてのほき()V
    .registers 8

    const-string v0, "\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u001ddiO3:\u00193g\u001c3mNfiL69KkmIco\u0019c9\u001cg>I0"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1
    sget-object v2, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v3, "H`oLkn\u001d6mH3<\u0019k>\u001agnIkiLcgJ`>O6;I6"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    .line 2
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/は〲ぱなで;->くし〴〺ぅ(Landroid/content/Context;Ljava/lang/String;)Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    move-result-object v2

    iput-object v2, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->は〲ぱなで:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    invoke-static {}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->づざかべべ()Z

    move-result v2

    if-eqz v2, :cond_36

    .line 3
    sget-object v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/は〲ぱなで;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    .line 4
    iput-object v2, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->は〲ぱなで:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    :cond_36
    iget-object v2, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->は〲ぱなで:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {v2, p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ(Landroid/content/Context;)I

    move-result v2

    const v3, 0x7f1101fa

    if-eq v2, v3, :cond_4d

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ざとぅぼこ〺:Landroid/widget/EditText;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setText(I)V

    invoke-virtual {p0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ぉざぅち〻:Ljava/lang/String;

    goto :goto_bd

    :cond_4d
    iget-object v2, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ざとぅぼこ〺:Landroid/widget/EditText;

    const-string v3, "Ok<A0;H7iO0=@g=I7iLc=@6gL`i\u001eg;I`;I0>@0o\u001cd9Kci\u0019gg\u001bj>Njn\u001ca9OjgMe9L"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->は〲ぱなで:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    iget-object v2, v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->えがぐせほち:[Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    iget-object v5, v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ;->〺つふすそ:Ljava/lang/String;

    const-string v6, "HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb"

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_92

    .line 5
    :try_start_75
    sget-object v5, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 6
    invoke-interface {v5, v1, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    aget-object v5, v5, v3

    .line 7
    sget-object v6, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 8
    invoke-interface {v6, v1, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iput-object v5, v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ;->〺つふすそ:Ljava/lang/String;

    iput-object v0, v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/lang/String;
    :try_end_92
    .catch Ljava/lang/Exception; {:try_start_75 .. :try_end_92} :catch_92

    .line 9
    :catch_92
    :cond_92
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 10
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->は〲ぱなで:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    .line 11
    sget-object v2, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    .line 12
    invoke-virtual {v1, v2, v3}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object v1

    const-string v2, "L1hLclNjiN`n@em\u001b7>Kak\u001c09H6m\u001e6mLj"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->は〲ぱなで:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/GeneratedConfig;->ざとぅぼこ〺:Landroid/widget/EditText;

    .line 13
    new-instance v2, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/げつ〴ぬぐ;

    invoke-direct {v2, p0, v0, v1}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/〳ぜぞぜべっ/げつ〴ぬぐ;-><init>(Lteam/dev/epro/apkcustom/activities/GeneratedConfig;Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/づざかべべ;Landroid/widget/EditText;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    :goto_bd
    return-void
.end method
