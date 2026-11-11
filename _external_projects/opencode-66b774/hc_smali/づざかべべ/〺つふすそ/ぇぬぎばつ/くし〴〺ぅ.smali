.class public Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;
.super Landroid/content/ContextWrapper;
.source ""


# instance fields
.field public 〺つふすそ:Landroid/content/res/Resources$Theme;

.field public くし〴〺ぅ:Landroid/view/LayoutInflater;

.field public げつ〴ぬぐ:I

.field public づざかべべ:Landroid/content/res/Resources;

.field public びぐびあび:Landroid/content/res/Configuration;


# direct methods
.method public constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .registers 3

    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    iput p2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->げつ〴ぬぐ:I

    return-void
.end method


# virtual methods
.method public attachBaseContext(Landroid/content/Context;)V
    .registers 2

    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public getAssets()Landroid/content/res/AssetManager;
    .registers 2

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    return-object v0
.end method

.method public getResources()Landroid/content/res/Resources;
    .registers 5

    .line 1
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->づざかべべ:Landroid/content/res/Resources;

    if-nez v0, :cond_3f

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->びぐびあび:Landroid/content/res/Configuration;

    if-nez v0, :cond_d

    invoke-super {p0}, Landroid/content/ContextWrapper;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    goto :goto_1b

    :cond_d
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x11

    if-lt v1, v2, :cond_1e

    invoke-virtual {p0, v0}, Landroid/content/ContextWrapper;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    :goto_1b
    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->づざかべべ:Landroid/content/res/Resources;

    goto :goto_3f

    :cond_1e
    invoke-super {p0}, Landroid/content/ContextWrapper;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    new-instance v1, Landroid/content/res/Configuration;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->びぐびあび:Landroid/content/res/Configuration;

    invoke-virtual {v1, v2}, Landroid/content/res/Configuration;->updateFrom(Landroid/content/res/Configuration;)I

    new-instance v2, Landroid/content/res/Resources;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-direct {v2, v3, v0, v1}, Landroid/content/res/Resources;-><init>(Landroid/content/res/AssetManager;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V

    iput-object v2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->づざかべべ:Landroid/content/res/Resources;

    :cond_3f
    :goto_3f
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->づざかべべ:Landroid/content/res/Resources;

    return-object v0
.end method

.method public getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    .registers 3

    const-string v0, "layout_inflater"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1d

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->くし〴〺ぅ:Landroid/view/LayoutInflater;

    if-nez p1, :cond_1a

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->くし〴〺ぅ:Landroid/view/LayoutInflater;

    :cond_1a
    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->くし〴〺ぅ:Landroid/view/LayoutInflater;

    return-object p1

    :cond_1d
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getTheme()Landroid/content/res/Resources$Theme;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->〺つふすそ:Landroid/content/res/Resources$Theme;

    if-eqz v0, :cond_5

    return-object v0

    :cond_5
    iget v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->げつ〴ぬぐ:I

    if-nez v0, :cond_d

    sget v0, Lづざかべべ/〺つふすそ/ぺぁあねじ;->Theme_AppCompat_Light:I

    iput v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->げつ〴ぬぐ:I

    :cond_d
    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->〺つふすそ()V

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->〺つふすそ:Landroid/content/res/Resources$Theme;

    return-object v0
.end method

.method public setTheme(I)V
    .registers 3

    iget v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->げつ〴ぬぐ:I

    if-eq v0, p1, :cond_9

    iput p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->げつ〴ぬぐ:I

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->〺つふすそ()V

    :cond_9
    return-void
.end method

.method public final 〺つふすそ()V
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->〺つふすそ:Landroid/content/res/Resources$Theme;

    const/4 v1, 0x1

    if-nez v0, :cond_7

    const/4 v0, 0x1

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    if-eqz v0, :cond_23

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->〺つふすそ:Landroid/content/res/Resources$Theme;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    if-eqz v0, :cond_23

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->〺つふすそ:Landroid/content/res/Resources$Theme;

    invoke-virtual {v2, v0}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    :cond_23
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->〺つふすそ:Landroid/content/res/Resources$Theme;

    iget v2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->げつ〴ぬぐ:I

    .line 1
    invoke-virtual {v0, v2, v1}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    return-void
.end method

.method public げつ〴ぬぐ(Landroid/content/res/Configuration;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->づざかべべ:Landroid/content/res/Resources;

    if-nez v0, :cond_18

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->びぐびあび:Landroid/content/res/Configuration;

    if-nez v0, :cond_10

    new-instance v0, Landroid/content/res/Configuration;

    invoke-direct {v0, p1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/くし〴〺ぅ;->びぐびあび:Landroid/content/res/Configuration;

    return-void

    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Override configuration has already been set"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_18
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "getResources() or getAssets() has already been called"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
