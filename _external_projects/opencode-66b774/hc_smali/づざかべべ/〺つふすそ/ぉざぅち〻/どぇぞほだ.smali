.class public Lづざかべべ/〺つふすそ/ぉざぅち〻/どぇぞほだ;
.super Landroid/content/ContextWrapper;
.source ""


# static fields
.field public static final 〺つふすそ:Ljava/lang/Object;

.field public static くし〴〺ぅ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/ref/WeakReference<",
            "L\u3065\u3056\u304b\u3079\u3079/\u303a\u3064\u3075\u3059\u305d/\u3049\u3056\u3045\u3061\u303b/\u3069\u3047\u305e\u307b\u3060;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field public final げつ〴ぬぐ:Landroid/content/res/Resources;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/どぇぞほだ;->〺つふすそ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    sget v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〺でおいここ;->げつ〴ぬぐ:I

    new-instance v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/じぜこほぱ;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/じぜこほぱ;-><init>(Landroid/content/Context;Landroid/content/res/Resources;)V

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/どぇぞほだ;->げつ〴ぬぐ:Landroid/content/res/Resources;

    return-void
.end method

.method public static げつ〴ぬぐ(Landroid/content/Context;)Landroid/content/Context;
    .registers 5

    .line 1
    instance-of v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/どぇぞほだ;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1b

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    instance-of v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/じぜこほぱ;

    if-nez v0, :cond_1b

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    if-lt v0, v3, :cond_1a

    sget v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/〺でおいここ;->げつ〴ぬぐ:I

    goto :goto_1b

    :cond_1a
    const/4 v1, 0x1

    :cond_1b
    :goto_1b
    if-eqz v1, :cond_87

    .line 2
    sget-object v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/どぇぞほだ;->〺つふすそ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_20
    sget-object v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/どぇぞほだ;->くし〴〺ぅ:Ljava/util/ArrayList;

    if-nez v1, :cond_2c

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sput-object v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/どぇぞほだ;->くし〴〺ぅ:Ljava/util/ArrayList;

    goto :goto_73

    :cond_2c
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v2

    :goto_31
    if-ltz v1, :cond_4b

    sget-object v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/どぇぞほだ;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/WeakReference;

    if-eqz v3, :cond_43

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_48

    :cond_43
    sget-object v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/どぇぞほだ;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_48
    add-int/lit8 v1, v1, -0x1

    goto :goto_31

    :cond_4b
    sget-object v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/どぇぞほだ;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v2

    :goto_52
    if-ltz v1, :cond_73

    sget-object v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/どぇぞほだ;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_65

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lづざかべべ/〺つふすそ/ぉざぅち〻/どぇぞほだ;

    goto :goto_66

    :cond_65
    const/4 v2, 0x0

    :goto_66
    if-eqz v2, :cond_70

    invoke-virtual {v2}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v3

    if-ne v3, p0, :cond_70

    monitor-exit v0

    return-object v2

    :cond_70
    add-int/lit8 v1, v1, -0x1

    goto :goto_52

    :cond_73
    :goto_73
    new-instance v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/どぇぞほだ;

    invoke-direct {v1, p0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/どぇぞほだ;-><init>(Landroid/content/Context;)V

    sget-object p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/どぇぞほだ;->くし〴〺ぅ:Ljava/util/ArrayList;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-object v1

    :catchall_84
    move-exception p0

    monitor-exit v0
    :try_end_86
    .catchall {:try_start_20 .. :try_end_86} :catchall_84

    throw p0

    :cond_87
    return-object p0
.end method


# virtual methods
.method public getAssets()Landroid/content/res/AssetManager;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/どぇぞほだ;->げつ〴ぬぐ:Landroid/content/res/Resources;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    return-object v0
.end method

.method public getResources()Landroid/content/res/Resources;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/どぇぞほだ;->げつ〴ぬぐ:Landroid/content/res/Resources;

    return-object v0
.end method

.method public getTheme()Landroid/content/res/Resources$Theme;
    .registers 2

    invoke-super {p0}, Landroid/content/ContextWrapper;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    return-object v0
.end method

.method public setTheme(I)V
    .registers 2

    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->setTheme(I)V

    return-void
.end method
