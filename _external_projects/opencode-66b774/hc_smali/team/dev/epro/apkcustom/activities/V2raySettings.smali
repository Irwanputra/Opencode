.class public Lteam/dev/epro/apkcustom/activities/V2raySettings;
.super Landroidx/appcompat/app/AppCompatActivity;
.source ""


# instance fields
.field public ぉざぅち〻:Ljava/lang/String;

.field public ごづごきえ:Lcom/github/clans/fab/FloatingActionButton;

.field public ざっざへづ:Lcom/github/clans/fab/FloatingActionButton;

.field public ざとぅぼこ〺:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

.field public でどあくず:Landroid/view/View$OnClickListener;

.field public は〲ぱなで:Lcom/github/clans/fab/FloatingActionMenu;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const-string v0, "\u001ed<\u00197gI4kMkmA4lA`<\u001aao\u001de>Od;\u001e3i\u001aa"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    new-instance v0, Lteam/dev/epro/apkcustom/activities/V2raySettings$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lteam/dev/epro/apkcustom/activities/V2raySettings$げつ〴ぬぐ;-><init>(Lteam/dev/epro/apkcustom/activities/V2raySettings;)V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings;->でどあくず:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public static ぷぞてのほき(Lteam/dev/epro/apkcustom/activities/V2raySettings;Ljava/lang/String;I)V
    .registers 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    sget-object p0, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 3
    check-cast p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p0, p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->びぐびあび(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .registers 5

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings;->ざとぅぼこ〺:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    invoke-virtual {v0}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_16

    .line 1
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->なぎぱいぢぎ:Landroidx/activity/OnBackPressedDispatcher;

    invoke-virtual {v0}, Landroidx/activity/OnBackPressedDispatcher;->げつ〴ぬぐ()V

    goto :goto_68

    .line 2
    :cond_16
    :try_start_16
    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings;->ざとぅぼこ〺:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    invoke-virtual {v0}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Llibv2ray/Libv2ray;->testConfig(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->なぎぱいぢぎ:Landroidx/activity/OnBackPressedDispatcher;

    invoke-virtual {v0}, Landroidx/activity/OnBackPressedDispatcher;->げつ〴ぬぐ()V
    :try_end_28
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_28} :catch_29

    goto :goto_68

    :catch_29
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\u0019k;\u0019al\u001e7;\u001a1h\u001a3kMcfK7m\u001aj;\u0019bnI`=\u001ak"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_68

    const/high16 v1, -0x10000

    :try_start_40
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aget-object v2, v2, v3

    .line 5
    sget-object v3, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 6
    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v3, v2, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->びぐびあび(Ljava/lang/String;I)V
    :try_end_5c
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_40 .. :try_end_5c} :catch_5d

    goto :goto_68

    .line 7
    :catch_5d
    sget-object v2, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 8
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v2, v0, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->びぐびあび(Ljava/lang/String;I)V

    :cond_68
    :goto_68
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .registers 4

    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0028

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    const p1, 0x7f0900bc

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings;->ざとぅぼこ〺:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    const p1, 0x7f090116

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/github/clans/fab/FloatingActionMenu;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings;->は〲ぱなで:Lcom/github/clans/fab/FloatingActionMenu;

    const p1, 0x7f090119

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/github/clans/fab/FloatingActionButton;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings;->ごづごきえ:Lcom/github/clans/fab/FloatingActionButton;

    const p1, 0x7f090115

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/github/clans/fab/FloatingActionButton;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings;->ざっざへづ:Lcom/github/clans/fab/FloatingActionButton;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings;->は〲ぱなで:Lcom/github/clans/fab/FloatingActionMenu;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/github/clans/fab/FloatingActionMenu;->setClosedOnTouchOutside(Z)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings;->ごづごきえ:Lcom/github/clans/fab/FloatingActionButton;

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings;->でどあくず:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v1}, Lcom/github/clans/fab/FloatingActionButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings;->ざっざへづ:Lcom/github/clans/fab/FloatingActionButton;

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings;->でどあくず:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v1}, Lcom/github/clans/fab/FloatingActionButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings;->ざとぅぼこ〺:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    invoke-virtual {p1, v0}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->setLineNumberVisible(Z)V

    .line 1
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v0, "NgiJk;N7nJ1;Ldm\u001d4=\u001bjg\u001d7>\u001a0;\u001ccf\u001d6oLbg\u001afgO1;\u001e4j\u001a4jO`:@e=\u001e7;MdmMelI"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    .line 2
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings;->ぉざぅち〻:Ljava/lang/String;

    .line 3
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 4
    move-object v0, p1

    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v0

    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    aget-object p1, p1, v0

    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_99

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings;->ぉざぅち〻:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_99

    .line 5
    :try_start_82
    sget-object p1, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 6
    move-object v0, p1

    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v0

    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {p1, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x1a

    aget-object p1, p1, v0

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings;->ぉざぅち〻:Ljava/lang/String;
    :try_end_97
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_82 .. :try_end_97} :catch_98

    goto :goto_99

    :catch_98
    nop

    :cond_99
    :goto_99
    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings;->ぉざぅち〻:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_b3

    .line 7
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v0, "Oj=Okk\u001c0g\u001eg9\u001bjfN7>\u001bdj@e;Acf\u001dj>J7"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings;->ぉざぅち〻:Ljava/lang/String;

    :cond_b3
    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings;->ざとぅぼこ〺:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings;->ぉざぅち〻:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/MultiAutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings;->ざとぅぼこ〺:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    invoke-static {p0, p1}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/JsonSyntaxManager;->applyTheme(Landroid/content/Context;Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;)V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .registers 4

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-eq v0, v1, :cond_e

    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_e
    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/activities/V2raySettings;->onBackPressed()V

    const/4 p1, 0x1

    return p1
.end method

.method public onPause()V
    .registers 5

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    .line 1
    sget-object v0, Lteam/dev/epro/apkcustom/App;->づざかべべ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/いいにぽつ;

    .line 2
    move-object v1, v0

    check-cast v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->かちして〹づ()Ljava/lang/String;

    move-result-object v1

    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;

    invoke-virtual {v0, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/おかぷせ〱;->く〱なおぎ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5e

    iget-object v0, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings;->ざとぅぼこ〺:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    invoke-virtual {v0}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 3
    sget-object v1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v2, "Oj=Okk\u001c0g\u001eg9\u001bjfN7>\u001bdj@e;Acf\u001dj>J7"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    .line 4
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5e

    .line 5
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 6
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lteam/dev/epro/apkcustom/activities/V2raySettings;->ざとぅぼこ〺:Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;

    invoke-virtual {v1}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "NgiJk;N7nJ1;Ldm\u001d4=\u001bjg\u001d7>\u001a0;\u001ccf\u001d6oLbg\u001afgO1;\u001e4j\u001a4jO`:@e=\u001e7;MdmMelI"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_5e
    return-void
.end method
